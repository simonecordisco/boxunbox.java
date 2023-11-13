public class Main {
    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 2;
        somma(num1, num2);

        char carattere = 'X';
        stampacarattere(carattere);

        Integer intObj1 = 1;
        Integer intObj2 = 2;
        sominteger(intObj1, intObj2);

        Character charObj = 'B';
        stampacar(charObj);

        int intPrimitivo = 14;
        double doublePrimitivo = 9.94;
        char charPrimitivo = 'Y';

        Integer intAutoboxed = intPrimitivo;
        Double doubleAutoboxed = doublePrimitivo;
        Character charAutoboxed = charPrimitivo;
        System.out.println(intPrimitivo);
        System.out.println(doublePrimitivo);
        System.out.println(charPrimitivo);


        Integer intObj = 100;
        Double doubleObj = 14.9;
        Character charObj2 = 'Z';

        int intUnboxed = intObj;
        double doubleUnboxed = doubleObj;
        char charUnboxed = charObj2;
        System.out.println(intObj);
        System.out.println(doubleObj);
        System.out.println(charObj2);
    }
    public static void somma(int a, int b)
    {
        System.out.println("La somma è: " + (a + b));
    }
    public static void stampacarattere(char c)
    {
        System.out.println("Il carattere è: " + c);
    }
    public static void sominteger(Integer a, Integer b) {

        System.out.println("La somma Integer è: " + (a + b));
    }
    public static void stampacar(Character c) {

        System.out.println("Il carattere è: " + c);
    }
}