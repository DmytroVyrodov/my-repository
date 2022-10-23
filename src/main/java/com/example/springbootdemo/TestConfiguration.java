package com.example.springbootdemo;

import org.apache.kafka.clients.producer.Producer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.ProducerFactory;

@Configuration
public class TestConfiguration {

    @Bean
    CommandLineRunner testa() {
        return args -> {
            System.out.println("hello = " + args.length);
        };
    };

//    @Bean
//    CommandLineRunner test = args -> {
//        System.out.println("hello = " + args);
//    };
//
     TestRunner testRunner() {
             return new DefaultTestRunner();
    }


     public void test() {

     }

     public ProducerFactory<String, String> producerFactory() {
         return new DefaultKafkaProducerFactory<>(null);
     }

    public ProducerFactory<String, String> producerFactory = () -> null;
//
//    TestRunner runner = args -> {
//
//    };

//    TestRunner aa = new TestRunner() {
//        @Override
//        public void run(String... args) {
//
//        }
//    };
//
//    TestRunner commandLineRunner2(String a, Object b) {
//        return args -> {
//            System.out.println("args = " + args + a+b);
//        };
//    };



}
