package com.fox.innovate.pojo;

import java.math.BigDecimal;

public class File {
    private String fileId;

    private String parentId;

    private String deviceId;

    private String userId;

    private String fileUrl;

    private String fileName;

    private String fileType;

    private BigDecimal fileSize;

    private String fileUploadDate;

    private String fileUploadTime;

    private String fileDeleteDate;

    private String fileDeleteTime;

    private String fileUploaderId;

    private String fileUploaderName;

    private String fileDeleteId;

    private String fileDeleteName;

    private Integer dataStatus;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    public BigDecimal getFileSize() {
        return fileSize;
    }

    public void setFileSize(BigDecimal fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileUploadDate() {
        return fileUploadDate;
    }

    public void setFileUploadDate(String fileUploadDate) {
        this.fileUploadDate = fileUploadDate == null ? null : fileUploadDate.trim();
    }

    public String getFileUploadTime() {
        return fileUploadTime;
    }

    public void setFileUploadTime(String fileUploadTime) {
        this.fileUploadTime = fileUploadTime == null ? null : fileUploadTime.trim();
    }

    public String getFileDeleteDate() {
        return fileDeleteDate;
    }

    public void setFileDeleteDate(String fileDeleteDate) {
        this.fileDeleteDate = fileDeleteDate == null ? null : fileDeleteDate.trim();
    }

    public String getFileDeleteTime() {
        return fileDeleteTime;
    }

    public void setFileDeleteTime(String fileDeleteTime) {
        this.fileDeleteTime = fileDeleteTime == null ? null : fileDeleteTime.trim();
    }

    public String getFileUploaderId() {
        return fileUploaderId;
    }

    public void setFileUploaderId(String fileUploaderId) {
        this.fileUploaderId = fileUploaderId == null ? null : fileUploaderId.trim();
    }

    public String getFileUploaderName() {
        return fileUploaderName;
    }

    public void setFileUploaderName(String fileUploaderName) {
        this.fileUploaderName = fileUploaderName == null ? null : fileUploaderName.trim();
    }

    public String getFileDeleteId() {
        return fileDeleteId;
    }

    public void setFileDeleteId(String fileDeleteId) {
        this.fileDeleteId = fileDeleteId == null ? null : fileDeleteId.trim();
    }

    public String getFileDeleteName() {
        return fileDeleteName;
    }

    public void setFileDeleteName(String fileDeleteName) {
        this.fileDeleteName = fileDeleteName == null ? null : fileDeleteName.trim();
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }
}