package com.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AppData {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String dataUsuario = new String();


        System.out.println("Digite uma data:");
        dataUsuario = entrada.nextLine();
        System.out.println(dataUsuario);

        LocalDate dataAtual = LocalDate.parse(dataUsuario,DateTimeFormatter.ofPattern("dd/MM/yyyy"));        
        LocalDate dataCalculada = dataAtual.minusDays(10).minusMonths(1);

        System.out.println(dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(dataCalculada.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        entrada.close();
    }

}
