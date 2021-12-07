package guilhermebonni.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		java.util.Scanner sc = new Scanner(System.in);
		
		double DE, DI, C, Total, L1, L2, H, sextH;
		int geometrico;
		
		System.out.println("Qual a forma geométrica do material: ");
		System.out.println(" 1-redondo 2-quadrado 3-sextavado ");
		geometrico = sc.nextInt();
		
		if (geometrico ==1) {
			System.out.println("Qual o Ø externo? ");
			DE = sc.nextDouble();
			
			System.out.println("Qual o Ø interno? ");
			DI = sc.nextDouble();
			
			System.out.println("Qual o comprimento? ");
			C = sc.nextDouble();
			
			System.out.println("1-Aço 2- Latão 3- Cobre 4-Alumínio");
			int material = 0;
			System.out.println("\n" + "Sua escolha:");
			material = sc.nextInt();
			
			switch(material) {
			case 1:
				Total = (((DE / 2) * (DE / 2)) * 3.14 * C * 0.00000786) - 
				(((DI / 2) * (DI / 2)) * 3.14 * C * 0.00000786);
				
				System.out.printf("O peso total é: %.3f%n", Total);
				break;
				
			case 2:
				Total = (((DE / 2) * (DE / 2)) * 3.14 * C * 0.0000088) - 
				(((DI / 2) * (DI / 2)) * 3.14 * C * 0.0000088);
				
				System.out.printf("O peso total é: %.3f%n", Total);
				break;
				
			case 3:
				Total = (((DE / 2) * (DE / 2)) * 3.14 * C * 0.00000893) - 
				(((DI / 2) * (DI / 2)) * 3.14 * C * 0.00000893);
				
				System.out.printf("O peso total é: %.3f%n", Total);
				break;
				
			case 4:
				Total = (((DE / 2) * (DE / 2)) * 3.14 * C * 0.00000269) - 
				(((DI / 2) * (DI / 2)) * 3.14 * C * 0.00000269);
				
				System.out.printf("O peso total é: %.3f%n", Total);
				break;
				
				default:
				System.out.println("Voce deve digitar um número válido");
				break;
				}
		}
			else if(geometrico == 2) {
				System.out.println("Qual lado 1 ");
				L1 = sc.nextDouble();
				
				System.out.println("Qual lado 2 ");
				L2 = sc.nextDouble();
				
				System.out.println("Qual a altura ");
				H = sc.nextDouble();
				
				System.out.println("1-Aço 2- Latão 3- Cobre 4-Alumínio");
				int material = 0;
				System.out.println("\n" + "Sua escolha:");
				material = sc.nextInt();
				
				switch(material) {
				case 1:
					Total = (L1 * L2 * H * 0.00000786);
					System.out.printf("O peso total é: %.3f%n", Total);
					break;
					
				case 2:
					Total = (L1 * L2 * H * 0.0000088);
					System.out.printf("O peso total é: %.3f%n", Total);
					break;
					
				case 3:
					Total = (L1 * L2 * H * 0.00000893);
					System.out.printf("O peso total é: %.3f%n", Total);
					break;
					
				case 4:
					Total = (L1 * L2 * H * 0.00000269);
					System.out.printf("O peso total é: %.3f%n", Total);
					break;
					
					default:
						System.out.println("Você deve digitar um número válido");
						break;
				}			
			}
			else {
				System.out.println("Qual a altura do sextavado ");
				sextH = sc.nextDouble();
				
				System.out.println("Qual o comprimento? ");
				C = sc.nextDouble();
				
				System.out.println("1-Aço 2- Latão 3- Cobre 4-Alumínio");
				int material = 0;
				System.out.println("\n" + "Sua escolha:");
				material = sc.nextInt();
				
				switch(material) {
				case 1:
					Total = ((sextH * sextH * 3 * C * 0.00000786) / 3.46);
					System.out.printf("O peso total é: %.3f%n", Total);
					break;
					
				case 2:
					Total = ((sextH * sextH * 3 * C * 0.0000088) / 3.46);
					System.out.printf("O peso total é: %.3f%n", Total);
					break;
					
				case 3:
					Total = ((sextH * sextH * 3 * C * 0.00000893) / 3.46);
					System.out.printf("O peso total é: %.3f%n", Total);
					break;
					
				case 4:
					Total = ((sextH * sextH * 3 * C * 0.00000269) / 3.46);
					System.out.printf("O peso total é: %.3f%n", Total);
					break;
					
				default:
					System.out.println("Você deve digitar um número válido");	
					break;					
						
			}
		}

	}
}


