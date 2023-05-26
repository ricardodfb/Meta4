package cardshark_fim;

import java.util.*;
/**
 *
 * @author Ricardo Ferrel
 */

public class CardShark_FIM{
    private static Jugador jugador1;
    private static Jugador jugador2;
    private static Jugador jugador3;
    private static Jugador jugador4;

    public static void main(String[] args) {
        int op, ct=0, i, c1 = 0, c2 = 0, c3 = 0, c4 = 0, rondas = 1;
        String n1, n2, n3, n4;
        Dado dado1 = new Dado();  
        Dado dado2 = new Dado();  
        Dado dado3 = new Dado();  
        Dado dado4 = new Dado();  
        Scanner sc = new Scanner(System.in);
        System.out.println("1.-  Card Shark");
        System.out.println("2.-  Card Shark Extended for All");
        System.out.println("Elige la version que deseas jugar: ");
        op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("---------------------");
                System.out.println("      CARD SHARK");
                System.out.println("Nombre del jugador 1: ");
                sc.nextLine();
                n1 = sc.nextLine();
                jugador1 = new Jugador(n1);
                System.out.println("Nombre del jugador 2: ");
                n2 = sc.nextLine();
                jugador2 = new Jugador(n2);
                System.out.println("Nombre del jugador 3: ");
                n3 = sc.nextLine();
                jugador3 = new Jugador(n3);
                Baraja baraja = new Baraja();
                baraja.barajar();

                while (!jugador1.getMano().isEmpty() && !jugador2.getMano().isEmpty() && !jugador3.getMano().isEmpty()) {
                    for (i = 1; i <= 3; i++) {
                        System.out.println("El jugador numero " + i + " debe elegir que carta lanzar");
                        ct = sc.nextInt();
                        Jugador jugador = generarJugador(i);
                        Carta cartaElegida = Jugador.generarCarta(jugador, ct);
                        if (cartaElegida != null) {
                            System.out.println("Cartas restantes: " + jugador.getMano().toString());
                            if (i == 1) {
                                c1 = cartaElegida.getValor();
                            } else if (i == 2) {
                                c2 = cartaElegida.getValor();
                            } else if (i == 3) {
                                c3 = cartaElegida.getValor();
                            }
                        }
                    }
                  if (c1 > c2 && c1 > c3){
                    System.out.println("EL JUGADOR " + jugador1.getIdentificador() + " GANA 2 PUNTOS");
                    jugador1.suma();
                    System.out.println("Puntos: "+jugador1.getPuntaje());
                  }
                    if (c2 > c1 && c2 > c3){
                    System.out.println("EL JUGADOR " + jugador2.getIdentificador() + " GANA 2 PUNTOS");
                    jugador2.suma();
                    System.out.println("Puntos: "+jugador2.getPuntaje());
                  }
                    if (c3 > c1 && c3 > c2){
                    System.out.println("EL JUGADOR " + jugador3.getIdentificador() + " GANA 2 PUNTOS");
                    jugador3.suma();
                    System.out.println("Puntos: "+jugador3.getPuntaje());
                  }
                    if (c1 == c2 || c1 == c3 || c2 == c3) {
                        System.out.println("DESEMPATE");
                        if (c1 == c2) {
                            System.out.println("Cartas restantes: " + jugador1.getMano().toString());
                            System.out.println("Jugador 1 elige cuál carta deseas lanzar");
                            ct = sc.nextInt();
                            Carta cartaElegida1 = Jugador.generarCarta(jugador1, ct);
                            System.out.println("Cartas restantes: " + jugador2.getMano().toString());
                            System.out.println("Jugador 2 elige cuál carta deseas lanzar");
                            ct = sc.nextInt();
                            Carta cartaElegida2 = Jugador.generarCarta(jugador2, ct);
                            if (cartaElegida1.compareTo(cartaElegida2) > 0) {
                                System.out.println("EL JUGADOR " + jugador1.getIdentificador() + " GANA 2 PUNTOS");
                              jugador1.suma();
                              System.out.println("Puntos: "+jugador1.getPuntaje());
                            } else if (cartaElegida1.compareTo(cartaElegida2) < 0) {
                                System.out.println("EL JUGADOR " + jugador2.getIdentificador() + " GANA 2 PUNTOS");
                              jugador2.suma();
                              System.out.println("Puntos: "+jugador2.getPuntaje());
                            }
                          else {
                              jugador1.empate();
                              jugador2.empate();
                          System.out.println("EMPATE NUEVAMENTE, PUNTOS: "+jugador1.getPuntaje()+" y "+jugador2.getPuntaje());
                        }
                        }
                           if (c1 == c3) {
                           System.out.println("Cartas restantes: " + jugador1.getMano().toString());
                           System.out.println("Jugador 1 elige cuál carta deseas lanzar");
                           ct = sc.nextInt();
                           Carta cartaElegida1 = Jugador.generarCarta(jugador1, ct);
                           System.out.println("Cartas restantes: " + jugador3.getMano().toString());
                           System.out.println("Jugador 3 elige cuál carta deseas lanzar");
                           ct = sc.nextInt();
                           Carta cartaElegida3 = Jugador.generarCarta(jugador3, ct);

                           if (cartaElegida1.compareTo(cartaElegida3) > 0) {
                           System.out.println("EL JUGADOR " + jugador1.getIdentificador() + " GANA 2 PUNTOS");
                            jugador1.suma();
                            System.out.println("Puntos: "+jugador1.getPuntaje());
                          } 
                           else if (cartaElegida1.compareTo(cartaElegida3) < 0) {
                            System.out.println("EL JUGADOR " + jugador3.getIdentificador() + " GANA 2 PUNTOS");
                            jugador3.suma();
                            System.out.println("Puntos: "+jugador3.getPuntaje());
                           }
                             else {
                              jugador1.empate();
                              jugador3.empate();
                              System.out.println("EMPATE NUEVAMENTE, PUNTOS: "+jugador1.getPuntaje()+" y "+jugador3.getPuntaje());
                             }
                           }
                      else if (c2 == c3) {
                            System.out.println("Cartas restantes: " + jugador2.getMano().toString());
                            System.out.println("Jugador 2 elige cuál carta deseas lanzar");
                            ct = sc.nextInt();
                            Carta cartaElegida2 = Jugador.generarCarta(jugador2, ct);
                            System.out.println("Cartas restantes: " + jugador3.getMano().toString());
                            System.out.println("Jugador 3 elige cuál carta deseas lanzar");
                            ct = sc.nextInt();
                            Carta cartaElegida3 = Jugador.generarCarta(jugador3, ct);
                            if (cartaElegida2.compareTo(cartaElegida3) > 0) {
                                System.out.println("EL JUGADOR " + jugador2.getIdentificador() + " GANA 2 PUNTOS");
                            jugador2.suma();
                            System.out.println("Puntos: "+jugador2.getPuntaje());
                            } else if (cartaElegida2.compareTo(cartaElegida3) < 0) {
                                System.out.println("EL JUGADOR " + jugador3.getIdentificador() + " GANA 2 PUNTOS");
                            jugador3.suma();
                            System.out.println("Puntos: "+jugador3.getPuntaje());
                            }
                             else {
                              jugador2.empate();
                              jugador3.empate();
                          System.out.println("EMPATE NUEVAMENTE, PUNTOS: "+jugador2.getPuntaje()+" y "+jugador3.getPuntaje());
                        }
                           }
                      if (c1 == c2 && c2 == c3){
                            System.out.println("Cartas restantes: " + 
                            jugador1.getMano().toString());
                            System.out.println("Jugador 1 elige cuál carta deseas lanzar");
                            ct = sc.nextInt();
                            Carta cartaElegida1 = Jugador.generarCarta(jugador1, ct);
                            System.out.println("Cartas restantes: " + jugador2.getMano().toString());
                            System.out.println("Jugador 2 elige cuál carta deseas lanzar");
                            ct = sc.nextInt();
                            Carta cartaElegida2 = Jugador.generarCarta(jugador2, ct);
                            System.out.println("Cartas restantes: " + jugador3.getMano().toString());
                            System.out.println("Jugador 3 elige cuál carta deseas lanzar");
                            ct = sc.nextInt();
                            Carta cartaElegida3 = Jugador.generarCarta(jugador3, ct);
                        if (cartaElegida1.compareTo(cartaElegida2) > 0 && cartaElegida1.compareTo(cartaElegida3) > 0) {
                            System.out.println("EL JUGADOR " + jugador1.getIdentificador() + " GANA 2 PUNTOS");
                            jugador1.suma();
                            System.out.println("Puntos: "+jugador1.getPuntaje());
                      }
                       else if (cartaElegida2.compareTo(cartaElegida1) > 0 && cartaElegida2.compareTo(cartaElegida3) > 0) {
                            System.out.println("EL JUGADOR " + jugador2.getIdentificador() + " GANA 2 PUNTOS");
                            jugador2.suma();
                            System.out.println("Puntos: "+jugador2.getPuntaje());
                      }
                        else if (cartaElegida3.compareTo(cartaElegida1) > 0 && cartaElegida3.compareTo(cartaElegida2) > 0) {
                            System.out.println("EL JUGADOR " + jugador3.getIdentificador() + " GANA 2 PUNTOS");
                            jugador3.suma();
                            System.out.println("Puntos: "+jugador3.getPuntaje());
                      }
                        else {
                              jugador1.empate();
                              jugador2.empate();
                              jugador3.empate();
                          System.out.println("EMPATE NUEVAMENTE, PUNTOS: "+jugador1.getPuntaje()+" , "+jugador2.getPuntaje()+ " y " +jugador3.getPuntaje());
                        }
                    }
                }
                }
                  if (jugador1.getPuntaje() > jugador2.getPuntaje() && jugador1.getPuntaje() > jugador3.getPuntaje()){
                    System.out.println("EL JUGADOR "+jugador1.getIdentificador()+ " GANA LA PARTIDA");
                  }
                  else if (jugador2.getPuntaje() > jugador3.getPuntaje() && jugador2.getPuntaje() > jugador1.getPuntaje()){
                    System.out.println("EL JUGADOR "+jugador2.getIdentificador()+ " GANA LA PARTIDA");
                  }
                  else {
                    System.out.println("EL JUGADOR "+jugador3.getIdentificador()+ " GANA LA PARTIDA");
                  }
                 System.out.println(jugador1.getIdentificador()+ " obtuvo: " +jugador1.getPuntaje()+ "puntos");
                 System.out.println(jugador2.getIdentificador()+ " obtuvo: " +jugador2.getPuntaje()+ "puntos");
                 System.out.println(jugador3.getIdentificador()+ " obtuvo: " +jugador3.getPuntaje()+ "puntos");
                break;
            case 2:
                System.out.println("---------------------------");
                System.out.println("CARD SHARK EXTENDED FOR ALL");
                System.out.println("Nombre del jugador 1: ");
                sc.nextLine();
                n1 = sc.nextLine();
                jugador1 = new Jugador(n1);
                System.out.println("Nombre del jugador 2: ");
                n2 = sc.nextLine();
                jugador2 = new Jugador(n2);
                System.out.println("Nombre del jugador 3: ");
                n3 = sc.nextLine();
                jugador3 = new Jugador(n3);
                System.out.println("Nombre del jugador 4: ");
                n4 = sc.nextLine();
                jugador4 = new Jugador(n4);     
                Baraja baraja1 = new Baraja();
                Baraja baraja2 = new Baraja();
        
                baraja1.barajar();
                baraja2.barajar();
        
                ArrayList<Carta> cartasBaraja1 = baraja1.getCartas();
                ArrayList<Carta> cartasBaraja2 = baraja2.getCartas();
        
                Baraja barajaCombinada = new Baraja();
        
                for (Carta carta : cartasBaraja1) {
                barajaCombinada.agregarCarta(carta);
                }
        
                for (Carta carta : cartasBaraja2) {
                barajaCombinada.agregarCarta(carta);
                }
                barajaCombinada.barajar();
                 System.out.println("Comienza el juego.");
                  ArrayList<Carta> cartasJugador1 = jugador1.getMano();
                  ArrayList<Carta> cartasJugador2 = jugador2.getMano();
                  ArrayList<Carta> cartasJugador3 = jugador3.getMano();
                  ArrayList<Carta> cartasJugador4 = jugador4.getMano();
                  cartasJugador1.addAll(barajaCombinada.repartir(dado1.lanzar()));
                  cartasJugador2.addAll(barajaCombinada.repartir(dado2.lanzar()));
                  cartasJugador3.addAll(barajaCombinada.repartir(dado3.lanzar()));
                  cartasJugador4.addAll(barajaCombinada.repartir(dado4.lanzar()));
                  jugador1.setMazo(cartasJugador1);
                  jugador2.setMazo(cartasJugador2);
                  jugador3.setMazo(cartasJugador3);
                  jugador4.setMazo(cartasJugador4);
                  for(i = 1 ; i<=10 ; i++){
                    for (int j = 1; j <= 4; j++) {
                    System.out.println("Jugador " + j + ", elige qué carta deseas lanzar: ");
                    int cartaIndex = sc.nextInt();
                    Jugador jugador = generarJugador(j);
                    Carta cartaElegida = Jugador.generarCarta(jugador, cartaIndex);
                    if (cartaElegida != null) {
                    jugador.eliminarCarta(cartaElegida);
                    System.out.println("Cartas restantes: " + jugador.getMano().toString());
                            if (j == 1) {
                                c1 = cartaElegida.getValor();
                            } else if (j == 2) {
                                c2 = cartaElegida.getValor();
                            } else if (j == 3) {
                                c3 = cartaElegida.getValor();
                            }
                              else if (j == 4) {
                                c4 = cartaElegida.getValor();
                              }
                    }
                    }
                    if (jugador1.getMano().isEmpty()){
                   cartasJugador1.addAll(barajaCombinada.repartir(dado1.lanzar()));
                   jugador1.setMazo(cartasJugador1);
                 }
              if (jugador2.getMano().isEmpty()){
                 cartasJugador2.addAll(barajaCombinada.repartir(dado2.lanzar()));
                jugador2.setMazo(cartasJugador2);
              }
               if (jugador3.getMano().isEmpty()){
                  cartasJugador3.addAll(barajaCombinada.repartir(dado3.lanzar()));
                  jugador3.setMazo(cartasJugador3);
              } 
                    if (jugador4.getMano().isEmpty()){
                     cartasJugador4.addAll(barajaCombinada.repartir(dado4.lanzar())); 
                    jugador4.setMazo(cartasJugador4);
                    }
                    if (c1 > c2 && c1 > c3 && c1 > c4){
                    System.out.println("EL JUGADOR " + jugador1.getIdentificador() + " GANA 2 PUNTOS");
                    jugador1.suma();
                    System.out.println("Puntos: "+jugador1.getPuntaje());
                  }
                     if (c2 > c1 && c2 > c3 && c2 > c4){
                    System.out.println("EL JUGADOR " + jugador2.getIdentificador() + " GANA 2 PUNTOS");
                    jugador2.suma();
                    System.out.println("Puntos: "+jugador2.getPuntaje());
                  }
                    if (c3 > c1 && c3 > c1 && c3 > c4){
                    System.out.println("EL JUGADOR " + jugador3.getIdentificador() + " GANA 2 PUNTOS");
                    jugador3.suma();
                    System.out.println("Puntos: "+jugador3.getPuntaje());
                  }
                    if (c4 > c1 && c4 > c2 && c4 > c3){
                    System.out.println("EL JUGADOR " + jugador4.getIdentificador() + " GANA 2 PUNTOS");
                    jugador4.suma();
                    System.out.println("Puntos: "+jugador4.getPuntaje());
                  }
             if (c1 == c2 || c1 == c3 || c2 == c3 || c4 == c1 || c4 == c2 || c4 == c3) {
                        System.out.println("DESEMPATE");
                        if (c1 == c2) {
                            System.out.println("Cartas restantes: " + jugador1.getMano().toString());
                            System.out.println("Jugador 1 elige cuál carta deseas lanzar");
                            ct = sc.nextInt();
                            Carta cartaElegida1 = Jugador.generarCarta(jugador1, ct);
                            System.out.println("Cartas restantes: " + jugador2.getMano().toString());
                            System.out.println("Jugador 2 elige cuál carta deseas lanzar");
                            ct = sc.nextInt();
                            Carta cartaElegida2 = Jugador.generarCarta(jugador2, ct);
                            if (cartaElegida1.compareTo(cartaElegida2) > 0) {
                                System.out.println("EL JUGADOR " + jugador1.getIdentificador() + " GANA 2 PUNTOS");
                              jugador1.suma();
                              System.out.println("Puntos: "+jugador1.getPuntaje());
                            } else if (cartaElegida1.compareTo(cartaElegida2) < 0) {
                                System.out.println("EL JUGADOR " + jugador2.getIdentificador() + " GANA 2 PUNTOS");
                              jugador2.suma();
                              System.out.println("Puntos: "+jugador2.getPuntaje());
                            }
                          else {
                              jugador1.empate();
                              jugador2.empate();
                          System.out.println("EMPATE NUEVAMENTE, PUNTOS: "+jugador1.getPuntaje()+" y "+jugador2.getPuntaje());
                        }
                        }
                           if (c1 == c3) {
                           System.out.println("Cartas restantes: " + jugador1.getMano().toString());
                           System.out.println("Jugador 1 elige cuál carta deseas lanzar");
                           ct = sc.nextInt();
                           Carta cartaElegida1 = Jugador.generarCarta(jugador1, ct);
                           System.out.println("Cartas restantes: " + jugador3.getMano().toString());
                           System.out.println("Jugador 3 elige cuál carta deseas lanzar");
                           ct = sc.nextInt();
                           Carta cartaElegida3 = Jugador.generarCarta(jugador3, ct);

                           if (cartaElegida1.compareTo(cartaElegida3) > 0) {
                           System.out.println("EL JUGADOR " + jugador1.getIdentificador() + " GANA 2 PUNTOS");
                            jugador1.suma();
                            System.out.println("Puntos: "+jugador1.getPuntaje());
                          } 
                           else if (cartaElegida1.compareTo(cartaElegida3) < 0) {
                            System.out.println("EL JUGADOR " + jugador3.getIdentificador() + " GANA 2 PUNTOS");
                            jugador3.suma();
                            System.out.println("Puntos: "+jugador3.getPuntaje());
                           }
                             else {
                              jugador1.empate();
                              jugador3.empate();
                              System.out.println("EMPATE NUEVAMENTE, PUNTOS: "+jugador1.getPuntaje()+" y "+jugador3.getPuntaje());
                             }
                           }
                      else if (c2 == c3) {
                            System.out.println("Cartas restantes: " + jugador2.getMano().toString());
                            System.out.println("Jugador 2 elige cuál carta deseas lanzar");
                            ct = sc.nextInt();
                            Carta cartaElegida2 = Jugador.generarCarta(jugador2, ct);
                            System.out.println("Cartas restantes: " + jugador3.getMano().toString());
                            System.out.println("Jugador 3 elige cuál carta deseas lanzar");
                            ct = sc.nextInt();
                            Carta cartaElegida3 = Jugador.generarCarta(jugador3, ct);
                            if (cartaElegida2.compareTo(cartaElegida3) > 0) {
                                System.out.println("EL JUGADOR " + jugador2.getIdentificador() + " GANA 2 PUNTOS");
                            jugador2.suma();
                            System.out.println("Puntos: "+jugador2.getPuntaje());
                            } else if (cartaElegida2.compareTo(cartaElegida3) < 0) {
                                System.out.println("EL JUGADOR " + jugador3.getIdentificador() + " GANA 2 PUNTOS");
                            jugador3.suma();
                            System.out.println("Puntos: "+jugador3.getPuntaje());
                            }
                             else {
                              jugador2.empate();
                              jugador3.empate();
                          System.out.println("EMPATE NUEVAMENTE, PUNTOS: "+jugador2.getPuntaje()+" y "+jugador3.getPuntaje());
                        }
                           }
                              if (c4 == c1) {
                           System.out.println("Cartas restantes: " + jugador4.getMano().toString());
                           System.out.println("Jugador 4 elige cuál carta deseas lanzar");
                           ct = sc.nextInt();
                           Carta cartaElegida4 = Jugador.generarCarta(jugador4, ct);
                           System.out.println("Cartas restantes: " + jugador1.getMano().toString());
                           System.out.println("Jugador 1 elige cuál carta deseas lanzar");
                           ct = sc.nextInt();
                           Carta cartaElegida1 = Jugador.generarCarta(jugador1, ct);

                           if (cartaElegida4.compareTo(cartaElegida1) > 0) {
                           System.out.println("EL JUGADOR " + jugador4.getIdentificador() + " GANA 2 PUNTOS");
                            jugador4.suma();
                            System.out.println("Puntos: "+jugador4.getPuntaje());
                          } 
                           else if (cartaElegida4.compareTo(cartaElegida1) < 0) {
                            System.out.println("EL JUGADOR " + jugador1.getIdentificador() + " GANA 2 PUNTOS");
                            jugador1.suma();
                            System.out.println("Puntos: "+jugador1.getPuntaje());
                           }
                           }
                               if (c4 == c2) {
                           System.out.println("Cartas restantes: " + jugador4.getMano().toString());
                           System.out.println("Jugador 4 elige cuál carta deseas lanzar");
                           ct = sc.nextInt();
                           Carta cartaElegida4 = Jugador.generarCarta(jugador4, ct);
                           System.out.println("Cartas restantes: " + jugador2.getMano().toString());
                           System.out.println("Jugador 2 elige cuál carta deseas lanzar");
                           ct = sc.nextInt();
                           Carta cartaElegida2 = Jugador.generarCarta(jugador2, ct);

                           if (cartaElegida4.compareTo(cartaElegida2) > 0) {
                           System.out.println("EL JUGADOR " + jugador4.getIdentificador() + " GANA 2 PUNTOS");
                            jugador4.suma();
                            System.out.println("Puntos: "+jugador4.getPuntaje());
                          } 
                           else if (cartaElegida4.compareTo(cartaElegida2) < 0) {
                            System.out.println("EL JUGADOR " + jugador2.getIdentificador() + " GANA 2 PUNTOS");
                            jugador2.suma();
                            System.out.println("Puntos: "+jugador2.getPuntaje());
                           }
                               }
                              if (c4 == c3) {
                           System.out.println("Cartas restantes: " + jugador4.getMano().toString());
                           System.out.println("Jugador 4 elige cuál carta deseas lanzar");
                           ct = sc.nextInt();
                           Carta cartaElegida4 = Jugador.generarCarta(jugador4, ct);
                           System.out.println("Cartas restantes: " + jugador3.getMano().toString());
                           System.out.println("Jugador 3 elige cuál carta deseas lanzar");
                           ct = sc.nextInt();
                           Carta cartaElegida3 = Jugador.generarCarta(jugador3, ct);

                           if (cartaElegida4.compareTo(cartaElegida3) > 0) {
                           System.out.println("EL JUGADOR " + jugador4.getIdentificador() + " GANA 2 PUNTOS");
                            jugador4.suma();
                            System.out.println("Puntos: "+jugador4.getPuntaje());
                          } 
                           else if (cartaElegida4.compareTo(cartaElegida3) < 0) {
                            System.out.println("EL JUGADOR " + jugador3.getIdentificador() + " GANA 2 PUNTOS");
                            jugador3.suma();
                            System.out.println("Puntos: "+jugador3.getPuntaje());
                           }
                           }
                      if (c1 == c2 && c2 == c3 && c3 == c4){
                            System.out.println("Cartas restantes: " + 
                            jugador1.getMano().toString());
                            System.out.println("Jugador 1 elige cuál carta deseas lanzar");
                            ct = sc.nextInt();
                            Carta cartaElegida1 = Jugador.generarCarta(jugador1, ct);
                            System.out.println("Cartas restantes: " + jugador2.getMano().toString());
                            System.out.println("Jugador 2 elige cuál carta deseas lanzar");
                            ct = sc.nextInt();
                            Carta cartaElegida2 = Jugador.generarCarta(jugador2, ct);
                            System.out.println("Cartas restantes: " + jugador3.getMano().toString());
                            System.out.println("Jugador 3 elige cuál carta deseas lanzar");
                            ct = sc.nextInt();
                            Carta cartaElegida3 = Jugador.generarCarta(jugador3, ct);
                            System.out.println("Cartas restantes: " + jugador4.getMano().toString());
                            System.out.println("Jugador 4 elige cuál carta deseas lanzar");
                            ct = sc.nextInt();
                            Carta cartaElegida4 = Jugador.generarCarta(jugador4, ct);
                        if (cartaElegida1.compareTo(cartaElegida2) > 0 && cartaElegida1.compareTo(cartaElegida3) > 0) {
                            System.out.println("EL JUGADOR " + jugador1.getIdentificador() + " GANA 2 PUNTOS");
                            jugador1.suma();
                            System.out.println("Puntos: "+jugador1.getPuntaje());
                      }
                       else if (cartaElegida2.compareTo(cartaElegida1) > 0 && cartaElegida2.compareTo(cartaElegida3) > 0) {
                            System.out.println("EL JUGADOR " + jugador2.getIdentificador() + " GANA 2 PUNTOS");
                            jugador2.suma();
                            System.out.println("Puntos: "+jugador2.getPuntaje());
                      }
                        else if (cartaElegida3.compareTo(cartaElegida1) > 0 && cartaElegida3.compareTo(cartaElegida2) > 0) {
                            System.out.println("EL JUGADOR " + jugador3.getIdentificador() + " GANA 2 PUNTOS");
                            jugador2.suma();
                            System.out.println("Puntos: "+jugador3.getPuntaje());
                      }
                          else if (cartaElegida4.compareTo(cartaElegida1) > 0 && cartaElegida4.compareTo(cartaElegida2) > 0 && cartaElegida4.compareTo(cartaElegida3) > 0) {
                            System.out.println("EL JUGADOR " + jugador4.getIdentificador() + " GANA 2 PUNTOS");
                            jugador4.suma();
                            System.out.println("Puntos: "+jugador4.getPuntaje());
                          }
                        else {
                              jugador1.empate();
                              jugador2.empate();
                              jugador3.empate();
                              jugador4.empate();
                          System.out.println("EMPATE NUEVAMENTE, PUNTOS: "+jugador1.getPuntaje()+" , "+jugador2.getPuntaje()+ " ," +jugador3.getPuntaje()+ " y " +jugador4.getPuntaje());
                          }
                    }
             }
             }
            if (jugador1.getPuntaje() > jugador2.getPuntaje() && jugador1.getPuntaje() > jugador3.getPuntaje() && jugador1.getPuntaje() > jugador4.getPuntaje()){
                    System.out.println("EL JUGADOR "+jugador1.getIdentificador()+ " GANA LA PARTIDA");
                  }
                  else if (jugador2.getPuntaje() > jugador1.getPuntaje() && jugador2.getPuntaje() > jugador3.getPuntaje() && jugador2.getPuntaje() > jugador4.getPuntaje())
            {
                    System.out.println("EL JUGADOR "+jugador2.getIdentificador()+ " GANA LA PARTIDA");
                  }
                  else if (jugador3.getPuntaje() > jugador1.getPuntaje() && jugador3.getPuntaje() > jugador2.getPuntaje() && jugador3.getPuntaje() > jugador4.getPuntaje()){
                    System.out.println("EL JUGADOR "+jugador3.getIdentificador()+ " GANA LA PARTIDA");
                  }
            else {
            System.out.println("EL JUGADOR "+jugador4.getIdentificador()+ " GANA LA PARTIDA");
                }
                 System.out.println(jugador1.getIdentificador()+ " obtuvo: " +jugador1.getPuntaje()+ "puntos");
                 System.out.println(jugador2.getIdentificador()+ " obtuvo: " +jugador2.getPuntaje()+ "puntos");
                 System.out.println(jugador3.getIdentificador()+ " obtuvo: " +jugador3.getPuntaje()+ "puntos");
                 System.out.println(jugador4.getIdentificador()+ " obtuvo: " +jugador4.getPuntaje()+ "puntos");
                break;
            default:
                System.out.println("Opción no válida");
                break;
    }
  }
    public static Jugador generarJugador(int indice) {
        switch (indice) {
            case 1:
                return jugador1;
            case 2:
                return jugador2;
            case 3:
                return jugador3;
            case 4:
                return jugador4;
            default:
                return null;
        }
    }
}

