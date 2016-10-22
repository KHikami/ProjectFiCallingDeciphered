package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* renamed from: eto */
public class eto extends etk {
    private static final long serialVersionUID = 1;
    private final String c;

    public eto(String str) {
        iil.b("Expected condition to be false", TextUtils.isEmpty(str));
        this.c = str;
    }

    public nzf a(String str, int i, int i2) {
        kop kop = new kop();
        kop.a = this.c;
        kop.e = Integer.valueOf(100);
        kop.d = Integer.valueOf(100);
        kop.c = new int[]{3};
        kop.i = Boolean.valueOf(false);
        nzf knl = new knl();
        knl.a = kop;
        return knl;
    }

    public String g() {
        return "userphotoalbums";
    }

    public long b() {
        return TimeUnit.MINUTES.toMillis(5);
    }

    public String K_() {
        return "ui_queue";
    }

    protected boolean b(Context context, int i, fdo fdo) {
        if (!a(context, i) || fdo.c() != 111) {
            return super.b(context, i, fdo);
        }
        glk.c("Babel", "Probably exceeded anonymous daily quota, retrying as authenticated.", new Object[0]);
        return true;
    }

    public boolean a(Context context, int i) {
        return i == 0 && gwb.a(context, "babel_stickers_anonymous_request", false);
    }
}
