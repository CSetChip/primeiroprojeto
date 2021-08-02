import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Persistencia {

	private XStream xstream = new XStream(new DomDriver("ISO8859-1"));
	private File arquivo;

	public void salvarCentral(CentralDeInformacoes c, String nomeDoArquivo) throws Exception {
		
		arquivo = new File(nomeDoArquivo + ".xml");
		
		String xml = xstream.toXML(c);
		
		try {
			
			arquivo.createNewFile();
			PrintWriter ar = new PrintWriter(arquivo);
			ar.print(xml);
			ar.close();
			
		}catch(IOException e) {
			
			e.printStackTrace();
		}
	}

	public CentralDeInformacoes recuperarCentra(String nomeDoArquivo) throws Exception {
		
		arquivo = new File(nomeDoArquivo + ".xml");
		
		try {
			
			if (arquivo.exists()) {
				
				FileInputStream insert = new FileInputStream(arquivo);
				return (CentralDeInformacoes) xstream.fromXML(insert);
				
			}
			
		}catch(IOException e) {
			
			e.printStackTrace();
		}
			
		CentralDeInformacoes d = new CentralDeInformacoes();
		salvarCentral(d,nomeDoArquivo);
		return d;
	}

}
