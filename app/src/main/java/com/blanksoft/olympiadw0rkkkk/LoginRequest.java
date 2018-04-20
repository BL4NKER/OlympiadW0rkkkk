package com.blanksoft.olympiadw0rkkkk;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by DELL on 2018-04-15.
 */

public class LoginRequest extends StringRequest {
     final static private String URL = "http://172.30.1.26:3000/process/login";
     private Map<String,String> parameters;

     public LoginRequest(String userID, String userPassword, Response.Listener<String> listener ) {
          super(Method.POST, URL , listener, null);
          parameters = new HashMap<>();
          parameters.put("id",userID);
          parameters.put("password",userPassword);
     }

     @Override
     public Map<String, String> getParams() {
          return  parameters;
     }
}