public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String department;
    private double score;
    
    public Student() {
        this.firstName  = "Unknown";
        this.lastName   = "Unknown";
        this.age        = 0;
        this.department = "None";
        this.score      = 0.0;
    }

    public Student(String firstName, String lastName, int age,
                   String department, double score) {
        this.firstName  = firstName;
        this.lastName   = lastName;
        this.age        = age;
        this.department = department;
        this.score      = score;
    }
    private double calculateBonus() {
        return score * 0.1;
    }
    
    private String evaluatePerformance() {
        if (score >= 90) {
            return "Excellent";
        } else if (score >= 75) {
            return "Good";
        } else if (score >= 60) {
            return "Satisfactory";
        } else {
            return "Needs Improvement";
        }
    }

    public void displayInfo() {
        System.out.println("==============================");
        System.out.println("Нэр       : " + firstName + " " + lastName);
        System.out.println("Нас       : " + age);
        System.out.println("Салбар    : " + department);
        System.out.println("Оноо      : " + score);
        System.out.println("Бонус     : " + calculateBonus());
        System.out.println("Үнэлгээ   : " + evaluatePerformance());
        System.out.println("==============================");
    }

    public static void displaySchoolInfo() {
        System.out.println("Сургууль  : EIT University");
        System.out.println("Хөтөлбөр  : Computer Science / OOP");
    }
}
