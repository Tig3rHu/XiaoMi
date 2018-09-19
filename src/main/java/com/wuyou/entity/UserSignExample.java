package com.wuyou.entity;

import java.util.ArrayList;
import java.util.List;

public class UserSignExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserSignExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andSigntotalIsNull() {
            addCriterion("signtotal is null");
            return (Criteria) this;
        }

        public Criteria andSigntotalIsNotNull() {
            addCriterion("signtotal is not null");
            return (Criteria) this;
        }

        public Criteria andSigntotalEqualTo(Integer value) {
            addCriterion("signtotal =", value, "signtotal");
            return (Criteria) this;
        }

        public Criteria andSigntotalNotEqualTo(Integer value) {
            addCriterion("signtotal <>", value, "signtotal");
            return (Criteria) this;
        }

        public Criteria andSigntotalGreaterThan(Integer value) {
            addCriterion("signtotal >", value, "signtotal");
            return (Criteria) this;
        }

        public Criteria andSigntotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("signtotal >=", value, "signtotal");
            return (Criteria) this;
        }

        public Criteria andSigntotalLessThan(Integer value) {
            addCriterion("signtotal <", value, "signtotal");
            return (Criteria) this;
        }

        public Criteria andSigntotalLessThanOrEqualTo(Integer value) {
            addCriterion("signtotal <=", value, "signtotal");
            return (Criteria) this;
        }

        public Criteria andSigntotalIn(List<Integer> values) {
            addCriterion("signtotal in", values, "signtotal");
            return (Criteria) this;
        }

        public Criteria andSigntotalNotIn(List<Integer> values) {
            addCriterion("signtotal not in", values, "signtotal");
            return (Criteria) this;
        }

        public Criteria andSigntotalBetween(Integer value1, Integer value2) {
            addCriterion("signtotal between", value1, value2, "signtotal");
            return (Criteria) this;
        }

        public Criteria andSigntotalNotBetween(Integer value1, Integer value2) {
            addCriterion("signtotal not between", value1, value2, "signtotal");
            return (Criteria) this;
        }

        public Criteria andSigncountIsNull() {
            addCriterion("signcount is null");
            return (Criteria) this;
        }

        public Criteria andSigncountIsNotNull() {
            addCriterion("signcount is not null");
            return (Criteria) this;
        }

        public Criteria andSigncountEqualTo(Integer value) {
            addCriterion("signcount =", value, "signcount");
            return (Criteria) this;
        }

        public Criteria andSigncountNotEqualTo(Integer value) {
            addCriterion("signcount <>", value, "signcount");
            return (Criteria) this;
        }

        public Criteria andSigncountGreaterThan(Integer value) {
            addCriterion("signcount >", value, "signcount");
            return (Criteria) this;
        }

        public Criteria andSigncountGreaterThanOrEqualTo(Integer value) {
            addCriterion("signcount >=", value, "signcount");
            return (Criteria) this;
        }

        public Criteria andSigncountLessThan(Integer value) {
            addCriterion("signcount <", value, "signcount");
            return (Criteria) this;
        }

        public Criteria andSigncountLessThanOrEqualTo(Integer value) {
            addCriterion("signcount <=", value, "signcount");
            return (Criteria) this;
        }

        public Criteria andSigncountIn(List<Integer> values) {
            addCriterion("signcount in", values, "signcount");
            return (Criteria) this;
        }

        public Criteria andSigncountNotIn(List<Integer> values) {
            addCriterion("signcount not in", values, "signcount");
            return (Criteria) this;
        }

        public Criteria andSigncountBetween(Integer value1, Integer value2) {
            addCriterion("signcount between", value1, value2, "signcount");
            return (Criteria) this;
        }

        public Criteria andSigncountNotBetween(Integer value1, Integer value2) {
            addCriterion("signcount not between", value1, value2, "signcount");
            return (Criteria) this;
        }

        public Criteria andLastsignIsNull() {
            addCriterion("lastsign is null");
            return (Criteria) this;
        }

        public Criteria andLastsignIsNotNull() {
            addCriterion("lastsign is not null");
            return (Criteria) this;
        }

        public Criteria andLastsignEqualTo(String value) {
            addCriterion("lastsign =", value, "lastsign");
            return (Criteria) this;
        }

        public Criteria andLastsignNotEqualTo(String value) {
            addCriterion("lastsign <>", value, "lastsign");
            return (Criteria) this;
        }

        public Criteria andLastsignGreaterThan(String value) {
            addCriterion("lastsign >", value, "lastsign");
            return (Criteria) this;
        }

        public Criteria andLastsignGreaterThanOrEqualTo(String value) {
            addCriterion("lastsign >=", value, "lastsign");
            return (Criteria) this;
        }

        public Criteria andLastsignLessThan(String value) {
            addCriterion("lastsign <", value, "lastsign");
            return (Criteria) this;
        }

        public Criteria andLastsignLessThanOrEqualTo(String value) {
            addCriterion("lastsign <=", value, "lastsign");
            return (Criteria) this;
        }

        public Criteria andLastsignLike(String value) {
            addCriterion("lastsign like", value, "lastsign");
            return (Criteria) this;
        }

        public Criteria andLastsignNotLike(String value) {
            addCriterion("lastsign not like", value, "lastsign");
            return (Criteria) this;
        }

        public Criteria andLastsignIn(List<String> values) {
            addCriterion("lastsign in", values, "lastsign");
            return (Criteria) this;
        }

        public Criteria andLastsignNotIn(List<String> values) {
            addCriterion("lastsign not in", values, "lastsign");
            return (Criteria) this;
        }

        public Criteria andLastsignBetween(String value1, String value2) {
            addCriterion("lastsign between", value1, value2, "lastsign");
            return (Criteria) this;
        }

        public Criteria andLastsignNotBetween(String value1, String value2) {
            addCriterion("lastsign not between", value1, value2, "lastsign");
            return (Criteria) this;
        }

        public Criteria andCumtrapzIsNull() {
            addCriterion("cumtrapz is null");
            return (Criteria) this;
        }

        public Criteria andCumtrapzIsNotNull() {
            addCriterion("cumtrapz is not null");
            return (Criteria) this;
        }

        public Criteria andCumtrapzEqualTo(Integer value) {
            addCriterion("cumtrapz =", value, "cumtrapz");
            return (Criteria) this;
        }

        public Criteria andCumtrapzNotEqualTo(Integer value) {
            addCriterion("cumtrapz <>", value, "cumtrapz");
            return (Criteria) this;
        }

        public Criteria andCumtrapzGreaterThan(Integer value) {
            addCriterion("cumtrapz >", value, "cumtrapz");
            return (Criteria) this;
        }

        public Criteria andCumtrapzGreaterThanOrEqualTo(Integer value) {
            addCriterion("cumtrapz >=", value, "cumtrapz");
            return (Criteria) this;
        }

        public Criteria andCumtrapzLessThan(Integer value) {
            addCriterion("cumtrapz <", value, "cumtrapz");
            return (Criteria) this;
        }

        public Criteria andCumtrapzLessThanOrEqualTo(Integer value) {
            addCriterion("cumtrapz <=", value, "cumtrapz");
            return (Criteria) this;
        }

        public Criteria andCumtrapzIn(List<Integer> values) {
            addCriterion("cumtrapz in", values, "cumtrapz");
            return (Criteria) this;
        }

        public Criteria andCumtrapzNotIn(List<Integer> values) {
            addCriterion("cumtrapz not in", values, "cumtrapz");
            return (Criteria) this;
        }

        public Criteria andCumtrapzBetween(Integer value1, Integer value2) {
            addCriterion("cumtrapz between", value1, value2, "cumtrapz");
            return (Criteria) this;
        }

        public Criteria andCumtrapzNotBetween(Integer value1, Integer value2) {
            addCriterion("cumtrapz not between", value1, value2, "cumtrapz");
            return (Criteria) this;
        }

        public Criteria andThismonthIsNull() {
            addCriterion("thismonth is null");
            return (Criteria) this;
        }

        public Criteria andThismonthIsNotNull() {
            addCriterion("thismonth is not null");
            return (Criteria) this;
        }

        public Criteria andThismonthEqualTo(Integer value) {
            addCriterion("thismonth =", value, "thismonth");
            return (Criteria) this;
        }

        public Criteria andThismonthNotEqualTo(Integer value) {
            addCriterion("thismonth <>", value, "thismonth");
            return (Criteria) this;
        }

        public Criteria andThismonthGreaterThan(Integer value) {
            addCriterion("thismonth >", value, "thismonth");
            return (Criteria) this;
        }

        public Criteria andThismonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("thismonth >=", value, "thismonth");
            return (Criteria) this;
        }

        public Criteria andThismonthLessThan(Integer value) {
            addCriterion("thismonth <", value, "thismonth");
            return (Criteria) this;
        }

        public Criteria andThismonthLessThanOrEqualTo(Integer value) {
            addCriterion("thismonth <=", value, "thismonth");
            return (Criteria) this;
        }

        public Criteria andThismonthIn(List<Integer> values) {
            addCriterion("thismonth in", values, "thismonth");
            return (Criteria) this;
        }

        public Criteria andThismonthNotIn(List<Integer> values) {
            addCriterion("thismonth not in", values, "thismonth");
            return (Criteria) this;
        }

        public Criteria andThismonthBetween(Integer value1, Integer value2) {
            addCriterion("thismonth between", value1, value2, "thismonth");
            return (Criteria) this;
        }

        public Criteria andThismonthNotBetween(Integer value1, Integer value2) {
            addCriterion("thismonth not between", value1, value2, "thismonth");
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