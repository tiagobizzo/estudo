package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.*;
import java.util.Date;
import java.util.TimeZone;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program{

    public static void main(String[] args) throws ParseException{

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        //LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        //LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        SimpleDateFormat frmt3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        frmt3.setTimeZone(TimeZone.getTimeZone("GMT")); //formato do Brasil

        System.out.println("Hora = " + d05.getHour());
        System.out.println("Minuto = " + d05.getMinute());
        System.out.println("Segundo = " + d05.getSecond());

        //calculo com data e hora
        System.out.println("--------------");
        LocalDate ano = d04.minusYears(2); //menos 2 anos

        System.out.println("Ano: " + ano.getYear());

        //data e hora local e atual
        System.out.println("--------------");
        LocalDate dataLocal = LocalDate.now();
        LocalDateTime dataHoraLocal = LocalDateTime.now();
        Instant inst = Instant.now();
        System.out.println("DataAtual: " + dataLocal);
        System.out.println("DataAtual: " + dataHoraLocal);
        System.out.println("Instant: " + inst);

        System.out.println("--------------");
        SimpleDateFormat frmt1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date x1 = new Date();
        System.out.println("Data e Hora local e atual: " + frmt1.format(x1));

        //DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //System.out.println("d04 = " + d04.format(fmt1));
        //System.out.println("d04 = " + fmt1.format(d04));
        //System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    }

}