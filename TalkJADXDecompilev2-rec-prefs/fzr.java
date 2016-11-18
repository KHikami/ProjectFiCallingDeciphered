package p000;

import android.widget.Toast;

public final class fzr {
    private static final boolean f14503a = false;
    private int f14504b;

    static {
        kae kae = glk.f15571r;
    }

    public fzr() {
        m16721c();
    }

    private void m16721c() {
        this.f14504b = 0;
    }

    public void m16722a() {
        this.f14504b &= 17;
    }

    public void m16723a(boolean z, boolean z2) {
        if (ajf.m2609a().mo2127k() != null) {
            m16720a(1, false, false);
        } else {
            m16720a(1, true, false);
        }
    }

    public void m16724b(boolean z, boolean z2) {
        boolean z3;
        if (z && fyi.m16621b()) {
            z3 = true;
        } else {
            z3 = false;
        }
        m16720a(16, z3, false);
    }

    public boolean m16725b() {
        return this.f14504b > 0;
    }

    public void m16726c(boolean z, boolean z2) {
        m16720a(8, z, true);
    }

    private static String m16719a(int i) {
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

    private void m16720a(int i, boolean z, boolean z2) {
        if (ajf.m2609a().mo2120d()) {
            int i2 = this.f14504b;
            if (z) {
                this.f14504b |= i;
            } else {
                this.f14504b &= i ^ -1;
            }
            if (z2 && i2 == 0 && this.f14504b != 0) {
                Toast.makeText(gwb.m1400H(), bc.az, 0).show();
            }
            if (i2 != this.f14504b && f14503a) {
                String valueOf = String.valueOf(fzr.m16719a(i));
                String valueOf2 = String.valueOf(fzr.m16719a(this.f14504b));
                glk.m17970a("Babel_SMS", new StringBuilder((String.valueOf(valueOf).length() + 35) + String.valueOf(valueOf2).length()).append("updateState: oldState: ").append(valueOf).append(" new state: ").append(valueOf2).toString(), new Object[0]);
            }
        }
    }
}
