package com.shirts.io.Util;

import com.shirts.io.Quote.Garment;
import com.shirts.io.Quote.Print;
import com.shirts.io.Quote.Size;
import java.util.HashMap;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class PostParams
{
    public PostParams()
    {
        super();
    }

    public BasicNameValuePair garmentSizes(int garmentNumber, String size,int numberToSend)
    {
        BasicNameValuePair garmentSizes = new BasicNameValuePair("garment["+garmentNumber+"][sizes]["+size+"]",
                                                                 String.valueOf(numberToSend));
        return garmentSizes;
    }

    public BasicNameValuePair garmentColor(int garmentNumber, String colorToSend)
    {
        BasicNameValuePair garmentColor = new BasicNameValuePair("garment["+garmentNumber+"][color]",colorToSend);
        return garmentColor;
    }

    public BasicNameValuePair garmentProductId(int garmentNumber, int productId)
    {
        BasicNameValuePair garmentProductId = new BasicNameValuePair("garment["+garmentNumber+"][product_id]",
                                                                      String.valueOf(productId));
        return garmentProductId;
    }

    public List<NameValuePair> buildGarmentsNVP(List<Garment> garments,List<NameValuePair> nameValuePairs)
    {
        Size bySize;

        //you cannot send in a request for more than 4 garments;
        if(garments.size() > 4)
        {
            return null;
        }

        for(int i=0;i<garments.size();i++)
        {
            nameValuePairs.add(this.garmentProductId(i, garments.get(i).getProductId()));
            nameValuePairs.add(this.garmentColor(i, garments.get(i).getColor()));
            for(int j=0;j<garments.get(i).getSizes().size();j++)
            {
                bySize = garments.get(i).getSizes().get(j);
                for(String s :Size.sizes)
                {
                    if(bySize.getSize(s) > 0)
                    {
                        nameValuePairs.add(garmentSizes(i, s, bySize.getSize(s)));
                    }
                }

            }
        }

        return nameValuePairs;
    }

    public List<NameValuePair> buildAddressesNVP()
    {

    }

    public List<NameValuePair> buildPrintNVP(HashMap<String,Print> prints, List<NameValuePair> nameValuePairs)
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
                nameValuePairs.add(printColorCount(p, prints.get(p).getColor_count()));
                List<String> colors = prints.get(p).getColors();
                if(colors == null || colors.size() == 0)
                {
                    return  nameValuePairs;
                }

                for(int j=0;j<colors.size();j++)
                {
                    nameValuePairs.add(printColors(p, j, colors.get(j)));
                }
            }
        }
        return nameValuePairs;
    }

    public BasicNameValuePair printColorCount(String side, int colorCount)
    {
        BasicNameValuePair printFront = new BasicNameValuePair("print["+side+"][color_count]",
                                                                String.valueOf(colorCount));
        return printFront;
    }

    public BasicNameValuePair printColors(String side,int number, String hexValue)
    {
        BasicNameValuePair color = new BasicNameValuePair("print["+side+"][colors]["+number+"]",hexValue);
        return color;
    }

    public BasicNameValuePair printArtwork(String side, String file)
    {
        BasicNameValuePair artwork = new BasicNameValuePair("print["+side+"][artwork]",file);
        return artwork;
    }

    public BasicNameValuePair printProof(String side, String proofFile)
    {
        BasicNameValuePair proof = new BasicNameValuePair("print["+side+"][proof]",proofFile);
        return proof;
    }

    public BasicNameValuePair printType(String printType)
    {
        BasicNameValuePair type = new BasicNameValuePair("print_type",printType);
        return type;
    }

    public BasicNameValuePair personalizations(String personalization)
    {
        BasicNameValuePair prsnls = new BasicNameValuePair("personalization",personalization);
        return prsnls;
    }

    public BasicNameValuePair addressCount(int addressCount)
    {
        BasicNameValuePair count = new BasicNameValuePair("address_count",String.valueOf(addressCount));
        return count;
    }

    public BasicNameValuePair internationalGarments(String location, int count)
    {
        BasicNameValuePair international = new BasicNameValuePair("international_garments["+location+"]",
                                                                   String.valueOf(count));
        return international;
    }

    public BasicNameValuePair addressesName(int number,String name)
    {
        BasicNameValuePair address = new BasicNameValuePair("addresses["+number+"][name]",name);
        return address;
    }

    public BasicNameValuePair addressesAddress(int number, String address)
    {
        BasicNameValuePair addresses = new BasicNameValuePair("addresses["+number+"][address]",address);
        return addresses;
    }

    public BasicNameValuePair addressesCity(int number, String city)
    {
        BasicNameValuePair addresses = new BasicNameValuePair("addresses["+number+"][city]",city);
        return addresses;
    }

    public BasicNameValuePair addressesState(int number, String state)
    {
        BasicNameValuePair address = new BasicNameValuePair("addresses["+number+"][state]",state);
        return address;
    }

    public BasicNameValuePair addressesZipCode(int number, String zipCode)
    {
        BasicNameValuePair address = new BasicNameValuePair("addresses["+number+"][zipcode]",zipCode);
        return address;
    }
}
