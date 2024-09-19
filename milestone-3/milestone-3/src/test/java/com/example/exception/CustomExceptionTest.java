package com.example.exception;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomExceptionTest {

    @Test
    void testCustomExceptionMessage() {
        // Arrange
        String errorMessage = "This is a custom exception message";
        
        // Act
        CustomException customException = new CustomException(errorMessage);
        
        // Assert
        Assertions.assertEquals(errorMessage, customException.getMessage());
    }

    @Test
    void testThrowCustomException() {
        // Arrange
        String errorMessage = "This is another custom exception";
        
        // Act & Assert
        Exception exception = Assertions.assertThrows(CustomException.class, () -> {
            throw new CustomException(errorMessage);
        });
        
        // Verify the message is as expected
        Assertions.assertEquals(errorMessage, exception.getMessage());
    }
}