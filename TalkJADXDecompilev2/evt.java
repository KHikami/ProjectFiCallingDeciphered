package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

public class evt extends esw {
    private static final long serialVersionUID = 1;
    public final int c;
    public final long d;
    public final int[] e;
    public final boolean f;
    private final String k;

    public evt(long j, int i, boolean z) {
        this(j, i, true, null);
    }

    private evt(long j, int i, boolean z, String str) {
        this.d = j;
        this.k = str;
        this.c = i;
        this.f = z;
        this.e = new int[2];
        switch (i) {
            case 1:
                this.e[0] = 1;
                this.e[1] = 3;
                return;
            case 2:
                this.e[0] = 2;
                this.e[1] = 3;
                return;
            case 3:
                this.e[0] = 1;
                this.e[1] = 4;
                return;
            case 4:
                this.e[0] = 1;
                this.e[1] = 5;
                return;
            case 5:
                this.e[0] = 1;
                this.e[1] = 3;
                return;
            case 6:
                this.e[0] = 1;
                this.e[1] = 4;
                return;
            default:
                throw new IllegalStateException("illegal filter mode: " + i);
        }
    }

    public evt(int i, boolean z, String str) {
        this(-1, i, false, str);
    }

    public int n() {
        return this.c;
    }

    public nzf a(String str, int i, int i2) {
        Context H = gwb.H();
        nzf lwq = new lwq();
        if (this.d >= 0) {
            lwq.a = Long.valueOf(this.d);
        }
        int a;
        if (this.c == 5) {
            if (giw.e(H)) {
                a = gwb.a(H, "babel_src_cold_sync_maxevperconv_watch", 4);
            } else {
                a = gwb.a(H, "babel_src_cold_sync_maxevperconv", 20);
            }
            lwq.c = Integer.valueOf(a);
            if (giw.e(H)) {
                a = gwb.a(H, "babel_src_cold_sync_maxconv_watch", 4);
            } else {
                a = gwb.a(H, "babel_src_cold_sync_maxconv", 30);
            }
            lwq.b = Integer.valueOf(a);
        } else {
            lwq lwq2;
            if (giw.e(H)) {
                a = gwb.a(H, "babel_smaxevperconv_watch", 20);
            } else {
                a = gwb.a(H, "babel_smaxevperconv", 20);
            }
            lwq.c = Integer.valueOf(a);
            if (this.c == 6) {
                a = 100;
                lwq2 = lwq;
            } else if (giw.e(H)) {
                a = gwb.a(H, "babel_smaxconv", 4);
                r1 = lwq;
            } else {
                a = gwb.a(H, "babel_smaxconv", 30);
                r1 = lwq;
            }
            lwq2.b = Integer.valueOf(a);
        }
        lwq.requestHeader = euk.a(str, i, i2, this.i);
        if (this.e != null) {
            lwq.d = this.e;
        }
        lwq.e = Integer.valueOf(1);
        return lwq;
    }

    public String g() {
        return "conversations/syncrecentconversations";
    }

    public boolean o() {
        return this.d >= 0;
    }

    public String p() {
        return this.k;
    }

    public long b() {
        if (o()) {
            return TimeUnit.SECONDS.toMillis(60);
        }
        return gwb.a(gwb.H(), "babel_src_timeout", fls.j);
    }

    public boolean a(ead ead) {
        iil.a(getClass(), ead.getClass());
        evt evt = (evt) ead;
        return this.d == evt.d && this.c == evt.c && this.f == evt.f;
    }

    public void a(Context context, bko bko, fdo fdo) {
        String a = bko.a();
        if (a) {
            String str = "SyncRecentConversations.onFailed ";
            a = String.valueOf(a);
            if (a.length() != 0) {
                str.concat(a);
            } else {
                a = new String(str);
            }
        }
        if (gjk.b) {
            new gjn().a("src_expired").a(bko).b("filterMode=" + this.c).b();
        }
        if (!TextUtils.isEmpty(this.k)) {
            fjj.c(bko.g()).d(this.k);
        }
    }
}
