package br.cesjf.bibliotecalpwsd.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Exemplar.class)
public abstract class Exemplar_ {

	public static volatile ListAttribute<Exemplar, Emprestimo> emprestimoList;
	public static volatile ListAttribute<Exemplar, Reserva> reservaList;
	public static volatile SingularAttribute<Exemplar, Livro> idLivro;
	public static volatile SingularAttribute<Exemplar, Boolean> circular;
	public static volatile SingularAttribute<Exemplar, Long> id;

	public static final String EMPRESTIMO_LIST = "emprestimoList";
	public static final String RESERVA_LIST = "reservaList";
	public static final String ID_LIVRO = "idLivro";
	public static final String CIRCULAR = "circular";
	public static final String ID = "id";

}

