package com.example.vocabmate.Service;

import com.example.vocabmate.Entity.Vocab;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface VocabApiInterface {
    @GET("api/vocab/testTopic/{topicId}")
    Call<List<Vocab>> getVocabsByTopic(@Path("topicId") int topicId);

    @GET("api/vocab/{vocabId}")
    Call<Vocab> getVocabById(@Path("vocabId") int vocabId);
}
