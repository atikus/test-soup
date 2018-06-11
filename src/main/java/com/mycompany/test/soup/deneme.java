/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.mycompany.test.soup;


import WebCrawler.HepsiBurada;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author atillakoc
 */
public class deneme {
    
    static private FileHandler fileTxt;
    static private SimpleFormatter formatterTxt;
    
    private static Logger log = null;
    
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) throws IOException, InterruptedException{
        
        yaz("start crawling...");
        
        HepsiBurada h = new HepsiBurada();
        
        List<String> links = new ArrayList<String>();
        links.add("https://www.hepsiburada.com/tefal-hard-titanium-ikili-tava-set-21-cm-28-cm-p-MT2100090477");
        links.add("https://www.hepsiburada.com/vestel-flora-inverter-18000-a-klima-p-HBV00000BFE5N");
        links.add("https://www.hepsiburada.com/hp-pavilion-gaming-15-cb001nt-intel-core-i7-7700hq-16gb-1tb-256gb-ssd-gtx1050-windows-10-home-15-6-fhd-tasinabilir-bilgisayar-2cr74ea-p-HBV000009OJ5R?magaza=Hepsiburada");
        links.add("https://www.hepsiburada.com/asus-dsl-ac51-ebeveyn-kontrol-destekli-dlna-vpn-adsl-vdsl-fiber-modem-router-p-HBV00000A0ZHM");
        
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < links.size(); i++) {
                yaz(links.get(i).substring(0,40) + "...");
                String price = h.GetPrice(links.get(i));
                yaz("Price : <" + price + ">");
            }
        }
        
        yaz("waiting...");
        Thread.sleep(4000);
        
        yaz("crawling end");
        
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
    
    static void yaz(String Msg){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss.SSS");
        Date date = new Date();
        System.out.println(dateFormat.format(date.getTime()) + " > " + Msg); //2016/11/16 12:08:43
    }
    
    
    public class MyLogger {
        
//        log = Logger.getLogger(deneme.class.getName());
//
//        ConsoleHandler handler1 = new ConsoleHandler();
//      handler1.setFormatter(new SimpleFormatter() {
//          private static final String format = "[%1$tF %1$tT.%1$tL] [%2$-7s] %3$s %n";
//
//          @Override
//          public synchronized String format(LogRecord lr) {
//              return String.format(format,
//                      new Date(lr.getMillis()),
//                      lr.getLevel().getLocalizedName(),
//                      lr.getMessage()
//              );
//          }
//      });
//
//
//      Handler[] hndlrs = log.getHandlers();
//
//        if (hndlrs.length>0)
//      log.removeHandler(hndlrs[0]);
//
//      log.addHandler(handler1);
        
        //        Logger log= Logger.getLogger("mylog");
        
        
//        log.setLevel(Level.ALL);
//        ConsoleHandler handler = new ConsoleHandler();
//        handler.setFormatter(new SimpleFormatter());
//        log.addHandler(handler);
//        log.log(Level.WARNING, "hello world");
//
//
//        log.fine("ok");
        
        
        
        //Logger log = Logger.getLogger("mylogger");
        
//        Handler[] handlers = log.getHandlers();
//        if (handlers[0] instanceof ConsoleHandler) {
//            log.removeHandler(handlers[0]);
//        }
//
//        log.setLevel(Level.INFO);
//        fileTxt = new FileHandler("Logging.txt");
//
//        formatterTxt = new SimpleFormatter() {
//          private static final String format = "[%1$tF %1$tT] [%2$-7s] %3$s %n";
//
//          @Override
//          public synchronized String format(LogRecord lr) {
//              return String.format(format,
//                      new Date(lr.getMillis()),
//                      lr.getLevel().getLocalizedName(),
//                      lr.getMessage()
//              );
//          }
//      };
//        fileTxt.setFormatter(formatterTxt);
//        log.addHandler(fileTxt);
        
    }
}