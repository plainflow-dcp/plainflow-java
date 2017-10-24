package com.plainflow.analytics.internal;

final class AnalyticsVersion {
  private AnalyticsVersion() {
    throw new AssertionError("No instances allowed.");
  }

  static String get() {
    return "analytics/${project.version}";
  }
}
