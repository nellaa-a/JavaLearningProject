package md.tekwillacademy.variablesprogramme;

public class VariablesAndComments {
    public static void main(String [] args) {
        // Declare the variables


        //Truth based variables
        boolean isUsed;
        boolean hasBattery;
        boolean isAndroid;
        boolean isStolen;
        boolean isBlocked;
        boolean isCharged;

//Char related
        char condition;

        //Numeric-Related
        byte number0fSimCards;
        byte randomAccessMemory;

        short productionYear;

        int number0f0wners;
        long id;
        float operatingSystemVersion;
        double price;

        //Initialize an iPhone
        isUsed = false;
        hasBattery = true;
        isAndroid = false;
        isStolen = false;
        isBlocked = true;
        isCharged = true;

        condition = 'A';


        number0fSimCards = 2;
        randomAccessMemory = 4;
        productionYear = 2023;
        number0f0wners = 0;
        id = 54661651654L;
        operatingSystemVersion = 16.16F;
        price = 34550.5;

        System.out.println("The phone is charged" + isCharged);

        System.out.println(" The phone price is" + price);
    }

}
