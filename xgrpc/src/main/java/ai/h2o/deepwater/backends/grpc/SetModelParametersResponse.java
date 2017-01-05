// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc_service.proto

package ai.h2o.deepwater.backends.grpc;

/**
 * Protobuf type {@code deepwater.SetModelParametersResponse}
 */
public  final class SetModelParametersResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:deepwater.SetModelParametersResponse)
    SetModelParametersResponseOrBuilder {
  // Use SetModelParametersResponse.newBuilder() to construct.
  private SetModelParametersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetModelParametersResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SetModelParametersResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            ai.h2o.deepwater.backends.grpc.Status.Builder subBuilder = null;
            if (status_ != null) {
              subBuilder = status_.toBuilder();
            }
            status_ = input.readMessage(ai.h2o.deepwater.backends.grpc.Status.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(status_);
              status_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              params_ = com.google.protobuf.MapField.newMapField(
                  ParamsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000002;
            }
            com.google.protobuf.MapEntry<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue>
            params__ = input.readMessage(
                ParamsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            params_.getMutableMap().put(
                params__.getKey(), params__.getValue());
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.h2o.deepwater.backends.grpc.DeepWaterGRPCService.internal_static_deepwater_SetModelParametersResponse_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetParams();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.h2o.deepwater.backends.grpc.DeepWaterGRPCService.internal_static_deepwater_SetModelParametersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.h2o.deepwater.backends.grpc.SetModelParametersResponse.class, ai.h2o.deepwater.backends.grpc.SetModelParametersResponse.Builder.class);
  }

  private int bitField0_;
  public static final int STATUS_FIELD_NUMBER = 1;
  private ai.h2o.deepwater.backends.grpc.Status status_;
  /**
   * <code>optional .deepwater.Status status = 1;</code>
   */
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   * <code>optional .deepwater.Status status = 1;</code>
   */
  public ai.h2o.deepwater.backends.grpc.Status getStatus() {
    return status_ == null ? ai.h2o.deepwater.backends.grpc.Status.getDefaultInstance() : status_;
  }
  /**
   * <code>optional .deepwater.Status status = 1;</code>
   */
  public ai.h2o.deepwater.backends.grpc.StatusOrBuilder getStatusOrBuilder() {
    return getStatus();
  }

  public static final int PARAMS_FIELD_NUMBER = 2;
  private static final class ParamsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue>newDefaultInstance(
                ai.h2o.deepwater.backends.grpc.DeepWaterGRPCService.internal_static_deepwater_SetModelParametersResponse_ParamsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                ai.h2o.deepwater.backends.grpc.ParamValue.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> params_;
  private com.google.protobuf.MapField<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue>
  internalGetParams() {
    if (params_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ParamsDefaultEntryHolder.defaultEntry);
    }
    return params_;
  }

  public int getParamsCount() {
    return internalGetParams().getMap().size();
  }
  /**
   * <code>map&lt;string, .deepwater.ParamValue&gt; params = 2;</code>
   */

  public boolean containsParams(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetParams().getMap().containsKey(key);
  }
  /**
   * Use {@link #getParamsMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> getParams() {
    return getParamsMap();
  }
  /**
   * <code>map&lt;string, .deepwater.ParamValue&gt; params = 2;</code>
   */

  public java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> getParamsMap() {
    return internalGetParams().getMap();
  }
  /**
   * <code>map&lt;string, .deepwater.ParamValue&gt; params = 2;</code>
   */

  public ai.h2o.deepwater.backends.grpc.ParamValue getParamsOrDefault(
      java.lang.String key,
      ai.h2o.deepwater.backends.grpc.ParamValue defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> map =
        internalGetParams().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .deepwater.ParamValue&gt; params = 2;</code>
   */

  public ai.h2o.deepwater.backends.grpc.ParamValue getParamsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> map =
        internalGetParams().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (status_ != null) {
      output.writeMessage(1, getStatus());
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetParams(),
        ParamsDefaultEntryHolder.defaultEntry,
        2);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStatus());
    }
    for (java.util.Map.Entry<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> entry
         : internalGetParams().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue>
      params__ = ParamsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, params__);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ai.h2o.deepwater.backends.grpc.SetModelParametersResponse)) {
      return super.equals(obj);
    }
    ai.h2o.deepwater.backends.grpc.SetModelParametersResponse other = (ai.h2o.deepwater.backends.grpc.SetModelParametersResponse) obj;

    boolean result = true;
    result = result && (hasStatus() == other.hasStatus());
    if (hasStatus()) {
      result = result && getStatus()
          .equals(other.getStatus());
    }
    result = result && internalGetParams().equals(
        other.internalGetParams());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    if (!internalGetParams().getMap().isEmpty()) {
      hash = (37 * hash) + PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetParams().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.h2o.deepwater.backends.grpc.SetModelParametersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.h2o.deepwater.backends.grpc.SetModelParametersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.h2o.deepwater.backends.grpc.SetModelParametersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.h2o.deepwater.backends.grpc.SetModelParametersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.h2o.deepwater.backends.grpc.SetModelParametersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.h2o.deepwater.backends.grpc.SetModelParametersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.h2o.deepwater.backends.grpc.SetModelParametersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.h2o.deepwater.backends.grpc.SetModelParametersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.h2o.deepwater.backends.grpc.SetModelParametersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.h2o.deepwater.backends.grpc.SetModelParametersResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ai.h2o.deepwater.backends.grpc.SetModelParametersResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code deepwater.SetModelParametersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:deepwater.SetModelParametersResponse)
      ai.h2o.deepwater.backends.grpc.SetModelParametersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.h2o.deepwater.backends.grpc.DeepWaterGRPCService.internal_static_deepwater_SetModelParametersResponse_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetParams();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableParams();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.h2o.deepwater.backends.grpc.DeepWaterGRPCService.internal_static_deepwater_SetModelParametersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.h2o.deepwater.backends.grpc.SetModelParametersResponse.class, ai.h2o.deepwater.backends.grpc.SetModelParametersResponse.Builder.class);
    }

    // Construct using ai.h2o.deepwater.backends.grpc.SetModelParametersResponse.newBuilder()
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
    public Builder clear() {
      super.clear();
      if (statusBuilder_ == null) {
        status_ = null;
      } else {
        status_ = null;
        statusBuilder_ = null;
      }
      internalGetMutableParams().clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.h2o.deepwater.backends.grpc.DeepWaterGRPCService.internal_static_deepwater_SetModelParametersResponse_descriptor;
    }

    public ai.h2o.deepwater.backends.grpc.SetModelParametersResponse getDefaultInstanceForType() {
      return ai.h2o.deepwater.backends.grpc.SetModelParametersResponse.getDefaultInstance();
    }

    public ai.h2o.deepwater.backends.grpc.SetModelParametersResponse build() {
      ai.h2o.deepwater.backends.grpc.SetModelParametersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public ai.h2o.deepwater.backends.grpc.SetModelParametersResponse buildPartial() {
      ai.h2o.deepwater.backends.grpc.SetModelParametersResponse result = new ai.h2o.deepwater.backends.grpc.SetModelParametersResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      result.params_ = internalGetParams();
      result.params_.makeImmutable();
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.h2o.deepwater.backends.grpc.SetModelParametersResponse) {
        return mergeFrom((ai.h2o.deepwater.backends.grpc.SetModelParametersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.h2o.deepwater.backends.grpc.SetModelParametersResponse other) {
      if (other == ai.h2o.deepwater.backends.grpc.SetModelParametersResponse.getDefaultInstance()) return this;
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      internalGetMutableParams().mergeFrom(
          other.internalGetParams());
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ai.h2o.deepwater.backends.grpc.SetModelParametersResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.h2o.deepwater.backends.grpc.SetModelParametersResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private ai.h2o.deepwater.backends.grpc.Status status_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.h2o.deepwater.backends.grpc.Status, ai.h2o.deepwater.backends.grpc.Status.Builder, ai.h2o.deepwater.backends.grpc.StatusOrBuilder> statusBuilder_;
    /**
     * <code>optional .deepwater.Status status = 1;</code>
     */
    public boolean hasStatus() {
      return statusBuilder_ != null || status_ != null;
    }
    /**
     * <code>optional .deepwater.Status status = 1;</code>
     */
    public ai.h2o.deepwater.backends.grpc.Status getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? ai.h2o.deepwater.backends.grpc.Status.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .deepwater.Status status = 1;</code>
     */
    public Builder setStatus(ai.h2o.deepwater.backends.grpc.Status value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
        onChanged();
      } else {
        statusBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .deepwater.Status status = 1;</code>
     */
    public Builder setStatus(
        ai.h2o.deepwater.backends.grpc.Status.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
        onChanged();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .deepwater.Status status = 1;</code>
     */
    public Builder mergeStatus(ai.h2o.deepwater.backends.grpc.Status value) {
      if (statusBuilder_ == null) {
        if (status_ != null) {
          status_ =
            ai.h2o.deepwater.backends.grpc.Status.newBuilder(status_).mergeFrom(value).buildPartial();
        } else {
          status_ = value;
        }
        onChanged();
      } else {
        statusBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .deepwater.Status status = 1;</code>
     */
    public Builder clearStatus() {
      if (statusBuilder_ == null) {
        status_ = null;
        onChanged();
      } else {
        status_ = null;
        statusBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .deepwater.Status status = 1;</code>
     */
    public ai.h2o.deepwater.backends.grpc.Status.Builder getStatusBuilder() {
      
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .deepwater.Status status = 1;</code>
     */
    public ai.h2o.deepwater.backends.grpc.StatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ?
            ai.h2o.deepwater.backends.grpc.Status.getDefaultInstance() : status_;
      }
    }
    /**
     * <code>optional .deepwater.Status status = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.h2o.deepwater.backends.grpc.Status, ai.h2o.deepwater.backends.grpc.Status.Builder, ai.h2o.deepwater.backends.grpc.StatusOrBuilder> 
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.h2o.deepwater.backends.grpc.Status, ai.h2o.deepwater.backends.grpc.Status.Builder, ai.h2o.deepwater.backends.grpc.StatusOrBuilder>(
                getStatus(),
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      return statusBuilder_;
    }

    private com.google.protobuf.MapField<
        java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> params_;
    private com.google.protobuf.MapField<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue>
    internalGetParams() {
      if (params_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ParamsDefaultEntryHolder.defaultEntry);
      }
      return params_;
    }
    private com.google.protobuf.MapField<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue>
    internalGetMutableParams() {
      onChanged();;
      if (params_ == null) {
        params_ = com.google.protobuf.MapField.newMapField(
            ParamsDefaultEntryHolder.defaultEntry);
      }
      if (!params_.isMutable()) {
        params_ = params_.copy();
      }
      return params_;
    }

    public int getParamsCount() {
      return internalGetParams().getMap().size();
    }
    /**
     * <code>map&lt;string, .deepwater.ParamValue&gt; params = 2;</code>
     */

    public boolean containsParams(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetParams().getMap().containsKey(key);
    }
    /**
     * Use {@link #getParamsMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> getParams() {
      return getParamsMap();
    }
    /**
     * <code>map&lt;string, .deepwater.ParamValue&gt; params = 2;</code>
     */

    public java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> getParamsMap() {
      return internalGetParams().getMap();
    }
    /**
     * <code>map&lt;string, .deepwater.ParamValue&gt; params = 2;</code>
     */

    public ai.h2o.deepwater.backends.grpc.ParamValue getParamsOrDefault(
        java.lang.String key,
        ai.h2o.deepwater.backends.grpc.ParamValue defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> map =
          internalGetParams().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .deepwater.ParamValue&gt; params = 2;</code>
     */

    public ai.h2o.deepwater.backends.grpc.ParamValue getParamsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> map =
          internalGetParams().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearParams() {
      getMutableParams().clear();
      return this;
    }
    /**
     * <code>map&lt;string, .deepwater.ParamValue&gt; params = 2;</code>
     */

    public Builder removeParams(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      getMutableParams().remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue>
    getMutableParams() {
      return internalGetMutableParams().getMutableMap();
    }
    /**
     * <code>map&lt;string, .deepwater.ParamValue&gt; params = 2;</code>
     */
    public Builder putParams(
        java.lang.String key,
        ai.h2o.deepwater.backends.grpc.ParamValue value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      getMutableParams().put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, .deepwater.ParamValue&gt; params = 2;</code>
     */

    public Builder putAllParams(
        java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> values) {
      getMutableParams().putAll(values);
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:deepwater.SetModelParametersResponse)
  }

  // @@protoc_insertion_point(class_scope:deepwater.SetModelParametersResponse)
  private static final ai.h2o.deepwater.backends.grpc.SetModelParametersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.h2o.deepwater.backends.grpc.SetModelParametersResponse();
  }

  public static ai.h2o.deepwater.backends.grpc.SetModelParametersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetModelParametersResponse>
      PARSER = new com.google.protobuf.AbstractParser<SetModelParametersResponse>() {
    public SetModelParametersResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SetModelParametersResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetModelParametersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetModelParametersResponse> getParserForType() {
    return PARSER;
  }

  public ai.h2o.deepwater.backends.grpc.SetModelParametersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
