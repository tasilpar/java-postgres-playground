package com.example.manual;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class Dao {
    
    private Connection conexao = null;
    private String tabela      = "";    
    private String condicao    = "";    
    private String campoChave  = "";    
    private String valorChave  = "";
    private String acao        = "";

    public String getTabela() {
        return tabela;
    }
    public void setTabela(String tabela) {
        this.tabela = tabela;
    }
    public String getCondicao() {
        return condicao;
    }
    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }
    public String getCampoChave() {
        return campoChave;
    }
    public void setCampoChave(String campoChave) {
        this.campoChave = campoChave;
    }
    public String getValorChave() {
        return valorChave;
    }
    public void setValorChave(String valorChave) {
        this.valorChave = valorChave;
    }
    private void executarCmd()
    {
        getConexao();
        try{
            String txtCmd = criarCmd();
            var cmd =  this.conexao.prepareStatement(txtCmd,Statement.RETURN_GENERATED_KEYS ) ;            
            cmd.execute(txtCmd);
        }catch(SQLException e){
            System.out.println("Conexão Com erro");
            return;
        }
    }
    public void incluir()
    {
        this.acao = "incluir";
        this.executarCmd();        



    }
    private String criarCmd() {

        return "";
    }
    public void alterar()
    {
        getConexao();
    }
    public void excluir()
    {
        getConexao();

    }
    public void consultar()
    {
        getConexao();
    }
    private void getConexao()
    {
        if(this.conexao == null){
            this.conexao = Conexao.conectar();
        }        
    }

}
