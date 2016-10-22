package com.google.android.libraries.componentview.api.external;

import android.os.Build.VERSION;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import mti;

public interface Readyable {

    public class ReadyInfo {
        public final long a;

        public ReadyInfo() {
            if (VERSION.SDK_INT >= 17) {
                this.a = SystemClock.elapsedRealtimeNanos();
            } else {
                this.a = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
            }
        }

        public ReadyInfo(long j) {
            this.a = j;
        }
    }

    mti<ReadyInfo> a();
}
