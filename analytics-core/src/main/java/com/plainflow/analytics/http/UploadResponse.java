package com.plainflow.analytics.http;

import com.google.auto.value.AutoValue;
import com.plainflow.analytics.gson.AutoGson;

@AutoValue @AutoGson public abstract class UploadResponse {
  public abstract boolean success();
}
