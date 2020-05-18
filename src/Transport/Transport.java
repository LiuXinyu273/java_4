package Transport;

import javax.xml.crypto.Data;

public abstract class Transport {
    private String ownership;
    private String GpsPosition;
    private String Transport_name;
    private Data dataOfPuchase;
    private String price;

    public Transport() {
    }
    public  Transport(String Transport_name){
        this.Transport_name = Transport_name;
    }
    public abstract void drivingMethod();
    public abstract void load();
    public abstract void maintain();
    public abstract void addGas();



    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getGpsPosition() {
        return GpsPosition;
    }

    public void setGpsPosition(String gpsPosition) {
        GpsPosition = gpsPosition;
    }

    public String getTransport_name() {
        return Transport_name;
    }

    public void setTransport_name(String transport_name) {
        Transport_name = transport_name;
    }

    public Data getDataOfPuchase() {
        return dataOfPuchase;
    }

    public void setDataOfPuchase(Data dataOfPuchase) {
        this.dataOfPuchase = dataOfPuchase;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
