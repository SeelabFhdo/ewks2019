package de.fhdo.ewks.accounting;

class ParkingSpace {
	private String name;
	private String description;
	private Boolean isOpen;
	private Double longitude;
	private Double latitude;

	public ParkingSpace() {
		// NOOP
	}

	public ParkingSpace(String name, String description, Boolean isOpen, Double longitude, Double latitude) {
		setName(name);
		setDescription(description);
		setIsOpen(isOpen);
		setLongitude(longitude);
		setLatitude(latitude);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setIsOpen(Boolean isOpen) {
		this.isOpen = isOpen;
	}

	public Boolean getIsOpen() {
		return isOpen;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("ParkingSpace (");
		sb.append("name = " + name + ", ");
		sb.append("description = " + description + ", ");
		sb.append("isOpen = " + isOpen + ", ");
		sb.append("longitude = " + longitude + ", ");
		sb.append("latitude = " + latitude);
		sb.append(")");
		return sb.toString();
	}
}
