package com.guru.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.guru.courses.CourseDetails;
import com.guru.courses.GetCourseDetailsRequest;
import com.guru.courses.GetCourseDetailsResponse;

@Endpoint
public class CourseDetailsEndpoint {
	//GetCourseDetailsRequest
	//GetCourseDetailsResponse
	
	@PayloadRoot(namespace = "http://guru.com/courses",localPart = "GetCourseDetailsRequest")
	@ResponsePayload
	public GetCourseDetailsResponse processGetCourseDetailsRequest(@RequestPayload GetCourseDetailsRequest req) {
		GetCourseDetailsResponse resp = new GetCourseDetailsResponse();
		CourseDetails courseDetails = new CourseDetails();
		courseDetails.setId(req.getId());
		courseDetails.setDescription("TESTING SOAP");
		courseDetails.setName("GURU TEJA REDDY");
		resp.setCourseDetails(courseDetails);
		return resp;
	}
}
