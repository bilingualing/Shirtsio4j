package com.shirts.io;

import com.github.restdriver.clientdriver.ClientDriverRule;
import com.shirts.io.Products.Category;
import com.shirts.io.Products.Product;
import com.shirts.io.Products.ProductCalls;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import java.util.LinkedList;
import java.util.List;
import org.apache.http.client.HttpClient;
import org.junit.runner.Result;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
/**
 * Unit test for simple App.
 */
public class ProductCallsTest
{
    ProductCalls productCalls = new ProductCalls("");

    @Rule
    public ClientDriverRule driver = new ClientDriverRule();

    @Test
    public void testGetProductCategories()
    {
        //the json for the response body
        String response = "[{\"name\":\"Short Sleeve Shirts\",\"category_id\":\"1\"}," +
                           "{\"name\":\"Long Sleeve Shirts\",\"category_id\":\"2\" +}," +
                           "{\"name\":\"Sweatshirts\",\"category_id\":\"3\"}]";

        List<Category> categories = null;
        categories = productCalls.getProductCategories();
        assertEquals(20,categories.size());
    }

    @Test
    public void testGetProductList()
    {
        List<Product> products = null;
        products = productCalls.getProductList(1);
        assertNotNull(products);
    }

    @Test
    public void testGetProduct()
    {
        Product product = null;
        product = productCalls.getProduct(2);
        assertNotNull(product);
    }

}
