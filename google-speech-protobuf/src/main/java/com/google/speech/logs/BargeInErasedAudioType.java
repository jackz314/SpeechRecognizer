// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/recognizer_log.proto

package com.google.speech.logs;

/**
 * Protobuf enum {@code speech.logs.BargeInErasedAudioType}
 */
public enum BargeInErasedAudioType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>TTS = 1;</code>
   */
  TTS(1),
  /**
   * <code>MUSIC = 2;</code>
   */
  MUSIC(2),
  ;

  /**
   * <code>TTS = 1;</code>
   */
  public static final int TTS_VALUE = 1;
  /**
   * <code>MUSIC = 2;</code>
   */
  public static final int MUSIC_VALUE = 2;


  public final int getNumber() {
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static BargeInErasedAudioType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BargeInErasedAudioType forNumber(int value) {
    switch (value) {
      case 1: return TTS;
      case 2: return MUSIC;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BargeInErasedAudioType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BargeInErasedAudioType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BargeInErasedAudioType>() {
          public BargeInErasedAudioType findValueByNumber(int number) {
            return BargeInErasedAudioType.forNumber(number);
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
    return com.google.speech.logs.RecognizerOuterClass.getDescriptor().getEnumTypes().get(1);
  }

  private static final BargeInErasedAudioType[] VALUES = values();

  public static BargeInErasedAudioType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private BargeInErasedAudioType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:speech.logs.BargeInErasedAudioType)
}

