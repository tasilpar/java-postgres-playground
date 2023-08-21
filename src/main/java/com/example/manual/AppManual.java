package com.example.manual;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppManual {
    public static void main(String[] args) {
        Integer iOpcao = 0;
        boolean parar = false;
        PersistCliente clientes = new PersistCliente();
        Scanner entrada = new Scanner(System.in);
        
        while(!parar){      
            imprimirMenu();      
            iOpcao = entrada.nextInt();
            switch (iOpcao) {
                case 1:
                    entrada.nextLine();
                    System.out.println("Digite o CPF do CLIENTE");
                    String cpfCliente = entrada.nextLine();
                    System.out.println("Digite o Nome do CLIENTE");
                    String nomeCliente = entrada.nextLine();
                    Cliente cliente = new Cliente(cpfCliente,nomeCliente);
                    try {
                        clientes.incluirCliente(cliente);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        //e.printStackTrace();
                        System.err.println(e.getMessage()); 
                    }      
                    break;
                case 2:
                    clientes.imprimeListaClientes();
                    break;    
                default:
                      System.out.println("Opção Invalida. Digite um número de 1 a 3");
                    break;
            }  
            try{
                System.out.println("Deseja Parar?(true/false)");   
                parar = entrada.nextBoolean();           
            }catch(InputMismatchException e){
                //throw new InputMismatchException("Opção Inválida para Parada");
                System.out.println("Opção Inválida para Parada...");
            }            
        }
        entrada.close();
        
    }
    public static void imprimirMenu()
    {
        System.out.println("Digita a Opção Desejada:");
        System.out.println("1- Incluir Cliente");
        System.out.println("2- Listar Clientes");
        System.out.println("3- Excluir Clientes");
        System.out.println("4- Transferir Lista para Banco de Dados");
        System.out.println("5- Lista Completa de Clientes no Banco de Dados");
        
    }
}
