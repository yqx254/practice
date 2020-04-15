package example.dao;

import example.models.Customer;

import javax.sql.DataSource;

/**
 * @author fstar
 */
public interface CustomerDAO {
        void setDataSource(DataSource dataSource);

        Customer getCustomer(String id);

        void setCustomer(Customer customer);
}
