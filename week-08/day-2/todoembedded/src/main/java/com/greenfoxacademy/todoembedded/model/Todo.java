package com.greenfoxacademy.todoembedded.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by peter on 2017.05.09..
 */
@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private String title;

  private boolean isUrgent;

  private boolean isDone;

  public Todo() {

  }

  public Todo(String title) {
    this.title = title;
    isUrgent = false;
    isDone = false;
  }

  @Override
  public String toString() {
    return title;
  }
}
