package matera.bootcamp.pix.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import matera.bootcamp.pix.service.contaCorrente.ContaCorrenteService;

@RestController
//@RequiredArgsConstructor // Usada apenas no MODO-1
public class ExemplosInjecaoController {
	
	/* 
	 * MODO-1
	 * O RequiredArgsConstructor ir� criar um construtor pelo lombok com esse par�metro incluso.
	 * � o jeito mais limpo de fazer a inje��o de depend�ncia. Equivale � cria��o do construtor.
	 */
//	 private final ContaCorrenteService contaCorrenteService;
	
	
	/*
	 * MODO-2
	 * Esse � o segundo modo mais indicado (caso n�o queira usar lombok)
	 * A inje��o � feita pelo @Autowired, controlada pelo Spring
	 */
//	 @Autowired
//	 private ContaCorrenteService contaCorrenteService;
	
	
	/*
	 * MODO-3
	 * Pode-se definir no construtor. Desse modo o Spring consegue se virar para 
	 * passar esse par�metro.
	 */
//	 private ContaCorrenteService contaCorrenteService;
//	 
//	 public ExemplosInjecaoController(ContaCorrenteService contaCorrenteService) {
//		this.contaCorrenteService = contaCorrenteService;
//	}
	 
	
	/*
	 * MODO-4
	 * Esse � o menos indicado, mas fica aqui para conhecimento.
	 */
//	private ContaCorrenteService contaCorrenteService;
//
//	@Autowired
//	public void setContaCorrenteService(ContaCorrenteService contaCorrenteService) {
//		this.contaCorrenteService = contaCorrenteService;
//	}
	
	

}
