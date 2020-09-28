package part4.chapter11;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Listing1104FindVacancy {
    public static final String FILE_NAME = "src/part4/chapter11/GuestList.txt";
    //public static final String FILE_NAME = "GuestList.txt";

    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        Scanner diskScanner = new Scanner(new File(FILE_NAME));
        int[] guests = new int[10];
        int roomNum;

        for(roomNum = 0; roomNum < guests.length; roomNum++) {
            guests[roomNum] = diskScanner.nextInt();
        }

        roomNum = 0;
        while(roomNum < 10) {
            if(guests[roomNum] == 0) {
                System.out.println("Свободна комната № " + roomNum);
                System.out.println("Сколько человек хочет поселиться в комнате № " + roomNum + "?");
                guests[roomNum] = keyboard.nextInt();

                PrintStream listOut = new PrintStream(FILE_NAME);

                for(int roomNum2 = 0; roomNum2 < guests.length; roomNum2++) {
                    listOut.print(guests[roomNum2] + " ");
                }
            }
            roomNum++;
        }

        if(roomNum == 10) {
            System.out.println("Извините, свободных номеров пока нет!");
        }
    }
}
