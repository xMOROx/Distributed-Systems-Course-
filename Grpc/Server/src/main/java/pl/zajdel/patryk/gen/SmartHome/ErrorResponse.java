// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: smarthome.proto

// Protobuf Java Version: 4.26.1
package pl.zajdel.patryk.gen.SmartHome;

/**
 * Protobuf type {@code SmartHome.ErrorResponse}
 */
public final class ErrorResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:SmartHome.ErrorResponse)
    ErrorResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      ErrorResponse.class.getName());
  }
  // Use ErrorResponse.newBuilder() to construct.
  private ErrorResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ErrorResponse() {
    error_ = 0;
    message_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return pl.zajdel.patryk.gen.SmartHome.Smarthome.internal_static_SmartHome_ErrorResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return pl.zajdel.patryk.gen.SmartHome.Smarthome.internal_static_SmartHome_ErrorResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            pl.zajdel.patryk.gen.SmartHome.ErrorResponse.class, pl.zajdel.patryk.gen.SmartHome.ErrorResponse.Builder.class);
  }

  public static final int ERROR_FIELD_NUMBER = 1;
  private int error_ = 0;
  /**
   * <code>.SmartHome.Error error = 1;</code>
   * @return The enum numeric value on the wire for error.
   */
  @java.lang.Override public int getErrorValue() {
    return error_;
  }
  /**
   * <code>.SmartHome.Error error = 1;</code>
   * @return The error.
   */
  @java.lang.Override public pl.zajdel.patryk.gen.SmartHome.Error getError() {
    pl.zajdel.patryk.gen.SmartHome.Error result = pl.zajdel.patryk.gen.SmartHome.Error.forNumber(error_);
    return result == null ? pl.zajdel.patryk.gen.SmartHome.Error.UNRECOGNIZED : result;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object message_ = "";
  /**
   * <code>string message = 2;</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (error_ != pl.zajdel.patryk.gen.SmartHome.Error.MODE_NOT_CHANGED.getNumber()) {
      output.writeEnum(1, error_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, message_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (error_ != pl.zajdel.patryk.gen.SmartHome.Error.MODE_NOT_CHANGED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, error_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, message_);
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
    if (!(obj instanceof pl.zajdel.patryk.gen.SmartHome.ErrorResponse)) {
      return super.equals(obj);
    }
    pl.zajdel.patryk.gen.SmartHome.ErrorResponse other = (pl.zajdel.patryk.gen.SmartHome.ErrorResponse) obj;

    if (error_ != other.error_) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
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
    hash = (37 * hash) + ERROR_FIELD_NUMBER;
    hash = (53 * hash) + error_;
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static pl.zajdel.patryk.gen.SmartHome.ErrorResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pl.zajdel.patryk.gen.SmartHome.ErrorResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pl.zajdel.patryk.gen.SmartHome.ErrorResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pl.zajdel.patryk.gen.SmartHome.ErrorResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pl.zajdel.patryk.gen.SmartHome.ErrorResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pl.zajdel.patryk.gen.SmartHome.ErrorResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pl.zajdel.patryk.gen.SmartHome.ErrorResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static pl.zajdel.patryk.gen.SmartHome.ErrorResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static pl.zajdel.patryk.gen.SmartHome.ErrorResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static pl.zajdel.patryk.gen.SmartHome.ErrorResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static pl.zajdel.patryk.gen.SmartHome.ErrorResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static pl.zajdel.patryk.gen.SmartHome.ErrorResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(pl.zajdel.patryk.gen.SmartHome.ErrorResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code SmartHome.ErrorResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SmartHome.ErrorResponse)
      pl.zajdel.patryk.gen.SmartHome.ErrorResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pl.zajdel.patryk.gen.SmartHome.Smarthome.internal_static_SmartHome_ErrorResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pl.zajdel.patryk.gen.SmartHome.Smarthome.internal_static_SmartHome_ErrorResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              pl.zajdel.patryk.gen.SmartHome.ErrorResponse.class, pl.zajdel.patryk.gen.SmartHome.ErrorResponse.Builder.class);
    }

    // Construct using pl.zajdel.patryk.gen.SmartHome.ErrorResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      error_ = 0;
      message_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return pl.zajdel.patryk.gen.SmartHome.Smarthome.internal_static_SmartHome_ErrorResponse_descriptor;
    }

    @java.lang.Override
    public pl.zajdel.patryk.gen.SmartHome.ErrorResponse getDefaultInstanceForType() {
      return pl.zajdel.patryk.gen.SmartHome.ErrorResponse.getDefaultInstance();
    }

    @java.lang.Override
    public pl.zajdel.patryk.gen.SmartHome.ErrorResponse build() {
      pl.zajdel.patryk.gen.SmartHome.ErrorResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public pl.zajdel.patryk.gen.SmartHome.ErrorResponse buildPartial() {
      pl.zajdel.patryk.gen.SmartHome.ErrorResponse result = new pl.zajdel.patryk.gen.SmartHome.ErrorResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(pl.zajdel.patryk.gen.SmartHome.ErrorResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.error_ = error_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.message_ = message_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof pl.zajdel.patryk.gen.SmartHome.ErrorResponse) {
        return mergeFrom((pl.zajdel.patryk.gen.SmartHome.ErrorResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(pl.zajdel.patryk.gen.SmartHome.ErrorResponse other) {
      if (other == pl.zajdel.patryk.gen.SmartHome.ErrorResponse.getDefaultInstance()) return this;
      if (other.error_ != 0) {
        setErrorValue(other.getErrorValue());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        bitField0_ |= 0x00000002;
        onChanged();
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
              error_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              message_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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
    private int bitField0_;

    private int error_ = 0;
    /**
     * <code>.SmartHome.Error error = 1;</code>
     * @return The enum numeric value on the wire for error.
     */
    @java.lang.Override public int getErrorValue() {
      return error_;
    }
    /**
     * <code>.SmartHome.Error error = 1;</code>
     * @param value The enum numeric value on the wire for error to set.
     * @return This builder for chaining.
     */
    public Builder setErrorValue(int value) {
      error_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.SmartHome.Error error = 1;</code>
     * @return The error.
     */
    @java.lang.Override
    public pl.zajdel.patryk.gen.SmartHome.Error getError() {
      pl.zajdel.patryk.gen.SmartHome.Error result = pl.zajdel.patryk.gen.SmartHome.Error.forNumber(error_);
      return result == null ? pl.zajdel.patryk.gen.SmartHome.Error.UNRECOGNIZED : result;
    }
    /**
     * <code>.SmartHome.Error error = 1;</code>
     * @param value The error to set.
     * @return This builder for chaining.
     */
    public Builder setError(pl.zajdel.patryk.gen.SmartHome.Error value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      error_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.SmartHome.Error error = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearError() {
      bitField0_ = (bitField0_ & ~0x00000001);
      error_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 2;</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      message_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      message_ = getDefaultInstance().getMessage();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      message_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:SmartHome.ErrorResponse)
  }

  // @@protoc_insertion_point(class_scope:SmartHome.ErrorResponse)
  private static final pl.zajdel.patryk.gen.SmartHome.ErrorResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new pl.zajdel.patryk.gen.SmartHome.ErrorResponse();
  }

  public static pl.zajdel.patryk.gen.SmartHome.ErrorResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ErrorResponse>
      PARSER = new com.google.protobuf.AbstractParser<ErrorResponse>() {
    @java.lang.Override
    public ErrorResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ErrorResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ErrorResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public pl.zajdel.patryk.gen.SmartHome.ErrorResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

