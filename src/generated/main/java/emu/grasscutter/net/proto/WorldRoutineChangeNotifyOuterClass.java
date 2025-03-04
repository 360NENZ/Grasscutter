// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WorldRoutineChangeNotify.proto

package emu.grasscutter.net.proto;

public final class WorldRoutineChangeNotifyOuterClass {
  private WorldRoutineChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WorldRoutineChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WorldRoutineChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.WorldRoutineInfo routine_info = 3;</code>
     * @return Whether the routineInfo field is set.
     */
    boolean hasRoutineInfo();
    /**
     * <code>.WorldRoutineInfo routine_info = 3;</code>
     * @return The routineInfo.
     */
    emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo getRoutineInfo();
    /**
     * <code>.WorldRoutineInfo routine_info = 3;</code>
     */
    emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfoOrBuilder getRoutineInfoOrBuilder();

    /**
     * <code>uint32 routine_type = 5;</code>
     * @return The routineType.
     */
    int getRoutineType();
  }
  /**
   * <pre>
   * CmdId: 3521
   * Obf: EMCGADPBAGG
   * </pre>
   *
   * Protobuf type {@code WorldRoutineChangeNotify}
   */
  public static final class WorldRoutineChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WorldRoutineChangeNotify)
      WorldRoutineChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WorldRoutineChangeNotify.newBuilder() to construct.
    private WorldRoutineChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WorldRoutineChangeNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WorldRoutineChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WorldRoutineChangeNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 26: {
              emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.Builder subBuilder = null;
              if (routineInfo_ != null) {
                subBuilder = routineInfo_.toBuilder();
              }
              routineInfo_ = input.readMessage(emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(routineInfo_);
                routineInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 40: {

              routineType_ = input.readUInt32();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.internal_static_WorldRoutineChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.internal_static_WorldRoutineChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify.class, emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify.Builder.class);
    }

    public static final int ROUTINE_INFO_FIELD_NUMBER = 3;
    private emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo routineInfo_;
    /**
     * <code>.WorldRoutineInfo routine_info = 3;</code>
     * @return Whether the routineInfo field is set.
     */
    @java.lang.Override
    public boolean hasRoutineInfo() {
      return routineInfo_ != null;
    }
    /**
     * <code>.WorldRoutineInfo routine_info = 3;</code>
     * @return The routineInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo getRoutineInfo() {
      return routineInfo_ == null ? emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.getDefaultInstance() : routineInfo_;
    }
    /**
     * <code>.WorldRoutineInfo routine_info = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfoOrBuilder getRoutineInfoOrBuilder() {
      return getRoutineInfo();
    }

    public static final int ROUTINE_TYPE_FIELD_NUMBER = 5;
    private int routineType_;
    /**
     * <code>uint32 routine_type = 5;</code>
     * @return The routineType.
     */
    @java.lang.Override
    public int getRoutineType() {
      return routineType_;
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
      if (routineInfo_ != null) {
        output.writeMessage(3, getRoutineInfo());
      }
      if (routineType_ != 0) {
        output.writeUInt32(5, routineType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (routineInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getRoutineInfo());
      }
      if (routineType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, routineType_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify other = (emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify) obj;

      if (hasRoutineInfo() != other.hasRoutineInfo()) return false;
      if (hasRoutineInfo()) {
        if (!getRoutineInfo()
            .equals(other.getRoutineInfo())) return false;
      }
      if (getRoutineType()
          != other.getRoutineType()) return false;
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
      if (hasRoutineInfo()) {
        hash = (37 * hash) + ROUTINE_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getRoutineInfo().hashCode();
      }
      hash = (37 * hash) + ROUTINE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getRoutineType();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify prototype) {
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
     * CmdId: 3521
     * Obf: EMCGADPBAGG
     * </pre>
     *
     * Protobuf type {@code WorldRoutineChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WorldRoutineChangeNotify)
        emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.internal_static_WorldRoutineChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.internal_static_WorldRoutineChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify.class, emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify.newBuilder()
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
        if (routineInfoBuilder_ == null) {
          routineInfo_ = null;
        } else {
          routineInfo_ = null;
          routineInfoBuilder_ = null;
        }
        routineType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.internal_static_WorldRoutineChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify build() {
        emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify buildPartial() {
        emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify result = new emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify(this);
        if (routineInfoBuilder_ == null) {
          result.routineInfo_ = routineInfo_;
        } else {
          result.routineInfo_ = routineInfoBuilder_.build();
        }
        result.routineType_ = routineType_;
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
        if (other instanceof emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify other) {
        if (other == emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify.getDefaultInstance()) return this;
        if (other.hasRoutineInfo()) {
          mergeRoutineInfo(other.getRoutineInfo());
        }
        if (other.getRoutineType() != 0) {
          setRoutineType(other.getRoutineType());
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
        emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo routineInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo, emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.Builder, emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfoOrBuilder> routineInfoBuilder_;
      /**
       * <code>.WorldRoutineInfo routine_info = 3;</code>
       * @return Whether the routineInfo field is set.
       */
      public boolean hasRoutineInfo() {
        return routineInfoBuilder_ != null || routineInfo_ != null;
      }
      /**
       * <code>.WorldRoutineInfo routine_info = 3;</code>
       * @return The routineInfo.
       */
      public emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo getRoutineInfo() {
        if (routineInfoBuilder_ == null) {
          return routineInfo_ == null ? emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.getDefaultInstance() : routineInfo_;
        } else {
          return routineInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.WorldRoutineInfo routine_info = 3;</code>
       */
      public Builder setRoutineInfo(emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo value) {
        if (routineInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          routineInfo_ = value;
          onChanged();
        } else {
          routineInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.WorldRoutineInfo routine_info = 3;</code>
       */
      public Builder setRoutineInfo(
          emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.Builder builderForValue) {
        if (routineInfoBuilder_ == null) {
          routineInfo_ = builderForValue.build();
          onChanged();
        } else {
          routineInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.WorldRoutineInfo routine_info = 3;</code>
       */
      public Builder mergeRoutineInfo(emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo value) {
        if (routineInfoBuilder_ == null) {
          if (routineInfo_ != null) {
            routineInfo_ =
              emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.newBuilder(routineInfo_).mergeFrom(value).buildPartial();
          } else {
            routineInfo_ = value;
          }
          onChanged();
        } else {
          routineInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.WorldRoutineInfo routine_info = 3;</code>
       */
      public Builder clearRoutineInfo() {
        if (routineInfoBuilder_ == null) {
          routineInfo_ = null;
          onChanged();
        } else {
          routineInfo_ = null;
          routineInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.WorldRoutineInfo routine_info = 3;</code>
       */
      public emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.Builder getRoutineInfoBuilder() {
        
        onChanged();
        return getRoutineInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.WorldRoutineInfo routine_info = 3;</code>
       */
      public emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfoOrBuilder getRoutineInfoOrBuilder() {
        if (routineInfoBuilder_ != null) {
          return routineInfoBuilder_.getMessageOrBuilder();
        } else {
          return routineInfo_ == null ?
              emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.getDefaultInstance() : routineInfo_;
        }
      }
      /**
       * <code>.WorldRoutineInfo routine_info = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo, emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.Builder, emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfoOrBuilder> 
          getRoutineInfoFieldBuilder() {
        if (routineInfoBuilder_ == null) {
          routineInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo, emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.Builder, emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfoOrBuilder>(
                  getRoutineInfo(),
                  getParentForChildren(),
                  isClean());
          routineInfo_ = null;
        }
        return routineInfoBuilder_;
      }

      private int routineType_ ;
      /**
       * <code>uint32 routine_type = 5;</code>
       * @return The routineType.
       */
      @java.lang.Override
      public int getRoutineType() {
        return routineType_;
      }
      /**
       * <code>uint32 routine_type = 5;</code>
       * @param value The routineType to set.
       * @return This builder for chaining.
       */
      public Builder setRoutineType(int value) {
        
        routineType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 routine_type = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRoutineType() {
        
        routineType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WorldRoutineChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:WorldRoutineChangeNotify)
    private static final emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify();
    }

    public static emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WorldRoutineChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<WorldRoutineChangeNotify>() {
      @java.lang.Override
      public WorldRoutineChangeNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WorldRoutineChangeNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WorldRoutineChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WorldRoutineChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WorldRoutineChangeNotifyOuterClass.WorldRoutineChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WorldRoutineChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WorldRoutineChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036WorldRoutineChangeNotify.proto\032\026WorldR" +
      "outineInfo.proto\"Y\n\030WorldRoutineChangeNo" +
      "tify\022\'\n\014routine_info\030\003 \001(\0132\021.WorldRoutin" +
      "eInfo\022\024\n\014routine_type\030\005 \001(\rB\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.getDescriptor(),
        });
    internal_static_WorldRoutineChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WorldRoutineChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WorldRoutineChangeNotify_descriptor,
        new java.lang.String[] { "RoutineInfo", "RoutineType", });
    emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
