package com.shirts.io.Products;

import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.*;
import org.apache.http.client.ResponseHandler;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.node.ArrayNode;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedList;

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
    private HttpEntity entity;
    private String jsonResponse;
    private CloseableHttpResponse response;
    private CloseableHttpClient httpClient = HttpClients.createDefault();

    /**
     * Get a list of all available product categories.
     * No arguments other than your API Key are needed for this request.
     * @param apiKey
     * @return
     */
    public LinkedList<Category> getProductCategories(String apiKey)
    {
        LinkedList<Category> returnedCategories = new LinkedList<Category>();
        HttpGet httpGet = new HttpGet("https://www.shirts.io/api/v1/products/category/?api_key="+apiKey);

        try
        {
            response = httpClient.execute(httpGet);
            if(response.getStatusLine().getStatusCode() == 200)
            {
                entity = response.getEntity();
                jsonResponse = EntityUtils.toString(entity);
                JsonNode root = mapper.readTree(jsonResponse);
                ArrayNode categories = (ArrayNode) root.path("result");
                Iterator<JsonNode> iterator = categories.getElements();
                while(iterator.hasNext())
                {
                    Category category = mapper.readValue(iterator.next(), Category.class);
                    returnedCategories.add(category);
                }
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
     * @param apiKey
     */
    public LinkedList<Product> getProductList(int CategoryId, String apiKey)

    {
        LinkedList<Product> returnedProducts = new LinkedList<Product>();
        HttpGet httpGet = new HttpGet("https://www.shirts.io/api/v1/products/category/"+CategoryId+"/?api_key="+apiKey);

        try
        {
            response = httpClient.execute(httpGet);
            if(response.getStatusLine().getStatusCode() == 200)
            {
                entity = response.getEntity();
                jsonResponse = EntityUtils.toString(entity);
                JsonNode root = mapper.readTree(jsonResponse);
                ArrayNode products = (ArrayNode) root.path("result");
                Iterator<JsonNode> iterator = products.getElements();
                while(iterator.hasNext())
                {
                    Product product = mapper.readValue(iterator.next(), Product.class);
                    returnedProducts.add(product);
                }
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
        HttpGet httpGet = new HttpGet("");
    }
}
