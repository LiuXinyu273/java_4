import Transport.Transport;

public class Person {
    private int P_Age;
    private String p_Sex;
    private String id;
    private String p_Name;

    public void driveTransport(Transport transport_name){System.out.println(" 正在驾驶："+transport_name.getTransport_name()+" 当前位置："+transport_name.getGpsPosition());
    System.out.println("价格："+transport_name.getPrice()+"  拥有者："+transport_name.getOwnership());
    System.out.print(transport_name.getTransport_name()+"的驾驶方法：");
    transport_name.drivingMethod();
    System.out.print(transport_name.getTransport_name()+"的加油方法：");
    transport_name.addGas();
    System.out.print(transport_name.getTransport_name()+"的装载方法：");
    transport_name.load();
    System.out.print(transport_name.getTransport_name()+"的维修方法：");
    transport_name.maintain();
    }

    public Person() {
    }

    public int getP_Age() {
        return P_Age;
    }

    public void setP_Age(int p_Age) {
        P_Age = p_Age;
    }

    public String getP_Sex() {
        return p_Sex;
    }

    public void setP_Sex(String p_Sex) {
        this.p_Sex = p_Sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getP_Name() {
        return p_Name;
    }

    public void setP_Name(String p_Name) {
        this.p_Name = p_Name;
    }
}
