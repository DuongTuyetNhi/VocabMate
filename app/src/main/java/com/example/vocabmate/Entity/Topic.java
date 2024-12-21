package com.example.vocabmate.Entity;

public class Topic {
    private Long topicId;
    private String topicName;
    private String topicStrans;
    private String topicImg;

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicStrans() {
        return topicStrans;
    }

    public void setTopicStrans(String topicStrans) {
        this.topicStrans = topicStrans;
    }

    public String getTopicImg() {
        return topicImg;
    }

    public void setTopicImg(String topicImg) {
        this.topicImg = topicImg;
    }
}
