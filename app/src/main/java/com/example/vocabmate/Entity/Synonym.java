package com.example.vocabmate.Entity;

public class Synonym {
    private int synonymId;
    private String synonym;
    private Long vocabId;

    public int getSynonymId() {
        return synonymId;
    }

    public void setSynonymId(int synonymId) {
        this.synonymId = synonymId;
    }

    public String getSynonym() {
        return synonym;
    }

    public void setSynonym(String synonym) {
        this.synonym = synonym;
    }

    public Long getVocabId() {
        return vocabId;
    }

    public void setVocabId(Long vocabId) {
        this.vocabId = vocabId;
    }
}
