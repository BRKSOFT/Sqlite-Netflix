package sqlite_netflix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.text.NumberFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sqlite_netflix {
    
    public static Connection conn = null;
    public static Statement stmt =  null;
    public static String sqliteServer = "jdbc:sqlite:";
    public static String resetPath = "";
    
    Sqlite_netflix(){
        try {
            // db parameters
            sqliteServer = "jdbc:sqlite:";
            String getFilePath = new File("").getAbsolutePath();
            //C:\Users\berka\Documents\NetBeansProjects\sqlite_netflix\src\sqlite_netflix
            String fileAbsolutePath = getFilePath.concat("\\src\\sqlite_netflix\\netflix.db");
            resetPath = fileAbsolutePath;

            System.out.println(sqliteServer);
            System.out.println(getFilePath);
            System.out.println(fileAbsolutePath);
            // create a connection to the database
            
            if(isDatabaseExist(fileAbsolutePath)){
                System.out.println("DB Selection: ");
                conn = DriverManager.getConnection(sqliteServer+fileAbsolutePath);
                System.out.println("Connection to SQLite has been established.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
    }
    public static boolean isDatabaseExist(String dbFilePath){
        File dbFile = new File(dbFilePath);
        return dbFile.exists();
    }
    public static void main(String[] args) throws IOException {
        Sqlite_netflix db = new Sqlite_netflix();
        
        
        
        String[][] bilgiler = new String[74][5];
        int enbuyuk=-1;
        int enbuyuk_index=1;
        File file = new File("bilgiler.txt");
        try{
            BufferedReader bufferedreader = new BufferedReader(new FileReader(file));
            //System.out.println("Dosya Basariyla Acildi");
            
            String str;
            /*while((str = bufferedreader.readLine())!= null){
                System.out.println(str);
            }*/
            for(int i=0 ; (str = bufferedreader.readLine())!= null ; i++){
                //System.out.println(str);
                String parts[] = str.split("-");
                bilgiler[i] = parts;
            }
            
        }
        catch(FileNotFoundException e ){
            System.out.println("Dosya bulunamadi !");
            e.printStackTrace();
        }
        
        for(int i=0 ; i<bilgiler.length ; i++){
            System.out.printf("%d.)",i+1);
            for(int j=0 ; j<bilgiler[i].length ; j++){
                if(j==0)System.out.printf("%s",bilgiler[i][j]);
                else System.out.printf(",%s",bilgiler[i][j]);
            }
            System.out.println("");
        }
        PreparedStatement pst=null;
        
            //VERITABANINA YAZDIRMA
            /*for(int i=0 ; i<74 ; i++){
            //ResultSet myRs = myStat.executeQuery("INSERT INTO program values (bilgiler[0],bilgiler[2],bilgiler[1],6,180);");
            try{
            //pst = conn.prepareStatement("INSERT INTO program values('dsad',null,'aaaa',5,6)");
            pst = conn.prepareStatement("INSERT INTO program values(?,null,?,?,?)");
            System.out.println("basarili");
            pst.setString(1,bilgiler[i][0]);
            //pst.setString(2,bilgiler[i][2]);
            pst.setString(2,bilgiler[i][2]);
            pst.setInt(3,6);
            pst.setInt(4,180);
            
            pst.execute();
            //System.out.println("");
            }
            catch(SQLException  e){
            System.out.println("Error : " + e);
            }
            }*/
            //VERITABANINA YAZDIRMA
            
            
            //VERITABANI TABLO GUNCELLEME
            /*try {
                pst = conn.prepareStatement("update program set bolum_sayisi=1 where tip='Film';");
                pst.execute();
            } catch (SQLException ex) {
                Logger.getLogger(Sqlite_netflix.class.getName()).log(Level.SEVERE, null, ex);
            }*/
            //VERITABANI TABLO GUNCELLEME
            
            //VERITABANI TABLO GUNCELLEME2
            /*Random random = new Random();
            int max = 100;
            try{
                for(int i=0 ; i<74 ; i++){
                    int rastgele_sayi = random.nextInt(10) + 5;
                    pst = conn.prepareStatement("update program set bolum_sayisi = ? where program_adi = ?;");
                    pst.setInt(1,rastgele_sayi);
                    pst.setString(2,bilgiler[i][0]);
                    pst.execute();
                }

            }catch(SQLException e){
                System.out.println("Error : " + e);
            }*/
            //VERITABANI TABLO GUNCELLEME2
            
//BILGILER2
            /*for(int i=0 ; i < bilgiler.length ; i++){
                 System.out.println(bilgiler[i][1]);
            }
            String[][] bilgiler2 = new String[75][5];
            for(int i=0 ; i < bilgiler.length ; i++){
                String parts[] = bilgiler[i][1].split(",");
                bilgiler2[i] = parts;
            }
            System.out.println("YEEEEEEEEEEEEEEEEEEEEEEEEP");
            for(int i=0 ; i < bilgiler2.length ; i++){
                for(int j=0 ; j<bilgiler2[i].length ; j++){
                    System.out.printf("%s,",bilgiler2[i][j]);
                }
                System.out.println("");
            }*/
//BILGILER2

            //VERITABANINA YAZDIRMA
            /*for(int i=0 ; i<74 ; i++){
                for(int j=0 ; j<bilgiler2[i].length ; j++){
                    try{
                        //pst = conn.prepareStatement("INSERT INTO program values('dsad',null,'aaaa',5,6)");
                        pst = conn.prepareStatement("INSERT INTO programtur values(?,?)");
                        pst.setString(1,bilgiler[i][0]);
                        pst.setString(2,bilgiler2[i][j]);
                        pst.execute();
                    }
                    catch(SQLException  e){
                        System.out.println("Error : " + e);
                    }
                }
                
            }*/
            //VERITABANINA YAZDIRMA
            
            //VERITABANINA DOUBLE SAYILARI YAZDIRMA
            /*for(int i=0 ; i<74 ; i++){
                try{
                    //pst = conn.prepareStatement("INSERT INTO program values('dsad',null,'aaaa',5,6)");
                    double max=10.0;
                    double min=0.0;
                    
                    double random_float = (Math.random())*(max-min)+min;
                    NumberFormat numberformat = NumberFormat.getInstance();
                    numberformat.setMaximumFractionDigits(1);
                    pst = conn.prepareStatement("UPDATE program set rate = ? where program_adi = ?");
                    pst.setDouble(1,Double.parseDouble(numberformat.format(random_float)));
                    pst.setString(2,bilgiler[i][0]);
                    pst.execute();
                }
                catch(SQLException  e){
                    System.out.println("Error : " + e);
                }
            }*/
            //VERITABANINA DOUBLE SAYILARI YAZDIRMA
        
        new Arayuz().setVisible(true);
    } 
}
