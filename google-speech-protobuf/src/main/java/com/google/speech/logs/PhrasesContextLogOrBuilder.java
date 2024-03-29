// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/recognizer_log.proto

package com.google.speech.logs;

public interface PhrasesContextLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:speech.logs.PhrasesContextLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 num_phrases = 1;</code>
   * @return Whether the numPhrases field is set.
   */
  boolean hasNumPhrases();
  /**
   * <code>optional int32 num_phrases = 1;</code>
   * @return The numPhrases.
   */
  int getNumPhrases();

  /**
   * <code>optional .speech.logs.GrammarIdsContextLog.GrammarIdLog phrases_id_log = 2;</code>
   * @return Whether the phrasesIdLog field is set.
   */
  boolean hasPhrasesIdLog();
  /**
   * <code>optional .speech.logs.GrammarIdsContextLog.GrammarIdLog phrases_id_log = 2;</code>
   * @return The phrasesIdLog.
   */
  com.google.speech.logs.GrammarIdsContextLog.GrammarIdLog getPhrasesIdLog();
  /**
   * <code>optional .speech.logs.GrammarIdsContextLog.GrammarIdLog phrases_id_log = 2;</code>
   */
  com.google.speech.logs.GrammarIdsContextLog.GrammarIdLogOrBuilder getPhrasesIdLogOrBuilder();
}
