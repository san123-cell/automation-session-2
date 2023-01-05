package session2;


public class rbroser {
    public static void main(String[] args) {
        String str;
        str = "Robert Brett Roser";
        String[] result = str.split(" ");
        String f = result[0].substring(0,1);
        String m = result[1].substring(0,1);
        System.out.println(f+"."+m+"."+result[2]);
    }
}
