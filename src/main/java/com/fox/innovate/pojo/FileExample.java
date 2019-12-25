package com.fox.innovate.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FileExample() {
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

        public Criteria andFileIdIsNull() {
            addCriterion("file_id is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("file_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(String value) {
            addCriterion("file_id =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(String value) {
            addCriterion("file_id <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(String value) {
            addCriterion("file_id >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("file_id >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(String value) {
            addCriterion("file_id <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(String value) {
            addCriterion("file_id <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLike(String value) {
            addCriterion("file_id like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotLike(String value) {
            addCriterion("file_id not like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<String> values) {
            addCriterion("file_id in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<String> values) {
            addCriterion("file_id not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(String value1, String value2) {
            addCriterion("file_id between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(String value1, String value2) {
            addCriterion("file_id not between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("parent_id like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("parent_id not like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(String value) {
            addCriterion("device_id =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(String value) {
            addCriterion("device_id <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(String value) {
            addCriterion("device_id >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(String value) {
            addCriterion("device_id >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(String value) {
            addCriterion("device_id <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(String value) {
            addCriterion("device_id <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLike(String value) {
            addCriterion("device_id like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotLike(String value) {
            addCriterion("device_id not like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<String> values) {
            addCriterion("device_id in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<String> values) {
            addCriterion("device_id not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(String value1, String value2) {
            addCriterion("device_id between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(String value1, String value2) {
            addCriterion("device_id not between", value1, value2, "deviceId");
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

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andFileUrlIsNull() {
            addCriterion("file_url is null");
            return (Criteria) this;
        }

        public Criteria andFileUrlIsNotNull() {
            addCriterion("file_url is not null");
            return (Criteria) this;
        }

        public Criteria andFileUrlEqualTo(String value) {
            addCriterion("file_url =", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotEqualTo(String value) {
            addCriterion("file_url <>", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlGreaterThan(String value) {
            addCriterion("file_url >", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlGreaterThanOrEqualTo(String value) {
            addCriterion("file_url >=", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLessThan(String value) {
            addCriterion("file_url <", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLessThanOrEqualTo(String value) {
            addCriterion("file_url <=", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLike(String value) {
            addCriterion("file_url like", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotLike(String value) {
            addCriterion("file_url not like", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlIn(List<String> values) {
            addCriterion("file_url in", values, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotIn(List<String> values) {
            addCriterion("file_url not in", values, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlBetween(String value1, String value2) {
            addCriterion("file_url between", value1, value2, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotBetween(String value1, String value2) {
            addCriterion("file_url not between", value1, value2, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("file_name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("file_name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("file_name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("file_name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("file_name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("file_name like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("file_name not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("file_name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("file_name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("file_name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("file_name not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNull() {
            addCriterion("file_type is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNotNull() {
            addCriterion("file_type is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeEqualTo(String value) {
            addCriterion("file_type =", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotEqualTo(String value) {
            addCriterion("file_type <>", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThan(String value) {
            addCriterion("file_type >", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("file_type >=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThan(String value) {
            addCriterion("file_type <", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThanOrEqualTo(String value) {
            addCriterion("file_type <=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLike(String value) {
            addCriterion("file_type like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotLike(String value) {
            addCriterion("file_type not like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeIn(List<String> values) {
            addCriterion("file_type in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotIn(List<String> values) {
            addCriterion("file_type not in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeBetween(String value1, String value2) {
            addCriterion("file_type between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotBetween(String value1, String value2) {
            addCriterion("file_type not between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNull() {
            addCriterion("file_size is null");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNotNull() {
            addCriterion("file_size is not null");
            return (Criteria) this;
        }

        public Criteria andFileSizeEqualTo(BigDecimal value) {
            addCriterion("file_size =", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotEqualTo(BigDecimal value) {
            addCriterion("file_size <>", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThan(BigDecimal value) {
            addCriterion("file_size >", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("file_size >=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThan(BigDecimal value) {
            addCriterion("file_size <", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("file_size <=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeIn(List<BigDecimal> values) {
            addCriterion("file_size in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotIn(List<BigDecimal> values) {
            addCriterion("file_size not in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("file_size between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("file_size not between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileUploadIpIsNull() {
            addCriterion("file_upload_ip is null");
            return (Criteria) this;
        }

        public Criteria andFileUploadIpIsNotNull() {
            addCriterion("file_upload_ip is not null");
            return (Criteria) this;
        }

        public Criteria andFileUploadIpEqualTo(String value) {
            addCriterion("file_upload_ip =", value, "fileUploadIp");
            return (Criteria) this;
        }

        public Criteria andFileUploadIpNotEqualTo(String value) {
            addCriterion("file_upload_ip <>", value, "fileUploadIp");
            return (Criteria) this;
        }

        public Criteria andFileUploadIpGreaterThan(String value) {
            addCriterion("file_upload_ip >", value, "fileUploadIp");
            return (Criteria) this;
        }

        public Criteria andFileUploadIpGreaterThanOrEqualTo(String value) {
            addCriterion("file_upload_ip >=", value, "fileUploadIp");
            return (Criteria) this;
        }

        public Criteria andFileUploadIpLessThan(String value) {
            addCriterion("file_upload_ip <", value, "fileUploadIp");
            return (Criteria) this;
        }

        public Criteria andFileUploadIpLessThanOrEqualTo(String value) {
            addCriterion("file_upload_ip <=", value, "fileUploadIp");
            return (Criteria) this;
        }

        public Criteria andFileUploadIpLike(String value) {
            addCriterion("file_upload_ip like", value, "fileUploadIp");
            return (Criteria) this;
        }

        public Criteria andFileUploadIpNotLike(String value) {
            addCriterion("file_upload_ip not like", value, "fileUploadIp");
            return (Criteria) this;
        }

        public Criteria andFileUploadIpIn(List<String> values) {
            addCriterion("file_upload_ip in", values, "fileUploadIp");
            return (Criteria) this;
        }

        public Criteria andFileUploadIpNotIn(List<String> values) {
            addCriterion("file_upload_ip not in", values, "fileUploadIp");
            return (Criteria) this;
        }

        public Criteria andFileUploadIpBetween(String value1, String value2) {
            addCriterion("file_upload_ip between", value1, value2, "fileUploadIp");
            return (Criteria) this;
        }

        public Criteria andFileUploadIpNotBetween(String value1, String value2) {
            addCriterion("file_upload_ip not between", value1, value2, "fileUploadIp");
            return (Criteria) this;
        }

        public Criteria andFileUploadDateIsNull() {
            addCriterion("file_upload_date is null");
            return (Criteria) this;
        }

        public Criteria andFileUploadDateIsNotNull() {
            addCriterion("file_upload_date is not null");
            return (Criteria) this;
        }

        public Criteria andFileUploadDateEqualTo(String value) {
            addCriterion("file_upload_date =", value, "fileUploadDate");
            return (Criteria) this;
        }

        public Criteria andFileUploadDateNotEqualTo(String value) {
            addCriterion("file_upload_date <>", value, "fileUploadDate");
            return (Criteria) this;
        }

        public Criteria andFileUploadDateGreaterThan(String value) {
            addCriterion("file_upload_date >", value, "fileUploadDate");
            return (Criteria) this;
        }

        public Criteria andFileUploadDateGreaterThanOrEqualTo(String value) {
            addCriterion("file_upload_date >=", value, "fileUploadDate");
            return (Criteria) this;
        }

        public Criteria andFileUploadDateLessThan(String value) {
            addCriterion("file_upload_date <", value, "fileUploadDate");
            return (Criteria) this;
        }

        public Criteria andFileUploadDateLessThanOrEqualTo(String value) {
            addCriterion("file_upload_date <=", value, "fileUploadDate");
            return (Criteria) this;
        }

        public Criteria andFileUploadDateLike(String value) {
            addCriterion("file_upload_date like", value, "fileUploadDate");
            return (Criteria) this;
        }

        public Criteria andFileUploadDateNotLike(String value) {
            addCriterion("file_upload_date not like", value, "fileUploadDate");
            return (Criteria) this;
        }

        public Criteria andFileUploadDateIn(List<String> values) {
            addCriterion("file_upload_date in", values, "fileUploadDate");
            return (Criteria) this;
        }

        public Criteria andFileUploadDateNotIn(List<String> values) {
            addCriterion("file_upload_date not in", values, "fileUploadDate");
            return (Criteria) this;
        }

        public Criteria andFileUploadDateBetween(String value1, String value2) {
            addCriterion("file_upload_date between", value1, value2, "fileUploadDate");
            return (Criteria) this;
        }

        public Criteria andFileUploadDateNotBetween(String value1, String value2) {
            addCriterion("file_upload_date not between", value1, value2, "fileUploadDate");
            return (Criteria) this;
        }

        public Criteria andFileUploadTimeIsNull() {
            addCriterion("file_upload_time is null");
            return (Criteria) this;
        }

        public Criteria andFileUploadTimeIsNotNull() {
            addCriterion("file_upload_time is not null");
            return (Criteria) this;
        }

        public Criteria andFileUploadTimeEqualTo(String value) {
            addCriterion("file_upload_time =", value, "fileUploadTime");
            return (Criteria) this;
        }

        public Criteria andFileUploadTimeNotEqualTo(String value) {
            addCriterion("file_upload_time <>", value, "fileUploadTime");
            return (Criteria) this;
        }

        public Criteria andFileUploadTimeGreaterThan(String value) {
            addCriterion("file_upload_time >", value, "fileUploadTime");
            return (Criteria) this;
        }

        public Criteria andFileUploadTimeGreaterThanOrEqualTo(String value) {
            addCriterion("file_upload_time >=", value, "fileUploadTime");
            return (Criteria) this;
        }

        public Criteria andFileUploadTimeLessThan(String value) {
            addCriterion("file_upload_time <", value, "fileUploadTime");
            return (Criteria) this;
        }

        public Criteria andFileUploadTimeLessThanOrEqualTo(String value) {
            addCriterion("file_upload_time <=", value, "fileUploadTime");
            return (Criteria) this;
        }

        public Criteria andFileUploadTimeLike(String value) {
            addCriterion("file_upload_time like", value, "fileUploadTime");
            return (Criteria) this;
        }

        public Criteria andFileUploadTimeNotLike(String value) {
            addCriterion("file_upload_time not like", value, "fileUploadTime");
            return (Criteria) this;
        }

        public Criteria andFileUploadTimeIn(List<String> values) {
            addCriterion("file_upload_time in", values, "fileUploadTime");
            return (Criteria) this;
        }

        public Criteria andFileUploadTimeNotIn(List<String> values) {
            addCriterion("file_upload_time not in", values, "fileUploadTime");
            return (Criteria) this;
        }

        public Criteria andFileUploadTimeBetween(String value1, String value2) {
            addCriterion("file_upload_time between", value1, value2, "fileUploadTime");
            return (Criteria) this;
        }

        public Criteria andFileUploadTimeNotBetween(String value1, String value2) {
            addCriterion("file_upload_time not between", value1, value2, "fileUploadTime");
            return (Criteria) this;
        }

        public Criteria andFileDeleteDateIsNull() {
            addCriterion("file_delete_date is null");
            return (Criteria) this;
        }

        public Criteria andFileDeleteDateIsNotNull() {
            addCriterion("file_delete_date is not null");
            return (Criteria) this;
        }

        public Criteria andFileDeleteDateEqualTo(String value) {
            addCriterion("file_delete_date =", value, "fileDeleteDate");
            return (Criteria) this;
        }

        public Criteria andFileDeleteDateNotEqualTo(String value) {
            addCriterion("file_delete_date <>", value, "fileDeleteDate");
            return (Criteria) this;
        }

        public Criteria andFileDeleteDateGreaterThan(String value) {
            addCriterion("file_delete_date >", value, "fileDeleteDate");
            return (Criteria) this;
        }

        public Criteria andFileDeleteDateGreaterThanOrEqualTo(String value) {
            addCriterion("file_delete_date >=", value, "fileDeleteDate");
            return (Criteria) this;
        }

        public Criteria andFileDeleteDateLessThan(String value) {
            addCriterion("file_delete_date <", value, "fileDeleteDate");
            return (Criteria) this;
        }

        public Criteria andFileDeleteDateLessThanOrEqualTo(String value) {
            addCriterion("file_delete_date <=", value, "fileDeleteDate");
            return (Criteria) this;
        }

        public Criteria andFileDeleteDateLike(String value) {
            addCriterion("file_delete_date like", value, "fileDeleteDate");
            return (Criteria) this;
        }

        public Criteria andFileDeleteDateNotLike(String value) {
            addCriterion("file_delete_date not like", value, "fileDeleteDate");
            return (Criteria) this;
        }

        public Criteria andFileDeleteDateIn(List<String> values) {
            addCriterion("file_delete_date in", values, "fileDeleteDate");
            return (Criteria) this;
        }

        public Criteria andFileDeleteDateNotIn(List<String> values) {
            addCriterion("file_delete_date not in", values, "fileDeleteDate");
            return (Criteria) this;
        }

        public Criteria andFileDeleteDateBetween(String value1, String value2) {
            addCriterion("file_delete_date between", value1, value2, "fileDeleteDate");
            return (Criteria) this;
        }

        public Criteria andFileDeleteDateNotBetween(String value1, String value2) {
            addCriterion("file_delete_date not between", value1, value2, "fileDeleteDate");
            return (Criteria) this;
        }

        public Criteria andFileDeleteTimeIsNull() {
            addCriterion("file_delete_time is null");
            return (Criteria) this;
        }

        public Criteria andFileDeleteTimeIsNotNull() {
            addCriterion("file_delete_time is not null");
            return (Criteria) this;
        }

        public Criteria andFileDeleteTimeEqualTo(String value) {
            addCriterion("file_delete_time =", value, "fileDeleteTime");
            return (Criteria) this;
        }

        public Criteria andFileDeleteTimeNotEqualTo(String value) {
            addCriterion("file_delete_time <>", value, "fileDeleteTime");
            return (Criteria) this;
        }

        public Criteria andFileDeleteTimeGreaterThan(String value) {
            addCriterion("file_delete_time >", value, "fileDeleteTime");
            return (Criteria) this;
        }

        public Criteria andFileDeleteTimeGreaterThanOrEqualTo(String value) {
            addCriterion("file_delete_time >=", value, "fileDeleteTime");
            return (Criteria) this;
        }

        public Criteria andFileDeleteTimeLessThan(String value) {
            addCriterion("file_delete_time <", value, "fileDeleteTime");
            return (Criteria) this;
        }

        public Criteria andFileDeleteTimeLessThanOrEqualTo(String value) {
            addCriterion("file_delete_time <=", value, "fileDeleteTime");
            return (Criteria) this;
        }

        public Criteria andFileDeleteTimeLike(String value) {
            addCriterion("file_delete_time like", value, "fileDeleteTime");
            return (Criteria) this;
        }

        public Criteria andFileDeleteTimeNotLike(String value) {
            addCriterion("file_delete_time not like", value, "fileDeleteTime");
            return (Criteria) this;
        }

        public Criteria andFileDeleteTimeIn(List<String> values) {
            addCriterion("file_delete_time in", values, "fileDeleteTime");
            return (Criteria) this;
        }

        public Criteria andFileDeleteTimeNotIn(List<String> values) {
            addCriterion("file_delete_time not in", values, "fileDeleteTime");
            return (Criteria) this;
        }

        public Criteria andFileDeleteTimeBetween(String value1, String value2) {
            addCriterion("file_delete_time between", value1, value2, "fileDeleteTime");
            return (Criteria) this;
        }

        public Criteria andFileDeleteTimeNotBetween(String value1, String value2) {
            addCriterion("file_delete_time not between", value1, value2, "fileDeleteTime");
            return (Criteria) this;
        }

        public Criteria andFileUploaderIdIsNull() {
            addCriterion("file_uploader_id is null");
            return (Criteria) this;
        }

        public Criteria andFileUploaderIdIsNotNull() {
            addCriterion("file_uploader_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileUploaderIdEqualTo(String value) {
            addCriterion("file_uploader_id =", value, "fileUploaderId");
            return (Criteria) this;
        }

        public Criteria andFileUploaderIdNotEqualTo(String value) {
            addCriterion("file_uploader_id <>", value, "fileUploaderId");
            return (Criteria) this;
        }

        public Criteria andFileUploaderIdGreaterThan(String value) {
            addCriterion("file_uploader_id >", value, "fileUploaderId");
            return (Criteria) this;
        }

        public Criteria andFileUploaderIdGreaterThanOrEqualTo(String value) {
            addCriterion("file_uploader_id >=", value, "fileUploaderId");
            return (Criteria) this;
        }

        public Criteria andFileUploaderIdLessThan(String value) {
            addCriterion("file_uploader_id <", value, "fileUploaderId");
            return (Criteria) this;
        }

        public Criteria andFileUploaderIdLessThanOrEqualTo(String value) {
            addCriterion("file_uploader_id <=", value, "fileUploaderId");
            return (Criteria) this;
        }

        public Criteria andFileUploaderIdLike(String value) {
            addCriterion("file_uploader_id like", value, "fileUploaderId");
            return (Criteria) this;
        }

        public Criteria andFileUploaderIdNotLike(String value) {
            addCriterion("file_uploader_id not like", value, "fileUploaderId");
            return (Criteria) this;
        }

        public Criteria andFileUploaderIdIn(List<String> values) {
            addCriterion("file_uploader_id in", values, "fileUploaderId");
            return (Criteria) this;
        }

        public Criteria andFileUploaderIdNotIn(List<String> values) {
            addCriterion("file_uploader_id not in", values, "fileUploaderId");
            return (Criteria) this;
        }

        public Criteria andFileUploaderIdBetween(String value1, String value2) {
            addCriterion("file_uploader_id between", value1, value2, "fileUploaderId");
            return (Criteria) this;
        }

        public Criteria andFileUploaderIdNotBetween(String value1, String value2) {
            addCriterion("file_uploader_id not between", value1, value2, "fileUploaderId");
            return (Criteria) this;
        }

        public Criteria andFileUploaderNameIsNull() {
            addCriterion("file_uploader_name is null");
            return (Criteria) this;
        }

        public Criteria andFileUploaderNameIsNotNull() {
            addCriterion("file_uploader_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileUploaderNameEqualTo(String value) {
            addCriterion("file_uploader_name =", value, "fileUploaderName");
            return (Criteria) this;
        }

        public Criteria andFileUploaderNameNotEqualTo(String value) {
            addCriterion("file_uploader_name <>", value, "fileUploaderName");
            return (Criteria) this;
        }

        public Criteria andFileUploaderNameGreaterThan(String value) {
            addCriterion("file_uploader_name >", value, "fileUploaderName");
            return (Criteria) this;
        }

        public Criteria andFileUploaderNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_uploader_name >=", value, "fileUploaderName");
            return (Criteria) this;
        }

        public Criteria andFileUploaderNameLessThan(String value) {
            addCriterion("file_uploader_name <", value, "fileUploaderName");
            return (Criteria) this;
        }

        public Criteria andFileUploaderNameLessThanOrEqualTo(String value) {
            addCriterion("file_uploader_name <=", value, "fileUploaderName");
            return (Criteria) this;
        }

        public Criteria andFileUploaderNameLike(String value) {
            addCriterion("file_uploader_name like", value, "fileUploaderName");
            return (Criteria) this;
        }

        public Criteria andFileUploaderNameNotLike(String value) {
            addCriterion("file_uploader_name not like", value, "fileUploaderName");
            return (Criteria) this;
        }

        public Criteria andFileUploaderNameIn(List<String> values) {
            addCriterion("file_uploader_name in", values, "fileUploaderName");
            return (Criteria) this;
        }

        public Criteria andFileUploaderNameNotIn(List<String> values) {
            addCriterion("file_uploader_name not in", values, "fileUploaderName");
            return (Criteria) this;
        }

        public Criteria andFileUploaderNameBetween(String value1, String value2) {
            addCriterion("file_uploader_name between", value1, value2, "fileUploaderName");
            return (Criteria) this;
        }

        public Criteria andFileUploaderNameNotBetween(String value1, String value2) {
            addCriterion("file_uploader_name not between", value1, value2, "fileUploaderName");
            return (Criteria) this;
        }

        public Criteria andFileDeleteIdIsNull() {
            addCriterion("file_delete_id is null");
            return (Criteria) this;
        }

        public Criteria andFileDeleteIdIsNotNull() {
            addCriterion("file_delete_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileDeleteIdEqualTo(String value) {
            addCriterion("file_delete_id =", value, "fileDeleteId");
            return (Criteria) this;
        }

        public Criteria andFileDeleteIdNotEqualTo(String value) {
            addCriterion("file_delete_id <>", value, "fileDeleteId");
            return (Criteria) this;
        }

        public Criteria andFileDeleteIdGreaterThan(String value) {
            addCriterion("file_delete_id >", value, "fileDeleteId");
            return (Criteria) this;
        }

        public Criteria andFileDeleteIdGreaterThanOrEqualTo(String value) {
            addCriterion("file_delete_id >=", value, "fileDeleteId");
            return (Criteria) this;
        }

        public Criteria andFileDeleteIdLessThan(String value) {
            addCriterion("file_delete_id <", value, "fileDeleteId");
            return (Criteria) this;
        }

        public Criteria andFileDeleteIdLessThanOrEqualTo(String value) {
            addCriterion("file_delete_id <=", value, "fileDeleteId");
            return (Criteria) this;
        }

        public Criteria andFileDeleteIdLike(String value) {
            addCriterion("file_delete_id like", value, "fileDeleteId");
            return (Criteria) this;
        }

        public Criteria andFileDeleteIdNotLike(String value) {
            addCriterion("file_delete_id not like", value, "fileDeleteId");
            return (Criteria) this;
        }

        public Criteria andFileDeleteIdIn(List<String> values) {
            addCriterion("file_delete_id in", values, "fileDeleteId");
            return (Criteria) this;
        }

        public Criteria andFileDeleteIdNotIn(List<String> values) {
            addCriterion("file_delete_id not in", values, "fileDeleteId");
            return (Criteria) this;
        }

        public Criteria andFileDeleteIdBetween(String value1, String value2) {
            addCriterion("file_delete_id between", value1, value2, "fileDeleteId");
            return (Criteria) this;
        }

        public Criteria andFileDeleteIdNotBetween(String value1, String value2) {
            addCriterion("file_delete_id not between", value1, value2, "fileDeleteId");
            return (Criteria) this;
        }

        public Criteria andFileDeleteNameIsNull() {
            addCriterion("file_delete_name is null");
            return (Criteria) this;
        }

        public Criteria andFileDeleteNameIsNotNull() {
            addCriterion("file_delete_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileDeleteNameEqualTo(String value) {
            addCriterion("file_delete_name =", value, "fileDeleteName");
            return (Criteria) this;
        }

        public Criteria andFileDeleteNameNotEqualTo(String value) {
            addCriterion("file_delete_name <>", value, "fileDeleteName");
            return (Criteria) this;
        }

        public Criteria andFileDeleteNameGreaterThan(String value) {
            addCriterion("file_delete_name >", value, "fileDeleteName");
            return (Criteria) this;
        }

        public Criteria andFileDeleteNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_delete_name >=", value, "fileDeleteName");
            return (Criteria) this;
        }

        public Criteria andFileDeleteNameLessThan(String value) {
            addCriterion("file_delete_name <", value, "fileDeleteName");
            return (Criteria) this;
        }

        public Criteria andFileDeleteNameLessThanOrEqualTo(String value) {
            addCriterion("file_delete_name <=", value, "fileDeleteName");
            return (Criteria) this;
        }

        public Criteria andFileDeleteNameLike(String value) {
            addCriterion("file_delete_name like", value, "fileDeleteName");
            return (Criteria) this;
        }

        public Criteria andFileDeleteNameNotLike(String value) {
            addCriterion("file_delete_name not like", value, "fileDeleteName");
            return (Criteria) this;
        }

        public Criteria andFileDeleteNameIn(List<String> values) {
            addCriterion("file_delete_name in", values, "fileDeleteName");
            return (Criteria) this;
        }

        public Criteria andFileDeleteNameNotIn(List<String> values) {
            addCriterion("file_delete_name not in", values, "fileDeleteName");
            return (Criteria) this;
        }

        public Criteria andFileDeleteNameBetween(String value1, String value2) {
            addCriterion("file_delete_name between", value1, value2, "fileDeleteName");
            return (Criteria) this;
        }

        public Criteria andFileDeleteNameNotBetween(String value1, String value2) {
            addCriterion("file_delete_name not between", value1, value2, "fileDeleteName");
            return (Criteria) this;
        }

        public Criteria andDataStatusIsNull() {
            addCriterion("data_status is null");
            return (Criteria) this;
        }

        public Criteria andDataStatusIsNotNull() {
            addCriterion("data_status is not null");
            return (Criteria) this;
        }

        public Criteria andDataStatusEqualTo(Integer value) {
            addCriterion("data_status =", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotEqualTo(Integer value) {
            addCriterion("data_status <>", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThan(Integer value) {
            addCriterion("data_status >", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_status >=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThan(Integer value) {
            addCriterion("data_status <", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThanOrEqualTo(Integer value) {
            addCriterion("data_status <=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusIn(List<Integer> values) {
            addCriterion("data_status in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotIn(List<Integer> values) {
            addCriterion("data_status not in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusBetween(Integer value1, Integer value2) {
            addCriterion("data_status between", value1, value2, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("data_status not between", value1, value2, "dataStatus");
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