package com.gaurav.typeofinheritance;

/* ---------- PARENT CLASS ---------- */
class BankSystem
{
    double balance = 100000;
}

/* ---------- INTERFACE ---------- */
interface Pay
{
    void pay(int amount);
}

/* ---------- CHILD CLASS 1 ---------- */
class UPIs extends BankSystem implements Pay
{
    public void pay(int amount)
    {
        System.out.println("UPI Payment Done: ₹" + amount);
        System.out.println("Bank Balance: ₹" + (balance - amount));
        System.out.println();
    }
}

/* ---------- CHILD CLASS 2 ---------- */
class Credits extends BankSystem implements Pay
{
    public void pay(int amount)
    {
        System.out.println("Credit Card Payment Done: ₹" + amount);
        System.out.println("Bank Balance: ₹" + (balance - amount));
        System.out.println();
    }
}

/* ---------- CHILD CLASS 3 ---------- */
class Cashs extends BankSystem implements Pay
{
    public void pay(int amount)
    {
        System.out.println("Cash Payment Done: ₹" + amount);
        System.out.println("Bank Balance: ₹" + (balance - amount));
        System.out.println();
    }
}

/* ---------- MAIN CLASS ---------- */
public class PaymentHybridInheritance
{
    public static void main(String[] args)
    {
    	Pay p;

        p = new UPIs();
        p.pay(10000);

        p = new Credits();
        p.pay(20000);

        p = new Cashs();
        p.pay(5000);
    }
}