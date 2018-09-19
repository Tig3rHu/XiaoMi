package com.wuyou.entity;

import java.util.ArrayList;
import java.util.List;

public class WxUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WxUserExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andWxnameIsNull() {
            addCriterion("wxname is null");
            return (Criteria) this;
        }

        public Criteria andWxnameIsNotNull() {
            addCriterion("wxname is not null");
            return (Criteria) this;
        }

        public Criteria andWxnameEqualTo(String value) {
            addCriterion("wxname =", value, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameNotEqualTo(String value) {
            addCriterion("wxname <>", value, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameGreaterThan(String value) {
            addCriterion("wxname >", value, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameGreaterThanOrEqualTo(String value) {
            addCriterion("wxname >=", value, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameLessThan(String value) {
            addCriterion("wxname <", value, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameLessThanOrEqualTo(String value) {
            addCriterion("wxname <=", value, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameLike(String value) {
            addCriterion("wxname like", value, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameNotLike(String value) {
            addCriterion("wxname not like", value, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameIn(List<String> values) {
            addCriterion("wxname in", values, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameNotIn(List<String> values) {
            addCriterion("wxname not in", values, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameBetween(String value1, String value2) {
            addCriterion("wxname between", value1, value2, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameNotBetween(String value1, String value2) {
            addCriterion("wxname not between", value1, value2, "wxname");
            return (Criteria) this;
        }

        public Criteria andAeskeyIsNull() {
            addCriterion("aeskey is null");
            return (Criteria) this;
        }

        public Criteria andAeskeyIsNotNull() {
            addCriterion("aeskey is not null");
            return (Criteria) this;
        }

        public Criteria andAeskeyEqualTo(String value) {
            addCriterion("aeskey =", value, "aeskey");
            return (Criteria) this;
        }

        public Criteria andAeskeyNotEqualTo(String value) {
            addCriterion("aeskey <>", value, "aeskey");
            return (Criteria) this;
        }

        public Criteria andAeskeyGreaterThan(String value) {
            addCriterion("aeskey >", value, "aeskey");
            return (Criteria) this;
        }

        public Criteria andAeskeyGreaterThanOrEqualTo(String value) {
            addCriterion("aeskey >=", value, "aeskey");
            return (Criteria) this;
        }

        public Criteria andAeskeyLessThan(String value) {
            addCriterion("aeskey <", value, "aeskey");
            return (Criteria) this;
        }

        public Criteria andAeskeyLessThanOrEqualTo(String value) {
            addCriterion("aeskey <=", value, "aeskey");
            return (Criteria) this;
        }

        public Criteria andAeskeyLike(String value) {
            addCriterion("aeskey like", value, "aeskey");
            return (Criteria) this;
        }

        public Criteria andAeskeyNotLike(String value) {
            addCriterion("aeskey not like", value, "aeskey");
            return (Criteria) this;
        }

        public Criteria andAeskeyIn(List<String> values) {
            addCriterion("aeskey in", values, "aeskey");
            return (Criteria) this;
        }

        public Criteria andAeskeyNotIn(List<String> values) {
            addCriterion("aeskey not in", values, "aeskey");
            return (Criteria) this;
        }

        public Criteria andAeskeyBetween(String value1, String value2) {
            addCriterion("aeskey between", value1, value2, "aeskey");
            return (Criteria) this;
        }

        public Criteria andAeskeyNotBetween(String value1, String value2) {
            addCriterion("aeskey not between", value1, value2, "aeskey");
            return (Criteria) this;
        }

        public Criteria andEncodeIsNull() {
            addCriterion("encode is null");
            return (Criteria) this;
        }

        public Criteria andEncodeIsNotNull() {
            addCriterion("encode is not null");
            return (Criteria) this;
        }

        public Criteria andEncodeEqualTo(Boolean value) {
            addCriterion("encode =", value, "encode");
            return (Criteria) this;
        }

        public Criteria andEncodeNotEqualTo(Boolean value) {
            addCriterion("encode <>", value, "encode");
            return (Criteria) this;
        }

        public Criteria andEncodeGreaterThan(Boolean value) {
            addCriterion("encode >", value, "encode");
            return (Criteria) this;
        }

        public Criteria andEncodeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("encode >=", value, "encode");
            return (Criteria) this;
        }

        public Criteria andEncodeLessThan(Boolean value) {
            addCriterion("encode <", value, "encode");
            return (Criteria) this;
        }

        public Criteria andEncodeLessThanOrEqualTo(Boolean value) {
            addCriterion("encode <=", value, "encode");
            return (Criteria) this;
        }

        public Criteria andEncodeIn(List<Boolean> values) {
            addCriterion("encode in", values, "encode");
            return (Criteria) this;
        }

        public Criteria andEncodeNotIn(List<Boolean> values) {
            addCriterion("encode not in", values, "encode");
            return (Criteria) this;
        }

        public Criteria andEncodeBetween(Boolean value1, Boolean value2) {
            addCriterion("encode between", value1, value2, "encode");
            return (Criteria) this;
        }

        public Criteria andEncodeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("encode not between", value1, value2, "encode");
            return (Criteria) this;
        }

        public Criteria andAppidIsNull() {
            addCriterion("appid is null");
            return (Criteria) this;
        }

        public Criteria andAppidIsNotNull() {
            addCriterion("appid is not null");
            return (Criteria) this;
        }

        public Criteria andAppidEqualTo(String value) {
            addCriterion("appid =", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotEqualTo(String value) {
            addCriterion("appid <>", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThan(String value) {
            addCriterion("appid >", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThanOrEqualTo(String value) {
            addCriterion("appid >=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThan(String value) {
            addCriterion("appid <", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThanOrEqualTo(String value) {
            addCriterion("appid <=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLike(String value) {
            addCriterion("appid like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotLike(String value) {
            addCriterion("appid not like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidIn(List<String> values) {
            addCriterion("appid in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotIn(List<String> values) {
            addCriterion("appid not in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidBetween(String value1, String value2) {
            addCriterion("appid between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotBetween(String value1, String value2) {
            addCriterion("appid not between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppsecretIsNull() {
            addCriterion("appsecret is null");
            return (Criteria) this;
        }

        public Criteria andAppsecretIsNotNull() {
            addCriterion("appsecret is not null");
            return (Criteria) this;
        }

        public Criteria andAppsecretEqualTo(String value) {
            addCriterion("appsecret =", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotEqualTo(String value) {
            addCriterion("appsecret <>", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretGreaterThan(String value) {
            addCriterion("appsecret >", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretGreaterThanOrEqualTo(String value) {
            addCriterion("appsecret >=", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretLessThan(String value) {
            addCriterion("appsecret <", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretLessThanOrEqualTo(String value) {
            addCriterion("appsecret <=", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretLike(String value) {
            addCriterion("appsecret like", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotLike(String value) {
            addCriterion("appsecret not like", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretIn(List<String> values) {
            addCriterion("appsecret in", values, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotIn(List<String> values) {
            addCriterion("appsecret not in", values, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretBetween(String value1, String value2) {
            addCriterion("appsecret between", value1, value2, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotBetween(String value1, String value2) {
            addCriterion("appsecret not between", value1, value2, "appsecret");
            return (Criteria) this;
        }

        public Criteria andWxidIsNull() {
            addCriterion("wxid is null");
            return (Criteria) this;
        }

        public Criteria andWxidIsNotNull() {
            addCriterion("wxid is not null");
            return (Criteria) this;
        }

        public Criteria andWxidEqualTo(String value) {
            addCriterion("wxid =", value, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidNotEqualTo(String value) {
            addCriterion("wxid <>", value, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidGreaterThan(String value) {
            addCriterion("wxid >", value, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidGreaterThanOrEqualTo(String value) {
            addCriterion("wxid >=", value, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidLessThan(String value) {
            addCriterion("wxid <", value, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidLessThanOrEqualTo(String value) {
            addCriterion("wxid <=", value, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidLike(String value) {
            addCriterion("wxid like", value, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidNotLike(String value) {
            addCriterion("wxid not like", value, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidIn(List<String> values) {
            addCriterion("wxid in", values, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidNotIn(List<String> values) {
            addCriterion("wxid not in", values, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidBetween(String value1, String value2) {
            addCriterion("wxid between", value1, value2, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidNotBetween(String value1, String value2) {
            addCriterion("wxid not between", value1, value2, "wxid");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNull() {
            addCriterion("weixin is null");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNotNull() {
            addCriterion("weixin is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinEqualTo(String value) {
            addCriterion("weixin =", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotEqualTo(String value) {
            addCriterion("weixin <>", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThan(String value) {
            addCriterion("weixin >", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("weixin >=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThan(String value) {
            addCriterion("weixin <", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThanOrEqualTo(String value) {
            addCriterion("weixin <=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLike(String value) {
            addCriterion("weixin like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotLike(String value) {
            addCriterion("weixin not like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinIn(List<String> values) {
            addCriterion("weixin in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotIn(List<String> values) {
            addCriterion("weixin not in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinBetween(String value1, String value2) {
            addCriterion("weixin between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotBetween(String value1, String value2) {
            addCriterion("weixin not between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andHeaderpicIsNull() {
            addCriterion("headerpic is null");
            return (Criteria) this;
        }

        public Criteria andHeaderpicIsNotNull() {
            addCriterion("headerpic is not null");
            return (Criteria) this;
        }

        public Criteria andHeaderpicEqualTo(String value) {
            addCriterion("headerpic =", value, "headerpic");
            return (Criteria) this;
        }

        public Criteria andHeaderpicNotEqualTo(String value) {
            addCriterion("headerpic <>", value, "headerpic");
            return (Criteria) this;
        }

        public Criteria andHeaderpicGreaterThan(String value) {
            addCriterion("headerpic >", value, "headerpic");
            return (Criteria) this;
        }

        public Criteria andHeaderpicGreaterThanOrEqualTo(String value) {
            addCriterion("headerpic >=", value, "headerpic");
            return (Criteria) this;
        }

        public Criteria andHeaderpicLessThan(String value) {
            addCriterion("headerpic <", value, "headerpic");
            return (Criteria) this;
        }

        public Criteria andHeaderpicLessThanOrEqualTo(String value) {
            addCriterion("headerpic <=", value, "headerpic");
            return (Criteria) this;
        }

        public Criteria andHeaderpicLike(String value) {
            addCriterion("headerpic like", value, "headerpic");
            return (Criteria) this;
        }

        public Criteria andHeaderpicNotLike(String value) {
            addCriterion("headerpic not like", value, "headerpic");
            return (Criteria) this;
        }

        public Criteria andHeaderpicIn(List<String> values) {
            addCriterion("headerpic in", values, "headerpic");
            return (Criteria) this;
        }

        public Criteria andHeaderpicNotIn(List<String> values) {
            addCriterion("headerpic not in", values, "headerpic");
            return (Criteria) this;
        }

        public Criteria andHeaderpicBetween(String value1, String value2) {
            addCriterion("headerpic between", value1, value2, "headerpic");
            return (Criteria) this;
        }

        public Criteria andHeaderpicNotBetween(String value1, String value2) {
            addCriterion("headerpic not between", value1, value2, "headerpic");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andWTokenIsNull() {
            addCriterion("w_token is null");
            return (Criteria) this;
        }

        public Criteria andWTokenIsNotNull() {
            addCriterion("w_token is not null");
            return (Criteria) this;
        }

        public Criteria andWTokenEqualTo(String value) {
            addCriterion("w_token =", value, "wToken");
            return (Criteria) this;
        }

        public Criteria andWTokenNotEqualTo(String value) {
            addCriterion("w_token <>", value, "wToken");
            return (Criteria) this;
        }

        public Criteria andWTokenGreaterThan(String value) {
            addCriterion("w_token >", value, "wToken");
            return (Criteria) this;
        }

        public Criteria andWTokenGreaterThanOrEqualTo(String value) {
            addCriterion("w_token >=", value, "wToken");
            return (Criteria) this;
        }

        public Criteria andWTokenLessThan(String value) {
            addCriterion("w_token <", value, "wToken");
            return (Criteria) this;
        }

        public Criteria andWTokenLessThanOrEqualTo(String value) {
            addCriterion("w_token <=", value, "wToken");
            return (Criteria) this;
        }

        public Criteria andWTokenLike(String value) {
            addCriterion("w_token like", value, "wToken");
            return (Criteria) this;
        }

        public Criteria andWTokenNotLike(String value) {
            addCriterion("w_token not like", value, "wToken");
            return (Criteria) this;
        }

        public Criteria andWTokenIn(List<String> values) {
            addCriterion("w_token in", values, "wToken");
            return (Criteria) this;
        }

        public Criteria andWTokenNotIn(List<String> values) {
            addCriterion("w_token not in", values, "wToken");
            return (Criteria) this;
        }

        public Criteria andWTokenBetween(String value1, String value2) {
            addCriterion("w_token between", value1, value2, "wToken");
            return (Criteria) this;
        }

        public Criteria andWTokenNotBetween(String value1, String value2) {
            addCriterion("w_token not between", value1, value2, "wToken");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Integer value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Integer value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Integer value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Integer value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Integer> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Integer> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Integer value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Integer value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Integer value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Integer value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Integer value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Integer> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Integer> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Integer value1, Integer value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andTplcontentidIsNull() {
            addCriterion("tplcontentid is null");
            return (Criteria) this;
        }

        public Criteria andTplcontentidIsNotNull() {
            addCriterion("tplcontentid is not null");
            return (Criteria) this;
        }

        public Criteria andTplcontentidEqualTo(String value) {
            addCriterion("tplcontentid =", value, "tplcontentid");
            return (Criteria) this;
        }

        public Criteria andTplcontentidNotEqualTo(String value) {
            addCriterion("tplcontentid <>", value, "tplcontentid");
            return (Criteria) this;
        }

        public Criteria andTplcontentidGreaterThan(String value) {
            addCriterion("tplcontentid >", value, "tplcontentid");
            return (Criteria) this;
        }

        public Criteria andTplcontentidGreaterThanOrEqualTo(String value) {
            addCriterion("tplcontentid >=", value, "tplcontentid");
            return (Criteria) this;
        }

        public Criteria andTplcontentidLessThan(String value) {
            addCriterion("tplcontentid <", value, "tplcontentid");
            return (Criteria) this;
        }

        public Criteria andTplcontentidLessThanOrEqualTo(String value) {
            addCriterion("tplcontentid <=", value, "tplcontentid");
            return (Criteria) this;
        }

        public Criteria andTplcontentidLike(String value) {
            addCriterion("tplcontentid like", value, "tplcontentid");
            return (Criteria) this;
        }

        public Criteria andTplcontentidNotLike(String value) {
            addCriterion("tplcontentid not like", value, "tplcontentid");
            return (Criteria) this;
        }

        public Criteria andTplcontentidIn(List<String> values) {
            addCriterion("tplcontentid in", values, "tplcontentid");
            return (Criteria) this;
        }

        public Criteria andTplcontentidNotIn(List<String> values) {
            addCriterion("tplcontentid not in", values, "tplcontentid");
            return (Criteria) this;
        }

        public Criteria andTplcontentidBetween(String value1, String value2) {
            addCriterion("tplcontentid between", value1, value2, "tplcontentid");
            return (Criteria) this;
        }

        public Criteria andTplcontentidNotBetween(String value1, String value2) {
            addCriterion("tplcontentid not between", value1, value2, "tplcontentid");
            return (Criteria) this;
        }

        public Criteria andShareTicketIsNull() {
            addCriterion("share_ticket is null");
            return (Criteria) this;
        }

        public Criteria andShareTicketIsNotNull() {
            addCriterion("share_ticket is not null");
            return (Criteria) this;
        }

        public Criteria andShareTicketEqualTo(String value) {
            addCriterion("share_ticket =", value, "shareTicket");
            return (Criteria) this;
        }

        public Criteria andShareTicketNotEqualTo(String value) {
            addCriterion("share_ticket <>", value, "shareTicket");
            return (Criteria) this;
        }

        public Criteria andShareTicketGreaterThan(String value) {
            addCriterion("share_ticket >", value, "shareTicket");
            return (Criteria) this;
        }

        public Criteria andShareTicketGreaterThanOrEqualTo(String value) {
            addCriterion("share_ticket >=", value, "shareTicket");
            return (Criteria) this;
        }

        public Criteria andShareTicketLessThan(String value) {
            addCriterion("share_ticket <", value, "shareTicket");
            return (Criteria) this;
        }

        public Criteria andShareTicketLessThanOrEqualTo(String value) {
            addCriterion("share_ticket <=", value, "shareTicket");
            return (Criteria) this;
        }

        public Criteria andShareTicketLike(String value) {
            addCriterion("share_ticket like", value, "shareTicket");
            return (Criteria) this;
        }

        public Criteria andShareTicketNotLike(String value) {
            addCriterion("share_ticket not like", value, "shareTicket");
            return (Criteria) this;
        }

        public Criteria andShareTicketIn(List<String> values) {
            addCriterion("share_ticket in", values, "shareTicket");
            return (Criteria) this;
        }

        public Criteria andShareTicketNotIn(List<String> values) {
            addCriterion("share_ticket not in", values, "shareTicket");
            return (Criteria) this;
        }

        public Criteria andShareTicketBetween(String value1, String value2) {
            addCriterion("share_ticket between", value1, value2, "shareTicket");
            return (Criteria) this;
        }

        public Criteria andShareTicketNotBetween(String value1, String value2) {
            addCriterion("share_ticket not between", value1, value2, "shareTicket");
            return (Criteria) this;
        }

        public Criteria andShareDatedIsNull() {
            addCriterion("share_dated is null");
            return (Criteria) this;
        }

        public Criteria andShareDatedIsNotNull() {
            addCriterion("share_dated is not null");
            return (Criteria) this;
        }

        public Criteria andShareDatedEqualTo(String value) {
            addCriterion("share_dated =", value, "shareDated");
            return (Criteria) this;
        }

        public Criteria andShareDatedNotEqualTo(String value) {
            addCriterion("share_dated <>", value, "shareDated");
            return (Criteria) this;
        }

        public Criteria andShareDatedGreaterThan(String value) {
            addCriterion("share_dated >", value, "shareDated");
            return (Criteria) this;
        }

        public Criteria andShareDatedGreaterThanOrEqualTo(String value) {
            addCriterion("share_dated >=", value, "shareDated");
            return (Criteria) this;
        }

        public Criteria andShareDatedLessThan(String value) {
            addCriterion("share_dated <", value, "shareDated");
            return (Criteria) this;
        }

        public Criteria andShareDatedLessThanOrEqualTo(String value) {
            addCriterion("share_dated <=", value, "shareDated");
            return (Criteria) this;
        }

        public Criteria andShareDatedLike(String value) {
            addCriterion("share_dated like", value, "shareDated");
            return (Criteria) this;
        }

        public Criteria andShareDatedNotLike(String value) {
            addCriterion("share_dated not like", value, "shareDated");
            return (Criteria) this;
        }

        public Criteria andShareDatedIn(List<String> values) {
            addCriterion("share_dated in", values, "shareDated");
            return (Criteria) this;
        }

        public Criteria andShareDatedNotIn(List<String> values) {
            addCriterion("share_dated not in", values, "shareDated");
            return (Criteria) this;
        }

        public Criteria andShareDatedBetween(String value1, String value2) {
            addCriterion("share_dated between", value1, value2, "shareDated");
            return (Criteria) this;
        }

        public Criteria andShareDatedNotBetween(String value1, String value2) {
            addCriterion("share_dated not between", value1, value2, "shareDated");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenIsNull() {
            addCriterion("authorizer_access_token is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenIsNotNull() {
            addCriterion("authorizer_access_token is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenEqualTo(String value) {
            addCriterion("authorizer_access_token =", value, "authorizerAccessToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenNotEqualTo(String value) {
            addCriterion("authorizer_access_token <>", value, "authorizerAccessToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenGreaterThan(String value) {
            addCriterion("authorizer_access_token >", value, "authorizerAccessToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenGreaterThanOrEqualTo(String value) {
            addCriterion("authorizer_access_token >=", value, "authorizerAccessToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenLessThan(String value) {
            addCriterion("authorizer_access_token <", value, "authorizerAccessToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenLessThanOrEqualTo(String value) {
            addCriterion("authorizer_access_token <=", value, "authorizerAccessToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenLike(String value) {
            addCriterion("authorizer_access_token like", value, "authorizerAccessToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenNotLike(String value) {
            addCriterion("authorizer_access_token not like", value, "authorizerAccessToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenIn(List<String> values) {
            addCriterion("authorizer_access_token in", values, "authorizerAccessToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenNotIn(List<String> values) {
            addCriterion("authorizer_access_token not in", values, "authorizerAccessToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenBetween(String value1, String value2) {
            addCriterion("authorizer_access_token between", value1, value2, "authorizerAccessToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenNotBetween(String value1, String value2) {
            addCriterion("authorizer_access_token not between", value1, value2, "authorizerAccessToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerRefreshTokenIsNull() {
            addCriterion("authorizer_refresh_token is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizerRefreshTokenIsNotNull() {
            addCriterion("authorizer_refresh_token is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizerRefreshTokenEqualTo(String value) {
            addCriterion("authorizer_refresh_token =", value, "authorizerRefreshToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerRefreshTokenNotEqualTo(String value) {
            addCriterion("authorizer_refresh_token <>", value, "authorizerRefreshToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerRefreshTokenGreaterThan(String value) {
            addCriterion("authorizer_refresh_token >", value, "authorizerRefreshToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerRefreshTokenGreaterThanOrEqualTo(String value) {
            addCriterion("authorizer_refresh_token >=", value, "authorizerRefreshToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerRefreshTokenLessThan(String value) {
            addCriterion("authorizer_refresh_token <", value, "authorizerRefreshToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerRefreshTokenLessThanOrEqualTo(String value) {
            addCriterion("authorizer_refresh_token <=", value, "authorizerRefreshToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerRefreshTokenLike(String value) {
            addCriterion("authorizer_refresh_token like", value, "authorizerRefreshToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerRefreshTokenNotLike(String value) {
            addCriterion("authorizer_refresh_token not like", value, "authorizerRefreshToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerRefreshTokenIn(List<String> values) {
            addCriterion("authorizer_refresh_token in", values, "authorizerRefreshToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerRefreshTokenNotIn(List<String> values) {
            addCriterion("authorizer_refresh_token not in", values, "authorizerRefreshToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerRefreshTokenBetween(String value1, String value2) {
            addCriterion("authorizer_refresh_token between", value1, value2, "authorizerRefreshToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerRefreshTokenNotBetween(String value1, String value2) {
            addCriterion("authorizer_refresh_token not between", value1, value2, "authorizerRefreshToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerExpiresIsNull() {
            addCriterion("authorizer_expires is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizerExpiresIsNotNull() {
            addCriterion("authorizer_expires is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizerExpiresEqualTo(String value) {
            addCriterion("authorizer_expires =", value, "authorizerExpires");
            return (Criteria) this;
        }

        public Criteria andAuthorizerExpiresNotEqualTo(String value) {
            addCriterion("authorizer_expires <>", value, "authorizerExpires");
            return (Criteria) this;
        }

        public Criteria andAuthorizerExpiresGreaterThan(String value) {
            addCriterion("authorizer_expires >", value, "authorizerExpires");
            return (Criteria) this;
        }

        public Criteria andAuthorizerExpiresGreaterThanOrEqualTo(String value) {
            addCriterion("authorizer_expires >=", value, "authorizerExpires");
            return (Criteria) this;
        }

        public Criteria andAuthorizerExpiresLessThan(String value) {
            addCriterion("authorizer_expires <", value, "authorizerExpires");
            return (Criteria) this;
        }

        public Criteria andAuthorizerExpiresLessThanOrEqualTo(String value) {
            addCriterion("authorizer_expires <=", value, "authorizerExpires");
            return (Criteria) this;
        }

        public Criteria andAuthorizerExpiresLike(String value) {
            addCriterion("authorizer_expires like", value, "authorizerExpires");
            return (Criteria) this;
        }

        public Criteria andAuthorizerExpiresNotLike(String value) {
            addCriterion("authorizer_expires not like", value, "authorizerExpires");
            return (Criteria) this;
        }

        public Criteria andAuthorizerExpiresIn(List<String> values) {
            addCriterion("authorizer_expires in", values, "authorizerExpires");
            return (Criteria) this;
        }

        public Criteria andAuthorizerExpiresNotIn(List<String> values) {
            addCriterion("authorizer_expires not in", values, "authorizerExpires");
            return (Criteria) this;
        }

        public Criteria andAuthorizerExpiresBetween(String value1, String value2) {
            addCriterion("authorizer_expires between", value1, value2, "authorizerExpires");
            return (Criteria) this;
        }

        public Criteria andAuthorizerExpiresNotBetween(String value1, String value2) {
            addCriterion("authorizer_expires not between", value1, value2, "authorizerExpires");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Boolean value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Boolean value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Boolean value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Boolean value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Boolean> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Boolean> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andWebAccessTokenIsNull() {
            addCriterion("web_access_token is null");
            return (Criteria) this;
        }

        public Criteria andWebAccessTokenIsNotNull() {
            addCriterion("web_access_token is not null");
            return (Criteria) this;
        }

        public Criteria andWebAccessTokenEqualTo(String value) {
            addCriterion("web_access_token =", value, "webAccessToken");
            return (Criteria) this;
        }

        public Criteria andWebAccessTokenNotEqualTo(String value) {
            addCriterion("web_access_token <>", value, "webAccessToken");
            return (Criteria) this;
        }

        public Criteria andWebAccessTokenGreaterThan(String value) {
            addCriterion("web_access_token >", value, "webAccessToken");
            return (Criteria) this;
        }

        public Criteria andWebAccessTokenGreaterThanOrEqualTo(String value) {
            addCriterion("web_access_token >=", value, "webAccessToken");
            return (Criteria) this;
        }

        public Criteria andWebAccessTokenLessThan(String value) {
            addCriterion("web_access_token <", value, "webAccessToken");
            return (Criteria) this;
        }

        public Criteria andWebAccessTokenLessThanOrEqualTo(String value) {
            addCriterion("web_access_token <=", value, "webAccessToken");
            return (Criteria) this;
        }

        public Criteria andWebAccessTokenLike(String value) {
            addCriterion("web_access_token like", value, "webAccessToken");
            return (Criteria) this;
        }

        public Criteria andWebAccessTokenNotLike(String value) {
            addCriterion("web_access_token not like", value, "webAccessToken");
            return (Criteria) this;
        }

        public Criteria andWebAccessTokenIn(List<String> values) {
            addCriterion("web_access_token in", values, "webAccessToken");
            return (Criteria) this;
        }

        public Criteria andWebAccessTokenNotIn(List<String> values) {
            addCriterion("web_access_token not in", values, "webAccessToken");
            return (Criteria) this;
        }

        public Criteria andWebAccessTokenBetween(String value1, String value2) {
            addCriterion("web_access_token between", value1, value2, "webAccessToken");
            return (Criteria) this;
        }

        public Criteria andWebAccessTokenNotBetween(String value1, String value2) {
            addCriterion("web_access_token not between", value1, value2, "webAccessToken");
            return (Criteria) this;
        }

        public Criteria andWebRefreshTokenIsNull() {
            addCriterion("web_refresh_token is null");
            return (Criteria) this;
        }

        public Criteria andWebRefreshTokenIsNotNull() {
            addCriterion("web_refresh_token is not null");
            return (Criteria) this;
        }

        public Criteria andWebRefreshTokenEqualTo(String value) {
            addCriterion("web_refresh_token =", value, "webRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWebRefreshTokenNotEqualTo(String value) {
            addCriterion("web_refresh_token <>", value, "webRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWebRefreshTokenGreaterThan(String value) {
            addCriterion("web_refresh_token >", value, "webRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWebRefreshTokenGreaterThanOrEqualTo(String value) {
            addCriterion("web_refresh_token >=", value, "webRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWebRefreshTokenLessThan(String value) {
            addCriterion("web_refresh_token <", value, "webRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWebRefreshTokenLessThanOrEqualTo(String value) {
            addCriterion("web_refresh_token <=", value, "webRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWebRefreshTokenLike(String value) {
            addCriterion("web_refresh_token like", value, "webRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWebRefreshTokenNotLike(String value) {
            addCriterion("web_refresh_token not like", value, "webRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWebRefreshTokenIn(List<String> values) {
            addCriterion("web_refresh_token in", values, "webRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWebRefreshTokenNotIn(List<String> values) {
            addCriterion("web_refresh_token not in", values, "webRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWebRefreshTokenBetween(String value1, String value2) {
            addCriterion("web_refresh_token between", value1, value2, "webRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWebRefreshTokenNotBetween(String value1, String value2) {
            addCriterion("web_refresh_token not between", value1, value2, "webRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWebExpiresIsNull() {
            addCriterion("web_expires is null");
            return (Criteria) this;
        }

        public Criteria andWebExpiresIsNotNull() {
            addCriterion("web_expires is not null");
            return (Criteria) this;
        }

        public Criteria andWebExpiresEqualTo(Integer value) {
            addCriterion("web_expires =", value, "webExpires");
            return (Criteria) this;
        }

        public Criteria andWebExpiresNotEqualTo(Integer value) {
            addCriterion("web_expires <>", value, "webExpires");
            return (Criteria) this;
        }

        public Criteria andWebExpiresGreaterThan(Integer value) {
            addCriterion("web_expires >", value, "webExpires");
            return (Criteria) this;
        }

        public Criteria andWebExpiresGreaterThanOrEqualTo(Integer value) {
            addCriterion("web_expires >=", value, "webExpires");
            return (Criteria) this;
        }

        public Criteria andWebExpiresLessThan(Integer value) {
            addCriterion("web_expires <", value, "webExpires");
            return (Criteria) this;
        }

        public Criteria andWebExpiresLessThanOrEqualTo(Integer value) {
            addCriterion("web_expires <=", value, "webExpires");
            return (Criteria) this;
        }

        public Criteria andWebExpiresIn(List<Integer> values) {
            addCriterion("web_expires in", values, "webExpires");
            return (Criteria) this;
        }

        public Criteria andWebExpiresNotIn(List<Integer> values) {
            addCriterion("web_expires not in", values, "webExpires");
            return (Criteria) this;
        }

        public Criteria andWebExpiresBetween(Integer value1, Integer value2) {
            addCriterion("web_expires between", value1, value2, "webExpires");
            return (Criteria) this;
        }

        public Criteria andWebExpiresNotBetween(Integer value1, Integer value2) {
            addCriterion("web_expires not between", value1, value2, "webExpires");
            return (Criteria) this;
        }

        public Criteria andQrIsNull() {
            addCriterion("qr is null");
            return (Criteria) this;
        }

        public Criteria andQrIsNotNull() {
            addCriterion("qr is not null");
            return (Criteria) this;
        }

        public Criteria andQrEqualTo(String value) {
            addCriterion("qr =", value, "qr");
            return (Criteria) this;
        }

        public Criteria andQrNotEqualTo(String value) {
            addCriterion("qr <>", value, "qr");
            return (Criteria) this;
        }

        public Criteria andQrGreaterThan(String value) {
            addCriterion("qr >", value, "qr");
            return (Criteria) this;
        }

        public Criteria andQrGreaterThanOrEqualTo(String value) {
            addCriterion("qr >=", value, "qr");
            return (Criteria) this;
        }

        public Criteria andQrLessThan(String value) {
            addCriterion("qr <", value, "qr");
            return (Criteria) this;
        }

        public Criteria andQrLessThanOrEqualTo(String value) {
            addCriterion("qr <=", value, "qr");
            return (Criteria) this;
        }

        public Criteria andQrLike(String value) {
            addCriterion("qr like", value, "qr");
            return (Criteria) this;
        }

        public Criteria andQrNotLike(String value) {
            addCriterion("qr not like", value, "qr");
            return (Criteria) this;
        }

        public Criteria andQrIn(List<String> values) {
            addCriterion("qr in", values, "qr");
            return (Criteria) this;
        }

        public Criteria andQrNotIn(List<String> values) {
            addCriterion("qr not in", values, "qr");
            return (Criteria) this;
        }

        public Criteria andQrBetween(String value1, String value2) {
            addCriterion("qr between", value1, value2, "qr");
            return (Criteria) this;
        }

        public Criteria andQrNotBetween(String value1, String value2) {
            addCriterion("qr not between", value1, value2, "qr");
            return (Criteria) this;
        }

        public Criteria andWaitAccessIsNull() {
            addCriterion("wait_access is null");
            return (Criteria) this;
        }

        public Criteria andWaitAccessIsNotNull() {
            addCriterion("wait_access is not null");
            return (Criteria) this;
        }

        public Criteria andWaitAccessEqualTo(Boolean value) {
            addCriterion("wait_access =", value, "waitAccess");
            return (Criteria) this;
        }

        public Criteria andWaitAccessNotEqualTo(Boolean value) {
            addCriterion("wait_access <>", value, "waitAccess");
            return (Criteria) this;
        }

        public Criteria andWaitAccessGreaterThan(Boolean value) {
            addCriterion("wait_access >", value, "waitAccess");
            return (Criteria) this;
        }

        public Criteria andWaitAccessGreaterThanOrEqualTo(Boolean value) {
            addCriterion("wait_access >=", value, "waitAccess");
            return (Criteria) this;
        }

        public Criteria andWaitAccessLessThan(Boolean value) {
            addCriterion("wait_access <", value, "waitAccess");
            return (Criteria) this;
        }

        public Criteria andWaitAccessLessThanOrEqualTo(Boolean value) {
            addCriterion("wait_access <=", value, "waitAccess");
            return (Criteria) this;
        }

        public Criteria andWaitAccessIn(List<Boolean> values) {
            addCriterion("wait_access in", values, "waitAccess");
            return (Criteria) this;
        }

        public Criteria andWaitAccessNotIn(List<Boolean> values) {
            addCriterion("wait_access not in", values, "waitAccess");
            return (Criteria) this;
        }

        public Criteria andWaitAccessBetween(Boolean value1, Boolean value2) {
            addCriterion("wait_access between", value1, value2, "waitAccess");
            return (Criteria) this;
        }

        public Criteria andWaitAccessNotBetween(Boolean value1, Boolean value2) {
            addCriterion("wait_access not between", value1, value2, "waitAccess");
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