package maytinh;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class MayTinh implements IMayTinh {
  private String code;
  private  String name;
  private  double price;

    @Override
    public void inputInfor() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập code");
        code= sc.nextLine();
        System.out.println("Nhập name");
        name= sc.nextLine();
        System.out.println("Nhập price");
        price= sc.nextDouble();

    }

    @Override
    public void displayInfor() {

    }

    @Override
    public void changeInfor() {

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "MayTinh{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
