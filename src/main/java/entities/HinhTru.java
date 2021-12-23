
package entities;


public class HinhTru extends HinhTron{
    public HinhTru() {
        this.setChieuCao(0d);
    }
    
    public HinhTru(Double _chieuCao) {
        this.setChieuCao(_chieuCao);
    }
    
    public HinhTru(Double _chieuCao, Double _banKinh){
        super(_banKinh);
        this.setChieuCao(_chieuCao);
    }
    
    public Double tinhDienTichXungQuanhHinhTru() {
        return super.tinhChuViHinhTron()*this._chieuCao;
    }
    
    public Double tinhDienTichDayHinhTru(){
        return super.tinhDienTichHinhTron();
    }
    
    public Double tinhDienTichHaiDayHinhTru(){
        return super.tinhDienTichHinhTron()*2;
    }
    
    // _chieuCao >= 0 :: default = 0
    private Double _chieuCao;
    
    public Double getChieuCao() {
        return _chieuCao;
    }

    // _chieuCao >= 0 :: default = 0
    public void setChieuCao(Double _chieuCao) {
        if(_chieuCao < 0) _chieuCao = 0d;
        this._chieuCao = _chieuCao;
    }
}
