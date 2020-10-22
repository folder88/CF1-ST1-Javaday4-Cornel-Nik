package Cornel;

import java.util.Scanner;

public class BankAccound {



    float currentAccound ;
    float addMoney;
    float substractMoney;

    BankAccound(){

        System.out.println("The current balance is " + this.currentAccound);
    }

    public void addMoney(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the summ witch you want to add");
        addMoney = scan.nextFloat();

        this.currentAccound = this.currentAccound + addMoney;

        System.out.println("Your current accound is " + this.currentAccound);


    }

    public void substractMoney(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the summ witch you want to substract");

        substractMoney = scan.nextFloat();

        this.currentAccound = this.currentAccound - substractMoney;

        System.out.println("Your current accound is " + this.currentAccound);


    }
}
