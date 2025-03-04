// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CustomDungeonOfficialNotify.proto

package emu.grasscutter.net.proto;

public final class CustomDungeonOfficialNotifyOuterClass {
  private CustomDungeonOfficialNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CustomDungeonOfficialNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CustomDungeonOfficialNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.TryCustomDungeonType try_type = 14;</code>
     * @return The enum numeric value on the wire for tryType.
     */
    int getTryTypeValue();
    /**
     * <code>.TryCustomDungeonType try_type = 14;</code>
     * @return The tryType.
     */
    emu.grasscutter.net.proto.TryCustomDungeonTypeOuterClass.TryCustomDungeonType getTryType();

    /**
     * <code>repeated uint32 official_black_coin_list = 8;</code>
     * @return A list containing the officialBlackCoinList.
     */
    java.util.List<java.lang.Integer> getOfficialBlackCoinListList();
    /**
     * <code>repeated uint32 official_black_coin_list = 8;</code>
     * @return The count of officialBlackCoinList.
     */
    int getOfficialBlackCoinListCount();
    /**
     * <code>repeated uint32 official_black_coin_list = 8;</code>
     * @param index The index of the element to return.
     * @return The officialBlackCoinList at the given index.
     */
    int getOfficialBlackCoinList(int index);

    /**
     * <code>.EnterCustomDungeonType enter_type = 10;</code>
     * @return The enum numeric value on the wire for enterType.
     */
    int getEnterTypeValue();
    /**
     * <code>.EnterCustomDungeonType enter_type = 10;</code>
     * @return The enterType.
     */
    emu.grasscutter.net.proto.EnterCustomDungeonTypeOuterClass.EnterCustomDungeonType getEnterType();
  }
  /**
   * <pre>
   * CmdId: 6224
   * Obf: DKNJJMOMFDM
   * </pre>
   *
   * Protobuf type {@code CustomDungeonOfficialNotify}
   */
  public static final class CustomDungeonOfficialNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CustomDungeonOfficialNotify)
      CustomDungeonOfficialNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CustomDungeonOfficialNotify.newBuilder() to construct.
    private CustomDungeonOfficialNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CustomDungeonOfficialNotify() {
      tryType_ = 0;
      officialBlackCoinList_ = emptyIntList();
      enterType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CustomDungeonOfficialNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CustomDungeonOfficialNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 64: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                officialBlackCoinList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              officialBlackCoinList_.addInt(input.readUInt32());
              break;
            }
            case 66: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                officialBlackCoinList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                officialBlackCoinList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 80: {
              int rawValue = input.readEnum();

              enterType_ = rawValue;
              break;
            }
            case 112: {
              int rawValue = input.readEnum();

              tryType_ = rawValue;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          officialBlackCoinList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.internal_static_CustomDungeonOfficialNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.internal_static_CustomDungeonOfficialNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify.class, emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify.Builder.class);
    }

    public static final int TRY_TYPE_FIELD_NUMBER = 14;
    private int tryType_;
    /**
     * <code>.TryCustomDungeonType try_type = 14;</code>
     * @return The enum numeric value on the wire for tryType.
     */
    @java.lang.Override public int getTryTypeValue() {
      return tryType_;
    }
    /**
     * <code>.TryCustomDungeonType try_type = 14;</code>
     * @return The tryType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.TryCustomDungeonTypeOuterClass.TryCustomDungeonType getTryType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.TryCustomDungeonTypeOuterClass.TryCustomDungeonType result = emu.grasscutter.net.proto.TryCustomDungeonTypeOuterClass.TryCustomDungeonType.valueOf(tryType_);
      return result == null ? emu.grasscutter.net.proto.TryCustomDungeonTypeOuterClass.TryCustomDungeonType.UNRECOGNIZED : result;
    }

    public static final int OFFICIAL_BLACK_COIN_LIST_FIELD_NUMBER = 8;
    private com.google.protobuf.Internal.IntList officialBlackCoinList_;
    /**
     * <code>repeated uint32 official_black_coin_list = 8;</code>
     * @return A list containing the officialBlackCoinList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getOfficialBlackCoinListList() {
      return officialBlackCoinList_;
    }
    /**
     * <code>repeated uint32 official_black_coin_list = 8;</code>
     * @return The count of officialBlackCoinList.
     */
    public int getOfficialBlackCoinListCount() {
      return officialBlackCoinList_.size();
    }
    /**
     * <code>repeated uint32 official_black_coin_list = 8;</code>
     * @param index The index of the element to return.
     * @return The officialBlackCoinList at the given index.
     */
    public int getOfficialBlackCoinList(int index) {
      return officialBlackCoinList_.getInt(index);
    }
    private int officialBlackCoinListMemoizedSerializedSize = -1;

    public static final int ENTER_TYPE_FIELD_NUMBER = 10;
    private int enterType_;
    /**
     * <code>.EnterCustomDungeonType enter_type = 10;</code>
     * @return The enum numeric value on the wire for enterType.
     */
    @java.lang.Override public int getEnterTypeValue() {
      return enterType_;
    }
    /**
     * <code>.EnterCustomDungeonType enter_type = 10;</code>
     * @return The enterType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.EnterCustomDungeonTypeOuterClass.EnterCustomDungeonType getEnterType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.EnterCustomDungeonTypeOuterClass.EnterCustomDungeonType result = emu.grasscutter.net.proto.EnterCustomDungeonTypeOuterClass.EnterCustomDungeonType.valueOf(enterType_);
      return result == null ? emu.grasscutter.net.proto.EnterCustomDungeonTypeOuterClass.EnterCustomDungeonType.UNRECOGNIZED : result;
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
      getSerializedSize();
      if (getOfficialBlackCoinListList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(officialBlackCoinListMemoizedSerializedSize);
      }
      for (int i = 0; i < officialBlackCoinList_.size(); i++) {
        output.writeUInt32NoTag(officialBlackCoinList_.getInt(i));
      }
      if (enterType_ != emu.grasscutter.net.proto.EnterCustomDungeonTypeOuterClass.EnterCustomDungeonType.ENTER_CUSTOM_DUNGEON_NONE.getNumber()) {
        output.writeEnum(10, enterType_);
      }
      if (tryType_ != emu.grasscutter.net.proto.TryCustomDungeonTypeOuterClass.TryCustomDungeonType.TRY_CUSTOM_DUNGEON_NONE.getNumber()) {
        output.writeEnum(14, tryType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < officialBlackCoinList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(officialBlackCoinList_.getInt(i));
        }
        size += dataSize;
        if (!getOfficialBlackCoinListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        officialBlackCoinListMemoizedSerializedSize = dataSize;
      }
      if (enterType_ != emu.grasscutter.net.proto.EnterCustomDungeonTypeOuterClass.EnterCustomDungeonType.ENTER_CUSTOM_DUNGEON_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(10, enterType_);
      }
      if (tryType_ != emu.grasscutter.net.proto.TryCustomDungeonTypeOuterClass.TryCustomDungeonType.TRY_CUSTOM_DUNGEON_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(14, tryType_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify other = (emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify) obj;

      if (tryType_ != other.tryType_) return false;
      if (!getOfficialBlackCoinListList()
          .equals(other.getOfficialBlackCoinListList())) return false;
      if (enterType_ != other.enterType_) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TRY_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + tryType_;
      if (getOfficialBlackCoinListCount() > 0) {
        hash = (37 * hash) + OFFICIAL_BLACK_COIN_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getOfficialBlackCoinListList().hashCode();
      }
      hash = (37 * hash) + ENTER_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + enterType_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify prototype) {
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
     * <pre>
     * CmdId: 6224
     * Obf: DKNJJMOMFDM
     * </pre>
     *
     * Protobuf type {@code CustomDungeonOfficialNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CustomDungeonOfficialNotify)
        emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.internal_static_CustomDungeonOfficialNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.internal_static_CustomDungeonOfficialNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify.class, emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        tryType_ = 0;

        officialBlackCoinList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        enterType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.internal_static_CustomDungeonOfficialNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify build() {
        emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify buildPartial() {
        emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify result = new emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify(this);
        int from_bitField0_ = bitField0_;
        result.tryType_ = tryType_;
        if (((bitField0_ & 0x00000001) != 0)) {
          officialBlackCoinList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.officialBlackCoinList_ = officialBlackCoinList_;
        result.enterType_ = enterType_;
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
        if (other instanceof emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify) {
          return mergeFrom((emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify other) {
        if (other == emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify.getDefaultInstance()) return this;
        if (other.tryType_ != 0) {
          setTryTypeValue(other.getTryTypeValue());
        }
        if (!other.officialBlackCoinList_.isEmpty()) {
          if (officialBlackCoinList_.isEmpty()) {
            officialBlackCoinList_ = other.officialBlackCoinList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOfficialBlackCoinListIsMutable();
            officialBlackCoinList_.addAll(other.officialBlackCoinList_);
          }
          onChanged();
        }
        if (other.enterType_ != 0) {
          setEnterTypeValue(other.getEnterTypeValue());
        }
        this.mergeUnknownFields(other.unknownFields);
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
        emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int tryType_ = 0;
      /**
       * <code>.TryCustomDungeonType try_type = 14;</code>
       * @return The enum numeric value on the wire for tryType.
       */
      @java.lang.Override public int getTryTypeValue() {
        return tryType_;
      }
      /**
       * <code>.TryCustomDungeonType try_type = 14;</code>
       * @param value The enum numeric value on the wire for tryType to set.
       * @return This builder for chaining.
       */
      public Builder setTryTypeValue(int value) {
        
        tryType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.TryCustomDungeonType try_type = 14;</code>
       * @return The tryType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.TryCustomDungeonTypeOuterClass.TryCustomDungeonType getTryType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.TryCustomDungeonTypeOuterClass.TryCustomDungeonType result = emu.grasscutter.net.proto.TryCustomDungeonTypeOuterClass.TryCustomDungeonType.valueOf(tryType_);
        return result == null ? emu.grasscutter.net.proto.TryCustomDungeonTypeOuterClass.TryCustomDungeonType.UNRECOGNIZED : result;
      }
      /**
       * <code>.TryCustomDungeonType try_type = 14;</code>
       * @param value The tryType to set.
       * @return This builder for chaining.
       */
      public Builder setTryType(emu.grasscutter.net.proto.TryCustomDungeonTypeOuterClass.TryCustomDungeonType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        tryType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.TryCustomDungeonType try_type = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearTryType() {
        
        tryType_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList officialBlackCoinList_ = emptyIntList();
      private void ensureOfficialBlackCoinListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          officialBlackCoinList_ = mutableCopy(officialBlackCoinList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 official_black_coin_list = 8;</code>
       * @return A list containing the officialBlackCoinList.
       */
      public java.util.List<java.lang.Integer>
          getOfficialBlackCoinListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(officialBlackCoinList_) : officialBlackCoinList_;
      }
      /**
       * <code>repeated uint32 official_black_coin_list = 8;</code>
       * @return The count of officialBlackCoinList.
       */
      public int getOfficialBlackCoinListCount() {
        return officialBlackCoinList_.size();
      }
      /**
       * <code>repeated uint32 official_black_coin_list = 8;</code>
       * @param index The index of the element to return.
       * @return The officialBlackCoinList at the given index.
       */
      public int getOfficialBlackCoinList(int index) {
        return officialBlackCoinList_.getInt(index);
      }
      /**
       * <code>repeated uint32 official_black_coin_list = 8;</code>
       * @param index The index to set the value at.
       * @param value The officialBlackCoinList to set.
       * @return This builder for chaining.
       */
      public Builder setOfficialBlackCoinList(
          int index, int value) {
        ensureOfficialBlackCoinListIsMutable();
        officialBlackCoinList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 official_black_coin_list = 8;</code>
       * @param value The officialBlackCoinList to add.
       * @return This builder for chaining.
       */
      public Builder addOfficialBlackCoinList(int value) {
        ensureOfficialBlackCoinListIsMutable();
        officialBlackCoinList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 official_black_coin_list = 8;</code>
       * @param values The officialBlackCoinList to add.
       * @return This builder for chaining.
       */
      public Builder addAllOfficialBlackCoinList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureOfficialBlackCoinListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, officialBlackCoinList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 official_black_coin_list = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearOfficialBlackCoinList() {
        officialBlackCoinList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int enterType_ = 0;
      /**
       * <code>.EnterCustomDungeonType enter_type = 10;</code>
       * @return The enum numeric value on the wire for enterType.
       */
      @java.lang.Override public int getEnterTypeValue() {
        return enterType_;
      }
      /**
       * <code>.EnterCustomDungeonType enter_type = 10;</code>
       * @param value The enum numeric value on the wire for enterType to set.
       * @return This builder for chaining.
       */
      public Builder setEnterTypeValue(int value) {
        
        enterType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.EnterCustomDungeonType enter_type = 10;</code>
       * @return The enterType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.EnterCustomDungeonTypeOuterClass.EnterCustomDungeonType getEnterType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.EnterCustomDungeonTypeOuterClass.EnterCustomDungeonType result = emu.grasscutter.net.proto.EnterCustomDungeonTypeOuterClass.EnterCustomDungeonType.valueOf(enterType_);
        return result == null ? emu.grasscutter.net.proto.EnterCustomDungeonTypeOuterClass.EnterCustomDungeonType.UNRECOGNIZED : result;
      }
      /**
       * <code>.EnterCustomDungeonType enter_type = 10;</code>
       * @param value The enterType to set.
       * @return This builder for chaining.
       */
      public Builder setEnterType(emu.grasscutter.net.proto.EnterCustomDungeonTypeOuterClass.EnterCustomDungeonType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        enterType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.EnterCustomDungeonType enter_type = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearEnterType() {
        
        enterType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CustomDungeonOfficialNotify)
    }

    // @@protoc_insertion_point(class_scope:CustomDungeonOfficialNotify)
    private static final emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify();
    }

    public static emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CustomDungeonOfficialNotify>
        PARSER = new com.google.protobuf.AbstractParser<CustomDungeonOfficialNotify>() {
      @java.lang.Override
      public CustomDungeonOfficialNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CustomDungeonOfficialNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CustomDungeonOfficialNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CustomDungeonOfficialNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CustomDungeonOfficialNotifyOuterClass.CustomDungeonOfficialNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CustomDungeonOfficialNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CustomDungeonOfficialNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!CustomDungeonOfficialNotify.proto\032\032Try" +
      "CustomDungeonType.proto\032\034EnterCustomDung" +
      "eonType.proto\"\225\001\n\033CustomDungeonOfficialN" +
      "otify\022\'\n\010try_type\030\016 \001(\0162\025.TryCustomDunge" +
      "onType\022 \n\030official_black_coin_list\030\010 \003(\r" +
      "\022+\n\nenter_type\030\n \001(\0162\027.EnterCustomDungeo" +
      "nTypeB\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.TryCustomDungeonTypeOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.EnterCustomDungeonTypeOuterClass.getDescriptor(),
        });
    internal_static_CustomDungeonOfficialNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CustomDungeonOfficialNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CustomDungeonOfficialNotify_descriptor,
        new java.lang.String[] { "TryType", "OfficialBlackCoinList", "EnterType", });
    emu.grasscutter.net.proto.TryCustomDungeonTypeOuterClass.getDescriptor();
    emu.grasscutter.net.proto.EnterCustomDungeonTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
