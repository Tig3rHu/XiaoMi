package com.wuyou.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VrOrderCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VrOrderCodeExample() {
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

        public Criteria andRecIdIsNull() {
            addCriterion("rec_id is null");
            return (Criteria) this;
        }

        public Criteria andRecIdIsNotNull() {
            addCriterion("rec_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecIdEqualTo(Integer value) {
            addCriterion("rec_id =", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotEqualTo(Integer value) {
            addCriterion("rec_id <>", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThan(Integer value) {
            addCriterion("rec_id >", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rec_id >=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThan(Integer value) {
            addCriterion("rec_id <", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThanOrEqualTo(Integer value) {
            addCriterion("rec_id <=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdIn(List<Integer> values) {
            addCriterion("rec_id in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotIn(List<Integer> values) {
            addCriterion("rec_id not in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdBetween(Integer value1, Integer value2) {
            addCriterion("rec_id between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rec_id not between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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

        public Criteria andVrCodeIsNull() {
            addCriterion("vr_code is null");
            return (Criteria) this;
        }

        public Criteria andVrCodeIsNotNull() {
            addCriterion("vr_code is not null");
            return (Criteria) this;
        }

        public Criteria andVrCodeEqualTo(String value) {
            addCriterion("vr_code =", value, "vrCode");
            return (Criteria) this;
        }

        public Criteria andVrCodeNotEqualTo(String value) {
            addCriterion("vr_code <>", value, "vrCode");
            return (Criteria) this;
        }

        public Criteria andVrCodeGreaterThan(String value) {
            addCriterion("vr_code >", value, "vrCode");
            return (Criteria) this;
        }

        public Criteria andVrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("vr_code >=", value, "vrCode");
            return (Criteria) this;
        }

        public Criteria andVrCodeLessThan(String value) {
            addCriterion("vr_code <", value, "vrCode");
            return (Criteria) this;
        }

        public Criteria andVrCodeLessThanOrEqualTo(String value) {
            addCriterion("vr_code <=", value, "vrCode");
            return (Criteria) this;
        }

        public Criteria andVrCodeLike(String value) {
            addCriterion("vr_code like", value, "vrCode");
            return (Criteria) this;
        }

        public Criteria andVrCodeNotLike(String value) {
            addCriterion("vr_code not like", value, "vrCode");
            return (Criteria) this;
        }

        public Criteria andVrCodeIn(List<String> values) {
            addCriterion("vr_code in", values, "vrCode");
            return (Criteria) this;
        }

        public Criteria andVrCodeNotIn(List<String> values) {
            addCriterion("vr_code not in", values, "vrCode");
            return (Criteria) this;
        }

        public Criteria andVrCodeBetween(String value1, String value2) {
            addCriterion("vr_code between", value1, value2, "vrCode");
            return (Criteria) this;
        }

        public Criteria andVrCodeNotBetween(String value1, String value2) {
            addCriterion("vr_code not between", value1, value2, "vrCode");
            return (Criteria) this;
        }

        public Criteria andVrStateIsNull() {
            addCriterion("vr_state is null");
            return (Criteria) this;
        }

        public Criteria andVrStateIsNotNull() {
            addCriterion("vr_state is not null");
            return (Criteria) this;
        }

        public Criteria andVrStateEqualTo(Byte value) {
            addCriterion("vr_state =", value, "vrState");
            return (Criteria) this;
        }

        public Criteria andVrStateNotEqualTo(Byte value) {
            addCriterion("vr_state <>", value, "vrState");
            return (Criteria) this;
        }

        public Criteria andVrStateGreaterThan(Byte value) {
            addCriterion("vr_state >", value, "vrState");
            return (Criteria) this;
        }

        public Criteria andVrStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("vr_state >=", value, "vrState");
            return (Criteria) this;
        }

        public Criteria andVrStateLessThan(Byte value) {
            addCriterion("vr_state <", value, "vrState");
            return (Criteria) this;
        }

        public Criteria andVrStateLessThanOrEqualTo(Byte value) {
            addCriterion("vr_state <=", value, "vrState");
            return (Criteria) this;
        }

        public Criteria andVrStateIn(List<Byte> values) {
            addCriterion("vr_state in", values, "vrState");
            return (Criteria) this;
        }

        public Criteria andVrStateNotIn(List<Byte> values) {
            addCriterion("vr_state not in", values, "vrState");
            return (Criteria) this;
        }

        public Criteria andVrStateBetween(Byte value1, Byte value2) {
            addCriterion("vr_state between", value1, value2, "vrState");
            return (Criteria) this;
        }

        public Criteria andVrStateNotBetween(Byte value1, Byte value2) {
            addCriterion("vr_state not between", value1, value2, "vrState");
            return (Criteria) this;
        }

        public Criteria andVrUsetimeIsNull() {
            addCriterion("vr_usetime is null");
            return (Criteria) this;
        }

        public Criteria andVrUsetimeIsNotNull() {
            addCriterion("vr_usetime is not null");
            return (Criteria) this;
        }

        public Criteria andVrUsetimeEqualTo(Integer value) {
            addCriterion("vr_usetime =", value, "vrUsetime");
            return (Criteria) this;
        }

        public Criteria andVrUsetimeNotEqualTo(Integer value) {
            addCriterion("vr_usetime <>", value, "vrUsetime");
            return (Criteria) this;
        }

        public Criteria andVrUsetimeGreaterThan(Integer value) {
            addCriterion("vr_usetime >", value, "vrUsetime");
            return (Criteria) this;
        }

        public Criteria andVrUsetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("vr_usetime >=", value, "vrUsetime");
            return (Criteria) this;
        }

        public Criteria andVrUsetimeLessThan(Integer value) {
            addCriterion("vr_usetime <", value, "vrUsetime");
            return (Criteria) this;
        }

        public Criteria andVrUsetimeLessThanOrEqualTo(Integer value) {
            addCriterion("vr_usetime <=", value, "vrUsetime");
            return (Criteria) this;
        }

        public Criteria andVrUsetimeIn(List<Integer> values) {
            addCriterion("vr_usetime in", values, "vrUsetime");
            return (Criteria) this;
        }

        public Criteria andVrUsetimeNotIn(List<Integer> values) {
            addCriterion("vr_usetime not in", values, "vrUsetime");
            return (Criteria) this;
        }

        public Criteria andVrUsetimeBetween(Integer value1, Integer value2) {
            addCriterion("vr_usetime between", value1, value2, "vrUsetime");
            return (Criteria) this;
        }

        public Criteria andVrUsetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("vr_usetime not between", value1, value2, "vrUsetime");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNull() {
            addCriterion("pay_price is null");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNotNull() {
            addCriterion("pay_price is not null");
            return (Criteria) this;
        }

        public Criteria andPayPriceEqualTo(BigDecimal value) {
            addCriterion("pay_price =", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotEqualTo(BigDecimal value) {
            addCriterion("pay_price <>", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThan(BigDecimal value) {
            addCriterion("pay_price >", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_price >=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThan(BigDecimal value) {
            addCriterion("pay_price <", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_price <=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceIn(List<BigDecimal> values) {
            addCriterion("pay_price in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotIn(List<BigDecimal> values) {
            addCriterion("pay_price not in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_price between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_price not between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andVrIndateIsNull() {
            addCriterion("vr_indate is null");
            return (Criteria) this;
        }

        public Criteria andVrIndateIsNotNull() {
            addCriterion("vr_indate is not null");
            return (Criteria) this;
        }

        public Criteria andVrIndateEqualTo(Integer value) {
            addCriterion("vr_indate =", value, "vrIndate");
            return (Criteria) this;
        }

        public Criteria andVrIndateNotEqualTo(Integer value) {
            addCriterion("vr_indate <>", value, "vrIndate");
            return (Criteria) this;
        }

        public Criteria andVrIndateGreaterThan(Integer value) {
            addCriterion("vr_indate >", value, "vrIndate");
            return (Criteria) this;
        }

        public Criteria andVrIndateGreaterThanOrEqualTo(Integer value) {
            addCriterion("vr_indate >=", value, "vrIndate");
            return (Criteria) this;
        }

        public Criteria andVrIndateLessThan(Integer value) {
            addCriterion("vr_indate <", value, "vrIndate");
            return (Criteria) this;
        }

        public Criteria andVrIndateLessThanOrEqualTo(Integer value) {
            addCriterion("vr_indate <=", value, "vrIndate");
            return (Criteria) this;
        }

        public Criteria andVrIndateIn(List<Integer> values) {
            addCriterion("vr_indate in", values, "vrIndate");
            return (Criteria) this;
        }

        public Criteria andVrIndateNotIn(List<Integer> values) {
            addCriterion("vr_indate not in", values, "vrIndate");
            return (Criteria) this;
        }

        public Criteria andVrIndateBetween(Integer value1, Integer value2) {
            addCriterion("vr_indate between", value1, value2, "vrIndate");
            return (Criteria) this;
        }

        public Criteria andVrIndateNotBetween(Integer value1, Integer value2) {
            addCriterion("vr_indate not between", value1, value2, "vrIndate");
            return (Criteria) this;
        }

        public Criteria andRefundLockIsNull() {
            addCriterion("refund_lock is null");
            return (Criteria) this;
        }

        public Criteria andRefundLockIsNotNull() {
            addCriterion("refund_lock is not null");
            return (Criteria) this;
        }

        public Criteria andRefundLockEqualTo(Boolean value) {
            addCriterion("refund_lock =", value, "refundLock");
            return (Criteria) this;
        }

        public Criteria andRefundLockNotEqualTo(Boolean value) {
            addCriterion("refund_lock <>", value, "refundLock");
            return (Criteria) this;
        }

        public Criteria andRefundLockGreaterThan(Boolean value) {
            addCriterion("refund_lock >", value, "refundLock");
            return (Criteria) this;
        }

        public Criteria andRefundLockGreaterThanOrEqualTo(Boolean value) {
            addCriterion("refund_lock >=", value, "refundLock");
            return (Criteria) this;
        }

        public Criteria andRefundLockLessThan(Boolean value) {
            addCriterion("refund_lock <", value, "refundLock");
            return (Criteria) this;
        }

        public Criteria andRefundLockLessThanOrEqualTo(Boolean value) {
            addCriterion("refund_lock <=", value, "refundLock");
            return (Criteria) this;
        }

        public Criteria andRefundLockIn(List<Boolean> values) {
            addCriterion("refund_lock in", values, "refundLock");
            return (Criteria) this;
        }

        public Criteria andRefundLockNotIn(List<Boolean> values) {
            addCriterion("refund_lock not in", values, "refundLock");
            return (Criteria) this;
        }

        public Criteria andRefundLockBetween(Boolean value1, Boolean value2) {
            addCriterion("refund_lock between", value1, value2, "refundLock");
            return (Criteria) this;
        }

        public Criteria andRefundLockNotBetween(Boolean value1, Boolean value2) {
            addCriterion("refund_lock not between", value1, value2, "refundLock");
            return (Criteria) this;
        }

        public Criteria andVrInvalidRefundIsNull() {
            addCriterion("vr_invalid_refund is null");
            return (Criteria) this;
        }

        public Criteria andVrInvalidRefundIsNotNull() {
            addCriterion("vr_invalid_refund is not null");
            return (Criteria) this;
        }

        public Criteria andVrInvalidRefundEqualTo(Byte value) {
            addCriterion("vr_invalid_refund =", value, "vrInvalidRefund");
            return (Criteria) this;
        }

        public Criteria andVrInvalidRefundNotEqualTo(Byte value) {
            addCriterion("vr_invalid_refund <>", value, "vrInvalidRefund");
            return (Criteria) this;
        }

        public Criteria andVrInvalidRefundGreaterThan(Byte value) {
            addCriterion("vr_invalid_refund >", value, "vrInvalidRefund");
            return (Criteria) this;
        }

        public Criteria andVrInvalidRefundGreaterThanOrEqualTo(Byte value) {
            addCriterion("vr_invalid_refund >=", value, "vrInvalidRefund");
            return (Criteria) this;
        }

        public Criteria andVrInvalidRefundLessThan(Byte value) {
            addCriterion("vr_invalid_refund <", value, "vrInvalidRefund");
            return (Criteria) this;
        }

        public Criteria andVrInvalidRefundLessThanOrEqualTo(Byte value) {
            addCriterion("vr_invalid_refund <=", value, "vrInvalidRefund");
            return (Criteria) this;
        }

        public Criteria andVrInvalidRefundIn(List<Byte> values) {
            addCriterion("vr_invalid_refund in", values, "vrInvalidRefund");
            return (Criteria) this;
        }

        public Criteria andVrInvalidRefundNotIn(List<Byte> values) {
            addCriterion("vr_invalid_refund not in", values, "vrInvalidRefund");
            return (Criteria) this;
        }

        public Criteria andVrInvalidRefundBetween(Byte value1, Byte value2) {
            addCriterion("vr_invalid_refund between", value1, value2, "vrInvalidRefund");
            return (Criteria) this;
        }

        public Criteria andVrInvalidRefundNotBetween(Byte value1, Byte value2) {
            addCriterion("vr_invalid_refund not between", value1, value2, "vrInvalidRefund");
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