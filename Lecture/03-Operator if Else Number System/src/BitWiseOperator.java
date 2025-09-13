public class BitWiseOperator {
    public static void main(String[] args) {
        // Computers --> 01
        int a = 5;
        System.out.println(Integer.toBinaryString(a));
        // 0000000 000000 000000 0000001


        // operands --> byte short int long
        // and operator  &
        // or operator   |
        // xor           ^
        // nor           ~
        // left shift    <<
        // right shift   >>
        // unsigned right shift  >>>

        // and operator  &
        int c = 5 & 4;
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(4));
        System.out.println(c);

        // or operator   |
        int d = 5 | 7;
        System.out.println(Integer.toBinaryString(7));
        System.out.println(Integer.toBinaryString(5));
        System.out.println(d);

        // xor           ^
        int e = 5 ^ 7;
        System.out.println(e);

        // Nor  ~
        int f = 5;
        int g = ~f;
        System.out.println(g);
        System.out.println(Integer.toBinaryString(g));

        // left shift    <<
        int h = 5;
        int i = h << 1;
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));

        // right shift   >>
        int j = 5;
        int k = j << 1;
        System.out.println(k);

        // unsigned right shift  >>>

        int l = 5;
        int m = l >>> 1;
        System.out.println(m);
        System.out.println(Integer.toBinaryString(m));





    }
}
