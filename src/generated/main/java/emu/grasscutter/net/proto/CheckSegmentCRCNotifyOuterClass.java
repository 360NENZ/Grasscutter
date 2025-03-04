// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CheckSegmentCRCNotify.proto

package emu.grasscutter.net.proto;

public final class CheckSegmentCRCNotifyOuterClass {
  private CheckSegmentCRCNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CheckSegmentCRCNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CheckSegmentCRCNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .SegmentInfo info_list = 2;</code>
     */
    java.util.List<emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo> 
        getInfoListList();
    /**
     * <code>repeated .SegmentInfo info_list = 2;</code>
     */
    emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo getInfoList(int index);
    /**
     * <code>repeated .SegmentInfo info_list = 2;</code>
     */
    int getInfoListCount();
    /**
     * <code>repeated .SegmentInfo info_list = 2;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfoOrBuilder> 
        getInfoListOrBuilderList();
    /**
     * <code>repeated .SegmentInfo info_list = 2;</code>
     */
    emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfoOrBuilder getInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 88
   * Obf: FEKKMMKAEEM
   * </pre>
   *
   * Protobuf type {@code CheckSegmentCRCNotify}
   */
  public static final class CheckSegmentCRCNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CheckSegmentCRCNotify)
      CheckSegmentCRCNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CheckSegmentCRCNotify.newBuilder() to construct.
    private CheckSegmentCRCNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CheckSegmentCRCNotify() {
      infoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CheckSegmentCRCNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CheckSegmentCRCNotify(
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
            case 18: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                infoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              infoList_.add(
                  input.readMessage(emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo.parser(), extensionRegistry));
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
          infoList_ = java.util.Collections.unmodifiableList(infoList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.internal_static_CheckSegmentCRCNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.internal_static_CheckSegmentCRCNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify.class, emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify.Builder.class);
    }

    public static final int INFO_LIST_FIELD_NUMBER = 2;
    private java.util.List<emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo> infoList_;
    /**
     * <code>repeated .SegmentInfo info_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo> getInfoListList() {
      return infoList_;
    }
    /**
     * <code>repeated .SegmentInfo info_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfoOrBuilder> 
        getInfoListOrBuilderList() {
      return infoList_;
    }
    /**
     * <code>repeated .SegmentInfo info_list = 2;</code>
     */
    @java.lang.Override
    public int getInfoListCount() {
      return infoList_.size();
    }
    /**
     * <code>repeated .SegmentInfo info_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo getInfoList(int index) {
      return infoList_.get(index);
    }
    /**
     * <code>repeated .SegmentInfo info_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfoOrBuilder getInfoListOrBuilder(
        int index) {
      return infoList_.get(index);
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
      for (int i = 0; i < infoList_.size(); i++) {
        output.writeMessage(2, infoList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < infoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, infoList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify other = (emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify) obj;

      if (!getInfoListList()
          .equals(other.getInfoListList())) return false;
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
      if (getInfoListCount() > 0) {
        hash = (37 * hash) + INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getInfoListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify prototype) {
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
     * CmdId: 88
     * Obf: FEKKMMKAEEM
     * </pre>
     *
     * Protobuf type {@code CheckSegmentCRCNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CheckSegmentCRCNotify)
        emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.internal_static_CheckSegmentCRCNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.internal_static_CheckSegmentCRCNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify.class, emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify.newBuilder()
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
          getInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (infoListBuilder_ == null) {
          infoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          infoListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.internal_static_CheckSegmentCRCNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify build() {
        emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify buildPartial() {
        emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify result = new emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify(this);
        int from_bitField0_ = bitField0_;
        if (infoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            infoList_ = java.util.Collections.unmodifiableList(infoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.infoList_ = infoList_;
        } else {
          result.infoList_ = infoListBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify) {
          return mergeFrom((emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify other) {
        if (other == emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify.getDefaultInstance()) return this;
        if (infoListBuilder_ == null) {
          if (!other.infoList_.isEmpty()) {
            if (infoList_.isEmpty()) {
              infoList_ = other.infoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureInfoListIsMutable();
              infoList_.addAll(other.infoList_);
            }
            onChanged();
          }
        } else {
          if (!other.infoList_.isEmpty()) {
            if (infoListBuilder_.isEmpty()) {
              infoListBuilder_.dispose();
              infoListBuilder_ = null;
              infoList_ = other.infoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              infoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getInfoListFieldBuilder() : null;
            } else {
              infoListBuilder_.addAllMessages(other.infoList_);
            }
          }
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
        emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo> infoList_ =
        java.util.Collections.emptyList();
      private void ensureInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          infoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo>(infoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo, emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo.Builder, emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfoOrBuilder> infoListBuilder_;

      /**
       * <code>repeated .SegmentInfo info_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo> getInfoListList() {
        if (infoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(infoList_);
        } else {
          return infoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .SegmentInfo info_list = 2;</code>
       */
      public int getInfoListCount() {
        if (infoListBuilder_ == null) {
          return infoList_.size();
        } else {
          return infoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .SegmentInfo info_list = 2;</code>
       */
      public emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo getInfoList(int index) {
        if (infoListBuilder_ == null) {
          return infoList_.get(index);
        } else {
          return infoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .SegmentInfo info_list = 2;</code>
       */
      public Builder setInfoList(
          int index, emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo value) {
        if (infoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInfoListIsMutable();
          infoList_.set(index, value);
          onChanged();
        } else {
          infoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SegmentInfo info_list = 2;</code>
       */
      public Builder setInfoList(
          int index, emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo.Builder builderForValue) {
        if (infoListBuilder_ == null) {
          ensureInfoListIsMutable();
          infoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          infoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SegmentInfo info_list = 2;</code>
       */
      public Builder addInfoList(emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo value) {
        if (infoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInfoListIsMutable();
          infoList_.add(value);
          onChanged();
        } else {
          infoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .SegmentInfo info_list = 2;</code>
       */
      public Builder addInfoList(
          int index, emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo value) {
        if (infoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInfoListIsMutable();
          infoList_.add(index, value);
          onChanged();
        } else {
          infoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SegmentInfo info_list = 2;</code>
       */
      public Builder addInfoList(
          emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo.Builder builderForValue) {
        if (infoListBuilder_ == null) {
          ensureInfoListIsMutable();
          infoList_.add(builderForValue.build());
          onChanged();
        } else {
          infoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SegmentInfo info_list = 2;</code>
       */
      public Builder addInfoList(
          int index, emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo.Builder builderForValue) {
        if (infoListBuilder_ == null) {
          ensureInfoListIsMutable();
          infoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          infoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SegmentInfo info_list = 2;</code>
       */
      public Builder addAllInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo> values) {
        if (infoListBuilder_ == null) {
          ensureInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, infoList_);
          onChanged();
        } else {
          infoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .SegmentInfo info_list = 2;</code>
       */
      public Builder clearInfoList() {
        if (infoListBuilder_ == null) {
          infoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          infoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .SegmentInfo info_list = 2;</code>
       */
      public Builder removeInfoList(int index) {
        if (infoListBuilder_ == null) {
          ensureInfoListIsMutable();
          infoList_.remove(index);
          onChanged();
        } else {
          infoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .SegmentInfo info_list = 2;</code>
       */
      public emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo.Builder getInfoListBuilder(
          int index) {
        return getInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .SegmentInfo info_list = 2;</code>
       */
      public emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfoOrBuilder getInfoListOrBuilder(
          int index) {
        if (infoListBuilder_ == null) {
          return infoList_.get(index);  } else {
          return infoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .SegmentInfo info_list = 2;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfoOrBuilder> 
           getInfoListOrBuilderList() {
        if (infoListBuilder_ != null) {
          return infoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(infoList_);
        }
      }
      /**
       * <code>repeated .SegmentInfo info_list = 2;</code>
       */
      public emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo.Builder addInfoListBuilder() {
        return getInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .SegmentInfo info_list = 2;</code>
       */
      public emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo.Builder addInfoListBuilder(
          int index) {
        return getInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .SegmentInfo info_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo.Builder> 
           getInfoListBuilderList() {
        return getInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo, emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo.Builder, emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfoOrBuilder> 
          getInfoListFieldBuilder() {
        if (infoListBuilder_ == null) {
          infoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo, emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo.Builder, emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfoOrBuilder>(
                  infoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          infoList_ = null;
        }
        return infoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:CheckSegmentCRCNotify)
    }

    // @@protoc_insertion_point(class_scope:CheckSegmentCRCNotify)
    private static final emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify();
    }

    public static emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CheckSegmentCRCNotify>
        PARSER = new com.google.protobuf.AbstractParser<CheckSegmentCRCNotify>() {
      @java.lang.Override
      public CheckSegmentCRCNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CheckSegmentCRCNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CheckSegmentCRCNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CheckSegmentCRCNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CheckSegmentCRCNotifyOuterClass.CheckSegmentCRCNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CheckSegmentCRCNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CheckSegmentCRCNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033CheckSegmentCRCNotify.proto\032\021SegmentIn" +
      "fo.proto\"8\n\025CheckSegmentCRCNotify\022\037\n\tinf" +
      "o_list\030\002 \003(\0132\014.SegmentInfoB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.SegmentInfoOuterClass.getDescriptor(),
        });
    internal_static_CheckSegmentCRCNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CheckSegmentCRCNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CheckSegmentCRCNotify_descriptor,
        new java.lang.String[] { "InfoList", });
    emu.grasscutter.net.proto.SegmentInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
