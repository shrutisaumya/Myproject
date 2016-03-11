/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypackage;

/**
 *
 * @author Shruti
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class json2 {
    private static final String filePath = "C:\\Users\\Ankit\\Desktop\\JSON\\file.txt";
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader(filePath);
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
            StringWriter out = new StringWriter();
            jsonObject.writeJSONString(out);
      
            String jsonText = out.toString();
            System.out.print(jsonText+ "\n");
            
            long val =  (long)jsonObject.get("c");
            System.out.println("The values is: " + val);
            
            } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
            ex.printStackTrace();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }

    }

}


