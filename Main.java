package EXHerança.Retângulos;

public class Main {
    public static void main(String[] args) {
        final Retangulos r = new Retangulos();
        final Pontilhado p = new Pontilhado();
        final Arredondado a = new Arredondado();

        r.criarRetangulo(9, 3);
       p.criarRetangulo(9, 3);
       a.criarRetangulo(3, 9);
    }
}
