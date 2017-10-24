package com.plainflow.analytics.http;

import com.plainflow.analytics.messages.Batch;
import retrofit.http.Body;
import retrofit.http.POST;

/** REST interface for the Plainflow API. */
public interface PlainflowService {
  @POST("/v1/import") UploadResponse upload(@Body Batch batch);
}
