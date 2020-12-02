package com.company;


import java.util.Scanner;
import java.util.*;

public class Main {

    // III. Les fonctions

    // EX10
    public static boolean returnTrue() {
        return true;
    }

    // EX12
    public static String returnString(String name) {
        return name;
    }

    // EX13
    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // EX14
    public static String greaterThanOrLessThan(int num1, int num2) {
        if(num1 > num2) {
            return "Le nombre le plus grande est " + num1;
        }
        else if(num1 < num2) {
            return "Le nombre le plus petit est " + num1;
        } else {
            return "Les deux nombres sont égaux";
        }
    }

    // EX15
    public static String concatenation(int number, String name) {
        return number +  " " + name;
    }

    // EX16
    public static String helloName(String firstName, String lastName, int age) {
        return "Bonjour " + firstName + " " + lastName + ", tu as " + age + " ans";
    }

    // EX17
    public static String gererGenre(int age, String genre) {
        if(age >= 25 && genre.equalsIgnoreCase("homme")) {
            return "Vous êtes un homme et vous êtes majeur";
        } else if (age < 25 && genre.equalsIgnoreCase("homme")) {
            return "Vous êtes un homme et vous êtes mineur";
        } else if (age >= 25 && genre.equalsIgnoreCase("femme")) {
            return "Vous êtes une femme et vous êtes majeur";
        } else if (age < 25 && genre.equalsIgnoreCase("femme")) {
            return "Vous êtes une femme et vous êtes mineur";
        } else {
            return "L'une des entrées est incorrecte!";
        }
    }

    // EX18
    public static int sum(Integer num1, Integer num2, Integer num3) {
        num1 = (num1 == null) ? 0 : num1;
        num2 = num2 == null ? 0 : num2;
        num3 = num3 == null ? 0 : num3;
        return num1 + num2 + num3;
    }


