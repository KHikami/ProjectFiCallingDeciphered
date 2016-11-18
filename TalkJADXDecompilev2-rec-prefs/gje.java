package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

public final class gje {
    final String f15353a;
    final BroadcastReceiver f15354b = new gjf(this);
    private final Context f15355c;
    private final String f15356d;

    public gje(Context context, String str, String str2) {
        this.f15355c = context;
        this.f15356d = str;
        this.f15353a = str2;
    }

    public void m17803a() {
        ik.m22097a(this.f15355c).m22100a(this.f15354b, new IntentFilter(this.f15356d));
    }

    public void m17804b() {
        ik.m22097a(this.f15355c).m22099a(this.f15354b);
    }
}
