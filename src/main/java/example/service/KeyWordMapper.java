package example.service;

import example.models.KeyWord;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author fstar
 */
public class KeyWordMapper implements RowMapper<KeyWord> {

    @Override
    public KeyWord mapRow(ResultSet resultSet, int i) throws SQLException {
        KeyWord keyword = new KeyWord();
        keyword.setId(resultSet.getInt("id"));
        keyword.setContent(resultSet.getString("key_word"));
        keyword.setType(resultSet.getInt("key_word_type"));
        keyword.setSearchCnt(resultSet.getInt("search_count_pc"));
        return keyword;
    }
}
