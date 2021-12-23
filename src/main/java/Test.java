import core.Input;
import entities.HinhTron;
import entities.HinhTru;

public class Test {
    public Test(){
        input = new Input();
    }

    public void cauA(){
        HinhTron hinhTron = new HinhTron();

        hinhTron.setBanKinh(
            input.nextDouble("Nhap ban kinh hinh tron: ")
        );

        System.out.println(
            "[=>] Ban kinh hinh tron la: "
            + hinhTron.getBanKinh()
        );

        System.out.println(
            "[=>] Chu vi cua hinh tron la: "
            + hinhTron.tinhChuViHinhTron()
        );

        System.out.println(
            "[=>] Dien tich cua hinh tron la: "
            + hinhTron.tinhDienTichHinhTron()
        );
    }

    public void cauBC(){
        HinhTru hinhTru = new HinhTru();

        hinhTru.setBanKinh(
            input.nextDouble("Nhap ban kinh day hinh tru: ")
        );

        hinhTru.setChieuCao(
            input.nextDouble("Nhap chieu cao hinh tru: ")
        );

        System.out.println(
            "[=>] Ban kinh day hinh tru la: "
            + hinhTru.getBanKinh()
        );

        System.out.println(
            "[=>] Chieu cao hinh tru la: "
            + hinhTru.getChieuCao()
        );

        System.out.println(
            "[=>] Dien tich xung quanh cua hinh tru la: "
            + hinhTru.tinhDienTichXungQuanhHinhTru()
        );

        System.out.println(
            "[=>] Dien tich hai day hinh cua tru la: "
            + hinhTru.tinhDienTichHaiDayHinhTru()
        );

    }

    private final Input input;
}
