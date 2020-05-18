package Transport;

public class Automobile extends LandTransport{
    public void drivingMethod() {
        System.out.println(" 方法5");
    }
    public void load() {
        System.out.println("汽车一般不装载货物");
    }
    public void maintain() {
        System.out.println("去4S店维修");
    }
    public void addGas() {
        System.out.println("去加油站加油即可！");
    }
}
