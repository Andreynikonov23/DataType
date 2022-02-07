package nick.pack;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание №1: " + task1());
        System.out.println("Задание №2: " + task2());
        System.out.println("Задание №3: " + task3());
        System.out.println("Задание №4: " + task4());
        System.out.println("Задание №5: " + task5());
        System.out.println("Задание №6: " + task6());
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
        int b = (byte)(i + f);
        return b;
    }
    public static char task4(){
        /*
        Добавить одну операцию по преобразованию типа,
        чтобы получался ответ: nine = 9
         */
        short number = 9;
        char zero = '0';
        int nine = (zero + number);
        return (char) nine;
    }
    public static short task5(){
        /*
        Расставьте правильно операторы приведения типа,
        чтобы получился ответ: c = 256
         */
        int a = (byte)44;
        int b = 300;
        short c = (short) (b - a);
        return c;
    }
    public static double task6(){
        /*
        Добавить одну операцию по преобразованию типа,
        чтобы получался ответ: d=2.941.
        Пример вывода: 2.9411764705882355
         */
        int a = 50;
        int b = 17;
        double d =(double) a / b;
        return d;
    }
}
