/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author GustavoSantos
 */
@Entity
@Table(name = "MENSAGENS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mensagens.findAll", query = "SELECT m FROM Mensagens m")
    , @NamedQuery(name = "Mensagens.findById", query = "SELECT m FROM Mensagens m WHERE m.id = :id")
    , @NamedQuery(name = "Mensagens.findByNome", query = "SELECT m FROM Mensagens m WHERE m.nome = :nome")
    , @NamedQuery(name = "Mensagens.findByContato", query = "SELECT m FROM Mensagens m WHERE m.contato = :contato")
    , @NamedQuery(name = "Mensagens.findByMensagem", query = "SELECT m FROM Mensagens m WHERE m.mensagem = :mensagem")})
public class Mensagens implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "NOME", nullable = false, length = 200)
    private String nome;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "CONTATO", nullable = false, length = 100)
    private String contato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "MENSAGEM", nullable = false, length = 500)
    private String mensagem;

    public Mensagens() {
    }

    public Mensagens(Integer id) {
        this.id = id;
    }

    public Mensagens(Integer id, String nome, String contato, String mensagem) {
        this.id = id;
        this.nome = nome;
        this.contato = contato;
        this.mensagem = mensagem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mensagens)) {
            return false;
        }
        Mensagens other = (Mensagens) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pacote.Mensagens[ id=" + id + " ]";
    }
    
}
