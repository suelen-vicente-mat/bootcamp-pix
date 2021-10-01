<<<<<<< HEAD
<<<<<<< HEAD:src/main/java/matera/bootcamp/pix/rest/status/StatusApiController.java
package matera.bootcamp.pix.rest.status;
=======
package matera.bootcamp.pix.rest;
>>>>>>> 78607ce9fa66fb1c39ba55708420ce4415c02c88:src/main/java/matera/bootcamp/pix/rest/StatusApiController.java
=======
package matera.bootcamp.pix.rest.status;
>>>>>>> 78607ce9fa66fb1c39ba55708420ce4415c02c88

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
<<<<<<< HEAD
<<<<<<< HEAD:src/main/java/matera/bootcamp/pix/rest/status/StatusApiController.java
import matera.bootcamp.pix.service.contaCorrente.ContaCorrenteService;
=======
import matera.bootcamp.pix.service.ContaCorrenteService;
>>>>>>> 78607ce9fa66fb1c39ba55708420ce4415c02c88:src/main/java/matera/bootcamp/pix/rest/StatusApiController.java
=======
import matera.bootcamp.pix.service.ContaCorrenteService;
>>>>>>> 78607ce9fa66fb1c39ba55708420ce4415c02c88

@RestController
@RequiredArgsConstructor
public class StatusApiController {
	
	private final ContaCorrenteService contaCorrenteService;
	
	@GetMapping("/api/v1/status")
	public String statusCheck() {
		return "UP!";
	}

}
