package com.ibm.IndicadoresBanco.recursos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.IndicadoresBanco.entidades.ExpectativaJson;

@RestController
public class OnboardController {

	public void createOnboard() throws JsonParseException, JsonMappingException, IOException, InterruptedException, ExecutionException {
		HttpClient client = HttpClient.newBuilder().version(Version.HTTP_2).build();
		HttpRequest request = HttpRequest.newBuilder(URI.create(
				"https://olinda.bcb.gov.br/olinda/servico/Expectativas/versao/v1/odata/ExpectativasMercadoTrimestrais?$top=20&$format=json"))
				.header("Content-Type", "application/json").GET().build();
		CompletableFuture<HttpResponse<String>> response = client.sendAsync(request,
				HttpResponse.BodyHandlers.ofString());
		response.thenAccept(res -> System.out.println(res));
		List<ExpectativaJson> expectativas = convertFromJsonToList(response.get().body(),
				new TypeReference<List<ExpectativaJson>>() {
				});
	}

	private <T> List<T> convertFromJsonToList(String json, TypeReference<List<T>> var)
			throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(json, var);
	}

}
