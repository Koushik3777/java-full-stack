package day5;
public class str{
    public static void main(String[] args) {

        String s = " Myself Koushik ";

        System.out.println("1. length: " + s.length());
        System.out.println("2. charAt: " + s.charAt(3));
        System.out.println("3. toUpperCase: " + s.toUpperCase());
        System.out.println("4. toLowerCase: " + s.toLowerCase());
        System.out.println("5. concat: " + s.concat(" bye"));
        System.out.println("6. substring: " + s.substring(2, 6));
        System.out.println("7. contains: " + s.contains("ahmed"));
        System.out.println("8. startsWith: " + s.startsWith("ahmed"));
        System.out.println("9. endsWith: " + s.endsWith("  "));
        System.out.println("10. indexOf: " + s.indexOf("s"));
        System.out.println("11. replace: " + s.replace("SHUAIB", "JAVA"));
        System.out.println("12. trim: " + s.trim());
        System.out.println("13. isEmpty: " + s.isEmpty());
    }
}