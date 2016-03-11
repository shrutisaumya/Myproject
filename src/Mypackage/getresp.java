/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypackage;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.apache.http.impl.client.DefaultHttpClient;



/**
 *
 * @author Shruti
 */
public class getresp {
    
    public static void main(String[] args) {
        
    HttpClient client = new DefaultHttpClient();
    //HttpGet httpGet = new HttpGet("http://www.thomas-bayer.com/sqlrest/CUSTOMER/");
    //HttpResponse response = httpClient.execute(httpGet);
    try{
        HttpResponse response = client.execute(new HttpGet("http://www.thomas-bayer.com/sqlrest/CUSTOMER/"));
    
    int statusCode = response.getStatusLine().getStatusCode();
    System.out.println(statusCode);
    HttpEntity entity = response.getEntity();
    String responseBody = EntityUtils.toString(entity, "UTF-8");
    System.out.println(responseBody);
    }
    catch(Exception e)
        {
        System.out.println("Exception Error");  
        }
        
}
}
