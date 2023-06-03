package Opgave3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EksPreparedStatement {

	public static void main(String[] args) {

		try {
			System.out.println("Skriv en medarbejder ");
			BufferedReader inLine = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Indtast navn");
			String navn = inLine.readLine();

			Connection minConnection;
			minConnection = DriverManager.getConnection(
					"jdbc:sqlserver://Localhost;master=KlubEks;user=sa;password=ern39sur;");

			String sql = "Select mobil from Medarbejder where navn = (?)";// preparedStatement
			PreparedStatement prestmt = minConnection.prepareStatement(sql);
			prestmt.clearParameters();

			prestmt.setString(1,navn.trim());

			ResultSet res = prestmt.executeQuery();

			while((res.next())) {
				System.out.println(res.getString(1));

			}

			prestmt.executeQuery();

			if (prestmt != null)
				prestmt.close();
			if (minConnection != null)
				minConnection.close();
		} catch (Exception e) {
			System.out.println("fejl:  " + e.getMessage());
		}
	}

}
