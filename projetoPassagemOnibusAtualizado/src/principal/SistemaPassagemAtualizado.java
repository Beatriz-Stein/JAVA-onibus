package principal;

import java.util.Scanner;

import entities.Cadeira;
import entities.Usuario;
import entities.Viagem;

public class SistemaPassagemAtualizado {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] lugaresPartida = { "RodoviariaVitoria-ES" };
		String[] lugaresChegada = { "Buzios-RJ", "Porto Seguro-BH", "Gramado-RS","Fernando de Noronha-PE" };

		Viagem viagem1 = new Viagem("RodoviariaVitoria-ES", "Buzios-RJ", "08:00", "15:00");
		Viagem viagem2 = new Viagem("RodoviariaVitoria-ES", "Porto Seguro-BH", "08:00", "17:00");
		Viagem viagem3 = new Viagem("RodoviariaVitoria-ES", "Gramado-RS", "08:00", "20:30");
		Viagem viagem4 = new Viagem("RodoviariaVitoria-ES", "Fernando de Noronha-PE", "08:00", "23:30");

		Cadeira[] cadeira1 = new Cadeira[40];
		Cadeira[] cadeira2 = new Cadeira[40];
		Cadeira[] cadeira3 = new Cadeira[40];
		Cadeira[] cadeira4 = new Cadeira[40];

		Usuario[] usuario1 = new Usuario[40];
		Usuario[] usuario2 = new Usuario[40];
		Usuario[] usuario3 = new Usuario[40];
		Usuario[] usuario4 = new Usuario[40];

		String resposta;
		do {
			System.out.print("Deseja comprar uma passagem? (sim/não): ");
			resposta = sc.next();
			if (resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("s")) {
				System.out.println("-----------------------------------------------------------");
				for (int i = 0; i < lugaresPartida.length; i++) {
					System.out.println(i + ": " + lugaresPartida[i]);
				}
				System.out.print("Digite o índice do local de partida: ");
				int indicePartida = sc.nextInt();

				System.out.println("\nLocais de chegada:");
				for (int i = 0; i < lugaresChegada.length; i++) {
					System.out.println(i + ": " + lugaresChegada[i]);
				}
				System.out.print("Digite o índice do local de chegada: ");
				int indiceChegada = sc.nextInt();
				System.out.println();

				if (viagem1.getLugarPartida().equalsIgnoreCase((String) Viagem.lugaresPartida[indicePartida])) {
					if (viagem1.getLugarDestino().equalsIgnoreCase((String) Viagem.lugaresChegada[indiceChegada])) {
						System.out.println("Cadeiras :");
						if (cadeira1 != null) {
							for (int i = 0; i < cadeira1.length; i++) {
								if (cadeira1[i] == null) {
									cadeira1[i] = new Cadeira(i + 1, "Livre");
								}
								System.out.printf("%-10d -[%s] %n", cadeira1[i].getNumCadeira(),
										cadeira1[i].getStatus());
							}
						} else {
							for (int i = 0; i < cadeira1.length; i++) {
								System.out.printf("%-10d -[%s] %n", cadeira1[i].getNumCadeira(),
										cadeira1[i].getStatus());
							}
						}
						System.out.print("Escolha sua cadeira: ");
						int selecionarCadeira1 = sc.nextInt();
						System.out.println();

						boolean cadeiraOcupada = false;

						for (int i = 0; i < cadeira1.length; i++) {
						    if (cadeira1[i].getNumCadeira() == selecionarCadeira1 && cadeira1[i].getStatus().equalsIgnoreCase("OCUPADO")) {
						        System.out.println("Cadeira já está ocupada. Escolha outra cadeira:");
						        selecionarCadeira1 = sc.nextInt();
						        System.out.println();
						        cadeiraOcupada = true;
						        cadeira1[selecionarCadeira1 - 1].setStatus("OCUPADO");
						        break; 
						    }
						} 
						if (!cadeiraOcupada) {
						    cadeira1[selecionarCadeira1 - 1].setStatus("OCUPADO");
						    System.out.println("Cadeira selecionada: " + selecionarCadeira1);
						}


						for (int i = 0; i < cadeira1.length; i++) {
						    System.out.printf("%-10d -[%s] %n", cadeira1[i].getNumCadeira(), cadeira1[i].getStatus());
						}
						System.out.println("-----------------------------------------------------------");
						System.out.println("Para Confirmar sua viagem digite os seguintes dados");
						System.out.println("-----------------------------------------------------------");
						if (usuario1 != null) {
							for (int i = 0; i < 1; i++) {
								if (usuario1[i] == null) {
									usuario1[i] = new Usuario(null, null, null);
								}
								System.out.print("Nome: ");
								usuario1[i].setNomeUsuario(sc.next());
								System.out.print("Email: ");
								usuario1[i].setEmail(sc.next());
								System.out.print("Número Telefone: ");
								usuario1[i].setNumUsuario(sc.next());
								System.out.println();
								System.out.printf("%nPASSAGEM CONFIRMADA %nNome:"+ usuario1[i].getNomeUsuario()+"%nEmail: "+ usuario1[i].getEmail()+"%nNúmero do celular: "+usuario1[i].getNumUsuario());
							}
						}
						System.out.println();
						System.out.printf("Lugar Partida : " + viagem1.getLugarPartida() + "%nLugar Chegada: "
								+ viagem1.getLugarDestino() + "%nHorário Partida : " + viagem1.getHorarioPartida()
								+ "%nHorário previsto p/ Chegada :" + viagem1.getHorarioChegada() + "%n");
						System.out.println();
					} if (viagem2.getLugarPartida().equalsIgnoreCase((String) Viagem.lugaresPartida[indicePartida])) {
						if (viagem2.getLugarDestino().equalsIgnoreCase((String) Viagem.lugaresChegada[indiceChegada])) {
							System.out.println("Cadeiras :");
							if (cadeira2 != null) {
								for (int i = 0; i < cadeira2.length; i++) {
									if (cadeira2[i] == null) {
										cadeira2[i] = new Cadeira(i + 1, "Livre");
									}
									System.out.printf("%-10d -[%s] %n", cadeira2[i].getNumCadeira(),
											cadeira2[i].getStatus());
								}
							} else {
								for (int i = 0; i < cadeira2.length; i++) {
									System.out.printf("%-10d -[%s] %n", cadeira2[i].getNumCadeira(),
											cadeira2[i].getStatus());
								}
							}
							System.out.print("Escolha sua cadeira: ");
							int selecionarCadeira2 = sc.nextInt();
							System.out.println();

							boolean cadeiraOcupada = false;

							for (int i = 0; i < cadeira2.length; i++) {
							    if (cadeira2[i].getNumCadeira() == selecionarCadeira2 && cadeira2[i].getStatus().equalsIgnoreCase("OCUPADO")) {
							        System.out.println("Cadeira já está ocupada. Escolha outra cadeira:");
							        selecionarCadeira2= sc.nextInt();
							        System.out.println();
							        cadeiraOcupada = true;
							        cadeira2[selecionarCadeira2 - 1].setStatus("OCUPADO");
							        break; 
							    }
							} 
							if (!cadeiraOcupada) {
							    cadeira2[selecionarCadeira2 - 1].setStatus("OCUPADO");
							    System.out.println("Cadeira selecionada: " + selecionarCadeira2);
							}


							for (int i = 0; i < cadeira2.length; i++) {
							    System.out.printf("%-10d -[%s] %n", cadeira2[i].getNumCadeira(), cadeira2[i].getStatus());
							}
							System.out.println("-----------------------------------------------------------");
							System.out.println("Para Confirmar sua viagem digite os seguintes dados");
							System.out.println("-----------------------------------------------------------");
							if (usuario2 != null) {
								for (int i = 0; i < 1; i++) {
									if (usuario2[i] == null) {
										usuario2[i] = new Usuario(null, null, null);
									}
									System.out.print("Nome: ");
									usuario2[i].setNomeUsuario(sc.next());
									System.out.print("Email: ");
									usuario2[i].setEmail(sc.next());
									System.out.print("Número Telefone: ");
									usuario2[i].setNumUsuario(sc.next());
									System.out.println();
									System.out.printf("%nPASSAGEM CONFIRMADA %nNome:"+ usuario2[i].getNomeUsuario()+"%nEmail: "+ usuario2[i].getEmail()+"%nNúmero do celular: "+usuario2[i].getNumUsuario());
								}
							}
							System.out.println();
							System.out.printf("Lugar Partida : " + viagem2.getLugarPartida() + "%nLugar Chegada: "
									+ viagem2.getLugarDestino() + "%nHorário Partida : " + viagem2.getHorarioPartida()
									+ "%nHorário previsto p/ Chegada :" + viagem2.getHorarioChegada() + "%n");
							System.out.println();	
						}
					}  if (viagem3.getLugarPartida().equalsIgnoreCase((String) Viagem.lugaresPartida[indicePartida])) {
						if (viagem3.getLugarDestino().equalsIgnoreCase((String) Viagem.lugaresChegada[indiceChegada])) {
							System.out.println("Cadeiras :");
							if (cadeira3 != null) {
								for (int i = 0; i < cadeira3.length; i++) {
									if (cadeira3[i] == null) {
										cadeira3[i] = new Cadeira(i + 1, "Livre");
									}
									System.out.printf("%-10d -[%s] %n", cadeira3[i].getNumCadeira(),
											cadeira3[i].getStatus());
								}
							} else {
								for (int i = 0; i < cadeira3.length; i++) {
									System.out.printf("%-10d -[%s] %n", cadeira3[i].getNumCadeira(),
											cadeira3[i].getStatus());
								}
							}
							System.out.print("Escolha sua cadeira: ");
							int selecionarCadeira3 = sc.nextInt();
							System.out.println();

							boolean cadeiraOcupada = false;

							for (int i = 0; i < cadeira3.length; i++) {
							    if (cadeira3[i].getNumCadeira() == selecionarCadeira3 && cadeira3[i].getStatus().equalsIgnoreCase("OCUPADO")) {
							        System.out.println("Cadeira já está ocupada. Escolha outra cadeira:");
							        selecionarCadeira3= sc.nextInt();
							        System.out.println();
							        cadeiraOcupada = true;
							        cadeira3[selecionarCadeira3 - 1].setStatus("OCUPADO");
							        break; 
							    }
							} 
							if (!cadeiraOcupada) {
							    cadeira3[selecionarCadeira3 - 1].setStatus("OCUPADO");
							    System.out.println("Cadeira selecionada: " + selecionarCadeira3);
							}


							for (int i = 0; i < cadeira3.length; i++) {
							    System.out.printf("%-10d -[%s] %n", cadeira3[i].getNumCadeira(), cadeira3[i].getStatus());
							}
							System.out.println("-----------------------------------------------------------");
							System.out.println("Para Confirmar sua viagem digite os seguintes dados");
							System.out.println("-----------------------------------------------------------");
							if (usuario3 != null) {
								for (int i = 0; i < 1; i++) {
									if (usuario3[i] == null) {
										usuario3[i] = new Usuario(null, null, null);
									}
									System.out.print("Nome: ");
									usuario3[i].setNomeUsuario(sc.next());
									System.out.print("Email: ");
									usuario3[i].setEmail(sc.next());
									System.out.print("Número Telefone: ");
									usuario3[i].setNumUsuario(sc.next());
									System.out.println();
									System.out.printf("%nPASSAGEM CONFIRMADA %nNome:"+ usuario3[i].getNomeUsuario()+"%nEmail: "+ usuario3[i].getEmail()+"%nNúmero do celular: "+usuario3[i].getNumUsuario());
								}
							}
							System.out.println();
							System.out.printf("Lugar Partida : " + viagem3.getLugarPartida() + "%nLugar Chegada: "
									+ viagem3.getLugarDestino() + "%nHorário Partida : " + viagem3.getHorarioPartida()
									+ "%nHorário previsto p/ Chegada :" + viagem3.getHorarioChegada() + "%n");
							System.out.println();	
						}
					}  if (viagem4.getLugarPartida().equalsIgnoreCase((String) Viagem.lugaresPartida[indicePartida])) {
								if (viagem4.getLugarDestino().equalsIgnoreCase((String) Viagem.lugaresChegada[indiceChegada])) {
									System.out.println("Cadeiras :");
									if (cadeira4 != null) {
										for (int i = 0; i < cadeira4.length; i++) {
											if (cadeira4[i] == null) {
												cadeira4[i] = new Cadeira(i + 1, "Livre");
											}
											System.out.printf("%-10d -[%s] %n", cadeira4[i].getNumCadeira(),
													cadeira4[i].getStatus());
										}
									} else {
										for (int i = 0; i < cadeira4.length; i++) {
											System.out.printf("%-10d -[%s] %n", cadeira4[i].getNumCadeira(),
													cadeira4[i].getStatus());
										}
									}
									System.out.print("Escolha sua cadeira: ");
									int selecionarCadeira4 = sc.nextInt();
									System.out.println();

									boolean cadeiraOcupada = false;

									for (int i = 0; i < cadeira4.length; i++) {
									    if (cadeira4[i].getNumCadeira() == selecionarCadeira4 && cadeira4[i].getStatus().equalsIgnoreCase("OCUPADO")) {
									        System.out.println("Cadeira já está ocupada. Escolha outra cadeira:");
									        selecionarCadeira4= sc.nextInt();
									        System.out.println();
									        cadeiraOcupada = true;
									        cadeira4[selecionarCadeira4 - 1].setStatus("OCUPADO");
									        break; 
									    }
									} 
									if (!cadeiraOcupada) {
									    cadeira4[selecionarCadeira4 - 1].setStatus("OCUPADO");
									    System.out.println("Cadeira selecionada: " + selecionarCadeira4);
									}


									for (int i = 0; i < cadeira4.length; i++) {
									    System.out.printf("%-10d -[%s] %n", cadeira4[i].getNumCadeira(), cadeira4[i].getStatus());
									}
									System.out.println("-----------------------------------------------------------");
									System.out.println("Para Confirmar sua viagem digite os seguintes dados");
									System.out.println("-----------------------------------------------------------");
									if (usuario4 != null) {
										for (int i = 0; i < 1; i++) {
											if (usuario4[i] == null) {
												usuario4[i] = new Usuario(null, null, null);
											}
											System.out.print("Nome: ");
											usuario4[i].setNomeUsuario(sc.next());
											System.out.print("Email: ");
											usuario4[i].setEmail(sc.next());
											System.out.print("Número Telefone: ");
											usuario4[i].setNumUsuario(sc.next());
											System.out.println();
											System.out.printf("%nPASSAGEM CONFIRMADA %nNome:"+ usuario4[i].getNomeUsuario()+"%nEmail: "+ usuario4[i].getEmail()+"%nNúmero do celular: "+usuario4[i].getNumUsuario());
										}
									}
									System.out.println();
									System.out.printf("Lugar Partida : " + viagem4.getLugarPartida() + "%nLugar Chegada: "
											+ viagem4.getLugarDestino() + "%nHorário Partida : " + viagem4.getHorarioPartida()
											+ "%nHorário previsto p/ Chegada :" + viagem4.getHorarioChegada() + "%n");
									System.out.println();	
								}
						 }
					}

			}
		} while (resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("s"));

		System.out.println("Obrigado pela visita!");

	}

}
