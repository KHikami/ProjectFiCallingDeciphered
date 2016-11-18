package p000;

import android.text.TextUtils;

public final class fkv extends fhb {
    public fkv(bko bko) {
        super(bko);
    }

    public void w_() {
        long a = giw.m17752a();
        String e = ffh.m15192a().m15204e();
        if (TextUtils.isEmpty(e)) {
            glk.m17981d("Babel", "Unregister account with invalid gcm registration id", new Object[0]);
        } else {
            m8039a(fnm.m15726a(e, a, gwb.m1400H().getPackageName()));
        }
    }
}
