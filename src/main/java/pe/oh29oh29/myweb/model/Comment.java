package pe.oh29oh29.myweb.model;

public class Comment extends CommentKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.CONTENTS
     *
     * @mbg.generated Wed Apr 11 19:49:13 KST 2018
     */
    private String contents;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.REG_DATE
     *
     * @mbg.generated Wed Apr 11 19:49:13 KST 2018
     */
    private String regDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.CONTENTS
     *
     * @return the value of comments.CONTENTS
     *
     * @mbg.generated Wed Apr 11 19:49:13 KST 2018
     */
    public String getContents() {
        return contents;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.CONTENTS
     *
     * @param contents the value for comments.CONTENTS
     *
     * @mbg.generated Wed Apr 11 19:49:13 KST 2018
     */
    public void setContents(String contents) {
        this.contents = contents;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.REG_DATE
     *
     * @return the value of comments.REG_DATE
     *
     * @mbg.generated Wed Apr 11 19:49:13 KST 2018
     */
    public String getRegDate() {
        return regDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.REG_DATE
     *
     * @param regDate the value for comments.REG_DATE
     *
     * @mbg.generated Wed Apr 11 19:49:13 KST 2018
     */
    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }
}