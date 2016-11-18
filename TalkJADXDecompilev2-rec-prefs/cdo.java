package p000;

import android.telephony.SmsMessage;

final class cdo implements Runnable {
    final /* synthetic */ cdh f5079a;
    private CharSequence f5080b;
    private int f5081c;
    private int f5082d;

    cdo(cdh cdh) {
        this.f5079a = cdh;
    }

    public void m7285a(CharSequence charSequence, int i, int i2) {
        this.f5080b = charSequence;
        this.f5081c = i;
        this.f5082d = i2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        int i;
        boolean z = false;
        cdh cdh = this.f5079a;
        CharSequence charSequence = this.f5080b;
        int i2 = this.f5081c;
        int i3 = this.f5082d;
        if (!(cdh.f5066h == null || cdh.f5067i == null || cdh.f5061c == null || !gwb.m2254i(cdh.f5067i.f4147b))) {
            if (cdh.f5065g.m16725b()) {
            }
            int[] calculateLength = SmsMessage.calculateLength(charSequence, false);
            i = calculateLength[0];
            i3 = calculateLength[2];
            if (ajf.m2609a().mo2132p() || ajf.m2609a().mo2133q()) {
                int b = ajf.m2609a().mo2117b();
                fzr fzr = cdh.f5065g;
                if (b > 0 && i > b) {
                    z = true;
                }
                fzr.m16726c(z, true);
            } else {
                fzr fzr2 = cdh.f5065g;
                if (i > 1) {
                    z = true;
                }
                fzr2.m16726c(z, true);
            }
            int c = ajf.m2609a().mo2119c();
            if (c > 0) {
                i2 = calculateLength[1];
                if (i2 + i3 < 140) {
                    c /= 2;
                }
                if (i2 > c) {
                    cdh.f5065g.m16726c(true, true);
                }
            }
        }
        this.f5079a.m7257a();
        cdh cdh2 = this.f5079a;
        long b2 = glj.m17963b();
        i = cdh2.f5060b.getText().toString().trim().length();
        switch (cdh2.f5062d) {
            case 1:
                if (i != 0) {
                    if (b2 - cdh2.f5063e > 5000) {
                        cdh2.f5062d = 2;
                        cdh2.m7258a(cdh2.f5062d);
                        break;
                    }
                }
                cdh2.f5062d = 3;
                cdh2.m7258a(cdh2.f5062d);
                break;
                break;
            case 2:
                if (i != 0) {
                    cdh2.f5062d = 1;
                    cdh2.m7258a(cdh2.f5062d);
                    break;
                }
                cdh2.f5062d = 3;
                break;
            case 3:
                if (i > 0) {
                    cdh2.f5062d = 1;
                    cdh2.m7258a(cdh2.f5062d);
                    break;
                }
                break;
        }
        if (cdh2.f5062d == 1) {
            gwb.m2042b(cdh2.f5068j);
            gwb.m1864a(cdh2.f5068j, 5000);
            cdh2.f5063e = b2;
        }
    }
}
