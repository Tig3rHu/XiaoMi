package com.wuyou.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TeamActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamActivityExample() {
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

        public Criteria andActNameIsNull() {
            addCriterion("act_name is null");
            return (Criteria) this;
        }

        public Criteria andActNameIsNotNull() {
            addCriterion("act_name is not null");
            return (Criteria) this;
        }

        public Criteria andActNameEqualTo(String value) {
            addCriterion("act_name =", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotEqualTo(String value) {
            addCriterion("act_name <>", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameGreaterThan(String value) {
            addCriterion("act_name >", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameGreaterThanOrEqualTo(String value) {
            addCriterion("act_name >=", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameLessThan(String value) {
            addCriterion("act_name <", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameLessThanOrEqualTo(String value) {
            addCriterion("act_name <=", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameLike(String value) {
            addCriterion("act_name like", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotLike(String value) {
            addCriterion("act_name not like", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameIn(List<String> values) {
            addCriterion("act_name in", values, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotIn(List<String> values) {
            addCriterion("act_name not in", values, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameBetween(String value1, String value2) {
            addCriterion("act_name between", value1, value2, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotBetween(String value1, String value2) {
            addCriterion("act_name not between", value1, value2, "actName");
            return (Criteria) this;
        }

        public Criteria andTeamTypeIsNull() {
            addCriterion("team_type is null");
            return (Criteria) this;
        }

        public Criteria andTeamTypeIsNotNull() {
            addCriterion("team_type is not null");
            return (Criteria) this;
        }

        public Criteria andTeamTypeEqualTo(Boolean value) {
            addCriterion("team_type =", value, "teamType");
            return (Criteria) this;
        }

        public Criteria andTeamTypeNotEqualTo(Boolean value) {
            addCriterion("team_type <>", value, "teamType");
            return (Criteria) this;
        }

        public Criteria andTeamTypeGreaterThan(Boolean value) {
            addCriterion("team_type >", value, "teamType");
            return (Criteria) this;
        }

        public Criteria andTeamTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("team_type >=", value, "teamType");
            return (Criteria) this;
        }

        public Criteria andTeamTypeLessThan(Boolean value) {
            addCriterion("team_type <", value, "teamType");
            return (Criteria) this;
        }

        public Criteria andTeamTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("team_type <=", value, "teamType");
            return (Criteria) this;
        }

        public Criteria andTeamTypeIn(List<Boolean> values) {
            addCriterion("team_type in", values, "teamType");
            return (Criteria) this;
        }

        public Criteria andTeamTypeNotIn(List<Boolean> values) {
            addCriterion("team_type not in", values, "teamType");
            return (Criteria) this;
        }

        public Criteria andTeamTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("team_type between", value1, value2, "teamType");
            return (Criteria) this;
        }

        public Criteria andTeamTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("team_type not between", value1, value2, "teamType");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNull() {
            addCriterion("time_limit is null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNotNull() {
            addCriterion("time_limit is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitEqualTo(Integer value) {
            addCriterion("time_limit =", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotEqualTo(Integer value) {
            addCriterion("time_limit <>", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThan(Integer value) {
            addCriterion("time_limit >", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_limit >=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThan(Integer value) {
            addCriterion("time_limit <", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThanOrEqualTo(Integer value) {
            addCriterion("time_limit <=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIn(List<Integer> values) {
            addCriterion("time_limit in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotIn(List<Integer> values) {
            addCriterion("time_limit not in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitBetween(Integer value1, Integer value2) {
            addCriterion("time_limit between", value1, value2, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("time_limit not between", value1, value2, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTeamPriceIsNull() {
            addCriterion("team_price is null");
            return (Criteria) this;
        }

        public Criteria andTeamPriceIsNotNull() {
            addCriterion("team_price is not null");
            return (Criteria) this;
        }

        public Criteria andTeamPriceEqualTo(BigDecimal value) {
            addCriterion("team_price =", value, "teamPrice");
            return (Criteria) this;
        }

        public Criteria andTeamPriceNotEqualTo(BigDecimal value) {
            addCriterion("team_price <>", value, "teamPrice");
            return (Criteria) this;
        }

        public Criteria andTeamPriceGreaterThan(BigDecimal value) {
            addCriterion("team_price >", value, "teamPrice");
            return (Criteria) this;
        }

        public Criteria andTeamPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("team_price >=", value, "teamPrice");
            return (Criteria) this;
        }

        public Criteria andTeamPriceLessThan(BigDecimal value) {
            addCriterion("team_price <", value, "teamPrice");
            return (Criteria) this;
        }

        public Criteria andTeamPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("team_price <=", value, "teamPrice");
            return (Criteria) this;
        }

        public Criteria andTeamPriceIn(List<BigDecimal> values) {
            addCriterion("team_price in", values, "teamPrice");
            return (Criteria) this;
        }

        public Criteria andTeamPriceNotIn(List<BigDecimal> values) {
            addCriterion("team_price not in", values, "teamPrice");
            return (Criteria) this;
        }

        public Criteria andTeamPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("team_price between", value1, value2, "teamPrice");
            return (Criteria) this;
        }

        public Criteria andTeamPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("team_price not between", value1, value2, "teamPrice");
            return (Criteria) this;
        }

        public Criteria andNeederIsNull() {
            addCriterion("needer is null");
            return (Criteria) this;
        }

        public Criteria andNeederIsNotNull() {
            addCriterion("needer is not null");
            return (Criteria) this;
        }

        public Criteria andNeederEqualTo(Integer value) {
            addCriterion("needer =", value, "needer");
            return (Criteria) this;
        }

        public Criteria andNeederNotEqualTo(Integer value) {
            addCriterion("needer <>", value, "needer");
            return (Criteria) this;
        }

        public Criteria andNeederGreaterThan(Integer value) {
            addCriterion("needer >", value, "needer");
            return (Criteria) this;
        }

        public Criteria andNeederGreaterThanOrEqualTo(Integer value) {
            addCriterion("needer >=", value, "needer");
            return (Criteria) this;
        }

        public Criteria andNeederLessThan(Integer value) {
            addCriterion("needer <", value, "needer");
            return (Criteria) this;
        }

        public Criteria andNeederLessThanOrEqualTo(Integer value) {
            addCriterion("needer <=", value, "needer");
            return (Criteria) this;
        }

        public Criteria andNeederIn(List<Integer> values) {
            addCriterion("needer in", values, "needer");
            return (Criteria) this;
        }

        public Criteria andNeederNotIn(List<Integer> values) {
            addCriterion("needer not in", values, "needer");
            return (Criteria) this;
        }

        public Criteria andNeederBetween(Integer value1, Integer value2) {
            addCriterion("needer between", value1, value2, "needer");
            return (Criteria) this;
        }

        public Criteria andNeederNotBetween(Integer value1, Integer value2) {
            addCriterion("needer not between", value1, value2, "needer");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
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

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andBonusIsNull() {
            addCriterion("bonus is null");
            return (Criteria) this;
        }

        public Criteria andBonusIsNotNull() {
            addCriterion("bonus is not null");
            return (Criteria) this;
        }

        public Criteria andBonusEqualTo(BigDecimal value) {
            addCriterion("bonus =", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotEqualTo(BigDecimal value) {
            addCriterion("bonus <>", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusGreaterThan(BigDecimal value) {
            addCriterion("bonus >", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bonus >=", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusLessThan(BigDecimal value) {
            addCriterion("bonus <", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bonus <=", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusIn(List<BigDecimal> values) {
            addCriterion("bonus in", values, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotIn(List<BigDecimal> values) {
            addCriterion("bonus not in", values, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bonus between", value1, value2, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bonus not between", value1, value2, "bonus");
            return (Criteria) this;
        }

        public Criteria andStockLimitIsNull() {
            addCriterion("stock_limit is null");
            return (Criteria) this;
        }

        public Criteria andStockLimitIsNotNull() {
            addCriterion("stock_limit is not null");
            return (Criteria) this;
        }

        public Criteria andStockLimitEqualTo(Integer value) {
            addCriterion("stock_limit =", value, "stockLimit");
            return (Criteria) this;
        }

        public Criteria andStockLimitNotEqualTo(Integer value) {
            addCriterion("stock_limit <>", value, "stockLimit");
            return (Criteria) this;
        }

        public Criteria andStockLimitGreaterThan(Integer value) {
            addCriterion("stock_limit >", value, "stockLimit");
            return (Criteria) this;
        }

        public Criteria andStockLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_limit >=", value, "stockLimit");
            return (Criteria) this;
        }

        public Criteria andStockLimitLessThan(Integer value) {
            addCriterion("stock_limit <", value, "stockLimit");
            return (Criteria) this;
        }

        public Criteria andStockLimitLessThanOrEqualTo(Integer value) {
            addCriterion("stock_limit <=", value, "stockLimit");
            return (Criteria) this;
        }

        public Criteria andStockLimitIn(List<Integer> values) {
            addCriterion("stock_limit in", values, "stockLimit");
            return (Criteria) this;
        }

        public Criteria andStockLimitNotIn(List<Integer> values) {
            addCriterion("stock_limit not in", values, "stockLimit");
            return (Criteria) this;
        }

        public Criteria andStockLimitBetween(Integer value1, Integer value2) {
            addCriterion("stock_limit between", value1, value2, "stockLimit");
            return (Criteria) this;
        }

        public Criteria andStockLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_limit not between", value1, value2, "stockLimit");
            return (Criteria) this;
        }

        public Criteria andBuyLimitIsNull() {
            addCriterion("buy_limit is null");
            return (Criteria) this;
        }

        public Criteria andBuyLimitIsNotNull() {
            addCriterion("buy_limit is not null");
            return (Criteria) this;
        }

        public Criteria andBuyLimitEqualTo(Short value) {
            addCriterion("buy_limit =", value, "buyLimit");
            return (Criteria) this;
        }

        public Criteria andBuyLimitNotEqualTo(Short value) {
            addCriterion("buy_limit <>", value, "buyLimit");
            return (Criteria) this;
        }

        public Criteria andBuyLimitGreaterThan(Short value) {
            addCriterion("buy_limit >", value, "buyLimit");
            return (Criteria) this;
        }

        public Criteria andBuyLimitGreaterThanOrEqualTo(Short value) {
            addCriterion("buy_limit >=", value, "buyLimit");
            return (Criteria) this;
        }

        public Criteria andBuyLimitLessThan(Short value) {
            addCriterion("buy_limit <", value, "buyLimit");
            return (Criteria) this;
        }

        public Criteria andBuyLimitLessThanOrEqualTo(Short value) {
            addCriterion("buy_limit <=", value, "buyLimit");
            return (Criteria) this;
        }

        public Criteria andBuyLimitIn(List<Short> values) {
            addCriterion("buy_limit in", values, "buyLimit");
            return (Criteria) this;
        }

        public Criteria andBuyLimitNotIn(List<Short> values) {
            addCriterion("buy_limit not in", values, "buyLimit");
            return (Criteria) this;
        }

        public Criteria andBuyLimitBetween(Short value1, Short value2) {
            addCriterion("buy_limit between", value1, value2, "buyLimit");
            return (Criteria) this;
        }

        public Criteria andBuyLimitNotBetween(Short value1, Short value2) {
            addCriterion("buy_limit not between", value1, value2, "buyLimit");
            return (Criteria) this;
        }

        public Criteria andSalesSumIsNull() {
            addCriterion("sales_sum is null");
            return (Criteria) this;
        }

        public Criteria andSalesSumIsNotNull() {
            addCriterion("sales_sum is not null");
            return (Criteria) this;
        }

        public Criteria andSalesSumEqualTo(Integer value) {
            addCriterion("sales_sum =", value, "salesSum");
            return (Criteria) this;
        }

        public Criteria andSalesSumNotEqualTo(Integer value) {
            addCriterion("sales_sum <>", value, "salesSum");
            return (Criteria) this;
        }

        public Criteria andSalesSumGreaterThan(Integer value) {
            addCriterion("sales_sum >", value, "salesSum");
            return (Criteria) this;
        }

        public Criteria andSalesSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales_sum >=", value, "salesSum");
            return (Criteria) this;
        }

        public Criteria andSalesSumLessThan(Integer value) {
            addCriterion("sales_sum <", value, "salesSum");
            return (Criteria) this;
        }

        public Criteria andSalesSumLessThanOrEqualTo(Integer value) {
            addCriterion("sales_sum <=", value, "salesSum");
            return (Criteria) this;
        }

        public Criteria andSalesSumIn(List<Integer> values) {
            addCriterion("sales_sum in", values, "salesSum");
            return (Criteria) this;
        }

        public Criteria andSalesSumNotIn(List<Integer> values) {
            addCriterion("sales_sum not in", values, "salesSum");
            return (Criteria) this;
        }

        public Criteria andSalesSumBetween(Integer value1, Integer value2) {
            addCriterion("sales_sum between", value1, value2, "salesSum");
            return (Criteria) this;
        }

        public Criteria andSalesSumNotBetween(Integer value1, Integer value2) {
            addCriterion("sales_sum not between", value1, value2, "salesSum");
            return (Criteria) this;
        }

        public Criteria andVirtualNumIsNull() {
            addCriterion("virtual_num is null");
            return (Criteria) this;
        }

        public Criteria andVirtualNumIsNotNull() {
            addCriterion("virtual_num is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualNumEqualTo(Integer value) {
            addCriterion("virtual_num =", value, "virtualNum");
            return (Criteria) this;
        }

        public Criteria andVirtualNumNotEqualTo(Integer value) {
            addCriterion("virtual_num <>", value, "virtualNum");
            return (Criteria) this;
        }

        public Criteria andVirtualNumGreaterThan(Integer value) {
            addCriterion("virtual_num >", value, "virtualNum");
            return (Criteria) this;
        }

        public Criteria andVirtualNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("virtual_num >=", value, "virtualNum");
            return (Criteria) this;
        }

        public Criteria andVirtualNumLessThan(Integer value) {
            addCriterion("virtual_num <", value, "virtualNum");
            return (Criteria) this;
        }

        public Criteria andVirtualNumLessThanOrEqualTo(Integer value) {
            addCriterion("virtual_num <=", value, "virtualNum");
            return (Criteria) this;
        }

        public Criteria andVirtualNumIn(List<Integer> values) {
            addCriterion("virtual_num in", values, "virtualNum");
            return (Criteria) this;
        }

        public Criteria andVirtualNumNotIn(List<Integer> values) {
            addCriterion("virtual_num not in", values, "virtualNum");
            return (Criteria) this;
        }

        public Criteria andVirtualNumBetween(Integer value1, Integer value2) {
            addCriterion("virtual_num between", value1, value2, "virtualNum");
            return (Criteria) this;
        }

        public Criteria andVirtualNumNotBetween(Integer value1, Integer value2) {
            addCriterion("virtual_num not between", value1, value2, "virtualNum");
            return (Criteria) this;
        }

        public Criteria andShareTitleIsNull() {
            addCriterion("share_title is null");
            return (Criteria) this;
        }

        public Criteria andShareTitleIsNotNull() {
            addCriterion("share_title is not null");
            return (Criteria) this;
        }

        public Criteria andShareTitleEqualTo(String value) {
            addCriterion("share_title =", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotEqualTo(String value) {
            addCriterion("share_title <>", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleGreaterThan(String value) {
            addCriterion("share_title >", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleGreaterThanOrEqualTo(String value) {
            addCriterion("share_title >=", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleLessThan(String value) {
            addCriterion("share_title <", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleLessThanOrEqualTo(String value) {
            addCriterion("share_title <=", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleLike(String value) {
            addCriterion("share_title like", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotLike(String value) {
            addCriterion("share_title not like", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleIn(List<String> values) {
            addCriterion("share_title in", values, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotIn(List<String> values) {
            addCriterion("share_title not in", values, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleBetween(String value1, String value2) {
            addCriterion("share_title between", value1, value2, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotBetween(String value1, String value2) {
            addCriterion("share_title not between", value1, value2, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareDescIsNull() {
            addCriterion("share_desc is null");
            return (Criteria) this;
        }

        public Criteria andShareDescIsNotNull() {
            addCriterion("share_desc is not null");
            return (Criteria) this;
        }

        public Criteria andShareDescEqualTo(String value) {
            addCriterion("share_desc =", value, "shareDesc");
            return (Criteria) this;
        }

        public Criteria andShareDescNotEqualTo(String value) {
            addCriterion("share_desc <>", value, "shareDesc");
            return (Criteria) this;
        }

        public Criteria andShareDescGreaterThan(String value) {
            addCriterion("share_desc >", value, "shareDesc");
            return (Criteria) this;
        }

        public Criteria andShareDescGreaterThanOrEqualTo(String value) {
            addCriterion("share_desc >=", value, "shareDesc");
            return (Criteria) this;
        }

        public Criteria andShareDescLessThan(String value) {
            addCriterion("share_desc <", value, "shareDesc");
            return (Criteria) this;
        }

        public Criteria andShareDescLessThanOrEqualTo(String value) {
            addCriterion("share_desc <=", value, "shareDesc");
            return (Criteria) this;
        }

        public Criteria andShareDescLike(String value) {
            addCriterion("share_desc like", value, "shareDesc");
            return (Criteria) this;
        }

        public Criteria andShareDescNotLike(String value) {
            addCriterion("share_desc not like", value, "shareDesc");
            return (Criteria) this;
        }

        public Criteria andShareDescIn(List<String> values) {
            addCriterion("share_desc in", values, "shareDesc");
            return (Criteria) this;
        }

        public Criteria andShareDescNotIn(List<String> values) {
            addCriterion("share_desc not in", values, "shareDesc");
            return (Criteria) this;
        }

        public Criteria andShareDescBetween(String value1, String value2) {
            addCriterion("share_desc between", value1, value2, "shareDesc");
            return (Criteria) this;
        }

        public Criteria andShareDescNotBetween(String value1, String value2) {
            addCriterion("share_desc not between", value1, value2, "shareDesc");
            return (Criteria) this;
        }

        public Criteria andShareImgIsNull() {
            addCriterion("share_img is null");
            return (Criteria) this;
        }

        public Criteria andShareImgIsNotNull() {
            addCriterion("share_img is not null");
            return (Criteria) this;
        }

        public Criteria andShareImgEqualTo(String value) {
            addCriterion("share_img =", value, "shareImg");
            return (Criteria) this;
        }

        public Criteria andShareImgNotEqualTo(String value) {
            addCriterion("share_img <>", value, "shareImg");
            return (Criteria) this;
        }

        public Criteria andShareImgGreaterThan(String value) {
            addCriterion("share_img >", value, "shareImg");
            return (Criteria) this;
        }

        public Criteria andShareImgGreaterThanOrEqualTo(String value) {
            addCriterion("share_img >=", value, "shareImg");
            return (Criteria) this;
        }

        public Criteria andShareImgLessThan(String value) {
            addCriterion("share_img <", value, "shareImg");
            return (Criteria) this;
        }

        public Criteria andShareImgLessThanOrEqualTo(String value) {
            addCriterion("share_img <=", value, "shareImg");
            return (Criteria) this;
        }

        public Criteria andShareImgLike(String value) {
            addCriterion("share_img like", value, "shareImg");
            return (Criteria) this;
        }

        public Criteria andShareImgNotLike(String value) {
            addCriterion("share_img not like", value, "shareImg");
            return (Criteria) this;
        }

        public Criteria andShareImgIn(List<String> values) {
            addCriterion("share_img in", values, "shareImg");
            return (Criteria) this;
        }

        public Criteria andShareImgNotIn(List<String> values) {
            addCriterion("share_img not in", values, "shareImg");
            return (Criteria) this;
        }

        public Criteria andShareImgBetween(String value1, String value2) {
            addCriterion("share_img between", value1, value2, "shareImg");
            return (Criteria) this;
        }

        public Criteria andShareImgNotBetween(String value1, String value2) {
            addCriterion("share_img not between", value1, value2, "shareImg");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Short value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Short value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Short value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Short value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Short value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Short value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Short> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Short> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Short value1, Short value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Short value1, Short value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNull() {
            addCriterion("is_recommend is null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNotNull() {
            addCriterion("is_recommend is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendEqualTo(Boolean value) {
            addCriterion("is_recommend =", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotEqualTo(Boolean value) {
            addCriterion("is_recommend <>", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThan(Boolean value) {
            addCriterion("is_recommend >", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_recommend >=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThan(Boolean value) {
            addCriterion("is_recommend <", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThanOrEqualTo(Boolean value) {
            addCriterion("is_recommend <=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIn(List<Boolean> values) {
            addCriterion("is_recommend in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotIn(List<Boolean> values) {
            addCriterion("is_recommend not in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendBetween(Boolean value1, Boolean value2) {
            addCriterion("is_recommend between", value1, value2, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_recommend not between", value1, value2, "isRecommend");
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

        public Criteria andIsLotteryIsNull() {
            addCriterion("is_lottery is null");
            return (Criteria) this;
        }

        public Criteria andIsLotteryIsNotNull() {
            addCriterion("is_lottery is not null");
            return (Criteria) this;
        }

        public Criteria andIsLotteryEqualTo(Boolean value) {
            addCriterion("is_lottery =", value, "isLottery");
            return (Criteria) this;
        }

        public Criteria andIsLotteryNotEqualTo(Boolean value) {
            addCriterion("is_lottery <>", value, "isLottery");
            return (Criteria) this;
        }

        public Criteria andIsLotteryGreaterThan(Boolean value) {
            addCriterion("is_lottery >", value, "isLottery");
            return (Criteria) this;
        }

        public Criteria andIsLotteryGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_lottery >=", value, "isLottery");
            return (Criteria) this;
        }

        public Criteria andIsLotteryLessThan(Boolean value) {
            addCriterion("is_lottery <", value, "isLottery");
            return (Criteria) this;
        }

        public Criteria andIsLotteryLessThanOrEqualTo(Boolean value) {
            addCriterion("is_lottery <=", value, "isLottery");
            return (Criteria) this;
        }

        public Criteria andIsLotteryIn(List<Boolean> values) {
            addCriterion("is_lottery in", values, "isLottery");
            return (Criteria) this;
        }

        public Criteria andIsLotteryNotIn(List<Boolean> values) {
            addCriterion("is_lottery not in", values, "isLottery");
            return (Criteria) this;
        }

        public Criteria andIsLotteryBetween(Boolean value1, Boolean value2) {
            addCriterion("is_lottery between", value1, value2, "isLottery");
            return (Criteria) this;
        }

        public Criteria andIsLotteryNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_lottery not between", value1, value2, "isLottery");
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