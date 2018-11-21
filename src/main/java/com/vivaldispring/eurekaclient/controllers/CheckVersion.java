package com.vivaldispring.eurekaclient.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class CheckVersion {


    private Map<String, Object> response = new HashMap<>();

    @RequestMapping(value = "/Version", method = RequestMethod.GET, produces = {"application/JSON"} )
    public ResponseEntity<?> checkVersion(){

        response.clear();
        response.put("version", "PostgreSQL 9.6 db model 3.2 date 7 September");
        response.put("status", "ok");
        response.put("data",  "Backend Version 3.0 Release September 2018" );
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
