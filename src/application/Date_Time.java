package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Time {
    public static void main(String[] args) {
        /*
        Para revisar:
        https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatterBuilder.html */

        // Para formatar a data e hora de um jeito custom
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        //Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");

        /* Formato customizado */
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20,1,30);

        System.out.println("Date: " + d01);
        System.out.println("Date/Time: " + d02);
        System.out.println("Instant: " + d03);
        System.out.println("Date: " + d04);
        System.out.println("DateTime: " + d05);
        System.out.println("Instant: " + d06);
        System.out.println("Date: " + d08);
        System.out.println("DateTime: " + d09);
        System.out.println("Date: " + d10);
        System.out.println("DateTime: " + d11);
    }
}
