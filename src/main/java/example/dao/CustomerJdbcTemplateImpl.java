package example.dao;

import example.models.Customer;
import example.service.CustomerMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @author Administrator
 */
public class CustomerJdbcTemplateImpl implements  CustomerDAO{
    private JdbcTemplate jdbcTemplate;
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    public Customer getCustomer(String id){
        String sql = "SELECT * from fs_customer WHERE id = ?";
        return  jdbcTemplate.queryForObject(sql, new Object[]{id}, new CustomerMapper());
    }

    public void setCustomer(Customer customer){
        String sql = "UPDATE fs_customer SET username = ?, mobile = ?, city_code = ? WHERE id = \"73bb82109ead3758a8b876703993d02b\" ";
        jdbcTemplate.update(sql, customer.getUsername(), customer.getUsername(), customer.getCityCode());
    }
}
