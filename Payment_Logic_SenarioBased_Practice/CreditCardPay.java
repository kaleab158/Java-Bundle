/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payment;

class CreditCardPay extends Payment {

    private int cardNumber;
    private String cardHolderName;

    // Default Constructor
    public CreditCardPay() {
       
        cardNumber = 0;
        cardHolderName = "";
    }

    // Parameterized Constructor
    public CreditCardPay( int cardNumber, String cardHolderName) {
     
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    // Setter and Getter for cardNumber
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    // Setter and Getter for cardHolderName
    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    // Override processPay
    @Override
    void processPay() {
        System.out.println("Processing Credit Card Payment...");
        System.out.println("Amount: " + getAmount());
        System.out.println("Card Holder: " + cardHolderName);
    }
}