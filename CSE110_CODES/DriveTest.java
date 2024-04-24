public class DriveTest {
    int Age;

    public DriveTest(int age){
        this.Age = age;
    }

    void setAge(int age){
        Age = age;
    }

    void driveStatus(){
        if(Age<16){
            System.out.println("Too young to drive");
        }
        else if(Age==16){
            System.out.println("Better clear the road");
        }
        else if(Age>16){
            System.out.println("You are getting old");
        }
    }
}
