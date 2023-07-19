package maytinh.dell;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import maytinh.MayTinh;

import java.util.Scanner;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dell extends MayTinh {
    private int warranty;

    @Override
    public void inputInfor() {
        super.inputInfor();
        System.out.println("Warranty");
        Scanner sc=new Scanner(System.in);
        warranty=Integer.parseInt(sc.nextLine());

    }

    @Override
    public void displayInfor() {
        super.displayInfor();
        System.out.println(warranty+ "");
    }


}
