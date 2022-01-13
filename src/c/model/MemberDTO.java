package c.model;

import java.util.Objects;

public class MemberDTO {
    public String name;
    public String phone;
    public String email;
    public static int no;

    public MemberDTO() {
    }

    public static void changeNo(){
        no += 1;
    }

    public MemberDTO(String name, String phone, String email){
        this.name= name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println(this);
        System.out.println(o);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberDTO toString = (MemberDTO) o;
        return Objects.equals(name, toString.name) && Objects.equals(phone, toString.phone) && Objects.equals(email, toString.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, email);
    }
}
