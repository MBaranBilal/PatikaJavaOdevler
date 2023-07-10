public class Student {
    String name;
    String stuNo;
    String classes;

    Course c1;
    Course c2;
    Course c3;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    public void addBulkExamNote(int note1, int note2, int note3) {
        if ((note1 > 0 && note1 <= 100) && (note2 > 0 && note2 <= 100) && (note3 > 0 && note3 <= 100)) {
            this.c1.grade = note1;
            this.c2.grade = note2;
            this.c3.grade = note3;
        } else {
            System.out.println("Girilen notlar 0 ve 100 aralığında olmalı.Notları düzenleyiniz.");
        }
    }

    public void printNote() {
        System.out.println("Ders adı:" + c1.name + " Ders notu:" + this.c1.grade);
        System.out.println("Ders adı:" + c2.name + " Ders notu:" + this.c2.grade);
        System.out.println("Ders adı:" + c3.name + " Ders notu:" + this.c3.grade);
        System.out.println("Not ortalamanız:" + this.avarage);
    }

    public void isPass() {
        this.avarage = (this.c1.grade + this.c2.grade + this.c3.grade) / 3.0;

        if (this.avarage >= 55) {
            System.out.println("Öğrenci sınıfı geçti. Not ortalaması:" + this.avarage);
            this.isPass = true;
        } else {
            System.out.println("Öğrenci sınıfta kaldı. Not ortalaması:" + this.avarage);
        }
    }

    public void belge() {
        if (this.isPass) {
            System.out.println("Sınıfı başarıyla geçtiğiniz için Onur Belgesi almaya hak kazandınız.");
        } else {
            System.out.println("Sınıfı geçemediğiniz için bir belge almadınız.");
        }
    }
}
