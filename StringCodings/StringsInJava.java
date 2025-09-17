package StringCodings;

class StringsInJava {
    public static void main(String[] args) {
    String s = "example";
    String reverse="";
    for(int i=s.length()-1;i>=0; i--){
        reverse= reverse+ s.charAt(i);
    }
    System.out.println(reverse);
    System.out.println(reverse.toUpperCase());
    System.out.println(reverse.toLowerCase());
    System.out.println(s.indexOf("a"));
    System.out.println(s.isEmpty());
    System.out.println(s.isBlank());
    char[] newChar = s.toCharArray();
    System.out.println(newChar[1]);
    String secondstring = "exaample";
    System.out.println(s.equalsIgnoreCase(secondstring));
    System.out.println(s+" "+secondstring);
    System.out.println(s.concat(secondstring));
    String x="10";
    String y = s+x;
    System.out.println(y);
    System.out.println("learning double quotes\"represents double quotes\"");
    System.out.println("representing \'singlequote\'");
    System.out.println("representing \\ backslash ");
    System.out.println("next\nline ");
    System.out.println("test\ttab");
    System.out.println(s.lastIndexOf("a"));

    String str="Automation";
    StringBuilder reversedString = new StringBuilder(str).reverse();
    System.out.println("reversed string is - "+reversedString);
    
}
}