package com.trainging.pms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trainging.pms.model.Reviews;
import com.trainging.pms.repositories.ReviewsRepository;

@RestController
@RequestMapping("reviews")
@CrossOrigin(origins = "http://localhost:4200")
public class ReviewsController {

	@Autowired
	ReviewsRepository reviewsRepo;
	
	@GetMapping
	public ResponseEntity<List<Reviews>> getReviews(){
		List<Reviews> allReviews = (List<Reviews>)reviewsRepo.findAll();
		return new ResponseEntity<List<Reviews>>(allReviews, HttpStatus.OK);
	}
	
	@GetMapping("/{reviewId}")
	public ResponseEntity<Reviews> getReview(@PathVariable("reviewId")int reviewId){
		Optional<Reviews> reviews = reviewsRepo.findById(reviewId);
		return new ResponseEntity<Reviews>(reviews.get(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<String> saveReview(@RequestBody Reviews reviews) {
		reviewsRepo.save(reviews);
		return new ResponseEntity<String>("Reviews saved sucessfully", HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<String> updateReview(@RequestBody Reviews reviews) {
		reviewsRepo.save(reviews);
		return new ResponseEntity<String>("Reviews updated sucessfully", HttpStatus.OK);
	}
	
	@DeleteMapping("/{reviewId}")
	public ResponseEntity<String> deleteReview(@PathVariable("reviewId")int reviewId) {
		reviewsRepo.deleteById(reviewId);
		return new ResponseEntity<String>("Reviews deleted sucessfully", HttpStatus.OK);
	}
	
}
