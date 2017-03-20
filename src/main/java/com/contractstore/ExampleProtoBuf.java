// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: example.proto

package com.contractstore;

public final class ExampleProtoBuf {
  private ExampleProtoBuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SearchRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:tutorial.SearchRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string query = 1;</code>
     */
    java.lang.String getQuery();
    /**
     * <code>optional string query = 1;</code>
     */
    com.google.protobuf.ByteString
        getQueryBytes();

    /**
     * <code>optional int32 page_number = 2;</code>
     */
    int getPageNumber();

    /**
     * <code>optional int32 result_per_page = 3;</code>
     */
    int getResultPerPage();

    /**
     * <code>optional int32 anotherresult = 4;</code>
     */
    int getAnotherresult();
  }
  /**
   * Protobuf type {@code tutorial.SearchRequest}
   */
  public  static final class SearchRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:tutorial.SearchRequest)
      SearchRequestOrBuilder {
    // Use SearchRequest.newBuilder() to construct.
    private SearchRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SearchRequest() {
      query_ = "";
      pageNumber_ = 0;
      resultPerPage_ = 0;
      anotherresult_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private SearchRequest(
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
              java.lang.String s = input.readStringRequireUtf8();

              query_ = s;
              break;
            }
            case 16: {

              pageNumber_ = input.readInt32();
              break;
            }
            case 24: {

              resultPerPage_ = input.readInt32();
              break;
            }
            case 32: {

              anotherresult_ = input.readInt32();
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
      return com.contractstore.ExampleProtoBuf.internal_static_tutorial_SearchRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.contractstore.ExampleProtoBuf.internal_static_tutorial_SearchRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.contractstore.ExampleProtoBuf.SearchRequest.class, com.contractstore.ExampleProtoBuf.SearchRequest.Builder.class);
    }

    public static final int QUERY_FIELD_NUMBER = 1;
    private volatile java.lang.Object query_;
    /**
     * <code>optional string query = 1;</code>
     */
    public java.lang.String getQuery() {
      java.lang.Object ref = query_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        query_ = s;
        return s;
      }
    }
    /**
     * <code>optional string query = 1;</code>
     */
    public com.google.protobuf.ByteString
        getQueryBytes() {
      java.lang.Object ref = query_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        query_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PAGE_NUMBER_FIELD_NUMBER = 2;
    private int pageNumber_;
    /**
     * <code>optional int32 page_number = 2;</code>
     */
    public int getPageNumber() {
      return pageNumber_;
    }

    public static final int RESULT_PER_PAGE_FIELD_NUMBER = 3;
    private int resultPerPage_;
    /**
     * <code>optional int32 result_per_page = 3;</code>
     */
    public int getResultPerPage() {
      return resultPerPage_;
    }

    public static final int ANOTHERRESULT_FIELD_NUMBER = 4;
    private int anotherresult_;
    /**
     * <code>optional int32 anotherresult = 4;</code>
     */
    public int getAnotherresult() {
      return anotherresult_;
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
      if (!getQueryBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, query_);
      }
      if (pageNumber_ != 0) {
        output.writeInt32(2, pageNumber_);
      }
      if (resultPerPage_ != 0) {
        output.writeInt32(3, resultPerPage_);
      }
      if (anotherresult_ != 0) {
        output.writeInt32(4, anotherresult_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getQueryBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, query_);
      }
      if (pageNumber_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, pageNumber_);
      }
      if (resultPerPage_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, resultPerPage_);
      }
      if (anotherresult_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, anotherresult_);
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
      if (!(obj instanceof com.contractstore.ExampleProtoBuf.SearchRequest)) {
        return super.equals(obj);
      }
      com.contractstore.ExampleProtoBuf.SearchRequest other = (com.contractstore.ExampleProtoBuf.SearchRequest) obj;

      boolean result = true;
      result = result && getQuery()
          .equals(other.getQuery());
      result = result && (getPageNumber()
          == other.getPageNumber());
      result = result && (getResultPerPage()
          == other.getResultPerPage());
      result = result && (getAnotherresult()
          == other.getAnotherresult());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + QUERY_FIELD_NUMBER;
      hash = (53 * hash) + getQuery().hashCode();
      hash = (37 * hash) + PAGE_NUMBER_FIELD_NUMBER;
      hash = (53 * hash) + getPageNumber();
      hash = (37 * hash) + RESULT_PER_PAGE_FIELD_NUMBER;
      hash = (53 * hash) + getResultPerPage();
      hash = (37 * hash) + ANOTHERRESULT_FIELD_NUMBER;
      hash = (53 * hash) + getAnotherresult();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.contractstore.ExampleProtoBuf.SearchRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.contractstore.ExampleProtoBuf.SearchRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.contractstore.ExampleProtoBuf.SearchRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.contractstore.ExampleProtoBuf.SearchRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.contractstore.ExampleProtoBuf.SearchRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.contractstore.ExampleProtoBuf.SearchRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.contractstore.ExampleProtoBuf.SearchRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.contractstore.ExampleProtoBuf.SearchRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.contractstore.ExampleProtoBuf.SearchRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.contractstore.ExampleProtoBuf.SearchRequest parseFrom(
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
    public static Builder newBuilder(com.contractstore.ExampleProtoBuf.SearchRequest prototype) {
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
     * Protobuf type {@code tutorial.SearchRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:tutorial.SearchRequest)
        com.contractstore.ExampleProtoBuf.SearchRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.contractstore.ExampleProtoBuf.internal_static_tutorial_SearchRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.contractstore.ExampleProtoBuf.internal_static_tutorial_SearchRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.contractstore.ExampleProtoBuf.SearchRequest.class, com.contractstore.ExampleProtoBuf.SearchRequest.Builder.class);
      }

      // Construct using com.contractstore.ExampleProtoBuf.SearchRequest.newBuilder()
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
        query_ = "";

        pageNumber_ = 0;

        resultPerPage_ = 0;

        anotherresult_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.contractstore.ExampleProtoBuf.internal_static_tutorial_SearchRequest_descriptor;
      }

      public com.contractstore.ExampleProtoBuf.SearchRequest getDefaultInstanceForType() {
        return com.contractstore.ExampleProtoBuf.SearchRequest.getDefaultInstance();
      }

      public com.contractstore.ExampleProtoBuf.SearchRequest build() {
        com.contractstore.ExampleProtoBuf.SearchRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.contractstore.ExampleProtoBuf.SearchRequest buildPartial() {
        com.contractstore.ExampleProtoBuf.SearchRequest result = new com.contractstore.ExampleProtoBuf.SearchRequest(this);
        result.query_ = query_;
        result.pageNumber_ = pageNumber_;
        result.resultPerPage_ = resultPerPage_;
        result.anotherresult_ = anotherresult_;
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
        if (other instanceof com.contractstore.ExampleProtoBuf.SearchRequest) {
          return mergeFrom((com.contractstore.ExampleProtoBuf.SearchRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.contractstore.ExampleProtoBuf.SearchRequest other) {
        if (other == com.contractstore.ExampleProtoBuf.SearchRequest.getDefaultInstance()) return this;
        if (!other.getQuery().isEmpty()) {
          query_ = other.query_;
          onChanged();
        }
        if (other.getPageNumber() != 0) {
          setPageNumber(other.getPageNumber());
        }
        if (other.getResultPerPage() != 0) {
          setResultPerPage(other.getResultPerPage());
        }
        if (other.getAnotherresult() != 0) {
          setAnotherresult(other.getAnotherresult());
        }
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
        com.contractstore.ExampleProtoBuf.SearchRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.contractstore.ExampleProtoBuf.SearchRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object query_ = "";
      /**
       * <code>optional string query = 1;</code>
       */
      public java.lang.String getQuery() {
        java.lang.Object ref = query_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          query_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string query = 1;</code>
       */
      public com.google.protobuf.ByteString
          getQueryBytes() {
        java.lang.Object ref = query_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          query_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string query = 1;</code>
       */
      public Builder setQuery(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        query_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string query = 1;</code>
       */
      public Builder clearQuery() {
        
        query_ = getDefaultInstance().getQuery();
        onChanged();
        return this;
      }
      /**
       * <code>optional string query = 1;</code>
       */
      public Builder setQueryBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        query_ = value;
        onChanged();
        return this;
      }

      private int pageNumber_ ;
      /**
       * <code>optional int32 page_number = 2;</code>
       */
      public int getPageNumber() {
        return pageNumber_;
      }
      /**
       * <code>optional int32 page_number = 2;</code>
       */
      public Builder setPageNumber(int value) {
        
        pageNumber_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 page_number = 2;</code>
       */
      public Builder clearPageNumber() {
        
        pageNumber_ = 0;
        onChanged();
        return this;
      }

      private int resultPerPage_ ;
      /**
       * <code>optional int32 result_per_page = 3;</code>
       */
      public int getResultPerPage() {
        return resultPerPage_;
      }
      /**
       * <code>optional int32 result_per_page = 3;</code>
       */
      public Builder setResultPerPage(int value) {
        
        resultPerPage_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 result_per_page = 3;</code>
       */
      public Builder clearResultPerPage() {
        
        resultPerPage_ = 0;
        onChanged();
        return this;
      }

      private int anotherresult_ ;
      /**
       * <code>optional int32 anotherresult = 4;</code>
       */
      public int getAnotherresult() {
        return anotherresult_;
      }
      /**
       * <code>optional int32 anotherresult = 4;</code>
       */
      public Builder setAnotherresult(int value) {
        
        anotherresult_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 anotherresult = 4;</code>
       */
      public Builder clearAnotherresult() {
        
        anotherresult_ = 0;
        onChanged();
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


      // @@protoc_insertion_point(builder_scope:tutorial.SearchRequest)
    }

    // @@protoc_insertion_point(class_scope:tutorial.SearchRequest)
    private static final com.contractstore.ExampleProtoBuf.SearchRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.contractstore.ExampleProtoBuf.SearchRequest();
    }

    public static com.contractstore.ExampleProtoBuf.SearchRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SearchRequest>
        PARSER = new com.google.protobuf.AbstractParser<SearchRequest>() {
      public SearchRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new SearchRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SearchRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SearchRequest> getParserForType() {
      return PARSER;
    }

    public com.contractstore.ExampleProtoBuf.SearchRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_SearchRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_SearchRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rexample.proto\022\010tutorial\"c\n\rSearchReque" +
      "st\022\r\n\005query\030\001 \001(\t\022\023\n\013page_number\030\002 \001(\005\022\027" +
      "\n\017result_per_page\030\003 \001(\005\022\025\n\ranotherresult" +
      "\030\004 \001(\005B$\n\021com.contractstoreB\017ExampleProt" +
      "oBufb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_tutorial_SearchRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tutorial_SearchRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_SearchRequest_descriptor,
        new java.lang.String[] { "Query", "PageNumber", "ResultPerPage", "Anotherresult", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
