package com.example.webjson.data;

import com.example.webjson.util.JsonField;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ResultArray {
    @JsonProperty(JsonField.HAS_MORE)
    private boolean hasMore;
    private List<ResultData> items;
    @JsonProperty(JsonField.QUOTA_MAX)
    private int quotaMax;
    @JsonProperty(JsonField.QUOTA_REMAINING)
    private int quotaRemaining;

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public List<ResultData> getItems() {
        return items;
    }

    public void setItems(List<ResultData> items) {
        this.items = items;
    }

    public int getQuotaMax() {
        return quotaMax;
    }

    public void setQuotaMax(int quotaMax) {
        this.quotaMax = quotaMax;
    }

    public int getQuotaRemaining() {
        return quotaRemaining;
    }

    public void setQuotaRemaining(int quotaRemaining) {
        this.quotaRemaining = quotaRemaining;
    }

}
