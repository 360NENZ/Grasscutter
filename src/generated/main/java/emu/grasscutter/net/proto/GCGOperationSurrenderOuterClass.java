// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGOperationSurrender.proto

package emu.grasscutter.net.proto;

public final class GCGOperationSurrenderOuterClass {
  private GCGOperationSurrenderOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGOperationSurrenderOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGOperationSurrender)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   * Obf: MLDMPOEHPLN
   * </pre>
   *
   * Protobuf type {@code GCGOperationSurrender}
   */
  public static final class GCGOperationSurrender extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGOperationSurrender)
      GCGOperationSurrenderOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGOperationSurrender.newBuilder() to construct.
    private GCGOperationSurrender(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGOperationSurrender() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGOperationSurrender();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGOperationSurrender(
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
      return emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.internal_static_GCGOperationSurrender_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.internal_static_GCGOperationSurrender_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender.class, emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender.Builder.class);
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
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender other = (emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender) obj;

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
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender prototype) {
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
     * Obf: MLDMPOEHPLN
     * </pre>
     *
     * Protobuf type {@code GCGOperationSurrender}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGOperationSurrender)
        emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrenderOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.internal_static_GCGOperationSurrender_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.internal_static_GCGOperationSurrender_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender.class, emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender.newBuilder()
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
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.internal_static_GCGOperationSurrender_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender build() {
        emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender buildPartial() {
        emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender result = new emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender(this);
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
        if (other instanceof emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender) {
          return mergeFrom((emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender other) {
        if (other == emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender.getDefaultInstance()) return this;
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
        emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
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


      // @@protoc_insertion_point(builder_scope:GCGOperationSurrender)
    }

    // @@protoc_insertion_point(class_scope:GCGOperationSurrender)
    private static final emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender();
    }

    public static emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGOperationSurrender>
        PARSER = new com.google.protobuf.AbstractParser<GCGOperationSurrender>() {
      @java.lang.Override
      public GCGOperationSurrender parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGOperationSurrender(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGOperationSurrender> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGOperationSurrender> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGOperationSurrenderOuterClass.GCGOperationSurrender getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGOperationSurrender_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGOperationSurrender_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033GCGOperationSurrender.proto\"\027\n\025GCGOper" +
      "ationSurrenderB\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGOperationSurrender_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGOperationSurrender_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGOperationSurrender_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
