package com.shirts.io.Order;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.shirts.io.Products.Category;
import com.shirts.io.Quote.Garment;
import com.shirts.io.Quote.Print;
import com.shirts.io.Util.PostParams;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderCalls
{
    private ObjectMapper mapper = new ObjectMapper();
    private Gson gson = new Gson();
    private HttpEntity entity;
    private String jsonResponse;
    private CloseableHttpResponse response;
    private CloseableHttpClient httpClient = HttpClients.createDefault();
    private String apiKey;

    public OrderCalls(String apiKey)
    {
        super();
        this.apiKey = apiKey;
    }

    public OrderResponse placeOrder(Boolean test, Double price, List<Garment> garments,
                                    HashMap<String,Print> prints, List<Address> addresses,HashMap<String,Object> options)
    {
        PostParams params = new PostParams();
        OrderResponse orderResponse = null;
        List<NameValuePair> parameters = new ArrayList<NameValuePair>();
        params.buildGarmentsNVP(garments,parameters);
        params.buildPrintNVP(prints,parameters);
        HttpPost httpPost = new HttpPost("https://www.shirts.io/api/v1/order/");

        try
        {
            response = httpClient.execute(httpPost);
            if(response.getStatusLine().getStatusCode() == 200)
            {
                entity = response.getEntity();
                jsonResponse = EntityUtils.toString(entity);
                Type listType = new TypeToken<List<Category>>(){}.getType();
                JsonNode root = mapper.readTree(jsonResponse);
                ArrayNode categories = (ArrayNode) root.path("result");
                returnedCategories = (List<Category>) gson.fromJson(categories.toString(), listType);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return returnedCategories;
    }
}
