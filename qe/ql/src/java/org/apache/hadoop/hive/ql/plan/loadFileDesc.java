/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.hive.ql.plan;

import java.io.Serializable;

import org.apache.hadoop.hive.ql.plan.loadDesc;

public class loadFileDesc extends loadDesc implements Serializable {
  private static final long serialVersionUID = 1L;
  private String targetDir;
  private boolean isDfsDir;
  private String columns;
  private String columnTypes;

  public loadFileDesc() {
  }

  public loadFileDesc(final String sourceDir, final String targetDir,
      final boolean isDfsDir, final String columns, final String columnTypes) {

    super(sourceDir);
    this.targetDir = targetDir;
    this.isDfsDir = isDfsDir;
    this.columns = columns;
    this.columnTypes = columnTypes;
  }

  @explain(displayName = "destination")
  public String getTargetDir() {
    return this.targetDir;
  }

  public void setTargetDir(final String targetDir) {
    this.targetDir = targetDir;
  }

  @explain(displayName = "hdfs directory")
  public boolean getIsDfsDir() {
    return this.isDfsDir;
  }

  public void setIsDfsDir(final boolean isDfsDir) {
    this.isDfsDir = isDfsDir;
  }

  public String getColumns() {
    return columns;
  }

  public void setColumns(String columns) {
    this.columns = columns;
  }

  public String getColumnTypes() {
    return columnTypes;
  }

  public void setColumnTypes(String columnTypes) {
    this.columnTypes = columnTypes;
  }
}
