package com.example.apicall;


import android.widget.Toast;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;


public interface Api {

    public static final String BASE_URL = "https://hamon-interviewapi.herokuapp.com/";

    /**
     * @return
     */
    @GET("Students")
    Call<List<Students>> getStudents();

    @GET("Subjects")
    Call<List<Subjects>> getSubjects();

    @GET("Classrooms")
    Call<List<Classroom>> getClassroom();

}
