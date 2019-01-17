/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.dataflow.model;

/**
 * A structured message reporting an autoscaling decision made by the Dataflow service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AutoscalingEvent extends com.google.api.client.json.GenericJson {

  /**
   * The current number of workers the job has.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long currentNumWorkers;

  /**
   * A message describing why the system decided to adjust the current number of workers, why it
   * failed, or why the system decided to not make any changes to the number of workers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StructuredMessage description;

  /**
   * The type of autoscaling event to report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventType;

  /**
   * The target number of workers the worker pool wants to resize to use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long targetNumWorkers;

  /**
   * The time this event was emitted to indicate a new target or current num_workers value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String time;

  /**
   * A short and friendly name for the worker pool this event refers to, populated from the value of
   * PoolStageRelation::user_pool_name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String workerPool;

  /**
   * The current number of workers the job has.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCurrentNumWorkers() {
    return currentNumWorkers;
  }

  /**
   * The current number of workers the job has.
   * @param currentNumWorkers currentNumWorkers or {@code null} for none
   */
  public AutoscalingEvent setCurrentNumWorkers(java.lang.Long currentNumWorkers) {
    this.currentNumWorkers = currentNumWorkers;
    return this;
  }

  /**
   * A message describing why the system decided to adjust the current number of workers, why it
   * failed, or why the system decided to not make any changes to the number of workers.
   * @return value or {@code null} for none
   */
  public StructuredMessage getDescription() {
    return description;
  }

  /**
   * A message describing why the system decided to adjust the current number of workers, why it
   * failed, or why the system decided to not make any changes to the number of workers.
   * @param description description or {@code null} for none
   */
  public AutoscalingEvent setDescription(StructuredMessage description) {
    this.description = description;
    return this;
  }

  /**
   * The type of autoscaling event to report.
   * @return value or {@code null} for none
   */
  public java.lang.String getEventType() {
    return eventType;
  }

  /**
   * The type of autoscaling event to report.
   * @param eventType eventType or {@code null} for none
   */
  public AutoscalingEvent setEventType(java.lang.String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * The target number of workers the worker pool wants to resize to use.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTargetNumWorkers() {
    return targetNumWorkers;
  }

  /**
   * The target number of workers the worker pool wants to resize to use.
   * @param targetNumWorkers targetNumWorkers or {@code null} for none
   */
  public AutoscalingEvent setTargetNumWorkers(java.lang.Long targetNumWorkers) {
    this.targetNumWorkers = targetNumWorkers;
    return this;
  }

  /**
   * The time this event was emitted to indicate a new target or current num_workers value.
   * @return value or {@code null} for none
   */
  public String getTime() {
    return time;
  }

  /**
   * The time this event was emitted to indicate a new target or current num_workers value.
   * @param time time or {@code null} for none
   */
  public AutoscalingEvent setTime(String time) {
    this.time = time;
    return this;
  }

  /**
   * A short and friendly name for the worker pool this event refers to, populated from the value of
   * PoolStageRelation::user_pool_name.
   * @return value or {@code null} for none
   */
  public java.lang.String getWorkerPool() {
    return workerPool;
  }

  /**
   * A short and friendly name for the worker pool this event refers to, populated from the value of
   * PoolStageRelation::user_pool_name.
   * @param workerPool workerPool or {@code null} for none
   */
  public AutoscalingEvent setWorkerPool(java.lang.String workerPool) {
    this.workerPool = workerPool;
    return this;
  }

  @Override
  public AutoscalingEvent set(String fieldName, Object value) {
    return (AutoscalingEvent) super.set(fieldName, value);
  }

  @Override
  public AutoscalingEvent clone() {
    return (AutoscalingEvent) super.clone();
  }

}