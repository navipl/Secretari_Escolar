/*
 Esta clase tem a função de criar metodos que vao realizar a interaçao do formulario de TURMA com o
 banco de dados, criando metos que iram dar aos botoes SALVAr, EXCLUIR, PESQUISAR e EDITAR seus 
 respequitivos codigos executando essas funçoes diretamente no banco.
 */

package modeloDao;

import modeloConection.ConexaoBD;
import java.sql.*;
import javax.swing.JOptionPane;
import modeloBeans.BeansTurma;


public class DaoTurma {
    ConexaoBD conex = new ConexaoBD(); // conexão com o Banco de Dados
    BeansTurma mod = new BeansTurma(); // Conexão com a Classe que recebe os atributos de Professor
    
    // Metodo que que salva no Banco as informações de cadastro de um Turma
    public void Salvar (BeansTurma mod) {
        conex.conecxao();
        try {
            PreparedStatement pst = conex.con.prepareStatement ("insert into turma (COD_TUR,DESCRI_TUR) values (?,?);");
            pst.setString(1,mod.getTur_cod());
            pst.setString(2, mod.getTur_nome());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Turma Inseridos Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir dados de Turma!/nErro:");
        }
  
        conex.desconectar();
    } 
    
    
    // Metodo que que salva no Banco as informações Alteradas de um Turma
    public void Editar (BeansTurma mod) {
        conex.conecxao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update turma set DESCRI_TUR=? where COD_TUR=?;");
            pst.setString(1,mod.getTur_nome());
            pst.setString(2, mod.getTur_cod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Turma Alterados Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar dados de Turma!/nErro:");
        }
        
        conex.desconectar();
        
    }
    
    // Metodo que que exclui no Banco as informações de um Turma
    public void Excluir (BeansTurma mod) {
        conex.conecxao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from turma where COD_TUR=?;");
            pst.setString(1, mod.getTur_cod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Turma Excluidos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir dados de Turma!/nErro:");
        }
        
        conex.desconectar();     
    }
    
    // Metodo que que realiza a busca de um Turma no banco
    public BeansTurma buscaBeansTurma (BeansTurma mod) {
        conex.conecxao();
        conex.executaSql("select*from turma where DESCRI_TUR like'%"+mod.getTur_pesquisa()+"%'"); // executa a pesquisa referente ao metodo de Execução da classe ConexãoBD
        try {
            
            conex.rs.first(); //Recebe o resultado da pesquisa
            mod.setTur_cod(conex.rs.getString("COD_TUR"));
            mod.setTur_nome(conex.rs.getString("DESCRI_TUR"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Turma nao Cadastrado.");
        }
        
        conex.desconectar();
        return mod;
        
    }
   
}
