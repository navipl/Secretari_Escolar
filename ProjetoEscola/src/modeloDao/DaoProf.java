/*
 Esta clase tem a função de criar metodos que vao realizar a interaçao do formulario de PROFESSOR com o
 banco de dados, criando metos que iram dar aos botoes SALVAr, EXCLUIR, PESQUISAR e EDITAR seus 
 respequitivos codigos executando essas funçoes diretamente no banco.
 */

package modeloDao;

import modeloConection.ConexaoBD;
import java.sql.*;
import javax.swing.JOptionPane;
import modeloBeans.BeansProfessor;


public class DaoProf {
    ConexaoBD conex = new ConexaoBD(); // conexão com o Banco de Dados
    BeansProfessor mod = new BeansProfessor(); // Conexão com a Classe que recebe os atributos de Professor
    
    
    // Metodo que que salva no Banco as informações de cadastro de um Professor
    public void Salvar (BeansProfessor mod) {
        conex.conecxao();
        try {
            PreparedStatement pst = conex.con.prepareStatement ("insert into professor(NOME_PROF,FORMA_PROF,TIPO_FORM,FONE_PROF,CEL_PROF) values (?,?,?,?,?);"); //NASC_PROF, FONE_PROF, CEL_PROF
            pst.setString(1,mod.getProf_nome());
            pst.setString(2, mod.getProf_form());
            pst.setString(3, mod.getTipo_form());
            pst.setString(4, mod.getProf_tel());
            pst.setString(5, mod.getProf_cel());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Professor Inseridos Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir dados de Professor!/nErro:");
        }
        
        conex.desconectar();
    }
    
    // Metodo que que salva no Banco as informações Alteradas de um Professor
    public void Editar (BeansProfessor mod) {
        conex.conecxao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update professor set NOME_PROF=?,FORMA_PROF=?,TIPO_FORM=?,FONE_PROF=?,CEL_PROF=? where COD_PROF=?;");
            pst.setString(1,mod.getProf_nome());
            pst.setString(2, mod.getProf_form());
            pst.setString(3, mod.getTipo_form());
            pst.setString(4, mod.getProf_tel());
            pst.setString(5, mod.getProf_cel());
            pst.setInt(7, mod.getProf_cod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Professor Alterados Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar dados de Professor!/nErro:");
        }
        
        conex.desconectar();
        
    }
    
    // Metodo que que exclui no Banco as informações de um Professor
    public void Excluir (BeansProfessor mod) {
        conex.conecxao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from professor where COD_PROF=?;");
            pst.setInt(1, mod.getProf_cod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Professor Excluidos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir dados de Professor!/nErro:");
        }
        
        conex.desconectar();     
    }
    
    // Metodo que que realiza a busca de um Professor no banco
    public BeansProfessor buscaBeansProfessor (BeansProfessor mod) {
        conex.conecxao();
        conex.executaSql("select*from professor where NOME_PROF like'%"+mod.getProf_pesquisa()+"%'"); // executa a pesquisa referente ao metodo de Execução da classe ConexãoBD
        try {
            conex.rs.first(); //Recebe o resultado da pesquisa
            mod.setProf_cod(conex.rs.getInt("COD_PROF"));
            mod.setProf_nome(conex.rs.getString("NOME_PROF"));
            mod.setProf_form(conex.rs.getString("FORMA_PROF"));
            mod.setTipo_form(conex.rs.getString("TIPO_FORM"));
            mod.setProf_tel(conex.rs.getString("FONE_PROF"));
            mod.setProf_cel(conex.rs.getString("CEL_PROF"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Professor nao Cadastrado.");
        }
        
        conex.desconectar();
        return mod;
        
    }
}
