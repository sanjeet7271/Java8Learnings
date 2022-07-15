package PredictExample;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Response_Predicats {
	
	Predicate<Response> status=s->s.getStatusCode()==400;
	Predicate<Response> responseType=r->r.getResponseType().equalsIgnoreCase("json");
	
	public Predicate<Response> isStatusCode() {
		return status;
	}
	
	public Predicate<Response> isResponseType() {
		return responseType;
	}
	
	public Predicate<Response> getResponseTypeAndStatusCode() {
		return responseType.and(status);
	}
	
	public Predicate<Response> getResponseTypeORStatusCode() {
		return responseType.or(status);
	}
	
	public Predicate<Response> getNotResponseTypeStatusCode() {
		return responseType.negate().and(status.negate());
	}
	
	public List<Response> getFilterReponse(List<Response> response, Predicate<Response> predicate){
		return response.stream().filter(predicate).collect(Collectors.toList());
	}

}
