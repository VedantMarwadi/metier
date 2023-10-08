class string5
{
public static void main(String ar[])
{
        String s="MY NAME IS TANISH PATEL" +
        "I LIVE IN AHMEDABAD"+
        "i AM LEARNING JAVA LANGUAGE";

        String s1="HELLO WORLD";
        String s2="HELLO";
        String s3="HELLO";
        System.out.println(s);
        System.out.println(s.length());

        System.out.println("index of t="+s.indexOf('y'));
        System.out.println("last index of t=" +s.lastIndexOf('E'));
        System.out.println("index of(T,10) =" +s.indexOf('T',10));
        System.out.println("last index of (T,60)="+s.lastIndexOf('T',60));


        System.out.println(s1.substring(2));
        System.out.println(s1.substring(3,8));
        System.out.println(s2.concat("WORLD"));
        System.out.println(s2.replace('L','W'));
        System.out.println(s3.toLowerCase());
        System.out.println(s1.trim());
        System.out.println(s1.endsWith("O"));
        System.out.println(s1.startsWith("H"));
        s1=s1.concat("world");
        System.out.println(s1);
        System.out.println(s1.contains("HELLO"));

}
}

