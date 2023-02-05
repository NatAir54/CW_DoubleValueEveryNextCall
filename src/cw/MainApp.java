package cw;

/* This kata is about static method that should return different values.
 * On the first call it must be 1, on the second and others - it must be a double from previous value.
 */

public class MainApp {
    public static int number;
    public static int counter = 1;

    public static void main(String[] args) {
        System.out.println(getNumber());
        System.out.println(getNumber());
        System.out.println(getNumber());
        System.out.println(getNumber());
        System.out.println(getNumber());
    }

    public static int getNumber() {
        if (counter == 1) {
            number = 1;
        } else {
            number <<= 1;
        }
        counter++;
        return number;
    }
}
