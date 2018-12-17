package sunic.com.model;

/**
 * Sunic
 * Created by szp
 * on 2018.12.17
 */
public class PhoneDto {
    //联系人姓名
    private String name;
    //电话号码
    private String telPhone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelPhone() {
        return telPhone;
    }

    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }

    public PhoneDto() {
    }

    public PhoneDto(String name, String telPhone) {
        this.name = name;
        this.telPhone = telPhone;
    }


    @Override
    public String toString() {
        return "PhoneDto{" +
                "name='" + name + '\'' +
                ", telPhone='" + telPhone + '\'' +
                '}';
    }
}
