package com.harbour.eats.courier.quest;

import static com.harbour.eats.courier.quest.constants.ErrorMessages.QUEST_DOES_NOT_EXIST;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.harbour.eats.courier.quest.entities.QuestDetails;
import com.harbour.eats.courier.quest.rest.QuestController;
import com.harbour.eats.courier.quest.service.quest.impl.QuestServiceImpl;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;

@SpringBootTest
public class QuestControllerTest {

  @Autowired
  QuestController questController;

  @MockBean
  QuestServiceImpl questService;

  @Test
  public void testQuestsActiveGet() {
    List<QuestDetails> expected = Collections.singletonList(new QuestDetails());
    when(questService.getActiveQuests()).thenReturn(expected);

    ResponseEntity<String> result = questController.questsActiveGet();

    assertEquals(ResponseEntity.ok(expected.toString()), result);
  }

  @Test
  public void testQuestsHistoryGet() {
    List<QuestDetails> expected = Collections.singletonList(new QuestDetails());
    when(questService.getQuestsHistory()).thenReturn(expected);

    ResponseEntity<String> result = questController.questsHistoryGet();

    assertEquals(ResponseEntity.ok(expected.toString()), result);
  }

  @Test
  public void testQuestsQuestIdDetailsGet_WhenQuestExists() {
    int questId = 1;
    QuestDetails expected = new QuestDetails();
    when(questService.getQuestsDetails(questId)).thenReturn(expected);

    ResponseEntity<String> result = questController.questsQuestIdDetailsGet(questId);

    assertEquals(ResponseEntity.ok(expected.toString()), result);
  }

  @Test
  public void testQuestsQuestIdDetailsGet_WhenQuestDoesNotExist() {
    int questId = 1;
    when(questService.getQuestsDetails(questId)).thenReturn(null);

    ResponseEntity<String> result = questController.questsQuestIdDetailsGet(questId);

    assertEquals(QUEST_DOES_NOT_EXIST.getMessage(), result.getBody());
  }
}
