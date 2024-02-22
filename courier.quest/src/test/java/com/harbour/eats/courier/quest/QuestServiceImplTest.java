package com.harbour.eats.courier.quest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

import com.harbour.eats.courier.quest.entities.QuestDetails;
import com.harbour.eats.courier.quest.repository.QuestDetailsRepository;
import com.harbour.eats.courier.quest.service.quest.QuestService;
import com.harbour.eats.courier.quest.service.quest.impl.QuestServiceImpl;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class QuestServiceImplTest {

  @Autowired
  @Qualifier(QuestServiceImpl.NAME)
  QuestService questService;

  @MockBean
  QuestDetailsRepository questDetailsRepository;

  @Test
  public void testGetActiveQuests() {
    List<QuestDetails> expected = Collections.singletonList(new QuestDetails());
    when(questDetailsRepository.findByActiveStatusTrue()).thenReturn(expected);

    List<QuestDetails> result = questService.getActiveQuests();

    assertEquals(expected, result);
  }

  @Test
  public void testGetQuestsHistory() {
    List<QuestDetails> expected = Collections.singletonList(new QuestDetails());
    when(questDetailsRepository.findAll()).thenReturn(expected);

    List<QuestDetails> result = questService.getQuestsHistory();

    assertEquals(expected, result);
  }

  @Test
  public void testGetQuestsDetails() {
    QuestDetails expected = new QuestDetails();
    when(questDetailsRepository.findById(1)).thenReturn(Optional.of(expected));

    QuestDetails result = questService.getQuestsDetails(1);

    assertEquals(expected, result);
  }

  @Test
  public void testJoinQuest() {
    QuestDetails questDetails = new QuestDetails();
    when(questDetailsRepository.findById(1)).thenReturn(Optional.of(questDetails));

    String result = questService.joinQuest(1);

    assertNull(result);
  }

}