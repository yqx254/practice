package example.dao;

import example.models.KeyWord;

import javax.sql.DataSource;

/**
 * @author fstar
 */
public interface KeyWordDAO {
    public void setDataSource(DataSource dataSource);
    /**
     * Search keyword by id
     *
     * @param  id  keyword id
     * @return Keyword keyword
     */
        public KeyWord getKeyWord(int id);

    /**
     * modify keyword info
     */
    public void setKeyWord(KeyWord keyWord);
}
