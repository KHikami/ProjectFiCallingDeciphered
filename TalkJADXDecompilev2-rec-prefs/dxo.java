package p000;

import android.content.Context;

final class dxo implements dwx {
    private final bbm f10767a;

    dxo(Context context) {
        this.f10767a = (bbm) jyn.m25426a(context, bbm.class);
    }

    public boolean mo1749a(String str) {
        return str.contains("@") && !str.startsWith("@");
    }

    public String mo1748a(int i, String str) {
        String a = this.f10767a.mo440a(i);
        int indexOf = str.indexOf(64);
        int indexOf2 = a.indexOf(64);
        if (indexOf == -1 || indexOf2 == -1) {
            return str;
        }
        String substring = str.substring(indexOf);
        a = a.substring(indexOf2);
        if (!a.startsWith(substring)) {
            return str;
        }
        String valueOf = String.valueOf(str);
        a = String.valueOf(a.substring(substring.length()));
        return a.length() != 0 ? valueOf.concat(a) : new String(valueOf);
    }
}
