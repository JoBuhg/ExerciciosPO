package EXHerança.Progressões;


public class Geometrica extends Progressões {
    @Override
    public void Progressão(int quantidade, double a){
        if (quantidade <= 0){
            System.out.println("a quantidade de vezes da progressão não foi definida");
        }else{
            System.out.println("inciando progressão geometrica");
            b = a;
            for (int i = 0;i< quantidade; i++ ){
                c = a * b;
                System.out.println(i+" A:"+a+" X B:"+b+" = C:"+c);
                a = c;
            }
        }
    }

}