    public static void main(String[] args) {

        // I. Les variables

        // EX1
        System.out.println("Quel est votre nom");
        Scanner scanner = new Scanner(System.in);
        String fullName = scanner.nextLine();
        System.out.println("Bonjour, " + fullName + "!");

        // EX2
        float TVA = 0.2f;
        float TTC;
        int remise;
        System.out.println("Saisir le montant :");
        float HT = scanner.nextFloat();
        System.out.println("Souhaiter le remise : (y/n)");
        char avecRemise = scanner.next().charAt(0);
        if (avecRemise == 'y' || avecRemise == 'Y') {
            System.out.println("Enter la remise en percentage :");
            remise = scanner.nextInt();
            TTC = HT + (HT * TVA) - (HT * (remise / 100f));
            System.out.println("TTC = " + TTC + " with " + remise + "%" +" remise");
        } else {
            TTC = HT + (HT * TVA);
            System.out.println("TTC = " + TTC);
            System.out.println("Aucune remise n'a été appliquée");

        }


        // II. Les boucles

        // EX3
        int i = 0;
        while(i < 10) {
            System.out.println(i);
            i++;
        }

        // EX4
        int firstNum = 0;
        int secondNum = (int) (Math.random() * (10-2)) + 1;
        while(firstNum < 30) {
            int multiplication = firstNum * secondNum;
            System.out.println(firstNum + " * " + secondNum + " = " + multiplication);
            firstNum++;
        }

        // EX5
        int k = 1;
        while(k < 10) {
            System.out.println(i);
            k += 5;
        }

        // EX7
        for (int j = 1; j <= 15 ; j++) {
            System.out.println("On y arrive presque à " + j);
        }

        // EX8
        for (int j = 20; j >= 1 ; j--) {
            System.out.println("C'est presque bon à " + j);
        }

        // EX8
        for (int j = 1; j < 100 ; j += 15) {
            System.out.println("On tient le bon bout à " + j);
        }

        // EX9
        for (int j = 200; j >= 0 ; j -= 12) {
            System.out.println("Enfin " + j);
        }


        // IV. Les collections

        // EX19
        String[] monthOfYear = new String[12];
        monthOfYear[0] = "Janvier";
        monthOfYear[1] = "Février";
        monthOfYear[2] = "Mars";
        monthOfYear[3] = "Avril";
        monthOfYear[4] = "Mai";
        monthOfYear[5] = "Juin";
        monthOfYear[6] = "Juiller";
        monthOfYear[7] = "Aout";
        monthOfYear[8] = "Septembre";
        monthOfYear[9] = "Octobre";
        monthOfYear[10] = "Novembre";
        monthOfYear[11] = "Décembre";

        // EX20
        for (String month: monthOfYear) {
            System.out.println(month);
        }

        // EX21
        System.out.println(monthOfYear[2]);

        // EX22
        System.out.println(monthOfYear[5]);

        // EX23
        monthOfYear[7] = "Août";

        // EX24
        String[] newMonthOfYear = new String[13];

        // EX25
        newMonthOfYear[0] = "Geek";

        // EX26
        for (int j = 1; j < newMonthOfYear.length ; j++) {
            newMonthOfYear[j] = monthOfYear[j-1];
        }

        // EX27
        for (String month: newMonthOfYear) {
            System.out.println(month);
        }

        // EX28
        ArrayList<String> month = new ArrayList<>();
        month.add("Janvier");
        month.add("Février");
        month.add("Mars");
        month.add("April");
        month.add("Mai");
        month.add("Juin");
        month.add("Juillet");
        month.add("Aout");
        month.add("Septembre");
        month.add("Octobre");
        month.add("Novembre");
        month.add("Décembre");
        System.out.println(month);

        // EX29
        System.out.println(month.get(2));

        // EX30
        System.out.println(month.get(5));

        // EX31
        for (String mois: month) {
            System.out.println(mois);
        }

        // EX32
        month.set(7, "Août");

        // EX33
        month.add(0, "geek");

        // EX34
        month.remove(2);

        // EX35
        for (String mois: month) {
            if(mois == "Mai") {
                System.out.println(mois);
            }
        }

        // EX36
        Collections.sort(month);
        System.out.println(month);

        // EX37
        ArrayList<String> copyMonth = new ArrayList<>();
        copyMonth = month;

        // EX38
        ArrayList<String> cloneMonth = new ArrayList<>(month);
        cloneMonth.addAll(month);

        // EX39
        System.out.println(cloneMonth.isEmpty());

        // EX40
        HashSet<String> months = new HashSet<>();
        months.add("Janvier");
        months.add("Février");
        months.add("Mars");
        months.add("April");
        months.add("Mai");
        months.add("Juin");
        months.add("Juillet");
        months.add("Aout");
        months.add("Septembre");
        months.add("Octobre");
        months.add("Novembre");
        months.add("Décembre");
        System.out.println(months);

        // EX41
        months.add("Mustapha");

        // EX42
        for (String item: months) {
            System.out.println(item);
        }

        // EX43
        months.size();

        // EX44
        System.out.println(months.isEmpty());

        // EX45
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("Web Developer", "Mustapha Kadouri");
        hashMap.put("Web Designer", "Mohamed Mouigina");

        // EX46
        hashMap.size();

        // EX47
        HashMap<String,String> copyHashMap;
        copyHashMap = hashMap;

        // EX48
        copyHashMap.remove("Web Designer");

        // EX49 (Enveloppe)
        float besoins;
        System.out.println("Enter votre montant");
        int montant = scanner.nextInt();
        do {
            float books = montant * (3 / 4);
            System.out.println("Enter le prix de café");
            int cafe = scanner.nextInt();
            System.out.println("Enter le prix de carte de recharge prépayer");
            int recharge = scanner.nextInt();
            System.out.println("Enter le prix de billets de TRAME");
            int trame = scanner.nextInt();
            besoins = cafe + recharge + trame + books;
            if( besoins <= montant ) {
                System.out.println("Vous avez comme reste : " + (montant - besoins));
            } else {
                System.out.println("Le montant n'est pas suffisante pour vos besoins");
            }
        } while (besoins > montant);





    }
}
