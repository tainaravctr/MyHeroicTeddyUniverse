package MyHeroicTeddyUniverse;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import MyHeroicTeddyUniverse.model.SpecificTeddy;
import MyHeroicTeddyUniverse.util.Cores;
 

public class Teddy {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		int option;
		
		
		while (true) {

			System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND + "✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰");
			System.out.println("                                                     ");
			System.out.println("\r\n"
					+ "   __  ___                    __  __                         _                 ______             __       __                   __  __            _                                    \r\n"
					+ "   /  |/  /   __  __          / / / /  ___    _____  ____    (_)  _____        /_  __/  ___   ____/ /  ____/ /   __  __         / / / /   ____    (_) _   __  ___    _____   _____  ___ \r\n"
					+ "  / /|_/ /   / / / /         / /_/ /  / _ \\  / ___/ / __ \\  / /  / ___/         / /    / _ \\ / __  /  / __  /   / / / /        / / / /   / __ \\  / / | | / / / _ \\  / ___/  / ___/ / _ \\\r\n"
					+ " / /  / /   / /_/ /         / __  /  /  __/ / /    / /_/ / / /  / /__          / /    /  __// /_/ /  / /_/ /   / /_/ /        / /_/ /   / / / / / /  | |/ / /  __/ / /     (__  ) /  __/\r\n"
					+ "/_/  /_/    \\__, /         /_/ /_/   \\___/ /_/     \\____/ /_/   \\___/         /_/     \\___/ \\__,_/   \\__,_/    \\__, /         \\____/   /_/ /_/ /_/   |___/  \\___/ /_/     /____/  \\___/ \r\n"
					+ "           /____/                                                                                             /____/                                                                   \r\n"
					+                                                                                                                                                                                                                                                        "");
			System.out.println("                                                                                                                                                                                                                                              ");
			System.out.println("✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰");
			System.out.println("                                                                                                                                                                                                                                              ");
			System.out.println("            1 - Criar Teddy                                                                                                                                                                                                                   ");
			System.out.println("            2 - Carrinho                                                                                                                                                                                                                      ");
			System.out.println("            3 - Remover item do carrinho                                                                                                                                                                                                      ");
			System.out.println("            4 - Sair                                                                                                                                                                                                                          ");
			System.out.println("                                                                                                                                                                                                                                              ");
			System.out.println("✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰");
			System.out.println("Entre com a opção desejada:                                                                                                                                                                                                                   ");
			System.out.println("                                                                                                                                                                                                                                              ");

			try {
				option = ler.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite um valor inteiro!");
				ler.nextLine();
				option = 0;
			}

			
			
			if (option == 4) {
				System.out.println("\n ✧ Seu Herói da forma que você sonhou! ✧");
				ler.close();
				System.exit(0);
			}

			switch (option) {
				case 1:
					System.out.println(Cores.TEXT_WHITE +"Criar teddy\n\n");
					Teddy.getAparencia();
					keyPress();
					break;
				case 2:
					System.out.println(Cores.TEXT_WHITE +"Carrinho\n\n");
					Teddy.listarTodas();
					keyPress();
					break;
				case 3:
					System.out.println(Cores.TEXT_WHITE +"Remover item do carrinho\n\n");	

					if (Teddy != null) {
						if (listarTodas.remove(Teddy) == true)
							System.out.println("\nO Teddy: " +Teddy+ " foi removido do seu carrinho!");
					keyPress();
					break;
				default:
					System.out.println(Cores.TEXT_RED_BOLD +"\nOpção Inválida!\n");
					break;
			}

	}
  }

	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
		
	}
}