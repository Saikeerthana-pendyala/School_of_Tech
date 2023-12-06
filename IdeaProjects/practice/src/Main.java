// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*String location="Tokyo";
        int flightnumber=175;
        StringBuilder sb= new StringBuilder();
        sb.append("I flew to ");
        sb.append(location);
        sb.append(" on flight #");
        sb.append(flightnumber);
        String message=sb.toString();
        System.out.println(message);
        String time="9:00";
        int pos=sb.indexOf("on");
        sb.insert(pos," at ");
        sb.insert(pos+4,time);
        message=sb.toString();
        System.out.println(message);*/

        int ival=32768;
        String s1=String.format("%,d",ival);
        System.out.println(s1f);
        String s2=String.format("%#-8x",ival);
        System.out.println(s2);
    }
}