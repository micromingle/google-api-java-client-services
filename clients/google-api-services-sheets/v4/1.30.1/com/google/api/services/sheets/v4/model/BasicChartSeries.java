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

package com.google.api.services.sheets.v4.model;

/**
 * A single series of data in a chart. For example, if charting stock prices over time, multiple
 * series may exist, one for the "Open Price", "High Price", "Low Price" and "Close Price".
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BasicChartSeries extends com.google.api.client.json.GenericJson {

  /**
   * The color for elements (such as bars, lines, and points) associated with this series.  If
   * empty, a default color is used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Color color;

  /**
   * The color for elements (such as bars, lines, and points) associated with this series.  If
   * empty, a default color is used. If color is also set, this field takes precedence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ColorStyle colorStyle;

  /**
   * The line style of this series. Valid only if the chartType is AREA, LINE, or SCATTER. COMBO
   * charts are also supported if the series chart type is AREA or LINE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LineStyle lineStyle;

  /**
   * The data being visualized in this chart series.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ChartData series;

  /**
   * The minor axis that will specify the range of values for this series. For example, if charting
   * stocks over time, the "Volume" series may want to be pinned to the right with the prices pinned
   * to the left, because the scale of trading volume is different than the scale of prices. It is
   * an error to specify an axis that isn't a valid minor axis for the chart's type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetAxis;

  /**
   * The type of this series. Valid only if the chartType is COMBO. Different types will change the
   * way the series is visualized. Only LINE, AREA, and COLUMN are supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The color for elements (such as bars, lines, and points) associated with this series.  If
   * empty, a default color is used.
   * @return value or {@code null} for none
   */
  public Color getColor() {
    return color;
  }

  /**
   * The color for elements (such as bars, lines, and points) associated with this series.  If
   * empty, a default color is used.
   * @param color color or {@code null} for none
   */
  public BasicChartSeries setColor(Color color) {
    this.color = color;
    return this;
  }

  /**
   * The color for elements (such as bars, lines, and points) associated with this series.  If
   * empty, a default color is used. If color is also set, this field takes precedence.
   * @return value or {@code null} for none
   */
  public ColorStyle getColorStyle() {
    return colorStyle;
  }

  /**
   * The color for elements (such as bars, lines, and points) associated with this series.  If
   * empty, a default color is used. If color is also set, this field takes precedence.
   * @param colorStyle colorStyle or {@code null} for none
   */
  public BasicChartSeries setColorStyle(ColorStyle colorStyle) {
    this.colorStyle = colorStyle;
    return this;
  }

  /**
   * The line style of this series. Valid only if the chartType is AREA, LINE, or SCATTER. COMBO
   * charts are also supported if the series chart type is AREA or LINE.
   * @return value or {@code null} for none
   */
  public LineStyle getLineStyle() {
    return lineStyle;
  }

  /**
   * The line style of this series. Valid only if the chartType is AREA, LINE, or SCATTER. COMBO
   * charts are also supported if the series chart type is AREA or LINE.
   * @param lineStyle lineStyle or {@code null} for none
   */
  public BasicChartSeries setLineStyle(LineStyle lineStyle) {
    this.lineStyle = lineStyle;
    return this;
  }

  /**
   * The data being visualized in this chart series.
   * @return value or {@code null} for none
   */
  public ChartData getSeries() {
    return series;
  }

  /**
   * The data being visualized in this chart series.
   * @param series series or {@code null} for none
   */
  public BasicChartSeries setSeries(ChartData series) {
    this.series = series;
    return this;
  }

  /**
   * The minor axis that will specify the range of values for this series. For example, if charting
   * stocks over time, the "Volume" series may want to be pinned to the right with the prices pinned
   * to the left, because the scale of trading volume is different than the scale of prices. It is
   * an error to specify an axis that isn't a valid minor axis for the chart's type.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetAxis() {
    return targetAxis;
  }

  /**
   * The minor axis that will specify the range of values for this series. For example, if charting
   * stocks over time, the "Volume" series may want to be pinned to the right with the prices pinned
   * to the left, because the scale of trading volume is different than the scale of prices. It is
   * an error to specify an axis that isn't a valid minor axis for the chart's type.
   * @param targetAxis targetAxis or {@code null} for none
   */
  public BasicChartSeries setTargetAxis(java.lang.String targetAxis) {
    this.targetAxis = targetAxis;
    return this;
  }

  /**
   * The type of this series. Valid only if the chartType is COMBO. Different types will change the
   * way the series is visualized. Only LINE, AREA, and COLUMN are supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of this series. Valid only if the chartType is COMBO. Different types will change the
   * way the series is visualized. Only LINE, AREA, and COLUMN are supported.
   * @param type type or {@code null} for none
   */
  public BasicChartSeries setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public BasicChartSeries set(String fieldName, Object value) {
    return (BasicChartSeries) super.set(fieldName, value);
  }

  @Override
  public BasicChartSeries clone() {
    return (BasicChartSeries) super.clone();
  }

}
