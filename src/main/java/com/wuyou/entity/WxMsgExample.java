package com.wuyou.entity;

import java.util.ArrayList;
import java.util.List;

public class WxMsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WxMsgExample() {
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

        public Criteria andMsgidIsNull() {
            addCriterion("msgid is null");
            return (Criteria) this;
        }

        public Criteria andMsgidIsNotNull() {
            addCriterion("msgid is not null");
            return (Criteria) this;
        }

        public Criteria andMsgidEqualTo(Integer value) {
            addCriterion("msgid =", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidNotEqualTo(Integer value) {
            addCriterion("msgid <>", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidGreaterThan(Integer value) {
            addCriterion("msgid >", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("msgid >=", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidLessThan(Integer value) {
            addCriterion("msgid <", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidLessThanOrEqualTo(Integer value) {
            addCriterion("msgid <=", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidIn(List<Integer> values) {
            addCriterion("msgid in", values, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidNotIn(List<Integer> values) {
            addCriterion("msgid not in", values, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidBetween(Integer value1, Integer value2) {
            addCriterion("msgid between", value1, value2, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidNotBetween(Integer value1, Integer value2) {
            addCriterion("msgid not between", value1, value2, "msgid");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andTitileIsNull() {
            addCriterion("titile is null");
            return (Criteria) this;
        }

        public Criteria andTitileIsNotNull() {
            addCriterion("titile is not null");
            return (Criteria) this;
        }

        public Criteria andTitileEqualTo(String value) {
            addCriterion("titile =", value, "titile");
            return (Criteria) this;
        }

        public Criteria andTitileNotEqualTo(String value) {
            addCriterion("titile <>", value, "titile");
            return (Criteria) this;
        }

        public Criteria andTitileGreaterThan(String value) {
            addCriterion("titile >", value, "titile");
            return (Criteria) this;
        }

        public Criteria andTitileGreaterThanOrEqualTo(String value) {
            addCriterion("titile >=", value, "titile");
            return (Criteria) this;
        }

        public Criteria andTitileLessThan(String value) {
            addCriterion("titile <", value, "titile");
            return (Criteria) this;
        }

        public Criteria andTitileLessThanOrEqualTo(String value) {
            addCriterion("titile <=", value, "titile");
            return (Criteria) this;
        }

        public Criteria andTitileLike(String value) {
            addCriterion("titile like", value, "titile");
            return (Criteria) this;
        }

        public Criteria andTitileNotLike(String value) {
            addCriterion("titile not like", value, "titile");
            return (Criteria) this;
        }

        public Criteria andTitileIn(List<String> values) {
            addCriterion("titile in", values, "titile");
            return (Criteria) this;
        }

        public Criteria andTitileNotIn(List<String> values) {
            addCriterion("titile not in", values, "titile");
            return (Criteria) this;
        }

        public Criteria andTitileBetween(String value1, String value2) {
            addCriterion("titile between", value1, value2, "titile");
            return (Criteria) this;
        }

        public Criteria andTitileNotBetween(String value1, String value2) {
            addCriterion("titile not between", value1, value2, "titile");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Integer value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Integer value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Integer value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Integer value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Integer value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Integer> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Integer> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Integer value1, Integer value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNull() {
            addCriterion("sendtime is null");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNotNull() {
            addCriterion("sendtime is not null");
            return (Criteria) this;
        }

        public Criteria andSendtimeEqualTo(Integer value) {
            addCriterion("sendtime =", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotEqualTo(Integer value) {
            addCriterion("sendtime <>", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThan(Integer value) {
            addCriterion("sendtime >", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sendtime >=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThan(Integer value) {
            addCriterion("sendtime <", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThanOrEqualTo(Integer value) {
            addCriterion("sendtime <=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeIn(List<Integer> values) {
            addCriterion("sendtime in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotIn(List<Integer> values) {
            addCriterion("sendtime not in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeBetween(Integer value1, Integer value2) {
            addCriterion("sendtime between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("sendtime not between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andIssendIsNull() {
            addCriterion("issend is null");
            return (Criteria) this;
        }

        public Criteria andIssendIsNotNull() {
            addCriterion("issend is not null");
            return (Criteria) this;
        }

        public Criteria andIssendEqualTo(Boolean value) {
            addCriterion("issend =", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendNotEqualTo(Boolean value) {
            addCriterion("issend <>", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendGreaterThan(Boolean value) {
            addCriterion("issend >", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendGreaterThanOrEqualTo(Boolean value) {
            addCriterion("issend >=", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendLessThan(Boolean value) {
            addCriterion("issend <", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendLessThanOrEqualTo(Boolean value) {
            addCriterion("issend <=", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendIn(List<Boolean> values) {
            addCriterion("issend in", values, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendNotIn(List<Boolean> values) {
            addCriterion("issend not in", values, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendBetween(Boolean value1, Boolean value2) {
            addCriterion("issend between", value1, value2, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendNotBetween(Boolean value1, Boolean value2) {
            addCriterion("issend not between", value1, value2, "issend");
            return (Criteria) this;
        }

        public Criteria andSendtypeIsNull() {
            addCriterion("sendtype is null");
            return (Criteria) this;
        }

        public Criteria andSendtypeIsNotNull() {
            addCriterion("sendtype is not null");
            return (Criteria) this;
        }

        public Criteria andSendtypeEqualTo(Boolean value) {
            addCriterion("sendtype =", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeNotEqualTo(Boolean value) {
            addCriterion("sendtype <>", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeGreaterThan(Boolean value) {
            addCriterion("sendtype >", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sendtype >=", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeLessThan(Boolean value) {
            addCriterion("sendtype <", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeLessThanOrEqualTo(Boolean value) {
            addCriterion("sendtype <=", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeIn(List<Boolean> values) {
            addCriterion("sendtype in", values, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeNotIn(List<Boolean> values) {
            addCriterion("sendtype not in", values, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeBetween(Boolean value1, Boolean value2) {
            addCriterion("sendtype between", value1, value2, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sendtype not between", value1, value2, "sendtype");
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