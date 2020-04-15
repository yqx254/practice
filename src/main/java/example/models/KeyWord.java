package example.models;

/**
 * @author fstar
 */
public class KeyWord {
    private int id;
    private String content;
    private int type;
    private int searchCnt;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getSearchCnt() {
        return searchCnt;
    }

    public void setSearchCnt(int searchCnt) {
        this.searchCnt = searchCnt;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
