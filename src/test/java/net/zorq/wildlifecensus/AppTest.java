package net.zorq.wildlifecensus;

import java.util.List;

import net.zorq.wildlifecensus.entity.Sighting;
import net.zorq.wildlifecensus.service.Sightings;

import org.jboss.resteasy.client.ProxyFactory;
import org.jboss.resteasy.plugins.providers.RegisterBuiltin;
import org.jboss.resteasy.spi.ResteasyProviderFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author David Beaumont
 */
public class AppTest {
	
	private static final String URL_ROOT = "http://wildlifecensus.heroku.com/";

	@Test
	public void getSightings() {
		RegisterBuiltin.register(ResteasyProviderFactory.getInstance());
		Sightings client = ProxyFactory.create(Sightings.class, URL_ROOT);
		List<Sighting> output = client.getSightings();
		Assert.assertFalse(output.isEmpty());
	}
	
}
