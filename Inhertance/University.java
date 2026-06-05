/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author kaleb
 */
public class University extends Department  {
    
   String Unive_Name;
    
    University(String Stud_Name ,int Stud_Id ,String Dep_Name , String Unive_Name){
        super( Stud_Name,Stud_Id,Dep_Name );
        
        this.Unive_Name =Unive_Name;
     
    }
   public void DispAY(){
        System.out.print("Stud Name = " +Stud_Name +"\n");
        System.out.print("Stud ID = " +Stud_Id +"\n");
        System.out.print("Dep Name = " +Dep_Name +"\n");
        System.out.print("Unive Name = " + Unive_Name +"\n");
     
        
    }
}
