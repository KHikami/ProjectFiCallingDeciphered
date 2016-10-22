import com.google.android.libraries.social.jni.crashreporter.NativeCrashReporterActivity;

public final class jlw implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ NativeCrashReporterActivity b;

    public jlw(NativeCrashReporterActivity nativeCrashReporterActivity, String str) {
        this.b = nativeCrashReporterActivity;
        this.a = str;
    }

    public void run() {
        throw new jlv(this.a);
    }
}
