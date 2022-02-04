package nick.pack;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание №1: " + task1());
        System.out.println("Задание №2: " + task2());
        System.out.println("Задание №3: " + task3());
        System.out.println("Задание №4: ");
        System.out.println("Задание №5: ");
    }
    public static long task1(){
        /*Расставьте правильно операторы приведения типа,
        чтобы получился ответ: d > 0
         */
        int a = 0;
        int b = a + 46;
        byte c = (byte) (a*b);
        double f = 1234.15;
        long d =(long) (a + f / c + b);
        return d;
    }
    public static double task2(){
        /*
        Расставьте правильно операторы приведения типа,
        чтобы получился ответ: d = 3.765
         */
        int a = 15;
        int b = 4;
        float c = (float) a / b;
        double d = a * 1e-3 + c;
        return d;
    }
    public static int task3(){
        /*
        Добавить одну операцию по преобразованию типа,
        чтобы получался ответ: b = 0
         */
        float f = (float)128.50;
        int i = (int)f;
        int b = i + (int)f;
        return b;
    }
}
