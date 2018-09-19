package com.wuyou.entity;

import java.util.ArrayList;
import java.util.List;

public class ShippingAreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShippingAreaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andShippingAreaIdIsNull() {
            addCriterion("shipping_area_id is null");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdIsNotNull() {
            addCriterion("shipping_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdEqualTo(Short value) {
            addCriterion("shipping_area_id =", value, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdNotEqualTo(Short value) {
            addCriterion("shipping_area_id <>", value, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdGreaterThan(Short value) {
            addCriterion("shipping_area_id >", value, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdGreaterThanOrEqualTo(Short value) {
            addCriterion("shipping_area_id >=", value, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdLessThan(Short value) {
            addCriterion("shipping_area_id <", value, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdLessThanOrEqualTo(Short value) {
            addCriterion("shipping_area_id <=", value, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdIn(List<Short> values) {
            addCriterion("shipping_area_id in", values, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdNotIn(List<Short> values) {
            addCriterion("shipping_area_id not in", values, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdBetween(Short value1, Short value2) {
            addCriterion("shipping_area_id between", value1, value2, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdNotBetween(Short value1, Short value2) {
            addCriterion("shipping_area_id not between", value1, value2, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameIsNull() {
            addCriterion("shipping_area_name is null");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameIsNotNull() {
            addCriterion("shipping_area_name is not null");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameEqualTo(String value) {
            addCriterion("shipping_area_name =", value, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameNotEqualTo(String value) {
            addCriterion("shipping_area_name <>", value, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameGreaterThan(String value) {
            addCriterion("shipping_area_name >", value, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_area_name >=", value, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameLessThan(String value) {
            addCriterion("shipping_area_name <", value, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameLessThanOrEqualTo(String value) {
            addCriterion("shipping_area_name <=", value, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameLike(String value) {
            addCriterion("shipping_area_name like", value, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameNotLike(String value) {
            addCriterion("shipping_area_name not like", value, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameIn(List<String> values) {
            addCriterion("shipping_area_name in", values, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameNotIn(List<String> values) {
            addCriterion("shipping_area_name not in", values, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameBetween(String value1, String value2) {
            addCriterion("shipping_area_name between", value1, value2, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameNotBetween(String value1, String value2) {
            addCriterion("shipping_area_name not between", value1, value2, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingCodeIsNull() {
            addCriterion("shipping_code is null");
            return (Criteria) this;
        }

        public Criteria andShippingCodeIsNotNull() {
            addCriterion("shipping_code is not null");
            return (Criteria) this;
        }

        public Criteria andShippingCodeEqualTo(String value) {
            addCriterion("shipping_code =", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeNotEqualTo(String value) {
            addCriterion("shipping_code <>", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeGreaterThan(String value) {
            addCriterion("shipping_code >", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_code >=", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeLessThan(String value) {
            addCriterion("shipping_code <", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeLessThanOrEqualTo(String value) {
            addCriterion("shipping_code <=", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeLike(String value) {
            addCriterion("shipping_code like", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeNotLike(String value) {
            addCriterion("shipping_code not like", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeIn(List<String> values) {
            addCriterion("shipping_code in", values, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeNotIn(List<String> values) {
            addCriterion("shipping_code not in", values, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeBetween(String value1, String value2) {
            addCriterion("shipping_code between", value1, value2, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeNotBetween(String value1, String value2) {
            addCriterion("shipping_code not between", value1, value2, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Integer value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Integer value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Integer value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Integer value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Integer> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Integer> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Integer value1, Integer value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNull() {
            addCriterion("is_default is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("is_default is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(Boolean value) {
            addCriterion("is_default =", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(Boolean value) {
            addCriterion("is_default <>", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(Boolean value) {
            addCriterion("is_default >", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_default >=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(Boolean value) {
            addCriterion("is_default <", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(Boolean value) {
            addCriterion("is_default <=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<Boolean> values) {
            addCriterion("is_default in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<Boolean> values) {
            addCriterion("is_default not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(Boolean value1, Boolean value2) {
            addCriterion("is_default between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_default not between", value1, value2, "isDefault");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
}