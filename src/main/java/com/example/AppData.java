package com.example;

import java.time.LocalDate;
import java.util.Scanner;

public class AppData {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String dataUsuario = new String();

        System.out.println("Digite uma data:");
        dataUsuario = entrada.nextLine();
        
        LocalDate dataAtual = LocalDate.parse(dataUsuario).of("dd/MM/yyyy");
        System.out.println(dataAtual);
    }

}
