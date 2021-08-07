package contoller;

import dbConnection.dbConnection;
import model.Item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Item_Controller {
    public boolean itemInsert(Item item) throws SQLException, ClassNotFoundException {
        Connection con = dbConnection.DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO customer  VALUES(?,?,?)";
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setInt(1, item.getItem_ID());
        stm.setString(2, item.getName());
        stm.setString(3, item.getBrand());

        boolean isAdded = stm.executeUpdate() > 0;

        return isAdded;
    }
}
