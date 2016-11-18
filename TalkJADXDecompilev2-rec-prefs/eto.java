package p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

public class eto extends etk {
    private static final long serialVersionUID = 1;
    private final String f12236c;

    public eto(String str) {
        iil.m21879b("Expected condition to be false", TextUtils.isEmpty(str));
        this.f12236c = str;
    }

    public nzf mo1944a(String str, int i, int i2) {
        kop kop = new kop();
        kop.f22555a = this.f12236c;
        kop.f22559e = Integer.valueOf(100);
        kop.f22558d = Integer.valueOf(100);
        kop.f22557c = new int[]{3};
        kop.f22563i = Boolean.valueOf(false);
        nzf knl = new knl();
        knl.f22425a = kop;
        return knl;
    }

    public String mo1947g() {
        return "userphotoalbums";
    }

    public long mo1017b() {
        return TimeUnit.MINUTES.toMillis(5);
    }

    public String K_() {
        return "ui_queue";
    }

    protected boolean mo1955b(Context context, int i, fdo fdo) {
        if (!mo1954a(context, i) || fdo.m15084c() != 111) {
            return super.mo1955b(context, i, fdo);
        }
        glk.m17979c("Babel", "Probably exceeded anonymous daily quota, retrying as authenticated.", new Object[0]);
        return true;
    }

    public boolean mo1954a(Context context, int i) {
        return i == 0 && gwb.m1906a(context, "babel_stickers_anonymous_request", false);
    }
}
