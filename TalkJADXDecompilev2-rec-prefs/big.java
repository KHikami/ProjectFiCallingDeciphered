package p000;

import com.google.android.apps.hangouts.concurrent.impl.ConcurrentService;
import java.lang.Thread.UncaughtExceptionHandler;

public final class big implements UncaughtExceptionHandler {
    final /* synthetic */ ConcurrentService f3428a;

    public big(ConcurrentService concurrentService) {
        this.f3428a = concurrentService;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        String valueOf = String.valueOf(thread);
        glk.m17980d("Babel_ConcService", new StringBuilder(String.valueOf(valueOf).length() + 32).append("ConcurrentService thread failed:").append(valueOf).toString(), th);
        String valueOf2 = String.valueOf(thread);
        valueOf = String.valueOf(th);
        iil.m21870a(new StringBuilder((String.valueOf(valueOf2).length() + 33) + String.valueOf(valueOf).length()).append("ConcurrentService thread failed:").append(valueOf2).append("\n").append(valueOf).toString());
    }
}
