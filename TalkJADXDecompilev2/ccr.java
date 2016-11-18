package defpackage;

import android.content.Context;

final class ccr extends emv {
    final Context a;
    final boolean b;
    final String c;
    final int d;

    public ccr(Context context, String str, int i, boolean z) {
        String str2 = z ? "high" : "low";
        super(new StringBuilder(String.valueOf(str2).length() + 20).append("Convert to invite (").append(str2).append(")").toString());
        this.a = context;
        this.c = str;
        this.d = i;
        this.b = z;
    }

    public void a() {
        new ccq(new ccs(this)).execute(new Void[0]);
    }
}
