package net.zorq.wildlifecensus.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author David Beaumont
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Sighting {

	private String description;
	private double latitude;
	private double longitude;
	
	public String getDescription() {return description;}
	public void setDescription(String description) {this.description = description;}
	
	public double getLatitude() {return latitude;}
	public void setLatitude(double latitude) {this.latitude = latitude;}
	
	public double getLongitude() {return longitude;}
	public void setLongitude(double longitude) {this.longitude = longitude;}
    
}
