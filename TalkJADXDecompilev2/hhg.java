package defpackage;

import android.content.Context;

public final class hhg {
    public static hhg a = new hhg();
    private hhf b = null;

    public synchronized hhf a(Context context) {
        if (this.b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.b = new hhf(context);
        }
        return this.b;
    }
}
