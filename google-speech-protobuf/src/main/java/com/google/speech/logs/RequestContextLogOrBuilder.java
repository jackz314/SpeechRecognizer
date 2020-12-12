// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/recognizer_log.proto

package com.google.speech.logs;

public interface RequestContextLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:speech.logs.RequestContextLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string type = 1;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <code>optional string type = 1;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>optional string type = 1;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>optional string name = 2;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <code>optional string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string language = 3 [deprecated = true];</code>
   * @return Whether the language field is set.
   */
  @java.lang.Deprecated boolean hasLanguage();
  /**
   * <code>optional string language = 3 [deprecated = true];</code>
   * @return The language.
   */
  @java.lang.Deprecated java.lang.String getLanguage();
  /**
   * <code>optional string language = 3 [deprecated = true];</code>
   * @return The bytes for language.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getLanguageBytes();

  /**
   * <code>optional bool enabled = 9;</code>
   * @return Whether the enabled field is set.
   */
  boolean hasEnabled();
  /**
   * <code>optional bool enabled = 9;</code>
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   * <code>optional bool disabled_by_exp = 10;</code>
   * @return Whether the disabledByExp field is set.
   */
  boolean hasDisabledByExp();
  /**
   * <code>optional bool disabled_by_exp = 10;</code>
   * @return The disabledByExp.
   */
  boolean getDisabledByExp();

  /**
   * <code>optional string source = 14;</code>
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   * <code>optional string source = 14;</code>
   * @return The source.
   */
  java.lang.String getSource();
  /**
   * <code>optional string source = 14;</code>
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString
      getSourceBytes();

  /**
   * <code>optional .speech.logs.OOVContextLog oov_context = 11;</code>
   * @return Whether the oovContext field is set.
   */
  boolean hasOovContext();
  /**
   * <code>optional .speech.logs.OOVContextLog oov_context = 11;</code>
   * @return The oovContext.
   */
  com.google.speech.logs.OOVContextLog getOovContext();
  /**
   * <code>optional .speech.logs.OOVContextLog oov_context = 11;</code>
   */
  com.google.speech.logs.OOVContextLogOrBuilder getOovContextOrBuilder();

  /**
   * <code>repeated .speech.logs.PhrasesContextLog phrases_context_log = 4;</code>
   */
  java.util.List<com.google.speech.logs.PhrasesContextLog> 
      getPhrasesContextLogList();
  /**
   * <code>repeated .speech.logs.PhrasesContextLog phrases_context_log = 4;</code>
   */
  com.google.speech.logs.PhrasesContextLog getPhrasesContextLog(int index);
  /**
   * <code>repeated .speech.logs.PhrasesContextLog phrases_context_log = 4;</code>
   */
  int getPhrasesContextLogCount();
  /**
   * <code>repeated .speech.logs.PhrasesContextLog phrases_context_log = 4;</code>
   */
  java.util.List<? extends com.google.speech.logs.PhrasesContextLogOrBuilder> 
      getPhrasesContextLogOrBuilderList();
  /**
   * <code>repeated .speech.logs.PhrasesContextLog phrases_context_log = 4;</code>
   */
  com.google.speech.logs.PhrasesContextLogOrBuilder getPhrasesContextLogOrBuilder(
      int index);

  /**
   * <code>optional .speech.logs.GrammarIdsContextLog grammar_ids_context_log = 7;</code>
   * @return Whether the grammarIdsContextLog field is set.
   */
  boolean hasGrammarIdsContextLog();
  /**
   * <code>optional .speech.logs.GrammarIdsContextLog grammar_ids_context_log = 7;</code>
   * @return The grammarIdsContextLog.
   */
  com.google.speech.logs.GrammarIdsContextLog getGrammarIdsContextLog();
  /**
   * <code>optional .speech.logs.GrammarIdsContextLog grammar_ids_context_log = 7;</code>
   */
  com.google.speech.logs.GrammarIdsContextLogOrBuilder getGrammarIdsContextLogOrBuilder();

  /**
   * <code>optional .speech.logs.SurroundingTextContextLog surrounding_text_context_log = 8;</code>
   * @return Whether the surroundingTextContextLog field is set.
   */
  boolean hasSurroundingTextContextLog();
  /**
   * <code>optional .speech.logs.SurroundingTextContextLog surrounding_text_context_log = 8;</code>
   * @return The surroundingTextContextLog.
   */
  com.google.speech.logs.SurroundingTextContextLog getSurroundingTextContextLog();
  /**
   * <code>optional .speech.logs.SurroundingTextContextLog surrounding_text_context_log = 8;</code>
   */
  com.google.speech.logs.SurroundingTextContextLogOrBuilder getSurroundingTextContextLogOrBuilder();

  /**
   * <code>optional .speech.logs.TopContactsContextLog top_contacts_context_log = 6;</code>
   * @return Whether the topContactsContextLog field is set.
   */
  boolean hasTopContactsContextLog();
  /**
   * <code>optional .speech.logs.TopContactsContextLog top_contacts_context_log = 6;</code>
   * @return The topContactsContextLog.
   */
  com.google.speech.logs.TopContactsContextLog getTopContactsContextLog();
  /**
   * <code>optional .speech.logs.TopContactsContextLog top_contacts_context_log = 6;</code>
   */
  com.google.speech.logs.TopContactsContextLogOrBuilder getTopContactsContextLogOrBuilder();

  /**
   * <code>repeated .speech.logs.DynamicClassContextLog dynamic_class_context_log = 12;</code>
   */
  java.util.List<com.google.speech.logs.DynamicClassContextLog> 
      getDynamicClassContextLogList();
  /**
   * <code>repeated .speech.logs.DynamicClassContextLog dynamic_class_context_log = 12;</code>
   */
  com.google.speech.logs.DynamicClassContextLog getDynamicClassContextLog(int index);
  /**
   * <code>repeated .speech.logs.DynamicClassContextLog dynamic_class_context_log = 12;</code>
   */
  int getDynamicClassContextLogCount();
  /**
   * <code>repeated .speech.logs.DynamicClassContextLog dynamic_class_context_log = 12;</code>
   */
  java.util.List<? extends com.google.speech.logs.DynamicClassContextLogOrBuilder> 
      getDynamicClassContextLogOrBuilderList();
  /**
   * <code>repeated .speech.logs.DynamicClassContextLog dynamic_class_context_log = 12;</code>
   */
  com.google.speech.logs.DynamicClassContextLogOrBuilder getDynamicClassContextLogOrBuilder(
      int index);

  /**
   * <code>repeated .speech.logs.AbnfGrammarsContextLog abnf_grammars_context_log = 13;</code>
   */
  java.util.List<com.google.speech.logs.AbnfGrammarsContextLog> 
      getAbnfGrammarsContextLogList();
  /**
   * <code>repeated .speech.logs.AbnfGrammarsContextLog abnf_grammars_context_log = 13;</code>
   */
  com.google.speech.logs.AbnfGrammarsContextLog getAbnfGrammarsContextLog(int index);
  /**
   * <code>repeated .speech.logs.AbnfGrammarsContextLog abnf_grammars_context_log = 13;</code>
   */
  int getAbnfGrammarsContextLogCount();
  /**
   * <code>repeated .speech.logs.AbnfGrammarsContextLog abnf_grammars_context_log = 13;</code>
   */
  java.util.List<? extends com.google.speech.logs.AbnfGrammarsContextLogOrBuilder> 
      getAbnfGrammarsContextLogOrBuilderList();
  /**
   * <code>repeated .speech.logs.AbnfGrammarsContextLog abnf_grammars_context_log = 13;</code>
   */
  com.google.speech.logs.AbnfGrammarsContextLogOrBuilder getAbnfGrammarsContextLogOrBuilder(
      int index);

  /**
   * <code>optional .speech.logs.FocusContactsContextLog focus_contacts_context_log = 15;</code>
   * @return Whether the focusContactsContextLog field is set.
   */
  boolean hasFocusContactsContextLog();
  /**
   * <code>optional .speech.logs.FocusContactsContextLog focus_contacts_context_log = 15;</code>
   * @return The focusContactsContextLog.
   */
  com.google.speech.logs.FocusContactsContextLog getFocusContactsContextLog();
  /**
   * <code>optional .speech.logs.FocusContactsContextLog focus_contacts_context_log = 15;</code>
   */
  com.google.speech.logs.FocusContactsContextLogOrBuilder getFocusContactsContextLogOrBuilder();

  /**
   * <code>optional .speech.logs.EndpointerContextLog endpointer_context_log = 16;</code>
   * @return Whether the endpointerContextLog field is set.
   */
  boolean hasEndpointerContextLog();
  /**
   * <code>optional .speech.logs.EndpointerContextLog endpointer_context_log = 16;</code>
   * @return The endpointerContextLog.
   */
  com.google.speech.logs.EndpointerContextLog getEndpointerContextLog();
  /**
   * <code>optional .speech.logs.EndpointerContextLog endpointer_context_log = 16;</code>
   */
  com.google.speech.logs.EndpointerContextLogOrBuilder getEndpointerContextLogOrBuilder();
}