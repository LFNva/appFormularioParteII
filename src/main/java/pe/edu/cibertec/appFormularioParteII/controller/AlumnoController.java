package pe.edu.cibertec.appFormularioParteII.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pe.edu.cibertec.appFormularioParteII.model.Alumno;

@Controller
public class AlumnoController {
	
	@GetMapping("/alumnos")
	public String frmAlumnos(Model model) {
		List<Alumno> lstAlumnos = new ArrayList<>();
		lstAlumnos.add(new Alumno("Isaias", "Capistrano", "Masculino"));
		lstAlumnos.add(new Alumno("Isaias", "Capistrano", "Masculino"));
		lstAlumnos.add(new Alumno("Isaias", "Capistrano", "Masculino"));
		lstAlumnos.add(new Alumno("Isaias", "Capistrano", "Masculino"));
		lstAlumnos.add(new Alumno("Isaias", "Capistrano", "Masculino"));
		lstAlumnos.add(new Alumno("Isaias", "Capistrano", "Masculino"));
		lstAlumnos.add(new Alumno("Isaias", "Capistrano", "Masculino"));
		model.addAttribute("listaalumnos",lstAlumnos);
		
		return "frmAlumnos";
	}

}
