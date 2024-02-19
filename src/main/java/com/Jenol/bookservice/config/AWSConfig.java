package com.Jenol.bookservice.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AWSConfig {

    // This method defines a bean for providing AWS credentials.
    @Bean
    AWSCredentialsProvider getAwsCredentialsProvider(){
        // Return an instance of DefaultAWSCredentialsProviderChain,
        // which automatically looks for AWS credentials in a variety of places,
        // such as environment variables, system properties, and credential profiles.
        return DefaultAWSCredentialsProviderChain.getInstance();
    }
}
