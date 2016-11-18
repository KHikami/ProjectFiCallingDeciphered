package defpackage;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.libraries.quantum.snackbar.Snackbar;

public final class gap implements Runnable {
    private final Snackbar a;
    private final gag b;
    private final gag c;
    private boolean d = true;
    private int e = -1;

    public gap(Snackbar snackbar, gag gag, gag gag2) {
        this.a = snackbar;
        this.b = gag;
        this.c = gag2;
        if (TextUtils.isEmpty(gag.b())) {
            this.e = 0;
            this.d = false;
            return;
        }
        this.e = gag.b().length() - 1;
        this.d = true;
    }

    public void run() {
        String b;
        if (this.d) {
            if (this.e <= 0) {
                this.d = false;
                this.a.a(a(this.b.a(), ""));
            } else {
                b = this.b.b();
                this.e -= Character.charCount(b.codePointAt(this.e));
                this.a.a(a(this.b.a(), b.substring(0, this.e)));
            }
            gwb.a((Runnable) this, 10);
        } else if (TextUtils.isEmpty(this.c.b())) {
            this.a.a(this.c.a());
        } else if (this.e >= this.c.b().length()) {
            this.a.a(a(this.c.a(), this.c.b()));
        } else {
            b = this.c.b();
            int codePointAt = b.codePointAt(this.e);
            this.e = Character.charCount(codePointAt) + this.e;
            this.a.a(a(this.c.a(), b.substring(0, this.e)));
            gwb.a((Runnable) this, 10);
        }
    }

    private CharSequence a(String str, String str2) {
        return gwb.a(str, str2, (TextView) this.a.findViewById(ba.do));
    }
}
