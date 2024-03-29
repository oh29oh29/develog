package pe.oh29oh29.myweb.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.oh29oh29.myweb.model.FileStore;
import pe.oh29oh29.myweb.model.FileStoreExample;

public interface FileStoreMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table file_stores
	 * @mbg.generated  Mon May 14 19:04:42 KST 2018
	 */
	long countByExample(FileStoreExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table file_stores
	 * @mbg.generated  Mon May 14 19:04:42 KST 2018
	 */
	int deleteByExample(FileStoreExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table file_stores
	 * @mbg.generated  Mon May 14 19:04:42 KST 2018
	 */
	int deleteByPrimaryKey(String idx);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table file_stores
	 * @mbg.generated  Mon May 14 19:04:42 KST 2018
	 */
	int insert(FileStore record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table file_stores
	 * @mbg.generated  Mon May 14 19:04:42 KST 2018
	 */
	int insertSelective(FileStore record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table file_stores
	 * @mbg.generated  Mon May 14 19:04:42 KST 2018
	 */
	List<FileStore> selectByExample(FileStoreExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table file_stores
	 * @mbg.generated  Mon May 14 19:04:42 KST 2018
	 */
	FileStore selectByPrimaryKey(String idx);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table file_stores
	 * @mbg.generated  Mon May 14 19:04:42 KST 2018
	 */
	int updateByExampleSelective(@Param("record") FileStore record, @Param("example") FileStoreExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table file_stores
	 * @mbg.generated  Mon May 14 19:04:42 KST 2018
	 */
	int updateByExample(@Param("record") FileStore record, @Param("example") FileStoreExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table file_stores
	 * @mbg.generated  Mon May 14 19:04:42 KST 2018
	 */
	int updateByPrimaryKeySelective(FileStore record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table file_stores
	 * @mbg.generated  Mon May 14 19:04:42 KST 2018
	 */
	int updateByPrimaryKey(FileStore record);
}