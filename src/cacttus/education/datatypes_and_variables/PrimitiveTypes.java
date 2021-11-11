package cacttus.education.datatypes_and_variables;


public class PrimitiveTypes {
    public static void main(String[] args) {//BYTE
        System.out.println("PrimitiveTypes");
        byte myAge = 24;
        System.out.print("My Age- ");
        System.out.println(myAge + " Years");
        byte myGirlAge = 4;
        System.out.print("My Girl's Age-");
        System.out.println(myGirlAge + " Years");
        byte ourDifference = 24 - 4;
        System.out.print("Our Difference-");
        System.out.println(ourDifference + " Years");//SHORT
        short yearofbirth = 1997;
        System.out.print("Year of Birth-");
        System.out.println(yearofbirth);
        short currentyear = 2021;
        System.out.print("Current Year-");
        System.out.println(currentyear);
        short myage = 2021 - 1997;
        System.out.print("Age-");
        System.out.println(myage);//INT
        int weeklypay = 2500;
        System.out.print("Weekly Pay-");
        System.out.println(weeklypay + " €");
        int monthlysalary = weeklypay * 4;
        System.out.print("Monthly Salary-");
        System.out.println(monthlysalary + " €");
        int annualsalary = monthlysalary * 12;
        System.out.print("Annual Salary-");
        System.out.println(annualsalary + " €");//long
        long existenceofEarth = 4570000000L;
        System.out.print("Existence of Earth-");
        System.out.println(existenceofEarth + " Years");
        long weightofEarth = 600000000000L;
        System.out.print("Weight of Earth-");
        System.out.println(weightofEarth + "Ton");
        long sizeofEarth = 510000000L;
        System.out.print("Size of Earth-");
        System.out.println(sizeofEarth + "Km2");//Float//
        float ourSavings = 60.40f;
        System.out.print("Our Savings-");
        System.out.println(ourSavings + " €");
        float ourPurchases = 47.50f;
        System.out.print("Our Purchases-");
        System.out.println(ourPurchases + " €");
        float ourBalance = ourSavings - ourPurchases;
        System.out.print("Our Balance-");
        System.out.println(ourBalance + " €");//DOUBLE
        double regularPrice = 499.99;
        System.out.print("Regular Price of Tv-");
        System.out.println(regularPrice + " €");
        double installementPayment = 12;
        System.out.print("Installement Payment-");
        System.out.println(installementPayment + " Months");
        double monthlyPaymentPrice = regularPrice / installementPayment;
        System.out.print("Monthly Payment Price-");
        System.out.println(monthlyPaymentPrice + " €");//CHAR
        char yourNameStartWith = 'K';
        System.out.print("Your Name Start With - ");
        System.out.println(yourNameStartWith);


    }
}

