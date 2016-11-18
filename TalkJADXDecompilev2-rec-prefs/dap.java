package p000;

import android.content.Context;
import android.text.TextUtils;
import java.io.Serializable;

public final class dap extends dam implements Serializable {
    public final String f9435a;
    public final String f9436b;

    public dap(String str, String str2) {
        this.f9435a = str;
        this.f9436b = str2;
    }

    public String toString() {
        return this.f9435a;
    }

    public String m11396a(Context context) {
        Object obj;
        String valueOf;
        String valueOf2 = String.valueOf(glq.m18038i(context, this.f9435a));
        if (TextUtils.isEmpty(this.f9436b)) {
            obj = "";
        } else {
            String str = " ";
            valueOf = String.valueOf(this.f9436b);
            obj = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        }
        valueOf = String.valueOf(obj);
        return valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2);
    }

    public String m11395a() {
        return this.f9436b;
    }
}
