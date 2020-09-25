package part4.chapter11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Listing1101ShowGuests {

    public static final String FILE_NAME = "src/part4/chapter11/GuestList.txt";
    //public static final String FILE_NAME = "GuestList.txt";

    public static void main(String[] args) throws IOException {

        int[] guests = new int[10];
        Scanner diskScanner = new Scanner(new File(FILE_NAME));

        for(int roomNum = 0; roomNum < 10; roomNum++) {
            guests[roomNum] = diskScanner.nextInt();
        }

        System.out.println("Комната" + "\t" + "Количество человек");

        for(int roomNum = 0; roomNum < 10; roomNum++) {
            System.out.println(roomNum + "\t\t" + guests[roomNum]);
        }

        System.out.println("The End");

    }

}
