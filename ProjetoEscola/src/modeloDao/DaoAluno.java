/*
 Esta clase tem a função de criar metodos que vao realizar a interaçao do formulario de ALUNOS com o
 banco de dados, criando metos que iram dar aos botoes SALVAr, EXCLUIR, PESQUISAR e EDITAR seus 
 respequitivos codigos executando essas funçoes diretamente no banco.
 */

package modeloDao;

import modeloConection.ConexaoBD;
import java.sql.*;
import javax.swing.JOptionPane;
import modeloBeans.BeansAluno;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;


public class DaoAluno {
    ConexaoBD conex = new ConexaoBD(); // conexão com o Banco de Dados
    BeansAluno mod = new BeansAluno(); // Conexão com a Classe que recebe os atributos de Professor
    String databanco;
    Date dataInicial;
    
    // Metodo que que salva no Banco as informações de cadastro de um Aluno
    public void Salvar (BeansAluno mod) {
        conex.conecxao();
        ConvBanco(mod.getAlu_nasc());
        try {
            PreparedStatement pst = conex.con.prepareStatement ("insert into aluno(NOME_ALU,MAE_ALU,PAI_ALU,NASC_ALU,FONE_ALU,CEL__ALU) values (?,?,?,?,?,?);");
            pst.setString(1,mod.getAlu_nome());
            pst.setString(2, mod.getAlu_mae());
            pst.setString(3, mod.getAlu_pai()); 
            pst.setString(4, databanco);
            pst.setString(5, mod.getAlu_tel());
            pst.setString(6, mod.getAlu_cel());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Aluno Inseridos Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir dados do Aluno!/nErro:");
        }
  
        conex.desconectar();
    } 
    
    
    // Metodo que que salva no Banco as informações alteradas de um Aluno
    public void Editar (BeansAluno mod) {
        conex.conecxao();
        ConvBanco(mod.getAlu_nasc());
        try {
            PreparedStatement pst = conex.con.prepareStatement("update aluno set NOME_ALU=?,MAE_ALU=?,PAI_ALU=?,NASC_ALU=?,FONE_ALU=?,CEL__ALU=? where COD_ALU=?;");
            pst.setString(1,mod.getAlu_nome());
            pst.setString(2, mod.getAlu_mae());
            pst.setString(3, mod.getAlu_pai());
            pst.setString(4, databanco);
            pst.setString(5, mod.getAlu_tel());
            pst.setString(6, mod.getAlu_cel());
            pst.setInt(7, mod.getAlu_cod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Aluno Alterados Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar dados do Aluno!/nErro:");
        }
        
        conex.desconectar();
        
    }
    
    // Metodo que que exclui no Banco as informações de um Aluno
    public void Excluir (BeansAluno mod) {
        conex.conecxao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from ALUNO where COD_ALU=?;");
            pst.setInt(1, mod.getAlu_cod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Aluno Excluidos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir dados Aluno!/nErro:");
        }
        
        conex.desconectar();     
    }
    
    // Metodo que que realiza a busca de um Aluno no banco
    public BeansAluno buscaBeansAluno (BeansAluno mod) {
        conex.conecxao();
        conex.executaSql("select*from aluno where NOME_ALU like'%"+mod.getAlu_pesquisa()+"%'"); // executa a pesquisa referente ao metodo de Execução da classe ConexãoBD
        try {
            
            conex.rs.first(); //Recebe o resultado da pesquisa
            mod.setAlu_cod(conex.rs.getInt("COD_ALU"));
            mod.setAlu_nome(conex.rs.getString("NOME_ALU"));
            mod.setAlu_mae(conex.rs.getString("MAE_ALU"));
            mod.setAlu_pai(conex.rs.getString("PAI_ALU"));
            ConvData(conex.rs.getString("NASC_ALU"));
            mod.setAlu_nasc(databanco);
            mod.setAlu_tel(conex.rs.getString("FONE_ALU"));
            mod.setAlu_cel(conex.rs.getString("CEL__ALU"));
 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Aluno nao Cadastrado.");
        }
        
        conex.desconectar();
        return mod;
        
    }
    
    //Metodo responsavel em converter a data para formato recebido do banco para o Brasileiro
    public void ConvData (String data) {

        try {
            dataInicial = new SimpleDateFormat("yyyy-MM-dd").parse(data);
            databanco = new SimpleDateFormat("dd/MM/yyyy").format(dataInicial);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }
 
    }

    //Metodo responsavel em converter a data para formato enviado do banco para o Americano
    public void ConvBanco (String data) {
        try {
            dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse(data);
            databanco = new SimpleDateFormat("yyyy-MM-dd").format(dataInicial);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }    
    }

    
    
}
