package com.blanksoft.olympiadw0rkkkk;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by DELL on 2018-05-23.
 */

public  class MyProfileRequest extends StringRequest {
    final static private String URL = "http://172.30.1.26:3000/process/login";
    private Map<String,String> parameters;

    public MyProfileRequest (String userEmail, String userName, Response.Listener<String> listener ) {
        super(Method.POST, URL , listener, null);
        parameters = new HashMap<>();
        parameters.put("Email",userEmail);
        parameters.put("Name",userName);
    }

    @Override
    public Map<String, String> getParams() {
        return  parameters;
    }
}