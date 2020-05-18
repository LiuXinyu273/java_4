package Transport;

public class Bicycle extends LandTransport {
    public void drivingMethod() {
        System.out.println(" 方法5");
    }
    public void load() {
        System.out.println("自行车可以装载少量货物");
    }
    public void maintain() {
        System.out.println("需要定期保养，通过自己或专业人士维修");
    }
    public void addGas() {
        System.out.println("靠脚发力，每公里0耗油");
    }
}
