/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlphimvaxuatchieu;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class QLPhimVaSuatChieu {
   private List<Phim> danhSachPhim;
    private Scanner scanner;
    
    

    public QLPhimVaSuatChieu() {
        danhSachPhim = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public List<Phim> getDanhSachPhim() {
        return danhSachPhim;
    }

    public void setDanhSachPhim(List<Phim> danhSachPhim) {
        this.danhSachPhim = danhSachPhim;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    public void docFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Assuming each line in the file represents a movie in a specific format
                // e.g., "maPhim,tenPhim,daoDien,namSanXuat,suatChieu,moTa,ngayKhoiChieu,ngayKetThuc"
                String[] parts = line.split(",");
                if (parts.length == 8) {
                    int maPhim = Integer.parseInt(parts[0]);
                    String tenPhim = parts[1];
                    String daoDien = parts[2];
                    int namSanXuat = Integer.parseInt(parts[3]);
                    String suatChieu = parts[4];
                    String moTa = parts[5];
                    String ngayKhoiChieu = parts[6];
                    String ngayKetThuc = parts[7];

                    Phim phim = new Phim(maPhim, tenPhim, daoDien, namSanXuat, suatChieu, moTa, ngayKhoiChieu, ngayKetThuc);
                    danhSachPhim.add(phim);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        public void ghiFile(String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (Phim phim : danhSachPhim) {
                // Assuming the same format as in docFile method
                String line = phim.getMaPhim() + "," + phim.getTenPhim() + "," + phim.getDaoDien() + "," +
                              phim.getNamSanXuat() + "," + phim.getSuatChieu() + "," + phim.getMoTa() + "," +
                              phim.getNgayKhoiChieu() + "," + phim.getNgayKetThuc();
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        
    public void themPhimVaSuatChieu() {
        try {
            System.out.println("Nhập thông tin phim:");
//            System.out.print("Mã Phim: ");
            int maPhim = Integer.parseInt(scanner.nextLine());

            System.out.print("Tên Phim: ");
            String tenPhim = scanner.nextLine();

            System.out.print("Đạo diễn: ");
            String daoDien = scanner.nextLine();

            System.out.print("Năm sản xuất: ");
            int namSanXuat = Integer.parseInt(scanner.nextLine());

            System.out.print("Suất chiêu: ");
            String suatChieu = scanner.nextLine();
            
            System.out.print("Mô tả: ");
            String moTa = scanner.nextLine();

            System.out.print("Ngày khởi chiếu (dd/MM/yyyy): ");
            String ngayKhoiChieu = scanner.nextLine();

            System.out.print("Ngày kết thúc (dd/MM/yyyy): ");
            String ngayKetThuc = scanner.nextLine();
            

            Phim phim = new Phim(maPhim, tenPhim, daoDien, namSanXuat, moTa,suatChieu, ngayKhoiChieu, ngayKetThuc);
            danhSachPhim.add(phim);

            System.out.println("Đã thêm phim thành công.");
        } catch (NumberFormatException e) {
            System.out.println("Dữ liệu nhập vào không hợp lệ. Vui lòng thử lại.");
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi. Vui lòng thử lại.");
        }
    }
   
    public void hienThiThongTin() {
        System.out.println("\nDanh sách phim:");
        for (Phim phim : danhSachPhim) {
            System.out.println(phim.toString());
        }
    }

    public void timKiemPhimTheoTen() {
        scanner.nextLine(); // Đọc ký tự newline
        System.out.print("Nhập tên phim cần tìm: ");
        String tenPhimCanTim = scanner.nextLine();
        boolean timThay = false;

        for (Phim phim : danhSachPhim) {
            if (phim.getTenPhim().equalsIgnoreCase(tenPhimCanTim)) {
                System.out.println("Phim được tìm thấy:");
                System.out.println(phim.toString());
                timThay = true;
                break;
            }
        }

        if (!timThay) {
            System.out.println("Không tìm thấy phim có tên '" + tenPhimCanTim + "'.");
        }
    }

    public void xoaPhim() {
        if (danhSachPhim.isEmpty()) {
            System.out.println("Danh sách phim trống.");
            return;
        }

        System.out.println("Danh sách phim:");
        for (int i = 0; i < danhSachPhim.size(); i++) {
            System.out.println((i + 1) + ". " + danhSachPhim.get(i).getTenPhim());
        }

        System.out.print("Nhập số thứ tự của phim cần xóa: ");
        int indexPhim = Integer.parseInt(scanner.nextLine());

        if (indexPhim < 1 || indexPhim > danhSachPhim.size()) {
            System.out.println("Số thứ tự không hợp lệ.");
            return;
        }

        Phim phimCanXoa = danhSachPhim.get(indexPhim - 1);
        danhSachPhim.remove(phimCanXoa);

        System.out.println("Đã xóa phim thành công.");
    }

    public void suaThongTinPhim() {
        if (danhSachPhim.isEmpty()) {
            System.out.println("Danh sách phim trống.");
            return;
        }

        System.out.println("Danh sách phim:");
        for (int i = 0; i < danhSachPhim.size(); i++) {
            System.out.println((i + 1) + ". " + danhSachPhim.get(i).getTenPhim());
        }

        System.out.print("Nhập số thứ tự của phim cần sửa: ");
        int indexPhim = Integer.parseInt(scanner.nextLine());

        if (indexPhim < 1 || indexPhim > danhSachPhim.size()) {
            System.out.println("Số thứ tự không hợp lệ.");
            return;
        }

        Phim phimCanSua = danhSachPhim.get(indexPhim - 1);

        System.out.print("Nhập tên mới cho phim: ");
        String tenMoi = scanner.nextLine();
        phimCanSua.setTenPhim(tenMoi);

        System.out.print("Nhập năm sản xuất mới cho phim: ");
        int namSanXuatMoi = Integer.parseInt(scanner.nextLine());
        phimCanSua.setNamSanXuat(namSanXuatMoi);

        System.out.println("Thông tin phim đã được cập nhật thành công.");
    }

    public void thoat() {
        scanner.close();
        System.out.println("Ứng dụng đã kết thúc.");
        System.exit(0);
    }  
}
