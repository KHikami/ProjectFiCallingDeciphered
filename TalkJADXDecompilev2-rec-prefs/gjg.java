package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public final class gjg {
    boolean f15358a;
    private final Context f15359b;
    private final String f15360c;
    private final String f15361d;

    public gjg(Context context, String str, String str2) {
        this.f15359b = context;
        this.f15360c = str;
        this.f15361d = str2;
    }

    public boolean m17805a() {
        BroadcastReceiver gjh = new gjh(this);
        ik a = ik.m22097a(this.f15359b);
        a.m22100a(gjh, new IntentFilter(this.f15361d));
        a.m22102b(new Intent(this.f15360c));
        a.m22099a(gjh);
        return this.f15358a;
    }
}
