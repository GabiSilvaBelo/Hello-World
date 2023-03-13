package helloworldapplication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm-generation")
public class BsmController {

	@GetMapping
	public String BSMGeneration() {
		return "Responsabilidade Pessoal, Mentalidade de Crescimento, Orientação ao Futuro, Persistência, Comunicação, Trabalho em Equipe, Proatividade e Orientação ao Detalhe";

	}
}
