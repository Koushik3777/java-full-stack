package day2;
public class typecast {
    public static void main(String[] args) {
        int num = 20;
        double dnum = num;

        double nd = 99.99;
        int ind = (int) nd;

        char c = 'A';
        int x = c;

        int b = 90;
        char ch = (char) b;
        int ab = 100;
        byte ba = (byte)ab;
        System.out.println(ba);
        System.out.println(ch);
        System.out.println(x);

        System.out.println(num);
        System.out.println(dnum);
        System.out.println(nd);
        System.out.println(ind);
    }
}
