package p000;

import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class chd {
    final Map<String, bpd> f5311a = new HashMap();
    private final gll f5312b;

    public chd(gll gll) {
        this.f5312b = gll;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void m7632a(bpd bpd) {
        if (this.f5312b != null) {
            this.f5312b.m17983a("merge start");
        }
        String format = String.format(Locale.US, "%s, TransportId: {%d}", new Object[]{bpd.f4153h.f11213b.toString(), Integer.valueOf(bpd.f4147b)});
        bpd bpd2 = (bpd) this.f5311a.get(format);
        if (bpd2 == null) {
            this.f5311a.put(format, bpd);
            if (this.f5312b != null) {
                this.f5312b.m17983a("merge done null");
                return;
            }
            return;
        }
        Map map = this.f5311a;
        if (bpd2 != null) {
            if (bpd != null) {
                bls bls = bpd2.f4154i;
                bls bls2 = bpd.f4154i;
                if (bls != null) {
                    if (bls2 != null) {
                        if (bls.f3772r != bls2.f3772r) {
                            if (bls.f3772r != 1) {
                            }
                        }
                        if (bls.f3771q <= bls2.f3771q) {
                            if (bls.f3771q >= bls2.f3771q) {
                                dak dak = bpd2.f4155j;
                                dak dak2 = bpd.f4155j;
                                if (dak2 != null) {
                                    if (dak != null) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
            bpd = bpd2;
        }
        map.put(format, bpd);
        if (this.f5312b != null) {
            this.f5312b.m17983a("merge done picked");
        }
    }

    Collection<bpd> m7631a() {
        return this.f5311a.values();
    }
}
