
public class HelloWorld {
    public static void main(String[] args){

        System.out.println("Hello World!!");

        System.out.println("----9X9 matrix------");
        for(int i=1; i<=9; i++) {
            for(int j=2; j<=9; j++) {
                System.out.printf("%d * %d = %2d", j, i, (j*i));
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
