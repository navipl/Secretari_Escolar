/*
 Esta clase cria os metodos de alinhamento e configuraçoes das tabelas que seram utilizados 
 nos formularios, que estaram exibindo os dados armazenados no banco de dados.
 */

package modeloBeans;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *Cria e atribui a Classe Tabela com sua funcionalidades e metodos 
 * que são usados em todos os formularios
 */
public class ModeloTabela extends AbstractTableModel {
    
    private ArrayList linhas =null;
    private String[] colunas = null;
    
    
    
    public ModeloTabela(ArrayList lin, String[] col){
        setLinhas(lin);
        setColuna(col);
    }

    /**
     * @return the linhas
     */
    public ArrayList getLinhas() {
        return linhas;
    }

    /**
     * @param linhas the linhas to set
     */
    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    /**
     * @return the coluna
     */
    public String[] getColuna() {
        return colunas;
    }

    /**
     * @param coluna the coluna to set
     */
    public void setColuna(String[] coluna) {
        this.colunas = coluna;
    }
    
    public int getColumnCount() {
        return colunas.length;
    }
    
    public int getRowCount() {
        return linhas.size();
    }
    
    public String getColumnName (int numCol) {
        return colunas[numCol];
    }
    
    public Object getValueAt (int numLin, int numCol) {
        Object[] linha = (Object[]) getLinhas(). get(numLin);
        return linha[numCol];
    }
        
    }
     
