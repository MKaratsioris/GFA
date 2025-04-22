package reservations;

import java.util.ArrayList;
import java.util.List;

public class Reservation implements Reservationy {

    private String dow;
    private String code;

    public Reservation() {
        this.getCodeBooking();
        this.getDowBooking();
    }

    @Override
    public String getDowBooking() {
        int dowNumber = (int) (1+Math.random()*7);
        switch (dowNumber) {
            case 1:
                this.dow = String.valueOf(Dow.MON);
                break;
            case 2:
                this.dow = String.valueOf(Dow.TUE);
                break;
            case 3:
                this.dow = String.valueOf(Dow.WED);
                break;
            case 4:
                this.dow = String.valueOf(Dow.THU);
                break;
            case 5:
                this.dow = String.valueOf(Dow.FRI);
                break;
            case 6:
                this.dow = String.valueOf(Dow.SAT);
                break;
            case 7:
                this.dow = String.valueOf(Dow.SUN);
                break;
        }
        return this.dow;
    }

    @Override
    public String getCodeBooking() {
        code = "";
        int index = 0;
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        char[] charsArray = chars.toCharArray();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < charsArray.length; j++) {
                index = (int) (Math.random()*j);
            }
            this.code += charsArray[index];
        }
        return code.toUpperCase();
    }


    public static void main(String[] args) {

        List<Reservation> reservationsList = new ArrayList<>();
        reservationsList.add(new Reservation());
        reservationsList.add(new Reservation());
        reservationsList.add(new Reservation());
        reservationsList.add(new Reservation());
        reservationsList.add(new Reservation());
        reservationsList.add(new Reservation());

        for (Reservation reservation : reservationsList) {
            System.out.println(reservation);
        }


    }

    @Override
    public String toString() {
        return "Booking# " + code + " for " + dow;
    }
}
