package com.wuyou.entity;

import java.util.ArrayList;
import java.util.List;

public class TopicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TopicExample() {
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

        public Criteria andTopicIdIsNull() {
            addCriterion("topic_id is null");
            return (Criteria) this;
        }

        public Criteria andTopicIdIsNotNull() {
            addCriterion("topic_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopicIdEqualTo(Integer value) {
            addCriterion("topic_id =", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotEqualTo(Integer value) {
            addCriterion("topic_id <>", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThan(Integer value) {
            addCriterion("topic_id >", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("topic_id >=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThan(Integer value) {
            addCriterion("topic_id <", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThanOrEqualTo(Integer value) {
            addCriterion("topic_id <=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdIn(List<Integer> values) {
            addCriterion("topic_id in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotIn(List<Integer> values) {
            addCriterion("topic_id not in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdBetween(Integer value1, Integer value2) {
            addCriterion("topic_id between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("topic_id not between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicTitleIsNull() {
            addCriterion("topic_title is null");
            return (Criteria) this;
        }

        public Criteria andTopicTitleIsNotNull() {
            addCriterion("topic_title is not null");
            return (Criteria) this;
        }

        public Criteria andTopicTitleEqualTo(String value) {
            addCriterion("topic_title =", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleNotEqualTo(String value) {
            addCriterion("topic_title <>", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleGreaterThan(String value) {
            addCriterion("topic_title >", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleGreaterThanOrEqualTo(String value) {
            addCriterion("topic_title >=", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleLessThan(String value) {
            addCriterion("topic_title <", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleLessThanOrEqualTo(String value) {
            addCriterion("topic_title <=", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleLike(String value) {
            addCriterion("topic_title like", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleNotLike(String value) {
            addCriterion("topic_title not like", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleIn(List<String> values) {
            addCriterion("topic_title in", values, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleNotIn(List<String> values) {
            addCriterion("topic_title not in", values, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleBetween(String value1, String value2) {
            addCriterion("topic_title between", value1, value2, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleNotBetween(String value1, String value2) {
            addCriterion("topic_title not between", value1, value2, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicImageIsNull() {
            addCriterion("topic_image is null");
            return (Criteria) this;
        }

        public Criteria andTopicImageIsNotNull() {
            addCriterion("topic_image is not null");
            return (Criteria) this;
        }

        public Criteria andTopicImageEqualTo(String value) {
            addCriterion("topic_image =", value, "topicImage");
            return (Criteria) this;
        }

        public Criteria andTopicImageNotEqualTo(String value) {
            addCriterion("topic_image <>", value, "topicImage");
            return (Criteria) this;
        }

        public Criteria andTopicImageGreaterThan(String value) {
            addCriterion("topic_image >", value, "topicImage");
            return (Criteria) this;
        }

        public Criteria andTopicImageGreaterThanOrEqualTo(String value) {
            addCriterion("topic_image >=", value, "topicImage");
            return (Criteria) this;
        }

        public Criteria andTopicImageLessThan(String value) {
            addCriterion("topic_image <", value, "topicImage");
            return (Criteria) this;
        }

        public Criteria andTopicImageLessThanOrEqualTo(String value) {
            addCriterion("topic_image <=", value, "topicImage");
            return (Criteria) this;
        }

        public Criteria andTopicImageLike(String value) {
            addCriterion("topic_image like", value, "topicImage");
            return (Criteria) this;
        }

        public Criteria andTopicImageNotLike(String value) {
            addCriterion("topic_image not like", value, "topicImage");
            return (Criteria) this;
        }

        public Criteria andTopicImageIn(List<String> values) {
            addCriterion("topic_image in", values, "topicImage");
            return (Criteria) this;
        }

        public Criteria andTopicImageNotIn(List<String> values) {
            addCriterion("topic_image not in", values, "topicImage");
            return (Criteria) this;
        }

        public Criteria andTopicImageBetween(String value1, String value2) {
            addCriterion("topic_image between", value1, value2, "topicImage");
            return (Criteria) this;
        }

        public Criteria andTopicImageNotBetween(String value1, String value2) {
            addCriterion("topic_image not between", value1, value2, "topicImage");
            return (Criteria) this;
        }

        public Criteria andTopicBackgroundColorIsNull() {
            addCriterion("topic_background_color is null");
            return (Criteria) this;
        }

        public Criteria andTopicBackgroundColorIsNotNull() {
            addCriterion("topic_background_color is not null");
            return (Criteria) this;
        }

        public Criteria andTopicBackgroundColorEqualTo(String value) {
            addCriterion("topic_background_color =", value, "topicBackgroundColor");
            return (Criteria) this;
        }

        public Criteria andTopicBackgroundColorNotEqualTo(String value) {
            addCriterion("topic_background_color <>", value, "topicBackgroundColor");
            return (Criteria) this;
        }

        public Criteria andTopicBackgroundColorGreaterThan(String value) {
            addCriterion("topic_background_color >", value, "topicBackgroundColor");
            return (Criteria) this;
        }

        public Criteria andTopicBackgroundColorGreaterThanOrEqualTo(String value) {
            addCriterion("topic_background_color >=", value, "topicBackgroundColor");
            return (Criteria) this;
        }

        public Criteria andTopicBackgroundColorLessThan(String value) {
            addCriterion("topic_background_color <", value, "topicBackgroundColor");
            return (Criteria) this;
        }

        public Criteria andTopicBackgroundColorLessThanOrEqualTo(String value) {
            addCriterion("topic_background_color <=", value, "topicBackgroundColor");
            return (Criteria) this;
        }

        public Criteria andTopicBackgroundColorLike(String value) {
            addCriterion("topic_background_color like", value, "topicBackgroundColor");
            return (Criteria) this;
        }

        public Criteria andTopicBackgroundColorNotLike(String value) {
            addCriterion("topic_background_color not like", value, "topicBackgroundColor");
            return (Criteria) this;
        }

        public Criteria andTopicBackgroundColorIn(List<String> values) {
            addCriterion("topic_background_color in", values, "topicBackgroundColor");
            return (Criteria) this;
        }

        public Criteria andTopicBackgroundColorNotIn(List<String> values) {
            addCriterion("topic_background_color not in", values, "topicBackgroundColor");
            return (Criteria) this;
        }

        public Criteria andTopicBackgroundColorBetween(String value1, String value2) {
            addCriterion("topic_background_color between", value1, value2, "topicBackgroundColor");
            return (Criteria) this;
        }

        public Criteria andTopicBackgroundColorNotBetween(String value1, String value2) {
            addCriterion("topic_background_color not between", value1, value2, "topicBackgroundColor");
            return (Criteria) this;
        }

        public Criteria andTopicBackgroundIsNull() {
            addCriterion("topic_background is null");
            return (Criteria) this;
        }

        public Criteria andTopicBackgroundIsNotNull() {
            addCriterion("topic_background is not null");
            return (Criteria) this;
        }

        public Criteria andTopicBackgroundEqualTo(String value) {
            addCriterion("topic_background =", value, "topicBackground");
            return (Criteria) this;
        }

        public Criteria andTopicBackgroundNotEqualTo(String value) {
            addCriterion("topic_background <>", value, "topicBackground");
            return (Criteria) this;
        }

        public Criteria andTopicBackgroundGreaterThan(String value) {
            addCriterion("topic_background >", value, "topicBackground");
            return (Criteria) this;
        }

        public Criteria andTopicBackgroundGreaterThanOrEqualTo(String value) {
            addCriterion("topic_background >=", value, "topicBackground");
            return (Criteria) this;
        }

        public Criteria andTopicBackgroundLessThan(String value) {
            addCriterion("topic_background <", value, "topicBackground");
            return (Criteria) this;
        }

        public Criteria andTopicBackgroundLessThanOrEqualTo(String value) {
            addCriterion("topic_background <=", value, "topicBackground");
            return (Criteria) this;
        }

        public Criteria andTopicBackgroundLike(String value) {
            addCriterion("topic_background like", value, "topicBackground");
            return (Criteria) this;
        }

        public Criteria andTopicBackgroundNotLike(String value) {
            addCriterion("topic_background not like", value, "topicBackground");
            return (Criteria) this;
        }

        public Criteria andTopicBackgroundIn(List<String> values) {
            addCriterion("topic_background in", values, "topicBackground");
            return (Criteria) this;
        }

        public Criteria andTopicBackgroundNotIn(List<String> values) {
            addCriterion("topic_background not in", values, "topicBackground");
            return (Criteria) this;
        }

        public Criteria andTopicBackgroundBetween(String value1, String value2) {
            addCriterion("topic_background between", value1, value2, "topicBackground");
            return (Criteria) this;
        }

        public Criteria andTopicBackgroundNotBetween(String value1, String value2) {
            addCriterion("topic_background not between", value1, value2, "topicBackground");
            return (Criteria) this;
        }

        public Criteria andTopicRepeatIsNull() {
            addCriterion("topic_repeat is null");
            return (Criteria) this;
        }

        public Criteria andTopicRepeatIsNotNull() {
            addCriterion("topic_repeat is not null");
            return (Criteria) this;
        }

        public Criteria andTopicRepeatEqualTo(String value) {
            addCriterion("topic_repeat =", value, "topicRepeat");
            return (Criteria) this;
        }

        public Criteria andTopicRepeatNotEqualTo(String value) {
            addCriterion("topic_repeat <>", value, "topicRepeat");
            return (Criteria) this;
        }

        public Criteria andTopicRepeatGreaterThan(String value) {
            addCriterion("topic_repeat >", value, "topicRepeat");
            return (Criteria) this;
        }

        public Criteria andTopicRepeatGreaterThanOrEqualTo(String value) {
            addCriterion("topic_repeat >=", value, "topicRepeat");
            return (Criteria) this;
        }

        public Criteria andTopicRepeatLessThan(String value) {
            addCriterion("topic_repeat <", value, "topicRepeat");
            return (Criteria) this;
        }

        public Criteria andTopicRepeatLessThanOrEqualTo(String value) {
            addCriterion("topic_repeat <=", value, "topicRepeat");
            return (Criteria) this;
        }

        public Criteria andTopicRepeatLike(String value) {
            addCriterion("topic_repeat like", value, "topicRepeat");
            return (Criteria) this;
        }

        public Criteria andTopicRepeatNotLike(String value) {
            addCriterion("topic_repeat not like", value, "topicRepeat");
            return (Criteria) this;
        }

        public Criteria andTopicRepeatIn(List<String> values) {
            addCriterion("topic_repeat in", values, "topicRepeat");
            return (Criteria) this;
        }

        public Criteria andTopicRepeatNotIn(List<String> values) {
            addCriterion("topic_repeat not in", values, "topicRepeat");
            return (Criteria) this;
        }

        public Criteria andTopicRepeatBetween(String value1, String value2) {
            addCriterion("topic_repeat between", value1, value2, "topicRepeat");
            return (Criteria) this;
        }

        public Criteria andTopicRepeatNotBetween(String value1, String value2) {
            addCriterion("topic_repeat not between", value1, value2, "topicRepeat");
            return (Criteria) this;
        }

        public Criteria andTopicStateIsNull() {
            addCriterion("topic_state is null");
            return (Criteria) this;
        }

        public Criteria andTopicStateIsNotNull() {
            addCriterion("topic_state is not null");
            return (Criteria) this;
        }

        public Criteria andTopicStateEqualTo(Boolean value) {
            addCriterion("topic_state =", value, "topicState");
            return (Criteria) this;
        }

        public Criteria andTopicStateNotEqualTo(Boolean value) {
            addCriterion("topic_state <>", value, "topicState");
            return (Criteria) this;
        }

        public Criteria andTopicStateGreaterThan(Boolean value) {
            addCriterion("topic_state >", value, "topicState");
            return (Criteria) this;
        }

        public Criteria andTopicStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("topic_state >=", value, "topicState");
            return (Criteria) this;
        }

        public Criteria andTopicStateLessThan(Boolean value) {
            addCriterion("topic_state <", value, "topicState");
            return (Criteria) this;
        }

        public Criteria andTopicStateLessThanOrEqualTo(Boolean value) {
            addCriterion("topic_state <=", value, "topicState");
            return (Criteria) this;
        }

        public Criteria andTopicStateIn(List<Boolean> values) {
            addCriterion("topic_state in", values, "topicState");
            return (Criteria) this;
        }

        public Criteria andTopicStateNotIn(List<Boolean> values) {
            addCriterion("topic_state not in", values, "topicState");
            return (Criteria) this;
        }

        public Criteria andTopicStateBetween(Boolean value1, Boolean value2) {
            addCriterion("topic_state between", value1, value2, "topicState");
            return (Criteria) this;
        }

        public Criteria andTopicStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("topic_state not between", value1, value2, "topicState");
            return (Criteria) this;
        }

        public Criteria andTopicMarginTopIsNull() {
            addCriterion("topic_margin_top is null");
            return (Criteria) this;
        }

        public Criteria andTopicMarginTopIsNotNull() {
            addCriterion("topic_margin_top is not null");
            return (Criteria) this;
        }

        public Criteria andTopicMarginTopEqualTo(Byte value) {
            addCriterion("topic_margin_top =", value, "topicMarginTop");
            return (Criteria) this;
        }

        public Criteria andTopicMarginTopNotEqualTo(Byte value) {
            addCriterion("topic_margin_top <>", value, "topicMarginTop");
            return (Criteria) this;
        }

        public Criteria andTopicMarginTopGreaterThan(Byte value) {
            addCriterion("topic_margin_top >", value, "topicMarginTop");
            return (Criteria) this;
        }

        public Criteria andTopicMarginTopGreaterThanOrEqualTo(Byte value) {
            addCriterion("topic_margin_top >=", value, "topicMarginTop");
            return (Criteria) this;
        }

        public Criteria andTopicMarginTopLessThan(Byte value) {
            addCriterion("topic_margin_top <", value, "topicMarginTop");
            return (Criteria) this;
        }

        public Criteria andTopicMarginTopLessThanOrEqualTo(Byte value) {
            addCriterion("topic_margin_top <=", value, "topicMarginTop");
            return (Criteria) this;
        }

        public Criteria andTopicMarginTopIn(List<Byte> values) {
            addCriterion("topic_margin_top in", values, "topicMarginTop");
            return (Criteria) this;
        }

        public Criteria andTopicMarginTopNotIn(List<Byte> values) {
            addCriterion("topic_margin_top not in", values, "topicMarginTop");
            return (Criteria) this;
        }

        public Criteria andTopicMarginTopBetween(Byte value1, Byte value2) {
            addCriterion("topic_margin_top between", value1, value2, "topicMarginTop");
            return (Criteria) this;
        }

        public Criteria andTopicMarginTopNotBetween(Byte value1, Byte value2) {
            addCriterion("topic_margin_top not between", value1, value2, "topicMarginTop");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Integer value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Integer value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Integer value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Integer value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Integer value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Integer> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Integer> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Integer value1, Integer value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
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