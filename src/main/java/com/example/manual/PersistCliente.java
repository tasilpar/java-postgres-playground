package com.example.manual;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;



public class PersistCliente {
    
    private List<Cliente> clientes = new LinkedList<>();

    public List<Cliente> getClientes() 
    {

        return clientes;

    }
    public void imprimeListaClientes()
    {
        Collections.sort(clientes);
        clientes.forEach(item->System.out.println(item.getNome()));       


    }
    

    public void incluirCliente(Cliente cliente) throws Exception  {

        boolean cpfValidado = false;
        //cpfValidado = cliente.validarCPF();
        cpfValidado = true;
        if(cpfValidado){
            this.clientes.add(cliente)  ;
        }else{
            throw new Exception ("Cliente com CPF:" + cliente.getCpf() + " Inválido");
        }        
    }
    public boolean excluirClientePorCpf(String cpf){

        //Iterator<Cliente> iCliente = this.clientes.iterator();
        return this.clientes.removeIf(cliente -> cliente.getCpf().equalsIgnoreCase(cpf));       

    }

    



}
