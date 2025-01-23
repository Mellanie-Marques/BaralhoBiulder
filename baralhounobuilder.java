import java.util.ArrayList;
import java.util.List;

public class baralhounobuilder implements baralhobuilder {
    private List<carta> cartas;

    @Override
    public void construirCartas() {
        cartas = new ArrayList<>();
        String[] cores = {"Vermelho", "Azul", "Verde", "Amarelo"};
        
        // Cartas numeradas (0 a 9)
        for (String cor : cores) {
            cartas.add(new carta("0", cor, 0));
            for (int i = 1; i <= 9; i++) {
                cartas.add(new carta(String.valueOf(i), cor, i));
                cartas.add(new carta(String.valueOf(i), cor, i));
            }
        }
        
        // Cartas especiais
        for (String cor : cores) {
            cartas.add(new carta("Comprar 2", cor, 20));
            cartas.add(new carta("Comprar 2", cor, 20));
            cartas.add(new carta("Inverter", cor, 20));
            cartas.add(new carta("Inverter", cor, 20));
            cartas.add(new carta("Pular", cor, 20));
            cartas.add(new carta("Pular", cor, 20));
        }

        // Cartas curingas
        for (int i = 0; i < 4; i++) {
            cartas.add(new carta("Curinga", "Todas as cores", 50));
            cartas.add(new carta("Comprar 4", "Todas as cores", 50));
        }

        // Carta "Trocar as mãos"
        cartas.add(new carta("Trocar as mãos", "Todas as cores", 50));
    }

    @Override
    public baralho obterBaralho() {
        return new baralho(cartas);
    }
}
