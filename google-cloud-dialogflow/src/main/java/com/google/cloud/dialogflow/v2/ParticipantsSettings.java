/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.dialogflow.v2;

import static com.google.cloud.dialogflow.v2.ParticipantsClient.ListParticipantsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.StreamingCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.dialogflow.v2.stub.ParticipantsStubSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link ParticipantsClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (dialogflow.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of createParticipant to 30 seconds:
 *
 * <pre>{@code
 * ParticipantsSettings.Builder participantsSettingsBuilder = ParticipantsSettings.newBuilder();
 * participantsSettingsBuilder
 *     .createParticipantSettings()
 *     .setRetrySettings(
 *         participantsSettingsBuilder
 *             .createParticipantSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * ParticipantsSettings participantsSettings = participantsSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class ParticipantsSettings extends ClientSettings<ParticipantsSettings> {

  /** Returns the object with the settings used for calls to createParticipant. */
  public UnaryCallSettings<CreateParticipantRequest, Participant> createParticipantSettings() {
    return ((ParticipantsStubSettings) getStubSettings()).createParticipantSettings();
  }

  /** Returns the object with the settings used for calls to getParticipant. */
  public UnaryCallSettings<GetParticipantRequest, Participant> getParticipantSettings() {
    return ((ParticipantsStubSettings) getStubSettings()).getParticipantSettings();
  }

  /** Returns the object with the settings used for calls to listParticipants. */
  public PagedCallSettings<
          ListParticipantsRequest, ListParticipantsResponse, ListParticipantsPagedResponse>
      listParticipantsSettings() {
    return ((ParticipantsStubSettings) getStubSettings()).listParticipantsSettings();
  }

  /** Returns the object with the settings used for calls to updateParticipant. */
  public UnaryCallSettings<UpdateParticipantRequest, Participant> updateParticipantSettings() {
    return ((ParticipantsStubSettings) getStubSettings()).updateParticipantSettings();
  }

  /** Returns the object with the settings used for calls to analyzeContent. */
  public UnaryCallSettings<AnalyzeContentRequest, AnalyzeContentResponse> analyzeContentSettings() {
    return ((ParticipantsStubSettings) getStubSettings()).analyzeContentSettings();
  }

  /** Returns the object with the settings used for calls to streamingAnalyzeContent. */
  public StreamingCallSettings<StreamingAnalyzeContentRequest, StreamingAnalyzeContentResponse>
      streamingAnalyzeContentSettings() {
    return ((ParticipantsStubSettings) getStubSettings()).streamingAnalyzeContentSettings();
  }

  /** Returns the object with the settings used for calls to suggestArticles. */
  public UnaryCallSettings<SuggestArticlesRequest, SuggestArticlesResponse>
      suggestArticlesSettings() {
    return ((ParticipantsStubSettings) getStubSettings()).suggestArticlesSettings();
  }

  /** Returns the object with the settings used for calls to suggestFaqAnswers. */
  public UnaryCallSettings<SuggestFaqAnswersRequest, SuggestFaqAnswersResponse>
      suggestFaqAnswersSettings() {
    return ((ParticipantsStubSettings) getStubSettings()).suggestFaqAnswersSettings();
  }

  public static final ParticipantsSettings create(ParticipantsStubSettings stub)
      throws IOException {
    return new ParticipantsSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return ParticipantsStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return ParticipantsStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return ParticipantsStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return ParticipantsStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return ParticipantsStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return ParticipantsStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ParticipantsStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected ParticipantsSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for ParticipantsSettings. */
  public static class Builder extends ClientSettings.Builder<ParticipantsSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(ParticipantsStubSettings.newBuilder(clientContext));
    }

    protected Builder(ParticipantsSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(ParticipantsStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(ParticipantsStubSettings.newBuilder());
    }

    public ParticipantsStubSettings.Builder getStubSettingsBuilder() {
      return ((ParticipantsStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'.
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to createParticipant. */
    public UnaryCallSettings.Builder<CreateParticipantRequest, Participant>
        createParticipantSettings() {
      return getStubSettingsBuilder().createParticipantSettings();
    }

    /** Returns the builder for the settings used for calls to getParticipant. */
    public UnaryCallSettings.Builder<GetParticipantRequest, Participant> getParticipantSettings() {
      return getStubSettingsBuilder().getParticipantSettings();
    }

    /** Returns the builder for the settings used for calls to listParticipants. */
    public PagedCallSettings.Builder<
            ListParticipantsRequest, ListParticipantsResponse, ListParticipantsPagedResponse>
        listParticipantsSettings() {
      return getStubSettingsBuilder().listParticipantsSettings();
    }

    /** Returns the builder for the settings used for calls to updateParticipant. */
    public UnaryCallSettings.Builder<UpdateParticipantRequest, Participant>
        updateParticipantSettings() {
      return getStubSettingsBuilder().updateParticipantSettings();
    }

    /** Returns the builder for the settings used for calls to analyzeContent. */
    public UnaryCallSettings.Builder<AnalyzeContentRequest, AnalyzeContentResponse>
        analyzeContentSettings() {
      return getStubSettingsBuilder().analyzeContentSettings();
    }

    /** Returns the builder for the settings used for calls to streamingAnalyzeContent. */
    public StreamingCallSettings.Builder<
            StreamingAnalyzeContentRequest, StreamingAnalyzeContentResponse>
        streamingAnalyzeContentSettings() {
      return getStubSettingsBuilder().streamingAnalyzeContentSettings();
    }

    /** Returns the builder for the settings used for calls to suggestArticles. */
    public UnaryCallSettings.Builder<SuggestArticlesRequest, SuggestArticlesResponse>
        suggestArticlesSettings() {
      return getStubSettingsBuilder().suggestArticlesSettings();
    }

    /** Returns the builder for the settings used for calls to suggestFaqAnswers. */
    public UnaryCallSettings.Builder<SuggestFaqAnswersRequest, SuggestFaqAnswersResponse>
        suggestFaqAnswersSettings() {
      return getStubSettingsBuilder().suggestFaqAnswersSettings();
    }

    @Override
    public ParticipantsSettings build() throws IOException {
      return new ParticipantsSettings(this);
    }
  }
}
