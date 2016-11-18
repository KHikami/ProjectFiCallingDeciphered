package p000;

import java.util.Date;

public final class lkj {
    private final String f25150a;
    private final Long f25151b;

    public lkj(String str, Date date) {
        this.f25150a = str;
        this.f25151b = Long.valueOf(date.getTime());
    }

    public String m29221a() {
        return this.f25150a;
    }

    public Date m29222b() {
        if (this.f25151b == null) {
            return null;
        }
        return new Date(this.f25151b.longValue());
    }
}
