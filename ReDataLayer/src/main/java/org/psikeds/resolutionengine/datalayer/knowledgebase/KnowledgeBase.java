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
package org.psikeds.resolutionengine.datalayer.knowledgebase;

import java.util.List;

import org.psikeds.resolutionengine.datalayer.vo.Chocolate;

public interface KnowledgeBase {

  List<Chocolate> getChocolates();

  Chocolate getChocolate(String refid);

  void addChocolate(Chocolate choco);
}
