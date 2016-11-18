package p000;

import android.content.Context;
import android.text.TextUtils;

public class evi extends esw {
    private static final int[] f12362c = new int[]{1};
    private static final long serialVersionUID = 1;
    private final String f12363d;
    private final String f12364e;

    public evi(String str, String str2) {
        this.f12364e = str;
        this.f12363d = str2;
    }

    public nzf mo1944a(String str, int i, int i2) {
        nzf luv = new luv();
        luv.f26536a = this.f12364e;
        luv.f26537b = Integer.valueOf(50);
        luv.f26541f = f12362c;
        luv.requestHeader = euk.m14557a(null, true, str, i, i2, this.i);
        return luv;
    }

    public boolean mo1008a(Context context, eaf eaf, fdo fdo) {
        return false;
    }

    public String mo1947g() {
        return "contacts/searchentities";
    }

    public String K_() {
        return "ui_queue";
    }

    public boolean mo1015a(ead ead) {
        iil.m21869a(getClass(), ead.getClass());
        return TextUtils.equals(((evi) ead).f12363d, this.f12363d);
    }
}
