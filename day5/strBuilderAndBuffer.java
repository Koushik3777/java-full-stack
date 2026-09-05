package day5;
public class strBuilderAndBuffer{
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Channa Koushik");

        sb.append(" Channa ");
        System.out.println("StringBuilder append: " + sb);

        sb.insert(6, "Koushik ");
        System.out.println("StringBuilder insert: " + sb);

        sb.delete(6, 10);
        System.out.println("StringBuilder delete: " + sb);

        sb.deleteCharAt(5);
        System.out.println("StringBuilder deleteCharAt: " + sb);

        sb.reverse();
        System.out.println("StringBuilder reverse: " + sb);
        System.out.println("StringBuilder Length : "+ sb.capacity());

        sb.replace(0, 5, "Shaik");
        System.out.println("StringBuilder replace: " + sb);
        System.out.println();
        System.out.println("STRING BUILDER COMPLETED, NOW LETS SEE STRING BUFFER");
        System.out.println();

        StringBuffer sbf = new StringBuffer("Shaik Shuaib");

        sbf.append(" Koushik");
        System.out.println("StringBuffer append: " + sbf);

        sbf.insert(6, "Channa");
        System.out.println("StringBuffer insert: " + sbf);

        sbf.delete(6, 10);
        System.out.println("StringBuffer delete: " + sbf);

        sbf.deleteCharAt(5);
        System.out.println("StringBuffer deleteCharAt: " + sbf);

        sbf.reverse();
        System.out.println("StringBuffer reverse: " + sbf);

        sbf.replace(0, 5, "Koushik");
        System.out.println("StringBuffer replace: " + sbf);

        System.out.println("StringBuffer Length : "+sbf.capacity());
    }
}