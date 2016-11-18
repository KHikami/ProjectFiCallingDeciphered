package p000;

import android.content.Context;

public final class hhg {
    public static hhg f16968a = new hhg();
    private hhf f16969b = null;

    public synchronized hhf m19794a(Context context) {
        if (this.f16969b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f16969b = new hhf(context);
        }
        return this.f16969b;
    }
}
