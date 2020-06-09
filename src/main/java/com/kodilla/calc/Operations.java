package com.kodilla.calc;

class Operations
{
    private int wynik;
    private int varA;
    private int varB;

    public Operations()
    {
        this.varA=varA;
        this.varB=varA;
        this.wynik=wynik;
    }

    public int addition(int varA, int varB)
    {
        int wynik=varA+varB;
        return wynik;
    }


    public int subtraction(int varA, int varB)
    {
        int wynik=varA-varB;
        return wynik;
    }







    public static void main(String args[])
    {
        Operations calculator = new Operations();

        System.out.println("Wynik dodawania " + calculator.addition(10,10));;
        System.out.println("Wynik odejmowania " + calculator.subtraction(10,10));;

    }
}
