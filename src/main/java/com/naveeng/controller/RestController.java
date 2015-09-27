package com.naveeng.controller;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.naveeng.model.IceCream;
import com.naveeng.model.Status;
import com.naveeng.services.DataServices;

@Controller
@RequestMapping("/icecream")
public class RestController {

	@Autowired
	DataServices dataServices;

	static final Logger logger = Logger.getLogger(RestController.class);

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody
	List<IceCream> getIcecream() {

		List<IceCream> icecreamList = null;
		try {
			icecreamList = dataServices.getEntityList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return icecreamList;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody
	IceCream getIcecream(@PathVariable("id") long id) {
		IceCream icecream = null;
		try {
			icecream = dataServices.getEntityById(id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return icecream;
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public @ResponseBody
	Status updateIcecream(@RequestParam(value = "id", required = true) long id,
			@RequestParam(value = "quantity", required = true) int quantity) {
		try {
			dataServices.updateEntity(id, quantity);
			return new Status(1, "Successfully updated Quantity to " + quantity);
		} catch (Exception e) {
			e.printStackTrace();
			return new Status(0, e.toString());
		}
	}
}
