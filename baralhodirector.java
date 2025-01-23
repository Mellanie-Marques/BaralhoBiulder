public class baralhodirector {
    private final baralhobuilder builder;

    public baralhodirector(baralhobuilder builder) {
        this.builder = builder;
    }

    public baralho construirBaralho() {
        builder.construirCartas();
        return builder.obterBaralho();
    }
}
