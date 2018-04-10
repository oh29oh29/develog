package pe.oh29oh29.myweb.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.oh29oh29.myweb.model.Post;
import pe.oh29oh29.myweb.model.PostExample;
import pe.oh29oh29.myweb.model.PostKey;

public interface PostMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table POSTS
     *
     * @mbg.generated Tue Apr 10 19:37:22 KST 2018
     */
    long countByExample(PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table POSTS
     *
     * @mbg.generated Tue Apr 10 19:37:22 KST 2018
     */
    int deleteByExample(PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table POSTS
     *
     * @mbg.generated Tue Apr 10 19:37:22 KST 2018
     */
    int deleteByPrimaryKey(PostKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table POSTS
     *
     * @mbg.generated Tue Apr 10 19:37:22 KST 2018
     */
    int insert(Post record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table POSTS
     *
     * @mbg.generated Tue Apr 10 19:37:22 KST 2018
     */
    int insertSelective(Post record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table POSTS
     *
     * @mbg.generated Tue Apr 10 19:37:22 KST 2018
     */
    List<Post> selectByExampleWithBLOBs(PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table POSTS
     *
     * @mbg.generated Tue Apr 10 19:37:22 KST 2018
     */
    List<Post> selectByExample(PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table POSTS
     *
     * @mbg.generated Tue Apr 10 19:37:22 KST 2018
     */
    Post selectByPrimaryKey(PostKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table POSTS
     *
     * @mbg.generated Tue Apr 10 19:37:22 KST 2018
     */
    int updateByExampleSelective(@Param("record") Post record, @Param("example") PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table POSTS
     *
     * @mbg.generated Tue Apr 10 19:37:22 KST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") Post record, @Param("example") PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table POSTS
     *
     * @mbg.generated Tue Apr 10 19:37:22 KST 2018
     */
    int updateByExample(@Param("record") Post record, @Param("example") PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table POSTS
     *
     * @mbg.generated Tue Apr 10 19:37:22 KST 2018
     */
    int updateByPrimaryKeySelective(Post record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table POSTS
     *
     * @mbg.generated Tue Apr 10 19:37:22 KST 2018
     */
    int updateByPrimaryKeyWithBLOBs(Post record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table POSTS
     *
     * @mbg.generated Tue Apr 10 19:37:22 KST 2018
     */
    int updateByPrimaryKey(Post record);
}