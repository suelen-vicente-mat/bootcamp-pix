package matera.bootcamp.pix.rest.usuario;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.var;
import matera.bootcamp.pix.domain.model.Usuario;
import matera.bootcamp.pix.service.UsuarioCrudService;

@RestController
@RequiredArgsConstructor
public class UsuarioCrudApiController {
	
	private final UsuarioCrudService usuariocrudService;
	
	/*
	 * O HttpServletRequest e HttpServletResponse são injetados automaticamente pelo Spring.
	 * Esses dois parâmetros não são obrigatórios.
	 *
	 * OBS: Nessa API, para fins de estudo e por questões de tempo, 
	 *      estamos recebendo e retornando a própria entidade Usuario.
	 *      Isso não é indicado em aplicações, nesse caso deveríamos desenvolver um DTO para o Request
	 *      e outro para o Response. 	 
	 */
	@PostMapping("/api/v1/usuario")
	public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario, 
			              HttpServletRequest httpRequest, 
			              HttpServletResponse httpResponse) {
		
		/*
		 * Variáveis declaradas como "var" são uma feature do JAVA 11. 
		 * Para conseguir usar com o JAVA 8 (nosso caso), o lombok fornece suporte
		 * via importação de biblioteca. Olhar no começo do arquivo para referência
		 * o import da bilbioteca lombok.var.
		 */
		var ehUmNovoUsuario = usuario.getId() == null;
		
		var usuarioSalvo = usuariocrudService.salvar(usuario);
		
		return ResponseEntity.status(ehUmNovoUsuario ? HttpStatus.CREATED : HttpStatus.OK).body(usuarioSalvo);
	}
	
	/*
	 * Quando usar pageable, se atentar para que os imports de Page e Peageable sejam
	 * os do Spring (org.springframework.data.domain). 
	 * Verificar o começo do arquivo para referência.
	 * 
	 * A vantagem de usar Peageable é que eles podem ser controlados pela url de requisição.
	 * Os parametros são informados como parâmetros opcionais (usando ? e &)
	 * Exemplo: /api/v1/usuario?size=2&page=15&sort=nome.desc
	 */
	@GetMapping("/api/v1/usuario")
    public ResponseEntity<Page<Usuario>> buscarPaginado(Pageable pageable) {
		var paginaUsuarios = usuariocrudService.buscarPaginado(pageable);
		
		return ResponseEntity.status(HttpStatus.OK).body(paginaUsuarios);
    }

}
