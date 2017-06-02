package com.manish.javadev.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.manish.javadev.model.Address;
import com.manish.javadev.model.AddressSuper;

public class HelloWorldController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {

		// 1 Creating a ModelAndView Object
		ModelAndView model = new ModelAndView("helloWorld");

		/*
		 * Map<String, Object> dataMaps = new HashMap<String, Object>();
		 * dataMaps.put("daoName", "RealPropertyDao"); dataMaps.put("branch",
		 * "RP");
		 * 
		 * // Add list object in Model and View model.addObject("dataMaps",
		 * dataMaps); model.addObject("firstName", "Manish");
		 * model.addObject("lastName", "Srivastava");
		 */

		AddressSuper addSuper = new AddressSuper();

		Address address = new Address("BLR", "BTM");
		addSuper.setAddress(address);
		model.addObject("AddSuper", addSuper);
		model.addObject("firstName", "Manish");
		model.addObject("lastName", "Srivastava");
		return model;

	}

}