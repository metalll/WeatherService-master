package com.example.lababiba.weatherservice.Activities;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.lababiba.weatherservice.Controller.WebClient;
import com.example.lababiba.weatherservice.R;
import com.example.lababiba.weatherservice.Service.MyService;




public class MainActivity extends AppCompatActivity {

    Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        btnStart = (Button) findViewById(R.id.start);
        setContentView(R.layout.activity_main);
    }


    public void onClickStartButton(View view) {
        WebClient.c = this;
        startService(new Intent(this, MyService.class));
        new getWeatherTask().execute("");


    }

    public class getWeatherTask extends AsyncTask<String, Void, String[]>
    {

        @Override
        protected String[] doInBackground(String... params) {
            final WebClient webClient = new WebClient();
            return webClient.getWeather("");
        }

        @Override
        protected void onPostExecute(String s[]) {
            Toast.makeText(MainActivity.this,s[0],Toast.LENGTH_LONG).show();

        }
    }
}
