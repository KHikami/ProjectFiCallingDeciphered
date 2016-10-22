package defpackage;

import java.util.Date;

/* renamed from: lkj */
public final class lkj {
    private final String a;
    private final Long b;

    public lkj(String str, Date date) {
        this.a = str;
        this.b = Long.valueOf(date.getTime());
    }

    public String a() {
        return this.a;
    }

    public Date b() {
        if (this.b == null) {
            return null;
        }
        return new Date(this.b.longValue());
    }
}
