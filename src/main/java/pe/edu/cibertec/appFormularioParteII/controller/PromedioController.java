package pe.edu.cibertec.appFormularioParteII.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PromedioController {

	@GetMapping("/promedio")//Url
	//Metodo
	public String frmPromedioNotas(Model model) {
		return "frmPromedio"; //Nombre Vista
	}
	
}
