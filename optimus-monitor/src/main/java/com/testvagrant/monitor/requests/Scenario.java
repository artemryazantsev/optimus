package com.testvagrant.monitor.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Collection;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Scenario {

    private String id;
    private String scenarioName;
    private Integer dataRowNumber = 0;
    private Integer location;
    private String deviceUdid;
    private Collection<String> tags;
    private Date startTime;
    private String buildId;
    private String status;
    private Boolean completed;
    private Date endTime;
    private Integer timeTaken;
    private String scenarioTimeline;
    private String steps;
    private byte[] failedOnScreen;
    private String stacktrace;
    private String activity;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getScenarioName() {
        return scenarioName;
    }

    public void setScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
    }

    public Integer getDataRowNumber() {
        return dataRowNumber;
    }

    public void setDataRowNumber(Integer dataRowNumber) {
        this.dataRowNumber = dataRowNumber;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public String getDeviceUdid() {
        return deviceUdid;
    }

    public void setDeviceUdid(String deviceUdid) {
        this.deviceUdid = deviceUdid;
    }

    public Collection<String> getTags() {
        return tags;
    }

    public void setTags(Collection<String> tags) {
        this.tags = tags;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getBuildId() {
        return buildId;
    }

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getScenarioTimeline() {
        return scenarioTimeline;
    }

    public void setScenarioTimeline(String scenarioTimeline) {
        this.scenarioTimeline = scenarioTimeline;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public void setTimeTaken(Integer timeTaken) {
        this.timeTaken = timeTaken;
    }

    public Integer getTimeTaken() {
        return timeTaken;
    }

    public byte[] getFailedOnScreen() {
        return failedOnScreen;
    }

    public void setFailedOnScreen(byte[] failedOnScreen) {
        this.failedOnScreen = failedOnScreen;
    }

    public String getStacktrace() {
        return stacktrace;
    }

    public void setStacktrace(String stacktrace) {
        this.stacktrace = stacktrace;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }
}
