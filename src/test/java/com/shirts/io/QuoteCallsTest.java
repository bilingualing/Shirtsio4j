package com.shirts.io;

import com.shirts.io.Quote.Garment;
import com.shirts.io.Quote.Print;
import com.shirts.io.Quote.QuoteCalls;
import com.shirts.io.Quote.Size;
import org.junit.Test;
import com.shirts.io.Products.Category;
import com.shirts.io.Products.Product;
import com.shirts.io.Products.ProductCalls;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.util.*;

import org.apache.http.client.HttpClient;
import org.junit.runner.Result;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class QuoteCallsTest
{
    private List<Garment> garments = new ArrayList<Garment>();
    private List<Size> sizes = new ArrayList<Size>();
    private HashMap<String,Print> prints = new HashMap<String, Print>();
    //private List<String> colors = Arrays.asList("White","Blue");



    @Before
    public void SetUp()
    {
        //create size list that will be used for the garment
        Size size1 = new Size();
        size1.setSml(2);
        size1.setXlg(3);
        sizes.add(size1);
        size1.setMed(2);
        size1.setLrg(2);

        //create the print objects that will be used
        Print print = new Print();
        print.setColor_count(2);
        //print.setColors(colors);
        prints.put("front",print);

        //create a garment
        Garment garment = new Garment();
        garment.setProductId(3);
        garment.setColor("White");
        garment.setSizes(sizes);
        garment.setPrints(prints);
        garments.add(garment);
    }

    @Test
    public void testGetQuote()
    {
        QuoteCalls quoteCalls = new QuoteCalls("");
        quoteCalls.getQuote(garments,prints);
        int i = 0;
    }
}
