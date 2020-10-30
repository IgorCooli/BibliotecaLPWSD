package br.cesjf.bibliotecalpwsd.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Usuario.class)
public abstract class Usuario_ {

	public static volatile SingularAttribute<Usuario, String> senha;
	public static volatile SingularAttribute<Usuario, String> tipo;
	public static volatile ListAttribute<Usuario, Emprestimo> emprestimoList;
	public static volatile ListAttribute<Usuario, Reserva> reservaList;
	public static volatile SingularAttribute<Usuario, String> nome;
	public static volatile SingularAttribute<Usuario, String> usuario;
	public static volatile SingularAttribute<Usuario, Long> id;
	public static volatile SingularAttribute<Usuario, String> email;

	public static final String SENHA = "senha";
	public static final String TIPO = "tipo";
	public static final String EMPRESTIMO_LIST = "emprestimoList";
	public static final String RESERVA_LIST = "reservaList";
	public static final String NOME = "nome";
	public static final String USUARIO = "usuario";
	public static final String ID = "id";
	public static final String EMAIL = "email";

}

