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
// source: google/cloud/dialogflow/v2/participant.proto

package com.google.cloud.dialogflow.v2;

public final class ParticipantProto {
  private ParticipantProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_Participant_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_Participant_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_Message_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_Message_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_CreateParticipantRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_CreateParticipantRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_GetParticipantRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_GetParticipantRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListParticipantsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListParticipantsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListParticipantsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListParticipantsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_UpdateParticipantRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_UpdateParticipantRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_AnalyzeContentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_AnalyzeContentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_DtmfParameters_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DtmfParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_AnalyzeContentResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_AnalyzeContentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SuggestArticlesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SuggestArticlesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SuggestArticlesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SuggestArticlesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SuggestFaqAnswersRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SuggestFaqAnswersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SuggestFaqAnswersResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SuggestFaqAnswersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_OutputAudio_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_OutputAudio_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_AutomatedAgentReply_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_AutomatedAgentReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ArticleAnswer_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ArticleAnswer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ArticleAnswer_MetadataEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ArticleAnswer_MetadataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_FaqAnswer_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_FaqAnswer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_FaqAnswer_MetadataEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_FaqAnswer_MetadataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SuggestionResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SuggestionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_AnnotatedMessagePart_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_AnnotatedMessagePart_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_MessageAnnotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_MessageAnnotation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/dialogflow/v2/participant"
          + ".proto\022\032google.cloud.dialogflow.v2\032\034goog"
          + "le/api/annotations.proto\032\027google/api/cli"
          + "ent.proto\032\037google/api/field_behavior.pro"
          + "to\032\031google/api/resource.proto\032-google/cl"
          + "oud/dialogflow/v2/audio_config.proto\032(go"
          + "ogle/cloud/dialogflow/v2/session.proto\032\036"
          + "google/protobuf/duration.proto\032 google/p"
          + "rotobuf/field_mask.proto\032\034google/protobu"
          + "f/struct.proto\032\037google/protobuf/timestam"
          + "p.proto\032\027google/rpc/status.proto\"\266\003\n\013Par"
          + "ticipant\022\021\n\004name\030\001 \001(\tB\003\340A\001\022?\n\004role\030\002 \001("
          + "\0162,.google.cloud.dialogflow.v2.Participa"
          + "nt.RoleB\003\340A\005\022&\n\031sip_recording_media_labe"
          + "l\030\006 \001(\tB\003\340A\001\"P\n\004Role\022\024\n\020ROLE_UNSPECIFIED"
          + "\020\000\022\017\n\013HUMAN_AGENT\020\001\022\023\n\017AUTOMATED_AGENT\020\002"
          + "\022\014\n\010END_USER\020\003:\330\001\352A\324\001\n%dialogflow.google"
          + "apis.com/Participant\022Jprojects/{project}"
          + "/conversations/{conversation}/participan"
          + "ts/{participant}\022_projects/{project}/loc"
          + "ations/{location}/conversations/{convers"
          + "ation}/participants/{participant}\"\375\003\n\007Me"
          + "ssage\022\014\n\004name\030\001 \001(\t\022\024\n\007content\030\002 \001(\tB\003\340A"
          + "\002\022\032\n\rlanguage_code\030\003 \001(\tB\003\340A\001\022\030\n\013partici"
          + "pant\030\004 \001(\tB\003\340A\003\022K\n\020participant_role\030\005 \001("
          + "\0162,.google.cloud.dialogflow.v2.Participa"
          + "nt.RoleB\003\340A\003\0224\n\013create_time\030\006 \001(\0132\032.goog"
          + "le.protobuf.TimestampB\003\340A\003\022N\n\022message_an"
          + "notation\030\007 \001(\0132-.google.cloud.dialogflow"
          + ".v2.MessageAnnotationB\003\340A\003:\304\001\352A\300\001\n!dialo"
          + "gflow.googleapis.com/Message\022Bprojects/{"
          + "project}/conversations/{conversation}/me"
          + "ssages/{message}\022Wprojects/{project}/loc"
          + "ations/{location}/conversations/{convers"
          + "ation}/messages/{message}\"\234\001\n\030CreatePart"
          + "icipantRequest\022=\n\006parent\030\001 \001(\tB-\340A\002\372A\'\022%"
          + "dialogflow.googleapis.com/Participant\022A\n"
          + "\013participant\030\002 \001(\0132\'.google.cloud.dialog"
          + "flow.v2.ParticipantB\003\340A\002\"T\n\025GetParticipa"
          + "ntRequest\022;\n\004name\030\001 \001(\tB-\340A\002\372A\'\n%dialogf"
          + "low.googleapis.com/Participant\"\211\001\n\027ListP"
          + "articipantsRequest\022=\n\006parent\030\001 \001(\tB-\340A\002\372"
          + "A\'\022%dialogflow.googleapis.com/Participan"
          + "t\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030"
          + "\003 \001(\tB\003\340A\001\"r\n\030ListParticipantsResponse\022="
          + "\n\014participants\030\001 \003(\0132\'.google.cloud.dial"
          + "ogflow.v2.Participant\022\027\n\017next_page_token"
          + "\030\002 \001(\t\"\223\001\n\030UpdateParticipantRequest\022A\n\013p"
          + "articipant\030\001 \001(\0132\'.google.cloud.dialogfl"
          + "ow.v2.ParticipantB\003\340A\002\0224\n\013update_mask\030\002 "
          + "\001(\0132\032.google.protobuf.FieldMaskB\003\340A\002\"\202\003\n"
          + "\025AnalyzeContentRequest\022B\n\013participant\030\001 "
          + "\001(\tB-\340A\002\372A\'\n%dialogflow.googleapis.com/P"
          + "articipant\022;\n\ntext_input\030\006 \001(\0132%.google."
          + "cloud.dialogflow.v2.TextInputH\000\022=\n\013event"
          + "_input\030\010 \001(\0132&.google.cloud.dialogflow.v"
          + "2.EventInputH\000\022I\n\022reply_audio_config\030\005 \001"
          + "(\0132-.google.cloud.dialogflow.v2.OutputAu"
          + "dioConfig\022A\n\014query_params\030\t \001(\0132+.google"
          + ".cloud.dialogflow.v2.QueryParameters\022\022\n\n"
          + "request_id\030\013 \001(\tB\007\n\005input\",\n\016DtmfParamet"
          + "ers\022\032\n\022accepts_dtmf_input\030\001 \001(\010\"\336\003\n\026Anal"
          + "yzeContentResponse\022\022\n\nreply_text\030\001 \001(\t\022<"
          + "\n\013reply_audio\030\002 \001(\0132\'.google.cloud.dialo"
          + "gflow.v2.OutputAudio\022N\n\025automated_agent_"
          + "reply\030\003 \001(\0132/.google.cloud.dialogflow.v2"
          + ".AutomatedAgentReply\0224\n\007message\030\005 \001(\0132#."
          + "google.cloud.dialogflow.v2.Message\022T\n\036hu"
          + "man_agent_suggestion_results\030\006 \003(\0132,.goo"
          + "gle.cloud.dialogflow.v2.SuggestionResult"
          + "\022Q\n\033end_user_suggestion_results\030\007 \003(\0132,."
          + "google.cloud.dialogflow.v2.SuggestionRes"
          + "ult\022C\n\017dtmf_parameters\030\t \001(\0132*.google.cl"
          + "oud.dialogflow.v2.DtmfParameters\"\255\001\n\026Sug"
          + "gestArticlesRequest\022=\n\006parent\030\001 \001(\tB-\340A\002"
          + "\372A\'\n%dialogflow.googleapis.com/Participa"
          + "nt\022>\n\016latest_message\030\002 \001(\tB&\372A#\n!dialogf"
          + "low.googleapis.com/Message\022\024\n\014context_si"
          + "ze\030\003 \001(\005\"\213\001\n\027SuggestArticlesResponse\022B\n\017"
          + "article_answers\030\001 \003(\0132).google.cloud.dia"
          + "logflow.v2.ArticleAnswer\022\026\n\016latest_messa"
          + "ge\030\002 \001(\t\022\024\n\014context_size\030\003 \001(\005\"\257\001\n\030Sugge"
          + "stFaqAnswersRequest\022=\n\006parent\030\001 \001(\tB-\340A\002"
          + "\372A\'\n%dialogflow.googleapis.com/Participa"
          + "nt\022>\n\016latest_message\030\002 \001(\tB&\372A#\n!dialogf"
          + "low.googleapis.com/Message\022\024\n\014context_si"
          + "ze\030\003 \001(\005\"\205\001\n\031SuggestFaqAnswersResponse\022:"
          + "\n\013faq_answers\030\001 \003(\0132%.google.cloud.dialo"
          + "gflow.v2.FaqAnswer\022\026\n\016latest_message\030\002 \001"
          + "(\t\022\024\n\014context_size\030\003 \001(\005\"[\n\013OutputAudio\022"
          + "=\n\006config\030\001 \001(\0132-.google.cloud.dialogflo"
          + "w.v2.OutputAudioConfig\022\r\n\005audio\030\002 \001(\014\"g\n"
          + "\023AutomatedAgentReply\022P\n\026detect_intent_re"
          + "sponse\030\001 \001(\01320.google.cloud.dialogflow.v"
          + "2.DetectIntentResponse\"\344\001\n\rArticleAnswer"
          + "\022\r\n\005title\030\001 \001(\t\022\013\n\003uri\030\002 \001(\t\022\020\n\010snippets"
          + "\030\003 \003(\t\022\022\n\nconfidence\030\004 \001(\002\022I\n\010metadata\030\005"
          + " \003(\01327.google.cloud.dialogflow.v2.Articl"
          + "eAnswer.MetadataEntry\022\025\n\ranswer_record\030\006"
          + " \001(\t\032/\n\rMetadataEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005va"
          + "lue\030\002 \001(\t:\0028\001\"\340\001\n\tFaqAnswer\022\016\n\006answer\030\001 "
          + "\001(\t\022\022\n\nconfidence\030\002 \001(\002\022\020\n\010question\030\003 \001("
          + "\t\022\016\n\006source\030\004 \001(\t\022E\n\010metadata\030\005 \003(\01323.go"
          + "ogle.cloud.dialogflow.v2.FaqAnswer.Metad"
          + "ataEntry\022\025\n\ranswer_record\030\006 \001(\t\032/\n\rMetad"
          + "ataEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001"
          + "\"\207\002\n\020SuggestionResult\022#\n\005error\030\001 \001(\0132\022.g"
          + "oogle.rpc.StatusH\000\022X\n\031suggest_articles_r"
          + "esponse\030\002 \001(\01323.google.cloud.dialogflow."
          + "v2.SuggestArticlesResponseH\000\022]\n\034suggest_"
          + "faq_answers_response\030\003 \001(\01325.google.clou"
          + "d.dialogflow.v2.SuggestFaqAnswersRespons"
          + "eH\000B\025\n\023suggestion_response\"j\n\024AnnotatedM"
          + "essagePart\022\014\n\004text\030\001 \001(\t\022\023\n\013entity_type\030"
          + "\002 \001(\t\022/\n\017formatted_value\030\003 \001(\0132\026.google."
          + "protobuf.Value\"n\n\021MessageAnnotation\022?\n\005p"
          + "arts\030\001 \003(\01320.google.cloud.dialogflow.v2."
          + "AnnotatedMessagePart\022\030\n\020contain_entities"
          + "\030\002 \001(\0102\377\021\n\014Participants\022\245\002\n\021CreatePartic"
          + "ipant\0224.google.cloud.dialogflow.v2.Creat"
          + "eParticipantRequest\032\'.google.cloud.dialo"
          + "gflow.v2.Participant\"\260\001\202\323\344\223\002\224\001\"4/v2/{par"
          + "ent=projects/*/conversations/*}/particip"
          + "ants:\013participantZO\"@/v2/{parent=project"
          + "s/*/locations/*/conversations/*}/partici"
          + "pants:\013participant\332A\022parent,participant\022"
          + "\366\001\n\016GetParticipant\0221.google.cloud.dialog"
          + "flow.v2.GetParticipantRequest\032\'.google.c"
          + "loud.dialogflow.v2.Participant\"\207\001\202\323\344\223\002z\022"
          + "4/v2/{name=projects/*/conversations/*/pa"
          + "rticipants/*}ZB\022@/v2/{name=projects/*/lo"
          + "cations/*/conversations/*/participants/*"
          + "}\332A\004name\022\211\002\n\020ListParticipants\0223.google.c"
          + "loud.dialogflow.v2.ListParticipantsReque"
          + "st\0324.google.cloud.dialogflow.v2.ListPart"
          + "icipantsResponse\"\211\001\202\323\344\223\002z\0224/v2/{parent=p"
          + "rojects/*/conversations/*}/participantsZ"
          + "B\022@/v2/{parent=projects/*/locations/*/co"
          + "nversations/*}/participants\332A\006parent\022\302\002\n"
          + "\021UpdateParticipant\0224.google.cloud.dialog"
          + "flow.v2.UpdateParticipantRequest\032\'.googl"
          + "e.cloud.dialogflow.v2.Participant\"\315\001\202\323\344\223"
          + "\002\254\0012@/v2/{participant.name=projects/*/co"
          + "nversations/*/participants/*}:\013participa"
          + "ntZ[2L/v2/{participant.name=projects/*/l"
          + "ocations/*/conversations/*/participants/"
          + "*}:\013participant\332A\027participant,update_mas"
          + "k\022\340\002\n\016AnalyzeContent\0221.google.cloud.dial"
          + "ogflow.v2.AnalyzeContentRequest\0322.google"
          + ".cloud.dialogflow.v2.AnalyzeContentRespo"
          + "nse\"\346\001\202\323\344\223\002\254\001\"J/v2/{participant=projects"
          + "/*/conversations/*/participants/*}:analy"
          + "zeContent:\001*Z[\"V/v2/{participant=project"
          + "s/*/locations/*/conversations/*/particip"
          + "ants/*}:analyzeContent:\001*\332A\026participant,"
          + "text_input\332A\027participant,event_input\022\311\002\n"
          + "\017SuggestArticles\0222.google.cloud.dialogfl"
          + "ow.v2.SuggestArticlesRequest\0323.google.cl"
          + "oud.dialogflow.v2.SuggestArticlesRespons"
          + "e\"\314\001\202\323\344\223\002\274\001\"R/v2/{parent=projects/*/conv"
          + "ersations/*/participants/*}/suggestions:"
          + "suggestArticles:\001*Zc\"^/v2/{parent=projec"
          + "ts/*/locations/*/conversations/*/partici"
          + "pants/*}/suggestions:suggestArticles:\001*\332"
          + "A\006parent\022\323\002\n\021SuggestFaqAnswers\0224.google."
          + "cloud.dialogflow.v2.SuggestFaqAnswersReq"
          + "uest\0325.google.cloud.dialogflow.v2.Sugges"
          + "tFaqAnswersResponse\"\320\001\202\323\344\223\002\300\001\"T/v2/{pare"
          + "nt=projects/*/conversations/*/participan"
          + "ts/*}/suggestions:suggestFaqAnswers:\001*Ze"
          + "\"`/v2/{parent=projects/*/locations/*/con"
          + "versations/*/participants/*}/suggestions"
          + ":suggestFaqAnswers:\001*\332A\006parent\032x\312A\031dialo"
          + "gflow.googleapis.com\322AYhttps://www.googl"
          + "eapis.com/auth/cloud-platform,https://ww"
          + "w.googleapis.com/auth/dialogflowB\237\001\n\036com"
          + ".google.cloud.dialogflow.v2B\020Participant"
          + "ProtoP\001ZDgoogle.golang.org/genproto/goog"
          + "leapis/cloud/dialogflow/v2;dialogflow\370\001\001"
          + "\242\002\002DF\252\002\032Google.Cloud.Dialogflow.V2b\006prot"
          + "o3"
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
              com.google.cloud.dialogflow.v2.SessionProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_v2_Participant_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_Participant_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_Participant_descriptor,
            new java.lang.String[] {
              "Name", "Role", "SipRecordingMediaLabel",
            });
    internal_static_google_cloud_dialogflow_v2_Message_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_Message_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_Message_descriptor,
            new java.lang.String[] {
              "Name",
              "Content",
              "LanguageCode",
              "Participant",
              "ParticipantRole",
              "CreateTime",
              "MessageAnnotation",
            });
    internal_static_google_cloud_dialogflow_v2_CreateParticipantRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_CreateParticipantRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_CreateParticipantRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Participant",
            });
    internal_static_google_cloud_dialogflow_v2_GetParticipantRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2_GetParticipantRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_GetParticipantRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2_ListParticipantsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2_ListParticipantsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListParticipantsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_v2_ListParticipantsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2_ListParticipantsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListParticipantsResponse_descriptor,
            new java.lang.String[] {
              "Participants", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2_UpdateParticipantRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2_UpdateParticipantRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_UpdateParticipantRequest_descriptor,
            new java.lang.String[] {
              "Participant", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_v2_AnalyzeContentRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2_AnalyzeContentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_AnalyzeContentRequest_descriptor,
            new java.lang.String[] {
              "Participant",
              "TextInput",
              "EventInput",
              "ReplyAudioConfig",
              "QueryParams",
              "RequestId",
              "Input",
            });
    internal_static_google_cloud_dialogflow_v2_DtmfParameters_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2_DtmfParameters_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_DtmfParameters_descriptor,
            new java.lang.String[] {
              "AcceptsDtmfInput",
            });
    internal_static_google_cloud_dialogflow_v2_AnalyzeContentResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_v2_AnalyzeContentResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_AnalyzeContentResponse_descriptor,
            new java.lang.String[] {
              "ReplyText",
              "ReplyAudio",
              "AutomatedAgentReply",
              "Message",
              "HumanAgentSuggestionResults",
              "EndUserSuggestionResults",
              "DtmfParameters",
            });
    internal_static_google_cloud_dialogflow_v2_SuggestArticlesRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_v2_SuggestArticlesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SuggestArticlesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "LatestMessage", "ContextSize",
            });
    internal_static_google_cloud_dialogflow_v2_SuggestArticlesResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_v2_SuggestArticlesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SuggestArticlesResponse_descriptor,
            new java.lang.String[] {
              "ArticleAnswers", "LatestMessage", "ContextSize",
            });
    internal_static_google_cloud_dialogflow_v2_SuggestFaqAnswersRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_v2_SuggestFaqAnswersRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SuggestFaqAnswersRequest_descriptor,
            new java.lang.String[] {
              "Parent", "LatestMessage", "ContextSize",
            });
    internal_static_google_cloud_dialogflow_v2_SuggestFaqAnswersResponse_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_dialogflow_v2_SuggestFaqAnswersResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SuggestFaqAnswersResponse_descriptor,
            new java.lang.String[] {
              "FaqAnswers", "LatestMessage", "ContextSize",
            });
    internal_static_google_cloud_dialogflow_v2_OutputAudio_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_dialogflow_v2_OutputAudio_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_OutputAudio_descriptor,
            new java.lang.String[] {
              "Config", "Audio",
            });
    internal_static_google_cloud_dialogflow_v2_AutomatedAgentReply_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_dialogflow_v2_AutomatedAgentReply_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_AutomatedAgentReply_descriptor,
            new java.lang.String[] {
              "DetectIntentResponse",
            });
    internal_static_google_cloud_dialogflow_v2_ArticleAnswer_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_dialogflow_v2_ArticleAnswer_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ArticleAnswer_descriptor,
            new java.lang.String[] {
              "Title", "Uri", "Snippets", "Confidence", "Metadata", "AnswerRecord",
            });
    internal_static_google_cloud_dialogflow_v2_ArticleAnswer_MetadataEntry_descriptor =
        internal_static_google_cloud_dialogflow_v2_ArticleAnswer_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_ArticleAnswer_MetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ArticleAnswer_MetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dialogflow_v2_FaqAnswer_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_dialogflow_v2_FaqAnswer_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_FaqAnswer_descriptor,
            new java.lang.String[] {
              "Answer", "Confidence", "Question", "Source", "Metadata", "AnswerRecord",
            });
    internal_static_google_cloud_dialogflow_v2_FaqAnswer_MetadataEntry_descriptor =
        internal_static_google_cloud_dialogflow_v2_FaqAnswer_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_FaqAnswer_MetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_FaqAnswer_MetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dialogflow_v2_SuggestionResult_descriptor =
        getDescriptor().getMessageTypes().get(18);
    internal_static_google_cloud_dialogflow_v2_SuggestionResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SuggestionResult_descriptor,
            new java.lang.String[] {
              "Error", "SuggestArticlesResponse", "SuggestFaqAnswersResponse", "SuggestionResponse",
            });
    internal_static_google_cloud_dialogflow_v2_AnnotatedMessagePart_descriptor =
        getDescriptor().getMessageTypes().get(19);
    internal_static_google_cloud_dialogflow_v2_AnnotatedMessagePart_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_AnnotatedMessagePart_descriptor,
            new java.lang.String[] {
              "Text", "EntityType", "FormattedValue",
            });
    internal_static_google_cloud_dialogflow_v2_MessageAnnotation_descriptor =
        getDescriptor().getMessageTypes().get(20);
    internal_static_google_cloud_dialogflow_v2_MessageAnnotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_MessageAnnotation_descriptor,
            new java.lang.String[] {
              "Parts", "ContainEntities",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.v2.AudioConfigProto.getDescriptor();
    com.google.cloud.dialogflow.v2.SessionProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
