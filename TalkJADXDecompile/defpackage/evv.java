package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: evv */
public class evv extends esw {
    private static final long serialVersionUID = 1;
    private byte[] c;
    private Map<String, Integer> d;
    private boolean e;

    public evv(byte[] bArr, Map<String, Integer> map, boolean z) {
        this.c = bArr;
        this.d = map;
        this.e = z;
    }

    public nzf a(String str, int i, int i2) {
        nzf lwx = new lwx();
        lwx.requestHeader = euk.a(null, true, str, i, i2, this.i);
        lwx.b = this.c;
        lwx.a = new lqw[this.d.size()];
        int i3 = 0;
        for (Entry entry : this.d.entrySet()) {
            lqw lqw = new lqw();
            lqw.b = Boolean.valueOf(this.e);
            lqv lqv = new lqv();
            lqv.a = new ltr();
            lqv.a.b = (String) entry.getKey();
            lqv.c = (Integer) entry.getValue();
            lqw.a = lqv;
            int i4 = i3 + 1;
            lwx.a[i3] = lqw;
            i3 = i4;
        }
        return lwx;
    }

    public String g() {
        return "contacts/updatefavoritecontact";
    }

    public String K_() {
        return "ui_queue";
    }

    boolean n() {
        return this.e;
    }

    Collection<String> o() {
        return this.d.keySet();
    }
}
