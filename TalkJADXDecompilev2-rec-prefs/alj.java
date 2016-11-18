package p000;

import android.os.Handler;
import java.util.concurrent.Executor;

final class alj implements Executor {
    final /* synthetic */ Handler f1197a;
    final /* synthetic */ alv f1198b;

    alj(alv alv, Handler handler) {
        this.f1198b = alv;
        this.f1197a = handler;
    }

    public void execute(Runnable runnable) {
        this.f1197a.post(runnable);
    }
}
