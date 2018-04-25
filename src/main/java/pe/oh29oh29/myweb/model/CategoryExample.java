package pe.oh29oh29.myweb.model;

import java.util.ArrayList;
import java.util.List;

public class CategoryExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table categories
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table categories
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table categories
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table categories
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public CategoryExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table categories
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table categories
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table categories
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table categories
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table categories
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table categories
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table categories
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table categories
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table categories
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table categories
	 * @mbg.generated  Wed Apr 25 13:55:15 KST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table categories
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

		public Criteria andParentIdxIsNull() {
			addCriterion("PARENT_IDX is null");
			return (Criteria) this;
		}

		public Criteria andParentIdxIsNotNull() {
			addCriterion("PARENT_IDX is not null");
			return (Criteria) this;
		}

		public Criteria andParentIdxEqualTo(String value) {
			addCriterion("PARENT_IDX =", value, "parentIdx");
			return (Criteria) this;
		}

		public Criteria andParentIdxNotEqualTo(String value) {
			addCriterion("PARENT_IDX <>", value, "parentIdx");
			return (Criteria) this;
		}

		public Criteria andParentIdxGreaterThan(String value) {
			addCriterion("PARENT_IDX >", value, "parentIdx");
			return (Criteria) this;
		}

		public Criteria andParentIdxGreaterThanOrEqualTo(String value) {
			addCriterion("PARENT_IDX >=", value, "parentIdx");
			return (Criteria) this;
		}

		public Criteria andParentIdxLessThan(String value) {
			addCriterion("PARENT_IDX <", value, "parentIdx");
			return (Criteria) this;
		}

		public Criteria andParentIdxLessThanOrEqualTo(String value) {
			addCriterion("PARENT_IDX <=", value, "parentIdx");
			return (Criteria) this;
		}

		public Criteria andParentIdxLike(String value) {
			addCriterion("PARENT_IDX like", value, "parentIdx");
			return (Criteria) this;
		}

		public Criteria andParentIdxNotLike(String value) {
			addCriterion("PARENT_IDX not like", value, "parentIdx");
			return (Criteria) this;
		}

		public Criteria andParentIdxIn(List<String> values) {
			addCriterion("PARENT_IDX in", values, "parentIdx");
			return (Criteria) this;
		}

		public Criteria andParentIdxNotIn(List<String> values) {
			addCriterion("PARENT_IDX not in", values, "parentIdx");
			return (Criteria) this;
		}

		public Criteria andParentIdxBetween(String value1, String value2) {
			addCriterion("PARENT_IDX between", value1, value2, "parentIdx");
			return (Criteria) this;
		}

		public Criteria andParentIdxNotBetween(String value1, String value2) {
			addCriterion("PARENT_IDX not between", value1, value2, "parentIdx");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("NAME is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("NAME is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("NAME =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("NAME <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("NAME >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("NAME >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("NAME <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("NAME <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("NAME like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("NAME not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("NAME in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("NAME not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("NAME between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("NAME not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andDepthIsNull() {
			addCriterion("DEPTH is null");
			return (Criteria) this;
		}

		public Criteria andDepthIsNotNull() {
			addCriterion("DEPTH is not null");
			return (Criteria) this;
		}

		public Criteria andDepthEqualTo(Integer value) {
			addCriterion("DEPTH =", value, "depth");
			return (Criteria) this;
		}

		public Criteria andDepthNotEqualTo(Integer value) {
			addCriterion("DEPTH <>", value, "depth");
			return (Criteria) this;
		}

		public Criteria andDepthGreaterThan(Integer value) {
			addCriterion("DEPTH >", value, "depth");
			return (Criteria) this;
		}

		public Criteria andDepthGreaterThanOrEqualTo(Integer value) {
			addCriterion("DEPTH >=", value, "depth");
			return (Criteria) this;
		}

		public Criteria andDepthLessThan(Integer value) {
			addCriterion("DEPTH <", value, "depth");
			return (Criteria) this;
		}

		public Criteria andDepthLessThanOrEqualTo(Integer value) {
			addCriterion("DEPTH <=", value, "depth");
			return (Criteria) this;
		}

		public Criteria andDepthIn(List<Integer> values) {
			addCriterion("DEPTH in", values, "depth");
			return (Criteria) this;
		}

		public Criteria andDepthNotIn(List<Integer> values) {
			addCriterion("DEPTH not in", values, "depth");
			return (Criteria) this;
		}

		public Criteria andDepthBetween(Integer value1, Integer value2) {
			addCriterion("DEPTH between", value1, value2, "depth");
			return (Criteria) this;
		}

		public Criteria andDepthNotBetween(Integer value1, Integer value2) {
			addCriterion("DEPTH not between", value1, value2, "depth");
			return (Criteria) this;
		}

		public Criteria andOrdIsNull() {
			addCriterion("ORD is null");
			return (Criteria) this;
		}

		public Criteria andOrdIsNotNull() {
			addCriterion("ORD is not null");
			return (Criteria) this;
		}

		public Criteria andOrdEqualTo(Integer value) {
			addCriterion("ORD =", value, "ord");
			return (Criteria) this;
		}

		public Criteria andOrdNotEqualTo(Integer value) {
			addCriterion("ORD <>", value, "ord");
			return (Criteria) this;
		}

		public Criteria andOrdGreaterThan(Integer value) {
			addCriterion("ORD >", value, "ord");
			return (Criteria) this;
		}

		public Criteria andOrdGreaterThanOrEqualTo(Integer value) {
			addCriterion("ORD >=", value, "ord");
			return (Criteria) this;
		}

		public Criteria andOrdLessThan(Integer value) {
			addCriterion("ORD <", value, "ord");
			return (Criteria) this;
		}

		public Criteria andOrdLessThanOrEqualTo(Integer value) {
			addCriterion("ORD <=", value, "ord");
			return (Criteria) this;
		}

		public Criteria andOrdIn(List<Integer> values) {
			addCriterion("ORD in", values, "ord");
			return (Criteria) this;
		}

		public Criteria andOrdNotIn(List<Integer> values) {
			addCriterion("ORD not in", values, "ord");
			return (Criteria) this;
		}

		public Criteria andOrdBetween(Integer value1, Integer value2) {
			addCriterion("ORD between", value1, value2, "ord");
			return (Criteria) this;
		}

		public Criteria andOrdNotBetween(Integer value1, Integer value2) {
			addCriterion("ORD not between", value1, value2, "ord");
			return (Criteria) this;
		}

		public Criteria andIsPrivateIsNull() {
			addCriterion("IS_PRIVATE is null");
			return (Criteria) this;
		}

		public Criteria andIsPrivateIsNotNull() {
			addCriterion("IS_PRIVATE is not null");
			return (Criteria) this;
		}

		public Criteria andIsPrivateEqualTo(Integer value) {
			addCriterion("IS_PRIVATE =", value, "isPrivate");
			return (Criteria) this;
		}

		public Criteria andIsPrivateNotEqualTo(Integer value) {
			addCriterion("IS_PRIVATE <>", value, "isPrivate");
			return (Criteria) this;
		}

		public Criteria andIsPrivateGreaterThan(Integer value) {
			addCriterion("IS_PRIVATE >", value, "isPrivate");
			return (Criteria) this;
		}

		public Criteria andIsPrivateGreaterThanOrEqualTo(Integer value) {
			addCriterion("IS_PRIVATE >=", value, "isPrivate");
			return (Criteria) this;
		}

		public Criteria andIsPrivateLessThan(Integer value) {
			addCriterion("IS_PRIVATE <", value, "isPrivate");
			return (Criteria) this;
		}

		public Criteria andIsPrivateLessThanOrEqualTo(Integer value) {
			addCriterion("IS_PRIVATE <=", value, "isPrivate");
			return (Criteria) this;
		}

		public Criteria andIsPrivateIn(List<Integer> values) {
			addCriterion("IS_PRIVATE in", values, "isPrivate");
			return (Criteria) this;
		}

		public Criteria andIsPrivateNotIn(List<Integer> values) {
			addCriterion("IS_PRIVATE not in", values, "isPrivate");
			return (Criteria) this;
		}

		public Criteria andIsPrivateBetween(Integer value1, Integer value2) {
			addCriterion("IS_PRIVATE between", value1, value2, "isPrivate");
			return (Criteria) this;
		}

		public Criteria andIsPrivateNotBetween(Integer value1, Integer value2) {
			addCriterion("IS_PRIVATE not between", value1, value2, "isPrivate");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table categories
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
     * This class corresponds to the database table CATEGORIES
     *
     * @mbg.generated do_not_delete_during_merge Tue Apr 10 19:37:22 KST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}