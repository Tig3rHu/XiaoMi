package com.wuyou.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TeamFoundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamFoundExample() {
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

        public Criteria andFoundTimeIsNull() {
            addCriterion("found_time is null");
            return (Criteria) this;
        }

        public Criteria andFoundTimeIsNotNull() {
            addCriterion("found_time is not null");
            return (Criteria) this;
        }

        public Criteria andFoundTimeEqualTo(Integer value) {
            addCriterion("found_time =", value, "foundTime");
            return (Criteria) this;
        }

        public Criteria andFoundTimeNotEqualTo(Integer value) {
            addCriterion("found_time <>", value, "foundTime");
            return (Criteria) this;
        }

        public Criteria andFoundTimeGreaterThan(Integer value) {
            addCriterion("found_time >", value, "foundTime");
            return (Criteria) this;
        }

        public Criteria andFoundTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("found_time >=", value, "foundTime");
            return (Criteria) this;
        }

        public Criteria andFoundTimeLessThan(Integer value) {
            addCriterion("found_time <", value, "foundTime");
            return (Criteria) this;
        }

        public Criteria andFoundTimeLessThanOrEqualTo(Integer value) {
            addCriterion("found_time <=", value, "foundTime");
            return (Criteria) this;
        }

        public Criteria andFoundTimeIn(List<Integer> values) {
            addCriterion("found_time in", values, "foundTime");
            return (Criteria) this;
        }

        public Criteria andFoundTimeNotIn(List<Integer> values) {
            addCriterion("found_time not in", values, "foundTime");
            return (Criteria) this;
        }

        public Criteria andFoundTimeBetween(Integer value1, Integer value2) {
            addCriterion("found_time between", value1, value2, "foundTime");
            return (Criteria) this;
        }

        public Criteria andFoundTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("found_time not between", value1, value2, "foundTime");
            return (Criteria) this;
        }

        public Criteria andFoundEndTimeIsNull() {
            addCriterion("found_end_time is null");
            return (Criteria) this;
        }

        public Criteria andFoundEndTimeIsNotNull() {
            addCriterion("found_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andFoundEndTimeEqualTo(Integer value) {
            addCriterion("found_end_time =", value, "foundEndTime");
            return (Criteria) this;
        }

        public Criteria andFoundEndTimeNotEqualTo(Integer value) {
            addCriterion("found_end_time <>", value, "foundEndTime");
            return (Criteria) this;
        }

        public Criteria andFoundEndTimeGreaterThan(Integer value) {
            addCriterion("found_end_time >", value, "foundEndTime");
            return (Criteria) this;
        }

        public Criteria andFoundEndTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("found_end_time >=", value, "foundEndTime");
            return (Criteria) this;
        }

        public Criteria andFoundEndTimeLessThan(Integer value) {
            addCriterion("found_end_time <", value, "foundEndTime");
            return (Criteria) this;
        }

        public Criteria andFoundEndTimeLessThanOrEqualTo(Integer value) {
            addCriterion("found_end_time <=", value, "foundEndTime");
            return (Criteria) this;
        }

        public Criteria andFoundEndTimeIn(List<Integer> values) {
            addCriterion("found_end_time in", values, "foundEndTime");
            return (Criteria) this;
        }

        public Criteria andFoundEndTimeNotIn(List<Integer> values) {
            addCriterion("found_end_time not in", values, "foundEndTime");
            return (Criteria) this;
        }

        public Criteria andFoundEndTimeBetween(Integer value1, Integer value2) {
            addCriterion("found_end_time between", value1, value2, "foundEndTime");
            return (Criteria) this;
        }

        public Criteria andFoundEndTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("found_end_time not between", value1, value2, "foundEndTime");
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

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andHeadPicIsNull() {
            addCriterion("head_pic is null");
            return (Criteria) this;
        }

        public Criteria andHeadPicIsNotNull() {
            addCriterion("head_pic is not null");
            return (Criteria) this;
        }

        public Criteria andHeadPicEqualTo(String value) {
            addCriterion("head_pic =", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicNotEqualTo(String value) {
            addCriterion("head_pic <>", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicGreaterThan(String value) {
            addCriterion("head_pic >", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicGreaterThanOrEqualTo(String value) {
            addCriterion("head_pic >=", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicLessThan(String value) {
            addCriterion("head_pic <", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicLessThanOrEqualTo(String value) {
            addCriterion("head_pic <=", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicLike(String value) {
            addCriterion("head_pic like", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicNotLike(String value) {
            addCriterion("head_pic not like", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicIn(List<String> values) {
            addCriterion("head_pic in", values, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicNotIn(List<String> values) {
            addCriterion("head_pic not in", values, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicBetween(String value1, String value2) {
            addCriterion("head_pic between", value1, value2, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicNotBetween(String value1, String value2) {
            addCriterion("head_pic not between", value1, value2, "headPic");
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

        public Criteria andJoinIsNull() {
            addCriterion("join is null");
            return (Criteria) this;
        }

        public Criteria andJoinIsNotNull() {
            addCriterion("join is not null");
            return (Criteria) this;
        }

        public Criteria andJoinEqualTo(Integer value) {
            addCriterion("join =", value, "join");
            return (Criteria) this;
        }

        public Criteria andJoinNotEqualTo(Integer value) {
            addCriterion("join <>", value, "join");
            return (Criteria) this;
        }

        public Criteria andJoinGreaterThan(Integer value) {
            addCriterion("join >", value, "join");
            return (Criteria) this;
        }

        public Criteria andJoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("join >=", value, "join");
            return (Criteria) this;
        }

        public Criteria andJoinLessThan(Integer value) {
            addCriterion("join <", value, "join");
            return (Criteria) this;
        }

        public Criteria andJoinLessThanOrEqualTo(Integer value) {
            addCriterion("join <=", value, "join");
            return (Criteria) this;
        }

        public Criteria andJoinIn(List<Integer> values) {
            addCriterion("join in", values, "join");
            return (Criteria) this;
        }

        public Criteria andJoinNotIn(List<Integer> values) {
            addCriterion("join not in", values, "join");
            return (Criteria) this;
        }

        public Criteria andJoinBetween(Integer value1, Integer value2) {
            addCriterion("join between", value1, value2, "join");
            return (Criteria) this;
        }

        public Criteria andJoinNotBetween(Integer value1, Integer value2) {
            addCriterion("join not between", value1, value2, "join");
            return (Criteria) this;
        }

        public Criteria andNeedIsNull() {
            addCriterion("need is null");
            return (Criteria) this;
        }

        public Criteria andNeedIsNotNull() {
            addCriterion("need is not null");
            return (Criteria) this;
        }

        public Criteria andNeedEqualTo(Integer value) {
            addCriterion("need =", value, "need");
            return (Criteria) this;
        }

        public Criteria andNeedNotEqualTo(Integer value) {
            addCriterion("need <>", value, "need");
            return (Criteria) this;
        }

        public Criteria andNeedGreaterThan(Integer value) {
            addCriterion("need >", value, "need");
            return (Criteria) this;
        }

        public Criteria andNeedGreaterThanOrEqualTo(Integer value) {
            addCriterion("need >=", value, "need");
            return (Criteria) this;
        }

        public Criteria andNeedLessThan(Integer value) {
            addCriterion("need <", value, "need");
            return (Criteria) this;
        }

        public Criteria andNeedLessThanOrEqualTo(Integer value) {
            addCriterion("need <=", value, "need");
            return (Criteria) this;
        }

        public Criteria andNeedIn(List<Integer> values) {
            addCriterion("need in", values, "need");
            return (Criteria) this;
        }

        public Criteria andNeedNotIn(List<Integer> values) {
            addCriterion("need not in", values, "need");
            return (Criteria) this;
        }

        public Criteria andNeedBetween(Integer value1, Integer value2) {
            addCriterion("need between", value1, value2, "need");
            return (Criteria) this;
        }

        public Criteria andNeedNotBetween(Integer value1, Integer value2) {
            addCriterion("need not between", value1, value2, "need");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(BigDecimal value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(BigDecimal value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(BigDecimal value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<BigDecimal> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
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

        public Criteria andBonusStatusIsNull() {
            addCriterion("bonus_status is null");
            return (Criteria) this;
        }

        public Criteria andBonusStatusIsNotNull() {
            addCriterion("bonus_status is not null");
            return (Criteria) this;
        }

        public Criteria andBonusStatusEqualTo(Boolean value) {
            addCriterion("bonus_status =", value, "bonusStatus");
            return (Criteria) this;
        }

        public Criteria andBonusStatusNotEqualTo(Boolean value) {
            addCriterion("bonus_status <>", value, "bonusStatus");
            return (Criteria) this;
        }

        public Criteria andBonusStatusGreaterThan(Boolean value) {
            addCriterion("bonus_status >", value, "bonusStatus");
            return (Criteria) this;
        }

        public Criteria andBonusStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bonus_status >=", value, "bonusStatus");
            return (Criteria) this;
        }

        public Criteria andBonusStatusLessThan(Boolean value) {
            addCriterion("bonus_status <", value, "bonusStatus");
            return (Criteria) this;
        }

        public Criteria andBonusStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("bonus_status <=", value, "bonusStatus");
            return (Criteria) this;
        }

        public Criteria andBonusStatusIn(List<Boolean> values) {
            addCriterion("bonus_status in", values, "bonusStatus");
            return (Criteria) this;
        }

        public Criteria andBonusStatusNotIn(List<Boolean> values) {
            addCriterion("bonus_status not in", values, "bonusStatus");
            return (Criteria) this;
        }

        public Criteria andBonusStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("bonus_status between", value1, value2, "bonusStatus");
            return (Criteria) this;
        }

        public Criteria andBonusStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bonus_status not between", value1, value2, "bonusStatus");
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