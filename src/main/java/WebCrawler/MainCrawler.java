/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebCrawler;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 *
 * @author atillakoc
 */
public class MainCrawler {
    protected Document GetHtml(String Url) throws IOException {
        Document doc = Jsoup.connect(Url).get();
        
        return doc;
    }
    
    public String GetPrice(String Url) throws IOException{
        return "0";
    }
}
