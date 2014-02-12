package com.shirts.io.Quote;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.shirts.io.Products.Category;
import com.shirts.io.Products.Product;
import com.shirts.io.Util.Params;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.HashMap;
import java.util.List;

public class QuoteCalls
{
    private ObjectMapper mapper = new ObjectMapper();
    private Gson gson = new Gson();
    private HttpEntity entity;
    private String jsonResponse;
    private CloseableHttpResponse response;
    private CloseableHttpClient httpClient = HttpClients.createDefault();
    private String apiKey;
    private Params params;

    public QuoteCalls(String apiKey)
    {
        super();
        this.apiKey = apiKey;
    }

    public QuoteResponse getQuote(List<Garment> garments,HashMap<String,Print> prints)
    {
        params = new Params();
        String url = "https://www.shirts.io/api/v1/quote/?api_key="+this.apiKey;
        String garmentString = params.buildGarmentsString(garments);
        String printString = params.buildPrintString(prints);
        url = url + garmentString + printString;
        char ch113 = url.charAt(131);
        QuoteResponse qResponse = null;
        HttpGet httpGet = new HttpGet(url);

        try
        {
            response = httpClient.execute(httpGet);
            if(response.getStatusLine().getStatusCode() == 200)
            {
                entity = response.getEntity();
                jsonResponse = EntityUtils.toString(entity);
                JsonNode root = mapper.readTree(jsonResponse).get("result");
                qResponse = gson.fromJson(root.toString(),QuoteResponse.class);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return qResponse;
    }
}
