package p000;

import android.content.Context;

final class ccr extends emv {
    final Context f5017a;
    final boolean f5018b;
    final String f5019c;
    final int f5020d;

    public ccr(Context context, String str, int i, boolean z) {
        String str2 = z ? "high" : "low";
        super(new StringBuilder(String.valueOf(str2).length() + 20).append("Convert to invite (").append(str2).append(")").toString());
        this.f5017a = context;
        this.f5019c = str;
        this.f5020d = i;
        this.f5018b = z;
    }

    public void mo811a() {
        new ccq(new ccs(this)).execute(new Void[0]);
    }
}
