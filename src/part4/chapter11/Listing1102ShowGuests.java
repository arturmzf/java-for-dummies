package part4.chapter11;

public class Listing1102ShowGuests {

    public static void main(String[] args) {
        int[] guests = new int[] {11, 7, 8, 14, 17, 2, 0, 8, 5, 1};

        System.out.println("Комната\tКоличество");

        for(int roomNum = 0; roomNum < guests.length; roomNum++) {
            System.out.println(roomNum + "\t\t" + guests[roomNum]);
        }
    }

}
