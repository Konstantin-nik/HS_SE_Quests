package com.harbour.eats.courier.quest.service.quest.impl;

import com.harbour.eats.courier.quest.entities.Courier;
import com.harbour.eats.courier.quest.mapper.QuestDetailsMapper;
import com.harbour.eats.courier.quest.service.quest.QuestService;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.openapitools.model.QuestDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestServiceImpl implements QuestService {

  private static final ArrayList<Courier> couriers = new ArrayList<>();
  private static Courier currentCourier;
  private static final ArrayList<QuestDetails> activeQuests = new ArrayList<>();

  private static final ArrayList<QuestDetails> allQuests = new ArrayList<>();

  public QuestServiceImpl() {
    //mock data
    initializeMockData();
  }

  @Autowired
  QuestDetailsMapper questDetailsMapper;

  private void initializeMockData() {
    couriers.add(
        new Courier(
            1,
            "Ilya",
            Set.of(1)));
    activeQuests.add(new QuestDetails(
        1,
        "description",
        50,
        7,
        100));
    activeQuests.add(new QuestDetails(
        2,
        "description",
        60,
        7,
        100));
    allQuests.addAll(activeQuests);
    allQuests.add(new QuestDetails(
        3,
        "description",
        60,
        7,
        100));
    currentCourier = couriers.get(0);
  }

  @Override
  public List<QuestDetails> getActiveQuests() {
    return activeQuests;
  }

  @Override
  public List<QuestDetails> getQuestsHistory() {
    return allQuests;
  }

  @Override
  public QuestDetails getQuestsDetails(Integer questId) {
    return allQuests.stream()
        .filter(quest -> Objects.equals(quest.getId(), questId))
        .findFirst().orElse(null);
  }

  @Override
  public String joinQuest(Integer questId) {
    QuestDetails questsDetails = getQuestsDetails(questId);
    if(questsDetails == null) {
      return "No such quest";
    }
    currentCourier.addQuest(questDetailsMapper.toVM(getQuestsDetails(questId)));
    return "Success";
  }
}
