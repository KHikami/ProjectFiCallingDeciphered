package p000;

import com.google.android.libraries.social.jni.crashreporter.NativeCrashReporterActivity;

public final class jlw implements Runnable {
    final /* synthetic */ String f20454a;
    final /* synthetic */ NativeCrashReporterActivity f20455b;

    public jlw(NativeCrashReporterActivity nativeCrashReporterActivity, String str) {
        this.f20455b = nativeCrashReporterActivity;
        this.f20454a = str;
    }

    public void run() {
        throw new jlv(this.f20454a);
    }
}
