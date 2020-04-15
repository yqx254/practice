package example.service;

import example.models.Customer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * @author Administrator
 */
public class CustomerMapper implements RowMapper<Customer> {

    @Override
    public Customer mapRow(ResultSet resultSet, int i) throws SQLException {
        Customer customer = new Customer();
        System.out.println("are we here??");
        customer.setCityCode(resultSet.getInt("city_code"));
        customer.setMobile(resultSet.getString("mobile"));
        customer.setUsername(resultSet.getString("username"));
        System.out.println("are we here?");
        return customer;
    }
}
