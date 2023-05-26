package cardshark_fim;

import java.util.ArrayList;
/**
 *
 * @author Ricardo Ferrel
 */
public class Jugador {
  private String identificador;
  private int puntaje;
  private ArrayList<Carta> mazo = new ArrayList<>();

  public Jugador(String identificador) {
    this.identificador = identificador;
    puntaje = 0;
    generarMano();
  }
 
  public void eliminarCarta(Carta carta) {
    mazo.remove(carta);
}

  public void generarMano() {
    Baraja b = new Baraja();
    b.barajar();
    mazo = b.repartir(5);
    System.out.println(mazo);
    int negras = 0;
    int rojas = 0;
    for (Carta carta : mazo) {
      if (carta.getColor() == Color.NEGRO)
        negras++;
      else
        rojas++;
    }
    System.out.println("Negras: " + negras + " Rojas: " + rojas);
  }

  public String getIdentificador() {
    return identificador;
  }

  public ArrayList<Carta> getMano() {
    return mazo;
}
  public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }
public void suma(){
  puntaje += 2;
}
  public int getPuntaje(){
    return puntaje;
  }
  public void empate(){
    puntaje += 1;
  }
  
  public static Carta generarCarta(Jugador jugador, int indiceCarta) {
    if (indiceCarta >= 1 && indiceCarta <= jugador.getMano().size()) {
      Carta cartaElegida = jugador.getMano().get(indiceCarta - 1);
      jugador.getMano().remove(indiceCarta - 1);
      System.out.println(jugador.getIdentificador() + " tiro la siguiente carta: " + cartaElegida.toString());
      return cartaElegida;
    } else {
      System.out.println("Esa carta no es valida.");
      return null;
    }
  }

  @Override
  public String toString() {
    return "Tus cartas: " + mazo;
  }
}