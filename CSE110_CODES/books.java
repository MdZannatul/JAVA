public class books {
    String author;
    String title;
    int price;
    int stock;

    public books(String a1, String t1, int p1, int s1){
        author = a1;
        title = t1;
        price = p1;
        stock = s1;
    }

    void searchBooks(String a2, String t2){
        String a=a2;
        String t=t2;

        if(title.equals(t)){
            System.out.println("The book is available");
        }
        else {
            System.out.println("Book not available");
        }

    }

    void cost(int s2){
        int s=s2;
        int finalPrice = price*s2;

        if(s2<=stock){
            System.out.println("Your total cost is "+finalPrice+"$");
        }
        else{
            System.out.println("Required copies are not in stock");
        }
    }
}
