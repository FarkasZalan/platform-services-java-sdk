/*
 * (C) Copyright IBM Corp. 2026.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.platform_notifications.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getAcknowledgment options.
 */
public class GetAcknowledgmentOptions extends GenericModel {

  protected String accountId;

  /**
   * Builder.
   */
  public static class Builder {
    private String accountId;

    /**
     * Instantiates a new Builder from an existing GetAcknowledgmentOptions instance.
     *
     * @param getAcknowledgmentOptions the instance to initialize the Builder with
     */
    private Builder(GetAcknowledgmentOptions getAcknowledgmentOptions) {
      this.accountId = getAcknowledgmentOptions.accountId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetAcknowledgmentOptions.
     *
     * @return the new GetAcknowledgmentOptions instance
     */
    public GetAcknowledgmentOptions build() {
      return new GetAcknowledgmentOptions(this);
    }

    /**
     * Set the accountId.
     *
     * @param accountId the accountId
     * @return the GetAcknowledgmentOptions builder
     */
    public Builder accountId(String accountId) {
      this.accountId = accountId;
      return this;
    }
  }

  protected GetAcknowledgmentOptions() { }

  protected GetAcknowledgmentOptions(Builder builder) {
    accountId = builder.accountId;
  }

  /**
   * New builder.
   *
   * @return a GetAcknowledgmentOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the accountId.
   *
   * The account ID to retrieve acknowledgment for.
   *
   * @return the accountId
   */
  public String accountId() {
    return accountId;
  }
}

