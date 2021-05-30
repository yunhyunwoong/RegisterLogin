package com.example.registerlogin;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {

    //서버 URL 설정(php 파일 연동)
    final static private String URL = "http://dbsgusdnd98.dothome.co.kr/Register.php";
    private Map<String, String>map;


    public RegisterRequest(String userID, String userPassword, String userName, String userEmail, Response.Listener<String> Listener){
        super(Method.POST, URL, Listener, null);

        map = new HashMap<>();
        map.put("userID", userID);
        map.put("userPassword", userPassword);
        map.put("userName", userName);
        map.put("userEmail", userEmail);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
