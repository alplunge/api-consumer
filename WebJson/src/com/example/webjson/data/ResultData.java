package com.example.webjson.data;

import com.example.webjson.util.JsonField;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultData {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(JsonField.ACCEPTED_ANSWER_ID)
    private int AcceptedAnswerId;
    @JsonProperty(JsonField.ANSWER_COUNT)
    private int answerCount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(JsonField.CLOSED_DATE)
    private long closedDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(JsonField.CLOSED_REASON)
    private String closedReason;
    @JsonProperty(JsonField.CREATION_DATE)
    private long creationDate;
    @JsonProperty(JsonField.IS_ANSWERED)
    private boolean isAnswered;
    @JsonProperty(JsonField.LAST_ACTIVITY_DATE)
    private long lastActivityDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(JsonField.LAST_EDIT)
    private long lastEditDate;
    private String link;
    private OwnerData owner;
    @JsonProperty(JsonField.QUESTION_ID)
    private int questionId;
    private int score;
    private String[] tags;
    private String title;
    @JsonProperty(JsonField.VIEW_COUNT)
    private int viewCount;

    public int getAcceptedAnswerId() {
        return AcceptedAnswerId;
    }

    public void setAcceptedAnswerId(int acceptedAnswerId) {
        AcceptedAnswerId = acceptedAnswerId;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public OwnerData getOwner() {
        return owner;
    }

    public void setOwner(OwnerData owner) {
        this.owner = owner;
    }

    public boolean isAnswered() {
        return isAnswered;
    }

    public void setAnswered(boolean answered) {
        isAnswered = answered;
    }

    public int getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(int answerCount) {
        this.answerCount = answerCount;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public long getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(long closedDate) {
        this.closedDate = closedDate;
    }

    public long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(long creationDate) {
        this.creationDate = creationDate;
    }

    public long getLastActivityDate() {
        return lastActivityDate;
    }

    public void setLastActivityDate(long lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    public String getClosedReason() {
        return closedReason;
    }

    public void setClosedReason(String closedReason) {
        this.closedReason = closedReason;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
