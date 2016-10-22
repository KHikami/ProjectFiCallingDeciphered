package com.google.android.libraries.hangouts.video.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import ijn;
import ikc;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class CallService extends Service {
    public ijn a;
    private final ikc b;

    public /* synthetic */ IBinder onBind(Intent intent) {
        return a();
    }

    public CallService() {
        this.b = new ikc(this);
    }

    public ikc a() {
        return this.b;
    }

    protected void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (this.a == null) {
            printWriter.println("No call connected");
        } else {
            this.a.a(printWriter);
        }
    }

    public static long a(Context context) {
        try {
            return (long) context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
