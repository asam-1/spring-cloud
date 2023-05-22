package sam.springcloud.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxyApplication.class, args);
	}
	/*@Bean
	RouteLocator gatewayRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
                .route(r -> r.path("/customers/**")
                        .uri("lb://customers-service"))
				.route(r -> r.path("/products/**").
						uri("lb://products-service"))
				.route(r -> r.path("/billing/**").
						uri("lb://billing-service"))
                .build();
	}*/
	@Bean
    public DiscoveryClientRouteDefinitionLocator gatewayRouteLocator(
			ReactiveDiscoveryClient reactiveDiscoveryClient,
			DiscoveryLocatorProperties discoveryLocatorProperties) {
		return new DiscoveryClientRouteDefinitionLocator(reactiveDiscoveryClient,
				discoveryLocatorProperties);
	}
}
