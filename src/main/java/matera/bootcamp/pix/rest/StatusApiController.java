package matera.bootcamp.pix.rest.status;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import matera.bootcamp.pix.service.contaCorrente.ContaCorrenteService;

@RestController
@RequiredArgsConstructor
public class StatusApiController {
	
	private final ContaCorrenteService contaCorrenteService;
	
	@GetMapping("/api/v1/status")
	public String statusCheck() {
		return "UP!";
	}

}
