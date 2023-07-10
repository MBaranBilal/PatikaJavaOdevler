public class Course {
    String name;
    String code;
    String prefix;
    int grade;
    Teacher hoca;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.grade = 0;
    }

    public void addTeacher(Teacher hoca) {
        if (this.prefix.equals(hoca.branch)) {
            this.hoca = hoca;
            System.out.println("Hoca ataması başarılı.");
        } else {
            System.out.println("Hoca bu derse atanamaz. Hoca ve ders içeriği uyuşmuyor.");
        }
    }

    public void printTeacherInfo() {
        hoca.print();
    }
}
