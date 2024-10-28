/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasseBancoDados;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseBiblioteca {
    private static final String URL = "jdbc:mysql://localhost:3306/biblioteca";
    private static final String USER = "root";
    private static final String PASSWORD = "Olegario1!";
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
