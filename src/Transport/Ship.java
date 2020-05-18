package Transport;

public class Ship extends MaritimeMeansOfTransport {
    public void drivingMethod() {
        System.out.println(" 方法9");
    }
    public void load() {
        System.out.println("用起重机装载集装箱到船上");
    }
    public void maintain() {
        System.out.println("轮船维修工维修");
    }
    public void addGas() {
        System.out.println("给轮船发动机加油即可！");
    }
}
