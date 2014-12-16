package com.emak.jtex.mms.core.service;

import com.emak.jtex.mms.core.request.MyDayRequest;

import javax.ws.rs.core.Response;

public interface MyDayService {

    public Response saveMyDay(MyDayRequest request);

}
