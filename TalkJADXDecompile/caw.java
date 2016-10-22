import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

abstract class caw extends cbc implements jza {
    public jek a;

    protected caw(Context context, kbu kbu) {
        super(context, kbu);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.a = (jek) jyn.a(jek.class);
    }

    protected void a(int i, String str, Uri uri, Uri uri2, int i2) {
        this.a.a(i, gwb.a(str, uri, uri2, i2));
    }

    protected String a(Intent intent, Uri uri) {
        Uri uri2 = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
        if (uri == null || !uri.equals(uri2)) {
            return uri2 == null ? "" : uri2.toString();
        } else {
            return null;
        }
    }
}
