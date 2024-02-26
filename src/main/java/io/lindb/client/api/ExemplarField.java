/**
 * Licensed to LinDB under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. LinDB licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.lindb.client.api;

/**
 * Data point exemplar field.
 */
public final class ExemplarField implements Field {
	private String name;
	private String traceId;
	private String spanId;
	private long duration;

	/**
	 * Create exemplar field instance.
	 * 
	 * @param name     name
	 * @param traceId  trace id
	 * @param spanId   span id
	 * @param duration duration of span
	 */
	public ExemplarField(String name, String traceId, String spanId, long duration) {
		this.name = name;
		this.traceId = traceId;
		this.spanId = spanId;
		this.duration = duration;
	}

	/**
	 * Create exemplar field instance.
	 * 
	 * @param name     name
	 * @param traceId  trace id
	 * @param spanId   span id
	 * @param duration duration of span
	 */
	public void reset(String traceId, String spanId, long duration) {
		this.traceId = traceId;
		this.spanId = spanId;
		this.duration = duration;
	}

	/*
	 * Write exemplar field into {@link RowBuilder}.
	 * 
	 * @see io.lindb.client.api.Field#write(io.lindb.client.api.RowBuilder)
	 */
	@Override
	public int write(RowBuilder builder) {
		return builder.addExemplarField(this.name, this.traceId, this.spanId, this.duration);
	}
}
