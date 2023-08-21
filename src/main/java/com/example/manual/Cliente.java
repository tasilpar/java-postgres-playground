package com.example.manual;

import java.time.LocalDate;
import java.util.Objects;

public class Cliente implements Comparable<Cliente>{
    
    //private Integer id ;    
    private LocalDate dtCadastro ;
    private String nome;
    private String cpf;
    private Double vlLimiteCredito;

    public Cliente(String cpf,String nome)
    {       
        
        this.nome = nome;
        this.cpf = cpf;
        this.dtCadastro = LocalDate.now();

    }

    public Double getVlLimiteCredito() {
        return vlLimiteCredito;
    }
    public void setVlLimiteCredito(Double vlLimiteCredito) {
        this.vlLimiteCredito = vlLimiteCredito;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }   


    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    

   
    public LocalDate getDtCadastro() {
        return dtCadastro;
    }
    public void setDtCadastro(LocalDate dtCadastro) {
        this.dtCadastro = dtCadastro;
    }
    public boolean validarCPF()
    {
            Integer multiplicador   = 10;
            Integer soma            = 0;
            Integer digitoVerific01     = null;
            Integer digitoVerific01part = null;
            Integer numPos          = null;            
            Integer tamanho         = this.cpf.length() - 2;

           System.out.println("CPF:" + this.cpf + "- tamanho:" + tamanho );
           //calculo do primeiro digito verificador
           for (int i = 0; i < tamanho; i++) {
               numPos = Integer.parseInt(this.cpf.substring(i, i + 1));
                           
               /*System.out.println("Numero da Posicão:" + i );
               System.out.println("Valor:" + pos);
               numPos = Integer.parseInt(pos); */
               //System.out.println("Numero da Posicão:" + i + "->" + numPos);
               soma +=  numPos * multiplicador;              
               //System.out.println(" * multiplicador:" + multiplicador );   
               //System.out.println("soma:"  + soma );   
               System.out.println("Valor:" + numPos + "soma:" + soma)  ; 
               --multiplicador; 
           }           
           digitoVerific01 = soma % 11;
           //System.out.println("Resto Soma dividido por 11:" + digitoVerific01);
           if(digitoVerific01 < 2 ){
                digitoVerific01 = 0;
           }else{
               digitoVerific01 = 11 - digitoVerific01;
           }  
           digitoVerific01part = Integer.parseInt(this.cpf.substring(9,10));
           System.out.println(Objects.equals(digitoVerific01,digitoVerific01part));
           return   Objects.equals(digitoVerific01,digitoVerific01part);
           //return false;           
    }
    public int compareTo(Cliente cliente)
    {
        return this.getNome().compareTo(cliente.getNome()) ;

    }

}
