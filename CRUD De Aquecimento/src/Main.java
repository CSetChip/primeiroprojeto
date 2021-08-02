import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		
		/* Intancias base */
		
		Persistencia recuperar = new Persistencia();
		CentralDeInformacoes central = recuperar.recuperarCentra("arquivo-Central");
		Scanner leitor = new Scanner(System.in);
		boolean acabou = false;
		String opcion = null;
		
		/* fim de instancias */

		System.out.println("Olá\r\n" + "Bem vindo ao Salão de Beleza\r\n");

		while (acabou != true) {
			
			/* Main Do programa */
			
			System.out.print("[1] Novo Colaborador\r\n" + "[2] Mostrar todos os Colaboradores\r\n"
					+ "[3] Buscar Colaborador\r\n" + "[4] Novo Serviço\r\n" + "[5] Listar todos os serviços\r\n"
					+ "[6] Buscar serviço\r\n" + "[7] Associar serviço a um colaborador\r\n"
					+ "[8] Gerar relatorio com associados.\r\n" + "[9] Enviar email para um colaborador\r\n"
					+ "[S] Sair\r\n" + "Digite o numero da opção desejada:");
			opcion = leitor.nextLine();
			
			/* Fim Do main */
			
			/* Executando opcao selecionada */
			
			
			switch(opcion) {
				
			case "1":
				
				OpcaoUm.execucao(recuperar, central, leitor);
				break;
				
			case "2":
				
				OpcaoDois.execucao(central);
				break;
				
			case "3":
				
				OpcaoTres.execucao(leitor, central);
				break;
			
			case "4":
				
				OpcaoQuatro.execucao(leitor, central);
				break;
				
			case "5":
				
				OpcaoCinco.execucao(central);
				break;
			
			case "6":
				
				OpcaoSeis.execucao(central, leitor);
				break;
			
			case "7":
				
				OpcaoSete.execucao(central, leitor);
				break;
				
			case "8":
				
				GeradorDeRelatorio gerador = new GeradorDeRelatorio();
				gerador.gerarRelatorio(central);
				break;
			
			case "9":
				
				OpcaoNove.execucao(leitor, central);
				break;

			case "s":
				
				acabou = true;
				break;
				
			default:
				
				System.out.println("Valor invalido\r\n");
				break;
			}
			
			
		}
		/* Fim da execução */
		
		recuperar.salvarCentral(central, "arquivo-Central");
		
		/* Comando de fechamento do Scanner */
		leitor.close();
	}
}