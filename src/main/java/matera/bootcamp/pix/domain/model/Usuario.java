package matera.bootcamp.pix.domain.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String sobrenome;
	
	/*
	 * Pra nossa api de inclusao de usuario, precisamos declarar o cascase.
	 * Esse parâmetro vai fazer com que o objeto Conta Corrente no banco de dados
	 * seja atualizado junto com o Usuario. Como estamos informando o JSON de 
	 * conta na api de usuario, precisamos desse parâmetro.
	 */
	@OneToOne(optional = false, cascade = CascadeType.ALL)
	private ContaCorrente contaCorrente;

}
