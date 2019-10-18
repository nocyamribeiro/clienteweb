/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clienteweb;

import br.com.publicacaoweb.Publicacao;
import br.com.publicacaoweb.RetornarPublicacao_Service;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author maycon
 */
@Named(value = "publicacaoMB")
@ViewScoped
public class PublicacaoMB implements Serializable {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/PublicacaoServico/RetornarPublicacao.wsdl")
    private RetornarPublicacao_Service service;
    
    private List<Publicacao> publicacoes;
    
    private Integer codigo = null;
    private String titulo = null;
    private Integer paginaInicial = null;
    private Integer paginaFinal = null;
    private Integer anoPublicacao = null;
    /**
     * Creates a new instance of PublicacaoMB
     */
    public PublicacaoMB() {
    }
    
    @PostConstruct
    public void init() {
               
        try {             
            pesquisar();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }

    public void pesquisar() {
        // Call Web Service Operation
        br.com.publicacaoweb.RetornarPublicacao port = service.getRetornarPublicacaoPort();
        // TODO initialize WS operation arguments here
        
        // TODO process result here
        publicacoes = port.pesquisa(codigo, titulo, paginaInicial, paginaFinal, anoPublicacao);
    }

    public List<Publicacao> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(List<Publicacao> publicacoes) {
        this.publicacoes = publicacoes;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getPaginaInicial() {
        return paginaInicial;
    }

    public void setPaginaInicial(Integer paginaInicial) {
        this.paginaInicial = paginaInicial;
    }

    public Integer getPaginaFinal() {
        return paginaFinal;
    }

    public void setPaginaFinal(Integer paginaFinal) {
        this.paginaFinal = paginaFinal;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
    
    
}
