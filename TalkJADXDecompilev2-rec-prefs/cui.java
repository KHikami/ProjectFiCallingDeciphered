package p000;

import android.content.Context;

public final class cui extends ctv {
    public final int f9101a;
    private final Context f9102c;

    public cui(Context context, int i) {
        super(ctw.f9077b);
        this.f9101a = i;
        this.f9102c = context;
    }

    public String toString() {
        String str = "[StringError] message = ";
        String valueOf = String.valueOf(this.f9102c.getString(this.f9101a));
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }
}
