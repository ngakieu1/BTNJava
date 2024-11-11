public class Main {
    public record TacGia(String tenTacGia, int namSinh) {}
    public record NhaXuatBan(String ten, int namXuatBan) {}
    public record Sach(String tieuDe, TacGia tacGia, NhaXuatBan nhaXuatBan, double gia) {}

    public static void main(String[] args) {
        // Tao the hien cua TacGia va NhaXuatBan
        TacGia tacGia = new TacGia("Jane Austen", 1775);
        TacGia tacGia2 = new TacGia("Rupi Kaur", 1992);
        NhaXuatBan nhaXuatBan = new NhaXuatBan("Vintage Books", 1854);
        NhaXuatBan nhaXuatBan2 = new NhaXuatBan("New York Times", 2014);
        // Tao cac the hien cua Sach
        Sach sach = new Sach("Pride and Prejudice", tacGia, nhaXuatBan, 19.99);
        Sach sach2 = new Sach("Milk and Honey", tacGia2, nhaXuatBan2, 39.99);

        // Su dung pattern matching de truy xuat thong tin cua sach
        if (sach instanceof Sach(String tieuDe, TacGia(String tenTacGia, _), NhaXuatBan(_, int namXuatBan), _)) {
            System.out.println("Tieu de: " + tieuDe);
            System.out.println("Tac gia: " + tenTacGia);
            System.out.println("Nam xuat ban: " + namXuatBan);
        }

        // Su dung pattern matching de truy xuat thong tin cua sach2
        if (sach2 instanceof Sach(String tieuDe, TacGia(String tenTacGia, _), NhaXuatBan(_, int namXuatBan), _)) {
            System.out.println("Tieu de: " + tieuDe);
            System.out.println("Tac gia: " + tenTacGia);
            System.out.println("Nam xuat ban: " + namXuatBan);
        }
    }
}