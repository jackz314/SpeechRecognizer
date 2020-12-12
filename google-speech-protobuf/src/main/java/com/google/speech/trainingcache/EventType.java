// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/training_cache/proto/event_type.proto

package com.google.speech.trainingcache;

/**
 * Protobuf enum {@code speech.training_cache.EventType}
 */
public enum EventType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN = 0;</code>
   */
  UNKNOWN(0),
  /**
   * <code>SESSION = 1;</code>
   */
  SESSION(1),
  /**
   * <code>TEST_MESSAGE = 2;</code>
   */
  TEST_MESSAGE(2),
  /**
   * <code>CLIENT_EVENT_EXAMPLE_EVENT = 3;</code>
   */
  CLIENT_EVENT_EXAMPLE_EVENT(3),
  /**
   * <code>TEST_MESSAGE_WITH_FILE = 4;</code>
   */
  TEST_MESSAGE_WITH_FILE(4),
  /**
   * <code>AUDIO_UNLABELED = 1000;</code>
   */
  AUDIO_UNLABELED(1000),
  /**
   * <code>AUDIO_POSITIVE = 1004;</code>
   */
  AUDIO_POSITIVE(1004),
  /**
   * <code>AUDIO_NEGATIVE = 1005;</code>
   */
  AUDIO_NEGATIVE(1005),
  /**
   * <code>HOTWORD_INFO = 1001;</code>
   */
  HOTWORD_INFO(1001),
  /**
   * <code>HOTWORD_INFO_TEST = 1011;</code>
   */
  HOTWORD_INFO_TEST(1011),
  /**
   * <code>RECOGNITION_INFO = 1002;</code>
   */
  RECOGNITION_INFO(1002),
  /**
   * <code>CLIENT_EVENT_SERVER_HOTWORD_INFO = 1003;</code>
   */
  CLIENT_EVENT_SERVER_HOTWORD_INFO(1003),
  /**
   * <code>CLIENT_EVENT_SERVER_HOTWORD_MULTIDEVICE_SUPPRESSED = 1014;</code>
   */
  CLIENT_EVENT_SERVER_HOTWORD_MULTIDEVICE_SUPPRESSED(1014),
  /**
   * <code>CLIENT_EVENT_SERVER_RECOGNITION_INFO = 1010;</code>
   */
  CLIENT_EVENT_SERVER_RECOGNITION_INFO(1010),
  /**
   * <code>CLIENT_EVENT_SCREEN_OFF = 1006;</code>
   */
  CLIENT_EVENT_SCREEN_OFF(1006),
  /**
   * <code>CLIENT_EVENT_SCREEN_ON = 1007;</code>
   */
  CLIENT_EVENT_SCREEN_ON(1007),
  /**
   * <code>CLIENT_EVENT_DEVICE_UNLOCKED = 1008;</code>
   */
  CLIENT_EVENT_DEVICE_UNLOCKED(1008),
  /**
   * <code>CLIENT_EVENT_SERVER_EMPTY_QUERY = 1009 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  CLIENT_EVENT_SERVER_EMPTY_QUERY(1009),
  /**
   * <code>CLIENT_EVENT_OPA_TRIGGER_TYPE = 1012;</code>
   */
  CLIENT_EVENT_OPA_TRIGGER_TYPE(1012),
  /**
   * <code>CLIENT_EVENT_OPA_ACTIVITY_DISMISS = 1013;</code>
   */
  CLIENT_EVENT_OPA_ACTIVITY_DISMISS(1013),
  /**
   * <code>HOME_AEC_EVENT = 2000;</code>
   */
  HOME_AEC_EVENT(2000),
  /**
   * <code>HOME_ALARM_TIMER_EVENT = 2001;</code>
   */
  HOME_ALARM_TIMER_EVENT(2001),
  /**
   * <code>HOME_CONVERSATION_EVENT = 2002;</code>
   */
  HOME_CONVERSATION_EVENT(2002),
  /**
   * <code>HOME_DEVICE_STATE_EVENT = 2003;</code>
   */
  HOME_DEVICE_STATE_EVENT(2003),
  /**
   * <code>HOME_RECOGNITION_EVENT = 2004;</code>
   */
  HOME_RECOGNITION_EVENT(2004),
  /**
   * <code>HOME_DEVICE_SETTINGS = 2005;</code>
   */
  HOME_DEVICE_SETTINGS(2005),
  /**
   * <code>HOME_VOLUME_CHANGE_EVENT = 2006;</code>
   */
  HOME_VOLUME_CHANGE_EVENT(2006),
  /**
   * <code>HOME_SODA_AUDIO_EVENT = 2007;</code>
   */
  HOME_SODA_AUDIO_EVENT(2007),
  /**
   * <code>HOME_SODA_HOTWORD_EVENT = 2008;</code>
   */
  HOME_SODA_HOTWORD_EVENT(2008),
  /**
   * <code>HOME_VISION_FACE_BOUNDING_BOX_EVENT = 2009;</code>
   */
  HOME_VISION_FACE_BOUNDING_BOX_EVENT(2009),
  /**
   * <code>HOME_INTERACTION = 2010;</code>
   */
  HOME_INTERACTION(2010),
  /**
   * <code>HOME_USER_EVENT = 2011;</code>
   */
  HOME_USER_EVENT(2011),
  /**
   * <code>HOME_ACTIVE_SPEAKER_DETECTION = 2012;</code>
   */
  HOME_ACTIVE_SPEAKER_DETECTION(2012),
  /**
   * <code>HOME_GAZE = 2013;</code>
   */
  HOME_GAZE(2013),
  /**
   * <code>HOME_SCREEN_TOUCH = 2014;</code>
   */
  HOME_SCREEN_TOUCH(2014),
  /**
   * <code>GBOARD_CURSOR_MOVE = 3000;</code>
   */
  GBOARD_CURSOR_MOVE(3000),
  /**
   * <code>GBOARD_DELETION = 3001;</code>
   */
  GBOARD_DELETION(3001),
  /**
   * <code>GBOARD_INPUT_CONTEXT = 3002;</code>
   */
  GBOARD_INPUT_CONTEXT(3002),
  /**
   * <code>GBOARD_SESSION = 3003;</code>
   */
  GBOARD_SESSION(3003),
  /**
   * <code>GBOARD_TEXT_FRAGMENT = 3004;</code>
   */
  GBOARD_TEXT_FRAGMENT(3004),
  /**
   * <code>GBOARD_TEXT_METADATA = 3005;</code>
   */
  GBOARD_TEXT_METADATA(3005),
  /**
   * <code>GBOARD_VOICE_RECORDING = 3006;</code>
   */
  GBOARD_VOICE_RECORDING(3006),
  /**
   * <code>GBOARD_VOICE_INPUT_CONTEXT = 3007;</code>
   */
  GBOARD_VOICE_INPUT_CONTEXT(3007),
  ;

  /**
   * <code>UNKNOWN = 0;</code>
   */
  public static final int UNKNOWN_VALUE = 0;
  /**
   * <code>SESSION = 1;</code>
   */
  public static final int SESSION_VALUE = 1;
  /**
   * <code>TEST_MESSAGE = 2;</code>
   */
  public static final int TEST_MESSAGE_VALUE = 2;
  /**
   * <code>CLIENT_EVENT_EXAMPLE_EVENT = 3;</code>
   */
  public static final int CLIENT_EVENT_EXAMPLE_EVENT_VALUE = 3;
  /**
   * <code>TEST_MESSAGE_WITH_FILE = 4;</code>
   */
  public static final int TEST_MESSAGE_WITH_FILE_VALUE = 4;
  /**
   * <code>AUDIO_UNLABELED = 1000;</code>
   */
  public static final int AUDIO_UNLABELED_VALUE = 1000;
  /**
   * <code>AUDIO_POSITIVE = 1004;</code>
   */
  public static final int AUDIO_POSITIVE_VALUE = 1004;
  /**
   * <code>AUDIO_NEGATIVE = 1005;</code>
   */
  public static final int AUDIO_NEGATIVE_VALUE = 1005;
  /**
   * <code>HOTWORD_INFO = 1001;</code>
   */
  public static final int HOTWORD_INFO_VALUE = 1001;
  /**
   * <code>HOTWORD_INFO_TEST = 1011;</code>
   */
  public static final int HOTWORD_INFO_TEST_VALUE = 1011;
  /**
   * <code>RECOGNITION_INFO = 1002;</code>
   */
  public static final int RECOGNITION_INFO_VALUE = 1002;
  /**
   * <code>CLIENT_EVENT_SERVER_HOTWORD_INFO = 1003;</code>
   */
  public static final int CLIENT_EVENT_SERVER_HOTWORD_INFO_VALUE = 1003;
  /**
   * <code>CLIENT_EVENT_SERVER_HOTWORD_MULTIDEVICE_SUPPRESSED = 1014;</code>
   */
  public static final int CLIENT_EVENT_SERVER_HOTWORD_MULTIDEVICE_SUPPRESSED_VALUE = 1014;
  /**
   * <code>CLIENT_EVENT_SERVER_RECOGNITION_INFO = 1010;</code>
   */
  public static final int CLIENT_EVENT_SERVER_RECOGNITION_INFO_VALUE = 1010;
  /**
   * <code>CLIENT_EVENT_SCREEN_OFF = 1006;</code>
   */
  public static final int CLIENT_EVENT_SCREEN_OFF_VALUE = 1006;
  /**
   * <code>CLIENT_EVENT_SCREEN_ON = 1007;</code>
   */
  public static final int CLIENT_EVENT_SCREEN_ON_VALUE = 1007;
  /**
   * <code>CLIENT_EVENT_DEVICE_UNLOCKED = 1008;</code>
   */
  public static final int CLIENT_EVENT_DEVICE_UNLOCKED_VALUE = 1008;
  /**
   * <code>CLIENT_EVENT_SERVER_EMPTY_QUERY = 1009 [deprecated = true];</code>
   */
  @java.lang.Deprecated public static final int CLIENT_EVENT_SERVER_EMPTY_QUERY_VALUE = 1009;
  /**
   * <code>CLIENT_EVENT_OPA_TRIGGER_TYPE = 1012;</code>
   */
  public static final int CLIENT_EVENT_OPA_TRIGGER_TYPE_VALUE = 1012;
  /**
   * <code>CLIENT_EVENT_OPA_ACTIVITY_DISMISS = 1013;</code>
   */
  public static final int CLIENT_EVENT_OPA_ACTIVITY_DISMISS_VALUE = 1013;
  /**
   * <code>HOME_AEC_EVENT = 2000;</code>
   */
  public static final int HOME_AEC_EVENT_VALUE = 2000;
  /**
   * <code>HOME_ALARM_TIMER_EVENT = 2001;</code>
   */
  public static final int HOME_ALARM_TIMER_EVENT_VALUE = 2001;
  /**
   * <code>HOME_CONVERSATION_EVENT = 2002;</code>
   */
  public static final int HOME_CONVERSATION_EVENT_VALUE = 2002;
  /**
   * <code>HOME_DEVICE_STATE_EVENT = 2003;</code>
   */
  public static final int HOME_DEVICE_STATE_EVENT_VALUE = 2003;
  /**
   * <code>HOME_RECOGNITION_EVENT = 2004;</code>
   */
  public static final int HOME_RECOGNITION_EVENT_VALUE = 2004;
  /**
   * <code>HOME_DEVICE_SETTINGS = 2005;</code>
   */
  public static final int HOME_DEVICE_SETTINGS_VALUE = 2005;
  /**
   * <code>HOME_VOLUME_CHANGE_EVENT = 2006;</code>
   */
  public static final int HOME_VOLUME_CHANGE_EVENT_VALUE = 2006;
  /**
   * <code>HOME_SODA_AUDIO_EVENT = 2007;</code>
   */
  public static final int HOME_SODA_AUDIO_EVENT_VALUE = 2007;
  /**
   * <code>HOME_SODA_HOTWORD_EVENT = 2008;</code>
   */
  public static final int HOME_SODA_HOTWORD_EVENT_VALUE = 2008;
  /**
   * <code>HOME_VISION_FACE_BOUNDING_BOX_EVENT = 2009;</code>
   */
  public static final int HOME_VISION_FACE_BOUNDING_BOX_EVENT_VALUE = 2009;
  /**
   * <code>HOME_INTERACTION = 2010;</code>
   */
  public static final int HOME_INTERACTION_VALUE = 2010;
  /**
   * <code>HOME_USER_EVENT = 2011;</code>
   */
  public static final int HOME_USER_EVENT_VALUE = 2011;
  /**
   * <code>HOME_ACTIVE_SPEAKER_DETECTION = 2012;</code>
   */
  public static final int HOME_ACTIVE_SPEAKER_DETECTION_VALUE = 2012;
  /**
   * <code>HOME_GAZE = 2013;</code>
   */
  public static final int HOME_GAZE_VALUE = 2013;
  /**
   * <code>HOME_SCREEN_TOUCH = 2014;</code>
   */
  public static final int HOME_SCREEN_TOUCH_VALUE = 2014;
  /**
   * <code>GBOARD_CURSOR_MOVE = 3000;</code>
   */
  public static final int GBOARD_CURSOR_MOVE_VALUE = 3000;
  /**
   * <code>GBOARD_DELETION = 3001;</code>
   */
  public static final int GBOARD_DELETION_VALUE = 3001;
  /**
   * <code>GBOARD_INPUT_CONTEXT = 3002;</code>
   */
  public static final int GBOARD_INPUT_CONTEXT_VALUE = 3002;
  /**
   * <code>GBOARD_SESSION = 3003;</code>
   */
  public static final int GBOARD_SESSION_VALUE = 3003;
  /**
   * <code>GBOARD_TEXT_FRAGMENT = 3004;</code>
   */
  public static final int GBOARD_TEXT_FRAGMENT_VALUE = 3004;
  /**
   * <code>GBOARD_TEXT_METADATA = 3005;</code>
   */
  public static final int GBOARD_TEXT_METADATA_VALUE = 3005;
  /**
   * <code>GBOARD_VOICE_RECORDING = 3006;</code>
   */
  public static final int GBOARD_VOICE_RECORDING_VALUE = 3006;
  /**
   * <code>GBOARD_VOICE_INPUT_CONTEXT = 3007;</code>
   */
  public static final int GBOARD_VOICE_INPUT_CONTEXT_VALUE = 3007;


  public final int getNumber() {
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static EventType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EventType forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN;
      case 1: return SESSION;
      case 2: return TEST_MESSAGE;
      case 3: return CLIENT_EVENT_EXAMPLE_EVENT;
      case 4: return TEST_MESSAGE_WITH_FILE;
      case 1000: return AUDIO_UNLABELED;
      case 1004: return AUDIO_POSITIVE;
      case 1005: return AUDIO_NEGATIVE;
      case 1001: return HOTWORD_INFO;
      case 1011: return HOTWORD_INFO_TEST;
      case 1002: return RECOGNITION_INFO;
      case 1003: return CLIENT_EVENT_SERVER_HOTWORD_INFO;
      case 1014: return CLIENT_EVENT_SERVER_HOTWORD_MULTIDEVICE_SUPPRESSED;
      case 1010: return CLIENT_EVENT_SERVER_RECOGNITION_INFO;
      case 1006: return CLIENT_EVENT_SCREEN_OFF;
      case 1007: return CLIENT_EVENT_SCREEN_ON;
      case 1008: return CLIENT_EVENT_DEVICE_UNLOCKED;
      case 1009: return CLIENT_EVENT_SERVER_EMPTY_QUERY;
      case 1012: return CLIENT_EVENT_OPA_TRIGGER_TYPE;
      case 1013: return CLIENT_EVENT_OPA_ACTIVITY_DISMISS;
      case 2000: return HOME_AEC_EVENT;
      case 2001: return HOME_ALARM_TIMER_EVENT;
      case 2002: return HOME_CONVERSATION_EVENT;
      case 2003: return HOME_DEVICE_STATE_EVENT;
      case 2004: return HOME_RECOGNITION_EVENT;
      case 2005: return HOME_DEVICE_SETTINGS;
      case 2006: return HOME_VOLUME_CHANGE_EVENT;
      case 2007: return HOME_SODA_AUDIO_EVENT;
      case 2008: return HOME_SODA_HOTWORD_EVENT;
      case 2009: return HOME_VISION_FACE_BOUNDING_BOX_EVENT;
      case 2010: return HOME_INTERACTION;
      case 2011: return HOME_USER_EVENT;
      case 2012: return HOME_ACTIVE_SPEAKER_DETECTION;
      case 2013: return HOME_GAZE;
      case 2014: return HOME_SCREEN_TOUCH;
      case 3000: return GBOARD_CURSOR_MOVE;
      case 3001: return GBOARD_DELETION;
      case 3002: return GBOARD_INPUT_CONTEXT;
      case 3003: return GBOARD_SESSION;
      case 3004: return GBOARD_TEXT_FRAGMENT;
      case 3005: return GBOARD_TEXT_METADATA;
      case 3006: return GBOARD_VOICE_RECORDING;
      case 3007: return GBOARD_VOICE_INPUT_CONTEXT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EventType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EventType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EventType>() {
          public EventType findValueByNumber(int number) {
            return EventType.forNumber(number);
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
    return com.google.speech.trainingcache.EventTypeOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final EventType[] VALUES = values();

  public static EventType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private EventType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:speech.training_cache.EventType)
}

