/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/audio_config.proto

package com.google.cloud.dialogflow.v2;

public final class AudioConfigProto {
  private AudioConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SpeechContext_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SpeechContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SpeechWordInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SpeechWordInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_InputAudioConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_InputAudioConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_VoiceSelectionParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_VoiceSelectionParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SynthesizeSpeechConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SynthesizeSpeechConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_OutputAudioConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_OutputAudioConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_TelephonyDtmfEvents_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_TelephonyDtmfEvents_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SpeechToTextConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SpeechToTextConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/dialogflow/v2/audio_confi"
          + "g.proto\022\032google.cloud.dialogflow.v2\032\037goo"
          + "gle/api/field_behavior.proto\032\031google/api"
          + "/resource.proto\032\036google/protobuf/duratio"
          + "n.proto\032\034google/api/annotations.proto\"/\n"
          + "\rSpeechContext\022\017\n\007phrases\030\001 \003(\t\022\r\n\005boost"
          + "\030\002 \001(\002\"\222\001\n\016SpeechWordInfo\022\014\n\004word\030\003 \001(\t\022"
          + "/\n\014start_offset\030\001 \001(\0132\031.google.protobuf."
          + "Duration\022-\n\nend_offset\030\002 \001(\0132\031.google.pr"
          + "otobuf.Duration\022\022\n\nconfidence\030\004 \001(\002\"\233\003\n\020"
          + "InputAudioConfig\022A\n\016audio_encoding\030\001 \001(\016"
          + "2).google.cloud.dialogflow.v2.AudioEncod"
          + "ing\022\031\n\021sample_rate_hertz\030\002 \001(\005\022\025\n\rlangua"
          + "ge_code\030\003 \001(\t\022\030\n\020enable_word_info\030\r \001(\010\022"
          + "\030\n\014phrase_hints\030\004 \003(\tB\002\030\001\022B\n\017speech_cont"
          + "exts\030\013 \003(\0132).google.cloud.dialogflow.v2."
          + "SpeechContext\022\r\n\005model\030\007 \001(\t\022E\n\rmodel_va"
          + "riant\030\n \001(\0162..google.cloud.dialogflow.v2"
          + ".SpeechModelVariant\022\030\n\020single_utterance\030"
          + "\010 \001(\010\022*\n\"disable_no_speech_recognized_ev"
          + "ent\030\016 \001(\010\"f\n\024VoiceSelectionParams\022\014\n\004nam"
          + "e\030\001 \001(\t\022@\n\013ssml_gender\030\002 \001(\0162+.google.cl"
          + "oud.dialogflow.v2.SsmlVoiceGender\"\263\001\n\026Sy"
          + "nthesizeSpeechConfig\022\025\n\rspeaking_rate\030\001 "
          + "\001(\001\022\r\n\005pitch\030\002 \001(\001\022\026\n\016volume_gain_db\030\003 \001"
          + "(\001\022\032\n\022effects_profile_id\030\005 \003(\t\022?\n\005voice\030"
          + "\004 \001(\01320.google.cloud.dialogflow.v2.Voice"
          + "SelectionParams\"\322\001\n\021OutputAudioConfig\022L\n"
          + "\016audio_encoding\030\001 \001(\0162/.google.cloud.dia"
          + "logflow.v2.OutputAudioEncodingB\003\340A\002\022\031\n\021s"
          + "ample_rate_hertz\030\002 \001(\005\022T\n\030synthesize_spe"
          + "ech_config\030\003 \001(\01322.google.cloud.dialogfl"
          + "ow.v2.SynthesizeSpeechConfig\"U\n\023Telephon"
          + "yDtmfEvents\022>\n\013dtmf_events\030\001 \003(\0162).googl"
          + "e.cloud.dialogflow.v2.TelephonyDtmf\"g\n\022S"
          + "peechToTextConfig\022Q\n\024speech_model_varian"
          + "t\030\001 \001(\0162..google.cloud.dialogflow.v2.Spe"
          + "echModelVariantB\003\340A\001*\373\001\n\rAudioEncoding\022\036"
          + "\n\032AUDIO_ENCODING_UNSPECIFIED\020\000\022\034\n\030AUDIO_"
          + "ENCODING_LINEAR_16\020\001\022\027\n\023AUDIO_ENCODING_F"
          + "LAC\020\002\022\030\n\024AUDIO_ENCODING_MULAW\020\003\022\026\n\022AUDIO"
          + "_ENCODING_AMR\020\004\022\031\n\025AUDIO_ENCODING_AMR_WB"
          + "\020\005\022\033\n\027AUDIO_ENCODING_OGG_OPUS\020\006\022)\n%AUDIO"
          + "_ENCODING_SPEEX_WITH_HEADER_BYTE\020\007*v\n\022Sp"
          + "eechModelVariant\022$\n SPEECH_MODEL_VARIANT"
          + "_UNSPECIFIED\020\000\022\026\n\022USE_BEST_AVAILABLE\020\001\022\020"
          + "\n\014USE_STANDARD\020\002\022\020\n\014USE_ENHANCED\020\003*\215\001\n\017S"
          + "smlVoiceGender\022!\n\035SSML_VOICE_GENDER_UNSP"
          + "ECIFIED\020\000\022\032\n\026SSML_VOICE_GENDER_MALE\020\001\022\034\n"
          + "\030SSML_VOICE_GENDER_FEMALE\020\002\022\035\n\031SSML_VOIC"
          + "E_GENDER_NEUTRAL\020\003*\244\001\n\023OutputAudioEncodi"
          + "ng\022%\n!OUTPUT_AUDIO_ENCODING_UNSPECIFIED\020"
          + "\000\022#\n\037OUTPUT_AUDIO_ENCODING_LINEAR_16\020\001\022\035"
          + "\n\031OUTPUT_AUDIO_ENCODING_MP3\020\002\022\"\n\036OUTPUT_"
          + "AUDIO_ENCODING_OGG_OPUS\020\003*\224\002\n\rTelephonyD"
          + "tmf\022\036\n\032TELEPHONY_DTMF_UNSPECIFIED\020\000\022\014\n\010D"
          + "TMF_ONE\020\001\022\014\n\010DTMF_TWO\020\002\022\016\n\nDTMF_THREE\020\003\022"
          + "\r\n\tDTMF_FOUR\020\004\022\r\n\tDTMF_FIVE\020\005\022\014\n\010DTMF_SI"
          + "X\020\006\022\016\n\nDTMF_SEVEN\020\007\022\016\n\nDTMF_EIGHT\020\010\022\r\n\tD"
          + "TMF_NINE\020\t\022\r\n\tDTMF_ZERO\020\n\022\n\n\006DTMF_A\020\013\022\n\n"
          + "\006DTMF_B\020\014\022\n\n\006DTMF_C\020\r\022\n\n\006DTMF_D\020\016\022\r\n\tDTM"
          + "F_STAR\020\017\022\016\n\nDTMF_POUND\020\020B\237\001\n\036com.google."
          + "cloud.dialogflow.v2B\020AudioConfigProtoP\001Z"
          + "Dgoogle.golang.org/genproto/googleapis/c"
          + "loud/dialogflow/v2;dialogflow\370\001\001\242\002\002DF\252\002\032"
          + "Google.Cloud.Dialogflow.V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_v2_SpeechContext_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_SpeechContext_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SpeechContext_descriptor,
            new java.lang.String[] {
              "Phrases", "Boost",
            });
    internal_static_google_cloud_dialogflow_v2_SpeechWordInfo_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_SpeechWordInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SpeechWordInfo_descriptor,
            new java.lang.String[] {
              "Word", "StartOffset", "EndOffset", "Confidence",
            });
    internal_static_google_cloud_dialogflow_v2_InputAudioConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_InputAudioConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_InputAudioConfig_descriptor,
            new java.lang.String[] {
              "AudioEncoding",
              "SampleRateHertz",
              "LanguageCode",
              "EnableWordInfo",
              "PhraseHints",
              "SpeechContexts",
              "Model",
              "ModelVariant",
              "SingleUtterance",
              "DisableNoSpeechRecognizedEvent",
            });
    internal_static_google_cloud_dialogflow_v2_VoiceSelectionParams_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2_VoiceSelectionParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_VoiceSelectionParams_descriptor,
            new java.lang.String[] {
              "Name", "SsmlGender",
            });
    internal_static_google_cloud_dialogflow_v2_SynthesizeSpeechConfig_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2_SynthesizeSpeechConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SynthesizeSpeechConfig_descriptor,
            new java.lang.String[] {
              "SpeakingRate", "Pitch", "VolumeGainDb", "EffectsProfileId", "Voice",
            });
    internal_static_google_cloud_dialogflow_v2_OutputAudioConfig_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2_OutputAudioConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_OutputAudioConfig_descriptor,
            new java.lang.String[] {
              "AudioEncoding", "SampleRateHertz", "SynthesizeSpeechConfig",
            });
    internal_static_google_cloud_dialogflow_v2_TelephonyDtmfEvents_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2_TelephonyDtmfEvents_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_TelephonyDtmfEvents_descriptor,
            new java.lang.String[] {
              "DtmfEvents",
            });
    internal_static_google_cloud_dialogflow_v2_SpeechToTextConfig_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2_SpeechToTextConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SpeechToTextConfig_descriptor,
            new java.lang.String[] {
              "SpeechModelVariant",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
