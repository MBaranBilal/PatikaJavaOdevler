public class App {
    public static void main(String[] args) throws Exception {
        Teacher hoca1 = new Teacher("Mahfuz", "555333", "BIL");
        Teacher hoca2 = new Teacher("Sude", "0000", "FZK");
        Teacher hoca3 = new Teacher("Emin", "3333", "MAT");

        Course bil101 = new Course("Bilgisayar101", "103", "BIL");
        bil101.addTeacher(hoca1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(hoca2);

        Course matematik = new Course("Matematik", "101", "MAT");
        matematik.addTeacher(hoca3);

        Student s1 = new Student("Baran", "1399", "2", bil101, fizik, matematik);
        s1.addBulkExamNote(100, 80, 90);
        s1.printNote();
        s1.isPass();
        s1.belge();

    }
}
