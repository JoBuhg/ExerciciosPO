package EXHerança.Retângulos;

public class Pontilhado extends Retangulos {
    @Override
    public void criarRetangulo(int altura, int largura){
        for (int i = 0; i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                if (i == 0 || i == largura - 1) {
                    System.out.print(".");
                } else if (j == 0 || j == altura - 1) {
                    System.out.print(".");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }    
}
