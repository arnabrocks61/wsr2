package com.ltimindtree.poc.config;


import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;



@Configuration
@EnableDynamoDBRepositories(basePackages = "com.ltimindtree.poc.repository")
@EnableScan
public class DynamoDBConfig {

	@Value("${spring.data.dynamodb.access-key}")
    private String accessKey;

    @Value("${spring.data.dynamodb.secret-key}")
    private String secretKey;

    @Value("${spring.data.dynamodb.region}")
    private String region;
    
    @Value("${spring.data.dynamodb.endpoint}")
    private String endPoint;
    
    @Bean
    public AmazonDynamoDB amazonDynamoDB() {
        BasicAWSCredentials awsCredentials = new BasicAWSCredentials(accessKey, secretKey);

        return AmazonDynamoDBClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(endPoint, region))
                .build();
    }
}


