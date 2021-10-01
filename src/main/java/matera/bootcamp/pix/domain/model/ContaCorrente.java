package matera.bootcamp.pix.domain.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
public class ContaCorrente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private Long agencia;
	
	@Column(nullable = false)
	private Long conta;
	
	@Column(precision = 10, scale = 2, nullable = false)
	private BigDecimal saldo;

	/*
	 * O mappedBy � usado para definir "v�nculos ao contr�rio", mas desse modo, ele n�o vai criar 
	 * uma FK nessa tabela. 
	 * 
	 * O Hibernate entende que o "dono" do relacionamento � o Usuario, pois
	 * ele � a rela��o forte. O mappedBy � usado para quando precisamos acessar essa informa��o a
	 * partir da classe ContaCorrente, mas n�o queremos de fato criar uma FK no banco. 
	 * 
	 * No parametro string informado, deve-se passar o nome do atributo com o qual a rela��o deve
	 * ser feita na classe Usuario.
	 */
	@OneToOne(mappedBy = "contaCorrente")
	@JsonIgnore
	private Usuario usuario;
}
