package com.shirts.io.Products;

import com.google.gson.Gson;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.*;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

/**
 * HTTP Status Code Summary
 200 OK - Request successfully delivered.
 400 Bad Request - Parameters invalid.
 401 Unauthorized - API key was invalid or deactivated.
 402 Request Failed - Request failed on server end.
 */
public class ProductCalls
{
    private ObjectMapper mapper = new ObjectMapper();
    private Gson gson = new Gson();
    private HttpEntity entity;
    private String jsonResponse;
    private CloseableHttpResponse response;
    private CloseableHttpClient httpClient = HttpClients.createDefault();
    private String apiKey;

    public ProductCalls(String aipKey)
    {
        super();
        this.apiKey = aipKey;
    }


    /**
     * Get a list of all available product categories.
     * No arguments other than your API Key are needed for this request.
     * @return
     */
    public List<Category> getProductCategories()
    {
        List<Category> returnedCategories = null;
        HttpGet httpGet = new HttpGet("https://www.shirts.io/api/v1/products/category/?api_key="+this.apiKey);

        try
        {
            response = httpClient.execute(httpGet);
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

    /**
     * Specify a category ID to receive a list of products in that category.
     * @param CategoryId
     */
    public List<Product> getProductList(int CategoryId)
    {
        List<Product> returnedProducts = null;
        HttpGet httpGet = new HttpGet("https://www.shirts.io/api/v1/products/category/"+CategoryId+"/?api_key="+this.apiKey);
        try
        {
            response = httpClient.execute(httpGet);
            if(response.getStatusLine().getStatusCode() == 200)
            {
                entity = response.getEntity();
                jsonResponse = EntityUtils.toString(entity);

                Type listType = new TypeToken<List<Product>>(){}.getType();
                JsonNode root = mapper.readTree(jsonResponse);
                ArrayNode products = (ArrayNode) root.path("result");
                returnedProducts = (List<Product>) gson.fromJson(products.toString(), listType);
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return returnedProducts;
    }

    /**
     * Specify a product ID to receive the following information about the product.
     * @param productId
     * @return
     */
    public Product getProduct(int productId)
    {
        Product returnedProduct = null;
        HttpGet httpGet = new HttpGet("https://www.shirts.io/api/v1/products/"+productId+"/?api_key="+this.apiKey);

        try
        {
            response = httpClient.execute(httpGet);
            if(response.getStatusLine().getStatusCode() == 200)
            {
                entity = response.getEntity();
                jsonResponse = EntityUtils.toString(entity);
                JsonNode root = mapper.readTree(jsonResponse).get("result");
                returnedProduct = gson.fromJson(root.toString(),Product.class);

            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return returnedProduct;
    }
}
