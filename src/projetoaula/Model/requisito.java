/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoaula.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author lucas
 */
public class requisito {
    private int idRequisito;
    private String nome;
    private String modulo;
    private String funcionalidade;
    private LocalDate dataCriacao;
    private LocalDateTime ultimaMod;
    private String ultimaModAut;
    private String versao;
    private String prioridade;
    private String complexibilidade;
    private String esfEstimado;
    private String estado;
    private String fase;
    private String descricao;
    private int idProjeto;

    public requisito(int idRequisito, String nome, String modulo, String funcionalidade, LocalDate dataCriacao, LocalDateTime ultimaMod, String ultimaModAut, String versao, String prioridade, String complexibilidade, String esfEstimado, String estado, String fase, String descricao, int idProjeto) {
        this.idRequisito = idRequisito;
        this.nome = nome;
        this.modulo = modulo;
        this.funcionalidade = funcionalidade;
        this.dataCriacao = dataCriacao;
        this.ultimaMod = ultimaMod;
        this.ultimaModAut = ultimaModAut;
        this.versao = versao;
        this.prioridade = prioridade;
        this.complexibilidade = complexibilidade;
        this.esfEstimado = esfEstimado;
        this.estado = estado;
        this.fase = fase;
        this.descricao = descricao;
        this.idProjeto = idProjeto;
    }

    public requisito(String nome, String modulo, String funcionalidade, LocalDate dataCriacao, LocalDateTime ultimaMod, String ultimaModAut, String versao, String prioridade, String complexibilidade, String esfEstimado, String estado, String fase, String descricao, int idProjeto) {
        this.nome = nome;
        this.modulo = modulo;
        this.funcionalidade = funcionalidade;
        this.dataCriacao = dataCriacao;
        this.ultimaMod = ultimaMod;
        this.ultimaModAut = ultimaModAut;
        this.versao = versao;
        this.prioridade = prioridade;
        this.complexibilidade = complexibilidade;
        this.esfEstimado = esfEstimado;
        this.estado = estado;
        this.fase = fase;
        this.descricao = descricao;
        this.idProjeto = idProjeto;
    }

    public requisito() {
    }

    
    public int getIdRequisito() {
        return idRequisito;
    }

    public void setIdRequisito(int idRequisito) {
        this.idRequisito = idRequisito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getFuncionalidade() {
        return funcionalidade;
    }

    public void setFuncionalidade(String funcionalidade) {
        this.funcionalidade = funcionalidade;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getUltimaMod() {
        return ultimaMod;
    }

    public void setUltimaMod(LocalDateTime ultimaMod) {
        this.ultimaMod = ultimaMod;
    }

    public String getUltimaModAut() {
        return ultimaModAut;
    }

    public void setUltimaModAut(String ultimaModAut) {
        this.ultimaModAut = ultimaModAut;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getComplexibilidade() {
        return complexibilidade;
    }

    public void setComplexibilidade(String complexibilidade) {
        this.complexibilidade = complexibilidade;
    }

    public String getEsfEstimado() {
        return esfEstimado;
    }

    public void setEsfEstimado(String esfEstimado) {
        this.esfEstimado = esfEstimado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
    }
    
    
    
    
    
}
