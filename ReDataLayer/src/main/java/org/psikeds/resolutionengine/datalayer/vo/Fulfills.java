/*******************************************************************************
 * psiKeds :- ps induced knowledge entity delivery system
 *
 * Copyright (c) 2013, 2014 Karsten Reincke, Marco Juliano, Deutsche Telekom AG
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
import java.util.List;

/**
 * A purpose is fulfilled by one or several variant(s).
 *
 * Optionally a Quantity can be specified, meaning that the purpose
 * is not fullfilled by 1 Variant (default) but by that number of
 * Variants. 
 *
 * Note: PurposeID and VariantID(s) must reference existing Objects!
 *
 * @author marco@juliano.de
 *
 */
public class Fulfills extends ValueObject implements Serializable {

  private static final long serialVersionUID = 1L;

  private static final long MINIMUM_QUANTITY = 1L;
  private static final long DEFAULT_QUANTITY = MINIMUM_QUANTITY;

  private String description;
  private String purposeID;
  private List<String> variantID;
  private long quantity;

  public Fulfills() {
    this(null, null, null);
  }

  public Fulfills(final String description, final String purposeID, final List<String> variantID) {
    this(description, purposeID, variantID, DEFAULT_QUANTITY);
  }

  public Fulfills(final String description, final String purposeID, final List<String> variantID, final long qty) {
    super();
    setDescription(description);
    setPurposeID(purposeID);
    setVariantID(variantID);
    setQuantity(qty);
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(final String value) {
    this.description = value;
  }

  public String getPurposeID() {
    return this.purposeID;
  }

  public void setPurposeID(final String value) {
    this.purposeID = value;
  }

  public List<String> getVariantID() {
    if (this.variantID == null) {
      this.variantID = new ArrayList<String>();
    }
    return this.variantID;
  }

  public boolean addVariantID(final String value) {
    return getVariantID().add(value);
  }

  public void setVariantID(final List<String> lst) {
    this.variantID = lst;
  }

  public long getQuantity() {
    return this.quantity;
  }

  public void setQuantity(final long qty) {
    this.quantity = qty < MINIMUM_QUANTITY ? MINIMUM_QUANTITY : qty;
  }
}