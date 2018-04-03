import java.util.StringTokenizer;

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

    public static long hangulToNum(String input) {
        long result = 0;
        long tmpResult = 0;
        long num = 0;
        final String NUMBER = "영일이삼사오육칠팔구";
        final String UNIT = "십백천만억조";
        final long[] UNIT_NUM = { 10, 100, 1000, 10000, (long)Math.pow(10,8), (long)Math.pow(10,12) };
        StringTokenizer st = new StringTokenizer(input, UNIT, true);
        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            //숫자인지, 단위(UNIT)인지 확인
            int check = NUMBER.indexOf(token);
            if(check == -1) { //단위인 경우
                if("만억조".indexOf(token) == -1) {
                    tmpResult += (num != 0 ? num : 1) * UNIT_NUM[UNIT.indexOf(token)];
                } else {
                    tmpResult += num;
                    result += (tmpResult != 0 ? tmpResult : 1) * UNIT_NUM[UNIT.indexOf(token)];
                    tmpResult = 0;
                }
                num = 0;
            } else { //숫자인 경우
                num = check;
            }
        }

        return result + tmpResult + num;
    }
}
