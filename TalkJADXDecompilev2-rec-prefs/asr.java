package p000;

import android.util.Log;

enum asr extends asq {
    asr(String str, int i) {
        super(str, 1);
    }

    protected void mo376a(Throwable th) {
        if (th != null && Log.isLoggable("GlideExecutor", 6)) {
            Log.e("GlideExecutor", "Request threw uncaught throwable", th);
        }
    }
}
