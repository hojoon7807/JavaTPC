package c.inheritance;

public class ToString {
    public String name;
    public String phone;
    public String email;

    public ToString() {
    }

    public ToString(String name, String phone, String email){
        this.name= name;
        this.phone = phone;
        this.email = email;
    }

    public static void main(String[] args) {
        ToString thisObject = new ToString("hojoon","010-4141-5151","dsfa@naver.com");
        thisObject.toStringMethod(thisObject);
    }

    public void toStringMethod(Object obj){
        System.out.println(obj);
        System.out.println(obj.toString());
        System.out.println("plus"+obj);
    }

    @Override
    public String toString() {
        return "ToString{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
