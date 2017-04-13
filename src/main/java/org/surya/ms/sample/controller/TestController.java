package org.surya.ms.sample.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller for defining a sample micro service.
 * 
 * @author surya jena
 */
@RestController
public class TestController {
	 
	@RequestMapping(value = "/users/{name}", method = RequestMethod.GET)
	public String getHello(final @PathVariable String name) {
		return "Hello "+name+", Welcome to Java world.";
	}
	
	/*@RequestMapping(value = "/users", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public TenantResource createTenant(final @RequestBody @Validated(Insertable.class) User user) {
		return _userService.create(user);
	}*/
	 
}
