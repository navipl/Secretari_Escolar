/*
 Esta clase tem a função de criar metodos que vao realizar a interaçao do formulario de AVALIAÇAO com o
 banco de dados, criando metos que iram dar aos botoes SALVAr, EXCLUIR, PESQUISAR e EDITAR seus 
 respequitivos codigos executando essas funçoes diretamente no banco.
 */

package modeloDao;

import java.sql.*;
import modeloBeans.BeansAvalia;
import modeloConection.ConexaoBD;
import javax.swing.JOptionPane;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;


public class DaoAvalia {
    ConexaoBD conex = new ConexaoBD(); // conexão com o Banco de Dados
    ConexaoBD conexaoTipo = new ConexaoBD();
    String tipo;
    String data_banco;
    Date data_inicial;
    String nota_banco;
    
    BeansAvalia mod = new BeansAvalia(); // Conexão com a Classe que recebe os atributos de Avaliaçao
    int tipo_cod;
    
    public void buscaTipocod (String tipo) {
        conex.conecxao();
        
        conex.executaSql("select * from tipo_ava where DESC_TIPO='"+tipo+"'");
        try {
            conex.rs.first();
            tipo_cod = conex.rs.getInt("ID_TIPO");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Tipo");
        }
        conex.desconectar();
    }
  
    // Metodo que que salva no Banco as informações de cadastro de um Avaliaçao
    public void Salvar (BeansAvalia mod) {
        buscaTipocod(mod.getAva_tipo());
        ConvNota(mod.getAva_nota());
        conex.conecxao();
        try {
            PreparedStatement pst = conex.con.prepareStatement ("insert into avalia(COD_AVA,DATA_INI,DATA_FIM,VALOR_AVA,TIPO_AVA_ID_TIPO) values (?,?,?,?,?);"); 
            pst.setString(1 , mod.getAva_cod());
            ConvBanco(mod.getDate_ini());
            pst.setString(2, data_banco);
            ConvBanco(mod.getDate_fim());
            pst.setString(3, data_banco);
            pst.setString(4, nota_banco);
            pst.setInt(5, tipo_cod);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Avaliaçao Inserida Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir dados de Avaliaçao!/nErro:");
        }
  
        conex.desconectar();
    }
    
    // Metodo que que salva no Banco as informações alteradas de um Avaliaçao
    public void Editar (BeansAvalia mod) {
        buscaTipocod(mod.getAva_tipo());
        ConvNota(mod.getAva_nota());
        conex.conecxao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update avalia set DATA_INI=?,DATA_FIM=?,VALOR_AVA=?,TIPO_AVA_ID_TIPO=? where COD_AVA=?;");
            ConvBanco(mod.getDate_ini());
            pst.setString(1, data_banco);
            ConvBanco(mod.getDate_fim());
            pst.setString(2, data_banco);
            pst.setString(3, nota_banco);
            pst.setInt(4, tipo_cod);
            pst.setString(5, mod.getAva_cod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Avaliaçao Alterados Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar dados de Avaliaçao!/nErro:");
        }
        
        conex.desconectar();
        
    }
    
    // Metodo que que exclui no Banco as informações de um Avaliaçao
    public void Excluir (BeansAvalia mod) {
        conex.conecxao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from avalia where COD_AVA=?;"); 
            pst.setString(1, mod.getAva_cod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Avaliaçao Excluidos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir dados de Avaliaçao!/nErro:");
        }
        
        conex.desconectar();     
    }
    
    // Metodo que que realiza a busca de um Avaliaçao no banco
    public BeansAvalia buscaBeansAvalia (BeansAvalia mod) {
        conex.conecxao();
        try {
            conex.executaSql("select * from avalia where COD_AVA like'%"+mod.getAva_pesquisa()+"%'"); // executa a pesquisa referente ao metodo de Execução da classe ConexãoBD
            conex.rs.first(); //Recebe o resultado da pesquisa
            
            buscaTipo(conex.rs.getInt("TIPO_AVA_ID_TIPO"));
            mod.setAva_cod(conex.rs.getString("COD_AVA"));
            ConvData(conex.rs.getString("DATA_INI"));
            mod.setDate_ini(data_banco);
            ConvData(conex.rs.getString("DATA_FIM"));
            mod.setDate_fim(data_banco);
            ConvNota2(conex.rs.getString("VALOR_AVA"));
            mod.setAva_nota(nota_banco);
            mod.setAva_tipo(tipo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Avaliação nao Cadastrada.");
        }
        conex.desconectar();
        return mod;
    }
    
    public void buscaTipo (int cod) {
        conexaoTipo.conecxao();
        
        try {
            conexaoTipo.executaSql("select*from tipo_ava where ID_TIPO="+cod+";");
            conexaoTipo.rs.first();
            tipo = conexaoTipo.rs.getString("DESC_TIPO");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Tipo");
        }
        
        conexaoTipo.desconectar();
    }
    
    //Metodo responsavel em converter a data para formato recebido do banco para o Brasileiro
    public void ConvData (String data) {

        try {
            data_inicial = new SimpleDateFormat("yyyy-MM-dd").parse(data);
            data_banco = new SimpleDateFormat("dd/MM/yyyy").format(data_inicial);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }
 
    }

    //Metodo responsavel em converter a data para formato enviado do banco para o Americano
    public void ConvBanco (String data) {
        try {
            data_inicial = new SimpleDateFormat("dd/MM/yyyy").parse(data);
            data_banco = new SimpleDateFormat("yyyy-MM-dd").format(data_inicial);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }
    }
    
    //Metodo responsavel em converter a nota para formato enviado do banco para o Americano
    public void ConvNota (String nota_inicial) {
        nota_banco = nota_inicial.replaceAll(",", ".");
        //nota_banco = Double.parseDouble(nota_inicial);
        
    }
    
    //Metodo responsavel em converter a nota para formato recebido do banco para o Brasileiro
    public void ConvNota2 (String nota_inicial) {
        nota_banco = nota_inicial.replaceAll("\\.", ",");
        //nota_banco = Double.parseDouble(nota_inicial);
        
    }
}
