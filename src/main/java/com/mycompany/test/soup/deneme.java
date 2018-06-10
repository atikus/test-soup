/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test.soup;


import WebCrawler.HepsiBurada;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author atillakoc
 */
public class deneme {

    /**
     *
     * @param args
     */
    public static void main(String[] args) throws IOException{
        System.out.println("start crawling...");
        
        HepsiBurada h = new HepsiBurada();
        String price = h.GetPrice("https://www.hepsiburada.com/tefal-hard-titanium-ikili-tava-set-21-cm-28-cm-p-MT2100090477");
        
        System.out.println("Price : <" + price + ">");
        
//        Document doc = Jsoup.connect("https://www.hepsiburada.com/tefal-hard-titanium-ikili-tava-set-21-cm-28-cm-p-MT2100090477").get();
//        System.out.println(doc.title());
//        Elements newsHeadlines = doc.select("#offering-price");
//        
//        System.out.format("%d adet element bulundu\n\n", newsHeadlines.size());
//        
//        
//        for (Element elem : newsHeadlines) {
//            System.out.println(elem.toString() + "\n");
//            System.out.println(elem.attr("content"));
//            System.out.println("====================");
//        }
        
    }
}