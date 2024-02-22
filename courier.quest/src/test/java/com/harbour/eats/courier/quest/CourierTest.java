package com.harbour.eats.courier.quest;

import com.harbour.eats.courier.quest.entities.Courier;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CourierTest {

    @Test
    public void testGetterAndSetter() {
        Integer id = 1;
        String joinedQuestID = "123";

        Courier courier = new Courier();
        courier.setId(id);
        courier.setJoinedQuestID(joinedQuestID);

        assertEquals(id, courier.getId());
        assertEquals(joinedQuestID, courier.getJoinedQuestID());
    }
}
