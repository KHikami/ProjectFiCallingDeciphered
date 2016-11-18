package p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

public class evt extends esw {
    private static final long serialVersionUID = 1;
    public final int f12387c;
    public final long f12388d;
    public final int[] f12389e;
    public final boolean f12390f;
    private final String f12391k;

    public evt(long j, int i, boolean z) {
        this(j, i, true, null);
    }

    private evt(long j, int i, boolean z, String str) {
        this.f12388d = j;
        this.f12391k = str;
        this.f12387c = i;
        this.f12390f = z;
        this.f12389e = new int[2];
        switch (i) {
            case 1:
                this.f12389e[0] = 1;
                this.f12389e[1] = 3;
                return;
            case 2:
                this.f12389e[0] = 2;
                this.f12389e[1] = 3;
                return;
            case 3:
                this.f12389e[0] = 1;
                this.f12389e[1] = 4;
                return;
            case 4:
                this.f12389e[0] = 1;
                this.f12389e[1] = 5;
                return;
            case 5:
                this.f12389e[0] = 1;
                this.f12389e[1] = 3;
                return;
            case 6:
                this.f12389e[0] = 1;
                this.f12389e[1] = 4;
                return;
            default:
                throw new IllegalStateException("illegal filter mode: " + i);
        }
    }

    public evt(int i, boolean z, String str) {
        this(-1, i, false, str);
    }

    public int m14678n() {
        return this.f12387c;
    }

    public nzf mo1944a(String str, int i, int i2) {
        Context H = gwb.m1400H();
        nzf lwq = new lwq();
        if (this.f12388d >= 0) {
            lwq.f26711a = Long.valueOf(this.f12388d);
        }
        int a;
        if (this.f12387c == 5) {
            if (giw.m17760e(H)) {
                a = gwb.m1492a(H, "babel_src_cold_sync_maxevperconv_watch", 4);
            } else {
                a = gwb.m1492a(H, "babel_src_cold_sync_maxevperconv", 20);
            }
            lwq.f26713c = Integer.valueOf(a);
            if (giw.m17760e(H)) {
                a = gwb.m1492a(H, "babel_src_cold_sync_maxconv_watch", 4);
            } else {
                a = gwb.m1492a(H, "babel_src_cold_sync_maxconv", 30);
            }
            lwq.f26712b = Integer.valueOf(a);
        } else {
            lwq lwq2;
            if (giw.m17760e(H)) {
                a = gwb.m1492a(H, "babel_smaxevperconv_watch", 20);
            } else {
                a = gwb.m1492a(H, "babel_smaxevperconv", 20);
            }
            lwq.f26713c = Integer.valueOf(a);
            if (this.f12387c == 6) {
                a = 100;
                lwq2 = lwq;
            } else if (giw.m17760e(H)) {
                a = gwb.m1492a(H, "babel_smaxconv", 4);
                r1 = lwq;
            } else {
                a = gwb.m1492a(H, "babel_smaxconv", 30);
                r1 = lwq;
            }
            lwq2.f26712b = Integer.valueOf(a);
        }
        lwq.requestHeader = euk.m14556a(str, i, i2, this.i);
        if (this.f12389e != null) {
            lwq.f26714d = this.f12389e;
        }
        lwq.f26715e = Integer.valueOf(1);
        return lwq;
    }

    public String mo1947g() {
        return "conversations/syncrecentconversations";
    }

    public boolean m14679o() {
        return this.f12388d >= 0;
    }

    public String m14680p() {
        return this.f12391k;
    }

    public long mo1017b() {
        if (m14679o()) {
            return TimeUnit.SECONDS.toMillis(60);
        }
        return gwb.m1519a(gwb.m1400H(), "babel_src_timeout", fls.f13433j);
    }

    public boolean mo1015a(ead ead) {
        iil.m21869a(getClass(), ead.getClass());
        evt evt = (evt) ead;
        return this.f12388d == evt.f12388d && this.f12387c == evt.f12387c && this.f12390f == evt.f12390f;
    }

    public void mo1945a(Context context, bko bko, fdo fdo) {
        String a = bko.m5629a();
        if (a) {
            String str = "SyncRecentConversations.onFailed ";
            a = String.valueOf(a);
            if (a.length() != 0) {
                str.concat(a);
            } else {
                a = new String(str);
            }
        }
        if (gjk.f15365b) {
            new gjn().m17819a("src_expired").m17817a(bko).m17823b("filterMode=" + this.f12387c).m17824b();
        }
        if (!TextUtils.isEmpty(this.f12391k)) {
            fjj.m15425c(bko.m5638g()).m15435d(this.f12391k);
        }
    }
}
