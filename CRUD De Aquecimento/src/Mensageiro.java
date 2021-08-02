import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Mensageiro {  
	
public static void enviaremailAocolaborador(Colaborador c, String msg){  

      SimpleEmail email = new SimpleEmail();  

      try {  
    	  
      email.setDebug(true);  
      email.setHostName("smtp.gmail.com");  //Acesso ao host gmail
      email.setSmtpPort(465); // configura��o de porta 
      email.setAuthentication("ttestes091@gmail.com","Senha123@@");  
      email.setSSLOnConnect(true);  // Conex�o segura
      email.addTo(c.getEmail()); //Destinatario
      email.setFrom("ttestes091@gmail.com"); //Remetente
      email.setSubject("Enviando email");  
      email.setMsg(msg);  
      email.send();  

      } catch (EmailException e) {  

    	  e.printStackTrace();  

      }   

  }  

}