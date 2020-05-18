package Transport;

public class Motorcycle extends LandTransport {
    public void drivingMethod() {
        System.out.println(" 方法7");
    }
    public void load() {
        System.out.println("摩托车不可以装载哦！");
    }
    public void maintain() {
        System.out.println("摩托车维修店维修");
    }
    public void addGas() {
        System.out.println("去加油站加油即可！");
    }
}
