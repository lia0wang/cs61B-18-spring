public class LargerDemo {
    public static int larger(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println(larger(-5, 10));
    }
}

/*
1. Functions must be declared as part of a class in Java.
   A function that is part of a class is called a "method".
   Sp in Java, all functions are methods.
2. To define a function in Java, we use "public static"
   We will see alternate ways of defining functions later.
3. All parameters of a function must have a declared type, 
   and the return value of the function must have a declared type.
4. Functions in Java return only one value.
*/
