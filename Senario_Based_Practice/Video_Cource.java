/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.netflix;

/**
 *
 * @author kaleb
 */
public class Video_Cource extends Netflix  implements OfflineAccess{
    private String Cource_Title;
    private String Instracturs_Name;
    private static double Base_prise;
    private String Video_duration;
   
   static{
      Base_prise = 0;
   }
   public Video_Cource(String Cource_Title,
                    String Instracturs_Name,
                    double Base_prise,
                    String Video_duration)
   {

    this.Cource_Title = Cource_Title;
    this.Instracturs_Name = Instracturs_Name;
    this.Base_prise = Base_prise;
    this.Video_duration = Video_duration;
}
    
    void Display_info(){
        System.out.print("information on Video_Course ");
    }
    
    // setters and getters
    public String getVideo_duration() {
    return Video_duration;
   }

public void setVideo_duration(String Video_duration) {
    this.Video_duration = Video_duration;
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
     System.out.println("Calculating fee Video Cource.... \n");
 }
  public void offline(){
        System.out.print("support Offline on Video Cource ..... \n");
    }
  public void DisplayInfo() {
        System.out.println("Course Title: " + Cource_Title);
        System.out.println("Instructor Name: " + Instracturs_Name);
        System.out.println("Base Price: " + Base_prise);
        System.out.print("-------------------------------------------- \n");
    }
}
