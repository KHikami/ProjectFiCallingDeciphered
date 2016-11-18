package defpackage;

import android.content.Context;

public final class cui extends ctv {
    public final int a;
    private final Context c;

    public cui(Context context, int i) {
        super(ctw.b);
        this.a = i;
        this.c = context;
    }

    public String toString() {
        String str = "[StringError] message = ";
        String valueOf = String.valueOf(this.c.getString(this.a));
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }
}
