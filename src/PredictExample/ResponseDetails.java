package PredictExample;

import java.util.ArrayList;
import java.util.List;

public class ResponseDetails {
	
	public static void main(String[] args) {
		List<Response> response = new ArrayList<>();
		response.add(new Response("Json body1", 200, "XML"));
		response.add(new Response("Json body2", 201, "JSON"));
		response.add(new Response("Json body3", 201, "JSON"));
		response.add(new Response("Json body4", 200, "XML"));
		response.add(new Response("Json body5", 400, "JSON"));
		response.add(new Response("Json body6", 401, "JSON"));
		response.add(new Response("Json body7", 400, "XML"));
		response.add(new Response("Json body8", 201, "JSON"));
		response.add(new Response("Json body9", 400, "XML"));
		response.add(new Response("Json body10", 200, "JSON"));
		response.add(new Response("Json body11", 500, "JSON"));
		response.add(new Response("Json body12", 300, "JSON"));
		response.add(new Response("Json body13", 400, "XML"));

		System.out.println("*********************Status code with 400*******************************");
		Response_Predicats predicate = new Response_Predicats();
		List<Response> statusCode = predicate.getFilterReponse(response, predicate.isStatusCode());
		for (Response status : statusCode) {
			System.out.println(
					status.getResponseBody() + " | " + status.getStatusCode() + " | " + status.getResponseType());
		}

		System.out.println("*********************Body Type JSON*******************************");
		List<Response> responseType = predicate.getFilterReponse(response, predicate.isResponseType());
		for (Response type : responseType) {
			System.out.println(type.getResponseBody() + " | " + type.getStatusCode() + " | " + type.getResponseType());
		}

		System.out.println("*********************Body Type JSON And status code 400*******************************");
		List<Response> responseTypeAndStatusCode = predicate.getFilterReponse(response,
				predicate.getResponseTypeAndStatusCode());
		for (Response type : responseTypeAndStatusCode) {
			System.out.println(type.getResponseBody() + " | " + type.getStatusCode() + " | " + type.getResponseType());
		}

		System.out.println("*********************Body Type JSON OR status code 400*******************************");
		List<Response> responseTypeOrStatusCode = predicate.getFilterReponse(response,
				predicate.getResponseTypeORStatusCode());
		for (Response type : responseTypeOrStatusCode) {
			System.out.println(type.getResponseBody() + " | " + type.getStatusCode() + " | " + type.getResponseType());
		}

		System.out
				.println("*********************Not Body Type JSON and status code 400*******************************");
		List<Response> notResponseTypeStatusCode = predicate.getFilterReponse(response,
				predicate.getNotResponseTypeStatusCode());
		for (Response type : notResponseTypeStatusCode) {
			System.out.println(type.getResponseBody() + " | " + type.getStatusCode() + " | " + type.getResponseType());
		}
	}
}
