/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.netflix;

/**
 *
 * @author kaleb
 */
public class Live_Cource extends Netflix{
      private String sessionSchedule;
     private String Cource_Title;
    private String Instracturs_Name;
    private static double Base_prise;
   
   static{
      Base_prise = 0;
   }
    public Live_Cource() {

}

// Parameterized Constructor
public Live_Cource(String Cource_Title,
                   String Instracturs_Name,
                   double Base_prise,
                   String sessionSchedule) {

    this.Cource_Title = Cource_Title;
    this.Instracturs_Name = Instracturs_Name;
    this.Base_prise = Base_prise;
    this.sessionSchedule = sessionSchedule;
}
    public void DisplayInfo() {
        System.out.println("Course Title: " + Cource_Title);
        System.out.println("Instructor Name: " + Instracturs_Name);
        System.out.println("Base Price: " + Base_prise);
        System.out.print("--------------------------------------- \n");
    }
    
    // setters and getters
        public String getSessionSchedule() {
        return sessionSchedule;
    }

    public void setSessionSchedule(String sessionSchedule) {
        this.sessionSchedule = sessionSchedule;
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
@Override
 public void CalculateFee(){
     System.out.println("Calculating fee On live cource... \n");
 }
} 

