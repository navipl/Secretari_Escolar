/*
 Esta clase esta recebendo todos os atributos de Avaliaçao e fazendo os getesrs e seters de cada parametro
 */

package modeloBeans;

/**
 *
 * @author Ivan
 */
public class BeansAvalia {
    
    private String ava_cod;
    private String date_ini;
    private String date_fim;
    private String ava_nota;
    private String ava_tipo;
    private String ava_pesquisa;

    public String getAva_cod() {
        return ava_cod;
    }

    public void setAva_cod(String ava_cod) {
        this.ava_cod = ava_cod;
    }

    public String getDate_ini() {
        return date_ini;
    }

    public void setDate_ini(String date_ini) {
        this.date_ini = date_ini;
    }

    public String getDate_fim() {
        return date_fim;
    }

    public void setDate_fim(String date_fim) {
        this.date_fim = date_fim;
    }

    public String getAva_nota() {
        return ava_nota;
    }

    public void setAva_nota(String ava_nota) {
        this.ava_nota = ava_nota;
    }

    public String getAva_tipo() {
        return ava_tipo;
    }

    public void setAva_tipo(String ava_tipo) {
        this.ava_tipo = ava_tipo;
    }

    public String getAva_pesquisa() {
        return ava_pesquisa;
    }

    public void setAva_pesquisa(String ava_pesquisa) {
        this.ava_pesquisa = ava_pesquisa;
    }
 
}
