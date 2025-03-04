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

package com.google.cloud.dialogflow.v2beta1;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.v2beta1.stub.IntentsStub;
import com.google.cloud.dialogflow.v2beta1.stub.IntentsStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.longrunning.Operation;
import com.google.longrunning.OperationsClient;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Struct;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service for managing [Intents][google.cloud.dialogflow.v2beta1.Intent].
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (IntentsClient intentsClient = IntentsClient.create()) {
 *   IntentName name = IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]");
 *   Intent response = intentsClient.getIntent(name);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the IntentsClient object to clean up resources such as
 * threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of IntentsSettings to create().
 * For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * IntentsSettings intentsSettings =
 *     IntentsSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * IntentsClient intentsClient = IntentsClient.create(intentsSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * IntentsSettings intentsSettings = IntentsSettings.newBuilder().setEndpoint(myEndpoint).build();
 * IntentsClient intentsClient = IntentsClient.create(intentsSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class IntentsClient implements BackgroundResource {
  private final IntentsSettings settings;
  private final IntentsStub stub;
  private final OperationsClient operationsClient;

  /** Constructs an instance of IntentsClient with default settings. */
  public static final IntentsClient create() throws IOException {
    return create(IntentsSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of IntentsClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final IntentsClient create(IntentsSettings settings) throws IOException {
    return new IntentsClient(settings);
  }

  /**
   * Constructs an instance of IntentsClient, using the given stub for making calls. This is for
   * advanced usage - prefer using create(IntentsSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final IntentsClient create(IntentsStub stub) {
    return new IntentsClient(stub);
  }

  /**
   * Constructs an instance of IntentsClient, using the given settings. This is protected so that it
   * is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected IntentsClient(IntentsSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((IntentsStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected IntentsClient(IntentsStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  public final IntentsSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public IntentsStub getStub() {
    return stub;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  public final OperationsClient getOperationsClient() {
    return operationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all intents in the specified agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   AgentName parent = AgentName.ofProjectName("[PROJECT]");
   *   for (Intent element : intentsClient.listIntents(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The agent to list all intents from. Format: `projects/&lt;Project
   *     ID&gt;/agent`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListIntentsPagedResponse listIntents(AgentName parent) {
    ListIntentsRequest request =
        ListIntentsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listIntents(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all intents in the specified agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   String parent = IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]").toString();
   *   for (Intent element : intentsClient.listIntents(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The agent to list all intents from. Format: `projects/&lt;Project
   *     ID&gt;/agent`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListIntentsPagedResponse listIntents(String parent) {
    ListIntentsRequest request = ListIntentsRequest.newBuilder().setParent(parent).build();
    return listIntents(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all intents in the specified agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   AgentName parent = AgentName.ofProjectName("[PROJECT]");
   *   String languageCode = "languageCode-2092349083";
   *   for (Intent element : intentsClient.listIntents(parent, languageCode).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The agent to list all intents from. Format: `projects/&lt;Project
   *     ID&gt;/agent`.
   * @param languageCode Optional. The language used to access language-specific data. If not
   *     specified, the agent's default language is used. For more information, see [Multilingual
   *     intent and entity
   *     data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListIntentsPagedResponse listIntents(AgentName parent, String languageCode) {
    ListIntentsRequest request =
        ListIntentsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setLanguageCode(languageCode)
            .build();
    return listIntents(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all intents in the specified agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   String parent = IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]").toString();
   *   String languageCode = "languageCode-2092349083";
   *   for (Intent element : intentsClient.listIntents(parent, languageCode).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The agent to list all intents from. Format: `projects/&lt;Project
   *     ID&gt;/agent`.
   * @param languageCode Optional. The language used to access language-specific data. If not
   *     specified, the agent's default language is used. For more information, see [Multilingual
   *     intent and entity
   *     data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListIntentsPagedResponse listIntents(String parent, String languageCode) {
    ListIntentsRequest request =
        ListIntentsRequest.newBuilder().setParent(parent).setLanguageCode(languageCode).build();
    return listIntents(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all intents in the specified agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   ListIntentsRequest request =
   *       ListIntentsRequest.newBuilder()
   *           .setParent(IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]").toString())
   *           .setLanguageCode("languageCode-2092349083")
   *           .setIntentView(IntentView.forNumber(0))
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Intent element : intentsClient.listIntents(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListIntentsPagedResponse listIntents(ListIntentsRequest request) {
    return listIntentsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all intents in the specified agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   ListIntentsRequest request =
   *       ListIntentsRequest.newBuilder()
   *           .setParent(IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]").toString())
   *           .setLanguageCode("languageCode-2092349083")
   *           .setIntentView(IntentView.forNumber(0))
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Intent> future = intentsClient.listIntentsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Intent element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListIntentsRequest, ListIntentsPagedResponse>
      listIntentsPagedCallable() {
    return stub.listIntentsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all intents in the specified agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   ListIntentsRequest request =
   *       ListIntentsRequest.newBuilder()
   *           .setParent(IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]").toString())
   *           .setLanguageCode("languageCode-2092349083")
   *           .setIntentView(IntentView.forNumber(0))
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListIntentsResponse response = intentsClient.listIntentsCallable().call(request);
   *     for (Intent element : response.getResponsesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListIntentsRequest, ListIntentsResponse> listIntentsCallable() {
    return stub.listIntentsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified intent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   IntentName name = IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]");
   *   Intent response = intentsClient.getIntent(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the intent. Supported formats:
   *     <p>- `projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;` - `projects/&lt;Project
   *     ID&gt;/locations/&lt;Location ID&gt;/agent/intents/&lt;Intent ID&gt;`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Intent getIntent(IntentName name) {
    GetIntentRequest request =
        GetIntentRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getIntent(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified intent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   String name = IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]").toString();
   *   Intent response = intentsClient.getIntent(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the intent. Supported formats:
   *     <p>- `projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;` - `projects/&lt;Project
   *     ID&gt;/locations/&lt;Location ID&gt;/agent/intents/&lt;Intent ID&gt;`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Intent getIntent(String name) {
    GetIntentRequest request = GetIntentRequest.newBuilder().setName(name).build();
    return getIntent(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified intent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   IntentName name = IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]");
   *   String languageCode = "languageCode-2092349083";
   *   Intent response = intentsClient.getIntent(name, languageCode);
   * }
   * }</pre>
   *
   * @param name Required. The name of the intent. Supported formats:
   *     <p>- `projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;` - `projects/&lt;Project
   *     ID&gt;/locations/&lt;Location ID&gt;/agent/intents/&lt;Intent ID&gt;`
   * @param languageCode Optional. The language used to access language-specific data. If not
   *     specified, the agent's default language is used. For more information, see [Multilingual
   *     intent and entity
   *     data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Intent getIntent(IntentName name, String languageCode) {
    GetIntentRequest request =
        GetIntentRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setLanguageCode(languageCode)
            .build();
    return getIntent(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified intent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   String name = IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]").toString();
   *   String languageCode = "languageCode-2092349083";
   *   Intent response = intentsClient.getIntent(name, languageCode);
   * }
   * }</pre>
   *
   * @param name Required. The name of the intent. Supported formats:
   *     <p>- `projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;` - `projects/&lt;Project
   *     ID&gt;/locations/&lt;Location ID&gt;/agent/intents/&lt;Intent ID&gt;`
   * @param languageCode Optional. The language used to access language-specific data. If not
   *     specified, the agent's default language is used. For more information, see [Multilingual
   *     intent and entity
   *     data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Intent getIntent(String name, String languageCode) {
    GetIntentRequest request =
        GetIntentRequest.newBuilder().setName(name).setLanguageCode(languageCode).build();
    return getIntent(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified intent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   GetIntentRequest request =
   *       GetIntentRequest.newBuilder()
   *           .setName(IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]").toString())
   *           .setLanguageCode("languageCode-2092349083")
   *           .setIntentView(IntentView.forNumber(0))
   *           .build();
   *   Intent response = intentsClient.getIntent(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Intent getIntent(GetIntentRequest request) {
    return getIntentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified intent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   GetIntentRequest request =
   *       GetIntentRequest.newBuilder()
   *           .setName(IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]").toString())
   *           .setLanguageCode("languageCode-2092349083")
   *           .setIntentView(IntentView.forNumber(0))
   *           .build();
   *   ApiFuture<Intent> future = intentsClient.getIntentCallable().futureCall(request);
   *   // Do something.
   *   Intent response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetIntentRequest, Intent> getIntentCallable() {
    return stub.getIntentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an intent in the specified agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   AgentName parent = AgentName.ofProjectName("[PROJECT]");
   *   Intent intent = Intent.newBuilder().build();
   *   Intent response = intentsClient.createIntent(parent, intent);
   * }
   * }</pre>
   *
   * @param parent Required. The agent to create a intent for. Supported formats:
   *     <p>- `projects/&lt;Project ID&gt;/agent` - `projects/&lt;Project
   *     ID&gt;/locations/&lt;Location ID&gt;/agent`
   * @param intent Required. The intent to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Intent createIntent(AgentName parent, Intent intent) {
    CreateIntentRequest request =
        CreateIntentRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setIntent(intent)
            .build();
    return createIntent(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an intent in the specified agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   String parent = IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]").toString();
   *   Intent intent = Intent.newBuilder().build();
   *   Intent response = intentsClient.createIntent(parent, intent);
   * }
   * }</pre>
   *
   * @param parent Required. The agent to create a intent for. Supported formats:
   *     <p>- `projects/&lt;Project ID&gt;/agent` - `projects/&lt;Project
   *     ID&gt;/locations/&lt;Location ID&gt;/agent`
   * @param intent Required. The intent to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Intent createIntent(String parent, Intent intent) {
    CreateIntentRequest request =
        CreateIntentRequest.newBuilder().setParent(parent).setIntent(intent).build();
    return createIntent(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an intent in the specified agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   AgentName parent = AgentName.ofProjectName("[PROJECT]");
   *   Intent intent = Intent.newBuilder().build();
   *   String languageCode = "languageCode-2092349083";
   *   Intent response = intentsClient.createIntent(parent, intent, languageCode);
   * }
   * }</pre>
   *
   * @param parent Required. The agent to create a intent for. Supported formats:
   *     <p>- `projects/&lt;Project ID&gt;/agent` - `projects/&lt;Project
   *     ID&gt;/locations/&lt;Location ID&gt;/agent`
   * @param intent Required. The intent to create.
   * @param languageCode Optional. The language used to access language-specific data. If not
   *     specified, the agent's default language is used. For more information, see [Multilingual
   *     intent and entity
   *     data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Intent createIntent(AgentName parent, Intent intent, String languageCode) {
    CreateIntentRequest request =
        CreateIntentRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setIntent(intent)
            .setLanguageCode(languageCode)
            .build();
    return createIntent(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an intent in the specified agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   String parent = IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]").toString();
   *   Intent intent = Intent.newBuilder().build();
   *   String languageCode = "languageCode-2092349083";
   *   Intent response = intentsClient.createIntent(parent, intent, languageCode);
   * }
   * }</pre>
   *
   * @param parent Required. The agent to create a intent for. Supported formats:
   *     <p>- `projects/&lt;Project ID&gt;/agent` - `projects/&lt;Project
   *     ID&gt;/locations/&lt;Location ID&gt;/agent`
   * @param intent Required. The intent to create.
   * @param languageCode Optional. The language used to access language-specific data. If not
   *     specified, the agent's default language is used. For more information, see [Multilingual
   *     intent and entity
   *     data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Intent createIntent(String parent, Intent intent, String languageCode) {
    CreateIntentRequest request =
        CreateIntentRequest.newBuilder()
            .setParent(parent)
            .setIntent(intent)
            .setLanguageCode(languageCode)
            .build();
    return createIntent(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an intent in the specified agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   CreateIntentRequest request =
   *       CreateIntentRequest.newBuilder()
   *           .setParent(IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]").toString())
   *           .setIntent(Intent.newBuilder().build())
   *           .setLanguageCode("languageCode-2092349083")
   *           .setIntentView(IntentView.forNumber(0))
   *           .build();
   *   Intent response = intentsClient.createIntent(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Intent createIntent(CreateIntentRequest request) {
    return createIntentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an intent in the specified agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   CreateIntentRequest request =
   *       CreateIntentRequest.newBuilder()
   *           .setParent(IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]").toString())
   *           .setIntent(Intent.newBuilder().build())
   *           .setLanguageCode("languageCode-2092349083")
   *           .setIntentView(IntentView.forNumber(0))
   *           .build();
   *   ApiFuture<Intent> future = intentsClient.createIntentCallable().futureCall(request);
   *   // Do something.
   *   Intent response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateIntentRequest, Intent> createIntentCallable() {
    return stub.createIntentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified intent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   Intent intent = Intent.newBuilder().build();
   *   Intent response = intentsClient.updateIntent(intent);
   * }
   * }</pre>
   *
   * @param intent Required. The intent to update.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Intent updateIntent(Intent intent) {
    UpdateIntentRequest request = UpdateIntentRequest.newBuilder().setIntent(intent).build();
    return updateIntent(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified intent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   Intent intent = Intent.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   Intent response = intentsClient.updateIntent(intent, updateMask);
   * }
   * }</pre>
   *
   * @param intent Required. The intent to update.
   * @param updateMask Optional. The mask to control which fields get updated.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Intent updateIntent(Intent intent, FieldMask updateMask) {
    UpdateIntentRequest request =
        UpdateIntentRequest.newBuilder().setIntent(intent).setUpdateMask(updateMask).build();
    return updateIntent(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified intent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   Intent intent = Intent.newBuilder().build();
   *   String languageCode = "languageCode-2092349083";
   *   Intent response = intentsClient.updateIntent(intent, languageCode);
   * }
   * }</pre>
   *
   * @param intent Required. The intent to update.
   * @param languageCode Optional. The language used to access language-specific data. If not
   *     specified, the agent's default language is used. For more information, see [Multilingual
   *     intent and entity
   *     data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Intent updateIntent(Intent intent, String languageCode) {
    UpdateIntentRequest request =
        UpdateIntentRequest.newBuilder().setIntent(intent).setLanguageCode(languageCode).build();
    return updateIntent(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified intent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   Intent intent = Intent.newBuilder().build();
   *   String languageCode = "languageCode-2092349083";
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   Intent response = intentsClient.updateIntent(intent, languageCode, updateMask);
   * }
   * }</pre>
   *
   * @param intent Required. The intent to update.
   * @param languageCode Optional. The language used to access language-specific data. If not
   *     specified, the agent's default language is used. For more information, see [Multilingual
   *     intent and entity
   *     data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * @param updateMask Optional. The mask to control which fields get updated.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Intent updateIntent(Intent intent, String languageCode, FieldMask updateMask) {
    UpdateIntentRequest request =
        UpdateIntentRequest.newBuilder()
            .setIntent(intent)
            .setLanguageCode(languageCode)
            .setUpdateMask(updateMask)
            .build();
    return updateIntent(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified intent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   UpdateIntentRequest request =
   *       UpdateIntentRequest.newBuilder()
   *           .setIntent(Intent.newBuilder().build())
   *           .setLanguageCode("languageCode-2092349083")
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setIntentView(IntentView.forNumber(0))
   *           .build();
   *   Intent response = intentsClient.updateIntent(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Intent updateIntent(UpdateIntentRequest request) {
    return updateIntentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified intent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   UpdateIntentRequest request =
   *       UpdateIntentRequest.newBuilder()
   *           .setIntent(Intent.newBuilder().build())
   *           .setLanguageCode("languageCode-2092349083")
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setIntentView(IntentView.forNumber(0))
   *           .build();
   *   ApiFuture<Intent> future = intentsClient.updateIntentCallable().futureCall(request);
   *   // Do something.
   *   Intent response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateIntentRequest, Intent> updateIntentCallable() {
    return stub.updateIntentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified intent and its direct or indirect followup intents.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   IntentName name = IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]");
   *   intentsClient.deleteIntent(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the intent to delete. If this intent has direct or indirect
   *     followup intents, we also delete them.
   *     <p>Supported formats:
   *     <p>- `projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;` - `projects/&lt;Project
   *     ID&gt;/locations/&lt;Location ID&gt;/agent/intents/&lt;Intent ID&gt;`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteIntent(IntentName name) {
    DeleteIntentRequest request =
        DeleteIntentRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    deleteIntent(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified intent and its direct or indirect followup intents.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   String name = IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]").toString();
   *   intentsClient.deleteIntent(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the intent to delete. If this intent has direct or indirect
   *     followup intents, we also delete them.
   *     <p>Supported formats:
   *     <p>- `projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;` - `projects/&lt;Project
   *     ID&gt;/locations/&lt;Location ID&gt;/agent/intents/&lt;Intent ID&gt;`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteIntent(String name) {
    DeleteIntentRequest request = DeleteIntentRequest.newBuilder().setName(name).build();
    deleteIntent(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified intent and its direct or indirect followup intents.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   DeleteIntentRequest request =
   *       DeleteIntentRequest.newBuilder()
   *           .setName(IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]").toString())
   *           .build();
   *   intentsClient.deleteIntent(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteIntent(DeleteIntentRequest request) {
    deleteIntentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified intent and its direct or indirect followup intents.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   DeleteIntentRequest request =
   *       DeleteIntentRequest.newBuilder()
   *           .setName(IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]").toString())
   *           .build();
   *   ApiFuture<Empty> future = intentsClient.deleteIntentCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteIntentRequest, Empty> deleteIntentCallable() {
    return stub.deleteIntentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates/Creates multiple intents in the specified agent.
   *
   * <p>Operation &lt;response:
   * [BatchUpdateIntentsResponse][google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse]&gt;
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   AgentName parent = AgentName.ofProjectName("[PROJECT]");
   *   IntentBatch intentBatchInline = IntentBatch.newBuilder().build();
   *   BatchUpdateIntentsResponse response =
   *       intentsClient.batchUpdateIntentsAsync(parent, intentBatchInline).get();
   * }
   * }</pre>
   *
   * @param parent Required. The name of the agent to update or create intents in. Supported
   *     formats:
   *     <p>- `projects/&lt;Project ID&gt;/agent` - `projects/&lt;Project
   *     ID&gt;/locations/&lt;Location ID&gt;/agent`
   * @param intentBatchInline The collection of intents to update or create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<BatchUpdateIntentsResponse, Struct> batchUpdateIntentsAsync(
      AgentName parent, IntentBatch intentBatchInline) {
    BatchUpdateIntentsRequest request =
        BatchUpdateIntentsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setIntentBatchInline(intentBatchInline)
            .build();
    return batchUpdateIntentsAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates/Creates multiple intents in the specified agent.
   *
   * <p>Operation &lt;response:
   * [BatchUpdateIntentsResponse][google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse]&gt;
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   AgentName parent = AgentName.ofProjectName("[PROJECT]");
   *   String intentBatchUri = "intentBatchUri544125582";
   *   BatchUpdateIntentsResponse response =
   *       intentsClient.batchUpdateIntentsAsync(parent, intentBatchUri).get();
   * }
   * }</pre>
   *
   * @param parent Required. The name of the agent to update or create intents in. Supported
   *     formats:
   *     <p>- `projects/&lt;Project ID&gt;/agent` - `projects/&lt;Project
   *     ID&gt;/locations/&lt;Location ID&gt;/agent`
   * @param intentBatchUri The URI to a Google Cloud Storage file containing intents to update or
   *     create. The file format can either be a serialized proto (of IntentBatch type) or JSON
   *     object. Note: The URI must start with "gs://".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<BatchUpdateIntentsResponse, Struct> batchUpdateIntentsAsync(
      AgentName parent, String intentBatchUri) {
    BatchUpdateIntentsRequest request =
        BatchUpdateIntentsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setIntentBatchUri(intentBatchUri)
            .build();
    return batchUpdateIntentsAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates/Creates multiple intents in the specified agent.
   *
   * <p>Operation &lt;response:
   * [BatchUpdateIntentsResponse][google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse]&gt;
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   String parent = IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]").toString();
   *   IntentBatch intentBatchInline = IntentBatch.newBuilder().build();
   *   BatchUpdateIntentsResponse response =
   *       intentsClient.batchUpdateIntentsAsync(parent, intentBatchInline).get();
   * }
   * }</pre>
   *
   * @param parent Required. The name of the agent to update or create intents in. Supported
   *     formats:
   *     <p>- `projects/&lt;Project ID&gt;/agent` - `projects/&lt;Project
   *     ID&gt;/locations/&lt;Location ID&gt;/agent`
   * @param intentBatchInline The collection of intents to update or create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<BatchUpdateIntentsResponse, Struct> batchUpdateIntentsAsync(
      String parent, IntentBatch intentBatchInline) {
    BatchUpdateIntentsRequest request =
        BatchUpdateIntentsRequest.newBuilder()
            .setParent(parent)
            .setIntentBatchInline(intentBatchInline)
            .build();
    return batchUpdateIntentsAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates/Creates multiple intents in the specified agent.
   *
   * <p>Operation &lt;response:
   * [BatchUpdateIntentsResponse][google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse]&gt;
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   String parent = IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]").toString();
   *   String intentBatchUri = "intentBatchUri544125582";
   *   BatchUpdateIntentsResponse response =
   *       intentsClient.batchUpdateIntentsAsync(parent, intentBatchUri).get();
   * }
   * }</pre>
   *
   * @param parent Required. The name of the agent to update or create intents in. Supported
   *     formats:
   *     <p>- `projects/&lt;Project ID&gt;/agent` - `projects/&lt;Project
   *     ID&gt;/locations/&lt;Location ID&gt;/agent`
   * @param intentBatchUri The URI to a Google Cloud Storage file containing intents to update or
   *     create. The file format can either be a serialized proto (of IntentBatch type) or JSON
   *     object. Note: The URI must start with "gs://".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<BatchUpdateIntentsResponse, Struct> batchUpdateIntentsAsync(
      String parent, String intentBatchUri) {
    BatchUpdateIntentsRequest request =
        BatchUpdateIntentsRequest.newBuilder()
            .setParent(parent)
            .setIntentBatchUri(intentBatchUri)
            .build();
    return batchUpdateIntentsAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates/Creates multiple intents in the specified agent.
   *
   * <p>Operation &lt;response:
   * [BatchUpdateIntentsResponse][google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse]&gt;
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   BatchUpdateIntentsRequest request =
   *       BatchUpdateIntentsRequest.newBuilder()
   *           .setParent(IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]").toString())
   *           .setLanguageCode("languageCode-2092349083")
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setIntentView(IntentView.forNumber(0))
   *           .build();
   *   BatchUpdateIntentsResponse response = intentsClient.batchUpdateIntentsAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<BatchUpdateIntentsResponse, Struct> batchUpdateIntentsAsync(
      BatchUpdateIntentsRequest request) {
    return batchUpdateIntentsOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates/Creates multiple intents in the specified agent.
   *
   * <p>Operation &lt;response:
   * [BatchUpdateIntentsResponse][google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse]&gt;
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   BatchUpdateIntentsRequest request =
   *       BatchUpdateIntentsRequest.newBuilder()
   *           .setParent(IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]").toString())
   *           .setLanguageCode("languageCode-2092349083")
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setIntentView(IntentView.forNumber(0))
   *           .build();
   *   OperationFuture<BatchUpdateIntentsResponse, Struct> future =
   *       intentsClient.batchUpdateIntentsOperationCallable().futureCall(request);
   *   // Do something.
   *   BatchUpdateIntentsResponse response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<BatchUpdateIntentsRequest, BatchUpdateIntentsResponse, Struct>
      batchUpdateIntentsOperationCallable() {
    return stub.batchUpdateIntentsOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates/Creates multiple intents in the specified agent.
   *
   * <p>Operation &lt;response:
   * [BatchUpdateIntentsResponse][google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse]&gt;
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   BatchUpdateIntentsRequest request =
   *       BatchUpdateIntentsRequest.newBuilder()
   *           .setParent(IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]").toString())
   *           .setLanguageCode("languageCode-2092349083")
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setIntentView(IntentView.forNumber(0))
   *           .build();
   *   ApiFuture<Operation> future = intentsClient.batchUpdateIntentsCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<BatchUpdateIntentsRequest, Operation> batchUpdateIntentsCallable() {
    return stub.batchUpdateIntentsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes intents in the specified agent.
   *
   * <p>Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty]&gt;
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   AgentName parent = AgentName.ofProjectName("[PROJECT]");
   *   List<Intent> intents = new ArrayList<>();
   *   intentsClient.batchDeleteIntentsAsync(parent, intents).get();
   * }
   * }</pre>
   *
   * @param parent Required. The name of the agent to delete all entities types for. Supported
   *     formats:
   *     <p>- `projects/&lt;Project ID&gt;/agent` - `projects/&lt;Project
   *     ID&gt;/locations/&lt;Location ID&gt;/agent`
   * @param intents Required. The collection of intents to delete. Only intent `name` must be filled
   *     in.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, Struct> batchDeleteIntentsAsync(
      AgentName parent, List<Intent> intents) {
    BatchDeleteIntentsRequest request =
        BatchDeleteIntentsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .addAllIntents(intents)
            .build();
    return batchDeleteIntentsAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes intents in the specified agent.
   *
   * <p>Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty]&gt;
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   String parent = IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]").toString();
   *   List<Intent> intents = new ArrayList<>();
   *   intentsClient.batchDeleteIntentsAsync(parent, intents).get();
   * }
   * }</pre>
   *
   * @param parent Required. The name of the agent to delete all entities types for. Supported
   *     formats:
   *     <p>- `projects/&lt;Project ID&gt;/agent` - `projects/&lt;Project
   *     ID&gt;/locations/&lt;Location ID&gt;/agent`
   * @param intents Required. The collection of intents to delete. Only intent `name` must be filled
   *     in.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, Struct> batchDeleteIntentsAsync(
      String parent, List<Intent> intents) {
    BatchDeleteIntentsRequest request =
        BatchDeleteIntentsRequest.newBuilder().setParent(parent).addAllIntents(intents).build();
    return batchDeleteIntentsAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes intents in the specified agent.
   *
   * <p>Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty]&gt;
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   BatchDeleteIntentsRequest request =
   *       BatchDeleteIntentsRequest.newBuilder()
   *           .setParent(IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]").toString())
   *           .addAllIntents(new ArrayList<Intent>())
   *           .build();
   *   intentsClient.batchDeleteIntentsAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, Struct> batchDeleteIntentsAsync(
      BatchDeleteIntentsRequest request) {
    return batchDeleteIntentsOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes intents in the specified agent.
   *
   * <p>Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty]&gt;
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   BatchDeleteIntentsRequest request =
   *       BatchDeleteIntentsRequest.newBuilder()
   *           .setParent(IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]").toString())
   *           .addAllIntents(new ArrayList<Intent>())
   *           .build();
   *   OperationFuture<Empty, Struct> future =
   *       intentsClient.batchDeleteIntentsOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<BatchDeleteIntentsRequest, Empty, Struct>
      batchDeleteIntentsOperationCallable() {
    return stub.batchDeleteIntentsOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes intents in the specified agent.
   *
   * <p>Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty]&gt;
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   BatchDeleteIntentsRequest request =
   *       BatchDeleteIntentsRequest.newBuilder()
   *           .setParent(IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]").toString())
   *           .addAllIntents(new ArrayList<Intent>())
   *           .build();
   *   ApiFuture<Operation> future = intentsClient.batchDeleteIntentsCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<BatchDeleteIntentsRequest, Operation> batchDeleteIntentsCallable() {
    return stub.batchDeleteIntentsCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListIntentsPagedResponse
      extends AbstractPagedListResponse<
          ListIntentsRequest,
          ListIntentsResponse,
          Intent,
          ListIntentsPage,
          ListIntentsFixedSizeCollection> {

    public static ApiFuture<ListIntentsPagedResponse> createAsync(
        PageContext<ListIntentsRequest, ListIntentsResponse, Intent> context,
        ApiFuture<ListIntentsResponse> futureResponse) {
      ApiFuture<ListIntentsPage> futurePage =
          ListIntentsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListIntentsPage, ListIntentsPagedResponse>() {
            @Override
            public ListIntentsPagedResponse apply(ListIntentsPage input) {
              return new ListIntentsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListIntentsPagedResponse(ListIntentsPage page) {
      super(page, ListIntentsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListIntentsPage
      extends AbstractPage<ListIntentsRequest, ListIntentsResponse, Intent, ListIntentsPage> {

    private ListIntentsPage(
        PageContext<ListIntentsRequest, ListIntentsResponse, Intent> context,
        ListIntentsResponse response) {
      super(context, response);
    }

    private static ListIntentsPage createEmptyPage() {
      return new ListIntentsPage(null, null);
    }

    @Override
    protected ListIntentsPage createPage(
        PageContext<ListIntentsRequest, ListIntentsResponse, Intent> context,
        ListIntentsResponse response) {
      return new ListIntentsPage(context, response);
    }

    @Override
    public ApiFuture<ListIntentsPage> createPageAsync(
        PageContext<ListIntentsRequest, ListIntentsResponse, Intent> context,
        ApiFuture<ListIntentsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListIntentsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListIntentsRequest,
          ListIntentsResponse,
          Intent,
          ListIntentsPage,
          ListIntentsFixedSizeCollection> {

    private ListIntentsFixedSizeCollection(List<ListIntentsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListIntentsFixedSizeCollection createEmptyCollection() {
      return new ListIntentsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListIntentsFixedSizeCollection createCollection(
        List<ListIntentsPage> pages, int collectionSize) {
      return new ListIntentsFixedSizeCollection(pages, collectionSize);
    }
  }
}
