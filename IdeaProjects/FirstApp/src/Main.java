// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    /*
        this is a block
        comment */
    public static void main(String[] args) {
        int value1=5;
        int value2=5;
        int minvalue=value1<value2?value1:value2;
        System.out.println(minvalue);

        if(value1>value2)
            System.out.println("Value1 is greater");
        else if(value1<value2)
            System.out.println("Value2 is greater");
        else if(value1==value2)
            System.out.println("Both are equal");
    }
}