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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "LIVROS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Livros.findAll", query = "SELECT l FROM Livros l")
    , @NamedQuery(name = "Livros.findById", query = "SELECT l FROM Livros l WHERE l.id = :id")
    , @NamedQuery(name = "Livros.findByNome", query = "SELECT l FROM Livros l WHERE l.nome = :nome")
    , @NamedQuery(name = "Livros.findByNumPaginas", query = "SELECT l FROM Livros l WHERE l.numPaginas = :numPaginas")
    , @NamedQuery(name = "Livros.findByIsbn", query = "SELECT l FROM Livros l WHERE l.isbn = :isbn")
    , @NamedQuery(name = "Livros.findByFoto", query = "SELECT l FROM Livros l WHERE l.foto = :foto")})
public class Livros implements Serializable {

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
    @Column(name = "NUM_PAGINAS", nullable = false)
    private int numPaginas;
    @Size(max = 50)
    @Column(name = "ISBN", length = 50)
    private String isbn;
    @Size(max = 100)
    @Column(name = "FOTO", length = 100)
    private String foto;
    @JoinColumn(name = "ID_AUTOR", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private Autores idAutor;

    public Livros() {
    }

    public Livros(Integer id) {
        this.id = id;
    }

    public Livros(Integer id, String nome, int numPaginas) {
        this.id = id;
        this.nome = nome;
        this.numPaginas = numPaginas;
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

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Autores getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Autores idAutor) {
        this.idAutor = idAutor;
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
        if (!(object instanceof Livros)) {
            return false;
        }
        Livros other = (Livros) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pacote.Livros[ id=" + id + " ]";
    }
    
}
