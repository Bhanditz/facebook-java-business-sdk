/**
 * Copyright (c) 2015-present, Facebook, Inc. All rights reserved.
 *
 * You are hereby granted a non-exclusive, worldwide, royalty-free license to
 * use, copy, modify, and distribute this software in source code or binary
 * form for use in connection with the web services and APIs provided by
 * Facebook.
 *
 * As with any software that integrates with the Facebook platform, your use
 * of this software is subject to the Facebook Developer Principles and
 * Policies [http://developers.facebook.com/policy/]. This copyright notice
 * shall be included in all copies or substantial portions of the software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 *
 */

package com.facebook.ads.sdk;

import java.io.File;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.base.Function;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import com.facebook.ads.sdk.APIException.MalformedResponseException;

/**
 * This class is auto-generated.
 *
 * For any issues or feature requests related to this class, please let us know
 * on github and we'll fix in our codegen framework. We'll not be able to accept
 * pull request for this class.
 *
 */
public class AdsPixelSignalsIWLNux extends APINode {
  @SerializedName("background_color")
  private String mBackgroundColor = null;
  @SerializedName("content")
  private String mContent = null;
  @SerializedName("content_color")
  private String mContentColor = null;
  @SerializedName("content_size")
  private String mContentSize = null;
  @SerializedName("img_url")
  private String mImgUrl = null;
  @SerializedName("id")
  private String mId = null;
  protected static Gson gson = null;

  AdsPixelSignalsIWLNux() {
  }

  public AdsPixelSignalsIWLNux(Long id, APIContext context) {
    this(id.toString(), context);
  }

  public AdsPixelSignalsIWLNux(String id, APIContext context) {
    this.mId = id;

    this.context = context;
  }

  public AdsPixelSignalsIWLNux fetch() throws APIException{
    AdsPixelSignalsIWLNux newInstance = fetchById(this.getPrefixedId().toString(), this.context);
    this.copyFrom(newInstance);
    return this;
  }

  public static AdsPixelSignalsIWLNux fetchById(Long id, APIContext context) throws APIException {
    return fetchById(id.toString(), context);
  }

  public static ListenableFuture<AdsPixelSignalsIWLNux> fetchByIdAsync(Long id, APIContext context) throws APIException {
    return fetchByIdAsync(id.toString(), context);
  }

  public static AdsPixelSignalsIWLNux fetchById(String id, APIContext context) throws APIException {
    return
      new APIRequestGet(id, context)
      .requestAllFields()
      .execute();
  }

  public static ListenableFuture<AdsPixelSignalsIWLNux> fetchByIdAsync(String id, APIContext context) throws APIException {
    return
      new APIRequestGet(id, context)
      .requestAllFields()
      .executeAsync();
  }

  public static APINodeList<AdsPixelSignalsIWLNux> fetchByIds(List<String> ids, List<String> fields, APIContext context) throws APIException {
    return (APINodeList<AdsPixelSignalsIWLNux>)(
      new APIRequest<AdsPixelSignalsIWLNux>(context, "", "/", "GET", AdsPixelSignalsIWLNux.getParser())
        .setParam("ids", APIRequest.joinStringList(ids))
        .requestFields(fields)
        .execute()
    );
  }

  public static ListenableFuture<APINodeList<AdsPixelSignalsIWLNux>> fetchByIdsAsync(List<String> ids, List<String> fields, APIContext context) throws APIException {
    return
      new APIRequest(context, "", "/", "GET", AdsPixelSignalsIWLNux.getParser())
        .setParam("ids", APIRequest.joinStringList(ids))
        .requestFields(fields)
        .executeAsyncBase();
  }

  private String getPrefixedId() {
    return getId();
  }

  public String getId() {
    return getFieldId().toString();
  }
  public static AdsPixelSignalsIWLNux loadJSON(String json, APIContext context) {
    AdsPixelSignalsIWLNux adsPixelSignalsIWLNux = getGson().fromJson(json, AdsPixelSignalsIWLNux.class);
    if (context.isDebug()) {
      JsonParser parser = new JsonParser();
      JsonElement o1 = parser.parse(json);
      JsonElement o2 = parser.parse(adsPixelSignalsIWLNux.toString());
      if (o1.getAsJsonObject().get("__fb_trace_id__") != null) {
        o2.getAsJsonObject().add("__fb_trace_id__", o1.getAsJsonObject().get("__fb_trace_id__"));
      }
      if (!o1.equals(o2)) {
        context.log("[Warning] When parsing response, object is not consistent with JSON:");
        context.log("[JSON]" + o1);
        context.log("[Object]" + o2);
      };
    }
    adsPixelSignalsIWLNux.context = context;
    adsPixelSignalsIWLNux.rawValue = json;
    return adsPixelSignalsIWLNux;
  }

