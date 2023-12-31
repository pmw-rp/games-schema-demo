/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.redpanda.games.generated.composite;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class UberGameEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7245661012498252075L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UberGameEvent\",\"namespace\":\"com.redpanda.games.generated.composite\",\"fields\":[{\"name\":\"eventStart\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"GameStart\",\"namespace\":\"com.redpanda.games.generated.common\",\"fields\":[{\"name\":\"event_id\",\"type\":\"int\"},{\"name\":\"timestamp\",\"type\":\"long\",\"logical-type\":\"timestamp-millis\"}]}],\"default\":null},{\"name\":\"update\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"GameUpdate\",\"namespace\":\"com.redpanda.games.generated.specific\",\"fields\":[{\"name\":\"participant_id\",\"type\":\"int\"},{\"name\":\"distance\",\"type\":\"int\"},{\"name\":\"duration\",\"type\":\"double\"}]}],\"default\":null},{\"name\":\"eventStop\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"GameStop\",\"namespace\":\"com.redpanda.games.generated.common\",\"fields\":[{\"name\":\"event_id\",\"type\":\"int\"},{\"name\":\"timestamp\",\"type\":\"long\",\"logical-type\":\"timestamp-millis\"},{\"name\":\"winner\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<UberGameEvent> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<UberGameEvent> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<UberGameEvent> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<UberGameEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<UberGameEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this UberGameEvent to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a UberGameEvent from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a UberGameEvent instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static UberGameEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private com.redpanda.games.generated.common.GameStart eventStart;
  private com.redpanda.games.generated.specific.GameUpdate update;
  private com.redpanda.games.generated.common.GameStop eventStop;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public UberGameEvent() {}

  /**
   * All-args constructor.
   * @param eventStart The new value for eventStart
   * @param update The new value for update
   * @param eventStop The new value for eventStop
   */
  public UberGameEvent(com.redpanda.games.generated.common.GameStart eventStart, com.redpanda.games.generated.specific.GameUpdate update, com.redpanda.games.generated.common.GameStop eventStop) {
    this.eventStart = eventStart;
    this.update = update;
    this.eventStop = eventStop;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return eventStart;
    case 1: return update;
    case 2: return eventStop;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: eventStart = (com.redpanda.games.generated.common.GameStart)value$; break;
    case 1: update = (com.redpanda.games.generated.specific.GameUpdate)value$; break;
    case 2: eventStop = (com.redpanda.games.generated.common.GameStop)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'eventStart' field.
   * @return The value of the 'eventStart' field.
   */
  public com.redpanda.games.generated.common.GameStart getEventStart() {
    return eventStart;
  }


  /**
   * Sets the value of the 'eventStart' field.
   * @param value the value to set.
   */
  public void setEventStart(com.redpanda.games.generated.common.GameStart value) {
    this.eventStart = value;
  }

  /**
   * Gets the value of the 'update' field.
   * @return The value of the 'update' field.
   */
  public com.redpanda.games.generated.specific.GameUpdate getUpdate() {
    return update;
  }


  /**
   * Sets the value of the 'update' field.
   * @param value the value to set.
   */
  public void setUpdate(com.redpanda.games.generated.specific.GameUpdate value) {
    this.update = value;
  }

  /**
   * Gets the value of the 'eventStop' field.
   * @return The value of the 'eventStop' field.
   */
  public com.redpanda.games.generated.common.GameStop getEventStop() {
    return eventStop;
  }


  /**
   * Sets the value of the 'eventStop' field.
   * @param value the value to set.
   */
  public void setEventStop(com.redpanda.games.generated.common.GameStop value) {
    this.eventStop = value;
  }

  /**
   * Creates a new UberGameEvent RecordBuilder.
   * @return A new UberGameEvent RecordBuilder
   */
  public static com.redpanda.games.generated.composite.UberGameEvent.Builder newBuilder() {
    return new com.redpanda.games.generated.composite.UberGameEvent.Builder();
  }

  /**
   * Creates a new UberGameEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new UberGameEvent RecordBuilder
   */
  public static com.redpanda.games.generated.composite.UberGameEvent.Builder newBuilder(com.redpanda.games.generated.composite.UberGameEvent.Builder other) {
    if (other == null) {
      return new com.redpanda.games.generated.composite.UberGameEvent.Builder();
    } else {
      return new com.redpanda.games.generated.composite.UberGameEvent.Builder(other);
    }
  }

  /**
   * Creates a new UberGameEvent RecordBuilder by copying an existing UberGameEvent instance.
   * @param other The existing instance to copy.
   * @return A new UberGameEvent RecordBuilder
   */
  public static com.redpanda.games.generated.composite.UberGameEvent.Builder newBuilder(com.redpanda.games.generated.composite.UberGameEvent other) {
    if (other == null) {
      return new com.redpanda.games.generated.composite.UberGameEvent.Builder();
    } else {
      return new com.redpanda.games.generated.composite.UberGameEvent.Builder(other);
    }
  }

  /**
   * RecordBuilder for UberGameEvent instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<UberGameEvent>
    implements org.apache.avro.data.RecordBuilder<UberGameEvent> {

    private com.redpanda.games.generated.common.GameStart eventStart;
    private com.redpanda.games.generated.common.GameStart.Builder eventStartBuilder;
    private com.redpanda.games.generated.specific.GameUpdate update;
    private com.redpanda.games.generated.specific.GameUpdate.Builder updateBuilder;
    private com.redpanda.games.generated.common.GameStop eventStop;
    private com.redpanda.games.generated.common.GameStop.Builder eventStopBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.redpanda.games.generated.composite.UberGameEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.eventStart)) {
        this.eventStart = data().deepCopy(fields()[0].schema(), other.eventStart);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasEventStartBuilder()) {
        this.eventStartBuilder = com.redpanda.games.generated.common.GameStart.newBuilder(other.getEventStartBuilder());
      }
      if (isValidValue(fields()[1], other.update)) {
        this.update = data().deepCopy(fields()[1].schema(), other.update);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasUpdateBuilder()) {
        this.updateBuilder = com.redpanda.games.generated.specific.GameUpdate.newBuilder(other.getUpdateBuilder());
      }
      if (isValidValue(fields()[2], other.eventStop)) {
        this.eventStop = data().deepCopy(fields()[2].schema(), other.eventStop);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (other.hasEventStopBuilder()) {
        this.eventStopBuilder = com.redpanda.games.generated.common.GameStop.newBuilder(other.getEventStopBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing UberGameEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(com.redpanda.games.generated.composite.UberGameEvent other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.eventStart)) {
        this.eventStart = data().deepCopy(fields()[0].schema(), other.eventStart);
        fieldSetFlags()[0] = true;
      }
      this.eventStartBuilder = null;
      if (isValidValue(fields()[1], other.update)) {
        this.update = data().deepCopy(fields()[1].schema(), other.update);
        fieldSetFlags()[1] = true;
      }
      this.updateBuilder = null;
      if (isValidValue(fields()[2], other.eventStop)) {
        this.eventStop = data().deepCopy(fields()[2].schema(), other.eventStop);
        fieldSetFlags()[2] = true;
      }
      this.eventStopBuilder = null;
    }

    /**
      * Gets the value of the 'eventStart' field.
      * @return The value.
      */
    public com.redpanda.games.generated.common.GameStart getEventStart() {
      return eventStart;
    }


    /**
      * Sets the value of the 'eventStart' field.
      * @param value The value of 'eventStart'.
      * @return This builder.
      */
    public com.redpanda.games.generated.composite.UberGameEvent.Builder setEventStart(com.redpanda.games.generated.common.GameStart value) {
      validate(fields()[0], value);
      this.eventStartBuilder = null;
      this.eventStart = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'eventStart' field has been set.
      * @return True if the 'eventStart' field has been set, false otherwise.
      */
    public boolean hasEventStart() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'eventStart' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.redpanda.games.generated.common.GameStart.Builder getEventStartBuilder() {
      if (eventStartBuilder == null) {
        if (hasEventStart()) {
          setEventStartBuilder(com.redpanda.games.generated.common.GameStart.newBuilder(eventStart));
        } else {
          setEventStartBuilder(com.redpanda.games.generated.common.GameStart.newBuilder());
        }
      }
      return eventStartBuilder;
    }

    /**
     * Sets the Builder instance for the 'eventStart' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public com.redpanda.games.generated.composite.UberGameEvent.Builder setEventStartBuilder(com.redpanda.games.generated.common.GameStart.Builder value) {
      clearEventStart();
      eventStartBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'eventStart' field has an active Builder instance
     * @return True if the 'eventStart' field has an active Builder instance
     */
    public boolean hasEventStartBuilder() {
      return eventStartBuilder != null;
    }

    /**
      * Clears the value of the 'eventStart' field.
      * @return This builder.
      */
    public com.redpanda.games.generated.composite.UberGameEvent.Builder clearEventStart() {
      eventStart = null;
      eventStartBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'update' field.
      * @return The value.
      */
    public com.redpanda.games.generated.specific.GameUpdate getUpdate() {
      return update;
    }


    /**
      * Sets the value of the 'update' field.
      * @param value The value of 'update'.
      * @return This builder.
      */
    public com.redpanda.games.generated.composite.UberGameEvent.Builder setUpdate(com.redpanda.games.generated.specific.GameUpdate value) {
      validate(fields()[1], value);
      this.updateBuilder = null;
      this.update = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'update' field has been set.
      * @return True if the 'update' field has been set, false otherwise.
      */
    public boolean hasUpdate() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'update' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.redpanda.games.generated.specific.GameUpdate.Builder getUpdateBuilder() {
      if (updateBuilder == null) {
        if (hasUpdate()) {
          setUpdateBuilder(com.redpanda.games.generated.specific.GameUpdate.newBuilder(update));
        } else {
          setUpdateBuilder(com.redpanda.games.generated.specific.GameUpdate.newBuilder());
        }
      }
      return updateBuilder;
    }

    /**
     * Sets the Builder instance for the 'update' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public com.redpanda.games.generated.composite.UberGameEvent.Builder setUpdateBuilder(com.redpanda.games.generated.specific.GameUpdate.Builder value) {
      clearUpdate();
      updateBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'update' field has an active Builder instance
     * @return True if the 'update' field has an active Builder instance
     */
    public boolean hasUpdateBuilder() {
      return updateBuilder != null;
    }

    /**
      * Clears the value of the 'update' field.
      * @return This builder.
      */
    public com.redpanda.games.generated.composite.UberGameEvent.Builder clearUpdate() {
      update = null;
      updateBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'eventStop' field.
      * @return The value.
      */
    public com.redpanda.games.generated.common.GameStop getEventStop() {
      return eventStop;
    }


    /**
      * Sets the value of the 'eventStop' field.
      * @param value The value of 'eventStop'.
      * @return This builder.
      */
    public com.redpanda.games.generated.composite.UberGameEvent.Builder setEventStop(com.redpanda.games.generated.common.GameStop value) {
      validate(fields()[2], value);
      this.eventStopBuilder = null;
      this.eventStop = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'eventStop' field has been set.
      * @return True if the 'eventStop' field has been set, false otherwise.
      */
    public boolean hasEventStop() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'eventStop' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.redpanda.games.generated.common.GameStop.Builder getEventStopBuilder() {
      if (eventStopBuilder == null) {
        if (hasEventStop()) {
          setEventStopBuilder(com.redpanda.games.generated.common.GameStop.newBuilder(eventStop));
        } else {
          setEventStopBuilder(com.redpanda.games.generated.common.GameStop.newBuilder());
        }
      }
      return eventStopBuilder;
    }

    /**
     * Sets the Builder instance for the 'eventStop' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public com.redpanda.games.generated.composite.UberGameEvent.Builder setEventStopBuilder(com.redpanda.games.generated.common.GameStop.Builder value) {
      clearEventStop();
      eventStopBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'eventStop' field has an active Builder instance
     * @return True if the 'eventStop' field has an active Builder instance
     */
    public boolean hasEventStopBuilder() {
      return eventStopBuilder != null;
    }

    /**
      * Clears the value of the 'eventStop' field.
      * @return This builder.
      */
    public com.redpanda.games.generated.composite.UberGameEvent.Builder clearEventStop() {
      eventStop = null;
      eventStopBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public UberGameEvent build() {
      try {
        UberGameEvent record = new UberGameEvent();
        if (eventStartBuilder != null) {
          try {
            record.eventStart = this.eventStartBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("eventStart"));
            throw e;
          }
        } else {
          record.eventStart = fieldSetFlags()[0] ? this.eventStart : (com.redpanda.games.generated.common.GameStart) defaultValue(fields()[0]);
        }
        if (updateBuilder != null) {
          try {
            record.update = this.updateBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("update"));
            throw e;
          }
        } else {
          record.update = fieldSetFlags()[1] ? this.update : (com.redpanda.games.generated.specific.GameUpdate) defaultValue(fields()[1]);
        }
        if (eventStopBuilder != null) {
          try {
            record.eventStop = this.eventStopBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("eventStop"));
            throw e;
          }
        } else {
          record.eventStop = fieldSetFlags()[2] ? this.eventStop : (com.redpanda.games.generated.common.GameStop) defaultValue(fields()[2]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<UberGameEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<UberGameEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<UberGameEvent>
    READER$ = (org.apache.avro.io.DatumReader<UberGameEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.eventStart == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.eventStart.customEncode(out);
    }

    if (this.update == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.update.customEncode(out);
    }

    if (this.eventStop == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.eventStop.customEncode(out);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.eventStart = null;
      } else {
        if (this.eventStart == null) {
          this.eventStart = new com.redpanda.games.generated.common.GameStart();
        }
        this.eventStart.customDecode(in);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.update = null;
      } else {
        if (this.update == null) {
          this.update = new com.redpanda.games.generated.specific.GameUpdate();
        }
        this.update.customDecode(in);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.eventStop = null;
      } else {
        if (this.eventStop == null) {
          this.eventStop = new com.redpanda.games.generated.common.GameStop();
        }
        this.eventStop.customDecode(in);
      }

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.eventStart = null;
          } else {
            if (this.eventStart == null) {
              this.eventStart = new com.redpanda.games.generated.common.GameStart();
            }
            this.eventStart.customDecode(in);
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.update = null;
          } else {
            if (this.update == null) {
              this.update = new com.redpanda.games.generated.specific.GameUpdate();
            }
            this.update.customDecode(in);
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.eventStop = null;
          } else {
            if (this.eventStop == null) {
              this.eventStop = new com.redpanda.games.generated.common.GameStop();
            }
            this.eventStop.customDecode(in);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










