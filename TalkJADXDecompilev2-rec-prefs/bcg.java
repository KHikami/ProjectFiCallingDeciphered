package p000;

import android.text.TextUtils;
import java.io.Serializable;

public final class bcg implements Serializable {
    private static final long serialVersionUID = 1;
    private final String f3002a;
    private String f3003b;
    private final int f3004c;
    private final bci f3005d;

    public bcg(bch bch) {
        iil.m21875b("Circle id can't be null", bch.f3006a);
        this.f3002a = bch.f3006a;
        this.f3003b = bch.f3007b;
        this.f3004c = bch.f3008c;
        this.f3005d = bch.f3009d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcg)) {
            return false;
        }
        return this.f3002a.equals(((bcg) obj).f3002a);
    }

    public int hashCode() {
        return this.f3002a.hashCode();
    }

    public static bch newBuilder() {
        return new bch();
    }

    public static bch newBuilder(bcg bcg) {
        return bcg.newBuilder().m4855a(bcg);
    }

    public boolean m4844a() {
        return !TextUtils.isEmpty(this.f3002a);
    }

    public String m4845b() {
        return this.f3002a;
    }

    public boolean m4846c() {
        return !TextUtils.isEmpty(this.f3003b);
    }

    public String m4847d() {
        return this.f3003b;
    }

    public int m4848e() {
        return this.f3004c;
    }

    public boolean m4849f() {
        return this.f3005d != null;
    }

    public bci m4850g() {
        return this.f3005d;
    }
}
