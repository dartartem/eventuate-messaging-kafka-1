package io.eventuate.messaging.kafka.micronaut.basic.consumer;

import io.eventuate.messaging.kafka.basic.consumer.EventuateKafkaConsumerConfigurationProperties;
import io.micronaut.context.annotation.Factory;

import javax.inject.Singleton;

@Factory
public class EventuateKafkaConsumerConfigurationPropertiesFactory {
  @Singleton
  public EventuateKafkaConsumerConfigurationProperties eventuateKafkaConsumerConfigurationProperties(EventuateKafkaConsumerMicronautConfigurationProperties eventuateKafkaConsumerMicronautConfigurationProperties) {
    EventuateKafkaConsumerConfigurationProperties eventuateKafkaConsumerConfigurationProperties = new EventuateKafkaConsumerConfigurationProperties(eventuateKafkaConsumerMicronautConfigurationProperties.getProperties());
    eventuateKafkaConsumerConfigurationProperties.setBackPressure(eventuateKafkaConsumerMicronautConfigurationProperties.getBackPressure().toBackPressureConfig());
    eventuateKafkaConsumerConfigurationProperties.setPollTimeout(eventuateKafkaConsumerMicronautConfigurationProperties.getPollTimeout());
    return eventuateKafkaConsumerConfigurationProperties;
  }
}
