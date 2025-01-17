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
 * Data point simple field.
 */
public final class SimpleField implements Field {

	private final String name;
	private final FieldType type;
	private final double value;

	/**
	 * Create simple field instance.
	 * 
	 * @param name  field name
	 * @param type  field type
	 * @param value field value
	 */
	protected SimpleField(String name, FieldType type, double value) {
		this.name = name;
		this.type = type;
		this.value = value;
	}

	/*
	 * Write simple field into {@link RowBuilder}.
	 * 
	 * @see io.lindb.client.api.Field#write(io.lindb.client.api.RowBuilder)
	 */
	@Override
	public int write(RowBuilder builder) {
		return builder.addSimpleField(this.name, this.type, this.value);
	}
}
