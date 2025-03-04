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
// source: google/cloud/dialogflow/v2/session.proto

package com.google.cloud.dialogflow.v2;

public final class SessionProto {
  private SessionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_DetectIntentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DetectIntentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_DetectIntentResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DetectIntentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_QueryParameters_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_QueryParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_QueryParameters_WebhookHeadersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_QueryParameters_WebhookHeadersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_QueryInput_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_QueryInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_QueryResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_QueryResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_StreamingRecognitionResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_StreamingRecognitionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_TextInput_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_TextInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_EventInput_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_EventInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SentimentAnalysisRequestConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SentimentAnalysisRequestConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SentimentAnalysisResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SentimentAnalysisResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_Sentiment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_Sentiment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/dialogflow/v2/session.pro"
          + "to\022\032google.cloud.dialogflow.v2\032\034google/a"
          + "pi/annotations.proto\032\027google/api/client."
          + "proto\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\032-google/cloud/"
          + "dialogflow/v2/audio_config.proto\032(google"
          + "/cloud/dialogflow/v2/context.proto\032\'goog"
          + "le/cloud/dialogflow/v2/intent.proto\0324goo"
          + "gle/cloud/dialogflow/v2/session_entity_t"
          + "ype.proto\032\036google/protobuf/duration.prot"
          + "o\032 google/protobuf/field_mask.proto\032\034goo"
          + "gle/protobuf/struct.proto\032\027google/rpc/st"
          + "atus.proto\032\030google/type/latlng.proto\"\365\002\n"
          + "\023DetectIntentRequest\022:\n\007session\030\001 \001(\tB)\340"
          + "A\002\372A#\n!dialogflow.googleapis.com/Session"
          + "\022A\n\014query_params\030\002 \001(\0132+.google.cloud.di"
          + "alogflow.v2.QueryParameters\022@\n\013query_inp"
          + "ut\030\003 \001(\0132&.google.cloud.dialogflow.v2.Qu"
          + "eryInputB\003\340A\002\022J\n\023output_audio_config\030\004 \001"
          + "(\0132-.google.cloud.dialogflow.v2.OutputAu"
          + "dioConfig\022<\n\030output_audio_config_mask\030\007 "
          + "\001(\0132\032.google.protobuf.FieldMask\022\023\n\013input"
          + "_audio\030\005 \001(\014\"\370\001\n\024DetectIntentResponse\022\023\n"
          + "\013response_id\030\001 \001(\t\022=\n\014query_result\030\002 \001(\013"
          + "2\'.google.cloud.dialogflow.v2.QueryResul"
          + "t\022*\n\016webhook_status\030\003 \001(\0132\022.google.rpc.S"
          + "tatus\022\024\n\014output_audio\030\004 \001(\014\022J\n\023output_au"
          + "dio_config\030\006 \001(\0132-.google.cloud.dialogfl"
          + "ow.v2.OutputAudioConfig\"\215\004\n\017QueryParamet"
          + "ers\022\021\n\ttime_zone\030\001 \001(\t\022)\n\014geo_location\030\002"
          + " \001(\0132\023.google.type.LatLng\0225\n\010contexts\030\003 "
          + "\003(\0132#.google.cloud.dialogflow.v2.Context"
          + "\022\026\n\016reset_contexts\030\004 \001(\010\022K\n\024session_enti"
          + "ty_types\030\005 \003(\0132-.google.cloud.dialogflow"
          + ".v2.SessionEntityType\022(\n\007payload\030\006 \001(\0132\027"
          + ".google.protobuf.Struct\022e\n!sentiment_ana"
          + "lysis_request_config\030\n \001(\0132:.google.clou"
          + "d.dialogflow.v2.SentimentAnalysisRequest"
          + "Config\022X\n\017webhook_headers\030\016 \003(\0132?.google"
          + ".cloud.dialogflow.v2.QueryParameters.Web"
          + "hookHeadersEntry\0325\n\023WebhookHeadersEntry\022"
          + "\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\313\001\n\nQuer"
          + "yInput\022D\n\014audio_config\030\001 \001(\0132,.google.cl"
          + "oud.dialogflow.v2.InputAudioConfigH\000\0225\n\004"
          + "text\030\002 \001(\0132%.google.cloud.dialogflow.v2."
          + "TextInputH\000\0227\n\005event\030\003 \001(\0132&.google.clou"
          + "d.dialogflow.v2.EventInputH\000B\007\n\005input\"\220\005"
          + "\n\013QueryResult\022\022\n\nquery_text\030\001 \001(\t\022\025\n\rlan"
          + "guage_code\030\017 \001(\t\022%\n\035speech_recognition_c"
          + "onfidence\030\002 \001(\002\022\016\n\006action\030\003 \001(\t\022+\n\nparam"
          + "eters\030\004 \001(\0132\027.google.protobuf.Struct\022#\n\033"
          + "all_required_params_present\030\005 \001(\010\022\030\n\020ful"
          + "fillment_text\030\006 \001(\t\022H\n\024fulfillment_messa"
          + "ges\030\007 \003(\0132*.google.cloud.dialogflow.v2.I"
          + "ntent.Message\022\026\n\016webhook_source\030\010 \001(\t\0220\n"
          + "\017webhook_payload\030\t \001(\0132\027.google.protobuf"
          + ".Struct\022<\n\017output_contexts\030\n \003(\0132#.googl"
          + "e.cloud.dialogflow.v2.Context\0222\n\006intent\030"
          + "\013 \001(\0132\".google.cloud.dialogflow.v2.Inten"
          + "t\022#\n\033intent_detection_confidence\030\014 \001(\002\0220"
          + "\n\017diagnostic_info\030\016 \001(\0132\027.google.protobu"
          + "f.Struct\022V\n\031sentiment_analysis_result\030\021 "
          + "\001(\01323.google.cloud.dialogflow.v2.Sentime"
          + "ntAnalysisResult\"\234\003\n\034StreamingDetectInte"
          + "ntRequest\022:\n\007session\030\001 \001(\tB)\340A\002\372A#\n!dial"
          + "ogflow.googleapis.com/Session\022A\n\014query_p"
          + "arams\030\002 \001(\0132+.google.cloud.dialogflow.v2"
          + ".QueryParameters\022@\n\013query_input\030\003 \001(\0132&."
          + "google.cloud.dialogflow.v2.QueryInputB\003\340"
          + "A\002\022\034\n\020single_utterance\030\004 \001(\010B\002\030\001\022J\n\023outp"
          + "ut_audio_config\030\005 \001(\0132-.google.cloud.dia"
          + "logflow.v2.OutputAudioConfig\022<\n\030output_a"
          + "udio_config_mask\030\007 \001(\0132\032.google.protobuf"
          + ".FieldMask\022\023\n\013input_audio\030\006 \001(\014\"\325\002\n\035Stre"
          + "amingDetectIntentResponse\022\023\n\013response_id"
          + "\030\001 \001(\t\022R\n\022recognition_result\030\002 \001(\01326.goo"
          + "gle.cloud.dialogflow.v2.StreamingRecogni"
          + "tionResult\022=\n\014query_result\030\003 \001(\0132\'.googl"
          + "e.cloud.dialogflow.v2.QueryResult\022*\n\016web"
          + "hook_status\030\004 \001(\0132\022.google.rpc.Status\022\024\n"
          + "\014output_audio\030\005 \001(\014\022J\n\023output_audio_conf"
          + "ig\030\006 \001(\0132-.google.cloud.dialogflow.v2.Ou"
          + "tputAudioConfig\"\206\003\n\032StreamingRecognition"
          + "Result\022X\n\014message_type\030\001 \001(\0162B.google.cl"
          + "oud.dialogflow.v2.StreamingRecognitionRe"
          + "sult.MessageType\022\022\n\ntranscript\030\002 \001(\t\022\020\n\010"
          + "is_final\030\003 \001(\010\022\022\n\nconfidence\030\004 \001(\002\022D\n\020sp"
          + "eech_word_info\030\007 \003(\0132*.google.cloud.dial"
          + "ogflow.v2.SpeechWordInfo\0224\n\021speech_end_o"
          + "ffset\030\010 \001(\0132\031.google.protobuf.Duration\"X"
          + "\n\013MessageType\022\034\n\030MESSAGE_TYPE_UNSPECIFIE"
          + "D\020\000\022\016\n\nTRANSCRIPT\020\001\022\033\n\027END_OF_SINGLE_UTT"
          + "ERANCE\020\002\":\n\tTextInput\022\021\n\004text\030\001 \001(\tB\003\340A\002"
          + "\022\032\n\rlanguage_code\030\002 \001(\tB\003\340A\002\"h\n\nEventInp"
          + "ut\022\021\n\004name\030\001 \001(\tB\003\340A\002\022+\n\nparameters\030\002 \001("
          + "\0132\027.google.protobuf.Struct\022\032\n\rlanguage_c"
          + "ode\030\003 \001(\tB\003\340A\002\"F\n\036SentimentAnalysisReque"
          + "stConfig\022$\n\034analyze_query_text_sentiment"
          + "\030\001 \001(\010\"^\n\027SentimentAnalysisResult\022C\n\024que"
          + "ry_text_sentiment\030\001 \001(\0132%.google.cloud.d"
          + "ialogflow.v2.Sentiment\"-\n\tSentiment\022\r\n\005s"
          + "core\030\001 \001(\002\022\021\n\tmagnitude\030\002 \001(\0022\274\004\n\010Sessio"
          + "ns\022\240\002\n\014DetectIntent\022/.google.cloud.dialo"
          + "gflow.v2.DetectIntentRequest\0320.google.cl"
          + "oud.dialogflow.v2.DetectIntentResponse\"\254"
          + "\001\202\323\344\223\002\217\001\"6/v2/{session=projects/*/agent/"
          + "sessions/*}:detectIntent:\001*ZR\"M/v2/{sess"
          + "ion=projects/*/agent/environments/*/user"
          + "s/*/sessions/*}:detectIntent:\001*\332A\023sessio"
          + "n,query_input\022\222\001\n\025StreamingDetectIntent\022"
          + "8.google.cloud.dialogflow.v2.StreamingDe"
          + "tectIntentRequest\0329.google.cloud.dialogf"
          + "low.v2.StreamingDetectIntentResponse\"\000(\001"
          + "0\001\032x\312A\031dialogflow.googleapis.com\322AYhttps"
          + "://www.googleapis.com/auth/cloud-platfor"
          + "m,https://www.googleapis.com/auth/dialog"
          + "flowB\304\002\n\036com.google.cloud.dialogflow.v2B"
          + "\014SessionProtoP\001ZDgoogle.golang.org/genpr"
          + "oto/googleapis/cloud/dialogflow/v2;dialo"
          + "gflow\370\001\001\242\002\002DF\252\002\032Google.Cloud.Dialogflow."
          + "V2\352A\245\001\n!dialogflow.googleapis.com/Sessio"
          + "n\022+projects/{project}/agent/sessions/{se"
          + "ssion}\022Sprojects/{project}/agent/environ"
          + "ments/{environment}/users/{user}/session"
          + "s/{session}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.v2.AudioConfigProto.getDescriptor(),
              com.google.cloud.dialogflow.v2.ContextProto.getDescriptor(),
              com.google.cloud.dialogflow.v2.IntentProto.getDescriptor(),
              com.google.cloud.dialogflow.v2.SessionEntityTypeProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
              com.google.type.LatLngProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_v2_DetectIntentRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_DetectIntentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_DetectIntentRequest_descriptor,
            new java.lang.String[] {
              "Session",
              "QueryParams",
              "QueryInput",
              "OutputAudioConfig",
              "OutputAudioConfigMask",
              "InputAudio",
            });
    internal_static_google_cloud_dialogflow_v2_DetectIntentResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_DetectIntentResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_DetectIntentResponse_descriptor,
            new java.lang.String[] {
              "ResponseId", "QueryResult", "WebhookStatus", "OutputAudio", "OutputAudioConfig",
            });
    internal_static_google_cloud_dialogflow_v2_QueryParameters_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_QueryParameters_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_QueryParameters_descriptor,
            new java.lang.String[] {
              "TimeZone",
              "GeoLocation",
              "Contexts",
              "ResetContexts",
              "SessionEntityTypes",
              "Payload",
              "SentimentAnalysisRequestConfig",
              "WebhookHeaders",
            });
    internal_static_google_cloud_dialogflow_v2_QueryParameters_WebhookHeadersEntry_descriptor =
        internal_static_google_cloud_dialogflow_v2_QueryParameters_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_v2_QueryParameters_WebhookHeadersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_QueryParameters_WebhookHeadersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dialogflow_v2_QueryInput_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2_QueryInput_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_QueryInput_descriptor,
            new java.lang.String[] {
              "AudioConfig", "Text", "Event", "Input",
            });
    internal_static_google_cloud_dialogflow_v2_QueryResult_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2_QueryResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_QueryResult_descriptor,
            new java.lang.String[] {
              "QueryText",
              "LanguageCode",
              "SpeechRecognitionConfidence",
              "Action",
              "Parameters",
              "AllRequiredParamsPresent",
              "FulfillmentText",
              "FulfillmentMessages",
              "WebhookSource",
              "WebhookPayload",
              "OutputContexts",
              "Intent",
              "IntentDetectionConfidence",
              "DiagnosticInfo",
              "SentimentAnalysisResult",
            });
    internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentRequest_descriptor,
            new java.lang.String[] {
              "Session",
              "QueryParams",
              "QueryInput",
              "SingleUtterance",
              "OutputAudioConfig",
              "OutputAudioConfigMask",
              "InputAudio",
            });
    internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentResponse_descriptor,
            new java.lang.String[] {
              "ResponseId",
              "RecognitionResult",
              "QueryResult",
              "WebhookStatus",
              "OutputAudio",
              "OutputAudioConfig",
            });
    internal_static_google_cloud_dialogflow_v2_StreamingRecognitionResult_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2_StreamingRecognitionResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_StreamingRecognitionResult_descriptor,
            new java.lang.String[] {
              "MessageType",
              "Transcript",
              "IsFinal",
              "Confidence",
              "SpeechWordInfo",
              "SpeechEndOffset",
            });
    internal_static_google_cloud_dialogflow_v2_TextInput_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2_TextInput_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_TextInput_descriptor,
            new java.lang.String[] {
              "Text", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2_EventInput_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_v2_EventInput_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_EventInput_descriptor,
            new java.lang.String[] {
              "Name", "Parameters", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2_SentimentAnalysisRequestConfig_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_v2_SentimentAnalysisRequestConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SentimentAnalysisRequestConfig_descriptor,
            new java.lang.String[] {
              "AnalyzeQueryTextSentiment",
            });
    internal_static_google_cloud_dialogflow_v2_SentimentAnalysisResult_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_v2_SentimentAnalysisResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SentimentAnalysisResult_descriptor,
            new java.lang.String[] {
              "QueryTextSentiment",
            });
    internal_static_google_cloud_dialogflow_v2_Sentiment_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_v2_Sentiment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_Sentiment_descriptor,
            new java.lang.String[] {
              "Score", "Magnitude",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.v2.AudioConfigProto.getDescriptor();
    com.google.cloud.dialogflow.v2.ContextProto.getDescriptor();
    com.google.cloud.dialogflow.v2.IntentProto.getDescriptor();
    com.google.cloud.dialogflow.v2.SessionEntityTypeProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.type.LatLngProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
