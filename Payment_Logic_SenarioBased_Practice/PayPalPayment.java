/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payment;

class PayPalPayment extends Payment {

    public String email;

    // Default Constructor
    public PayPalPayment() {
        super();
        email = "";
    }

    // Parameterized Constructor
    public PayPalPayment(int amount, String email) {
        super(amount);
        this.email = email;
    }

    // Override processPay
    @Override
    void processPay() {
        System.out.println("Processing PayPal Payment...");
        System.out.println("Amount: " + getAmount());
        System.out.println("Email: " + email);
    }
}
