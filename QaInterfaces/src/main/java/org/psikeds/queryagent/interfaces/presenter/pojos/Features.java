/*******************************************************************************
 * psiKeds :- ps induced knowledge entity delivery system
 *
 * Copyright (c) 2013, 2014 Karsten Reincke, Marco Juliano, Deutsche Telekom AG
 *
 * This file is free software: you can redistribute
 * it and/or modify it under the terms of the
 * [ ] GNU Affero General Public License
 * [ ] GNU General Public License
 * [x] GNU Lesser General Public License
 * [ ] Creatice Commons ShareAlike License
 *
 * For details see file LICENSING in the top project directory
 *******************************************************************************/
package org.psikeds.queryagent.interfaces.presenter.pojos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Interface object representing a List of Features or Attributes.
 *
 * Note: Reading from and writing to JSON works out of the box.
 *       However for XML the XmlRootElement annotation is required.
 *
 * @author marco@juliano.de
 *
 */
@XmlRootElement(name = "Features")
public class Features extends POJO implements Serializable {

  private static final long serialVersionUID = 1L;

  private List<Feature> feature;

  public Features() {
    this(null);
  }

  public Features(final List<Feature> lst) {
    super();
    setFeature(lst);
  }

  public List<Feature> getFeature() {
    if (this.feature == null) {
      this.feature = new ArrayList<Feature>();
    }
    return this.feature;
  }

  public boolean addFeature(final Feature value) {
    return getFeature().add(value);
  }

  public void setFeature(final List<Feature> lst) {
    this.feature = lst;
  }
}