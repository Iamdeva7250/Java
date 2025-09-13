public class StringDataTypes {
    public static void main(String[] args) {
//        int a = 1;
//        char c = 'a';
//        boolean isPassed =  true;
//        String b = new String("ram");
//        System.out.println(b);
//
//        String name = "Devanand";  // Sequence of Characters
//        System.out.println(name);

        String name = "Devanand Singh";
        int length = name.length();
        System.out.println(length);
        char c = name.charAt(5);
        char d = name.charAt(length - 1);
        System.out.println(c);
        System.out.println(d);

        String name2 = "Devanand singh";
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase((name2)));



        String str1 = "remote";
        String str2 = "car";
//        System.out.println('r' + 0 );
//        System.out.println('c' + 0 );
        int i = str1.compareTo(str2);
//        System.out.println(i);


        String e = "referf";
        String f = "REFERF";
//       System.out.println(e.compareToIgnoreCase(f));

        String name1 = "Deva Singh";
        String substring = name.substring( 8);
        System.out.println(substring);
        System.out.println(name1);

        System.out.println(name1.toUpperCase( ));
        System.out.println(name1.trim());
        System.out.println(name1.toLowerCase());

        String newName = name.replace("Singh", "Rajput");
        System.out.println(newName);

        System.out.println(name1.contains("p"));
        System.out.println(name1.contains("D"));
        System.out.println(name1.startsWith("Dev"));
        System.out.println(name1.endsWith("ingh"));
        System.out.println(str1.isBlank());
        System.out.println(str1.isEmpty());


    }

}





