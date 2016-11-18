package defpackage;

import android.content.Context;
import java.io.IOException;

final class iiw implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ iiu c;

    iiw(iiu iiu, Context context, String str) {
        this.c = iiu;
        this.a = context;
        this.b = str;
    }

    public void run() {
        Throwable e;
        try {
            gss.b(this.a, this.b);
            return;
        } catch (gsr e2) {
            e = e2;
        } catch (IOException e3) {
            e = e3;
        }
        itx.a(5, "vclib", "Failed to invalidate access token", e);
    }
}
