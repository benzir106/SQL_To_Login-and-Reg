package com.shovo.sql_to_login_rg;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {
    @FormUrlEncoded
    @POST("reg.php")

    Call<Std> performRegistration(@Field("name") String Name,
                                  @Field("number") String number,
                                  @Field("password") String password);



}
