package com.shirts.io.Util;

import com.shirts.io.Quote.Garment;
import com.shirts.io.Quote.Print;
import com.shirts.io.Quote.Size;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class GetParams
{

    public GetParams()
    {
        super();
    }

    public String garmentSizes(int garmentNumber, String size,int numberToSend)
    {
        String garmentSizes = "&garment["+garmentNumber+"][sizes]["+size+"]="+numberToSend;
        return garmentSizes;
    }

    public String garmentColor(int garmentNumber, String colorToSend)
    {
        String garmentColor = "&garment["+garmentNumber+"][color]="+colorToSend;
        return garmentColor;
    }

    public String garmentProductId(int garmentNumber, int productId)
    {
        String garmentProductId = "&garment["+garmentNumber+"][product_id]="+productId;
        return garmentProductId;
    }

    public String buildGarmentsString(List<Garment> garments)
    {
        Size bySize;
        StringBuilder garmentString = new StringBuilder(10000);

        //you cannot send in a request for more than 4 garments;
        if(garments.size() > 4)
        {
            return null;
        }

        for(int i=0;i<garments.size();i++)
        {
            garmentString.append(this.garmentProductId(i,garments.get(i).getProductId()));
            garmentString.append(this.garmentColor(i,garments.get(i).getColor()));
            for(int j=0;j<garments.get(i).getSizes().size();j++)
            {
                bySize = garments.get(i).getSizes().get(j);
                for(String s :Size.sizes)
                {
                    if(bySize.getSize(s) > 0)
                    {
                        garmentString.append(garmentSizes(i,s,bySize.getSize(s)));
                    }
                }

            }
        }

        return garmentString.toString();
    }

    public String buildPrintString(HashMap<String,Print> prints)
    {
        Garment bySide;
        StringBuilder printString = new StringBuilder(10000);

        //you cannot specify more than 4 prints.
        if(prints.size() > 4)
        {
            return null;
        }
        for(int i=0;i<prints.size();i++)
        {
            for(String p:prints.keySet())
            {
                printString.append(printColorCount(p,prints.get(p).getColor_count()));
                List<String> colors = prints.get(p).getColors();
                if(colors == null || colors.size() == 0)
                {
                    return  printString.toString();
                }

                for(int j=0;j<colors.size();j++)
                {
                    printString.append(printColors(p,j,colors.get(j)));
                }
            }
        }
        return printString.toString();
    }

    public String printColorCount(String side, int colorCount)
    {
        String printFront = "&print["+side+"][color_count]="+colorCount;
        return printFront;
    }

    public String printColors(String side,int number, String hexValue)
    {
        String color = "&print["+side+"][colors]["+number+"]="+hexValue;
        return color;
    }

    public String printType(String printType)
    {
        String type = "&print_type="+printType;
        return type;
    }

    public String personalizations(String personalization)
    {
        String prsnls = "&personalization="+personalization;
        return prsnls;
    }

    public String addressCount(int addressCount)
    {
        String count = "&address_count="+addressCount;
        return count;
    }

    public String internationalGarments(String location, int count)
    {
        String international = "&international_garments["+location+"]="+count;
        return international;
    }

    public String addressesName(int number,String name)
    {
        String address = "addresses["+number+"][name]="+name;
        return address;
    }

    public String addressesAddress(int number, String address)
    {
        String addresses = "addresses["+number+"][address]="+address;
        return addresses;
    }

    public String addressesCity(int number, String city)
    {
        String addresses = "addresses["+number+"][city]="+city;
        return addresses;
    }

    public String addressesState(int number, String state)
    {
        String address = "addresses["+number+"][state]="+state;
        return address;
    }

    public String addressesZipCode(int number, String zipCode)
    {
        String address = "addresses["+number+"][zipcode]="+zipCode;
        return address;
    }

}
