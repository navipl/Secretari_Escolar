/*
 Esta clase esta recebendo todos os atributos de Professor e fazendo os getesrs e seters de cada parametro
 */

package modeloBeans;


/**
*Cria e atribui a classe Professor
*/
public class BeansProfessor {
    private int prof_cod;
    private String prof_nome;
    private String prof_form;
    private String tipo_form;
    private String prof_pesquisa; 
    private String prof_tel; 
    private String prof_cel;
    private String prof_data;

    public int getProf_cod() {
        return prof_cod;
    }

    public void setProf_cod(int prof_cod) {
        this.prof_cod = prof_cod;
    }

    public String getProf_nome() {
        return prof_nome;
    }

    public void setProf_nome(String prof_nome) {
        this.prof_nome = prof_nome;
    }

    public String getProf_form() {
        return prof_form;
    }

    public void setProf_form(String prof_form) {
        this.prof_form = prof_form;
    }

    public String getTipo_form() {
        return tipo_form;
    }

    public void setTipo_form(String tipo_form) {
        this.tipo_form = tipo_form;
    }


    public String getProf_pesquisa() {
        return prof_pesquisa;
    }

    public void setProf_pesquisa(String prof_pesquisa) {
        this.prof_pesquisa = prof_pesquisa;
    }

    public String getProf_tel() {
        return prof_tel;
    }

    public void setProf_tel(String prof_tel) {
        this.prof_tel = prof_tel;
    }

    public String getProf_cel() {
        return prof_cel;
    }

    public void setProf_cel(String prof_cel) {
        this.prof_cel = prof_cel;
    }

    public String getProf_data() {
        return prof_data;
    }

    public void setProf_data(String prof_data) {
        this.prof_data = prof_data;
    }
    
}
