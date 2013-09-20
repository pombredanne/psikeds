/*******************************************************************************
 * psiKeds :- ps induced knowledge entity delivery system
 *
 * Copyright (c) 2013 Karsten Reincke, Marco Juliano, Deutsche Telekom AG
 *
 * This file is free software: you can redistribute
 * it and/or modify it under the terms of the
 * [x] GNU Affero General Public License
 * [ ] GNU General Public License
 * [ ] GNU Lesser General Public License
 * [ ] Creatice Commons ShareAlike License
 *
 * For details see file LICENSING in the top project directory
 *******************************************************************************/
package org.psikeds.resolutionengine.datalayer.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Meta-Infos regarding the Knowledge-Base.
 *
 * @author marco@juliano.de
 *
 */
public class Meta extends ValueObject implements Serializable {

  private static final long serialVersionUID = 1L;

  private Calendar created;
  private Calendar lastmodified;
  private List<String> creator;
  private List<String> description;

  public Meta() {
    this(null, null, null, null);
  }

  public Meta(final Calendar created, final Calendar lastmodified, final List<String> creator, final List<String> description) {
    super();
    setCreated(created);
    setLastmodified(lastmodified);
    setCreator(creator);
    setDescription(description);
  }

  public Calendar getCreated() {
    return this.created;
  }

  public void setCreated(final Calendar value) {
    this.created = value;
  }

  public Calendar getLastmodified() {
    return this.lastmodified;
  }

  public void setLastmodified(final Calendar value) {
    this.lastmodified = value;
  }

  public List<String> getCreator() {
    if (this.creator == null) {
      this.creator = new ArrayList<String>();
    }
    return this.creator;
  }

  public boolean addCreator(final String value) {
    return getCreator().add(value);
  }

  public void setCreator(final List<String> lst) {
    this.creator = lst;
  }

  public List<String> getDescription() {
    if (this.description == null) {
      this.description = new ArrayList<String>();
    }
    return this.description;
  }

  public boolean addDescription(final String value) {
    return getDescription().add(value);
  }

  public void setDescription(final List<String> lst) {
    this.description = lst;
  }
}