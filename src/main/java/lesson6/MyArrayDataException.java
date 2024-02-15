package lesson6;

public class MyArrayDataException extends Exception{
    public MyArrayDataException(int i, int j, String a) {
        super("Casting String to Integer failed for element " + "[" + i + "]" + "[" + j + "] " + "\"" + a + "\"");
    }
}