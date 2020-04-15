package example.dao;

import example.models.KeyWord;
import example.service.KeyWordMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @author fstar
 */
public class KeyWordJdbcTempateImpl implements  KeyWordDAO{
    private JdbcTemplate jdbcTemplate;
    @Override
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public KeyWord getKeyWord(int id) {
        String sql = "SELECT * FROM fs_key_word WHERE id = ?";
        return jdbcTemplate.queryForObject(sql,new Object[]{id}, new KeyWordMapper());
    }

    @Override
    public void setKeyWord(KeyWord keyWord) {
        String sql = "UPDATE fs_key_word SET key_word = ?, key_word_type = ?, search_count_pc = ? WHERE id = ?";
        jdbcTemplate.update(sql, keyWord.getContent(),keyWord.getType(),keyWord.getSearchCnt(),keyWord.getId());
    }
}
