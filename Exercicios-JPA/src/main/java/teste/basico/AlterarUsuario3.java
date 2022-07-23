package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {
public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicios-JPA");
		EntityManager em = emf.createEntityManager(); 
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 9L);
		em.detach(usuario);
		
		usuario.setNome("Yan Gustavo Tavares");
		em.merge(usuario);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
}
}
