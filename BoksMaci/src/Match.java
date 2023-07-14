import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxweight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxweight = maxWeight;
    }

    public void run() {
        if (isCheck()) {
            int round=1;
            Random rnd=new Random();
            int rastgele=rnd.nextInt(2);
            if(rastgele==0){
                while(this.f1.health>0 && this.f2.health>0){
                System.out.println("==== "+round+". ROUND ====");
                round++;
                
                    this.f2.health=this.f1.hit(this.f2);
                    System.out.println(this.f2.name+":"+this.f2.health);
                    if(isWin()){
                        break;
                    }
                
                
                    this.f1.health=this.f2.hit(this.f1);
                    System.out.println(this.f1.name+":"+this.f1.health);
                    if(isWin()){
                        break;
                    }
            }
            }

            if(rastgele==1){
                while(this.f1.health>0 && this.f2.health>0){
                System.out.println("==== "+round+". ROUND ====");
                round++;

                    this.f1.health=this.f2.hit(this.f1);
                    System.out.println(this.f1.name+":"+this.f1.health);
                    if(isWin()){
                        break;
                    }
                
                    this.f2.health=this.f1.hit(this.f2);
                    System.out.println(this.f2.name+":"+this.f2.health);
                    if(isWin()){
                        break;
                    }
                }
            
            } 
        }
        else {
            System.out.println("Boksörlerin sikletleri uyuşmuyor.");
        }
    }

    public boolean isCheck() {
        return ((this.f1.weight >= minWeight && this.f1.weight <= maxweight)
                && (this.f2.weight >= minWeight && this.f2.weight <= maxweight));
    }

    public boolean isWin(){
        if(this.f1.health==0){
            System.out.println(this.f2.name+" kazandı !");
            return true;
        }

        if(this.f2.health==0){
            System.out.println(this.f1.name+" kazandı !");
            return true;
        }

        return false;
    }

}
