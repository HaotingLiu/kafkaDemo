package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by hliu on 5/24/2016.
 */
public class directAccess {
    public void getUrl(String url) throws IOException {
        URL oracle = new URL("http://www.amadeus.com/");
        URLConnection yc = oracle.openConnection();
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(
                    yc.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.print("abort for Exception for reader");
        }
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}
