package com.alticci.application.alticcisequence.controllers;

import com.alticci.application.alticcisequence.utils.Alticci;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @GetMapping("/alticci/{n}")
    public ResponseEntity<List<Integer>> mapAlticci(@PathVariable(value = "n") int n) {

        List<Integer> result = new ArrayList<>();

        result = Alticci.alticciIterator(n);

        return new ResponseEntity<List<Integer>>(result, HttpStatus.OK);
    }

}
