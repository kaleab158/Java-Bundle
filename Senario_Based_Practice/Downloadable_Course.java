/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.netflix;

/**
 *
 * @author kaleb
 */
public class Downloadable_Course extends Netflix implements OfflineAccess{
    private double fileSize;
    private String Cource_Title;
    private String Instracturs_Name;
    private static double Base_prise;
    private static String downlodeLink;
   
   static{
      Base_prise = 0;
   }
   // Default Constructor
public Downloadable_Course() {

}

// Parameterized Constructor
public Downloadable_Course(double fileSize,
                           String Cource_Title,
                           String Instracturs_Name,
                           double Base_prise,
                           String downlodeLink) {

    this.fileSize = fileSize;
    this.Cource_Title = Cource_Title;
    this.Instracturs_Name = Instracturs_Name;
    this.Base_prise = Base_prise;
    this.downlodeLink = downlodeLink;
}
    
      public void DisplayInfo() {
          System.out.print("In Downlodeble Cource Info ");
        System.out.println("Course Title: " + Cource_Title);
        System.out.println("Instructor Name: " + Instracturs_Name);
        System.out.println("Base Price: " + Base_prise);
    }
    
    // setters and getters
    
    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }
    
    public String getCource_Title() {
    return Cource_Title;
    }

    public void setCource_Title(String Cource_Title) {
        this.Cource_Title = Cource_Title;
    }

    public String getInstracturs_Name() {
        return Instracturs_Name;
    }

    public void setInstracturs_Name(String Instracturs_Name) {
        this.Instracturs_Name = Instracturs_Name;
    }
        public void DisplayDownloadLink() {
        System.out.println("Download Link ..... \n" );
    }
    @Override
     public void CalculateFee(){
         System.out.println("Calculating fee Downlodeble  Cource.... \n");
     }
       public void offline(){
        System.out.print("support Offline on Downlodeble cource .... .....\n");
    }
}
