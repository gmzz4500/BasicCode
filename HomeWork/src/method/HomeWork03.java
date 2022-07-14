package method;

public class HomeWork03 {
    public static void main(String[] args) {
        Book book = new Book();
        book.updatePrice("三国演义",160);
    }
}
class Book{
    public void updatePrice(String name,double price){
        if(price>150){
            price = 150;
            System.out.println(name+"这本书的价格为:"+price);
        }else if(price>100){
            price=100;
            System.out.println(name+"这本书的价格为:"+price);
        }else{
            System.out.println(name+"这本书的价格为:"+price);
        }
    }
}
