package br.cesjf.bibliotecalpwsd.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Reserva.class)
public abstract class Reserva_ {

	public static volatile SingularAttribute<Reserva, Date> dataDevolucaoPrevista;
	public static volatile SingularAttribute<Reserva, Boolean> cancelada;
	public static volatile SingularAttribute<Reserva, Date> dataReserva;
	public static volatile SingularAttribute<Reserva, String> obsCancelamento;
	public static volatile SingularAttribute<Reserva, Emprestimo> idEmprestimo;
	public static volatile SingularAttribute<Reserva, Exemplar> idExemplar;
	public static volatile SingularAttribute<Reserva, Usuario> idUsuario;
	public static volatile SingularAttribute<Reserva, Long> id;

	public static final String DATA_DEVOLUCAO_PREVISTA = "dataDevolucaoPrevista";
	public static final String CANCELADA = "cancelada";
	public static final String DATA_RESERVA = "dataReserva";
	public static final String OBS_CANCELAMENTO = "obsCancelamento";
	public static final String ID_EMPRESTIMO = "idEmprestimo";
	public static final String ID_EXEMPLAR = "idExemplar";
	public static final String ID_USUARIO = "idUsuario";
	public static final String ID = "id";

}

