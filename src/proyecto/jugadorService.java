package proyecto;

public interface jugadorService {

    void crearJugador(jugador j);

    void actualizarJugador(jugador j);

    void eliminarJugador(int id);

    void entrenarJugador(int id);

    void simularTemporada();

    void tomarDecision(int id, String decision);

    void subirOVR(int id, int puntos);

    void retirarJugador(int id);
}