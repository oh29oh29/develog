package pe.oh29oh29.myweb.model;

public class AttachedFile extends AttachedFileKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column attached_files.FAKE_NAME
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	private String fakeName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column attached_files.REAL_NAME
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	private String realName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column attached_files.REAL_PATH
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	private String realPath;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column attached_files.TYPE
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	private Integer type;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column attached_files.SIZE
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	private Integer size;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column attached_files.FAKE_NAME
	 * @return  the value of attached_files.FAKE_NAME
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public String getFakeName() {
		return fakeName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column attached_files.FAKE_NAME
	 * @param fakeName  the value for attached_files.FAKE_NAME
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public void setFakeName(String fakeName) {
		this.fakeName = fakeName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column attached_files.REAL_NAME
	 * @return  the value of attached_files.REAL_NAME
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public String getRealName() {
		return realName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column attached_files.REAL_NAME
	 * @param realName  the value for attached_files.REAL_NAME
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column attached_files.REAL_PATH
	 * @return  the value of attached_files.REAL_PATH
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public String getRealPath() {
		return realPath;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column attached_files.REAL_PATH
	 * @param realPath  the value for attached_files.REAL_PATH
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public void setRealPath(String realPath) {
		this.realPath = realPath;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column attached_files.TYPE
	 * @return  the value of attached_files.TYPE
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column attached_files.TYPE
	 * @param type  the value for attached_files.TYPE
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column attached_files.SIZE
	 * @return  the value of attached_files.SIZE
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public Integer getSize() {
		return size;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column attached_files.SIZE
	 * @param size  the value for attached_files.SIZE
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public void setSize(Integer size) {
		this.size = size;
	}
}