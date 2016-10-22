package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: evi */
public class evi extends esw {
    private static final int[] c;
    private static final long serialVersionUID = 1;
    private final String d;
    private final String e;

    static {
        c = new int[]{1};
    }

    public evi(String str, String str2) {
        this.e = str;
        this.d = str2;
    }

    public nzf a(String str, int i, int i2) {
        nzf luv = new luv();
        luv.a = this.e;
        luv.b = Integer.valueOf(50);
        luv.f = c;
        luv.requestHeader = euk.a(null, true, str, i, i2, this.i);
        return luv;
    }

    public boolean a(Context context, eaf eaf, fdo fdo) {
        return false;
    }

    public String g() {
        return "contacts/searchentities";
    }

    public String K_() {
        return "ui_queue";
    }

    public boolean a(ead ead) {
        iil.a(getClass(), ead.getClass());
        return TextUtils.equals(((evi) ead).d, this.d);
    }
}
