package com.education.mosbach.string;

import java.util.Random;

public class DummyStringCompetition {


    public static void main(String[] args) {

        final int LIMIT = 10_000;
        Random random = new Random();

        long String_before = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < LIMIT; i++)
            s = s + random.nextInt(10);
        long String_after = System.currentTimeMillis();

        long Builder_before = System.currentTimeMillis();
        StringBuilder myBuilder = new StringBuilder("");
        for (int i = 0; i < LIMIT; i++)
            myBuilder.append(random.nextInt(10));
        long Builder_after = System.currentTimeMillis();

        long Buffer_before = System.currentTimeMillis();
        StringBuffer myBuffer = new StringBuffer("");
        for (int i = 0; i < LIMIT; i++)
            myBuffer.append(random.nextInt(10));
        long Buffer_after = System.currentTimeMillis();

        System.out.println("String-Competition:");
        System.out.println("======================================");
        System.out.println("String: "  + (String_after - String_before));
        System.out.println("Buffer: "  + (Buffer_after - Buffer_before));
        System.out.println("Builder: "  + (Builder_after - Builder_before));

    }

}
