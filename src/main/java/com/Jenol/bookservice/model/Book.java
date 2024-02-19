package com.Jenol.bookservice.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "BOOKS_INFO_TABLE")
public class Book {

    // Specifies the attribute to use as the hash key for the DynamoDB table.
    @DynamoDBHashKey(attributeName = "BookId")
    private String bookId;

    // Specifies an attribute of the DynamoDB table.
    @DynamoDBAttribute(attributeName = "BookTitle")
    private String bookTitle;

    // Specifies an attribute of the DynamoDB table.
    @DynamoDBAttribute(attributeName = "BookImageUrl")
    private String bookImageUrl;

    // Specifies an attribute of the DynamoDB table.
    @DynamoDBAttribute(attributeName = "BookPrice")
    private Double bookPrice;

    // Setter method for setting the bookId attribute.
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
}
