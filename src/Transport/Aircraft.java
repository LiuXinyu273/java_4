package Transport;

public class Aircraft extends AirTransport {
    public void drivingMethod() {
        System.out.println(" 方法2");
    }
    public void load() {
        System.out.println("用运输机器装载");
    }
    public void maintain() {
        System.out.println("飞机维修工维修");
    }
    public void addGas() {
        System.out.println("给发动机加油即可！");
    }
}
