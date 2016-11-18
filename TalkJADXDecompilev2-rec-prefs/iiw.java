package p000;

import android.content.Context;
import java.io.IOException;

final class iiw implements Runnable {
    final /* synthetic */ Context f17750a;
    final /* synthetic */ String f17751b;
    final /* synthetic */ iiu f17752c;

    iiw(iiu iiu, Context context, String str) {
        this.f17752c = iiu;
        this.f17750a = context;
        this.f17751b = str;
    }

    public void run() {
        Throwable e;
        try {
            gss.m18489b(this.f17750a, this.f17751b);
            return;
        } catch (gsr e2) {
            e = e2;
        } catch (IOException e3) {
            e = e3;
        }
        itx.m23278a(5, "vclib", "Failed to invalidate access token", e);
    }
}
