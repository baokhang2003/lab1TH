/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

/**
 *
 * @author TH
 */
public class LopHocPhan {
    private String maLHP;
    private String tenLHP;
    private String tenGV;
    private String thongTinLopHoc;
    private SinhVien[] dsSV;

    public LopHocPhan(String maLHP, String tenLHP, String tenGV, String thongTinLopHoc, SinhVien[] dsSV) {
        this.maLHP = maLHP;
        this.tenLHP = tenLHP;
        this.tenGV = tenGV;
        this.thongTinLopHoc = thongTinLopHoc;
        this.dsSV = dsSV;
    }

    public String getMaLHP() {
        return maLHP;
    }

    public void setMaLHP(String maLHP) {
        this.maLHP = maLHP;
    }

    public String getTenLHP() {
        return tenLHP;
    }

    public void setTenLHP(String tenLHP) {
        this.tenLHP = tenLHP;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getThongTinLopHoc() {
        return thongTinLopHoc;
    }

    public void setThongTinLopHoc(String thongTinLopHoc) {
        this.thongTinLopHoc = thongTinLopHoc;
    }


    public SinhVien[] getDsSV() {
        return dsSV;
    }

    public void setDsSV(SinhVien[] dsSV) {
        this.dsSV = dsSV;
    }

    public int getSoLuongSV() {
        return dsSV.length;
    }

    @Override
    public String toString() {

        /*String result = "Mã LHP: " + maLHP + "\n"
                + "Tên LHP: " + tenLHP + "\n"
                + "Tên GV: " + tenGV + "\n"
                + "Thông tin lớp học: " + thongTinLopHoc + "\n"
                + "Danh sách sinh viên: \n";
        for (SinhVien sv : dsSV) {
            result += sv.toString() + "\n";
        }
        return result;*/
        StringBuilder sb = new StringBuilder();
        sb.append("Mã LHP: ").append(maLHP).append("\n");
        sb.append("Tên LHP: ").append(tenLHP).append("\n");
        sb.append("Tên GV: ").append(tenGV).append("\n");
        sb.append("Thông tin lớp học: ").append(thongTinLopHoc).append("\n");
        sb.append("Danh sách sinh viên: \n");
        for (SinhVien sv : dsSV) {
            sb.append(sv.toString()).append("\n");
        }
        return sb.toString();
    }
}