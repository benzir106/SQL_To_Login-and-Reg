package com.shovo.sql_to_login_rg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class reg extends AppCompatActivity {
    private EditText name,number,pass;
    private Button submit;
    private ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        name=findViewById(R.id.namelId);
        number=findViewById(R.id.phonelId);
        pass=findViewById(R.id.passlId);
        submit=findViewById(R.id.submitId);


        apiInterface= ApiCall.getApiClient().create(ApiInterface.class);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perfromReg();

            }
        });
    }

    private  void perfromReg(){
        Call<Std> call=apiInterface.performRegistration(name.getText().toString()
                ,number.getText().toString(),pass.getText().toString());

        call.enqueue(new Callback<Std>() {
            @Override
            public void onResponse(Call<Std> call, Response<Std> response) {
                if (response.body().getResponse().equals("Success")){
                    Toast.makeText(reg.this, "Success", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Std> call, Throwable t) {

            }
        });

    }
}
