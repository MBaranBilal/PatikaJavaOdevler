public class Teacher {
    String name;
    String phoneNum;
    String branch;

    Teacher(String name,String phoneNum,String branch){
        this.name=name;
        this.phoneNum=phoneNum;
        this.branch=branch;
    }

    void print(){
        System.out.println("İsim:"+this.name);
        System.out.println("Telefon Numarası:"+this.phoneNum);
        System.out.println("Bölüm:"+this.branch);
    }
}
