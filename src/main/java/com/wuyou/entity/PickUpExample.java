package com.wuyou.entity;

import java.util.ArrayList;
import java.util.List;

public class PickUpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PickUpExample() {
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

        public Criteria andPickupIdIsNull() {
            addCriterion("pickup_id is null");
            return (Criteria) this;
        }

        public Criteria andPickupIdIsNotNull() {
            addCriterion("pickup_id is not null");
            return (Criteria) this;
        }

        public Criteria andPickupIdEqualTo(Integer value) {
            addCriterion("pickup_id =", value, "pickupId");
            return (Criteria) this;
        }

        public Criteria andPickupIdNotEqualTo(Integer value) {
            addCriterion("pickup_id <>", value, "pickupId");
            return (Criteria) this;
        }

        public Criteria andPickupIdGreaterThan(Integer value) {
            addCriterion("pickup_id >", value, "pickupId");
            return (Criteria) this;
        }

        public Criteria andPickupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pickup_id >=", value, "pickupId");
            return (Criteria) this;
        }

        public Criteria andPickupIdLessThan(Integer value) {
            addCriterion("pickup_id <", value, "pickupId");
            return (Criteria) this;
        }

        public Criteria andPickupIdLessThanOrEqualTo(Integer value) {
            addCriterion("pickup_id <=", value, "pickupId");
            return (Criteria) this;
        }

        public Criteria andPickupIdIn(List<Integer> values) {
            addCriterion("pickup_id in", values, "pickupId");
            return (Criteria) this;
        }

        public Criteria andPickupIdNotIn(List<Integer> values) {
            addCriterion("pickup_id not in", values, "pickupId");
            return (Criteria) this;
        }

        public Criteria andPickupIdBetween(Integer value1, Integer value2) {
            addCriterion("pickup_id between", value1, value2, "pickupId");
            return (Criteria) this;
        }

        public Criteria andPickupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pickup_id not between", value1, value2, "pickupId");
            return (Criteria) this;
        }

        public Criteria andPickupNameIsNull() {
            addCriterion("pickup_name is null");
            return (Criteria) this;
        }

        public Criteria andPickupNameIsNotNull() {
            addCriterion("pickup_name is not null");
            return (Criteria) this;
        }

        public Criteria andPickupNameEqualTo(String value) {
            addCriterion("pickup_name =", value, "pickupName");
            return (Criteria) this;
        }

        public Criteria andPickupNameNotEqualTo(String value) {
            addCriterion("pickup_name <>", value, "pickupName");
            return (Criteria) this;
        }

        public Criteria andPickupNameGreaterThan(String value) {
            addCriterion("pickup_name >", value, "pickupName");
            return (Criteria) this;
        }

        public Criteria andPickupNameGreaterThanOrEqualTo(String value) {
            addCriterion("pickup_name >=", value, "pickupName");
            return (Criteria) this;
        }

        public Criteria andPickupNameLessThan(String value) {
            addCriterion("pickup_name <", value, "pickupName");
            return (Criteria) this;
        }

        public Criteria andPickupNameLessThanOrEqualTo(String value) {
            addCriterion("pickup_name <=", value, "pickupName");
            return (Criteria) this;
        }

        public Criteria andPickupNameLike(String value) {
            addCriterion("pickup_name like", value, "pickupName");
            return (Criteria) this;
        }

        public Criteria andPickupNameNotLike(String value) {
            addCriterion("pickup_name not like", value, "pickupName");
            return (Criteria) this;
        }

        public Criteria andPickupNameIn(List<String> values) {
            addCriterion("pickup_name in", values, "pickupName");
            return (Criteria) this;
        }

        public Criteria andPickupNameNotIn(List<String> values) {
            addCriterion("pickup_name not in", values, "pickupName");
            return (Criteria) this;
        }

        public Criteria andPickupNameBetween(String value1, String value2) {
            addCriterion("pickup_name between", value1, value2, "pickupName");
            return (Criteria) this;
        }

        public Criteria andPickupNameNotBetween(String value1, String value2) {
            addCriterion("pickup_name not between", value1, value2, "pickupName");
            return (Criteria) this;
        }

        public Criteria andPickupAddressIsNull() {
            addCriterion("pickup_address is null");
            return (Criteria) this;
        }

        public Criteria andPickupAddressIsNotNull() {
            addCriterion("pickup_address is not null");
            return (Criteria) this;
        }

        public Criteria andPickupAddressEqualTo(String value) {
            addCriterion("pickup_address =", value, "pickupAddress");
            return (Criteria) this;
        }

        public Criteria andPickupAddressNotEqualTo(String value) {
            addCriterion("pickup_address <>", value, "pickupAddress");
            return (Criteria) this;
        }

        public Criteria andPickupAddressGreaterThan(String value) {
            addCriterion("pickup_address >", value, "pickupAddress");
            return (Criteria) this;
        }

        public Criteria andPickupAddressGreaterThanOrEqualTo(String value) {
            addCriterion("pickup_address >=", value, "pickupAddress");
            return (Criteria) this;
        }

        public Criteria andPickupAddressLessThan(String value) {
            addCriterion("pickup_address <", value, "pickupAddress");
            return (Criteria) this;
        }

        public Criteria andPickupAddressLessThanOrEqualTo(String value) {
            addCriterion("pickup_address <=", value, "pickupAddress");
            return (Criteria) this;
        }

        public Criteria andPickupAddressLike(String value) {
            addCriterion("pickup_address like", value, "pickupAddress");
            return (Criteria) this;
        }

        public Criteria andPickupAddressNotLike(String value) {
            addCriterion("pickup_address not like", value, "pickupAddress");
            return (Criteria) this;
        }

        public Criteria andPickupAddressIn(List<String> values) {
            addCriterion("pickup_address in", values, "pickupAddress");
            return (Criteria) this;
        }

        public Criteria andPickupAddressNotIn(List<String> values) {
            addCriterion("pickup_address not in", values, "pickupAddress");
            return (Criteria) this;
        }

        public Criteria andPickupAddressBetween(String value1, String value2) {
            addCriterion("pickup_address between", value1, value2, "pickupAddress");
            return (Criteria) this;
        }

        public Criteria andPickupAddressNotBetween(String value1, String value2) {
            addCriterion("pickup_address not between", value1, value2, "pickupAddress");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneIsNull() {
            addCriterion("pickup_phone is null");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneIsNotNull() {
            addCriterion("pickup_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneEqualTo(String value) {
            addCriterion("pickup_phone =", value, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneNotEqualTo(String value) {
            addCriterion("pickup_phone <>", value, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneGreaterThan(String value) {
            addCriterion("pickup_phone >", value, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("pickup_phone >=", value, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneLessThan(String value) {
            addCriterion("pickup_phone <", value, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneLessThanOrEqualTo(String value) {
            addCriterion("pickup_phone <=", value, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneLike(String value) {
            addCriterion("pickup_phone like", value, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneNotLike(String value) {
            addCriterion("pickup_phone not like", value, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneIn(List<String> values) {
            addCriterion("pickup_phone in", values, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneNotIn(List<String> values) {
            addCriterion("pickup_phone not in", values, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneBetween(String value1, String value2) {
            addCriterion("pickup_phone between", value1, value2, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneNotBetween(String value1, String value2) {
            addCriterion("pickup_phone not between", value1, value2, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupContactIsNull() {
            addCriterion("pickup_contact is null");
            return (Criteria) this;
        }

        public Criteria andPickupContactIsNotNull() {
            addCriterion("pickup_contact is not null");
            return (Criteria) this;
        }

        public Criteria andPickupContactEqualTo(String value) {
            addCriterion("pickup_contact =", value, "pickupContact");
            return (Criteria) this;
        }

        public Criteria andPickupContactNotEqualTo(String value) {
            addCriterion("pickup_contact <>", value, "pickupContact");
            return (Criteria) this;
        }

        public Criteria andPickupContactGreaterThan(String value) {
            addCriterion("pickup_contact >", value, "pickupContact");
            return (Criteria) this;
        }

        public Criteria andPickupContactGreaterThanOrEqualTo(String value) {
            addCriterion("pickup_contact >=", value, "pickupContact");
            return (Criteria) this;
        }

        public Criteria andPickupContactLessThan(String value) {
            addCriterion("pickup_contact <", value, "pickupContact");
            return (Criteria) this;
        }

        public Criteria andPickupContactLessThanOrEqualTo(String value) {
            addCriterion("pickup_contact <=", value, "pickupContact");
            return (Criteria) this;
        }

        public Criteria andPickupContactLike(String value) {
            addCriterion("pickup_contact like", value, "pickupContact");
            return (Criteria) this;
        }

        public Criteria andPickupContactNotLike(String value) {
            addCriterion("pickup_contact not like", value, "pickupContact");
            return (Criteria) this;
        }

        public Criteria andPickupContactIn(List<String> values) {
            addCriterion("pickup_contact in", values, "pickupContact");
            return (Criteria) this;
        }

        public Criteria andPickupContactNotIn(List<String> values) {
            addCriterion("pickup_contact not in", values, "pickupContact");
            return (Criteria) this;
        }

        public Criteria andPickupContactBetween(String value1, String value2) {
            addCriterion("pickup_contact between", value1, value2, "pickupContact");
            return (Criteria) this;
        }

        public Criteria andPickupContactNotBetween(String value1, String value2) {
            addCriterion("pickup_contact not between", value1, value2, "pickupContact");
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

        public Criteria andDistrictIdIsNull() {
            addCriterion("district_id is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIsNotNull() {
            addCriterion("district_id is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdEqualTo(Integer value) {
            addCriterion("district_id =", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotEqualTo(Integer value) {
            addCriterion("district_id <>", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThan(Integer value) {
            addCriterion("district_id >", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("district_id >=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThan(Integer value) {
            addCriterion("district_id <", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThanOrEqualTo(Integer value) {
            addCriterion("district_id <=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIn(List<Integer> values) {
            addCriterion("district_id in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotIn(List<Integer> values) {
            addCriterion("district_id not in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdBetween(Integer value1, Integer value2) {
            addCriterion("district_id between", value1, value2, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotBetween(Integer value1, Integer value2) {
            addCriterion("district_id not between", value1, value2, "districtId");
            return (Criteria) this;
        }

        public Criteria andSuppliersidIsNull() {
            addCriterion("suppliersid is null");
            return (Criteria) this;
        }

        public Criteria andSuppliersidIsNotNull() {
            addCriterion("suppliersid is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliersidEqualTo(Integer value) {
            addCriterion("suppliersid =", value, "suppliersid");
            return (Criteria) this;
        }

        public Criteria andSuppliersidNotEqualTo(Integer value) {
            addCriterion("suppliersid <>", value, "suppliersid");
            return (Criteria) this;
        }

        public Criteria andSuppliersidGreaterThan(Integer value) {
            addCriterion("suppliersid >", value, "suppliersid");
            return (Criteria) this;
        }

        public Criteria andSuppliersidGreaterThanOrEqualTo(Integer value) {
            addCriterion("suppliersid >=", value, "suppliersid");
            return (Criteria) this;
        }

        public Criteria andSuppliersidLessThan(Integer value) {
            addCriterion("suppliersid <", value, "suppliersid");
            return (Criteria) this;
        }

        public Criteria andSuppliersidLessThanOrEqualTo(Integer value) {
            addCriterion("suppliersid <=", value, "suppliersid");
            return (Criteria) this;
        }

        public Criteria andSuppliersidIn(List<Integer> values) {
            addCriterion("suppliersid in", values, "suppliersid");
            return (Criteria) this;
        }

        public Criteria andSuppliersidNotIn(List<Integer> values) {
            addCriterion("suppliersid not in", values, "suppliersid");
            return (Criteria) this;
        }

        public Criteria andSuppliersidBetween(Integer value1, Integer value2) {
            addCriterion("suppliersid between", value1, value2, "suppliersid");
            return (Criteria) this;
        }

        public Criteria andSuppliersidNotBetween(Integer value1, Integer value2) {
            addCriterion("suppliersid not between", value1, value2, "suppliersid");
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