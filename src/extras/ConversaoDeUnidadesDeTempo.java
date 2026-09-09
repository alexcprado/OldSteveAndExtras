package extras;

public class ConversaoDeUnidadesDeTempo {

    public static double minutosParaSegundos(double minutos) {
        return minutos * 60;
    }

    public static double horasParaMinutos(double horas) {
        return horas * 60;
    }

    public static double diasParaHoras(double dias) {
        return dias * 24;
    }

    public static double semanasParaDias(double semanas) {
        return semanas * 7;
    }

    public static double mesesParaDias(double meses) {
        return meses * 30;
    }

    double resultado1 = ConversaoDeUnidadesDeTempo.minutosParaSegundos(5);

    double resultado2 =  ConversaoDeUnidadesDeTempo.horasParaMinutos(3);

    double resultado3 = ConversaoDeUnidadesDeTempo.diasParaHoras(5);

    double resultado4 =  ConversaoDeUnidadesDeTempo.semanasParaDias(2);

    double resultado5 = ConversaoDeUnidadesDeTempo.mesesParaDias(12);

    public static void main(String[] args) {

        ConversaoDeUnidadesDeTempo conversaoDeUnidadesDeTempo = new ConversaoDeUnidadesDeTempo();

        System.out.println("O resultado da conversão de 5 minutos para segundos é: " + conversaoDeUnidadesDeTempo.resultado1);
        System.out.println("O resultado da conversão de 3 horas para minutos é: " + conversaoDeUnidadesDeTempo.resultado2);
        System.out.println("O resultado da conversão de 5 dias para horas é: " + conversaoDeUnidadesDeTempo.resultado3);
        System.out.println("O resultado da conversão de 2 semanas para dias é: " + conversaoDeUnidadesDeTempo.resultado4);
        System.out.println("O resultado da conversão de 12 meses para dias é: " + conversaoDeUnidadesDeTempo.resultado5);
    }
}
