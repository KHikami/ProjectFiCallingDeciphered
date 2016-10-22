package defpackage;

import android.os.Process;

/* renamed from: cqs */
final class cqs extends Thread {
    cqs(Runnable runnable, String str) {
        super(runnable, str);
    }

    public final void run() {
        Process.setThreadPriority(10);
        super.run();
    }
}
