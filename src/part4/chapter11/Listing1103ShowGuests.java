package part4.chapter11;

public class Listing1103ShowGuests {
    public static void main(String[] args) {
        int[] guests = new int[]{4, 17, 5, 11, 8, 1, 8, 0, 7, 19};
        int roomNum = 0;

        System.out.println("Комната\tКоличество человек");
        for(int guestsNum : guests) {
            System.out.println(roomNum + "\t\t" + guestsNum);
            roomNum++;
        }
    }
}
