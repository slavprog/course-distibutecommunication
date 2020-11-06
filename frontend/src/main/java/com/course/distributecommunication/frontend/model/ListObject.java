package com.course.distributecommunication.frontend.model;

import java.io.Serializable;
import java.util.List;

public class ListObject<T> implements Serializable {

  private List<T> dtoModels;

  public ListObject(List<T> dtoModels) {
    this.dtoModels = dtoModels;
  }

  public List<T> getDtoModels() {
    return dtoModels;
  }
}
