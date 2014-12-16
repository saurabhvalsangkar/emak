package com.emak.jtex.mms.core.service;

import com.emak.jtex.mms.core.Area;
import com.emak.jtex.mms.core.MyDay;
import com.emak.jtex.mms.core.Person;
import com.emak.jtex.mms.core.request.MyDayRequest;
import com.emak.service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Validator;
import javax.ws.rs.core.Response;

/**
 * Created by Ramanath on 12/16/2014.
 */
public class MyDayServiceImpl extends BaseService implements MyDayService {

    private Logger LOG = LoggerFactory.getLogger(MyDayService.class);

    public MyDayServiceImpl(Validator validator) {
        super(validator);
    }

    @Transactional
    public Response saveMyDay(MyDayRequest request) {
        validate(request);

        MyDay myDay = convertMyDayRequest(request);
        LOG.info("MyDay object is" + myDay.toString());
        //print request object
        //TODO Persist the MyDay object in oracle database using existing DAO and service
        return Response.ok().entity("{\"MyDay Request saved successfully !!!\"}").build();
    }

    private MyDay convertMyDayRequest(MyDayRequest myDayRequest) {
        MyDay myDay = new MyDay();

        myDay.setDate(myDayRequest.getDate());
        myDay.setFeedBack(myDayRequest.getFeedBack());

        Person fieldOfficer = new Person();
        fieldOfficer.setId(myDayRequest.getFieldOfficer().getId());
        fieldOfficer.setName(myDayRequest.getFieldOfficer().getName());
        myDay.setFieldOfficer(fieldOfficer);

        Person representative = new Person();
        representative.setId(myDayRequest.getRepresentative().getId());
        representative.setName(myDayRequest.getRepresentative().getName());
        myDay.setRepresentative(representative);

        myDay.setId(myDayRequest.getId());

        myDay.setStatus(myDayRequest.getStatus());

        Area workArea = new Area();

        workArea.setId(myDayRequest.getWorkingArea().getId());
        workArea.setName(myDayRequest.getWorkingArea().getName());

        myDay.setWorkingArea(workArea);

        return myDay;

    }


}
