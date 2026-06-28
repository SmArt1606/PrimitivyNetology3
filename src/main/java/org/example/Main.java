package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int topUp = 1100;
        int balance = 100;
        int cashbackRatio = 100;

        if ((balance + topUp) > 1000)
        {
            System.out.println(balance + topUp);
            System.out.println(((balance + topUp)-1000)/cashbackRatio);
        }
        else {
            System.out.println(balance + topUp);
            System.out.println(0);
        }

        }
    }
