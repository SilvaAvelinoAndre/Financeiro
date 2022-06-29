package br.com.financeiro.util;

	import org.hibernate.SessionFactory;
	import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
	import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

	public class HibernateUtil {

	    private static final SessionFactory fabricaDeSessoes = criarFabricaDeSessoes();

	    private static SessionFactory criarFabricaDeSessoes() {
	        try {
	            // Cria uma conex�o a partir do hibernate config
	        	
	        	Configuration configuracao = new Configuration().configure();
	        	
	        	
	        	ServiceRegistry servicoDeRegistro = new StandardServiceRegistryBuilder()
	        			.applySettings(configuracao.getProperties()).build();
	        	
	        	SessionFactory fabricaDeSessoes = configuracao.buildSessionFactory(servicoDeRegistro);
	        	 
	        	return fabricaDeSessoes;
	        	
	        	
	        	
	        	//	            return new Configuration().configure().buildSessionFactory(
//				    new StandardServiceRegistryBuilder().build() );
	       
	        }
	        catch (Throwable ex) {
	            // Mensagem de erro ao conectar
	            System.err.println("Falha na conex�o!!!" + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
	    }

	    public static SessionFactory getFabricadesessoes() {
			return fabricaDeSessoes;
		}

	}


