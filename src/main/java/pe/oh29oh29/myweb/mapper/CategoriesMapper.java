package pe.oh29oh29.myweb.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.oh29oh29.myweb.model.Categories;
import pe.oh29oh29.myweb.model.CategoriesExample;

public interface CategoriesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categories
     *
     * @mbg.generated Wed Apr 04 15:40:39 KST 2018
     */
    long countByExample(CategoriesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categories
     *
     * @mbg.generated Wed Apr 04 15:40:39 KST 2018
     */
    int deleteByExample(CategoriesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categories
     *
     * @mbg.generated Wed Apr 04 15:40:39 KST 2018
     */
    int deleteByPrimaryKey(String idx);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categories
     *
     * @mbg.generated Wed Apr 04 15:40:39 KST 2018
     */
    int insert(Categories record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categories
     *
     * @mbg.generated Wed Apr 04 15:40:39 KST 2018
     */
    int insertSelective(Categories record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categories
     *
     * @mbg.generated Wed Apr 04 15:40:39 KST 2018
     */
    List<Categories> selectByExample(CategoriesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categories
     *
     * @mbg.generated Wed Apr 04 15:40:39 KST 2018
     */
    Categories selectByPrimaryKey(String idx);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categories
     *
     * @mbg.generated Wed Apr 04 15:40:39 KST 2018
     */
    int updateByExampleSelective(@Param("record") Categories record, @Param("example") CategoriesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categories
     *
     * @mbg.generated Wed Apr 04 15:40:39 KST 2018
     */
    int updateByExample(@Param("record") Categories record, @Param("example") CategoriesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categories
     *
     * @mbg.generated Wed Apr 04 15:40:39 KST 2018
     */
    int updateByPrimaryKeySelective(Categories record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categories
     *
     * @mbg.generated Wed Apr 04 15:40:39 KST 2018
     */
    int updateByPrimaryKey(Categories record);
}