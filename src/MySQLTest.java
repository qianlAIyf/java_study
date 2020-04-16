import java.sql.*;

public class MySQLTest {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/study?useSSL=false&serverTimezone=UTC";

    static final String USER = "root";
    static final String PASSWD = "CHENqian0910";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try{
            //注册JDBC驱动
            Class.forName(JDBC_DRIVER);

            //打开连接
            System.out.println("连接数据库...");
            connection = DriverManager.getConnection(DB_URL, USER, PASSWD);


            //执行查询
            System.out.println("实例化statement对象...");
            statement = connection.createStatement();
            String sql;
            sql = "SELECT id, name, url FROM website";
            ResultSet resultSet = statement.executeQuery(sql);

            //展开结果集数据库
            while (resultSet.next()){
                //通过字段检索
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String url = resultSet.getString("url");

                System.out.print(id);
                System.out.print(" " + name);
                System.out.print(" " + url);
                System.out.println();
            }

            resultSet.close();
            statement.close();
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(statement != null){
                    statement.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }

            try {
                if(connection != null){
                    connection.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        System.out.println("bye!");
    }
}
