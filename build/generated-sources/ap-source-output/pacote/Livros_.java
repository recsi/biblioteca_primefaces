package pacote;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pacote.Autores;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-07T23:25:27")
@StaticMetamodel(Livros.class)
public class Livros_ { 

    public static volatile SingularAttribute<Livros, String> foto;
    public static volatile SingularAttribute<Livros, Autores> idAutor;
    public static volatile SingularAttribute<Livros, String> isbn;
    public static volatile SingularAttribute<Livros, String> nome;
    public static volatile SingularAttribute<Livros, Integer> id;
    public static volatile SingularAttribute<Livros, Integer> numPaginas;

}