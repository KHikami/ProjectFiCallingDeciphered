package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

public class evv extends esw {
    private static final long serialVersionUID = 1;
    private byte[] f12393c;
    private Map<String, Integer> f12394d;
    private boolean f12395e;

    public evv(byte[] bArr, Map<String, Integer> map, boolean z) {
        this.f12393c = bArr;
        this.f12394d = map;
        this.f12395e = z;
    }

    public nzf mo1944a(String str, int i, int i2) {
        nzf lwx = new lwx();
        lwx.requestHeader = euk.m14557a(null, true, str, i, i2, this.i);
        lwx.f26734b = this.f12393c;
        lwx.f26733a = new lqw[this.f12394d.size()];
        int i3 = 0;
        for (Entry entry : this.f12394d.entrySet()) {
            lqw lqw = new lqw();
            lqw.f26183b = Boolean.valueOf(this.f12395e);
            lqv lqv = new lqv();
            lqv.f26178a = new ltr();
            lqv.f26178a.f26403b = (String) entry.getKey();
            lqv.f26180c = (Integer) entry.getValue();
            lqw.f26182a = lqv;
            int i4 = i3 + 1;
            lwx.f26733a[i3] = lqw;
            i3 = i4;
        }
        return lwx;
    }

    public String mo1947g() {
        return "contacts/updatefavoritecontact";
    }

    public String K_() {
        return "ui_queue";
    }

    boolean m14686n() {
        return this.f12395e;
    }

    Collection<String> m14687o() {
        return this.f12394d.keySet();
    }
}