  public static APINodeList<AdsPixelSignalsIWLNux> parseResponse(String json, APIContext context, APIRequest request) throws MalformedResponseException {
    APINodeList<AdsPixelSignalsIWLNux> adsPixelSignalsIWLNuxs = new APINodeList<AdsPixelSignalsIWLNux>(request, json);
    JsonArray arr;
    JsonObject obj;
    JsonParser parser = new JsonParser();
    Exception exception = null;
    try{
      JsonElement result = parser.parse(json);
      if (result.isJsonArray()) {
        // First, check if it's a pure JSON Array
        arr = result.getAsJsonArray();
        for (int i = 0; i < arr.size(); i++) {
          adsPixelSignalsIWLNuxs.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context));
        };
        return adsPixelSignalsIWLNuxs;
      } else if (result.isJsonObject()) {
        obj = result.getAsJsonObject();
        if (obj.has("data")) {
          if (obj.has("paging")) {
            JsonObject paging = obj.get("paging").getAsJsonObject();
            if (paging.has("cursors")) {
                JsonObject cursors = paging.get("cursors").getAsJsonObject();
                String before = cursors.has("before") ? cursors.get("before").getAsString() : null;
                String after = cursors.has("after") ? cursors.get("after").getAsString() : null;
                adsPixelSignalsIWLNuxs.setCursors(before, after);
            }
            String previous = paging.has("previous") ? paging.get("previous").getAsString() : null;
            String next = paging.has("next") ? paging.get("next").getAsString() : null;
            adsPixelSignalsIWLNuxs.setPaging(previous, next);
            if (context.hasAppSecret()) {
              adsPixelSignalsIWLNuxs.setAppSecret(context.getAppSecretProof());
            }
          }
          if (obj.get("data").isJsonArray()) {
            // Second, check if it's a JSON array with "data"
            arr = obj.get("data").getAsJsonArray();
            for (int i = 0; i < arr.size(); i++) {
              adsPixelSignalsIWLNuxs.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context));
            };
          } else if (obj.get("data").isJsonObject()) {
            // Third, check if it's a JSON object with "data"
            obj = obj.get("data").getAsJsonObject();
            boolean isRedownload = false;
            for (String s : new String[]{"campaigns", "adsets", "ads"}) {
              if (obj.has(s)) {
                isRedownload = true;
                obj = obj.getAsJsonObject(s);
                for (Map.Entry<String, JsonElement> entry : obj.entrySet()) {
                  adsPixelSignalsIWLNuxs.add(loadJSON(entry.getValue().toString(), context));
                }
                break;
              }
            }
            if (!isRedownload) {
              adsPixelSignalsIWLNuxs.add(loadJSON(obj.toString(), context));
            }
          }
          return adsPixelSignalsIWLNuxs;
        } else if (obj.has("images")) {
          // Fourth, check if it's a map of image objects
          obj = obj.get("images").getAsJsonObject();
          for (Map.Entry<String, JsonElement> entry : obj.entrySet()) {
              adsPixelSignalsIWLNuxs.add(loadJSON(entry.getValue().toString(), context));
          }
          return adsPixelSignalsIWLNuxs;
        } else {
          // Fifth, check if it's an array of objects indexed by id
          boolean isIdIndexedArray = true;
          for (Map.Entry entry : obj.entrySet()) {
            String key = (String) entry.getKey();
            if (key.equals("__fb_trace_id__")) {
              continue;
            }
            JsonElement value = (JsonElement) entry.getValue();
            if (
              value != null &&
              value.isJsonObject() &&
              value.getAsJsonObject().has("id") &&
              value.getAsJsonObject().get("id") != null &&
              value.getAsJsonObject().get("id").getAsString().equals(key)
            ) {
              adsPixelSignalsIWLNuxs.add(loadJSON(value.toString(), context));
            } else {
              isIdIndexedArray = false;
              break;
            }
          }
          if (isIdIndexedArray) {
            return adsPixelSignalsIWLNuxs;
          }

          // Sixth, check if it's pure JsonObject
          adsPixelSignalsIWLNuxs.clear();
          adsPixelSignalsIWLNuxs.add(loadJSON(json, context));
          return adsPixelSignalsIWLNuxs;
        }
      }
    } catch (Exception e) {
      exception = e;
    }
    throw new MalformedResponseException(
      "Invalid response string: " + json,
      exception
    );
  }

  @Override
  public APIContext getContext() {
    return context;
  }

  @Override
  public void setContext(APIContext context) {
    this.context = context;
  }

  @Override
  public String toString() {
    return getGson().toJson(this);
  }

  public APIRequestGet get() {
    return new APIRequestGet(this.getPrefixedId().toString(), context);
  }


  public String getFieldBackgroundColor() {
    return mBackgroundColor;
  }

  public String getFieldContent() {
    return mContent;
  }

  public String getFieldContentColor() {
    return mContentColor;
  }

  public String getFieldContentSize() {
    return mContentSize;
  }

  public String getFieldImgUrl() {
    return mImgUrl;
  }

  public String getFieldId() {
    return mId;
  }



  public static class APIRequestGet extends APIRequest<AdsPixelSignalsIWLNux> {

    AdsPixelSignalsIWLNux lastResponse = null;
    @Override
    public AdsPixelSignalsIWLNux getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "background_color",
      "content",
      "content_color",
      "content_size",
      "img_url",
      "id",
    };

    @Override
    public AdsPixelSignalsIWLNux parseResponse(String response) throws APIException {
      return AdsPixelSignalsIWLNux.parseResponse(response, getContext(), this).head();
    }

    @Override
    public AdsPixelSignalsIWLNux execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public AdsPixelSignalsIWLNux execute(Map<String, Object> extraParams) throws APIException {
      lastResponse = parseResponse(executeInternal(extraParams));
      return lastResponse;
    }

    public ListenableFuture<AdsPixelSignalsIWLNux> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<AdsPixelSignalsIWLNux> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<String, AdsPixelSignalsIWLNux>() {
           public AdsPixelSignalsIWLNux apply(String result) {
             try {
               return APIRequestGet.this.parseResponse(result);
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGet(String nodeId, APIContext context) {
      super(context, nodeId, "/", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGet setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGet setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGet requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGet requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGet requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGet requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGet requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGet requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGet requestBackgroundColorField () {
      return this.requestBackgroundColorField(true);
    }
    public APIRequestGet requestBackgroundColorField (boolean value) {
      this.requestField("background_color", value);
      return this;
    }
    public APIRequestGet requestContentField () {
      return this.requestContentField(true);
    }
    public APIRequestGet requestContentField (boolean value) {
      this.requestField("content", value);
      return this;
    }
    public APIRequestGet requestContentColorField () {
      return this.requestContentColorField(true);
    }
    public APIRequestGet requestContentColorField (boolean value) {
      this.requestField("content_color", value);
      return this;
    }
    public APIRequestGet requestContentSizeField () {
      return this.requestContentSizeField(true);
    }
    public APIRequestGet requestContentSizeField (boolean value) {
      this.requestField("content_size", value);
      return this;
    }
    public APIRequestGet requestImgUrlField () {
      return this.requestImgUrlField(true);
    }
    public APIRequestGet requestImgUrlField (boolean value) {
      this.requestField("img_url", value);
      return this;
    }
    public APIRequestGet requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGet requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
  }


  synchronized /*package*/ static Gson getGson() {
    if (gson != null) {
      return gson;
    } else {
      gson = new GsonBuilder()
        .excludeFieldsWithModifiers(Modifier.STATIC)
        .excludeFieldsWithModifiers(Modifier.PROTECTED)
        .disableHtmlEscaping()
        .create();
    }
    return gson;
  }

  public AdsPixelSignalsIWLNux copyFrom(AdsPixelSignalsIWLNux instance) {
    this.mBackgroundColor = instance.mBackgroundColor;
    this.mContent = instance.mContent;
    this.mContentColor = instance.mContentColor;
    this.mContentSize = instance.mContentSize;
    this.mImgUrl = instance.mImgUrl;
    this.mId = instance.mId;
    this.context = instance.context;
    this.rawValue = instance.rawValue;
    return this;
  }

  public static APIRequest.ResponseParser<AdsPixelSignalsIWLNux> getParser() {
    return new APIRequest.ResponseParser<AdsPixelSignalsIWLNux>() {
      public APINodeList<AdsPixelSignalsIWLNux> parseResponse(String response, APIContext context, APIRequest<AdsPixelSignalsIWLNux> request) throws MalformedResponseException {
        return AdsPixelSignalsIWLNux.parseResponse(response, context, request);
      }
    };
  }
}