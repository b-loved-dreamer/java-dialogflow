/*
 * Copyright 2019 Google LLC
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
          + "proto\032\037google/api/field_behavior.proto\032-"
          + "google/cloud/dialogflow/v2/audio_config."
          + "proto\032(google/cloud/dialogflow/v2/contex"
          + "t.proto\032\'google/cloud/dialogflow/v2/inte"
          + "nt.proto\0324google/cloud/dialogflow/v2/ses"
          + "sion_entity_type.proto\032\036google/protobuf/"
          + "duration.proto\032\034google/protobuf/struct.p"
          + "roto\032\027google/rpc/status.proto\032\030google/ty"
          + "pe/latlng.proto\"\240\002\n\023DetectIntentRequest\022"
          + "\024\n\007session\030\001 \001(\tB\003\340A\002\022F\n\014query_params\030\002 "
          + "\001(\0132+.google.cloud.dialogflow.v2.QueryPa"
          + "rametersB\003\340A\001\022@\n\013query_input\030\003 \001(\0132&.goo"
          + "gle.cloud.dialogflow.v2.QueryInputB\003\340A\002\022"
          + "O\n\023output_audio_config\030\004 \001(\0132-.google.cl"
          + "oud.dialogflow.v2.OutputAudioConfigB\003\340A\001"
          + "\022\030\n\013input_audio\030\005 \001(\014B\003\340A\001\"\370\001\n\024DetectInt"
          + "entResponse\022\023\n\013response_id\030\001 \001(\t\022=\n\014quer"
          + "y_result\030\002 \001(\0132\'.google.cloud.dialogflow"
          + ".v2.QueryResult\022*\n\016webhook_status\030\003 \001(\0132"
          + "\022.google.rpc.Status\022\024\n\014output_audio\030\004 \001("
          + "\014\022J\n\023output_audio_config\030\006 \001(\0132-.google."
          + "cloud.dialogflow.v2.OutputAudioConfig\"\237\003"
          + "\n\017QueryParameters\022\026\n\ttime_zone\030\001 \001(\tB\003\340A"
          + "\001\022.\n\014geo_location\030\002 \001(\0132\023.google.type.La"
          + "tLngB\003\340A\001\022:\n\010contexts\030\003 \003(\0132#.google.clo"
          + "ud.dialogflow.v2.ContextB\003\340A\001\022\033\n\016reset_c"
          + "ontexts\030\004 \001(\010B\003\340A\001\022P\n\024session_entity_typ"
          + "es\030\005 \003(\0132-.google.cloud.dialogflow.v2.Se"
          + "ssionEntityTypeB\003\340A\001\022-\n\007payload\030\006 \001(\0132\027."
          + "google.protobuf.StructB\003\340A\001\022j\n!sentiment"
          + "_analysis_request_config\030\n \001(\0132:.google."
          + "cloud.dialogflow.v2.SentimentAnalysisReq"
          + "uestConfigB\003\340A\001\"\313\001\n\nQueryInput\022D\n\014audio_"
          + "config\030\001 \001(\0132,.google.cloud.dialogflow.v"
          + "2.InputAudioConfigH\000\0225\n\004text\030\002 \001(\0132%.goo"
          + "gle.cloud.dialogflow.v2.TextInputH\000\0227\n\005e"
          + "vent\030\003 \001(\0132&.google.cloud.dialogflow.v2."
          + "EventInputH\000B\007\n\005input\"\220\005\n\013QueryResult\022\022\n"
          + "\nquery_text\030\001 \001(\t\022\025\n\rlanguage_code\030\017 \001(\t"
          + "\022%\n\035speech_recognition_confidence\030\002 \001(\002\022"
          + "\016\n\006action\030\003 \001(\t\022+\n\nparameters\030\004 \001(\0132\027.go"
          + "ogle.protobuf.Struct\022#\n\033all_required_par"
          + "ams_present\030\005 \001(\010\022\030\n\020fulfillment_text\030\006 "
          + "\001(\t\022H\n\024fulfillment_messages\030\007 \003(\0132*.goog"
          + "le.cloud.dialogflow.v2.Intent.Message\022\026\n"
          + "\016webhook_source\030\010 \001(\t\0220\n\017webhook_payload"
          + "\030\t \001(\0132\027.google.protobuf.Struct\022<\n\017outpu"
          + "t_contexts\030\n \003(\0132#.google.cloud.dialogfl"
          + "ow.v2.Context\0222\n\006intent\030\013 \001(\0132\".google.c"
          + "loud.dialogflow.v2.Intent\022#\n\033intent_dete"
          + "ction_confidence\030\014 \001(\002\0220\n\017diagnostic_inf"
          + "o\030\016 \001(\0132\027.google.protobuf.Struct\022V\n\031sent"
          + "iment_analysis_result\030\021 \001(\01323.google.clo"
          + "ud.dialogflow.v2.SentimentAnalysisResult"
          + "\"\312\002\n\034StreamingDetectIntentRequest\022\024\n\007ses"
          + "sion\030\001 \001(\tB\003\340A\002\022F\n\014query_params\030\002 \001(\0132+."
          + "google.cloud.dialogflow.v2.QueryParamete"
          + "rsB\003\340A\001\022@\n\013query_input\030\003 \001(\0132&.google.cl"
          + "oud.dialogflow.v2.QueryInputB\003\340A\002\022\037\n\020sin"
          + "gle_utterance\030\004 \001(\010B\005\030\001\340A\001\022O\n\023output_aud"
          + "io_config\030\005 \001(\0132-.google.cloud.dialogflo"
          + "w.v2.OutputAudioConfigB\003\340A\001\022\030\n\013input_aud"
          + "io\030\006 \001(\014B\003\340A\001\"\325\002\n\035StreamingDetectIntentR"
          + "esponse\022\023\n\013response_id\030\001 \001(\t\022R\n\022recognit"
          + "ion_result\030\002 \001(\01326.google.cloud.dialogfl"
          + "ow.v2.StreamingRecognitionResult\022=\n\014quer"
          + "y_result\030\003 \001(\0132\'.google.cloud.dialogflow"
          + ".v2.QueryResult\022*\n\016webhook_status\030\004 \001(\0132"
          + "\022.google.rpc.Status\022\024\n\014output_audio\030\005 \001("
          + "\014\022J\n\023output_audio_config\030\006 \001(\0132-.google."
          + "cloud.dialogflow.v2.OutputAudioConfig\"\206\003"
          + "\n\032StreamingRecognitionResult\022X\n\014message_"
          + "type\030\001 \001(\0162B.google.cloud.dialogflow.v2."
          + "StreamingRecognitionResult.MessageType\022\022"
          + "\n\ntranscript\030\002 \001(\t\022\020\n\010is_final\030\003 \001(\010\022\022\n\n"
          + "confidence\030\004 \001(\002\022D\n\020speech_word_info\030\007 \003"
          + "(\0132*.google.cloud.dialogflow.v2.SpeechWo"
          + "rdInfo\0224\n\021speech_end_offset\030\010 \001(\0132\031.goog"
          + "le.protobuf.Duration\"X\n\013MessageType\022\034\n\030M"
          + "ESSAGE_TYPE_UNSPECIFIED\020\000\022\016\n\nTRANSCRIPT\020"
          + "\001\022\033\n\027END_OF_SINGLE_UTTERANCE\020\002\":\n\tTextIn"
          + "put\022\021\n\004text\030\001 \001(\tB\003\340A\002\022\032\n\rlanguage_code\030"
          + "\002 \001(\tB\003\340A\002\"m\n\nEventInput\022\021\n\004name\030\001 \001(\tB\003"
          + "\340A\002\0220\n\nparameters\030\002 \001(\0132\027.google.protobu"
          + "f.StructB\003\340A\001\022\032\n\rlanguage_code\030\003 \001(\tB\003\340A"
          + "\002\"K\n\036SentimentAnalysisRequestConfig\022)\n\034a"
          + "nalyze_query_text_sentiment\030\001 \001(\010B\003\340A\001\"^"
          + "\n\027SentimentAnalysisResult\022C\n\024query_text_"
          + "sentiment\030\001 \001(\0132%.google.cloud.dialogflo"
          + "w.v2.Sentiment\"-\n\tSentiment\022\r\n\005score\030\001 \001"
          + "(\002\022\021\n\tmagnitude\030\002 \001(\0022\346\003\n\010Sessions\022\312\001\n\014D"
          + "etectIntent\022/.google.cloud.dialogflow.v2"
          + ".DetectIntentRequest\0320.google.cloud.dial"
          + "ogflow.v2.DetectIntentResponse\"W\202\323\344\223\002;\"6"
          + "/v2/{session=projects/*/agent/sessions/*"
          + "}:detectIntent:\001*\332A\023session,query_input\022"
          + "\222\001\n\025StreamingDetectIntent\0228.google.cloud"
          + ".dialogflow.v2.StreamingDetectIntentRequ"
          + "est\0329.google.cloud.dialogflow.v2.Streami"
          + "ngDetectIntentResponse\"\000(\0010\001\032x\312A\031dialogf"
          + "low.googleapis.com\322AYhttps://www.googlea"
          + "pis.com/auth/cloud-platform,https://www."
          + "googleapis.com/auth/dialogflowB\233\001\n\036com.g"
          + "oogle.cloud.dialogflow.v2B\014SessionProtoP"
          + "\001ZDgoogle.golang.org/genproto/googleapis"
          + "/cloud/dialogflow/v2;dialogflow\370\001\001\242\002\002DF\252"
          + "\002\032Google.Cloud.Dialogflow.V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.dialogflow.v2.AudioConfigProto.getDescriptor(),
              com.google.cloud.dialogflow.v2.ContextProto.getDescriptor(),
              com.google.cloud.dialogflow.v2.IntentProto.getDescriptor(),
              com.google.cloud.dialogflow.v2.SessionEntityTypeProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
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
              "Session", "QueryParams", "QueryInput", "OutputAudioConfig", "InputAudio",
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
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.dialogflow.v2.AudioConfigProto.getDescriptor();
    com.google.cloud.dialogflow.v2.ContextProto.getDescriptor();
    com.google.cloud.dialogflow.v2.IntentProto.getDescriptor();
    com.google.cloud.dialogflow.v2.SessionEntityTypeProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.type.LatLngProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
