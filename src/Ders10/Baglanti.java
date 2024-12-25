package Ders10;

import java.sql.*;

public class Baglanti {

    private static final String URL = "jdbc:mysql://localhost:3306/newmedipol";
    private static final String USERNAME ="root";
    private static final String PASSWORD = "1234";


    public static void main(String[] args) {
        try{
            Connection conn = getConnection();
            System.out.println("Bağlantı kuruldu");

          //  insertRecord(conn,8,"Deneme","DenemeSoyad","deneme@mail.com");
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
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL,USERNAME,PASSWORD);

    }

}
