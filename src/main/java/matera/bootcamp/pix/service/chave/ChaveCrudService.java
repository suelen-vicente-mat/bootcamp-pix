package matera.bootcamp.pix.service.chave;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.var;
import matera.bootcamp.pix.domain.model.Chave;
import matera.bootcamp.pix.domain.repository.ChaveRepository;
import matera.bootcamp.pix.domain.repository.ContaCorrenteRepository;

@Service
@RequiredArgsConstructor
public class ChaveCrudService {
	
	private final ChaveRepository chaveRepository;
	private final ContaCorrenteRepository contaCorrenteRepository;
	
	public Chave cadastrarChave(Chave chave) {
		
		if(chave.getContaCorrente().getId() == null)
			throw new RuntimeException("Chave precisa de uma conta corrente.");
		
		var contaCorrente = contaCorrenteRepository
				.findById(chave.getContaCorrente().getId())
				.orElseThrow(() -> new RuntimeException("Conta corrente não encontrada"));
		
		chave.setContaCorrente(contaCorrente);
		
		return chaveRepository.save(chave);
	}
	
	public Page<Chave> buscarPaginado(Pageable pageable){
		return chaveRepository.findAll(pageable);
	}

}
