package com.optimagrowth.license.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Slf4j
@Configuration
@Component
@RefreshScope
public class CircuitBreakerAutoConfiguration {
//
//    @Bean
//    public CircuitBreakerRegistry defaultGenesisCircuitBreaker(
//            @Value("${bootstrap.resilience4j.circuitbreaker."
//                    + "ringBufferSizeInClosedState:30}")
//            int ringBufferSizeInClosedState,
//            @Value("${application.circuit-breaker.genesis.default."
//                    + "ringBufferSizeInHalfOpenState:10}")
//            int ringBufferSizeInHalfOpenState,
//            @Value("${application.circuit-breaker.genesis.default."
//                    + "failureRateThreshold:50}")
//            long failureRateThreshold,
//            @Value("${application.circuit-breaker.genesis.default."
//                    + "waitDurationInOpenState:10000}")
//            long waitDurationInOpenState) {
//        log.info("Configuring custom Genesis Circuit Breaker genesis.default");
//        return CircuitBreakerRegistry.of(circuitBreakerConfig());
//    }
//
//    @Bean
//    public CircuitBreakerConfig circuitBreakerConfig() {
//        log.info("circuitBreakerConfig");
//        return CircuitBreakerConfig.custom()
//                .minimumNumberOfCalls(2)
//                .failureRateThreshold(50)
//                .waitDurationInOpenState(Duration.ofMillis(1000))
//                .permittedNumberOfCallsInHalfOpenState(2)
//                .slidingWindowSize(2)
//                .build();
//    }
//
//    @Bean
//    public CircuitBreaker defaultCircuitBreaker() {
//        CircuitBreakerConfig config = CircuitBreakerConfig.custom()
//                .minimumNumberOfCalls(2)
//                .build();
//        return CircuitBreaker.of("default", config);
//    }
}