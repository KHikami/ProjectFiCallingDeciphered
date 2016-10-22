import android.text.TextUtils;

public final class fkv extends fhb {
    public fkv(bko bko) {
        super(bko);
    }

    public void w_() {
        long a = giw.a();
        String e = ffh.a().e();
        if (TextUtils.isEmpty(e)) {
            glk.d("Babel", "Unregister account with invalid gcm registration id", new Object[0]);
        } else {
            a(fnm.a(e, a, gwb.H().getPackageName()));
        }
    }
}
