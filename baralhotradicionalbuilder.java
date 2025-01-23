import java.util.ArrayList;
import java.util.List;

public class baralhotradicionalbuilder implements baralhobuilder {
    private List<carta> cartas;

    @Override
    public void construirCartas() {
        cartas = new ArrayList<>();
        String[] naipes = {"Espadas", "Copas", "Ouros", "Paus"};
        String[] simbolos = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
        for (String naipe : naipes) {
            for (String simbolo : simbolos) {
                cartas.add(new carta(simbolo, naipe, 0));
            }
        }
    }

    @Override
    public baralho obterBaralho() {
        return new baralho(cartas);
    }
}
