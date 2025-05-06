package Ders10;

import Ders10.JavaDers10.Ogrenciler;

import java.sql.*;

public class Baglanti {

    //ORM Göster
    //hibernate , JPA
    //Entity Framework

    private static final String URL = "jdbc:mysql://localhost:3306/newmedipol";
    private static final String USERNAME ="root";
    private static final String PASSWORD = "1234";


    public static void main(String[] args) {
        try{
            Connection conn = getConnection();
            System.out.println("Bağlantı kuruldu");

          // insertRecord(conn,8,"Deneme","DenemeSoyad","deneme@mail.com");
          // insertRecord(conn,9,"Ahmet","Kuromi","ahmetkuromi@gmail.com");
            /*Ogrenciler og1 = new Ogrenciler(10,"Arif","Mutlu","arifmutlu@gmail.com");
            Baglanti.ogrenciEkle(og1);*/
            Baglanti.ogrenciSil(8);


            selectRecords(conn);
            conn.close();

        }catch (Exception e){
            System.out.println("Bağlantı hatası:" + e.getMessage());

        }


    }


    public static void insertRecord(Connection conn, int ogrid, String ad, String soyad, String mail) throws SQLException {
        String sql = "INSERT INTO ogrenciler (ogrenciid, ogrenciad,ogrencisoyad,ogrencimail) VALUES (?, ?,?,?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, ogrid);
            pstmt.setString(2,ad);
            pstmt.setString(3,soyad);
            pstmt.setString(4, mail);
            pstmt.executeUpdate();
        }
    }


    public static void ogrenciEkle(Ogrenciler ogrenciler){
        String sql = "INSERT INTO ogrenciler (ogrenciid, ogrenciad,ogrencisoyad,ogrencimail) VALUES (?, ?,?,?)";
        try ( Connection connection = Baglanti.getConnection();
              PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setInt(1, ogrenciler.getId());
            pstmt.setString(2,ogrenciler.getAd());
            pstmt.setString(3,ogrenciler.getSoyad());
            pstmt.setString(4, ogrenciler.getEmail());
            pstmt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static void selectRecords(Connection conn){
        String sql = "Select * From ogrenciler";
        try(Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(sql)) {
            while (rs.next()){
                System.out.println("ID: " + rs.getInt("ogrenciid") + "Ad: " + rs.getString("ogrenciad")+ "Soyad: " + rs.getString("ogrencisoyad")+ "Mail: "+ rs.getString("ogrencimail"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } ;

    }

    public static void ogrenciSil(int id) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM ogrenciler WHERE ogrenciid = ?";
        try(Connection connection = Baglanti.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setInt(1,id);
            int etkilenenSatir = preparedStatement.executeUpdate();
            if (etkilenenSatir > 0 ){
                System.out.println("Öğrenci başarıyla silindi" + id);
                            }
            else{
                System.out.println("Belirtilen ID de öğrenci bulunamadı");
            }


        }
    }

    public static void ogrenciGuncelle (Ogrenciler ogrenciler) throws SQLException, ClassNotFoundException {
        String sql ="UPDATE ogrenciler SET ogrenciad = ?, ogrencisoyad = ? , ogrencimail = ? WHERE ogrenciid = ?";
        try(Connection connection = Baglanti.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1,ogrenciler.getAd());
            preparedStatement.setString(2,ogrenciler.getSoyad());
            preparedStatement.setString(3,ogrenciler.getEmail());
            preparedStatement.setInt(4,ogrenciler.getId());
            int etkilenenSatir = preparedStatement.executeUpdate();
            if (etkilenenSatir > 0 ){
                System.out.println("Öğrenci başarıyla güncellendi" + ogrenciler.getId());
            }
            else{
                System.out.println("Belirtilen ID de öğrenci bulunamadı");
            }


        }


    }
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL,USERNAME,PASSWORD);

    }

}
