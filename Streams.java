import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args){

     ArrayList<String> names = new ArrayList<String>();
    names.add("Abhay");
    names.add("kaavi");
    names.add("venkat");
    names.add("vinee");
    names.add("anu");
    Long c = names.stream().filter(s->s.startsWith("a")).count();
    System.out.println(c);
    Long d = Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->
    {
        s.startsWith("A");
        return true;
    }).count();

    System.out.println(d);
    names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
    names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
    //streammap
System.out.println("practicing more******************************************************with maps and sorting");
    Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
    .forEach(s->System.out.println(s));
    System.out.println("*************/////***********");
    //print names which has first letter as A and with uppercase sorted
   List<String> names1= Arrays.asList("Abhijeet","Don","Alekhya","Adam","Ram");
   names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));

   System.out.println("concating two arrays-------------------------");
   Stream<String> newStream =Stream.concat(names.stream(), names1.stream());
   //newStream.sorted().forEach(s->System.out.println(s));

   System.out.println("match method-----------------------------");

    boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
    System.out.println(flag);


     System.out.println("/////////////collect////////////");

      List<String> ls =Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
    System.out.println(ls.get(0));

    List<Integer> values = Arrays.asList(6,2,3,1,4,5,2,3,4,6,7,8,9,10);

    values.stream().distinct().sorted().forEach(s->System.out.println(s));

    List<Integer> li= values.stream().distinct().sorted().collect(Collectors.toList());

    System.out.println(li.get(3));

}

}
