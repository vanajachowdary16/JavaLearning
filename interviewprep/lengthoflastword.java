package interviewprep;

public class lengthoflastword {
    String str="i love java programming   ";
    public void length()
    {
        str=str.trim();
        String[] arr=str.split(" ");
        System.out.println("Length of last word is: "+arr[arr.length-1].length());
    }
    public static void main(String[] args) {
        lengthoflastword obj=new lengthoflastword();
        obj.length();
    }
}
