package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

abstract class caw extends cbc implements jza {
    public jek f4932a;

    protected caw(Context context, kbu kbu) {
        super(context, kbu);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f4932a = (jek) jyn.m25443a(jek.class);
    }

    protected void m7107a(int i, String str, Uri uri, Uri uri2, int i2) {
        this.f4932a.m24035a(i, gwb.m1553a(str, uri, uri2, i2));
    }

    protected String m7106a(Intent intent, Uri uri) {
        Uri uri2 = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
        if (uri == null || !uri.equals(uri2)) {
            return uri2 == null ? "" : uri2.toString();
        } else {
            return null;
        }
    }
}
