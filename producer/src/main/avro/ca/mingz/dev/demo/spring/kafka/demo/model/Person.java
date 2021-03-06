/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package ca.mingz.dev.demo.spring.kafka.demo.model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Person extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4172308591613856705L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Person\",\"namespace\":\"ca.mingz.dev.demo.spring.kafka.model\",\"fields\":[{\"name\":\"full_name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Full name of person\"}],\"version\":\"1\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Full name of person */
  @Deprecated public java.lang.String full_name;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Person() {}

  /**
   * All-args constructor.
   * @param full_name Full name of person
   */
  public Person(java.lang.String full_name) {
    this.full_name = full_name;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return full_name;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: full_name = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'full_name' field.
   * @return Full name of person
   */
  public java.lang.String getFullName() {
    return full_name;
  }

  /**
   * Sets the value of the 'full_name' field.
   * Full name of person
   * @param value the value to set.
   */
  public void setFullName(java.lang.String value) {
    this.full_name = value;
  }

  /**
   * Creates a new Person RecordBuilder.
   * @return A new Person RecordBuilder
   */
  public static Person.Builder newBuilder() {
    return new Person.Builder();
  }

  /**
   * Creates a new Person RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Person RecordBuilder
   */
  public static Person.Builder newBuilder(Person.Builder other) {
    return new Person.Builder(other);
  }

  /**
   * Creates a new Person RecordBuilder by copying an existing Person instance.
   * @param other The existing instance to copy.
   * @return A new Person RecordBuilder
   */
  public static Person.Builder newBuilder(Person other) {
    return new Person.Builder(other);
  }

  /**
   * RecordBuilder for Person instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Person>
    implements org.apache.avro.data.RecordBuilder<Person> {

    /** Full name of person */
    private java.lang.String full_name;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Person.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.full_name)) {
        this.full_name = data().deepCopy(fields()[0].schema(), other.full_name);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Person instance
     * @param other The existing instance to copy.
     */
    private Builder(Person other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.full_name)) {
        this.full_name = data().deepCopy(fields()[0].schema(), other.full_name);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'full_name' field.
      * Full name of person
      * @return The value.
      */
    public java.lang.String getFullName() {
      return full_name;
    }

    /**
      * Sets the value of the 'full_name' field.
      * Full name of person
      * @param value The value of 'full_name'.
      * @return This builder.
      */
    public Person.Builder setFullName(java.lang.String value) {
      validate(fields()[0], value);
      this.full_name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'full_name' field has been set.
      * Full name of person
      * @return True if the 'full_name' field has been set, false otherwise.
      */
    public boolean hasFullName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'full_name' field.
      * Full name of person
      * @return This builder.
      */
    public Person.Builder clearFullName() {
      full_name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public Person build() {
      try {
        Person record = new Person();
        record.full_name = fieldSetFlags()[0] ? this.full_name : (java.lang.String) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
