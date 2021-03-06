package com.trainging.pms;

import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import com.trainging.pms.model.Reviews;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;

public class ReviewControllerTest extends AbstractTest{

	private String uri="/reviews";
	private int reviewId=9999;
	@BeforeEach
	protected void setUp() {
		super.setUp();
	}
	
	//Test save functionality
	
	@Test
	@Order(1)
	void testSave() throws Exception{
		//Creating an object for saving
		Reviews reviews = new Reviews(reviewId, "You are selling an awesome product", 5);
		//Transforming into JSON
		String reviewsJSON = super.mapToJson(reviews);
//		Calling the rest API
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri).contentType(MediaType.APPLICATION_JSON_VALUE).content(reviewsJSON)).andReturn();
		
		int statusCode = mvcResult.getResponse().getStatus();
		String message = mvcResult.getResponse().getContentAsString();
		
		assertEquals(201, statusCode);
		assertEquals("Reviews saved sucessfully", message);
	}
	
	@Test
	@Order(4)
	void testUpdate() throws Exception {
		// creating an object for saving
		Reviews reviews = new Reviews(reviewId, "You are selling awesome product", 5);
		// transforming java object into json
		String reviewsJSON = super.mapToJson(reviews);

		// calling the rest API
		MvcResult mvcResult = mvc.perform(
				MockMvcRequestBuilders.post(uri).contentType(MediaType.APPLICATION_JSON_VALUE).content(reviewsJSON))
				.andReturn();

		int statusCode = mvcResult.getResponse().getStatus();
		String message = mvcResult.getResponse().getContentAsString();

		assertEquals(201, statusCode);
		assertEquals("Reviews saved sucessfully", message);
	}
	
	
	@Test
	@Order(3)
	void testGet() throws Exception{
		//Creating an object for saving
		Reviews expectedReviews = new Reviews(12313, "You are selling an awesome product", 5);
		//Transforming into JSON
		
//		Calling the rest API
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri+"/"+expectedReviews.getReviewId()).contentType(MediaType.APPLICATION_JSON_VALUE)).andReturn();
		
		int statusCode = mvcResult.getResponse().getStatus();
		String message = mvcResult.getResponse().getContentAsString();
		Reviews actualReviews = super.mapFromJson(message, Reviews.class);
		
		assertEquals(200, statusCode);
		assertEquals(actualReviews, expectedReviews);
	}
	
	@Test
	@Order(2)
	void testDelete() throws Exception{
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri + "/" + reviewId).contentType(MediaType.APPLICATION_JSON_VALUE)).andReturn();
		int statusCode = mvcResult.getResponse().getStatus();
		String message = mvcResult.getResponse().getContentAsString();
		
		assertEquals(200, statusCode);
		assertEquals("Reviews deleted sucessfully", message);
	}
	
	// test get all functionality
		@Test
		@Order(5)
		
		void testGetAll() throws Exception {

			MvcResult mvcResult = mvc
					.perform(MockMvcRequestBuilders.get(uri).contentType(MediaType.APPLICATION_JSON_VALUE))
					.andReturn();

			int statusCode = mvcResult.getResponse().getStatus();
			String message = mvcResult.getResponse().getContentAsString();
			Reviews[] actualreview = super.mapFromJson(message, Reviews[].class);

			assertEquals(200, statusCode);
			assertTrue(actualreview.length > 0);

		}

}