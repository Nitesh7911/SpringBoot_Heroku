package com.demo.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Image {

	/*
	 * { "Image":
	 * "https://s3-ap-southeast-1.amazonaws.com/he-public-data/red-book-hi8d6431a.png"
	 * }
	 */
	@JsonProperty("Image")
	private String Image;

	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}

}
