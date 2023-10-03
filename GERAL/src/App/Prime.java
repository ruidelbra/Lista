package App;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Enditis.Pain;

public class Prime {
	
	
	static List<Pain> List = new ArrayList<>();
	static Scanner SC = new Scanner(System.in);
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		
	System.out.println("ola");
		boolean condicion = true;
		
		while(condicion) {
			System.out.println("=============menu================");
			System.out.println("opção (1) cadastrar clientes");
			System.out.println("opção (2) ver lista de clientes");
			System.out.println("opção (3) remover clientes");
			System.out.println("opção (4) #sair");
			int option = SC.nextInt();
			System.out.println();
			
			switch(option) {
				case(1):
						clientes();
				
					break;
					
				case(2):
						listclientes();
						
					break;
					
				case(3):removerclientes();
					
					break;
					
				case(4): sair();
					condicion = false;
			
			}
			}
	}
		private static void clientes() {
			System.out.println("=============cadastrar clientes================");
			System.out.println();
			System.out.println("digite o id: ");
			int id = SC.nextInt();
			System.out.println("digite o nome: ");
			SC.nextLine();
			String name = SC.nextLine();
			System.out.println("digite o email: ");
			String email = SC.nextLine();
			
			Pain p = new Pain(id, email, name);
			
			List.add(p);
			
			System.out.println("cliente cadastrado com sucesso");
		}
		private static void listclientes() {
		System.out.println("=============lista de clientes================");
		
		if ( List.size() > 0) {
			for (Pain P : List) {
				System.out.println(P);
			}}
				else {
					System.out.println("nenhum produto cadastrado");
				}
		}
		private static void removerclientes() {
			
			System.out.println("=============Remover usuarios================");
			for(int i =1; i<List.size(); i++) {
				Pain p = List.get(i);
				System.out.println("rent #" + i +":" + p);
				
				System.out.print("valor de referencia:");
				int referencia = SC.nextInt();
				SC.nextLine();
				if (referencia < List.size()) {
				List.remove(referencia);
				
				System.out.println("usuario removido com sucesso");
			}
				else {
					
					System.out.println("usuario nao encontrado");
				}
			}
				}
					
		
				private static void sair() {
					System.out.println("saindo....");
				}
		
				
		}
			
				
			
				
				
					
					
					
		


