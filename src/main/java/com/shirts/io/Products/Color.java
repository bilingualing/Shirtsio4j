package com.shirts.io.Products;


public class Color
{
    private String name;
    private String smallest;
    private String largest;
    private String hex;
    private String front_image;
    private String back_image;
    private String left_image;
    private String right_image;

    public Color()
    {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSmallest() {
        return smallest;
    }

    public void setSmallest(String smallest) {
        this.smallest = smallest;
    }

    public String getLargest() {
        return largest;
    }

    public void setLargest(String largest) {
        this.largest = largest;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    public String getFrontImage() {
        return front_image;
    }

    public void setFrontImage(String frontImage) {
        this.front_image = frontImage;
    }

    public String getBackImage() {
        return back_image;
    }

    public void setBackImage(String backImage) {
        this.back_image = backImage;
    }

    public String getLeftImage() {
        return left_image;
    }

    public void setLeftImage(String leftImage) {
        this.left_image = leftImage;
    }

    public String getRightImage() {
        return right_image;
    }

    public void setRightImage(String rightImage) {
        this.right_image = rightImage;
    }
}
