package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: cuf */
public class cuf implements ctw {
    final /* synthetic */ cur a;

    public void a() {
        this.a.a(Integer.valueOf(3));
        cur cur = this.a;
        if (cur.a != null) {
            cur.a.cancel(true);
            cur.a = null;
        }
        if (cur.b != null) {
            cur.b.cancel(true);
            cur.b = null;
        }
        this.a.a = this.a.c.schedule(new cuu(this), 10, TimeUnit.SECONDS);
    }

    cuf(cur cur) {
        this.a = cur;
    }
}
