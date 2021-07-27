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
public class DataPointOutput {
    private String Name;
    private String Variations;
    private int Star;
    private String Cmt;
    private int label;

    public DataPointOutput() {
    }

    public DataPointOutput(String Name, String Variations, int Star, String Cmt, int label) {
        this.Name = Name;
        this.Variations = Variations;
        this.Star = Star;
        this.Cmt = Cmt;
        this.label = label;
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

    public int getLabel() {
        return label;
    }

    public void setLabel(int label) {
        this.label = label;
    }
    
}
