package behavioral.observer;

import java.util.Random;

public class Promocode {
    private String id;
    private String nameShop;
    private String code;

    public Promocode(String nameShop, String code) {
        this.nameShop = nameShop;
        this.code = code;
        setId();
    }

    public String getNameShop() {
        return nameShop;
    }

    public void setNameShop(String nameShop) {
        this.nameShop = nameShop;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    private void setId() {
        this.id = String.valueOf((new Random().nextInt() * 100000));
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Promocode{" +
                "nameShop='" + nameShop + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
