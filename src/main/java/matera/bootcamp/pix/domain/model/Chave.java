package matera.bootcamp.pix.domain.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Chave {
	
	@Id
	private Long id;
	
	@Column(nullable = false)
	private Long agencia;
	
	@Column(precision = 10, scale = 2, nullable = false)
	private BigDecimal valor;
	
	/*
	 * ManyToOne: por padr�o os que terminam em "...ToOne", 
	 *            j� carregam as informa��es da Conta Corrente, 
	 *            pois � s� uma para cada registro Chave (fetch = EAGER)
	 *   
	 * OneToMany: por padr�o os que terminam em "...ToMany", 
	 *            ir�o buscar a Conta Corrente apenas quando 
	 *            for feito um get nesse atributo (fetch = LAZY).
	 */
	@ManyToOne(optional = false)
	private ContaCorrente contaCorrente;
}
