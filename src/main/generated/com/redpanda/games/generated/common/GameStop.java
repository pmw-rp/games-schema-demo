/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.redpanda.games.generated.common;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class GameStop extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6690997385253796759L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GameStop\",\"namespace\":\"com.redpanda.games.generated.common\",\"fields\":[{\"name\":\"event_id\",\"type\":\"int\"},{\"name\":\"timestamp\",\"type\":\"long\",\"logical-type\":\"timestamp-millis\"},{\"name\":\"winner\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<GameStop> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<GameStop> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<GameStop> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<GameStop> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<GameStop> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this GameStop to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a GameStop from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a GameStop instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static GameStop fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private int event_id;
  private long timestamp;
  private java.lang.String winner;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public GameStop() {}

  /**
   * All-args constructor.
   * @param event_id The new value for event_id
   * @param timestamp The new value for timestamp
   * @param winner The new value for winner
   */
  public GameStop(java.lang.Integer event_id, java.lang.Long timestamp, java.lang.String winner) {
    this.event_id = event_id;
    this.timestamp = timestamp;
    this.winner = winner;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return event_id;
    case 1: return timestamp;
    case 2: return winner;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: event_id = (java.lang.Integer)value$; break;
    case 1: timestamp = (java.lang.Long)value$; break;
    case 2: winner = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'event_id' field.
   * @return The value of the 'event_id' field.
   */
  public int getEventId() {
    return event_id;
  }


  /**
   * Sets the value of the 'event_id' field.
   * @param value the value to set.
   */
  public void setEventId(int value) {
    this.event_id = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public long getTimestamp() {
    return timestamp;
  }


  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(long value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'winner' field.
   * @return The value of the 'winner' field.
   */
  public java.lang.String getWinner() {
    return winner;
  }


  /**
   * Sets the value of the 'winner' field.
   * @param value the value to set.
   */
  public void setWinner(java.lang.String value) {
    this.winner = value;
  }

  /**
   * Creates a new GameStop RecordBuilder.
   * @return A new GameStop RecordBuilder
   */
  public static com.redpanda.games.generated.common.GameStop.Builder newBuilder() {
    return new com.redpanda.games.generated.common.GameStop.Builder();
  }

  /**
   * Creates a new GameStop RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new GameStop RecordBuilder
   */
  public static com.redpanda.games.generated.common.GameStop.Builder newBuilder(com.redpanda.games.generated.common.GameStop.Builder other) {
    if (other == null) {
      return new com.redpanda.games.generated.common.GameStop.Builder();
    } else {
      return new com.redpanda.games.generated.common.GameStop.Builder(other);
    }
  }

  /**
   * Creates a new GameStop RecordBuilder by copying an existing GameStop instance.
   * @param other The existing instance to copy.
   * @return A new GameStop RecordBuilder
   */
  public static com.redpanda.games.generated.common.GameStop.Builder newBuilder(com.redpanda.games.generated.common.GameStop other) {
    if (other == null) {
      return new com.redpanda.games.generated.common.GameStop.Builder();
    } else {
      return new com.redpanda.games.generated.common.GameStop.Builder(other);
    }
  }

  /**
   * RecordBuilder for GameStop instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GameStop>
    implements org.apache.avro.data.RecordBuilder<GameStop> {

    private int event_id;
    private long timestamp;
    private java.lang.String winner;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.redpanda.games.generated.common.GameStop.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.event_id)) {
        this.event_id = data().deepCopy(fields()[0].schema(), other.event_id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[1].schema(), other.timestamp);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.winner)) {
        this.winner = data().deepCopy(fields()[2].schema(), other.winner);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing GameStop instance
     * @param other The existing instance to copy.
     */
    private Builder(com.redpanda.games.generated.common.GameStop other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.event_id)) {
        this.event_id = data().deepCopy(fields()[0].schema(), other.event_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[1].schema(), other.timestamp);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.winner)) {
        this.winner = data().deepCopy(fields()[2].schema(), other.winner);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'event_id' field.
      * @return The value.
      */
    public int getEventId() {
      return event_id;
    }


    /**
      * Sets the value of the 'event_id' field.
      * @param value The value of 'event_id'.
      * @return This builder.
      */
    public com.redpanda.games.generated.common.GameStop.Builder setEventId(int value) {
      validate(fields()[0], value);
      this.event_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'event_id' field has been set.
      * @return True if the 'event_id' field has been set, false otherwise.
      */
    public boolean hasEventId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'event_id' field.
      * @return This builder.
      */
    public com.redpanda.games.generated.common.GameStop.Builder clearEventId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public long getTimestamp() {
      return timestamp;
    }


    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public com.redpanda.games.generated.common.GameStop.Builder setTimestamp(long value) {
      validate(fields()[1], value);
      this.timestamp = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public com.redpanda.games.generated.common.GameStop.Builder clearTimestamp() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'winner' field.
      * @return The value.
      */
    public java.lang.String getWinner() {
      return winner;
    }


    /**
      * Sets the value of the 'winner' field.
      * @param value The value of 'winner'.
      * @return This builder.
      */
    public com.redpanda.games.generated.common.GameStop.Builder setWinner(java.lang.String value) {
      validate(fields()[2], value);
      this.winner = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'winner' field has been set.
      * @return True if the 'winner' field has been set, false otherwise.
      */
    public boolean hasWinner() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'winner' field.
      * @return This builder.
      */
    public com.redpanda.games.generated.common.GameStop.Builder clearWinner() {
      winner = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public GameStop build() {
      try {
        GameStop record = new GameStop();
        record.event_id = fieldSetFlags()[0] ? this.event_id : (java.lang.Integer) defaultValue(fields()[0]);
        record.timestamp = fieldSetFlags()[1] ? this.timestamp : (java.lang.Long) defaultValue(fields()[1]);
        record.winner = fieldSetFlags()[2] ? this.winner : (java.lang.String) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<GameStop>
    WRITER$ = (org.apache.avro.io.DatumWriter<GameStop>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<GameStop>
    READER$ = (org.apache.avro.io.DatumReader<GameStop>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.event_id);

    out.writeLong(this.timestamp);

    out.writeString(this.winner);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.event_id = in.readInt();

      this.timestamp = in.readLong();

      this.winner = in.readString();

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.event_id = in.readInt();
          break;

        case 1:
          this.timestamp = in.readLong();
          break;

        case 2:
          this.winner = in.readString();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









