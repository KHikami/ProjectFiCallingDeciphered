package defpackage;

import android.os.Process;
import android.os.SystemClock;

public final class otp {
    public final String a;
    public final int b = Process.myTid();
    public final long c = SystemClock.elapsedRealtime();
    public long d;

    public otp(String str) {
        this.a = str;
    }

    public void a() {
        this.d = SystemClock.elapsedRealtime();
    }
}
