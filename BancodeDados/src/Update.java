import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class Update {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/java?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String sql = "UPDATE customers SET name='thais' , age=19 WHERE age=21";
			try {
			Connection con = DriverManager.getConnection(url, "root", "");
			PreparedStatement update = con.prepareStatement(sql);
			update.executeUpdate();
			JOptionPane.showMessageDialog(null,"Update executed with success!");
		} catch (Exception error) {
			error.printStackTrace();
		}

	}
}