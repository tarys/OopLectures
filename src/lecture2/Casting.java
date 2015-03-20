package lecture2;

public class Casting {
    {
        int i;
        i = (int) 1;

        // with sign fulfill
        short s=-1;
        int j = (int)s;

        // without sign fulfill
        char c='\uffff';
        int k = (int)c;

        // truncating
        int m =255;
        byte b = (byte)m;

        // truncating from floating point to integer
        double d = 10.5;
        long l = (long) d;

        // TODO Wrappers
        Boolean notAnton = true;
        boolean anton = !notAnton;

    }

    public static void main(String[] args) {
        boolean isAnton = false;

        String nameToPrint = isAnton ? "Anton" : "not Anton";

        System.out.println(nameToPrint);
    }
}















