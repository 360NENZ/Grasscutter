// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: KECOIIEJMKK.proto

package emu.grasscutter.net.proto;

public final class KECOIIEJMKKOuterClass {
  private KECOIIEJMKKOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface KECOIIEJMKKOrBuilder extends
      // @@protoc_insertion_point(interface_extends:KECOIIEJMKK)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 EAGNKBPDKMM = 15;</code>
     * @return The eAGNKBPDKMM.
     */
    int getEAGNKBPDKMM();
  }
  /**
   * <pre>
   * CmdId: 9266
   * </pre>
   *
   * Protobuf type {@code KECOIIEJMKK}
   */
  public static final class KECOIIEJMKK extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:KECOIIEJMKK)
      KECOIIEJMKKOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use KECOIIEJMKK.newBuilder() to construct.
    private KECOIIEJMKK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private KECOIIEJMKK() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new KECOIIEJMKK();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private KECOIIEJMKK(
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
            case 120: {

              eAGNKBPDKMM_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.internal_static_KECOIIEJMKK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.internal_static_KECOIIEJMKK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK.class, emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK.Builder.class);
    }

    public static final int EAGNKBPDKMM_FIELD_NUMBER = 15;
    private int eAGNKBPDKMM_;
    /**
     * <code>uint32 EAGNKBPDKMM = 15;</code>
     * @return The eAGNKBPDKMM.
     */
    @java.lang.Override
    public int getEAGNKBPDKMM() {
      return eAGNKBPDKMM_;
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
      if (eAGNKBPDKMM_ != 0) {
        output.writeUInt32(15, eAGNKBPDKMM_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (eAGNKBPDKMM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, eAGNKBPDKMM_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK other = (emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK) obj;

      if (getEAGNKBPDKMM()
          != other.getEAGNKBPDKMM()) return false;
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
      hash = (37 * hash) + EAGNKBPDKMM_FIELD_NUMBER;
      hash = (53 * hash) + getEAGNKBPDKMM();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK prototype) {
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
     * CmdId: 9266
     * </pre>
     *
     * Protobuf type {@code KECOIIEJMKK}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:KECOIIEJMKK)
        emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKKOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.internal_static_KECOIIEJMKK_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.internal_static_KECOIIEJMKK_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK.class, emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK.newBuilder()
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
        eAGNKBPDKMM_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.internal_static_KECOIIEJMKK_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK build() {
        emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK buildPartial() {
        emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK result = new emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK(this);
        result.eAGNKBPDKMM_ = eAGNKBPDKMM_;
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
        if (other instanceof emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK) {
          return mergeFrom((emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK other) {
        if (other == emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK.getDefaultInstance()) return this;
        if (other.getEAGNKBPDKMM() != 0) {
          setEAGNKBPDKMM(other.getEAGNKBPDKMM());
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
        emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int eAGNKBPDKMM_ ;
      /**
       * <code>uint32 EAGNKBPDKMM = 15;</code>
       * @return The eAGNKBPDKMM.
       */
      @java.lang.Override
      public int getEAGNKBPDKMM() {
        return eAGNKBPDKMM_;
      }
      /**
       * <code>uint32 EAGNKBPDKMM = 15;</code>
       * @param value The eAGNKBPDKMM to set.
       * @return This builder for chaining.
       */
      public Builder setEAGNKBPDKMM(int value) {
        
        eAGNKBPDKMM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 EAGNKBPDKMM = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearEAGNKBPDKMM() {
        
        eAGNKBPDKMM_ = 0;
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


      // @@protoc_insertion_point(builder_scope:KECOIIEJMKK)
    }

    // @@protoc_insertion_point(class_scope:KECOIIEJMKK)
    private static final emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK();
    }

    public static emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<KECOIIEJMKK>
        PARSER = new com.google.protobuf.AbstractParser<KECOIIEJMKK>() {
      @java.lang.Override
      public KECOIIEJMKK parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new KECOIIEJMKK(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<KECOIIEJMKK> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<KECOIIEJMKK> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.KECOIIEJMKKOuterClass.KECOIIEJMKK getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_KECOIIEJMKK_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_KECOIIEJMKK_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021KECOIIEJMKK.proto\"\"\n\013KECOIIEJMKK\022\023\n\013EA" +
      "GNKBPDKMM\030\017 \001(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_KECOIIEJMKK_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_KECOIIEJMKK_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_KECOIIEJMKK_descriptor,
        new java.lang.String[] { "EAGNKBPDKMM", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
