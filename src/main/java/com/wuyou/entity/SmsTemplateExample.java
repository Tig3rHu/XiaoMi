package com.wuyou.entity;

import java.util.ArrayList;
import java.util.List;

public class SmsTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmsTemplateExample() {
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

        public Criteria andTplIdIsNull() {
            addCriterion("tpl_id is null");
            return (Criteria) this;
        }

        public Criteria andTplIdIsNotNull() {
            addCriterion("tpl_id is not null");
            return (Criteria) this;
        }

        public Criteria andTplIdEqualTo(Integer value) {
            addCriterion("tpl_id =", value, "tplId");
            return (Criteria) this;
        }

        public Criteria andTplIdNotEqualTo(Integer value) {
            addCriterion("tpl_id <>", value, "tplId");
            return (Criteria) this;
        }

        public Criteria andTplIdGreaterThan(Integer value) {
            addCriterion("tpl_id >", value, "tplId");
            return (Criteria) this;
        }

        public Criteria andTplIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tpl_id >=", value, "tplId");
            return (Criteria) this;
        }

        public Criteria andTplIdLessThan(Integer value) {
            addCriterion("tpl_id <", value, "tplId");
            return (Criteria) this;
        }

        public Criteria andTplIdLessThanOrEqualTo(Integer value) {
            addCriterion("tpl_id <=", value, "tplId");
            return (Criteria) this;
        }

        public Criteria andTplIdIn(List<Integer> values) {
            addCriterion("tpl_id in", values, "tplId");
            return (Criteria) this;
        }

        public Criteria andTplIdNotIn(List<Integer> values) {
            addCriterion("tpl_id not in", values, "tplId");
            return (Criteria) this;
        }

        public Criteria andTplIdBetween(Integer value1, Integer value2) {
            addCriterion("tpl_id between", value1, value2, "tplId");
            return (Criteria) this;
        }

        public Criteria andTplIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tpl_id not between", value1, value2, "tplId");
            return (Criteria) this;
        }

        public Criteria andSmsSignIsNull() {
            addCriterion("sms_sign is null");
            return (Criteria) this;
        }

        public Criteria andSmsSignIsNotNull() {
            addCriterion("sms_sign is not null");
            return (Criteria) this;
        }

        public Criteria andSmsSignEqualTo(String value) {
            addCriterion("sms_sign =", value, "smsSign");
            return (Criteria) this;
        }

        public Criteria andSmsSignNotEqualTo(String value) {
            addCriterion("sms_sign <>", value, "smsSign");
            return (Criteria) this;
        }

        public Criteria andSmsSignGreaterThan(String value) {
            addCriterion("sms_sign >", value, "smsSign");
            return (Criteria) this;
        }

        public Criteria andSmsSignGreaterThanOrEqualTo(String value) {
            addCriterion("sms_sign >=", value, "smsSign");
            return (Criteria) this;
        }

        public Criteria andSmsSignLessThan(String value) {
            addCriterion("sms_sign <", value, "smsSign");
            return (Criteria) this;
        }

        public Criteria andSmsSignLessThanOrEqualTo(String value) {
            addCriterion("sms_sign <=", value, "smsSign");
            return (Criteria) this;
        }

        public Criteria andSmsSignLike(String value) {
            addCriterion("sms_sign like", value, "smsSign");
            return (Criteria) this;
        }

        public Criteria andSmsSignNotLike(String value) {
            addCriterion("sms_sign not like", value, "smsSign");
            return (Criteria) this;
        }

        public Criteria andSmsSignIn(List<String> values) {
            addCriterion("sms_sign in", values, "smsSign");
            return (Criteria) this;
        }

        public Criteria andSmsSignNotIn(List<String> values) {
            addCriterion("sms_sign not in", values, "smsSign");
            return (Criteria) this;
        }

        public Criteria andSmsSignBetween(String value1, String value2) {
            addCriterion("sms_sign between", value1, value2, "smsSign");
            return (Criteria) this;
        }

        public Criteria andSmsSignNotBetween(String value1, String value2) {
            addCriterion("sms_sign not between", value1, value2, "smsSign");
            return (Criteria) this;
        }

        public Criteria andSmsTplCodeIsNull() {
            addCriterion("sms_tpl_code is null");
            return (Criteria) this;
        }

        public Criteria andSmsTplCodeIsNotNull() {
            addCriterion("sms_tpl_code is not null");
            return (Criteria) this;
        }

        public Criteria andSmsTplCodeEqualTo(String value) {
            addCriterion("sms_tpl_code =", value, "smsTplCode");
            return (Criteria) this;
        }

        public Criteria andSmsTplCodeNotEqualTo(String value) {
            addCriterion("sms_tpl_code <>", value, "smsTplCode");
            return (Criteria) this;
        }

        public Criteria andSmsTplCodeGreaterThan(String value) {
            addCriterion("sms_tpl_code >", value, "smsTplCode");
            return (Criteria) this;
        }

        public Criteria andSmsTplCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sms_tpl_code >=", value, "smsTplCode");
            return (Criteria) this;
        }

        public Criteria andSmsTplCodeLessThan(String value) {
            addCriterion("sms_tpl_code <", value, "smsTplCode");
            return (Criteria) this;
        }

        public Criteria andSmsTplCodeLessThanOrEqualTo(String value) {
            addCriterion("sms_tpl_code <=", value, "smsTplCode");
            return (Criteria) this;
        }

        public Criteria andSmsTplCodeLike(String value) {
            addCriterion("sms_tpl_code like", value, "smsTplCode");
            return (Criteria) this;
        }

        public Criteria andSmsTplCodeNotLike(String value) {
            addCriterion("sms_tpl_code not like", value, "smsTplCode");
            return (Criteria) this;
        }

        public Criteria andSmsTplCodeIn(List<String> values) {
            addCriterion("sms_tpl_code in", values, "smsTplCode");
            return (Criteria) this;
        }

        public Criteria andSmsTplCodeNotIn(List<String> values) {
            addCriterion("sms_tpl_code not in", values, "smsTplCode");
            return (Criteria) this;
        }

        public Criteria andSmsTplCodeBetween(String value1, String value2) {
            addCriterion("sms_tpl_code between", value1, value2, "smsTplCode");
            return (Criteria) this;
        }

        public Criteria andSmsTplCodeNotBetween(String value1, String value2) {
            addCriterion("sms_tpl_code not between", value1, value2, "smsTplCode");
            return (Criteria) this;
        }

        public Criteria andTplContentIsNull() {
            addCriterion("tpl_content is null");
            return (Criteria) this;
        }

        public Criteria andTplContentIsNotNull() {
            addCriterion("tpl_content is not null");
            return (Criteria) this;
        }

        public Criteria andTplContentEqualTo(String value) {
            addCriterion("tpl_content =", value, "tplContent");
            return (Criteria) this;
        }

        public Criteria andTplContentNotEqualTo(String value) {
            addCriterion("tpl_content <>", value, "tplContent");
            return (Criteria) this;
        }

        public Criteria andTplContentGreaterThan(String value) {
            addCriterion("tpl_content >", value, "tplContent");
            return (Criteria) this;
        }

        public Criteria andTplContentGreaterThanOrEqualTo(String value) {
            addCriterion("tpl_content >=", value, "tplContent");
            return (Criteria) this;
        }

        public Criteria andTplContentLessThan(String value) {
            addCriterion("tpl_content <", value, "tplContent");
            return (Criteria) this;
        }

        public Criteria andTplContentLessThanOrEqualTo(String value) {
            addCriterion("tpl_content <=", value, "tplContent");
            return (Criteria) this;
        }

        public Criteria andTplContentLike(String value) {
            addCriterion("tpl_content like", value, "tplContent");
            return (Criteria) this;
        }

        public Criteria andTplContentNotLike(String value) {
            addCriterion("tpl_content not like", value, "tplContent");
            return (Criteria) this;
        }

        public Criteria andTplContentIn(List<String> values) {
            addCriterion("tpl_content in", values, "tplContent");
            return (Criteria) this;
        }

        public Criteria andTplContentNotIn(List<String> values) {
            addCriterion("tpl_content not in", values, "tplContent");
            return (Criteria) this;
        }

        public Criteria andTplContentBetween(String value1, String value2) {
            addCriterion("tpl_content between", value1, value2, "tplContent");
            return (Criteria) this;
        }

        public Criteria andTplContentNotBetween(String value1, String value2) {
            addCriterion("tpl_content not between", value1, value2, "tplContent");
            return (Criteria) this;
        }

        public Criteria andSendSceneIsNull() {
            addCriterion("send_scene is null");
            return (Criteria) this;
        }

        public Criteria andSendSceneIsNotNull() {
            addCriterion("send_scene is not null");
            return (Criteria) this;
        }

        public Criteria andSendSceneEqualTo(String value) {
            addCriterion("send_scene =", value, "sendScene");
            return (Criteria) this;
        }

        public Criteria andSendSceneNotEqualTo(String value) {
            addCriterion("send_scene <>", value, "sendScene");
            return (Criteria) this;
        }

        public Criteria andSendSceneGreaterThan(String value) {
            addCriterion("send_scene >", value, "sendScene");
            return (Criteria) this;
        }

        public Criteria andSendSceneGreaterThanOrEqualTo(String value) {
            addCriterion("send_scene >=", value, "sendScene");
            return (Criteria) this;
        }

        public Criteria andSendSceneLessThan(String value) {
            addCriterion("send_scene <", value, "sendScene");
            return (Criteria) this;
        }

        public Criteria andSendSceneLessThanOrEqualTo(String value) {
            addCriterion("send_scene <=", value, "sendScene");
            return (Criteria) this;
        }

        public Criteria andSendSceneLike(String value) {
            addCriterion("send_scene like", value, "sendScene");
            return (Criteria) this;
        }

        public Criteria andSendSceneNotLike(String value) {
            addCriterion("send_scene not like", value, "sendScene");
            return (Criteria) this;
        }

        public Criteria andSendSceneIn(List<String> values) {
            addCriterion("send_scene in", values, "sendScene");
            return (Criteria) this;
        }

        public Criteria andSendSceneNotIn(List<String> values) {
            addCriterion("send_scene not in", values, "sendScene");
            return (Criteria) this;
        }

        public Criteria andSendSceneBetween(String value1, String value2) {
            addCriterion("send_scene between", value1, value2, "sendScene");
            return (Criteria) this;
        }

        public Criteria andSendSceneNotBetween(String value1, String value2) {
            addCriterion("send_scene not between", value1, value2, "sendScene");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Integer value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Integer value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Integer value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Integer value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Integer value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Integer> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Integer> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Integer value1, Integer value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
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