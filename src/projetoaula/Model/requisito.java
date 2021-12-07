/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoaula.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author lucas
 */
public class requisito {
    private int idRequisito;
    private String nome;
    private String modulo;
    private String funcionalidade;
    private Date dataCriacao;
    private Date ultimaMod;
    private String ultimaModAut;
    private String versao;
    private String prioridade;
    private String complexibilidade;
    private String esfEstimado;
    private String estado;
    private String fase;
    private String descricao;
    private int idProjeto;
    private int idUsuario;
    private String autor;
    private String nomeUsuario;

    public requisito(int idRequisito, String nome, String modulo, String funcionalidade, Date dataCriacao, Date ultimaMod, String ultimaModAut, String versao, String prioridade, String complexibilidade, String esfEstimado, String estado, String fase, String descricao, int idProjeto, int idUsuario, String autor) {
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
        this.idUsuario = idUsuario;
        this.autor = autor;
    }

    public requisito(String nome, String modulo, String funcionalidade, Date dataCriacao, Date ultimaMod, String ultimaModAut, String versao, String prioridade, String complexibilidade, String esfEstimado, String estado, String fase, String descricao, int idProjeto, int idUsuario, String autor) {
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
        this.idUsuario = idUsuario;
        this.autor = autor;
    }
    
    public requisito(int idRequisito, String nome, String modulo, String funcionalidade, Date dataCriacao, Date ultimaMod, String ultimaModAut, String versao, String prioridade, String complexibilidade, String esfEstimado, String estado, String fase, String descricao, int idProjeto, int idUsuario) {
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
        this.idUsuario = idUsuario;
    }

    public requisito(String nome, String modulo, String funcionalidade, Date ultimaMod, String ultimaModAut, String versao, String prioridade, String complexibilidade, String esfEstimado, String estado, String fase, String descricao) {
        this.nome = nome;
        this.modulo = modulo;
        this.funcionalidade = funcionalidade;
        this.ultimaMod = ultimaMod;
        this.ultimaModAut = ultimaModAut;
        this.versao = versao;
        this.prioridade = prioridade;
        this.complexibilidade = complexibilidade;
        this.esfEstimado = esfEstimado;
        this.estado = estado;
        this.fase = fase;
        this.descricao = descricao;
    }
    

    public requisito() {
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
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

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getUltimaMod() {
        return ultimaMod;
    }

    public void setUltimaMod(Date ultimaMod) {
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
