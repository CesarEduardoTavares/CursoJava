package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
	public static void main(String[] args) throws SQLException {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o codigo: ");
		int codigo = entrada.nextInt();

		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		//String sql = "DELETE FROM pessoas WHERE codigo > ?"; Apaga todos as pessoas a partir do codigo digitado.
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		int contador = stmt.executeUpdate();
		
		if(contador > 0) {
			System.out.println("Pessoa excluida com sucesso! ");
			}else {
			System.out.println("Nada feito!");
		}

		System.out.println("Linhas afetadas: " + contador);
		
		conexao.close();
		entrada.close();
	}
}
