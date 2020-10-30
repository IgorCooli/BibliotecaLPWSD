package br.cesjf.bibliotecalpwsd.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Emprestimo.class)
public abstract class Emprestimo_ {

	public static volatile SingularAttribute<Emprestimo, Date> dataDevolucaoPrevista;
	public static volatile SingularAttribute<Emprestimo, Date> dataEmprestimo;
	public static volatile SingularAttribute<Emprestimo, Exemplar> idExemplar;
	public static volatile SingularAttribute<Emprestimo, Usuario> idUsuario;
	public static volatile SingularAttribute<Emprestimo, Long> id;
	public static volatile SingularAttribute<Emprestimo, Date> dataDevolucao;

	public static final String DATA_DEVOLUCAO_PREVISTA = "dataDevolucaoPrevista";
	public static final String DATA_EMPRESTIMO = "dataEmprestimo";
	public static final String ID_EXEMPLAR = "idExemplar";
	public static final String ID_USUARIO = "idUsuario";
	public static final String ID = "id";
	public static final String DATA_DEVOLUCAO = "dataDevolucao";

}

