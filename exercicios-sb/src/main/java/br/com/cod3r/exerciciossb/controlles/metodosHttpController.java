package br.com.cod3r.exerciciossb.controlles;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metodos")
public class metodosHttpController {
	
	@GetMapping
	public String get() {
		return "Requisiçao GET";
		
		
	}
	
	@PostMapping
	public String post() {
		return "Requisiçao POST";
		
		
	}
	
	@PutMapping
	public String put() {
		return "Requisiçao PUT";
		
		
	}
	
	@PatchMapping
	public String path() {
		return "Requisiçao PATH";
		
		
	}
	
	@DeleteMapping
	public String delete() {
		return "Requisiçao DELETE";
		
		
	}
}

