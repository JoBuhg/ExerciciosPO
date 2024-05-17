package EXHerança.Progressões;


public class Fibonacci extends Progressões {
    @Override
    public void Progressão(int quantidade, double a){
        if (quantidade <= 0){
            System.out.println("a quantidade de vezes da progressão não foi definida");
        }else{
            System.out.println("inciando progressão de fibonacci");
            for (int i = 0;i< quantidade; i++ ){
                c = a + b;
                System.out.println(i+" A:"+a+" + B:"+b+" = C:"+c);
                b = a;
                a = c;
                 
            }
        }
    }
}
