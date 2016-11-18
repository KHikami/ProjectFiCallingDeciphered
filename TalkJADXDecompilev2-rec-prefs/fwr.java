package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import java.util.Collections;
import java.util.Locale;

final class fwr implements fwn, jza, kcq {
    boolean f14167a;
    private eia f14168b;

    fwr(kbu kbu) {
        kbu.m25514a((kcq) this);
    }

    public boolean mo2107a(Intent intent) {
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

    public void mo2105a() {
        boolean z = true;
        synchronized (this) {
            if (this.f14167a) {
                z = false;
            }
            ba.m4610b(z, (Object) "Write storage permission for sharing is already being requested.");
            this.f14167a = true;
            this.f14168b.mo1886a(new eie(ba.ea, 3338), Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"));
        }
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f14168b = (eia) jyn.m25443a(eia.class);
        this.f14168b.mo1884a(ba.ea, new fws(this, jyn));
    }

    public boolean mo2106a(Context context, String str) {
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
