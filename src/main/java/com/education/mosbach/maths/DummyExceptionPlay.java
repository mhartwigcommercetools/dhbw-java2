package com.education.mosbach.maths;

import java.lang.reflect.InaccessibleObjectException;
import java.util.ArrayList;

public class DummyExceptionPlay {

    public void doALotOfNonsens() throws ArrayIndexOutOfBoundsException {

        /*
            Erzeugt einen unbehandelbaren Error / Fehler

            ArrayList<Integer> mylist = new ArrayList<>();
            while (true)
                mylist.add(123456);
         */

        // IndexArrayOutOfBounds ==> Runtime

        int[] numbers = {1,2,3,4};

        try {
            System.out.println("Feldinhalt von Feld 7 ist: " + numbers[6]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Den Feldinhalt gibt es nicht.");
        }
        catch (Exception e) {
            System.out.println("Jetzt kann ich nicht helfen. Irgendein Fehler ist aufgetreten.");
            System.out.println("Wir entschuldigen uns für diesen Fehler. Unser Support-Team ist informiert.");
        }

        System.out.println("Feldinhalt von Feld 7 ist: " + numbers[6]);

    }


    public static void main(String[] args) {
        DummyExceptionPlay dummyExceptionPlay = new DummyExceptionPlay();

        try {
            dummyExceptionPlay.doALotOfNonsens();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Den zweiten falschen Zugriff behandle ich in der main-Methode.");
        }

    }


}
