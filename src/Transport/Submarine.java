package Transport;

public class Submarine extends MaritimeMeansOfTransport {
    public void drivingMethod() {
        System.out.println(" 方法1");
    }
    public void load() {
        System.out.println("潜艇一般不装载货物");
    }
    public void maintain() {
        System.out.println("专门的潜艇维修工人维修");
    }
    public void addGas() {
        System.out.println("给发动机加油即可！");
    }
}
