package com.wuyou.entity;

import java.util.ArrayList;
import java.util.List;

public class OauthUsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OauthUsersExample() {
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

        public Criteria andTuIdIsNull() {
            addCriterion("tu_id is null");
            return (Criteria) this;
        }

        public Criteria andTuIdIsNotNull() {
            addCriterion("tu_id is not null");
            return (Criteria) this;
        }

        public Criteria andTuIdEqualTo(Integer value) {
            addCriterion("tu_id =", value, "tuId");
            return (Criteria) this;
        }

        public Criteria andTuIdNotEqualTo(Integer value) {
            addCriterion("tu_id <>", value, "tuId");
            return (Criteria) this;
        }

        public Criteria andTuIdGreaterThan(Integer value) {
            addCriterion("tu_id >", value, "tuId");
            return (Criteria) this;
        }

        public Criteria andTuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tu_id >=", value, "tuId");
            return (Criteria) this;
        }

        public Criteria andTuIdLessThan(Integer value) {
            addCriterion("tu_id <", value, "tuId");
            return (Criteria) this;
        }

        public Criteria andTuIdLessThanOrEqualTo(Integer value) {
            addCriterion("tu_id <=", value, "tuId");
            return (Criteria) this;
        }

        public Criteria andTuIdIn(List<Integer> values) {
            addCriterion("tu_id in", values, "tuId");
            return (Criteria) this;
        }

        public Criteria andTuIdNotIn(List<Integer> values) {
            addCriterion("tu_id not in", values, "tuId");
            return (Criteria) this;
        }

        public Criteria andTuIdBetween(Integer value1, Integer value2) {
            addCriterion("tu_id between", value1, value2, "tuId");
            return (Criteria) this;
        }

        public Criteria andTuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tu_id not between", value1, value2, "tuId");
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

        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOauthIsNull() {
            addCriterion("oauth is null");
            return (Criteria) this;
        }

        public Criteria andOauthIsNotNull() {
            addCriterion("oauth is not null");
            return (Criteria) this;
        }

        public Criteria andOauthEqualTo(String value) {
            addCriterion("oauth =", value, "oauth");
            return (Criteria) this;
        }

        public Criteria andOauthNotEqualTo(String value) {
            addCriterion("oauth <>", value, "oauth");
            return (Criteria) this;
        }

        public Criteria andOauthGreaterThan(String value) {
            addCriterion("oauth >", value, "oauth");
            return (Criteria) this;
        }

        public Criteria andOauthGreaterThanOrEqualTo(String value) {
            addCriterion("oauth >=", value, "oauth");
            return (Criteria) this;
        }

        public Criteria andOauthLessThan(String value) {
            addCriterion("oauth <", value, "oauth");
            return (Criteria) this;
        }

        public Criteria andOauthLessThanOrEqualTo(String value) {
            addCriterion("oauth <=", value, "oauth");
            return (Criteria) this;
        }

        public Criteria andOauthLike(String value) {
            addCriterion("oauth like", value, "oauth");
            return (Criteria) this;
        }

        public Criteria andOauthNotLike(String value) {
            addCriterion("oauth not like", value, "oauth");
            return (Criteria) this;
        }

        public Criteria andOauthIn(List<String> values) {
            addCriterion("oauth in", values, "oauth");
            return (Criteria) this;
        }

        public Criteria andOauthNotIn(List<String> values) {
            addCriterion("oauth not in", values, "oauth");
            return (Criteria) this;
        }

        public Criteria andOauthBetween(String value1, String value2) {
            addCriterion("oauth between", value1, value2, "oauth");
            return (Criteria) this;
        }

        public Criteria andOauthNotBetween(String value1, String value2) {
            addCriterion("oauth not between", value1, value2, "oauth");
            return (Criteria) this;
        }

        public Criteria andUnionidIsNull() {
            addCriterion("unionid is null");
            return (Criteria) this;
        }

        public Criteria andUnionidIsNotNull() {
            addCriterion("unionid is not null");
            return (Criteria) this;
        }

        public Criteria andUnionidEqualTo(String value) {
            addCriterion("unionid =", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotEqualTo(String value) {
            addCriterion("unionid <>", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidGreaterThan(String value) {
            addCriterion("unionid >", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidGreaterThanOrEqualTo(String value) {
            addCriterion("unionid >=", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLessThan(String value) {
            addCriterion("unionid <", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLessThanOrEqualTo(String value) {
            addCriterion("unionid <=", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLike(String value) {
            addCriterion("unionid like", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotLike(String value) {
            addCriterion("unionid not like", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidIn(List<String> values) {
            addCriterion("unionid in", values, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotIn(List<String> values) {
            addCriterion("unionid not in", values, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidBetween(String value1, String value2) {
            addCriterion("unionid between", value1, value2, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotBetween(String value1, String value2) {
            addCriterion("unionid not between", value1, value2, "unionid");
            return (Criteria) this;
        }

        public Criteria andOauthChildIsNull() {
            addCriterion("oauth_child is null");
            return (Criteria) this;
        }

        public Criteria andOauthChildIsNotNull() {
            addCriterion("oauth_child is not null");
            return (Criteria) this;
        }

        public Criteria andOauthChildEqualTo(String value) {
            addCriterion("oauth_child =", value, "oauthChild");
            return (Criteria) this;
        }

        public Criteria andOauthChildNotEqualTo(String value) {
            addCriterion("oauth_child <>", value, "oauthChild");
            return (Criteria) this;
        }

        public Criteria andOauthChildGreaterThan(String value) {
            addCriterion("oauth_child >", value, "oauthChild");
            return (Criteria) this;
        }

        public Criteria andOauthChildGreaterThanOrEqualTo(String value) {
            addCriterion("oauth_child >=", value, "oauthChild");
            return (Criteria) this;
        }

        public Criteria andOauthChildLessThan(String value) {
            addCriterion("oauth_child <", value, "oauthChild");
            return (Criteria) this;
        }

        public Criteria andOauthChildLessThanOrEqualTo(String value) {
            addCriterion("oauth_child <=", value, "oauthChild");
            return (Criteria) this;
        }

        public Criteria andOauthChildLike(String value) {
            addCriterion("oauth_child like", value, "oauthChild");
            return (Criteria) this;
        }

        public Criteria andOauthChildNotLike(String value) {
            addCriterion("oauth_child not like", value, "oauthChild");
            return (Criteria) this;
        }

        public Criteria andOauthChildIn(List<String> values) {
            addCriterion("oauth_child in", values, "oauthChild");
            return (Criteria) this;
        }

        public Criteria andOauthChildNotIn(List<String> values) {
            addCriterion("oauth_child not in", values, "oauthChild");
            return (Criteria) this;
        }

        public Criteria andOauthChildBetween(String value1, String value2) {
            addCriterion("oauth_child between", value1, value2, "oauthChild");
            return (Criteria) this;
        }

        public Criteria andOauthChildNotBetween(String value1, String value2) {
            addCriterion("oauth_child not between", value1, value2, "oauthChild");
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