package com.example.manual;

public class AppManual {
    public static void main(String[] args) {
        try{
            Cliente cli = new Cliente("05005626603","Tadeu Silva Parreiras");
            cli.validarCPF();
        }catch(Exception e){

            System.out.println(e.getMessage());
        }
        
    }
}
