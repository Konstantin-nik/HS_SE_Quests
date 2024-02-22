package com.harbour.eats.courier.quest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.harbour.eats.courier.quest.constants.ErrorMessages;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ErrorMessagesTest {

    @Test
    public void testGetMessageByCode_WhenCodeExists() {
        String code = "1";
        String expectedMessage = "Such quest does not exist";

        String result = ErrorMessages.getMessageByCode(code);

        assertEquals(expectedMessage, result);
    }

    @Test
    public void testGetMessageByCode_WhenCodeDoesNotExist() {
        String code = "999"; // Non-existent code
        String expectedMessage = ""; // Assuming EMPTY_STRING is defined somewhere

        String result = ErrorMessages.getMessageByCode(code);

        assertEquals(expectedMessage, result);
    }
}