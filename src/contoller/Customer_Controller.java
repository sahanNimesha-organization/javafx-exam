package contoller;

import dbConnection.dbConnection;
import model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Customer_Controller {
    public boolean custInsert(Customer customer) throws SQLException, ClassNotFoundException {
        Connection con = dbConnection.DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO customer  VALUES(?,?,?)";
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setInt(1, customer.getCust_ID());
        stm.setString(2, customer.getName());
        stm.setString(3, customer.getAddress());

        boolean isAdded = stm.executeUpdate() > 0;

        return isAdded;
    }

}
