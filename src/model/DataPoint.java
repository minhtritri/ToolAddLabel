/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author trivm
 */
public class DataPoint {
    private String Name;
    private String Variations;
    private float Price;
    private int Star;
    private String Cmt;

    public DataPoint() {
    }

    public DataPoint(String Name, String Variations, float Price, int Star, String Cmt) {
        this.Name = Name;
        this.Variations = Variations;
        this.Price = Price;
        this.Star = Star;
        this.Cmt = Cmt;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getVariations() {
        return Variations;
    }

    public void setVariations(String Variations) {
        this.Variations = Variations;
    }

    public int getStar() {
        return Star;
    }

    public void setStar(int Star) {
        this.Star = Star;
    }

    public String getCmt() {
        return Cmt;
    }

    public void setCmt(String Cmt) {
        this.Cmt = Cmt;
    }

    @Override
    public String toString() {
        return "DataPoint{" + "Name=" + Name + ", Variations=" + Variations + ", Price=" + Price + ", Star=" + Star + ", Cmt=" + Cmt + '}';
    }
    
    
}
