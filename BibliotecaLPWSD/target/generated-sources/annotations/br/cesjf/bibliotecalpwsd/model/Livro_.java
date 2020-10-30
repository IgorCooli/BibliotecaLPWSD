package br.cesjf.bibliotecalpwsd.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Livro.class)
public abstract class Livro_ {

	public static volatile SingularAttribute<Livro, String> capa;
	public static volatile SingularAttribute<Livro, Integer> ano;
	public static volatile SingularAttribute<Livro, String> isbn;
	public static volatile SingularAttribute<Livro, String> titulo;
	public static volatile SingularAttribute<Livro, String> arquivo;
	public static volatile ListAttribute<Livro, Exemplar> exemplarList;
	public static volatile SingularAttribute<Livro, Long> id;
	public static volatile SingularAttribute<Livro, Integer> edicao;
	public static volatile SingularAttribute<Livro, Editora> idEditora;
	public static volatile ListAttribute<Livro, Assunto> assuntoList;
	public static volatile ListAttribute<Livro, Autor> autorList;

	public static final String CAPA = "capa";
	public static final String ANO = "ano";
	public static final String ISBN = "isbn";
	public static final String TITULO = "titulo";
	public static final String ARQUIVO = "arquivo";
	public static final String EXEMPLAR_LIST = "exemplarList";
	public static final String ID = "id";
	public static final String EDICAO = "edicao";
	public static final String ID_EDITORA = "idEditora";
	public static final String ASSUNTO_LIST = "assuntoList";
	public static final String AUTOR_LIST = "autorList";

}

