package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.text.TextUtils;

public final class ftv extends jxj {
    private Uri a;

    public ftv(Context context) {
        super(context);
    }

    public static void a() {
        Editor edit = gwb.H().getSharedPreferences("babel_ringtones", 0).edit();
        Uri a = gku.a(gwb.ix, bc.ae, ".ogg", 2);
        if (a != null) {
            edit.putString("message_ringtone", a.toString());
        }
        a = gku.a(gwb.iw, bc.ee, ".ogg", 1);
        if (a != null) {
            edit.putString("incoming_call_ringtone", a.toString());
        }
        edit.apply();
    }

    public void a(String str) {
        a(TextUtils.isEmpty(str) ? null : Uri.parse(str));
    }

    public void a(Uri uri) {
        this.a = uri;
        b(gku.a(x(), uri));
    }

    public Uri b() {
        return this.a;
    }

    protected Uri c() {
        if (gku.a.equals(this.a)) {
            return ftv.a(gwb.ix);
        }
        if (gku.b.equals(this.a)) {
            return ftv.a(gwb.iw);
        }
        return super.c();
    }

    public static Uri a(int i) {
        boolean z;
        String str;
        if (i == gwb.ix || i == gwb.iw) {
            z = true;
        } else {
            z = false;
        }
        iil.a("Expected condition to be true", z);
        SharedPreferences sharedPreferences = gwb.H().getSharedPreferences("babel_ringtones", 0);
        if (i == gwb.ix) {
            str = "message_ringtone";
        } else if (i == gwb.iw) {
            str = "incoming_call_ringtone";
        } else {
            iil.a("Unknown resId: " + i);
            str = null;
        }
        str = sharedPreferences.getString(str, null);
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }
}
