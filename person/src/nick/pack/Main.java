package nick.pack;

public class Main {
    public static void main(String[] args) {
        PersonData personData = new PersonData();
        personData.setRole("Слесарь");
        personData.setSalary(3000);
        System.out.println("ФИО: " + personData.getName());
        System.out.println("Должность: " + personData.getRole());
        System.out.println("Зар. плата: " + personData.getSalary());
    }
}
