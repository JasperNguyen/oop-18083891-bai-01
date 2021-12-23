
package entities;

public class HinhTron {
    
    protected static final double PI = 3.14159265359;

    public HinhTron(Double _banKinh) {
        this.setBanKinh(_banKinh);
    }
    
    public HinhTron() {
        this.setBanKinh(0d);
    }
    
    public Double tinhChuViHinhTron() {
        return this._banKinh*2*PI;
    }
    
    public Double tinhDienTichHinhTron(){
        return this._banKinh*this._banKinh*PI;
    }
    
    // _banKinh >= 0 :: default = 0
    private Double _banKinh;

    public Double getBanKinh() {
        return _banKinh;
    }

    // _banKinh >= 0 :: default = 0
    public void setBanKinh(Double _banKinh) {
        if(_banKinh < 0) _banKinh = 0d;
        this._banKinh = _banKinh;
    }
}
