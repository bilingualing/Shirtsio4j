package com.shirts.io.Quote;

import com.google.gson.Gson;
import com.shirts.io.Util.GetParams;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import java.io.IOException;
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
    private GetParams getParams;

    public QuoteCalls(String apiKey)
    {
        super();
        this.apiKey = apiKey;
    }

    public QuoteResponse getQuote(List<Garment> garments,HashMap<String,Print> prints)
    {
        getParams = new GetParams();
        String url = "https://www.shirts.io/api/v1/quote/?api_key="+this.apiKey;
        String garmentString = getParams.buildGarmentsString(garments);
        String printString = getParams.buildPrintString(prints);
        url = url + garmentString + printString;
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
