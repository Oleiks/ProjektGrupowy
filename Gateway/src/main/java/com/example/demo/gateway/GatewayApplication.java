package com.example.demo.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Value;
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
								"/api/question/{id}/answers",
								"/api/answer",
								"/api/answers/{id}",

								"/api/questions/{id}",
								"/api/questions",
								"/api/question",
								"/api/quiz"
						)
						.uri(Questionurl)
				)
				.build();
	}
	@Bean
	public CorsWebFilter corsWebFilter() {

		final CorsConfiguration corsConfig = new CorsConfiguration();
		corsConfig.setAllowedOrigins(Collections.singletonList("*"));
		corsConfig.setMaxAge(3600L);
		corsConfig.setAllowedMethods(Arrays.asList("GET", "POST", "DELETE", "PUT", "PATCH"));
		corsConfig.addAllowedHeader("*");

		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", corsConfig);

		return new CorsWebFilter(source);
	}

}
