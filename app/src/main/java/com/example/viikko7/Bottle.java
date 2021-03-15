package com.example.viikko7;

class PepsiMax {
    private String name = "Pepsi Max";
    private double price = 1.80;

    private static PepsiMax temp = new PepsiMax();

    public PepsiMax() {

    }
    public static PepsiMax getInstance() {
        return temp;
    }

    public String getName(){
        return name;
    }
    public double getPrice() {
        return price;
    }
}
0
class CocaCola {
    private String name = "Coca-Cola";
    private double price = 1.80;

    private static CocaCola temp = new CocaCola();

    public CocaCola() {

    }
    public static CocaCola getInstance() {
        return temp;
    }

    public String getName(){
        return name;
    }
    public double getPrice() {
        return price;
    }
}