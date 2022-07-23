package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class loginControlador {

	@FXML
	private TextField campoEmail;

	@FXML
	private PasswordField campoSenha;

	public void entrar() {
		boolean emailValido = campoEmail.getText().equals("aluno@cod3r.com.br");
		boolean senhaValida = campoSenha.getText().equals("12345678");
		
		if (emailValido && senhaValida) {
			System.out.println("sucesso");
			Notifications.create().position(Pos.TOP_RIGHT)
			.title("Login FXML").text("Login efetuado com sucesso! ").showInformation();
		}else {
			Notifications.create().position(Pos.TOP_RIGHT)
			.title("Login FXML").text("Usuario e senha inválidos! ").showError();
		}
		
	}

}