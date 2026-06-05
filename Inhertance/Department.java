/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author kaleb
 */
public class Department extends Person {
    
    String Dep_Name;
    
     Department(String Stud_Name ,int  Stud_Id ,String Dep_Name){
         super(Stud_Name, Stud_Id);
        this. Dep_Name =  Dep_Name;
        this.Stud_Name = Stud_Name;
        this.Stud_Id = Stud_Id;
       
    }
    
}
