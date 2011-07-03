package net.zorq.wildlifecensus.service;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import net.zorq.wildlifecensus.entity.Sighting;

@Path("/sightings")
public interface Sightings {

	@GET
	@Produces(APPLICATION_JSON)
	public List<Sighting> getSightings();
	
}
