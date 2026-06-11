/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.payment;

abstract class Payment {
    private int amount;

    // Default Constructor
    public Payment() {
        amount = 0;
    }

    // Parameterized Constructor
    public Payment(int amount) {
        this.amount = amount;
    }

    // Setter
    public void setAmount(int amount) {
        this.amount = amount;
    }

    // Getter
    public int getAmount() {
        return amount;
    }

    // Virtual Method
    public void generateReceipt() {
        System.out.println("Receipt Generated.");
    }

    // Abstract Method
    abstract void processPay();
}
