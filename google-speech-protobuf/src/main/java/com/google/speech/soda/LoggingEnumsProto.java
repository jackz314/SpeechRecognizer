// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/soda/public/soda_logging_enums.proto

package com.google.speech.soda;

public final class LoggingEnumsProto {
  private LoggingEnumsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code speech.soda.HostAppId}
   */
  public enum HostAppId
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_HOST_APP_ID = 0;</code>
     */
    UNKNOWN_HOST_APP_ID(0),
    /**
     * <code>NGA = 1;</code>
     */
    NGA(1),
    /**
     * <code>AGSA_HOTWORD = 2;</code>
     */
    AGSA_HOTWORD(2),
    /**
     * <code>ANDROID_RECOGNITION_SERVICE = 3;</code>
     */
    ANDROID_RECOGNITION_SERVICE(3),
    /**
     * <code>MARBLE = 4;</code>
     */
    MARBLE(4),
    /**
     * <code>LIBASSISTANT = 5;</code>
     */
    LIBASSISTANT(5),
    /**
     * <code>GBOARD = 6;</code>
     */
    GBOARD(6),
    ;

    /**
     * <code>UNKNOWN_HOST_APP_ID = 0;</code>
     */
    public static final int UNKNOWN_HOST_APP_ID_VALUE = 0;
    /**
     * <code>NGA = 1;</code>
     */
    public static final int NGA_VALUE = 1;
    /**
     * <code>AGSA_HOTWORD = 2;</code>
     */
    public static final int AGSA_HOTWORD_VALUE = 2;
    /**
     * <code>ANDROID_RECOGNITION_SERVICE = 3;</code>
     */
    public static final int ANDROID_RECOGNITION_SERVICE_VALUE = 3;
    /**
     * <code>MARBLE = 4;</code>
     */
    public static final int MARBLE_VALUE = 4;
    /**
     * <code>LIBASSISTANT = 5;</code>
     */
    public static final int LIBASSISTANT_VALUE = 5;
    /**
     * <code>GBOARD = 6;</code>
     */
    public static final int GBOARD_VALUE = 6;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static HostAppId valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static HostAppId forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_HOST_APP_ID;
        case 1: return NGA;
        case 2: return AGSA_HOTWORD;
        case 3: return ANDROID_RECOGNITION_SERVICE;
        case 4: return MARBLE;
        case 5: return LIBASSISTANT;
        case 6: return GBOARD;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<HostAppId>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        HostAppId> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<HostAppId>() {
            public HostAppId findValueByNumber(int number) {
              return HostAppId.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.speech.soda.LoggingEnumsProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final HostAppId[] VALUES = values();

    public static HostAppId valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private HostAppId(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:speech.soda.HostAppId)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+speech/soda/public/soda_logging_enums." +
      "proto\022\013speech.soda*\212\001\n\tHostAppId\022\027\n\023UNKN" +
      "OWN_HOST_APP_ID\020\000\022\007\n\003NGA\020\001\022\020\n\014AGSA_HOTWO" +
      "RD\020\002\022\037\n\033ANDROID_RECOGNITION_SERVICE\020\003\022\n\n" +
      "\006MARBLE\020\004\022\020\n\014LIBASSISTANT\020\005\022\n\n\006GBOARD\020\006B" +
      "3\n\026com.google.speech.sodaB\021LoggingEnumsP" +
      "rotoH\002\242\002\003SDA"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
