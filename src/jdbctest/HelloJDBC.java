package jdbctest;

import java.sql.*;
import java.util.Scanner;

public class HelloJDBC {

	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/jdbcsample?serverTimezone=Asia/Taipei";
	public static final String USER = "root";
	public static final String PASSWORD = "Martin880904";

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("要新增的編號");
		int deptno = sc.nextInt();
		System.out.println("要新增的名稱");
		String dname = sc.next();
		System.out.println("要新增的所在地");
		String loc = sc.next();
		
		sc.close();
		
		try {
			// step 1:載入驅動
			Class.forName(DRIVER);
			System.out.println("載入成功");

			// step 2:建立連線
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("連線成功");

			// step 3:送出SQL指令
			pstmt = con.prepareStatement("INSERT INTO department VALUES(?, ?, ?) ");
			
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			
			pstmt.executeUpdate();
			
			
			
			
//			stmt = con.createStatement();
//			int count = stmt.executeUpdate("insert into department values(50, '人事部', '南京復興') ");
//			System.out.println("成功筆數:"+count);

//			rs = stmt.executeQuery("SELECT * FROM department "
//								 + "ORDER BY DEPTNO DESC ");
//			System.out.println("DEPTNO\tDNAME\tLOC \t");
//			while (rs.next()) {
//				int deptno = rs.getInt("deptno");
//				String dname = rs.getString("dname");
//				String loc = rs.getString("loc");
//				
//				System.out.print(deptno+"\t");
//				System.out.print(dname+"\t");
//				System.out.println(loc+"\t");
//				System.out.println("---------------------");
//			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
