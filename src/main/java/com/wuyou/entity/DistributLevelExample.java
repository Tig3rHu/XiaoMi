package com.wuyou.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DistributLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DistributLevelExample() {
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

        public Criteria andLevelIdIsNull() {
            addCriterion("level_id is null");
            return (Criteria) this;
        }

        public Criteria andLevelIdIsNotNull() {
            addCriterion("level_id is not null");
            return (Criteria) this;
        }

        public Criteria andLevelIdEqualTo(Byte value) {
            addCriterion("level_id =", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotEqualTo(Byte value) {
            addCriterion("level_id <>", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdGreaterThan(Byte value) {
            addCriterion("level_id >", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("level_id >=", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdLessThan(Byte value) {
            addCriterion("level_id <", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdLessThanOrEqualTo(Byte value) {
            addCriterion("level_id <=", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdIn(List<Byte> values) {
            addCriterion("level_id in", values, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotIn(List<Byte> values) {
            addCriterion("level_id not in", values, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdBetween(Byte value1, Byte value2) {
            addCriterion("level_id between", value1, value2, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotBetween(Byte value1, Byte value2) {
            addCriterion("level_id not between", value1, value2, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelTypeIsNull() {
            addCriterion("level_type is null");
            return (Criteria) this;
        }

        public Criteria andLevelTypeIsNotNull() {
            addCriterion("level_type is not null");
            return (Criteria) this;
        }

        public Criteria andLevelTypeEqualTo(Boolean value) {
            addCriterion("level_type =", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeNotEqualTo(Boolean value) {
            addCriterion("level_type <>", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeGreaterThan(Boolean value) {
            addCriterion("level_type >", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("level_type >=", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeLessThan(Boolean value) {
            addCriterion("level_type <", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("level_type <=", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeIn(List<Boolean> values) {
            addCriterion("level_type in", values, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeNotIn(List<Boolean> values) {
            addCriterion("level_type not in", values, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("level_type between", value1, value2, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("level_type not between", value1, value2, "levelType");
            return (Criteria) this;
        }

        public Criteria andRate1IsNull() {
            addCriterion("rate1 is null");
            return (Criteria) this;
        }

        public Criteria andRate1IsNotNull() {
            addCriterion("rate1 is not null");
            return (Criteria) this;
        }

        public Criteria andRate1EqualTo(BigDecimal value) {
            addCriterion("rate1 =", value, "rate1");
            return (Criteria) this;
        }

        public Criteria andRate1NotEqualTo(BigDecimal value) {
            addCriterion("rate1 <>", value, "rate1");
            return (Criteria) this;
        }

        public Criteria andRate1GreaterThan(BigDecimal value) {
            addCriterion("rate1 >", value, "rate1");
            return (Criteria) this;
        }

        public Criteria andRate1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rate1 >=", value, "rate1");
            return (Criteria) this;
        }

        public Criteria andRate1LessThan(BigDecimal value) {
            addCriterion("rate1 <", value, "rate1");
            return (Criteria) this;
        }

        public Criteria andRate1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("rate1 <=", value, "rate1");
            return (Criteria) this;
        }

        public Criteria andRate1In(List<BigDecimal> values) {
            addCriterion("rate1 in", values, "rate1");
            return (Criteria) this;
        }

        public Criteria andRate1NotIn(List<BigDecimal> values) {
            addCriterion("rate1 not in", values, "rate1");
            return (Criteria) this;
        }

        public Criteria andRate1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate1 between", value1, value2, "rate1");
            return (Criteria) this;
        }

        public Criteria andRate1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate1 not between", value1, value2, "rate1");
            return (Criteria) this;
        }

        public Criteria andRate2IsNull() {
            addCriterion("rate2 is null");
            return (Criteria) this;
        }

        public Criteria andRate2IsNotNull() {
            addCriterion("rate2 is not null");
            return (Criteria) this;
        }

        public Criteria andRate2EqualTo(BigDecimal value) {
            addCriterion("rate2 =", value, "rate2");
            return (Criteria) this;
        }

        public Criteria andRate2NotEqualTo(BigDecimal value) {
            addCriterion("rate2 <>", value, "rate2");
            return (Criteria) this;
        }

        public Criteria andRate2GreaterThan(BigDecimal value) {
            addCriterion("rate2 >", value, "rate2");
            return (Criteria) this;
        }

        public Criteria andRate2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rate2 >=", value, "rate2");
            return (Criteria) this;
        }

        public Criteria andRate2LessThan(BigDecimal value) {
            addCriterion("rate2 <", value, "rate2");
            return (Criteria) this;
        }

        public Criteria andRate2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("rate2 <=", value, "rate2");
            return (Criteria) this;
        }

        public Criteria andRate2In(List<BigDecimal> values) {
            addCriterion("rate2 in", values, "rate2");
            return (Criteria) this;
        }

        public Criteria andRate2NotIn(List<BigDecimal> values) {
            addCriterion("rate2 not in", values, "rate2");
            return (Criteria) this;
        }

        public Criteria andRate2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate2 between", value1, value2, "rate2");
            return (Criteria) this;
        }

        public Criteria andRate2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate2 not between", value1, value2, "rate2");
            return (Criteria) this;
        }

        public Criteria andRate3IsNull() {
            addCriterion("rate3 is null");
            return (Criteria) this;
        }

        public Criteria andRate3IsNotNull() {
            addCriterion("rate3 is not null");
            return (Criteria) this;
        }

        public Criteria andRate3EqualTo(BigDecimal value) {
            addCriterion("rate3 =", value, "rate3");
            return (Criteria) this;
        }

        public Criteria andRate3NotEqualTo(BigDecimal value) {
            addCriterion("rate3 <>", value, "rate3");
            return (Criteria) this;
        }

        public Criteria andRate3GreaterThan(BigDecimal value) {
            addCriterion("rate3 >", value, "rate3");
            return (Criteria) this;
        }

        public Criteria andRate3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rate3 >=", value, "rate3");
            return (Criteria) this;
        }

        public Criteria andRate3LessThan(BigDecimal value) {
            addCriterion("rate3 <", value, "rate3");
            return (Criteria) this;
        }

        public Criteria andRate3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("rate3 <=", value, "rate3");
            return (Criteria) this;
        }

        public Criteria andRate3In(List<BigDecimal> values) {
            addCriterion("rate3 in", values, "rate3");
            return (Criteria) this;
        }

        public Criteria andRate3NotIn(List<BigDecimal> values) {
            addCriterion("rate3 not in", values, "rate3");
            return (Criteria) this;
        }

        public Criteria andRate3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate3 between", value1, value2, "rate3");
            return (Criteria) this;
        }

        public Criteria andRate3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate3 not between", value1, value2, "rate3");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIsNull() {
            addCriterion("order_money is null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIsNotNull() {
            addCriterion("order_money is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyEqualTo(BigDecimal value) {
            addCriterion("order_money =", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotEqualTo(BigDecimal value) {
            addCriterion("order_money <>", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyGreaterThan(BigDecimal value) {
            addCriterion("order_money >", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_money >=", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLessThan(BigDecimal value) {
            addCriterion("order_money <", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_money <=", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIn(List<BigDecimal> values) {
            addCriterion("order_money in", values, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotIn(List<BigDecimal> values) {
            addCriterion("order_money not in", values, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_money between", value1, value2, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_money not between", value1, value2, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andLevelNameIsNull() {
            addCriterion("level_name is null");
            return (Criteria) this;
        }

        public Criteria andLevelNameIsNotNull() {
            addCriterion("level_name is not null");
            return (Criteria) this;
        }

        public Criteria andLevelNameEqualTo(String value) {
            addCriterion("level_name =", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotEqualTo(String value) {
            addCriterion("level_name <>", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameGreaterThan(String value) {
            addCriterion("level_name >", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("level_name >=", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameLessThan(String value) {
            addCriterion("level_name <", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameLessThanOrEqualTo(String value) {
            addCriterion("level_name <=", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameLike(String value) {
            addCriterion("level_name like", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotLike(String value) {
            addCriterion("level_name not like", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameIn(List<String> values) {
            addCriterion("level_name in", values, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotIn(List<String> values) {
            addCriterion("level_name not in", values, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameBetween(String value1, String value2) {
            addCriterion("level_name between", value1, value2, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotBetween(String value1, String value2) {
            addCriterion("level_name not between", value1, value2, "levelName");
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