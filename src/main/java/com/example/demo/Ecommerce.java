
package com.example.demo;

public class Ecommerce {

    private String electric;
    private String groceries;
    private String mobiles;

    public Ecommerce(String electric, String groceries, String mobiles)
    {
        this.electric = electric;
        this.groceries = groceries;
        this.mobiles = mobiles;
    }

    public String getElectric() {
        return electric;
    }

    public void setElectric(String electric) {
        this.electric = electric;
    }

    public String getGroceries() {
        return groceries;
    }

    public void setGroceries(String groceries) {
        this.groceries = groceries;
    }

    public String getMobiles() {
        return mobiles;
    }

    public void setMobiles(String mobiles) {
        this.mobiles = mobiles;
    }
}
