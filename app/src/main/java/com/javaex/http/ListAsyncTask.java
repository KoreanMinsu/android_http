package com.javaex.http;

import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ListAsyncTask extends AsyncTask<String, String, Void> {

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Void doInBackground(String... strings) {

        //서버 연결
        //요청
        try {
            URL url = new URL("http://192.168.0.15:8088/mysite5/api/guestbook/list");  //url 생성

            HttpURLConnection conn = (HttpURLConnection)url.openConnection();  //url 연결
            conn.setConnectTimeout(10000); // 10초 동안 기다린 후 응답이 없으면 종료
            conn.setRequestMethod("POST"); // 요청방식 POST
            conn.setRequestProperty("Content-Type", "application/json"); //요청시 데이터 형식 json
            conn.setRequestProperty("Accept", "application/json"); //응답시 데이터 형식 json
            conn.setDoOutput(true); //OutputStream으로 POST 데이터를 넘겨주겠다는 옵션.
            conn.setDoInput(true); //InputStream으로 서버로 부터 응답을 받겠다는 옵션.

            int resCode = conn.getResponseCode(); // 응답코드 200이 정상

            if(resCode == 200){ //정상이면

                //Stream 을 통해 통신한다
                //데이타 형식은 json으로 한다.

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onProgressUpdate(String... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(Void unused) {
        super.onPostExecute(unused);
    }
}
