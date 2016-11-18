package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import java.util.Collections;
import java.util.Locale;

final class fwr implements fwn, jza, kcq {
    boolean a;
    private eia b;

    fwr(kbu kbu) {
        kbu.a((kcq) this);
    }

    public boolean a(Intent intent) {
        if (intent.hasExtra("android.intent.extra.STREAM")) {
            return "file".equals(((Uri) intent.getParcelableExtra("android.intent.extra.STREAM")).getScheme());
        }
        if (!intent.hasExtra("photo_url")) {
            return false;
        }
        String stringExtra = intent.getStringExtra("photo_url");
        if (stringExtra == null || !stringExtra.startsWith("file")) {
            return false;
        }
        return true;
    }

    public void a() {
        boolean z = true;
        synchronized (this) {
            if (this.a) {
                z = false;
            }
            ba.b(z, (Object) "Write storage permission for sharing is already being requested.");
            this.a = true;
            this.b.a(new eie(ba.ea, 3338), Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"));
        }
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.b = (eia) jyn.a(eia.class);
        this.b.a(ba.ea, new fws(this, jyn));
    }

    public boolean a(Context context, String str) {
        boolean z;
        if (!TextUtils.isEmpty(str)) {
            String toLowerCase = str.toLowerCase(Locale.getDefault());
            if (toLowerCase.equals("text/plain")) {
                z = true;
            } else if (toLowerCase.startsWith("image/")) {
                z = true;
            } else if (toLowerCase.startsWith("video/")) {
                z = true;
            }
            if (!z) {
                return true;
            }
            Toast.makeText(context, gwb.uJ, 0).show();
            return false;
        }
        z = false;
        if (!z) {
            return true;
        }
        Toast.makeText(context, gwb.uJ, 0).show();
        return false;
    }
}
