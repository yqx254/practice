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
       System.out.println("wtf is going on????");
        return  jdbcTemplate.queryForObject(sql, new Object[]{id}, new CustomerMapper());
    }
}
