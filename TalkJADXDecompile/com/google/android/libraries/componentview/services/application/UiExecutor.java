package com.google.android.libraries.componentview.services.application;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public class UiExecutor implements Executor {
    private Handler a;

    public UiExecutor() {
        this.a = new Handler(Looper.getMainLooper());
    }

    public void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
