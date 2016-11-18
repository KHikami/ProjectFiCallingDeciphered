package p000;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.libraries.quantum.snackbar.Snackbar;

public final class gap implements Runnable {
    private final Snackbar f14554a;
    private final gag f14555b;
    private final gag f14556c;
    private boolean f14557d = true;
    private int f14558e = -1;

    public gap(Snackbar snackbar, gag gag, gag gag2) {
        this.f14554a = snackbar;
        this.f14555b = gag;
        this.f14556c = gag2;
        if (TextUtils.isEmpty(gag.m16806b())) {
            this.f14558e = 0;
            this.f14557d = false;
            return;
        }
        this.f14558e = gag.m16806b().length() - 1;
        this.f14557d = true;
    }

    public void run() {
        String b;
        if (this.f14557d) {
            if (this.f14558e <= 0) {
                this.f14557d = false;
                this.f14554a.m8334a(m16820a(this.f14555b.m16805a(), ""));
            } else {
                b = this.f14555b.m16806b();
                this.f14558e -= Character.charCount(b.codePointAt(this.f14558e));
                this.f14554a.m8334a(m16820a(this.f14555b.m16805a(), b.substring(0, this.f14558e)));
            }
            gwb.m1864a((Runnable) this, 10);
        } else if (TextUtils.isEmpty(this.f14556c.m16806b())) {
            this.f14554a.m8334a(this.f14556c.m16805a());
        } else if (this.f14558e >= this.f14556c.m16806b().length()) {
            this.f14554a.m8334a(m16820a(this.f14556c.m16805a(), this.f14556c.m16806b()));
        } else {
            b = this.f14556c.m16806b();
            int codePointAt = b.codePointAt(this.f14558e);
            this.f14558e = Character.charCount(codePointAt) + this.f14558e;
            this.f14554a.m8334a(m16820a(this.f14556c.m16805a(), b.substring(0, this.f14558e)));
            gwb.m1864a((Runnable) this, 10);
        }
    }

    private CharSequence m16820a(String str, String str2) {
        return gwb.m1618a(str, str2, (TextView) this.f14554a.findViewById(ba.f2692do));
    }
}
