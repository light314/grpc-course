// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculator/calculator.proto

package com.proto.calculator;

/**
 * Protobuf type {@code calculator.CalcRequest}
 */
public final class CalcRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:calculator.CalcRequest)
    CalcRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CalcRequest.newBuilder() to construct.
  private CalcRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CalcRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CalcRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.proto.calculator.Calculator.internal_static_calculator_CalcRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.calculator.Calculator.internal_static_calculator_CalcRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.calculator.CalcRequest.class, com.proto.calculator.CalcRequest.Builder.class);
  }

  public static final int FIRST_NUM_FIELD_NUMBER = 1;
  private long firstNum_;
  /**
   * <code>int64 first_num = 1;</code>
   * @return The firstNum.
   */
  @java.lang.Override
  public long getFirstNum() {
    return firstNum_;
  }

  public static final int SECOND_NUM_FIELD_NUMBER = 2;
  private long secondNum_;
  /**
   * <code>int64 second_num = 2;</code>
   * @return The secondNum.
   */
  @java.lang.Override
  public long getSecondNum() {
    return secondNum_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (firstNum_ != 0L) {
      output.writeInt64(1, firstNum_);
    }
    if (secondNum_ != 0L) {
      output.writeInt64(2, secondNum_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (firstNum_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, firstNum_);
    }
    if (secondNum_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, secondNum_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.proto.calculator.CalcRequest)) {
      return super.equals(obj);
    }
    com.proto.calculator.CalcRequest other = (com.proto.calculator.CalcRequest) obj;

    if (getFirstNum()
        != other.getFirstNum()) return false;
    if (getSecondNum()
        != other.getSecondNum()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FIRST_NUM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFirstNum());
    hash = (37 * hash) + SECOND_NUM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSecondNum());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.calculator.CalcRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.calculator.CalcRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.calculator.CalcRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.calculator.CalcRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.calculator.CalcRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.calculator.CalcRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.calculator.CalcRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.calculator.CalcRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.calculator.CalcRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.calculator.CalcRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.calculator.CalcRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.calculator.CalcRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.proto.calculator.CalcRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code calculator.CalcRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:calculator.CalcRequest)
      com.proto.calculator.CalcRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.calculator.Calculator.internal_static_calculator_CalcRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.calculator.Calculator.internal_static_calculator_CalcRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.calculator.CalcRequest.class, com.proto.calculator.CalcRequest.Builder.class);
    }

    // Construct using com.proto.calculator.CalcRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      firstNum_ = 0L;

      secondNum_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.calculator.Calculator.internal_static_calculator_CalcRequest_descriptor;
    }

    @java.lang.Override
    public com.proto.calculator.CalcRequest getDefaultInstanceForType() {
      return com.proto.calculator.CalcRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.calculator.CalcRequest build() {
      com.proto.calculator.CalcRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.calculator.CalcRequest buildPartial() {
      com.proto.calculator.CalcRequest result = new com.proto.calculator.CalcRequest(this);
      result.firstNum_ = firstNum_;
      result.secondNum_ = secondNum_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.proto.calculator.CalcRequest) {
        return mergeFrom((com.proto.calculator.CalcRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.calculator.CalcRequest other) {
      if (other == com.proto.calculator.CalcRequest.getDefaultInstance()) return this;
      if (other.getFirstNum() != 0L) {
        setFirstNum(other.getFirstNum());
      }
      if (other.getSecondNum() != 0L) {
        setSecondNum(other.getSecondNum());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              firstNum_ = input.readInt64();

              break;
            } // case 8
            case 16: {
              secondNum_ = input.readInt64();

              break;
            } // case 16
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private long firstNum_ ;
    /**
     * <code>int64 first_num = 1;</code>
     * @return The firstNum.
     */
    @java.lang.Override
    public long getFirstNum() {
      return firstNum_;
    }
    /**
     * <code>int64 first_num = 1;</code>
     * @param value The firstNum to set.
     * @return This builder for chaining.
     */
    public Builder setFirstNum(long value) {
      
      firstNum_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 first_num = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFirstNum() {
      
      firstNum_ = 0L;
      onChanged();
      return this;
    }

    private long secondNum_ ;
    /**
     * <code>int64 second_num = 2;</code>
     * @return The secondNum.
     */
    @java.lang.Override
    public long getSecondNum() {
      return secondNum_;
    }
    /**
     * <code>int64 second_num = 2;</code>
     * @param value The secondNum to set.
     * @return This builder for chaining.
     */
    public Builder setSecondNum(long value) {
      
      secondNum_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 second_num = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSecondNum() {
      
      secondNum_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:calculator.CalcRequest)
  }

  // @@protoc_insertion_point(class_scope:calculator.CalcRequest)
  private static final com.proto.calculator.CalcRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.calculator.CalcRequest();
  }

  public static com.proto.calculator.CalcRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CalcRequest>
      PARSER = new com.google.protobuf.AbstractParser<CalcRequest>() {
    @java.lang.Override
    public CalcRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<CalcRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CalcRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.calculator.CalcRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

