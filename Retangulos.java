package EXHerança.Retângulos;

import java.util.concurrent.atomic.AtomicLong;

// Desenvolva objetos que sejam capazes de desenhar um retângulo com um texto.
//  O retângulo pode conter diferentes tipos de decoração (bordas arrendondadas, linhas duplas, ascii art, colorido, etc). 
//  Porém cada objeto deve ser capaz de desenhar apenas um tipo de retângulo.

public class Retangulos {
    public void criarRetangulo(int altura, int largura){
        for (int i = 0; i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                if (i == 0 || i == largura - 1) {
                    System.out.print("-");
                } else if (j == 0 || j == altura - 1) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }    
}
