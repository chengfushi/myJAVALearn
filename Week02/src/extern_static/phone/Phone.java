package extern_static.phone;
/*手机类Phone
属性:品牌brand,价格price
无参构造,有参构造
行为:打电话call,发短信sendMessage,玩游戏playGame
*/
public class Phone {
    private String brand;
    private double price;

    public Phone (){}

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void call() {
        System.out.println("打电话");
    }

    public void sendMessage() {
        System.out.println("发短信");
    }

    public void playGame() {
        System.out.println("玩游戏");
    }
}
