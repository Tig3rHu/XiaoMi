package com.wuyou.entity;

import java.util.ArrayList;
import java.util.List;

public class TeamFollowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamFollowExample() {
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

        public Criteria andFollowIdIsNull() {
            addCriterion("follow_id is null");
            return (Criteria) this;
        }

        public Criteria andFollowIdIsNotNull() {
            addCriterion("follow_id is not null");
            return (Criteria) this;
        }

        public Criteria andFollowIdEqualTo(Integer value) {
            addCriterion("follow_id =", value, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdNotEqualTo(Integer value) {
            addCriterion("follow_id <>", value, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdGreaterThan(Integer value) {
            addCriterion("follow_id >", value, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_id >=", value, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdLessThan(Integer value) {
            addCriterion("follow_id <", value, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdLessThanOrEqualTo(Integer value) {
            addCriterion("follow_id <=", value, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdIn(List<Integer> values) {
            addCriterion("follow_id in", values, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdNotIn(List<Integer> values) {
            addCriterion("follow_id not in", values, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdBetween(Integer value1, Integer value2) {
            addCriterion("follow_id between", value1, value2, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_id not between", value1, value2, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdIsNull() {
            addCriterion("follow_user_id is null");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdIsNotNull() {
            addCriterion("follow_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdEqualTo(Integer value) {
            addCriterion("follow_user_id =", value, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdNotEqualTo(Integer value) {
            addCriterion("follow_user_id <>", value, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdGreaterThan(Integer value) {
            addCriterion("follow_user_id >", value, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_user_id >=", value, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdLessThan(Integer value) {
            addCriterion("follow_user_id <", value, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("follow_user_id <=", value, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdIn(List<Integer> values) {
            addCriterion("follow_user_id in", values, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdNotIn(List<Integer> values) {
            addCriterion("follow_user_id not in", values, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdBetween(Integer value1, Integer value2) {
            addCriterion("follow_user_id between", value1, value2, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_user_id not between", value1, value2, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserNicknameIsNull() {
            addCriterion("follow_user_nickname is null");
            return (Criteria) this;
        }

        public Criteria andFollowUserNicknameIsNotNull() {
            addCriterion("follow_user_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUserNicknameEqualTo(String value) {
            addCriterion("follow_user_nickname =", value, "followUserNickname");
            return (Criteria) this;
        }

        public Criteria andFollowUserNicknameNotEqualTo(String value) {
            addCriterion("follow_user_nickname <>", value, "followUserNickname");
            return (Criteria) this;
        }

        public Criteria andFollowUserNicknameGreaterThan(String value) {
            addCriterion("follow_user_nickname >", value, "followUserNickname");
            return (Criteria) this;
        }

        public Criteria andFollowUserNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("follow_user_nickname >=", value, "followUserNickname");
            return (Criteria) this;
        }

        public Criteria andFollowUserNicknameLessThan(String value) {
            addCriterion("follow_user_nickname <", value, "followUserNickname");
            return (Criteria) this;
        }

        public Criteria andFollowUserNicknameLessThanOrEqualTo(String value) {
            addCriterion("follow_user_nickname <=", value, "followUserNickname");
            return (Criteria) this;
        }

        public Criteria andFollowUserNicknameLike(String value) {
            addCriterion("follow_user_nickname like", value, "followUserNickname");
            return (Criteria) this;
        }

        public Criteria andFollowUserNicknameNotLike(String value) {
            addCriterion("follow_user_nickname not like", value, "followUserNickname");
            return (Criteria) this;
        }

        public Criteria andFollowUserNicknameIn(List<String> values) {
            addCriterion("follow_user_nickname in", values, "followUserNickname");
            return (Criteria) this;
        }

        public Criteria andFollowUserNicknameNotIn(List<String> values) {
            addCriterion("follow_user_nickname not in", values, "followUserNickname");
            return (Criteria) this;
        }

        public Criteria andFollowUserNicknameBetween(String value1, String value2) {
            addCriterion("follow_user_nickname between", value1, value2, "followUserNickname");
            return (Criteria) this;
        }

        public Criteria andFollowUserNicknameNotBetween(String value1, String value2) {
            addCriterion("follow_user_nickname not between", value1, value2, "followUserNickname");
            return (Criteria) this;
        }

        public Criteria andFollowUserHeadPicIsNull() {
            addCriterion("follow_user_head_pic is null");
            return (Criteria) this;
        }

        public Criteria andFollowUserHeadPicIsNotNull() {
            addCriterion("follow_user_head_pic is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUserHeadPicEqualTo(String value) {
            addCriterion("follow_user_head_pic =", value, "followUserHeadPic");
            return (Criteria) this;
        }

        public Criteria andFollowUserHeadPicNotEqualTo(String value) {
            addCriterion("follow_user_head_pic <>", value, "followUserHeadPic");
            return (Criteria) this;
        }

        public Criteria andFollowUserHeadPicGreaterThan(String value) {
            addCriterion("follow_user_head_pic >", value, "followUserHeadPic");
            return (Criteria) this;
        }

        public Criteria andFollowUserHeadPicGreaterThanOrEqualTo(String value) {
            addCriterion("follow_user_head_pic >=", value, "followUserHeadPic");
            return (Criteria) this;
        }

        public Criteria andFollowUserHeadPicLessThan(String value) {
            addCriterion("follow_user_head_pic <", value, "followUserHeadPic");
            return (Criteria) this;
        }

        public Criteria andFollowUserHeadPicLessThanOrEqualTo(String value) {
            addCriterion("follow_user_head_pic <=", value, "followUserHeadPic");
            return (Criteria) this;
        }

        public Criteria andFollowUserHeadPicLike(String value) {
            addCriterion("follow_user_head_pic like", value, "followUserHeadPic");
            return (Criteria) this;
        }

        public Criteria andFollowUserHeadPicNotLike(String value) {
            addCriterion("follow_user_head_pic not like", value, "followUserHeadPic");
            return (Criteria) this;
        }

        public Criteria andFollowUserHeadPicIn(List<String> values) {
            addCriterion("follow_user_head_pic in", values, "followUserHeadPic");
            return (Criteria) this;
        }

        public Criteria andFollowUserHeadPicNotIn(List<String> values) {
            addCriterion("follow_user_head_pic not in", values, "followUserHeadPic");
            return (Criteria) this;
        }

        public Criteria andFollowUserHeadPicBetween(String value1, String value2) {
            addCriterion("follow_user_head_pic between", value1, value2, "followUserHeadPic");
            return (Criteria) this;
        }

        public Criteria andFollowUserHeadPicNotBetween(String value1, String value2) {
            addCriterion("follow_user_head_pic not between", value1, value2, "followUserHeadPic");
            return (Criteria) this;
        }

        public Criteria andFollowTimeIsNull() {
            addCriterion("follow_time is null");
            return (Criteria) this;
        }

        public Criteria andFollowTimeIsNotNull() {
            addCriterion("follow_time is not null");
            return (Criteria) this;
        }

        public Criteria andFollowTimeEqualTo(Integer value) {
            addCriterion("follow_time =", value, "followTime");
            return (Criteria) this;
        }

        public Criteria andFollowTimeNotEqualTo(Integer value) {
            addCriterion("follow_time <>", value, "followTime");
            return (Criteria) this;
        }

        public Criteria andFollowTimeGreaterThan(Integer value) {
            addCriterion("follow_time >", value, "followTime");
            return (Criteria) this;
        }

        public Criteria andFollowTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_time >=", value, "followTime");
            return (Criteria) this;
        }

        public Criteria andFollowTimeLessThan(Integer value) {
            addCriterion("follow_time <", value, "followTime");
            return (Criteria) this;
        }

        public Criteria andFollowTimeLessThanOrEqualTo(Integer value) {
            addCriterion("follow_time <=", value, "followTime");
            return (Criteria) this;
        }

        public Criteria andFollowTimeIn(List<Integer> values) {
            addCriterion("follow_time in", values, "followTime");
            return (Criteria) this;
        }

        public Criteria andFollowTimeNotIn(List<Integer> values) {
            addCriterion("follow_time not in", values, "followTime");
            return (Criteria) this;
        }

        public Criteria andFollowTimeBetween(Integer value1, Integer value2) {
            addCriterion("follow_time between", value1, value2, "followTime");
            return (Criteria) this;
        }

        public Criteria andFollowTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_time not between", value1, value2, "followTime");
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

        public Criteria andFoundIdIsNull() {
            addCriterion("found_id is null");
            return (Criteria) this;
        }

        public Criteria andFoundIdIsNotNull() {
            addCriterion("found_id is not null");
            return (Criteria) this;
        }

        public Criteria andFoundIdEqualTo(Integer value) {
            addCriterion("found_id =", value, "foundId");
            return (Criteria) this;
        }

        public Criteria andFoundIdNotEqualTo(Integer value) {
            addCriterion("found_id <>", value, "foundId");
            return (Criteria) this;
        }

        public Criteria andFoundIdGreaterThan(Integer value) {
            addCriterion("found_id >", value, "foundId");
            return (Criteria) this;
        }

        public Criteria andFoundIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("found_id >=", value, "foundId");
            return (Criteria) this;
        }

        public Criteria andFoundIdLessThan(Integer value) {
            addCriterion("found_id <", value, "foundId");
            return (Criteria) this;
        }

        public Criteria andFoundIdLessThanOrEqualTo(Integer value) {
            addCriterion("found_id <=", value, "foundId");
            return (Criteria) this;
        }

        public Criteria andFoundIdIn(List<Integer> values) {
            addCriterion("found_id in", values, "foundId");
            return (Criteria) this;
        }

        public Criteria andFoundIdNotIn(List<Integer> values) {
            addCriterion("found_id not in", values, "foundId");
            return (Criteria) this;
        }

        public Criteria andFoundIdBetween(Integer value1, Integer value2) {
            addCriterion("found_id between", value1, value2, "foundId");
            return (Criteria) this;
        }

        public Criteria andFoundIdNotBetween(Integer value1, Integer value2) {
            addCriterion("found_id not between", value1, value2, "foundId");
            return (Criteria) this;
        }

        public Criteria andFoundUserIdIsNull() {
            addCriterion("found_user_id is null");
            return (Criteria) this;
        }

        public Criteria andFoundUserIdIsNotNull() {
            addCriterion("found_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andFoundUserIdEqualTo(Integer value) {
            addCriterion("found_user_id =", value, "foundUserId");
            return (Criteria) this;
        }

        public Criteria andFoundUserIdNotEqualTo(Integer value) {
            addCriterion("found_user_id <>", value, "foundUserId");
            return (Criteria) this;
        }

        public Criteria andFoundUserIdGreaterThan(Integer value) {
            addCriterion("found_user_id >", value, "foundUserId");
            return (Criteria) this;
        }

        public Criteria andFoundUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("found_user_id >=", value, "foundUserId");
            return (Criteria) this;
        }

        public Criteria andFoundUserIdLessThan(Integer value) {
            addCriterion("found_user_id <", value, "foundUserId");
            return (Criteria) this;
        }

        public Criteria andFoundUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("found_user_id <=", value, "foundUserId");
            return (Criteria) this;
        }

        public Criteria andFoundUserIdIn(List<Integer> values) {
            addCriterion("found_user_id in", values, "foundUserId");
            return (Criteria) this;
        }

        public Criteria andFoundUserIdNotIn(List<Integer> values) {
            addCriterion("found_user_id not in", values, "foundUserId");
            return (Criteria) this;
        }

        public Criteria andFoundUserIdBetween(Integer value1, Integer value2) {
            addCriterion("found_user_id between", value1, value2, "foundUserId");
            return (Criteria) this;
        }

        public Criteria andFoundUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("found_user_id not between", value1, value2, "foundUserId");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNull() {
            addCriterion("team_id is null");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNotNull() {
            addCriterion("team_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeamIdEqualTo(Integer value) {
            addCriterion("team_id =", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotEqualTo(Integer value) {
            addCriterion("team_id <>", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThan(Integer value) {
            addCriterion("team_id >", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("team_id >=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThan(Integer value) {
            addCriterion("team_id <", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThanOrEqualTo(Integer value) {
            addCriterion("team_id <=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdIn(List<Integer> values) {
            addCriterion("team_id in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotIn(List<Integer> values) {
            addCriterion("team_id not in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdBetween(Integer value1, Integer value2) {
            addCriterion("team_id between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("team_id not between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIsWinIsNull() {
            addCriterion("is_win is null");
            return (Criteria) this;
        }

        public Criteria andIsWinIsNotNull() {
            addCriterion("is_win is not null");
            return (Criteria) this;
        }

        public Criteria andIsWinEqualTo(Boolean value) {
            addCriterion("is_win =", value, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsWinNotEqualTo(Boolean value) {
            addCriterion("is_win <>", value, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsWinGreaterThan(Boolean value) {
            addCriterion("is_win >", value, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsWinGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_win >=", value, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsWinLessThan(Boolean value) {
            addCriterion("is_win <", value, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsWinLessThanOrEqualTo(Boolean value) {
            addCriterion("is_win <=", value, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsWinIn(List<Boolean> values) {
            addCriterion("is_win in", values, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsWinNotIn(List<Boolean> values) {
            addCriterion("is_win not in", values, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsWinBetween(Boolean value1, Boolean value2) {
            addCriterion("is_win between", value1, value2, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsWinNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_win not between", value1, value2, "isWin");
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