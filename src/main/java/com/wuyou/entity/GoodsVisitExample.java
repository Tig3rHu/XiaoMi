package com.wuyou.entity;

import java.util.ArrayList;
import java.util.List;

public class GoodsVisitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsVisitExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
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

        public Criteria andVisitIdIsNull() {
            addCriterion("visit_id is null");
            return (Criteria) this;
        }

        public Criteria andVisitIdIsNotNull() {
            addCriterion("visit_id is not null");
            return (Criteria) this;
        }

        public Criteria andVisitIdEqualTo(Integer value) {
            addCriterion("visit_id =", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdNotEqualTo(Integer value) {
            addCriterion("visit_id <>", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdGreaterThan(Integer value) {
            addCriterion("visit_id >", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("visit_id >=", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdLessThan(Integer value) {
            addCriterion("visit_id <", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdLessThanOrEqualTo(Integer value) {
            addCriterion("visit_id <=", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdIn(List<Integer> values) {
            addCriterion("visit_id in", values, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdNotIn(List<Integer> values) {
            addCriterion("visit_id not in", values, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdBetween(Integer value1, Integer value2) {
            addCriterion("visit_id between", value1, value2, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("visit_id not between", value1, value2, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisittimeIsNull() {
            addCriterion("visittime is null");
            return (Criteria) this;
        }

        public Criteria andVisittimeIsNotNull() {
            addCriterion("visittime is not null");
            return (Criteria) this;
        }

        public Criteria andVisittimeEqualTo(Integer value) {
            addCriterion("visittime =", value, "visittime");
            return (Criteria) this;
        }

        public Criteria andVisittimeNotEqualTo(Integer value) {
            addCriterion("visittime <>", value, "visittime");
            return (Criteria) this;
        }

        public Criteria andVisittimeGreaterThan(Integer value) {
            addCriterion("visittime >", value, "visittime");
            return (Criteria) this;
        }

        public Criteria andVisittimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("visittime >=", value, "visittime");
            return (Criteria) this;
        }

        public Criteria andVisittimeLessThan(Integer value) {
            addCriterion("visittime <", value, "visittime");
            return (Criteria) this;
        }

        public Criteria andVisittimeLessThanOrEqualTo(Integer value) {
            addCriterion("visittime <=", value, "visittime");
            return (Criteria) this;
        }

        public Criteria andVisittimeIn(List<Integer> values) {
            addCriterion("visittime in", values, "visittime");
            return (Criteria) this;
        }

        public Criteria andVisittimeNotIn(List<Integer> values) {
            addCriterion("visittime not in", values, "visittime");
            return (Criteria) this;
        }

        public Criteria andVisittimeBetween(Integer value1, Integer value2) {
            addCriterion("visittime between", value1, value2, "visittime");
            return (Criteria) this;
        }

        public Criteria andVisittimeNotBetween(Integer value1, Integer value2) {
            addCriterion("visittime not between", value1, value2, "visittime");
            return (Criteria) this;
        }

        public Criteria andCatIdIsNull() {
            addCriterion("cat_id is null");
            return (Criteria) this;
        }

        public Criteria andCatIdIsNotNull() {
            addCriterion("cat_id is not null");
            return (Criteria) this;
        }

        public Criteria andCatIdEqualTo(Integer value) {
            addCriterion("cat_id =", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotEqualTo(Integer value) {
            addCriterion("cat_id <>", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdGreaterThan(Integer value) {
            addCriterion("cat_id >", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cat_id >=", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdLessThan(Integer value) {
            addCriterion("cat_id <", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdLessThanOrEqualTo(Integer value) {
            addCriterion("cat_id <=", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdIn(List<Integer> values) {
            addCriterion("cat_id in", values, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotIn(List<Integer> values) {
            addCriterion("cat_id not in", values, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdBetween(Integer value1, Integer value2) {
            addCriterion("cat_id between", value1, value2, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cat_id not between", value1, value2, "catId");
            return (Criteria) this;
        }

        public Criteria andExtendCatIdIsNull() {
            addCriterion("extend_cat_id is null");
            return (Criteria) this;
        }

        public Criteria andExtendCatIdIsNotNull() {
            addCriterion("extend_cat_id is not null");
            return (Criteria) this;
        }

        public Criteria andExtendCatIdEqualTo(Integer value) {
            addCriterion("extend_cat_id =", value, "extendCatId");
            return (Criteria) this;
        }

        public Criteria andExtendCatIdNotEqualTo(Integer value) {
            addCriterion("extend_cat_id <>", value, "extendCatId");
            return (Criteria) this;
        }

        public Criteria andExtendCatIdGreaterThan(Integer value) {
            addCriterion("extend_cat_id >", value, "extendCatId");
            return (Criteria) this;
        }

        public Criteria andExtendCatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("extend_cat_id >=", value, "extendCatId");
            return (Criteria) this;
        }

        public Criteria andExtendCatIdLessThan(Integer value) {
            addCriterion("extend_cat_id <", value, "extendCatId");
            return (Criteria) this;
        }

        public Criteria andExtendCatIdLessThanOrEqualTo(Integer value) {
            addCriterion("extend_cat_id <=", value, "extendCatId");
            return (Criteria) this;
        }

        public Criteria andExtendCatIdIn(List<Integer> values) {
            addCriterion("extend_cat_id in", values, "extendCatId");
            return (Criteria) this;
        }

        public Criteria andExtendCatIdNotIn(List<Integer> values) {
            addCriterion("extend_cat_id not in", values, "extendCatId");
            return (Criteria) this;
        }

        public Criteria andExtendCatIdBetween(Integer value1, Integer value2) {
            addCriterion("extend_cat_id between", value1, value2, "extendCatId");
            return (Criteria) this;
        }

        public Criteria andExtendCatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("extend_cat_id not between", value1, value2, "extendCatId");
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