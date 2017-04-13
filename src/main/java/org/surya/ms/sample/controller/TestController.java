package org.surya.ms.sample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller for defining a sample micro service.
 * 
 * @author surya jena
 */
@RestController
public class TestController {
	 
	@RequestMapping(value = "/tenants", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public String createSome(final @PathVariable String name) {
		return "Hello"+name;
	}
	 
	
	/**
	 * Returns a page of audit events for the specified {@code tenantId} using
	 * the {@code filter} and {@code pageable} information.
	 * 
	 * @param id
	 * @param filter
	 * @param pageable
	 * @return page of matching events
	 */
	/*@RequestMapping(value = "/users/{id}/audit-events", method = RequestMethod.GET)
	public Page<AuditEventResource> getUserAuditEvents(
			final @PathVariable String id,
			final @QuerydslPredicate(root = AuditEvent.class) Predicate filter,
			final @PageableDefault(size = 50, sort = "created", direction = Sort.Direction.DESC) Pageable pageable) {
		return _auditEventService.getAuditEvents(id, filter, pageable)
				.map(e -> _mapper.map(e, AuditEventResource.class));
	}*/
	
}
