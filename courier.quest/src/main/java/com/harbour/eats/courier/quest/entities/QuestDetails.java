package com.harbour.eats.courier.quest.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name = "quest_details")
@ToString
public class QuestDetails {

  @Id
  @Column(name = "id", nullable = false)
  private int questId;

  @Column(name = "description")
  private String description;

  @Column(name = "hours_duration", nullable = false)
  private int hoursDuration;

  @Column(name = "order_threshold", nullable = false)
  private int orderThreshold;

  @Column(name = "reward_amount")
  private int rewardAmount;

  @Column(name = "active_status")
  private boolean activeStatus;

}
