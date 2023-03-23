package com.db.logicaProgramacion7;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class logicaSiete {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar día de la semana
        DayOfWeek diaSemana = null;
        boolean diaValido = false;
        while (!diaValido) {
            System.out.print("Ingresa un día de la semana (lunes a viernes): ");
            String diaInput = scanner.nextLine().toLowerCase();

            try {
                diaSemana = DayOfWeek.valueOf(diaInput.toUpperCase());
                if (diaSemana.getValue() >= 1 && diaSemana.getValue() <= 5) {
                    diaValido = true;
                } else {
                    System.out.println("Error: debes ingresar un día de lunes a viernes.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: debes ingresar un día de lunes a viernes.");
            }
        }

        // Solicitar hora y minutos
        LocalTime hora = null;
        boolean horaValida = false;
        while (!horaValida) {
            System.out.print("Ingresa la hora (formato HH:mm): ");
            String horaInput = scanner.nextLine();

            try {
                hora = LocalTime.parse(horaInput, DateTimeFormatter.ofPattern("HH:mm"));
                horaValida = true;
            } catch (DateTimeParseException e) {
                System.out.println("Error: debes ingresar una hora válida en formato HH:mm.");
            }
        }

        // Calcular minutos hasta el fin de semana
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime inicioFinSemana = now.withHour(15).withMinute(0).withSecond(0).withNano(0);
        LocalDateTime proximoFinSemana = inicioFinSemana.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        if (now.isAfter(proximoFinSemana)) {
            proximoFinSemana = proximoFinSemana.plusWeeks(1);
        }

        LocalDateTime fechaInput = now.with(diaSemana).withHour(hora.getHour()).withMinute(hora.getMinute()).withSecond(0).withNano(0);
        long minutosHastaFinSemana = fechaInput.until(proximoFinSemana, ChronoUnit.MINUTES);

        // Mostrar resultado
        System.out.println("Minutos hasta el fin de semana: " + minutosHastaFinSemana);
    }

}
