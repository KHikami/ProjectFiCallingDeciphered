package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import okx;
import oky;
import okz;
import ola;
import olc;
import ole;
import olf;
import olg;

/* renamed from: okw */
public final class okw {
    public static final ole<byte[]> a;
    public static final olc<String> b;
    static final olc<Integer> c;
    private final Map<String, List<olg>> d;
    private int e;

    static {
        a = new okx();
        b = new oky();
        c = new okz();
    }

    public okw(byte[]... bArr) {
        boolean z;
        int i = 0;
        this.d = new LinkedHashMap();
        if (bArr.length % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        bm.a(z, "Odd number of key-value pairs: %s", bArr.length);
        while (i < bArr.length) {
            String str = new String(bArr[i], mes.a);
            a(str, new olg(str.endsWith("-bin"), bArr[i + 1]));
            i += 2;
        }
    }

    public okw() {
        this.d = new LinkedHashMap();
    }

    private void a(String str, olg olg) {
        List list = (List) this.d.get(str);
        if (list == null) {
            list = new ArrayList(1);
            this.d.put(str, list);
        }
        this.e++;
        list.add(olg);
    }

    public boolean a(olf<?> olf_) {
        return this.d.containsKey(olf_.a);
    }

    public <T> T b(olf<T> olf_T) {
        List list = (List) this.d.get(olf_T.a);
        if (list == null) {
            return null;
        }
        return ((olg) list.get(list.size() - 1)).a(olf_T);
    }

    public <T> void a(olf<T> olf_T, T t) {
        bm.a((Object) olf_T, (Object) "key");
        bm.a((Object) t, (Object) "value");
        a(olf_T.a, new olg(olf_T, t));
    }

    public <T> Iterable<T> c(olf<T> olf_T) {
        Iterable iterable = (List) this.d.remove(olf_T.a);
        if (iterable == null) {
            return null;
        }
        this.e -= iterable.size();
        return gwb.a(iterable, new ola(this, olf_T));
    }

    public byte[][] a() {
        byte[][] bArr = new byte[(this.e << 1)][];
        int i = 0;
        for (Entry entry : this.d.entrySet()) {
            List list = (List) entry.getValue();
            int i2 = i;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int i4 = i2 + 1;
                bArr[i2] = ((olg) list.get(i3)).b != null ? ((olg) list.get(i3)).b.a() : ((String) entry.getKey()).getBytes(mes.a);
                i2 = i4 + 1;
                bArr[i4] = ((olg) list.get(i3)).a();
            }
            i = i2;
        }
        return bArr;
    }

    public void a(okw okw) {
        bm.a((Object) okw, (Object) "other");
        for (Entry entry : okw.d.entrySet()) {
            for (int i = 0; i < ((List) entry.getValue()).size(); i++) {
                a((String) entry.getKey(), new olg((olg) ((List) entry.getValue()).get(i)));
            }
        }
    }

    public String toString() {
        String valueOf = String.valueOf(this.d.toString());
        return new StringBuilder(String.valueOf(valueOf).length() + 10).append("Metadata(").append(valueOf).append(")").toString();
    }
}
