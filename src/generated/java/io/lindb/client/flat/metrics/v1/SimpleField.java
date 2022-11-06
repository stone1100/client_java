// automatically generated by the FlatBuffers compiler, do not modify

package io.lindb.client.flat.metrics.v1;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@javax.annotation.Generated(value="flatc")
@SuppressWarnings("unused")
public final class SimpleField extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_8(); }
  public static SimpleField getRootAsSimpleField(ByteBuffer _bb) { return getRootAsSimpleField(_bb, new SimpleField()); }
  public static SimpleField getRootAsSimpleField(ByteBuffer _bb, SimpleField obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public SimpleField __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public byte type() { int o = __offset(6); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public double value() { int o = __offset(8); return o != 0 ? bb.getDouble(o + bb_pos) : 0.0; }
  public io.lindb.client.flat.metrics.v1.Exemplar exemplars(int j) { return exemplars(new io.lindb.client.flat.metrics.v1.Exemplar(), j); }
  public io.lindb.client.flat.metrics.v1.Exemplar exemplars(io.lindb.client.flat.metrics.v1.Exemplar obj, int j) { int o = __offset(10); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int exemplarsLength() { int o = __offset(10); return o != 0 ? __vector_len(o) : 0; }
  public io.lindb.client.flat.metrics.v1.Exemplar.Vector exemplarsVector() { return exemplarsVector(new io.lindb.client.flat.metrics.v1.Exemplar.Vector()); }
  public io.lindb.client.flat.metrics.v1.Exemplar.Vector exemplarsVector(io.lindb.client.flat.metrics.v1.Exemplar.Vector obj) { int o = __offset(10); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createSimpleField(FlatBufferBuilder builder,
      int nameOffset,
      byte type,
      double value,
      int exemplarsOffset) {
    builder.startTable(4);
    SimpleField.addValue(builder, value);
    SimpleField.addExemplars(builder, exemplarsOffset);
    SimpleField.addName(builder, nameOffset);
    SimpleField.addType(builder, type);
    return SimpleField.endSimpleField(builder);
  }

  public static void startSimpleField(FlatBufferBuilder builder) { builder.startTable(4); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addType(FlatBufferBuilder builder, byte type) { builder.addByte(1, type, 0); }
  public static void addValue(FlatBufferBuilder builder, double value) { builder.addDouble(2, value, 0.0); }
  public static void addExemplars(FlatBufferBuilder builder, int exemplarsOffset) { builder.addOffset(3, exemplarsOffset, 0); }
  public static int createExemplarsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startExemplarsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endSimpleField(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public SimpleField get(int j) { return get(new SimpleField(), j); }
    public SimpleField get(SimpleField obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

