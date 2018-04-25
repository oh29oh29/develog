package pe.oh29oh29.myweb.model;

import java.util.ArrayList;
import java.util.List;

public class AttachedFileExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table attached_files
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table attached_files
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table attached_files
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attached_files
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public AttachedFileExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attached_files
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attached_files
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attached_files
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attached_files
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attached_files
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attached_files
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attached_files
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attached_files
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attached_files
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attached_files
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table attached_files
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdxIsNull() {
			addCriterion("IDX is null");
			return (Criteria) this;
		}

		public Criteria andIdxIsNotNull() {
			addCriterion("IDX is not null");
			return (Criteria) this;
		}

		public Criteria andIdxEqualTo(String value) {
			addCriterion("IDX =", value, "idx");
			return (Criteria) this;
		}

		public Criteria andIdxNotEqualTo(String value) {
			addCriterion("IDX <>", value, "idx");
			return (Criteria) this;
		}

		public Criteria andIdxGreaterThan(String value) {
			addCriterion("IDX >", value, "idx");
			return (Criteria) this;
		}

		public Criteria andIdxGreaterThanOrEqualTo(String value) {
			addCriterion("IDX >=", value, "idx");
			return (Criteria) this;
		}

		public Criteria andIdxLessThan(String value) {
			addCriterion("IDX <", value, "idx");
			return (Criteria) this;
		}

		public Criteria andIdxLessThanOrEqualTo(String value) {
			addCriterion("IDX <=", value, "idx");
			return (Criteria) this;
		}

		public Criteria andIdxLike(String value) {
			addCriterion("IDX like", value, "idx");
			return (Criteria) this;
		}

		public Criteria andIdxNotLike(String value) {
			addCriterion("IDX not like", value, "idx");
			return (Criteria) this;
		}

		public Criteria andIdxIn(List<String> values) {
			addCriterion("IDX in", values, "idx");
			return (Criteria) this;
		}

		public Criteria andIdxNotIn(List<String> values) {
			addCriterion("IDX not in", values, "idx");
			return (Criteria) this;
		}

		public Criteria andIdxBetween(String value1, String value2) {
			addCriterion("IDX between", value1, value2, "idx");
			return (Criteria) this;
		}

		public Criteria andIdxNotBetween(String value1, String value2) {
			addCriterion("IDX not between", value1, value2, "idx");
			return (Criteria) this;
		}

		public Criteria andPostIdxIsNull() {
			addCriterion("POST_IDX is null");
			return (Criteria) this;
		}

		public Criteria andPostIdxIsNotNull() {
			addCriterion("POST_IDX is not null");
			return (Criteria) this;
		}

		public Criteria andPostIdxEqualTo(String value) {
			addCriterion("POST_IDX =", value, "postIdx");
			return (Criteria) this;
		}

		public Criteria andPostIdxNotEqualTo(String value) {
			addCriterion("POST_IDX <>", value, "postIdx");
			return (Criteria) this;
		}

		public Criteria andPostIdxGreaterThan(String value) {
			addCriterion("POST_IDX >", value, "postIdx");
			return (Criteria) this;
		}

		public Criteria andPostIdxGreaterThanOrEqualTo(String value) {
			addCriterion("POST_IDX >=", value, "postIdx");
			return (Criteria) this;
		}

		public Criteria andPostIdxLessThan(String value) {
			addCriterion("POST_IDX <", value, "postIdx");
			return (Criteria) this;
		}

		public Criteria andPostIdxLessThanOrEqualTo(String value) {
			addCriterion("POST_IDX <=", value, "postIdx");
			return (Criteria) this;
		}

		public Criteria andPostIdxLike(String value) {
			addCriterion("POST_IDX like", value, "postIdx");
			return (Criteria) this;
		}

		public Criteria andPostIdxNotLike(String value) {
			addCriterion("POST_IDX not like", value, "postIdx");
			return (Criteria) this;
		}

		public Criteria andPostIdxIn(List<String> values) {
			addCriterion("POST_IDX in", values, "postIdx");
			return (Criteria) this;
		}

		public Criteria andPostIdxNotIn(List<String> values) {
			addCriterion("POST_IDX not in", values, "postIdx");
			return (Criteria) this;
		}

		public Criteria andPostIdxBetween(String value1, String value2) {
			addCriterion("POST_IDX between", value1, value2, "postIdx");
			return (Criteria) this;
		}

		public Criteria andPostIdxNotBetween(String value1, String value2) {
			addCriterion("POST_IDX not between", value1, value2, "postIdx");
			return (Criteria) this;
		}

		public Criteria andFakeNameIsNull() {
			addCriterion("FAKE_NAME is null");
			return (Criteria) this;
		}

		public Criteria andFakeNameIsNotNull() {
			addCriterion("FAKE_NAME is not null");
			return (Criteria) this;
		}

		public Criteria andFakeNameEqualTo(String value) {
			addCriterion("FAKE_NAME =", value, "fakeName");
			return (Criteria) this;
		}

		public Criteria andFakeNameNotEqualTo(String value) {
			addCriterion("FAKE_NAME <>", value, "fakeName");
			return (Criteria) this;
		}

		public Criteria andFakeNameGreaterThan(String value) {
			addCriterion("FAKE_NAME >", value, "fakeName");
			return (Criteria) this;
		}

		public Criteria andFakeNameGreaterThanOrEqualTo(String value) {
			addCriterion("FAKE_NAME >=", value, "fakeName");
			return (Criteria) this;
		}

		public Criteria andFakeNameLessThan(String value) {
			addCriterion("FAKE_NAME <", value, "fakeName");
			return (Criteria) this;
		}

		public Criteria andFakeNameLessThanOrEqualTo(String value) {
			addCriterion("FAKE_NAME <=", value, "fakeName");
			return (Criteria) this;
		}

		public Criteria andFakeNameLike(String value) {
			addCriterion("FAKE_NAME like", value, "fakeName");
			return (Criteria) this;
		}

		public Criteria andFakeNameNotLike(String value) {
			addCriterion("FAKE_NAME not like", value, "fakeName");
			return (Criteria) this;
		}

		public Criteria andFakeNameIn(List<String> values) {
			addCriterion("FAKE_NAME in", values, "fakeName");
			return (Criteria) this;
		}

		public Criteria andFakeNameNotIn(List<String> values) {
			addCriterion("FAKE_NAME not in", values, "fakeName");
			return (Criteria) this;
		}

		public Criteria andFakeNameBetween(String value1, String value2) {
			addCriterion("FAKE_NAME between", value1, value2, "fakeName");
			return (Criteria) this;
		}

		public Criteria andFakeNameNotBetween(String value1, String value2) {
			addCriterion("FAKE_NAME not between", value1, value2, "fakeName");
			return (Criteria) this;
		}

		public Criteria andRealNameIsNull() {
			addCriterion("REAL_NAME is null");
			return (Criteria) this;
		}

		public Criteria andRealNameIsNotNull() {
			addCriterion("REAL_NAME is not null");
			return (Criteria) this;
		}

		public Criteria andRealNameEqualTo(String value) {
			addCriterion("REAL_NAME =", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameNotEqualTo(String value) {
			addCriterion("REAL_NAME <>", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameGreaterThan(String value) {
			addCriterion("REAL_NAME >", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameGreaterThanOrEqualTo(String value) {
			addCriterion("REAL_NAME >=", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameLessThan(String value) {
			addCriterion("REAL_NAME <", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameLessThanOrEqualTo(String value) {
			addCriterion("REAL_NAME <=", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameLike(String value) {
			addCriterion("REAL_NAME like", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameNotLike(String value) {
			addCriterion("REAL_NAME not like", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameIn(List<String> values) {
			addCriterion("REAL_NAME in", values, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameNotIn(List<String> values) {
			addCriterion("REAL_NAME not in", values, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameBetween(String value1, String value2) {
			addCriterion("REAL_NAME between", value1, value2, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameNotBetween(String value1, String value2) {
			addCriterion("REAL_NAME not between", value1, value2, "realName");
			return (Criteria) this;
		}

		public Criteria andRealPathIsNull() {
			addCriterion("REAL_PATH is null");
			return (Criteria) this;
		}

		public Criteria andRealPathIsNotNull() {
			addCriterion("REAL_PATH is not null");
			return (Criteria) this;
		}

		public Criteria andRealPathEqualTo(String value) {
			addCriterion("REAL_PATH =", value, "realPath");
			return (Criteria) this;
		}

		public Criteria andRealPathNotEqualTo(String value) {
			addCriterion("REAL_PATH <>", value, "realPath");
			return (Criteria) this;
		}

		public Criteria andRealPathGreaterThan(String value) {
			addCriterion("REAL_PATH >", value, "realPath");
			return (Criteria) this;
		}

		public Criteria andRealPathGreaterThanOrEqualTo(String value) {
			addCriterion("REAL_PATH >=", value, "realPath");
			return (Criteria) this;
		}

		public Criteria andRealPathLessThan(String value) {
			addCriterion("REAL_PATH <", value, "realPath");
			return (Criteria) this;
		}

		public Criteria andRealPathLessThanOrEqualTo(String value) {
			addCriterion("REAL_PATH <=", value, "realPath");
			return (Criteria) this;
		}

		public Criteria andRealPathLike(String value) {
			addCriterion("REAL_PATH like", value, "realPath");
			return (Criteria) this;
		}

		public Criteria andRealPathNotLike(String value) {
			addCriterion("REAL_PATH not like", value, "realPath");
			return (Criteria) this;
		}

		public Criteria andRealPathIn(List<String> values) {
			addCriterion("REAL_PATH in", values, "realPath");
			return (Criteria) this;
		}

		public Criteria andRealPathNotIn(List<String> values) {
			addCriterion("REAL_PATH not in", values, "realPath");
			return (Criteria) this;
		}

		public Criteria andRealPathBetween(String value1, String value2) {
			addCriterion("REAL_PATH between", value1, value2, "realPath");
			return (Criteria) this;
		}

		public Criteria andRealPathNotBetween(String value1, String value2) {
			addCriterion("REAL_PATH not between", value1, value2, "realPath");
			return (Criteria) this;
		}

		public Criteria andTypeIsNull() {
			addCriterion("TYPE is null");
			return (Criteria) this;
		}

		public Criteria andTypeIsNotNull() {
			addCriterion("TYPE is not null");
			return (Criteria) this;
		}

		public Criteria andTypeEqualTo(Integer value) {
			addCriterion("TYPE =", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotEqualTo(Integer value) {
			addCriterion("TYPE <>", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThan(Integer value) {
			addCriterion("TYPE >", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("TYPE >=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThan(Integer value) {
			addCriterion("TYPE <", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThanOrEqualTo(Integer value) {
			addCriterion("TYPE <=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeIn(List<Integer> values) {
			addCriterion("TYPE in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotIn(List<Integer> values) {
			addCriterion("TYPE not in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeBetween(Integer value1, Integer value2) {
			addCriterion("TYPE between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("TYPE not between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andSizeIsNull() {
			addCriterion("SIZE is null");
			return (Criteria) this;
		}

		public Criteria andSizeIsNotNull() {
			addCriterion("SIZE is not null");
			return (Criteria) this;
		}

		public Criteria andSizeEqualTo(Integer value) {
			addCriterion("SIZE =", value, "size");
			return (Criteria) this;
		}

		public Criteria andSizeNotEqualTo(Integer value) {
			addCriterion("SIZE <>", value, "size");
			return (Criteria) this;
		}

		public Criteria andSizeGreaterThan(Integer value) {
			addCriterion("SIZE >", value, "size");
			return (Criteria) this;
		}

		public Criteria andSizeGreaterThanOrEqualTo(Integer value) {
			addCriterion("SIZE >=", value, "size");
			return (Criteria) this;
		}

		public Criteria andSizeLessThan(Integer value) {
			addCriterion("SIZE <", value, "size");
			return (Criteria) this;
		}

		public Criteria andSizeLessThanOrEqualTo(Integer value) {
			addCriterion("SIZE <=", value, "size");
			return (Criteria) this;
		}

		public Criteria andSizeIn(List<Integer> values) {
			addCriterion("SIZE in", values, "size");
			return (Criteria) this;
		}

		public Criteria andSizeNotIn(List<Integer> values) {
			addCriterion("SIZE not in", values, "size");
			return (Criteria) this;
		}

		public Criteria andSizeBetween(Integer value1, Integer value2) {
			addCriterion("SIZE between", value1, value2, "size");
			return (Criteria) this;
		}

		public Criteria andSizeNotBetween(Integer value1, Integer value2) {
			addCriterion("SIZE not between", value1, value2, "size");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table attached_files
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table attached_files
     *
     * @mbg.generated do_not_delete_during_merge Wed Apr 25 13:35:39 KST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}