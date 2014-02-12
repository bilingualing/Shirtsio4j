package com.shirts.io.Quote;


import com.shirts.io.Products.Color;

import java.util.Arrays;
import java.util.List;

public class Print
{
    private int color_count;
    private List<String> colors;
    private List<String> colorList = Arrays.asList("Athletic%20Gold", "Black","Blue",
                                                "Brown","Cardinal","Charity%20Pink",
                                                "Dark%20Gray", "Forest","Grey",
                                                "Hot%20Pink","Kelly%20Green","Lemon",
                                                "Light%20Blue","Light%20Grey","Light%20Purple",
                                                "Lime","Magenta","Maroon",
                                                "Navy","Old%20Gold","Olive",
                                                "Orange","Orange%20Red","Pink",
                                                "Purple","Red","Royal",
                                                "Tan","Turquoise","White",
                                                "Yellow");

    public int getColor_count() {
        return color_count;
    }

    public void setColor_count(int color_count) {
        this.color_count = color_count;
    }

    public List<String> getColors() {
        return colors;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }
}
