package com.example.manual;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public  class  Conexao {
    
    private static final String SENHA = "";
    private static final String USERNAME = "gitpod";
    private static final String JDBC_URL = "jdbc:postgresql://localhost/postgres";
    public static  Connection  conectar()
    {
        try{
            return DriverManager.getConnection(JDBC_URL, USERNAME,SENHA) ; 
        }catch(SQLException e){
            throw new RuntimeException("Conexão Falhou",e);
        }        
    }

}
