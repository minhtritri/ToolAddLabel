///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package controller;
//
//import java.awt.List;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Vector;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import model.DataPointOutput;
//import static model.Readcs.parseCsvLine;
//
///**
// *
// * @author trivm
// */
//public class DataPointController {
//    private static DataPointController instance = new DataPointController();
//    private static String COMMA_DELIMITER = ",";
//    private ArrayList<DataPointOutput> DataPoint = new ArrayList<>();
//    
//    
//    public static DataPointController getInstance() {
//        return instance;
//    }
//
//    public ArrayList<DataPointOutput> getDataPoint() {
//        return DataPoint;
//    }
//    public void LoadCSV(){
//        BufferedReader br = null;
//        try {
//            String line;
//            br = new BufferedReader(new FileReader("read.csv"));
//            while ((line = br.readLine()) != null) {
//                parseCsvLine(line);
//            }
// 
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (br != null)
//                    br.close();
//            } catch (IOException crunchifyException) {
//                crunchifyException.printStackTrace();
//            }
//        }
//    }
//    public java.util.List<String> parseCsvLine(String csvLine) {
//        java.util.List<String> result = new ArrayList<String>();
//        if (csvLine != null) {
//            String[] splitData = csvLine.split(COMMA_DELIMITER);
//            for (int i = 0; i < splitData.length; i++) {
//                result.add(splitData[i]);
//            }
//        }
//        return result;
//    }
//    public void printContry(java.util.List<String> country) {
//        System.out.println(
//                "Country [id= "
//                + country.get(0) 
//                + ", code= " + country.get(1) 
//                + " , name=" + country.get(2) 
//                + "]");
//    }
//    public Vector toVector(int index) {
//        Vector vt = new Vector();
//        vt.add(DataPoint.get(index).getName());
//        vt.add(DataPoint.get(index).getVariations());
//        vt.add(DataPoint.get(index).getStar());
//        vt.add(DataPoint.get(index).getCmt());
//        vt.add(DataPoint.get(index).getLabel());
//       
//        return vt;
//    }
//    
//    public void toCsv(){
//        try {
//            FileWriter file = new FileWriter("new.csv");
//            file.append("Name");
//            file.append(",");
//            file.append("Variations");
//            file.append(",");
//            file.append("Star");
//            file.append(",");
//            file.append("Cmt");
//            file.append(",");
//            file.append("Label");
//            file.append("\n");
//            for (int i = 0; i< DataPoint.size(); i++) {
//                Vector vt = new Vector();
//                file.append(String.join(",", this.toVector(i)));
//                file.append("\n");
//            }
//        } catch (IOException ex) {
//            Logger.getLogger(DataPointController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }
//    
//}
//
