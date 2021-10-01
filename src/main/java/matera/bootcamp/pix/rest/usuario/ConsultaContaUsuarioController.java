package matera.bootcamp.pix.rest.usuario;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.var;
import matera.bootcamp.pix.domain.model.ContaCorrente;
import matera.bootcamp.pix.service.usuario.ConsultaContaUsuarioService;

@RestController
@RequiredArgsConstructor
public class ConsultaContaUsuarioController {
	
	private final ConsultaContaUsuarioService consultaContaUsuarioService;
	
	@GetMapping("/api/v1/usuario/{id}/conta")
    public ResponseEntity<ContaCorrente> buscarPorUsuario(@PathVariable Long id) {

        var contaConsultada = consultaContaUsuarioService
                .consultarContaPorUsuarioId(id);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(contaConsultada);
    }

}
