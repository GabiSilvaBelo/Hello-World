package helloworldapplication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo-de-aprendizagem")
public class AprendizagemController {

	@GetMapping
	public String objetivodeaprendizagem() {
		return "/Ler toda a documentação e ver os videos para entender melhor o Spring";

	}
}