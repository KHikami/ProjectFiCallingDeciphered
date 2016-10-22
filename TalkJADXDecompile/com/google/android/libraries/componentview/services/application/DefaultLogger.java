package com.google.android.libraries.componentview.services.application;

import android.util.Log;
import com.google.android.libraries.componentview.api.external.ComponentViewErrorCode.Error;

public class DefaultLogger implements Logger {
    private final Fetcher a;
    private String b;

    public DefaultLogger(Fetcher fetcher) {
        this.b = "www.google.com";
        this.a = fetcher;
    }

    public void a(Error error) {
        b(error);
    }

    public void b(Error error) {
        String valueOf = String.valueOf(error);
        Log.e("DefaultLogger", new StringBuilder(String.valueOf(valueOf).length() + 14).append("Error Code is ").append(valueOf).toString());
    }
}
