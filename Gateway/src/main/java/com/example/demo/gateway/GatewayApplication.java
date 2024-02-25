package com.example.demo.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
import java.util.Collections;

@SpringBootApplication
public class GatewayApplication {
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

	@Bean
	public RouteLocator customRouteLocator(
			RouteLocatorBuilder builder,
			@Value("${Grzyb.url}")String Grzyburl,
			@Value("${Question.url}")String Questionurl,
			@Value("${User.url}")String Userurl,
			@Value("${gateway.host}")String host
			){
		return builder
				.routes()
				.route("Grzyb", r -> r
						.host(host)
						.and()
						.path(
								"/api/get",
								"/api/delete/{name}",
								"/api/put",
								"/api/patch/{name}",
								"/api/get/{name}"
								)
						.uri(Grzyburl)
				)
				.route("Question", r -> r
						.host(host)
						.and()
						.path(
								"/api/question/{id}/answers", // ?
								"/api/answers/{id}",
								"/api/answer",
								"/api/answers/{id}",
								"/api/answers/{id}",

								"/api/questions/{id}",
								"/api/questions",
								"/api/questions/{id}",
								"/api/question",
								"/api/questions/{id}"
						)
						.uri(Questionurl)
				)
				.route("user", r -> r
						.host(host)
						.and()
						.path(
								"/login",
								"/register",
								"/hello-world"

						)
						.uri(Userurl)
				)
				.build();
	}
	@Bean
	public CorsWebFilter corsWebFilter() {
		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		final CorsConfiguration corsConfig = new CorsConfiguration();

		corsConfig.setAllowedOrigins(Collections.singletonList("http://localhost:4200")); // or set specific origins
		corsConfig.setAllowCredentials(true); // Uncomment if you need credentials (cookies) to be sent with requests
		corsConfig.setMaxAge(3600L);
		corsConfig.setAllowedMethods(Arrays.asList("GET", "POST", "DELETE", "PUT", "PATCH"));
		corsConfig.addAllowedHeader("*"); // Accepts all headers; adjust based on your needs
		corsConfig.setAllowedHeaders(Arrays.asList(
				HttpHeaders.AUTHORIZATION,
				HttpHeaders.CONTENT_TYPE,
				HttpHeaders.ACCEPT
		));

		source.registerCorsConfiguration("/**", corsConfig);

		return new CorsWebFilter(source);
	}

}
