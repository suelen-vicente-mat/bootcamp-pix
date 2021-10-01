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
	 * O RequiredArgsConstructor irá criar um construtor pelo lombok com esse parâmetro incluso.
	 * É o jeito mais limpo de fazer a injeção de dependência. Equivale à criação do construtor.
	 */
//	 private final ContaCorrenteService contaCorrenteService;
	
	
	/*
	 * MODO-2
	 * Esse é o segundo modo mais indicado (caso não queira usar lombok)
	 * A injeção é feita pelo @Autowired, controlada pelo Spring
	 */
//	 @Autowired
//	 private ContaCorrenteService contaCorrenteService;
	
	
	/*
	 * MODO-3
	 * Pode-se definir no construtor. Desse modo o Spring consegue se virar para 
	 * passar esse parâmetro.
	 */
//	 private ContaCorrenteService contaCorrenteService;
//	 
//	 public ExemplosInjecaoController(ContaCorrenteService contaCorrenteService) {
//		this.contaCorrenteService = contaCorrenteService;
//	}
	 
	
	/*
	 * MODO-4
	 * Esse é o menos indicado, mas fica aqui para conhecimento.
	 */
//	private ContaCorrenteService contaCorrenteService;
//
//	@Autowired
//	public void setContaCorrenteService(ContaCorrenteService contaCorrenteService) {
//		this.contaCorrenteService = contaCorrenteService;
//	}
	
	

}
