package com.harbour.eats.courier.quest;

import com.harbour.eats.courier.quest.entities.QuestDetails;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class QuestDetailsTest {

    @Test
    public void testGetterAndSetter() {
        int questId = 1;
        String description = "Sample description";
        int hoursDuration = 5;
        int orderThreshold = 10;
        int rewardAmount = 100;
        boolean activeStatus = true;

        QuestDetails questDetails = new QuestDetails();
        questDetails.setQuestId(questId);
        questDetails.setDescription(description);
        questDetails.setHoursDuration(hoursDuration);
        questDetails.setOrderThreshold(orderThreshold);
        questDetails.setRewardAmount(rewardAmount);
        questDetails.setActiveStatus(activeStatus);

        assertEquals(questId, questDetails.getQuestId());
        assertEquals(description, questDetails.getDescription());
        assertEquals(hoursDuration, questDetails.getHoursDuration());
        assertEquals(orderThreshold, questDetails.getOrderThreshold());
        assertEquals(rewardAmount, questDetails.getRewardAmount());
        assertEquals(activeStatus, questDetails.isActiveStatus());
    }
}
