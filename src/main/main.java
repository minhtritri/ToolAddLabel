/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import view.ToolFrm;

/**
 *
 * @author trivm
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ToolFrm tool = new ToolFrm();
        tool.setVisible(true);
        tool.setDefaultCloseOperation(EXIT_ON_CLOSE);
        System.out.println("hello world");
    }
    
}
