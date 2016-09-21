package com.arianasp.wsretrofit;

/**
 * Created by Ariana on 9/20/2016.
 */

import retrofit2.http.GET;
import retrofit2.Call;

public interface ApiService {
    @GET("/json_data.json")
    Call<ContactList> getMyJSON();
}
