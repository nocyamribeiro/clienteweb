
package br.com.publicacaoweb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.publicacaoweb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PesquisaResponse_QNAME = new QName("http://publicacaoweb.com.br/", "pesquisaResponse");
    private final static QName _Pesquisa_QNAME = new QName("http://publicacaoweb.com.br/", "pesquisa");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.publicacaoweb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Pesquisa }
     * 
     */
    public Pesquisa createPesquisa() {
        return new Pesquisa();
    }

    /**
     * Create an instance of {@link PesquisaResponse }
     * 
     */
    public PesquisaResponse createPesquisaResponse() {
        return new PesquisaResponse();
    }

    /**
     * Create an instance of {@link Publicacao }
     * 
     */
    public Publicacao createPublicacao() {
        return new Publicacao();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://publicacaoweb.com.br/", name = "pesquisaResponse")
    public JAXBElement<PesquisaResponse> createPesquisaResponse(PesquisaResponse value) {
        return new JAXBElement<PesquisaResponse>(_PesquisaResponse_QNAME, PesquisaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pesquisa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://publicacaoweb.com.br/", name = "pesquisa")
    public JAXBElement<Pesquisa> createPesquisa(Pesquisa value) {
        return new JAXBElement<Pesquisa>(_Pesquisa_QNAME, Pesquisa.class, null, value);
    }

}
