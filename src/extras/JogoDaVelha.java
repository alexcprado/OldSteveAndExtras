package extras;

public class JogoDaVelha {

    private char [][] tabuleiro;
    private char jogadorAtual;

    public JogoDaVelha() {
        tabuleiro =  new char[3][3];
        jogadorAtual = 'X';

        for(int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                tabuleiro[linha][coluna] = ' ';
            }
        }
    }

    public boolean jogar(int linha, int coluna) {
        if (linha < 0 || linha > 2 || coluna < 0 ||  coluna > 2) {
            return false;
        }

        if (tabuleiro[linha][coluna] != ' ') {
            return false;
        }

        tabuleiro[linha][coluna] = jogadorAtual;

        if (jogadorAtual == 'X') {
            jogadorAtual = 'O';
        } else {
            jogadorAtual = 'X';
        }

        return true;
    }

    public void mostrarTabuleiro() {
        System.out.println("---------------");

        for (int linha = 0; linha < 3; linha++) {

            System.out.print("| ");

            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(tabuleiro[linha][coluna] + " | ");
            };
        }

        System.out.println("---------------");
    }

    public static void main(String[] args) {

        JogoDaVelha jogo =  new JogoDaVelha();

        jogo.mostrarTabuleiro();

        jogo.jogar(0,1 );
        jogo.jogar(1, 1);
        jogo.jogar(0, 1);

        jogo.mostrarTabuleiro();
    }
}
