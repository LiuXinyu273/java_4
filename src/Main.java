import Transport.Ship;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Person person=new Person();//实例化一个人
        person.setId("201902177");
        person.setP_Name("小宇");
        person.setP_Age(18);
        person.setP_Sex("男");
        //初始化信息
        Ship ship = new Ship();//初始化一艘轮船
        ship.setTransport_name("Fixie Ship");
        ship.setOwnership("小宇");
        ship.setGpsPosition("东南");
        ship.setPrice("五百万人民币");
        System.out.println("Id:"+person.getId()+"  姓名："+person.getP_Name());
        System.out.println("年龄："+person.getP_Age()+"  性别："+person.getP_Sex());

        person.driveTransport(ship);//人驾驶船
    }
}
