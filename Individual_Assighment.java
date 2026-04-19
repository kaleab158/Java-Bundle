/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.assighment;

import java.util.Scanner;

/**
 *
 * @author kaleb
 */
class Products {
    // let's assume product 1 is Coca ;
    // let's assume product 2 is Pepsi ;
    // let's assume product 3 is Fanta ;

    static double coca = 9.98;
    static double Pepsi = 4.50;
    static double Fanta = 2.98;

    int Quantity = 0;
    int tracker1, tracker2, tracker3 = 0;

    double product1_Price = 0;
    double product2_Price = 0;
    double product3_Price = 0;

    public void Calculating_Salse() {

        boolean Buy = true;
        Scanner s = new Scanner(System.in);

        while (Buy) {
            System.out.print("1.Coca   -> 2.98 \n");
            System.out.print("2.pepsi  -> 4.50 \n");
            System.out.print("3.Fanta  -> 9.98\n");
            System.out.print("4.Exit \n");
            int choise = s.nextInt();
            switch (choise) {
                case 1:
                    product1_Price = product1_Price + 2.98;
                    Quantity++;
                    tracker1++;
                    break;

                case 2:
                    product2_Price = product2_Price + 4.50;
                    Quantity++;
                    tracker2++;
                    break;

                case 3:
                    product3_Price = product3_Price + 9.98;
                    Quantity++;
                    tracker3++;
                    break;

                case 4:
                    if (Quantity > 0) {
                        double Total_Price = (tracker1 * 2.98) + (tracker2 * 4.50) + (tracker3 * 9.98);

                        System.out.print("Total Item's Bought =  " + Quantity + "\n");

                        System.out.print("Coca Bought  =  " + tracker1 + "\n");
                        System.out.print("Pepsi Bought  =  " + tracker2 + "\n");
                        System.out.print("Fanta Bought  =  " + tracker3 + "\n");
                        System.out.print("Total Price =  " + Total_Price + "\n");
                        Buy = false;
                        break;
                    } else {
                        System.out.print("No Item's Bought \n");
                        break;
                    }

                default:
                    System.out.print("Invalid input \n");
                    break;

            }
        }

    }
}

class password {

    public void Password_Checker() {
        Scanner s = new Scanner(System.in);
        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&]).{8,}$";
        System.out.print("Enter Your Password");
        String Password = s.nextLine();

        if (Password.matches(pattern)) {
            System.out.print("Exellent Password is Strong \n");

        } else {
            System.out.print("Weak Password Update Please ... \n");
        }

    }
}

class Colats {

    public int isGuthrieSequence(int[] a) {

        int lastarry = a.length - 1;

        if (a[lastarry] != 1) {
            return 0;
        }

        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] % 2 == 0) {

                if (a[i] / 2 != a[i + 1]) {
                    return 0;
                }

            } else if (a[i] % 2 == 1) {

                if (a[i] * 3 + 1 != a[i + 1]) {
                    return 0;
                }
            }
        }

        return 1;
    }
}

enum Day {

    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

}

enum Order_Stutus {

    Pending, Shipped, Delivered, Cancled;
}

public class Assighment {

    public static void main(String[] args) {
        boolean list = true;
        while (list) {
            Scanner s = new Scanner(System.in);

            System.out.print("========================= \n");
            System.out.print("======== Welcome ======== \n");
            System.out.print("========================== \n");
            System.out.print(" 1. Calculating Salse (Q.12) \n");
            System.out.print(" 2. Password Checker (Q.50) \n");
            System.out.print(" 3. Gurthrie Sequence Cheking (Q.53) \n");
            System.out.print(" 4. Day's Of Week's  (Bonuse) \n");
            System.out.print(" 5. Order Status  (Bonuse) \n");
            System.out.print(" 6. Exit \n");

            System.out.print(" Enter Choise = > ");

            int Choise = s.nextInt();
            switch (Choise) {
                case 1:
                    Products p = new Products();
                    p.Calculating_Salse();
                    break;
                case 2:
                    password Pw = new password();
                    Pw.Password_Checker();
                    break;
                case 3:
                    System.out.print("Enter Your size \n");
                    int size = s.nextInt();
                    System.out.print("Enter Your array Elements\n");
                    int[] a = new int[size];
                    for (int i = 0; i < size; i++) {
                        a[i] = s.nextInt();
                    }
                    Colats C = new Colats();

                    int result = C.isGuthrieSequence(a);
                    System.out.print(result + "\n");
                    break;
                case 4:
                    System.out.print("Enter number (1-7): \n");
                    int num = s.nextInt();

                    if (num >= 1 && num <= 7) {
                        Day day = Day.values()[num - 1];
                        System.out.println("Day is -> " + day + "\n");
                    } else {
                        System.out.println("Invalid number... \n");
                    }
                    break;
                case 5:
                    Order_Stutus status = Order_Stutus.Pending;
                    System.out.println("Status is =>" + status + "\n");

                    status = Order_Stutus.Shipped;
                    System.out.println("Status is => " + status + "\n");

                    status = Order_Stutus.Delivered;
                    System.out.println("Status is => " + status + "\n");
                    status = Order_Stutus.Cancled;
                    System.out.println("Status is => " + status + "\n");
                    break;
                case 6:

                    System.out.println("Tnx For Trying ..... \n");
                    list = false;
                case 7:
                default:
                    list = false;
                    break;

            }

        }
    }
}
// The End .......