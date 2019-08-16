package com.mitchellbosecke.benchmark.model;

import java.util.ArrayList;
import java.util.List;

import com.adapterj.annotation.ID;
import com.adapterj.annotation.GetMethod;

@ID(identity = "stock", initials = "s")
public class Stock1 {

    private String name;

    private String name2;

    private String url;

    private String symbol;

    private double price;

    private double change;

    private double ratio;

    public Stock1(String name, String name2, String url, String symbol, double price, double change, double ratio) {
        this.name = name;
        this.name2 = name2;
        this.url = url;
        this.symbol = symbol;
        this.price = price;
        this.change = change;
        this.ratio = ratio;
    }

    @GetMethod(methodName = "getName", returnType = "String", returnId = "name")
    public String getName() {
        return this.name;
    }

    @GetMethod(methodName = "getName2", returnType = "String", returnId = "name2")
    public String getName2() {
        return this.name2;
    }

    @GetMethod(methodName = "getUrl", returnType = "String", returnId = "url")
    public String getUrl() {
        return this.url;
    }

    @GetMethod(methodName = "getSymbol", returnType = "String", returnId = "symbol")
    public String getSymbol() {
        return this.symbol;
    }

    @GetMethod(methodName = "getPrice", returnType = "double", returnId = "price")
    public double getPrice() {
        return this.price;
    }

    @GetMethod(methodName = "getChange", returnType = "double", returnId = "change")
    public double getChange() {
        return this.change;
    }

    @GetMethod(methodName = "getRatio", returnType = "double", returnId = "ratio")
    public double getRatio() {
        return this.ratio;
    }

    public static List<Stock1> dummyItems() {
        List<Stock1> items = new ArrayList<Stock1>();
        items.add(new Stock1("Adobe Systems", "Adobe Systems Inc.", "http://www.adobe.com", "ADBE", 39.26, 0.13, 0.33));
        items.add(new Stock1("Advanced Micro Devices", "Advanced Micro Devices Inc.", "http://www.amd.com", "AMD",
                16.22, 0.17, 1.06));
        items.add(new Stock1("Amazon.com", "Amazon.com Inc", "http://www.amazon.com", "AMZN", 36.85, -0.23, -0.62));
        items.add(new Stock1("Apple", "Apple Inc.", "http://www.apple.com", "AAPL", 85.38, -0.87, -1.01));
        items.add(new Stock1("BEA Systems", "BEA Systems Inc.", "http://www.bea.com", "BEAS", 12.46, 0.09, 0.73));
        items.add(new Stock1("CA", "CA, Inc.", "http://www.ca.com", "CA", 24.66, 0.38, 1.57));
        items.add(new Stock1("Cisco Systems", "Cisco Systems Inc.", "http://www.cisco.com", "CSCO", 26.35, 0.13, 0.5));
        items.add(new Stock1("Dell", "Dell Corp.", "http://www.dell.com/", "DELL", 23.73, -0.42, -1.74));
        items.add(new Stock1("eBay", "eBay Inc.", "http://www.ebay.com", "EBAY", 31.65, -0.8, -2.47));
        items.add(new Stock1("Google", "Google Inc.", "http://www.google.com", "GOOG", 495.84, 7.75, 1.59));
        items.add(new Stock1("Hewlett-Packard", "Hewlett-Packard Co.", "http://www.hp.com", "HPQ", 41.69, -0.02, -0.05));
        items.add(new Stock1("IBM", "International Business Machines Corp.", "http://www.ibm.com", "IBM", 97.45, -0.06,
                -0.06));
        items.add(new Stock1("Intel", "Intel Corp.", "http://www.intel.com", "INTC", 20.53, -0.07, -0.34));
        items.add(new Stock1("Juniper Networks", "Juniper Networks, Inc", "http://www.juniper.net/", "JNPR", 18.96, 0.5,
                2.71));
        items.add(new Stock1("Microsoft", "Microsoft Corp", "http://www.microsoft.com", "MSFT", 30.6, 0.15, 0.49));
        items.add(new Stock1("Oracle", "Oracle Corp.", "http://www.oracle.com", "ORCL", 17.15, 0.17, 1.1));
        items.add(new Stock1("SAP", "SAP AG", "http://www.sap.com", "SAP", 46.2, -0.16, -0.35));
        items.add(new Stock1("Seagate Technology", "Seagate Technology", "http://www.seagate.com/", "STX", 27.35, -0.36,
                -1.3));
        items.add(new Stock1("Sun Microsystems", "Sun Microsystems Inc.", "http://www.sun.com", "SUNW", 6.33, -0.01,
                -0.16));
        items.add(new Stock1("Yahoo", "Yahoo! Inc.", "http://www.yahoo.com", "YHOO", 28.04, -0.17, -0.6));
        return items;
    }

}
