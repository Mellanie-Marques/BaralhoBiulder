public class main {
    public static void main(String[] args) {
      // Criando o baralho tradicional
        baralhobuilder tradicionalBuilder = new baralhotradicionalbuilder();
        baralhodirector diretorTradicional = new baralhodirector(tradicionalBuilder);
        baralho baralhoTradicional = diretorTradicional.construirBaralho();

        System.out.println("Baralho Tradicional:");
        baralhoTradicional.exibirCartas();

        System.out.println("\n=========================\n");

        // Criando o baralho Uno
        baralhobuilder unoBuilder = new baralhounobuilder();
        baralhodirector diretorUno = new baralhodirector(unoBuilder);
        baralho baralhoUno = diretorUno.construirBaralho();

        System.out.println("Baralho Uno:");
        baralhoUno.exibirCartas();
    }
}
