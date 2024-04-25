// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: smarthome.proto

// Protobuf Java Version: 4.26.1
package pl.zajdel.patryk.gen.SmartHome;

/**
 * Protobuf type {@code SmartHome.ShoppingListRecordWithId}
 */
public final class ShoppingListRecordWithId extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:SmartHome.ShoppingListRecordWithId)
    ShoppingListRecordWithIdOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      ShoppingListRecordWithId.class.getName());
  }
  // Use ShoppingListRecordWithId.newBuilder() to construct.
  private ShoppingListRecordWithId(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ShoppingListRecordWithId() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return pl.zajdel.patryk.gen.SmartHome.Smarthome.internal_static_SmartHome_ShoppingListRecordWithId_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return pl.zajdel.patryk.gen.SmartHome.Smarthome.internal_static_SmartHome_ShoppingListRecordWithId_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId.class, pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private int id_ = 0;
  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public int getId() {
    return id_;
  }

  public static final int SHOPPINGLISTRECORD_FIELD_NUMBER = 2;
  private pl.zajdel.patryk.gen.SmartHome.ShoppingListRecord shoppingListRecord_;
  /**
   * <code>.SmartHome.ShoppingListRecord shoppingListRecord = 2;</code>
   * @return Whether the shoppingListRecord field is set.
   */
  @java.lang.Override
  public boolean hasShoppingListRecord() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.SmartHome.ShoppingListRecord shoppingListRecord = 2;</code>
   * @return The shoppingListRecord.
   */
  @java.lang.Override
  public pl.zajdel.patryk.gen.SmartHome.ShoppingListRecord getShoppingListRecord() {
    return shoppingListRecord_ == null ? pl.zajdel.patryk.gen.SmartHome.ShoppingListRecord.getDefaultInstance() : shoppingListRecord_;
  }
  /**
   * <code>.SmartHome.ShoppingListRecord shoppingListRecord = 2;</code>
   */
  @java.lang.Override
  public pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordOrBuilder getShoppingListRecordOrBuilder() {
    return shoppingListRecord_ == null ? pl.zajdel.patryk.gen.SmartHome.ShoppingListRecord.getDefaultInstance() : shoppingListRecord_;
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
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getShoppingListRecord());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getShoppingListRecord());
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
    if (!(obj instanceof pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId)) {
      return super.equals(obj);
    }
    pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId other = (pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId) obj;

    if (getId()
        != other.getId()) return false;
    if (hasShoppingListRecord() != other.hasShoppingListRecord()) return false;
    if (hasShoppingListRecord()) {
      if (!getShoppingListRecord()
          .equals(other.getShoppingListRecord())) return false;
    }
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    if (hasShoppingListRecord()) {
      hash = (37 * hash) + SHOPPINGLISTRECORD_FIELD_NUMBER;
      hash = (53 * hash) + getShoppingListRecord().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId parseFrom(
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
  public static Builder newBuilder(pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId prototype) {
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
   * Protobuf type {@code SmartHome.ShoppingListRecordWithId}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SmartHome.ShoppingListRecordWithId)
      pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithIdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pl.zajdel.patryk.gen.SmartHome.Smarthome.internal_static_SmartHome_ShoppingListRecordWithId_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pl.zajdel.patryk.gen.SmartHome.Smarthome.internal_static_SmartHome_ShoppingListRecordWithId_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId.class, pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId.Builder.class);
    }

    // Construct using pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getShoppingListRecordFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      id_ = 0;
      shoppingListRecord_ = null;
      if (shoppingListRecordBuilder_ != null) {
        shoppingListRecordBuilder_.dispose();
        shoppingListRecordBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return pl.zajdel.patryk.gen.SmartHome.Smarthome.internal_static_SmartHome_ShoppingListRecordWithId_descriptor;
    }

    @java.lang.Override
    public pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId getDefaultInstanceForType() {
      return pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId.getDefaultInstance();
    }

    @java.lang.Override
    public pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId build() {
      pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId buildPartial() {
      pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId result = new pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.shoppingListRecord_ = shoppingListRecordBuilder_ == null
            ? shoppingListRecord_
            : shoppingListRecordBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId) {
        return mergeFrom((pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId other) {
      if (other == pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.hasShoppingListRecord()) {
        mergeShoppingListRecord(other.getShoppingListRecord());
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
              id_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getShoppingListRecordFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {

      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = 0;
      onChanged();
      return this;
    }

    private pl.zajdel.patryk.gen.SmartHome.ShoppingListRecord shoppingListRecord_;
    private com.google.protobuf.SingleFieldBuilder<
        pl.zajdel.patryk.gen.SmartHome.ShoppingListRecord, pl.zajdel.patryk.gen.SmartHome.ShoppingListRecord.Builder, pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordOrBuilder> shoppingListRecordBuilder_;
    /**
     * <code>.SmartHome.ShoppingListRecord shoppingListRecord = 2;</code>
     * @return Whether the shoppingListRecord field is set.
     */
    public boolean hasShoppingListRecord() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.SmartHome.ShoppingListRecord shoppingListRecord = 2;</code>
     * @return The shoppingListRecord.
     */
    public pl.zajdel.patryk.gen.SmartHome.ShoppingListRecord getShoppingListRecord() {
      if (shoppingListRecordBuilder_ == null) {
        return shoppingListRecord_ == null ? pl.zajdel.patryk.gen.SmartHome.ShoppingListRecord.getDefaultInstance() : shoppingListRecord_;
      } else {
        return shoppingListRecordBuilder_.getMessage();
      }
    }
    /**
     * <code>.SmartHome.ShoppingListRecord shoppingListRecord = 2;</code>
     */
    public Builder setShoppingListRecord(pl.zajdel.patryk.gen.SmartHome.ShoppingListRecord value) {
      if (shoppingListRecordBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        shoppingListRecord_ = value;
      } else {
        shoppingListRecordBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.SmartHome.ShoppingListRecord shoppingListRecord = 2;</code>
     */
    public Builder setShoppingListRecord(
        pl.zajdel.patryk.gen.SmartHome.ShoppingListRecord.Builder builderForValue) {
      if (shoppingListRecordBuilder_ == null) {
        shoppingListRecord_ = builderForValue.build();
      } else {
        shoppingListRecordBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.SmartHome.ShoppingListRecord shoppingListRecord = 2;</code>
     */
    public Builder mergeShoppingListRecord(pl.zajdel.patryk.gen.SmartHome.ShoppingListRecord value) {
      if (shoppingListRecordBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          shoppingListRecord_ != null &&
          shoppingListRecord_ != pl.zajdel.patryk.gen.SmartHome.ShoppingListRecord.getDefaultInstance()) {
          getShoppingListRecordBuilder().mergeFrom(value);
        } else {
          shoppingListRecord_ = value;
        }
      } else {
        shoppingListRecordBuilder_.mergeFrom(value);
      }
      if (shoppingListRecord_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.SmartHome.ShoppingListRecord shoppingListRecord = 2;</code>
     */
    public Builder clearShoppingListRecord() {
      bitField0_ = (bitField0_ & ~0x00000002);
      shoppingListRecord_ = null;
      if (shoppingListRecordBuilder_ != null) {
        shoppingListRecordBuilder_.dispose();
        shoppingListRecordBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.SmartHome.ShoppingListRecord shoppingListRecord = 2;</code>
     */
    public pl.zajdel.patryk.gen.SmartHome.ShoppingListRecord.Builder getShoppingListRecordBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getShoppingListRecordFieldBuilder().getBuilder();
    }
    /**
     * <code>.SmartHome.ShoppingListRecord shoppingListRecord = 2;</code>
     */
    public pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordOrBuilder getShoppingListRecordOrBuilder() {
      if (shoppingListRecordBuilder_ != null) {
        return shoppingListRecordBuilder_.getMessageOrBuilder();
      } else {
        return shoppingListRecord_ == null ?
            pl.zajdel.patryk.gen.SmartHome.ShoppingListRecord.getDefaultInstance() : shoppingListRecord_;
      }
    }
    /**
     * <code>.SmartHome.ShoppingListRecord shoppingListRecord = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        pl.zajdel.patryk.gen.SmartHome.ShoppingListRecord, pl.zajdel.patryk.gen.SmartHome.ShoppingListRecord.Builder, pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordOrBuilder> 
        getShoppingListRecordFieldBuilder() {
      if (shoppingListRecordBuilder_ == null) {
        shoppingListRecordBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            pl.zajdel.patryk.gen.SmartHome.ShoppingListRecord, pl.zajdel.patryk.gen.SmartHome.ShoppingListRecord.Builder, pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordOrBuilder>(
                getShoppingListRecord(),
                getParentForChildren(),
                isClean());
        shoppingListRecord_ = null;
      }
      return shoppingListRecordBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:SmartHome.ShoppingListRecordWithId)
  }

  // @@protoc_insertion_point(class_scope:SmartHome.ShoppingListRecordWithId)
  private static final pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId();
  }

  public static pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ShoppingListRecordWithId>
      PARSER = new com.google.protobuf.AbstractParser<ShoppingListRecordWithId>() {
    @java.lang.Override
    public ShoppingListRecordWithId parsePartialFrom(
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

  public static com.google.protobuf.Parser<ShoppingListRecordWithId> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ShoppingListRecordWithId> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public pl.zajdel.patryk.gen.SmartHome.ShoppingListRecordWithId getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

