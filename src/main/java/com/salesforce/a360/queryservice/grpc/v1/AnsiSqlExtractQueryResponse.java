// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salesforce/cdp/queryservice/v1/query_service.proto

package com.salesforce.a360.queryservice.grpc.v1;

/**
 * Protobuf type {@code salesforce.cdp.queryservice.v1.AnsiSqlExtractQueryResponse}
 */
public final class AnsiSqlExtractQueryResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:salesforce.cdp.queryservice.v1.AnsiSqlExtractQueryResponse)
    AnsiSqlExtractQueryResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AnsiSqlExtractQueryResponse.newBuilder() to construct.
  private AnsiSqlExtractQueryResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AnsiSqlExtractQueryResponse() {
    queryId_ = "";
    data_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AnsiSqlExtractQueryResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AnsiSqlExtractQueryResponse(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            queryId_ = s;
            break;
          }
          case 18: {

            data_ = input.readBytes();
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
    return com.salesforce.a360.queryservice.grpc.v1.QueryServiceProto.internal_static_salesforce_cdp_queryservice_v1_AnsiSqlExtractQueryResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.salesforce.a360.queryservice.grpc.v1.QueryServiceProto.internal_static_salesforce_cdp_queryservice_v1_AnsiSqlExtractQueryResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse.class, com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse.Builder.class);
  }

  public static final int QUERY_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object queryId_;
  /**
   * <code>string query_id = 1;</code>
   * @return The queryId.
   */
  @java.lang.Override
  public java.lang.String getQueryId() {
    java.lang.Object ref = queryId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      queryId_ = s;
      return s;
    }
  }
  /**
   * <code>string query_id = 1;</code>
   * @return The bytes for queryId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getQueryIdBytes() {
    java.lang.Object ref = queryId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      queryId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString data_;
  /**
   * <code>bytes data = 2;</code>
   * @return The data.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getData() {
    return data_;
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
    if (!getQueryIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, queryId_);
    }
    if (!data_.isEmpty()) {
      output.writeBytes(2, data_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getQueryIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, queryId_);
    }
    if (!data_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, data_);
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
    if (!(obj instanceof com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse)) {
      return super.equals(obj);
    }
    com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse other = (com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse) obj;

    if (!getQueryId()
        .equals(other.getQueryId())) return false;
    if (!getData()
        .equals(other.getData())) return false;
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
    hash = (37 * hash) + QUERY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getQueryId().hashCode();
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse parseFrom(
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
  public static Builder newBuilder(com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse prototype) {
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
   * Protobuf type {@code salesforce.cdp.queryservice.v1.AnsiSqlExtractQueryResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salesforce.cdp.queryservice.v1.AnsiSqlExtractQueryResponse)
      com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.salesforce.a360.queryservice.grpc.v1.QueryServiceProto.internal_static_salesforce_cdp_queryservice_v1_AnsiSqlExtractQueryResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.salesforce.a360.queryservice.grpc.v1.QueryServiceProto.internal_static_salesforce_cdp_queryservice_v1_AnsiSqlExtractQueryResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse.class, com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse.Builder.class);
    }

    // Construct using com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse.newBuilder()
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
      queryId_ = "";

      data_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.salesforce.a360.queryservice.grpc.v1.QueryServiceProto.internal_static_salesforce_cdp_queryservice_v1_AnsiSqlExtractQueryResponse_descriptor;
    }

    @java.lang.Override
    public com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse getDefaultInstanceForType() {
      return com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse build() {
      com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse buildPartial() {
      com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse result = new com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse(this);
      result.queryId_ = queryId_;
      result.data_ = data_;
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
      if (other instanceof com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse) {
        return mergeFrom((com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse other) {
      if (other == com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse.getDefaultInstance()) return this;
      if (!other.getQueryId().isEmpty()) {
        queryId_ = other.queryId_;
        onChanged();
      }
      if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
        setData(other.getData());
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
      com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object queryId_ = "";
    /**
     * <code>string query_id = 1;</code>
     * @return The queryId.
     */
    public java.lang.String getQueryId() {
      java.lang.Object ref = queryId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        queryId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string query_id = 1;</code>
     * @return The bytes for queryId.
     */
    public com.google.protobuf.ByteString
        getQueryIdBytes() {
      java.lang.Object ref = queryId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        queryId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string query_id = 1;</code>
     * @param value The queryId to set.
     * @return This builder for chaining.
     */
    public Builder setQueryId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      queryId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string query_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearQueryId() {
      
      queryId_ = getDefaultInstance().getQueryId();
      onChanged();
      return this;
    }
    /**
     * <code>string query_id = 1;</code>
     * @param value The bytes for queryId to set.
     * @return This builder for chaining.
     */
    public Builder setQueryIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      queryId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes data = 2;</code>
     * @return The data.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     * <code>bytes data = 2;</code>
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes data = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearData() {
      
      data_ = getDefaultInstance().getData();
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


    // @@protoc_insertion_point(builder_scope:salesforce.cdp.queryservice.v1.AnsiSqlExtractQueryResponse)
  }

  // @@protoc_insertion_point(class_scope:salesforce.cdp.queryservice.v1.AnsiSqlExtractQueryResponse)
  private static final com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse();
  }

  public static com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnsiSqlExtractQueryResponse>
      PARSER = new com.google.protobuf.AbstractParser<AnsiSqlExtractQueryResponse>() {
    @java.lang.Override
    public AnsiSqlExtractQueryResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AnsiSqlExtractQueryResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AnsiSqlExtractQueryResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnsiSqlExtractQueryResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.salesforce.a360.queryservice.grpc.v1.AnsiSqlExtractQueryResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
