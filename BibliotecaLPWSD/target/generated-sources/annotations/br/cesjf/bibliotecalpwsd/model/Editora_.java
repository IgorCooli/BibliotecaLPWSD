package br.cesjf.bibliotecalpwsd.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Editora.class)
public abstract class Editora_ {

	public static volatile ListAttribute<Editora, Livro> livroList;
	public static volatile SingularAttribute<Editora, String> nome;
	public static volatile SingularAttribute<Editora, Long> id;

	public static final String LIVRO_LIST = "livroList";
	public static final String NOME = "nome";
	public static final String ID = "id";

}

