package defpackage;

import android.widget.Toast;

public final class fzr {
    private static final boolean a = false;
    private int b;

    static {
        kae kae = glk.r;
    }

    public fzr() {
        c();
    }

    private void c() {
        this.b = 0;
    }

    public void a() {
        this.b &= 17;
    }

    public void a(boolean z, boolean z2) {
        if (ajf.a().k() != null) {
            a(1, false, false);
        } else {
            a(1, true, false);
        }
    }

    public void b(boolean z, boolean z2) {
        boolean z3;
        if (z && fyi.b()) {
            z3 = true;
        } else {
            z3 = false;
        }
        a(16, z3, false);
    }

    public boolean b() {
        return this.b > 0;
    }

    public void c(boolean z, boolean z2) {
        a(8, z, true);
    }

    private static String a(int i) {
        if (i == 0) {
            return "<none>";
        }
        StringBuilder stringBuilder = new StringBuilder();
        if ((i & 1) > 0) {
            stringBuilder.append("RECIPIENTS_REQUIRE_MMS | ");
        }
        if ((i & 2) > 0) {
            stringBuilder.append("HAS_SUBJECT | ");
        }
        if ((i & 4) > 0) {
            stringBuilder.append("HAS_ATTACHMENT | ");
        }
        if ((i & 8) > 0) {
            stringBuilder.append("LENGTH_REQUIRES_MMS | ");
        }
        if ((i & 16) > 0) {
            stringBuilder.append("MULTIPLE_RECIPIENTS | ");
        }
        stringBuilder.delete(stringBuilder.length() - 3, stringBuilder.length());
        return stringBuilder.toString();
    }

    private void a(int i, boolean z, boolean z2) {
        if (ajf.a().d()) {
            int i2 = this.b;
            if (z) {
                this.b |= i;
            } else {
                this.b &= i ^ -1;
            }
            if (z2 && i2 == 0 && this.b != 0) {
                Toast.makeText(gwb.H(), bc.az, 0).show();
            }
            if (i2 != this.b && a) {
                String valueOf = String.valueOf(fzr.a(i));
                String valueOf2 = String.valueOf(fzr.a(this.b));
                glk.a("Babel_SMS", new StringBuilder((String.valueOf(valueOf).length() + 35) + String.valueOf(valueOf2).length()).append("updateState: oldState: ").append(valueOf).append(" new state: ").append(valueOf2).toString(), new Object[0]);
            }
        }
    }
}
