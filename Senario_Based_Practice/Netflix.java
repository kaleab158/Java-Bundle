/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.netflix;

/**
 *
 * @author kaleb
 */
public abstract class Netflix {
    private String Cource_Title;
    private String Instracturs_Name;
    protected double Base_Price;

    // Parameter-less Constructor
    public Netflix() {
        
    }

    // Parameterized Constructor
    public Netflix(String Cource_Title,
                  String Instracturs_Name,
                  double Base_Price) {

        this.Cource_Title = Cource_Title;
        this.Instracturs_Name = Instracturs_Name;
        this.Base_Price = Base_Price;
    }

    // Getters and Setters
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

    public double getBasePrice() {
        return Base_Price;
    }

    public void setBasePrice(double basePrice) {
        this.Base_Price = Base_Price;
    }
     public void DisplayInfo() {
        System.out.println("Course Title: " + Cource_Title);
        System.out.println("Instructor Name: " + Instracturs_Name);
        System.out.println("Base Price: " + Base_Price);
    }
    
       public abstract void CalculateFee();
   
 public static void main(String[] args) {
        Netflix [] courses = new Netflix[3];

        courses[0] = new Video_Cource(
                "Java Programming",
                "Kaleb",
                1000,
                "5 Hours"
        );

        courses[1] = new Live_Cource(
                "Data Structures",
                "Abel",
                1500,
                "Every Saturday 2 PM"
        );

        courses[2] = new Downloadable_Course(
               98,
               "Web Development",
               "Nahom",
               800,
               "www.downloadcourse.com/webdev"
       );


        for (Netflix  c : courses) {
            c.DisplayInfo();
            c.CalculateFee();
            
            
            
            if (c instanceof  OfflineAccess) {
                // down casting
                 OfflineAccess oa = ( OfflineAccess) c;
                oa.offline();
                
            }
            

            // Check downloadable course
            if (c instanceof Downloadable_Course) {

                Downloadable_Course dc =(Downloadable_Course) c;

                dc.DisplayDownloadLink();
            }

            System.out.println("------------------------- \n");
        }
    }
}
