package com.jackchance.readlist.data.live;

import javax.persistence.*;

@Entity
@Table(name = "t_live_room")
public class LiveRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer hostId;
    private String roomName;
    private String roomDesc;
    private String roomCoverImageUrl;
    private Integer roomStatus;
    private String pullRTMPUrl;
    private String pullHLSUrl;
    private String playbackUrl;
    private Long startTime;
    private Long endTime;
    private Boolean enableVr;
    private String pushUrl;
    private Long createTime;

    private String paraments = "";   //推流拉流参数，支持直播录制、转码、hls等功能

    private Boolean enableDVR = true;
    private Boolean enableHLS = true;

    private Boolean enableTransform = true;
    private String dvrUrl = "";
    private String transformUrl = "";

    public String getTransformUrl() {
        return transformUrl;
    }

    public void setTransformUrl(String transformUrl) {
        this.transformUrl = transformUrl;
    }

    public String getParaments() {
        return paraments;
    }

    public void setParaments(String paraments) {
        this.paraments = paraments;
    }

    public Boolean getEnableDVR() {
        return enableDVR;
    }

    public void setEnableDVR(Boolean enableDVR) {
        this.enableDVR = enableDVR;
    }

    public Boolean getEnableVr() {
        return enableVr;
    }

    public void setEnableVr(Boolean enableVr) {
        this.enableVr = enableVr;
    }

    public Boolean getEnableHLS() {
        return enableHLS;
    }

    public void setEnableHLS(Boolean enableHLS) {
        this.enableHLS = enableHLS;
    }

    public Boolean getEnableTransform() {
        return enableTransform;
    }

    public void setEnableTransform(Boolean enableTransform) {
        this.enableTransform = enableTransform;
    }

    public String getDvrUrl() {
        return dvrUrl;
    }

    public void setDvrUrl(String dvrUrl) {
        this.dvrUrl = dvrUrl;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getPushUrl() {
        return pushUrl;
    }

    public void setPushUrl(String pushUrl) {
        this.pushUrl = pushUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHostId() {
        return hostId;
    }

    public void setHostId(Integer hostId) {
        this.hostId = hostId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomDesc() {
        return roomDesc;
    }

    public void setRoomDesc(String roomDesc) {
        this.roomDesc = roomDesc;
    }

    public String getRoomCoverImageUrl() {
        return roomCoverImageUrl;
    }

    public void setRoomCoverImageUrl(String roomCoverImageUrl) {
        this.roomCoverImageUrl = roomCoverImageUrl;
    }

    public Integer getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(Integer roomStatus) {
        this.roomStatus = roomStatus;
    }

    public String getPullRTMPUrl() {
        return pullRTMPUrl;
    }

    public void setPullRTMPUrl(String pullRTMPUrl) {
        this.pullRTMPUrl = pullRTMPUrl;
    }

    public String getPullHLSUrl() {
        return pullHLSUrl;
    }

    public void setPullHLSUrl(String pullHLSUrl) {
        this.pullHLSUrl = pullHLSUrl;
    }

    public String getPlaybackUrl() {
        return playbackUrl;
    }

    public void setPlaybackUrl(String playbackUrl) {
        this.playbackUrl = playbackUrl;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Boolean getIsVr() {
        return enableVr;
    }

    public void setIsVr(Boolean isVr) {
        this.enableVr = isVr;
    }

    public Boolean getVR() {
        return enableVr;
    }

    public void setIsVR(Boolean isVr) {
        this.enableVr = isVr;
    }
}
