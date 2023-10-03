package com.testdb.testdb.service;

import com.testdb.testdb.domain.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

//  private static final String URL = "jdbc:postgresql://localhost:5432/mydb";
//  private static final String USERNAME = "postgres";
//  private static final String PASSWORD = "root";
//  private static final Connection connection;
  private final JdbcTemplate jdbcTemplate;

  @Autowired
  public UserService(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

//  static {
//    try {
//      Class.forName("org.postgresql.Driver");
//    } catch (ClassNotFoundException e) {
//      throw new RuntimeException("Driver not found");
//    }
//
//    try {
//      connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//    } catch (SQLException e) {
//      throw new RuntimeException("Connection failed");
//    }
//  }

  public User getUserById(Long id) {
    return jdbcTemplate.queryForObject("select * from \"user\" where id = ?",
        new Object[]{id},
        new BeanPropertyRowMapper<>(User.class));
  }

  public List<User> getAllUsers() {
    return jdbcTemplate.query("select * from \"user\"",
        new BeanPropertyRowMapper<>(User.class));



//    List<User> users = new ArrayList<>();

//    String SQL = "select * from \"users\"";
//    try {
//      PreparedStatement prepareStatement = connection.prepareStatement(SQL);
//      ResultSet resultSet = prepareStatement.executeQuery(SQL);
//
//      while(resultSet.next()){
//        User user = new User();
//
//        user.setId(resultSet.getLong("id"));
//        user.setUsername(resultSet.getString("username"));
//        user.setPassword(resultSet.getString("password"));
//        user.setEmail(resultSet.getString("email"));
//        user.setRole(resultSet.getString("role"));
//
//        users.add(user);
//      }
//    } catch (SQLException e) {
//      throw new RuntimeException("Connection failed");
//    }

//    return users;
  }

  public void save(User user){
    jdbcTemplate.update("insert into \"user\" values(?,?,?,?,?)",
        user.getId(),
        user.getUsername(),
        user.getPassword(),
        user.getEmail(),
        user.getRole());
//    try {
//      String SQL = "insert into \"user\" values(?,?,?,?,?)";
//      PreparedStatement preparedStatement = connection.prepareStatement(SQL);
//
//      preparedStatement.setLong(1, user.getId());
//      preparedStatement.setString(2, user.getUsername());
//      preparedStatement.setString(3, user.getPassword());
//      preparedStatement.setString(4, user.getEmail());
//      preparedStatement.setString(5, user.getRole());
//
//      preparedStatement.executeUpdate();
//    } catch (SQLException e) {
//      throw new RuntimeException(e);
//    }
  }

//  @Transactional
//  public void batchUpdate() {
//    List<User> users = create1000Users();
//
//    jdbcTemplate.batchUpdate("insert into \"user\" values(?,?,?,?,?)",
//        new BatchPreparedStatementSetter() {
//          @Override
//          public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
//            User user = users.get(i);
//            preparedStatement.setLong(1, user.getId());
//            preparedStatement.setString(2, user.getUsername());
//            preparedStatement.setString(3, user.getPassword());
//            preparedStatement.setString(4, user.getEmail());
//            preparedStatement.setString(5, user.getRole());
//          }
//
//          @Override
//          public int getBatchSize() {
//            return users.size();
//          }
//        });
//
//  }

//  private List<User> create1000Users() {
//    List<User> users = new ArrayList<>();
//
//    for (int i = 0; i < 1000; i++) {
//      User user = new User();
//      user.setId((long) i);
//      user.setUsername("user" + i);
//      user.setPassword("password" + i);
//      user.setEmail("user" + i + "@gmail.com");
//      user.setRole("USER");
//
//      users.add(user);
//    }
//
//    return users;
//  }

}
