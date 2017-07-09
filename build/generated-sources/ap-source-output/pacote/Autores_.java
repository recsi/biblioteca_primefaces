package pacote;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pacote.Livros;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-09T13:33:16")
@StaticMetamodel(Autores.class)
public class Autores_ { 

    public static volatile SingularAttribute<Autores, String> foto;
    public static volatile SingularAttribute<Autores, String> nome;
    public static volatile SingularAttribute<Autores, Integer> id;
    public static volatile CollectionAttribute<Autores, Livros> livrosCollection;

}