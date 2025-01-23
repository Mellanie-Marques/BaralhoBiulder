import java.util.List;

public class baralho {
    private final List<carta> cartas;

    public baralho(List<carta> cartas) {
        this.cartas = cartas;
    }

    public void exibirCartas() {
        cartas.forEach(System.out::println);
    }
}
