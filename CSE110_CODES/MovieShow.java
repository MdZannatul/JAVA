public class MovieShow {
    int age;
    boolean withParent;
    int money;

    public MovieShow(int age, boolean withParent, int money){
        this.age=age;
        this.withParent=withParent;
        this.money=money;
    }

    void setAge(int age){
        this.age = age;
    }

    void setWithParent(boolean withParent){
        this.withParent = withParent;
    }

    void setMoney(int money){
        this.money = money;
    }

    void permittedShow(){
        if(age<13 ){
            System.out.println("G");
        }

        else if(age<13 && withParent==true){
            System.out.println("G,PG");
        }

        else if(age>=13 && age<16){
            System.out.println("G,PG");
        }

        else if(age<16 && withParent==true){
            System.out.println("G1,PG,R");
        }
        else if(age>=16){
            System.out.println("G2,PG,R");
        }

    }
}
