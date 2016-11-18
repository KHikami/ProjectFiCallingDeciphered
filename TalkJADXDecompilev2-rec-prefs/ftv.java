package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.text.TextUtils;

public final class ftv extends jxj {
    private Uri f13993a;

    public ftv(Context context) {
        super(context);
    }

    public static void m16230a() {
        Editor edit = gwb.m1400H().getSharedPreferences("babel_ringtones", 0).edit();
        Uri a = gku.m17903a(gwb.ix, bc.ae, ".ogg", 2);
        if (a != null) {
            edit.putString("message_ringtone", a.toString());
        }
        a = gku.m17903a(gwb.iw, bc.ee, ".ogg", 1);
        if (a != null) {
            edit.putString("incoming_call_ringtone", a.toString());
        }
        edit.apply();
    }

    public void m16232a(String str) {
        m16231a(TextUtils.isEmpty(str) ? null : Uri.parse(str));
    }

    public void m16231a(Uri uri) {
        this.f13993a = uri;
        mo2102b(gku.m17911a(m5166x(), uri));
    }

    public Uri m16233b() {
        return this.f13993a;
    }

    protected Uri mo1328c() {
        if (gku.f15522a.equals(this.f13993a)) {
            return ftv.m16229a(gwb.ix);
        }
        if (gku.f15523b.equals(this.f13993a)) {
            return ftv.m16229a(gwb.iw);
        }
        return super.mo1328c();
    }

    public static Uri m16229a(int i) {
        boolean z;
        String str;
        if (i == gwb.ix || i == gwb.iw) {
            z = true;
        } else {
            z = false;
        }
        iil.m21874a("Expected condition to be true", z);
        SharedPreferences sharedPreferences = gwb.m1400H().getSharedPreferences("babel_ringtones", 0);
        if (i == gwb.ix) {
            str = "message_ringtone";
        } else if (i == gwb.iw) {
            str = "incoming_call_ringtone";
        } else {
            iil.m21870a("Unknown resId: " + i);
            str = null;
        }
        str = sharedPreferences.getString(str, null);
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }
}
