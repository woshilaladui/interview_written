package com.whut.algorithm.proxy;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;
import java.util.*;

/**
 * @author Administrator
 * @version 1.0.0
 * @date 2021/2/22 10:46
 * @desription
 */
public class Test implements CallbackHandler{
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("apple");
     //   javax.security.auth.callback.Callback


    }

    @Override
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {

    }
}