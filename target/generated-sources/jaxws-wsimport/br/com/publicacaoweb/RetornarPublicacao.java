
package br.com.publicacaoweb;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RetornarPublicacao", targetNamespace = "http://publicacaoweb.com.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RetornarPublicacao {


    /**
     * 
     * @param codigo
     * @param anoPublicacao
     * @param paginaFinal
     * @param titulo
     * @param paginaInicial
     * @return
     *     returns java.util.List<br.com.publicacaoweb.Publicacao>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "pesquisa", targetNamespace = "http://publicacaoweb.com.br/", className = "br.com.publicacaoweb.Pesquisa")
    @ResponseWrapper(localName = "pesquisaResponse", targetNamespace = "http://publicacaoweb.com.br/", className = "br.com.publicacaoweb.PesquisaResponse")
    @Action(input = "http://publicacaoweb.com.br/RetornarPublicacao/pesquisaRequest", output = "http://publicacaoweb.com.br/RetornarPublicacao/pesquisaResponse")
    public List<Publicacao> pesquisa(
        @WebParam(name = "codigo", targetNamespace = "")
        Integer codigo,
        @WebParam(name = "titulo", targetNamespace = "")
        String titulo,
        @WebParam(name = "paginaInicial", targetNamespace = "")
        Integer paginaInicial,
        @WebParam(name = "paginaFinal", targetNamespace = "")
        Integer paginaFinal,
        @WebParam(name = "anoPublicacao", targetNamespace = "")
        Integer anoPublicacao);

}
