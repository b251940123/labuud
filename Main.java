public class Main {
    public static void main(String[] args) {

        // Static method – объекттой холбоотой нийтлэг мэдээлэл
        Student.displaySchoolInfo();
        System.out.println();

        // Default constructor ашиглан объект үүсгэх
        Student student1 = new Student();
        System.out.println("--- Default constructor ---");
        student1.displayInfo();

        // Parameterized constructor ашиглан объект үүсгэх
        Student student2 = new Student("Болд", "Баатар", 20, "Мэдээллийн технологи", 92.5);
        System.out.println("--- Parameterized constructor ---");
        student2.displayInfo();

        Student student3 = new Student("Сараа", "Нарантуяа", 21, "Бизнесийн удирдлага", 78.0);
        System.out.println("--- Parameterized constructor ---");
        student3.displayInfo();

        Student student4 = new Student("Энхбаяр", "Дорж", 19, "Эдийн засаг", 55.0);
        System.out.println("--- Parameterized constructor ---");
        student4.displayInfo();
    }
}
