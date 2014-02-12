package com.shirts.io.Quote;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Size
{
    private int xxsml;
    private int xsml;
    private int sml;
    private int med;
    private int lrg;
    private int xlg;
    private int xxl;
    private int xxxl;
    private int xxxxl;
    private int xxxxxl;
    private int xxxxxxl;
    public static List<String> sizes = Arrays.asList("xxsml","xsml",
                                               "sml","med",
                                               "lrg","xlg",
                                               "xxl","xxxl",
                                               "xxxxl","xxxxxl","xxxxxxl");
    HashMap<String,Integer> actualSizes = new HashMap<String, Integer>();

    public Size()
    {
        super();
        actualSizes.put("xxsml",0);
        actualSizes.put("xsml",0);
        actualSizes.put("sml",0);
        actualSizes.put("med",0);
        actualSizes.put("lrg",0);
        actualSizes.put("xlg",0);
        actualSizes.put("xxl",0);
        actualSizes.put("xxxl",0);
        actualSizes.put("xxxxl",0);
        actualSizes.put("xxxxxl",0);
        actualSizes.put("xxxxxxl",0);
    }

    public int getSize(String size)
    {
        return actualSizes.get(size);
    }

    public int getXxsml() {
        return actualSizes.get("xxsml");
    }

    public void setXxsml(int xxsml) {
        this.xxsml = xxsml;
        actualSizes.put("xxsml",xxsml);
    }

    public int getXsml() {
        return actualSizes.get("xsml");
    }

    public void setXsml(int xsml) {
        this.xsml = xsml;
        actualSizes.put("xsml",xsml);
    }

    public int getSml() {
        return actualSizes.get("sml");
    }

    public void setSml(int sml) {
        this.sml = sml;
        actualSizes.put("sml",sml);
    }

    public int getMed() {
        return actualSizes.get("med");
    }

    public void setMed(int med) {
        this.med = med;
        actualSizes.put("med",med);
    }

    public int getLrg() {
        return actualSizes.get("lrg");
    }

    public void setLrg(int lrg) {
        this.lrg = lrg;
        actualSizes.put("lrg",lrg);
    }

    public int getXlg() {
        return actualSizes.get("xlg");
    }

    public void setXlg(int xlg) {
        this.xlg = xlg;
        actualSizes.put("xlg",xlg);
    }

    public int getXxl() {
        return actualSizes.get("xxl");
    }

    public void setXxl(int xxl) {
        this.xxl = xxl;
        actualSizes.put("xxl",xxl);
    }

    public int getXxxl() {
        return actualSizes.get("xxxl");
    }

    public void setXxxl(int xxxl) {
        this.xxxl = xxxl;
        actualSizes.put("xxxl",xxxl);
    }

    public int getXxxxl() {
        return actualSizes.get("xxxxl");
    }

    public void setXxxxl(int xxxxl) {
        this.xxxxl = xxxxl;
        actualSizes.put("xxxxl",xxxxl);
    }

    public int getXxxxxl() {
        return actualSizes.get("xxxxxl");
    }

    public void setXxxxxl(int xxxxxl) {
        this.xxxxxl = xxxxxl;
        actualSizes.put("xxxxxl",xxxxxl);
    }

    public int getXxxxxxl() {
        return actualSizes.get("xxxxxxl");
    }

    public void setXxxxxxl(int xxxxxxl) {
        this.xxxxxxl = xxxxxxl;
        actualSizes.put("xxxxxxl",xxxxxxl);
    }

    public static String xxsml()
    {
        return "xxsml";
    }

    public static String xsml()
    {
        return "xsml";
    }

    public static String sml()
    {
        return "sml";
    }

    public static String med()
    {
        return "med";
    }

    public static String lrg()
    {
        return "lrg";
    }

    public static String xlg()
    {
        return "xlg";
    }

    public static String xxlg()
    {
        return "xxlg";
    }

    public static String xxxlg()
    {
        return "xxxlg";
    }

    public static String xxxxlg()
    {
        return "xxxxlg";
    }

    public static String xxxxxlg()
    {
        return "xxxxxlg";
    }

    public static String xxxxxxlg()
    {
        return "xxxxxxlg";
    }
}
