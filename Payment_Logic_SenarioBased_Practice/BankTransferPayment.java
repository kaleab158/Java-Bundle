/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payment;

class BankTransferPayment extends Payment {

    private int bankAccNumber;

    // Default Constructor
    public BankTransferPayment() {
        super();
        bankAccNumber = 0;
    }

    // Parameterized Constructor
    public BankTransferPayment(int amount, int bankAccNumber) {
        super(amount);
        this.bankAccNumber = bankAccNumber;
    }

    // Setter
    public void setBankAccNumber(int bankAccNumber) {
        this.bankAccNumber = bankAccNumber;
    }

    // Getter
    public int getBankAccNumber() {
        return bankAccNumber;
    }

    // Override processPay
    @Override
    void processPay() {
        System.out.println("Processing Bank Transfer Payment...");
        System.out.println("Amount: " + getAmount());
        System.out.println("Bank Account Number: " + bankAccNumber);
    }
}

// -------------------------------------------------