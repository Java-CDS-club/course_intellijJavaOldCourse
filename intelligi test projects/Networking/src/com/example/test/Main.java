package com.example.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://api.flickr.com/services/feeds/photos_public.gne?tags=cats");
            HttpURLConnection Connection = (HttpURLConnection) url.openConnection();
            Connection.setRequestMethod("GET");
            Connection.setRequestProperty("User-Agent" ,"Chrome");
            Connection.setReadTimeout(30000);
            int responseCode = Connection.getResponseCode();
            System.out.println("Response Code : "+responseCode);
            if (responseCode != 200)
            {
                System.out.println("Error reading web page");
                System.out.println(Connection.getResponseMessage());
                return;
            }
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(Connection.getInputStream()));
            String line;
            while ((line= inputReader.readLine()) != null)
            {
                System.out.println(line);
            }
            inputReader.close();
            /*urlConnection.setDoOutput(true);
            urlConnection.connect();

            BufferedReader inputStream = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            Map<String , List<String>> headerFields = urlConnection.getHeaderFields();
            for (Map.Entry<String , List<String>> entry : headerFields.entrySet())
            {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                System.out.println("------key = "+key);
                for (String string: value)
                {
                    System.out.println("Value = "+ string);
                }
            }*/
            /*String line ="";
            while (line!= null)
            {
                line = inputStream.readLine();
                System.out.println(line);
            }
            inputStream.close();
*/
        }catch (MalformedURLException e)
        {
            System.out.println("Malformed Exception : "+e.getMessage());
        }
        catch (IOException e)
        {
            System.out.println("IOException : "+e.getMessage());
        }
    }
}
