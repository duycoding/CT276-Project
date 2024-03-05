Hướng dẫn kết nối với Database SQL Server:
1. Nạp driver : 
=> Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
2. Connection URL :
=> String myURL = "jdbc:jtds:sqlserver://localhost:1433/pubs";
3. Tạo kết nối :
=> String username = "sa";
   String password = "";
   Connection connection =
	DriverManager.getConnection(myURL, username, pasword);
4. Tạo một Statement:
=> Statement statement = connection.createStatement();
5. Thực thi một truy vấn (select, delete, update, ...) :
=> Lưu ý: nếu query là select thì kết quả trả về là 1 ResultSet:
		String query = "select * from Lop";
		ResultSet resultSet = statement.excuteQuery(query);
=> đối với query dạng insert, delete, update:
	sử dụng excuteUpdate(<Tên của chuỗi truy vấn hoặc chuỗi truy vấn>);
=> tạo, xóa bảng sử dụng excute();
6. Xử lí kết quả trả về

Download Library: http://www.microsoft.com/en-us/download/details.aspx?id=11774

Giao diện đăng nhập: 
![Capture](https://github.com/duycoding/CT276-Project/assets/128799277/a0ec879e-8476-436a-9413-bce273dc75ea)


