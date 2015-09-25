package com.naveeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
// @RequestMapping("/Icecream")
public class IceCreamController {

	@RequestMapping(value = "/flavor/new/{flavorName}", method = RequestMethod.POST)
	public @ResponseBody
	String createFlavor(@PathVariable("flavorName") String flavor) {

		return "New Flavor created";
	}

	@RequestMapping(value = "/flavor/price/{flavorName}", method = RequestMethod.POST)
	public @ResponseBody
	String setFlavorPrice(@PathVariable("flavorName") String flavor,
			@RequestParam(value = "price") double price) {

		return "Flavor price saved";
	}

	@RequestMapping(value = "/flavor/quantity/{flavorName}", method = RequestMethod.POST)
	public @ResponseBody
	String updateFlavorQuantity(@PathVariable("flavorName") String flavor,
			@RequestParam(value = "quantity") int price) {

		return "Flavor Quantity updated";
	}


	@RequestMapping(value = "/flavor/List", method = RequestMethod.GET)
	public @ResponseBody
	String getAllFlavor(@PathVariable("flavorName") String flavor) {

		return "List all Flavors";
	}

	@RequestMapping(value = "/flavor/placeOrder", method = RequestMethod.POST)
	public @ResponseBody
	String placeOrder(@RequestParam(value = "flavors") String[] flavors,
			@RequestParam(value = "quantities") String[] quantities) {

		return "Order placed";
	}


}
