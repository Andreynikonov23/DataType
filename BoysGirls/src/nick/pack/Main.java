package nick.pack;

public class Main {
    public static void main(String[] args) {
        Boy boy = new Boy();
        Girl girl = new Girl();
        boy.wife = girl;
        girl.husband = boy;

        System.out.println("Муж девушки: " + boy.NAME);
        System.out.println("Жане мальчика: " + girl.NAME);
    }
}
