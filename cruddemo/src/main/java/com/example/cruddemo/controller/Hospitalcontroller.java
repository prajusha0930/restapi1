package com.example.cruddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cruddemo.model.Hospital;
import com.example.cruddemo.service.Hospitalservice;

@RestController
public class Hospitalcontroller {
	@Autowired
	Hospitalservice hs;
	@GetMapping(value="/id")
	public List<Hospital> all(){
		return hs.all();
	}
	@GetMapping("/id/{id}")
	public Hospital getdetailsById(@PathVariable int id) {
		return hs.getdetailsById(id);
	}
	@DeleteMapping("/id/{id}")
	public String deletedetailsById(@PathVariable int id) {
		    hs.deletedetailsById(id);
		    return "deleted successfully";
	}
	@PostMapping("/save")
	public String postdetailsById(@RequestBody Hospital b) {
		    hs.posttdetailsById(b);
		    return "saved successfully";
	}
	@PutMapping("/put")
	public Hospital putdetailsById(@RequestBody Hospital c) {
		   return hs.putdetailsById(c);
		   
	}
    @GetMapping("/sort/{field}")
    public List<Hospital> sorts(@PathVariable String field)
    {
    	return hs.sorts(field);
    }
    @GetMapping("/paging/{offset}/{pagesize}")
    public List<Hospital>paginghos(@PathVariable int offset,@PathVariable int pagesize)
    {
    	return hs.paginghos(offset,pagesize);
    }
    @GetMapping("/paging/{offset}/{pageSize}/{field}")
    public List<Hospital>Hospital(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field)
    {
    	return hs.pagehos(offset,pageSize,field);
    }
}
