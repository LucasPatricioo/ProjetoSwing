/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoaula.Model;

/**
 *
 * @author lucas
 */
public class projeto {
    private int idProjeto;
    private String nomeProjeto;
    private String descProjeto;
    private int idProprietario;
    private String nomeProprietario;

    public projeto(int idProjeto, String nomeProjeto, String descProjeto, int idProprietario) {
        this.idProjeto = idProjeto;
        this.nomeProjeto = nomeProjeto;
        this.descProjeto = descProjeto;
        this.idProprietario = idProprietario;
    }

    public projeto(String nomeProjeto, String descProjeto, int idProprietario) {
        this.nomeProjeto = nomeProjeto;
        this.descProjeto = descProjeto;
        this.idProprietario = idProprietario;
    }
    public projeto(int idProjeto, String nomeProjeto, String descProjeto, int idProprietario, String nomeUser) {
        this.idProjeto = idProjeto;
        this.nomeProjeto = nomeProjeto;
        this.descProjeto = descProjeto;
        this.idProprietario = idProprietario;
        this.nomeProprietario = nomeUser;

    }

    public projeto() {
    }

    public int getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getDescProjeto() {
        return descProjeto;
    }

    public void setDescProjeto(String descProjeto) {
        this.descProjeto = descProjeto;
    }

    public int getIdProprietario() {
        return idProprietario;
    }

    public void setIdProprietario(int idProprietario) {
        this.idProprietario = idProprietario;
    }
    
    public String getNomeUser() {
        return nomeProprietario;
    }

    public void setNomeUser(String nomeUsuario) {
        this.nomeProprietario = nomeUsuario;
    }
    
}
