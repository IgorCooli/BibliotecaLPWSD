package br.cesjf.bibliotecalpwsd.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Assunto.class)
public abstract class Assunto_ {

	public static volatile SingularAttribute<Assunto, String> assunto;
	public static volatile ListAttribute<Assunto, Livro> livroList;
	public static volatile SingularAttribute<Assunto, Long> id;

	public static final String ASSUNTO = "assunto";
	public static final String LIVRO_LIST = "livroList";
	public static final String ID = "id";

}

