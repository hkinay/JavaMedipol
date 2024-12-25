package Ders10.JavaDers10.src.main.java.org.example;

import com.mysql.jdbc.Driver;

import javax.sql.DataSource;
import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private String userName = "root";
    private String password ="1234";
    private String db_ismi = "ilerijava";

    private String host = "localhost";

    private int port = 3306;

    private Connection con = null;

    private  Statement statement = null;

    public Main(){
        String connectionUrl = "jdbc:mysql://" + host + ":" + port + "/"+db_ismi+"?useUnicode=true&characterEncoding=utf8";

       //DRIVER KAYDETME GEREKSİZ
        /*try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }*/

        try {
            con = DriverManager.getConnection(connectionUrl,userName,password);
            System.out.println("Bağlantı kuruldu");
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws SQLException {

            Main baglanti = new Main();

                /*DatabaseMetaData dm = (DatabaseMetaData) baglanti.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
*/

          baglanti.urunlerigetir();
          baglanti.urunleriekle();
          baglanti.urunguncelle();



    }

    private  void urunlerigetir() throws SQLException {

        Statement stmt = con.createStatement();
        String SQL = "Select * From urunler";
        ResultSet resultSet = stmt.executeQuery(SQL);
        while(resultSet.next()){
            System.out.println(resultSet.getString("urunID") + " " + resultSet.getString("satıcıID"));
        }
    }
    private void urunleriekle() throws SQLException {



        statement= con.createStatement();
        String SQL = "INSERT INTO urunler (urunID,satıcıID,urunfiyat,urundetay) VALUES ('434','ds33',3434,'detay kısmı')";

        statement.executeUpdate(SQL);

    }

    private void urunguncelle() throws SQLException {

        statement= con.createStatement();
        String SQL = "UPDATE urunler SET urunfiyat=10 WHERE satıcıID='ds33'";

        statement.executeUpdate(SQL);

    }
}