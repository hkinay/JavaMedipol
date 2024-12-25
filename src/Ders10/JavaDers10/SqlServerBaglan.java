package Ders10.JavaDers10;

import java.sql.*;

public class SqlServerBaglan {
    public static void main(String[] args) {

        Connection conn = null;





        //String connectionURL="jdbc:jtds:sqlserver://{#host::.::[}/{database::::[}?[;<;,instance={localdb_pipe},user={user:param:::[},password={password:param:::[},{:identifier}={:param:::[}>]";


        try

        {
            String connectionURL = "jdbc:mysql://./";

            conn = DriverManager.getConnection(connectionURL);
            if(conn!=null){
                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());

            }
            Statement stmt = conn.createStatement();
            String SQL = "Select urun_id,satici_id From urunler";
            ResultSet resultSet = stmt.executeQuery(SQL);
            while(resultSet.next()){
                System.out.println(resultSet.getString("Ürün ID") + " " + resultSet.getString("Satıcı ID"));
            }



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }


}
