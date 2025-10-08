package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        // Array con la lista degli invitati
        String[] guestList = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };
        // chiedere all'utente il nome

        System.out.println("Inserisci il tuo nome");
        Scanner scanner = new Scanner(System.in);
        String guestName = scanner.nextLine();
        scanner.close(); // chiusura dello scanner

        // verifica se il nome è presente in lista
        boolean guestCheck = false;
        int index = 0;

        while (!guestCheck && index < guestList.length) {
            if (guestList[index].toLowerCase().equals(guestName.toLowerCase())) {
                guestCheck = true;
            }
            index++;
        }
        // accetta o rifiuta l'utente
        if (guestCheck) {
            System.out.println("Sei sulla lista. Puoi passare");
        } else {
            System.out.println("Non sei in lista. Non puoi passare");
        }
    }
}
