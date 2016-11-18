package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

public final class gje {
    final String a;
    final BroadcastReceiver b = new gjf(this);
    private final Context c;
    private final String d;

    public gje(Context context, String str, String str2) {
        this.c = context;
        this.d = str;
        this.a = str2;
    }

    public void a() {
        ik.a(this.c).a(this.b, new IntentFilter(this.d));
    }

    public void b() {
        ik.a(this.c).a(this.b);
    }
}
