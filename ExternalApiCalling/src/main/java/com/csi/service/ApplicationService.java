package com.csi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApplicationService {

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private  ApplicationClient applicationClient;

    @Autowired
    private ApplicationGoHere applicationGoHere;

    //String info="https://jsonmock.hackerrank.com/api/countries?name=India";
    public String countryInfo(){

       // return restTemplate.getForObject(info,String.class);

        return applicationClient.countryInfo();

    }

    public String goHere() {

        return applicationGoHere.goHere();
    }
}
