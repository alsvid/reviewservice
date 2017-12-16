package ui.controller;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import domain.db.Reviews;
import domain.model.Review;
@RestController
@RequestMapping("/review")
public class ReviewsController {
	
	private Reviews reviews = Reviews.getInstance();
	
	@RequestMapping("{name}")
	@ResponseBody
	public String getReviewWithName(@PathVariable(value="name") String name) throws JsonProcessingException {
		System.out.println("Getting destination with name " + name);
		ArrayList<Review> out = reviews.getReviewsForDestinationWithName(name);
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		return ow.writeValueAsString(out);
	}
}
