package com.example.webjson.data;

import com.example.webjson.util.JsonField;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OwnerData {
    @JsonProperty(JsonField.ACCEPT_RATE)
    private int acceptRate;
    @JsonProperty(JsonField.DISPLAY_NAME)
    private String displayName;
    private String link;
    @JsonProperty(JsonField.PROFILE_IMAGE)
    private String profileImage;
    private int reputation;
    @JsonProperty(JsonField.USER_ID)
    private int userId;
    @JsonProperty(JsonField.USER_TYPE)
    private String userType;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public int getAcceptRate() {
        return acceptRate;
    }

    public void setAcceptRate(int acceptRate) {
        this.acceptRate = acceptRate;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
