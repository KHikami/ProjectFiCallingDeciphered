package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

final class alj implements Executor {
    final /* synthetic */ Handler a;
    final /* synthetic */ alv b;

    alj(alv alv, Handler handler) {
        this.b = alv;
        this.a = handler;
    }

    public void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
