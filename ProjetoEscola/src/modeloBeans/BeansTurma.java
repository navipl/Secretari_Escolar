/*
 Esta clase esta recebendo todos os atributos de Turma e fazendo os getesrs e seters de cada parametro
 */

package modeloBeans;

/**
 *
 * @author Ivan
 */
public class BeansTurma {
    private String tur_cod;
    private String tur_nome;
    private String tur_pesquisa;

    public String getTur_cod() {
        return tur_cod;
    }

    public void setTur_cod(String tur_cod) {
        this.tur_cod = tur_cod;
    }

    public String getTur_nome() {
        return tur_nome;
    }

    public void setTur_nome(String tur_nome) {
        this.tur_nome = tur_nome;
    }

    public String getTur_pesquisa() {
        return tur_pesquisa;
    }

    public void setTur_pesquisa(String tur_pesquisa) {
        this.tur_pesquisa = tur_pesquisa;
    }
    
}
