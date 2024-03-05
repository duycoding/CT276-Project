**Guide to connect to SQL Server Database:**

Load the driver:
=> Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
Connection URL:
=> String myURL = "jdbc:jtds:sqlserver://localhost:1433/pubs";
Establish connection:
=> String username = "sa";
String password = "";
Connection connection = DriverManager.getConnection(myURL, username, password);
Create a Statement:
=> Statement statement = connection.createStatement();
Execute a query (select, delete, update, ...):
=> Note: If the query is a select statement, the result returned is a ResultSet:
graphql
Copy code
String query = "select * from Lop";
ResultSet resultSet = statement.excuteQuery(query);
=> For insert, delete, update queries:
Use excuteUpdate(<Name of the query string or the query string>);
=> To create or delete a table, use excute();
Handle the returned result.
Download Library: Microsoft SQL Server JDBC Driver

**Main Features**

Login
Logout
Student management group (Add/edit/delete/create new)
Grade management group (Add/edit/delete/create new)

**Login interface:**

![image](https://github.com/duycoding/CT276-Project/assets/128799277/6e305de4-df26-4655-a89b-91db811820ab)


**Student management interface**

![image](https://github.com/duycoding/CT276-Project/assets/128799277/fee69e76-226b-438f-bc7e-c7d99e28cd0c)


Grade management interface

![image](https://github.com/duycoding/CT276-Project/assets/128799277/2679b8ad-11ef-4975-b764-8c3eb0b83191)
