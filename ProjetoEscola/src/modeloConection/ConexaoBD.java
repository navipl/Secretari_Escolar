/*
 Esta clase efetua a conexao com o banco de dados, e cria metodos de conexao com o banco,
 desconexao com o banco e busca retornando os valores armazenados no mesmo.
 */

package modeloConection;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexaoBD {
    
    public Statement stm; //Preparar e realizar Pesquisas
    public ResultSet rs; //Quardar a Pesquisa so "stm"
    private final String driver = "com.mysql.jdbc.Driver"; //Driver do MySQL
    private final String caminho = "jdbc:mysql://localhost:3306/projeto_escola"; //Caminho do BD
    private final String user = "root"; //Usuario do BD
    private final String senha = "root"; //Senha do BD
    public Connection con; //Variavel de Conexao           

    
    //Metodo Responsavel de efetuar a conexao com o BD 
    public void conecxao() {
        try {
            System.setProperty ("jdbc.Drivers", driver);
            con = DriverManager.getConnection(caminho,user,senha);
          // JOptionPane.showMessageDialog(null, "Conexão com o BD Efetuada com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de Conexão com o BD:\n"+ex.getMessage());
        }
}
    //Metodo Responsavel em se conectar com o banco e armazenar um resultado de alguma Pesquisa
    public void executaSql (String sql) {
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql); //Variavel que armazena o resultado que foi pesquisado, para ser comparado ou utilizado em algum metodo
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ExecutaSql:\n"+ex.getMessage());
        }
    }
    
    //Metodo Responsavel de desconectar com o BD 
    public void desconectar() {
        try {
            con.close();
          // JOptionPane.showMessageDialog(null, "BD Desconectado com Sucessso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar com o BD:\n"+ex.getMessage());
        }
            
        }
    }
    
    



