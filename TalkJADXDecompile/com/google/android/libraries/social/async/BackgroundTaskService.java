package com.google.android.libraries.social.async;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public final class BackgroundTaskService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
