package com.example.manual;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test; 

public class ClienteTest {

    @Test
    void validarCPF()
    {

           Cliente cliente = new Cliente("05005626603","Tadeu Silva Parreiras");
           boolean valorEsperado  = true;           
           boolean valorResultado =  cliente.validarCPF();
           
           assertEquals(valorEsperado,valorResultado);
    }

}
