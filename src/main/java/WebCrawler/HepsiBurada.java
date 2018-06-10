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
public class HepsiBurada extends MainCrawler {
    
    @Override
    public String GetPrice(String Url) throws IOException{
        Document doc = GetHtml(Url);
        
        System.out.println(doc.title());
        Elements priceElem = doc.select("#offering-price");
        
        String p = priceElem.first().attr("content");
        
        return p;
        
    }
    
}
