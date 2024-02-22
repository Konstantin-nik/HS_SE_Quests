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
@Table(name = "couriers")
@ToString
public class Courier {

  @Id
  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(name = "joined_quest_id", nullable = false)
  private String joinedQuestID;

}
