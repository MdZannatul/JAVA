public class Book {
    private int NumOfType;

    public Book(){

    }

    public void display(int B){
        System.out.println("Book number is "+ getNumOfType());
    }

    public void setNumOfType(int n){
        this.NumOfType = n;
    }

    public int getNumOfType(){
        return NumOfType;
    }
}

class Fiction extends Book{
    public void display(int f){
        super.display(1);
        System.out.println("Generally, fiction novels are stories that are not true, that never happened.\n");
    }
}

class NonFiction extends Book{
    public void display(int nf){
        super.display(2);
        System.out.println("Non-fiction novels are true stories that happened to real people.\n");
    }
}

class Autobiography extends Book{
    public void display(int a){
        super.display(3);
        System.out.println("Autobiography is the biography of a person narrated by himself or herself.\n");
    }
}

class Biography extends Book{
    public void display(int b){
        super.display(4);
        System.out.println("A biography is an account of somebody's life written by somebody else, " +
                "complete with details of the most important parts.\n");
    }
}

class mainBook {
    public static void main(String[] args) {
        Fiction f = new Fiction();
        f.setNumOfType(1);
        f.display(f.getNumOfType());

        NonFiction nf = new NonFiction();
        nf.setNumOfType(2);
        nf.display(nf.getNumOfType());

        Autobiography a = new Autobiography();
        a.setNumOfType(3);
        a.display(a.getNumOfType());

        Biography b = new Biography();
        b.setNumOfType(4);
        b.display(a.getNumOfType());

    }
}