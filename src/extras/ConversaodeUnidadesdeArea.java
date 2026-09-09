package extras;

public class ConversaodeUnidadesdeArea {

    public static double metroQuadradoParaPeQuadrado(double valor) {
        return valor * 10.76;
    }

    public static double peQuadradoParaCentimetroQuadrado(double valor) {
        return valor * 929;
    }

    public static double milhaQuadradaParaAcre(double valor) {
        return valor * 640;
    }

    public static double acreParapeQuadrado(double valor) {
        return valor * 43560;
    }


    double resultado1 = ConversaodeUnidadesdeArea.metroQuadradoParaPeQuadrado(10);

    double resultado2 = ConversaodeUnidadesdeArea.peQuadradoParaCentimetroQuadrado(5);

    double resultado3 = ConversaodeUnidadesdeArea.milhaQuadradaParaAcre(4);

    double resultado4 = ConversaodeUnidadesdeArea.acreParapeQuadrado(7);

    public static void main(String[] args) {

        ConversaodeUnidadesdeArea conversaodeUnidadesdeArea = new ConversaodeUnidadesdeArea();

        System.out.println("Resultado da conversão de 10 metros quadrados para pés quadrados: " + conversaodeUnidadesdeArea.resultado1);
        System.out.println("Resultado da conversão de 5 pés quadrados para centímetros quadrados: " + conversaodeUnidadesdeArea.resultado2);
        System.out.println("Resultado da conversão de 4 milhas quadradas para acres: " + conversaodeUnidadesdeArea.resultado3);
        System.out.println("Resultado da conversão acres 7 para pés quadrados: " + conversaodeUnidadesdeArea.resultado4);
    }
}
