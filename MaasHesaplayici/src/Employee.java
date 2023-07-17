public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        double taxAmount=0;
        if(this.salary>=1000){
            taxAmount=(this.salary*3)/100;   
        }
        return taxAmount;
    }

    public int bonus(){
        if(this.workHours>40){
            int bonusAmount=(workHours-40)*30;
            return bonusAmount;
        }
        else{
            return 0;
        }
    }

    public double raiseSalary(){
        double increment=0;
        if((2021-this.hireYear)<10){
            increment=(this.salary*5)/100;
        }
        else if((2021-this.hireYear>9) && (2021-this.hireYear<20)){
            increment=(this.salary*10)/100;
        }
        else if((2021-this.hireYear>19)){
            increment=(this.salary*15)/100;
        }
        return increment;
    }

    public void yazdir(){
        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("Çalışma saati: "+this.workHours);
        System.out.println("Başlangıç yılı: "+this.hireYear);
        System.out.println("Vergi:"+tax());
        System.out.println("Bonus:"+bonus());
        System.out.println("Maaş artışı: "+raiseSalary());
        System.out.println("Vergiler ve bonuslar ile maaş: "+(this.salary+bonus()-tax()));
        System.out.println("Toplam maaş:"+(this.salary+raiseSalary()));
    }

}
