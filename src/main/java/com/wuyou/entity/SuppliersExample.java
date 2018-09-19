package com.wuyou.entity;

import java.util.ArrayList;
import java.util.List;

public class SuppliersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SuppliersExample() {
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

        public Criteria andSuppliersIdIsNull() {
            addCriterion("suppliers_id is null");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdIsNotNull() {
            addCriterion("suppliers_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdEqualTo(Short value) {
            addCriterion("suppliers_id =", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdNotEqualTo(Short value) {
            addCriterion("suppliers_id <>", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdGreaterThan(Short value) {
            addCriterion("suppliers_id >", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdGreaterThanOrEqualTo(Short value) {
            addCriterion("suppliers_id >=", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdLessThan(Short value) {
            addCriterion("suppliers_id <", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdLessThanOrEqualTo(Short value) {
            addCriterion("suppliers_id <=", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdIn(List<Short> values) {
            addCriterion("suppliers_id in", values, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdNotIn(List<Short> values) {
            addCriterion("suppliers_id not in", values, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdBetween(Short value1, Short value2) {
            addCriterion("suppliers_id between", value1, value2, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdNotBetween(Short value1, Short value2) {
            addCriterion("suppliers_id not between", value1, value2, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersNameIsNull() {
            addCriterion("suppliers_name is null");
            return (Criteria) this;
        }

        public Criteria andSuppliersNameIsNotNull() {
            addCriterion("suppliers_name is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliersNameEqualTo(String value) {
            addCriterion("suppliers_name =", value, "suppliersName");
            return (Criteria) this;
        }

        public Criteria andSuppliersNameNotEqualTo(String value) {
            addCriterion("suppliers_name <>", value, "suppliersName");
            return (Criteria) this;
        }

        public Criteria andSuppliersNameGreaterThan(String value) {
            addCriterion("suppliers_name >", value, "suppliersName");
            return (Criteria) this;
        }

        public Criteria andSuppliersNameGreaterThanOrEqualTo(String value) {
            addCriterion("suppliers_name >=", value, "suppliersName");
            return (Criteria) this;
        }

        public Criteria andSuppliersNameLessThan(String value) {
            addCriterion("suppliers_name <", value, "suppliersName");
            return (Criteria) this;
        }

        public Criteria andSuppliersNameLessThanOrEqualTo(String value) {
            addCriterion("suppliers_name <=", value, "suppliersName");
            return (Criteria) this;
        }

        public Criteria andSuppliersNameLike(String value) {
            addCriterion("suppliers_name like", value, "suppliersName");
            return (Criteria) this;
        }

        public Criteria andSuppliersNameNotLike(String value) {
            addCriterion("suppliers_name not like", value, "suppliersName");
            return (Criteria) this;
        }

        public Criteria andSuppliersNameIn(List<String> values) {
            addCriterion("suppliers_name in", values, "suppliersName");
            return (Criteria) this;
        }

        public Criteria andSuppliersNameNotIn(List<String> values) {
            addCriterion("suppliers_name not in", values, "suppliersName");
            return (Criteria) this;
        }

        public Criteria andSuppliersNameBetween(String value1, String value2) {
            addCriterion("suppliers_name between", value1, value2, "suppliersName");
            return (Criteria) this;
        }

        public Criteria andSuppliersNameNotBetween(String value1, String value2) {
            addCriterion("suppliers_name not between", value1, value2, "suppliersName");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNull() {
            addCriterion("is_check is null");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNotNull() {
            addCriterion("is_check is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheckEqualTo(Boolean value) {
            addCriterion("is_check =", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotEqualTo(Boolean value) {
            addCriterion("is_check <>", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThan(Boolean value) {
            addCriterion("is_check >", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_check >=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThan(Boolean value) {
            addCriterion("is_check <", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThanOrEqualTo(Boolean value) {
            addCriterion("is_check <=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckIn(List<Boolean> values) {
            addCriterion("is_check in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotIn(List<Boolean> values) {
            addCriterion("is_check not in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckBetween(Boolean value1, Boolean value2) {
            addCriterion("is_check between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_check not between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andSuppliersContactsIsNull() {
            addCriterion("suppliers_contacts is null");
            return (Criteria) this;
        }

        public Criteria andSuppliersContactsIsNotNull() {
            addCriterion("suppliers_contacts is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliersContactsEqualTo(String value) {
            addCriterion("suppliers_contacts =", value, "suppliersContacts");
            return (Criteria) this;
        }

        public Criteria andSuppliersContactsNotEqualTo(String value) {
            addCriterion("suppliers_contacts <>", value, "suppliersContacts");
            return (Criteria) this;
        }

        public Criteria andSuppliersContactsGreaterThan(String value) {
            addCriterion("suppliers_contacts >", value, "suppliersContacts");
            return (Criteria) this;
        }

        public Criteria andSuppliersContactsGreaterThanOrEqualTo(String value) {
            addCriterion("suppliers_contacts >=", value, "suppliersContacts");
            return (Criteria) this;
        }

        public Criteria andSuppliersContactsLessThan(String value) {
            addCriterion("suppliers_contacts <", value, "suppliersContacts");
            return (Criteria) this;
        }

        public Criteria andSuppliersContactsLessThanOrEqualTo(String value) {
            addCriterion("suppliers_contacts <=", value, "suppliersContacts");
            return (Criteria) this;
        }

        public Criteria andSuppliersContactsLike(String value) {
            addCriterion("suppliers_contacts like", value, "suppliersContacts");
            return (Criteria) this;
        }

        public Criteria andSuppliersContactsNotLike(String value) {
            addCriterion("suppliers_contacts not like", value, "suppliersContacts");
            return (Criteria) this;
        }

        public Criteria andSuppliersContactsIn(List<String> values) {
            addCriterion("suppliers_contacts in", values, "suppliersContacts");
            return (Criteria) this;
        }

        public Criteria andSuppliersContactsNotIn(List<String> values) {
            addCriterion("suppliers_contacts not in", values, "suppliersContacts");
            return (Criteria) this;
        }

        public Criteria andSuppliersContactsBetween(String value1, String value2) {
            addCriterion("suppliers_contacts between", value1, value2, "suppliersContacts");
            return (Criteria) this;
        }

        public Criteria andSuppliersContactsNotBetween(String value1, String value2) {
            addCriterion("suppliers_contacts not between", value1, value2, "suppliersContacts");
            return (Criteria) this;
        }

        public Criteria andSuppliersPhoneIsNull() {
            addCriterion("suppliers_phone is null");
            return (Criteria) this;
        }

        public Criteria andSuppliersPhoneIsNotNull() {
            addCriterion("suppliers_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliersPhoneEqualTo(String value) {
            addCriterion("suppliers_phone =", value, "suppliersPhone");
            return (Criteria) this;
        }

        public Criteria andSuppliersPhoneNotEqualTo(String value) {
            addCriterion("suppliers_phone <>", value, "suppliersPhone");
            return (Criteria) this;
        }

        public Criteria andSuppliersPhoneGreaterThan(String value) {
            addCriterion("suppliers_phone >", value, "suppliersPhone");
            return (Criteria) this;
        }

        public Criteria andSuppliersPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("suppliers_phone >=", value, "suppliersPhone");
            return (Criteria) this;
        }

        public Criteria andSuppliersPhoneLessThan(String value) {
            addCriterion("suppliers_phone <", value, "suppliersPhone");
            return (Criteria) this;
        }

        public Criteria andSuppliersPhoneLessThanOrEqualTo(String value) {
            addCriterion("suppliers_phone <=", value, "suppliersPhone");
            return (Criteria) this;
        }

        public Criteria andSuppliersPhoneLike(String value) {
            addCriterion("suppliers_phone like", value, "suppliersPhone");
            return (Criteria) this;
        }

        public Criteria andSuppliersPhoneNotLike(String value) {
            addCriterion("suppliers_phone not like", value, "suppliersPhone");
            return (Criteria) this;
        }

        public Criteria andSuppliersPhoneIn(List<String> values) {
            addCriterion("suppliers_phone in", values, "suppliersPhone");
            return (Criteria) this;
        }

        public Criteria andSuppliersPhoneNotIn(List<String> values) {
            addCriterion("suppliers_phone not in", values, "suppliersPhone");
            return (Criteria) this;
        }

        public Criteria andSuppliersPhoneBetween(String value1, String value2) {
            addCriterion("suppliers_phone between", value1, value2, "suppliersPhone");
            return (Criteria) this;
        }

        public Criteria andSuppliersPhoneNotBetween(String value1, String value2) {
            addCriterion("suppliers_phone not between", value1, value2, "suppliersPhone");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(Integer value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(Integer value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(Integer value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(Integer value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<Integer> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<Integer> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(Integer value1, Integer value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
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