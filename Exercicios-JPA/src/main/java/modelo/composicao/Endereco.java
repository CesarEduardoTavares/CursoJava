package modelo.composicao;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {

	private String Logadouro;
	private String Complemento;
	public String getLogadouro() {
		return Logadouro;
	}
	public void setLogadouro(String logadouro) {
		Logadouro = logadouro;
	}
	public String getCompleto() {
		return Complemento;
	}
	public void setCompleto(String completo) {
		Complemento = completo;
	}
	
	
	
}
