package com.harbour.eats.courier.quest.mapper;

import com.harbour.eats.courier.quest.entities.QuestDetailsVM;
import org.openapitools.model.QuestDetails;
import org.springframework.stereotype.Component;

@Component
public class QuestDetailsMapper {

  public QuestDetailsVM toVM(QuestDetails questDetails) {
    QuestDetailsVM questDetailsVM = new QuestDetailsVM();
    questDetailsVM.setId(questDetails.getId());
    questDetailsVM.setDescription(questDetails.getDescription());
    questDetailsVM.setHoursDration(questDetails.getHoursDration());
    questDetailsVM.setRewardAmount(questDetails.getRewardAmount());
    questDetailsVM.setOrderThreshold(questDetails.getOrderThreshold());
    questDetailsVM.setActiveStatus(questDetails.getActiveStatus());

    return questDetailsVM;
  }

}
