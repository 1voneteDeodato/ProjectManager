package Project_Manager;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class BancodeDados

{
public static void main(String[] args)
{
try
{
Class.forName("org.firebirdsql.jdbc.FBDriver");
try (Connection con = DriverManager.getConnection("jdbc:firebirdsql:localhost:C:\\teste.FDB","SYSDBA","masterkey")) {
Statement stm = con.createStatement();
ResultSet rs = stm.executeQuery("select * from tabela");
while(rs.next())
{
System.out.println("Mostrando o valor da primeira coluna do resultado" + rs.getString(1));
} }
}
catch(ClassNotFoundException | SQLException e)
{
System.out.println("Houve um erro:" + e.getMessage());
}
}
}




