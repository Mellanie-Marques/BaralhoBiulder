public class carta {
    private final String simbolo;
    private final String naipe;
    private final int pontuacao;

    public carta(String simbolo, String naipe, int pontuacao) {
        this.simbolo = simbolo;
        this.naipe = naipe;
        this.pontuacao = pontuacao;
    }

    @Override
    public String toString() {
        return simbolo + " de " + naipe + " (Pontos: " + pontuacao + ")";
    }
}
