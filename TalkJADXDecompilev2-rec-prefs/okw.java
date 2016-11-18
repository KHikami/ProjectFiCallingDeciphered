package p000;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class okw {
    public static final ole<byte[]> f28745a = new okx();
    public static final olc<String> f28746b = new oky();
    static final olc<Integer> f28747c = new okz();
    private final Map<String, List<olg>> f28748d = new LinkedHashMap();
    private int f28749e;

    public okw(byte[]... bArr) {
        boolean z;
        int i = 0;
        if (bArr.length % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        bm.m6141a(z, "Odd number of key-value pairs: %s", bArr.length);
        while (i < bArr.length) {
            String str = new String(bArr[i], mes.f27586a);
            m33486a(str, new olg(str.endsWith("-bin"), bArr[i + 1]));
            i += 2;
        }
    }

    private void m33486a(String str, olg olg) {
        List list = (List) this.f28748d.get(str);
        if (list == null) {
            list = new ArrayList(1);
            this.f28748d.put(str, list);
        }
        this.f28749e++;
        list.add(olg);
    }

    public boolean m33489a(olf<?> olf_) {
        return this.f28748d.containsKey(olf_.a);
    }

    public <T> T m33491b(olf<T> olf_T) {
        List list = (List) this.f28748d.get(olf_T.a);
        if (list == null) {
            return null;
        }
        return ((olg) list.get(list.size() - 1)).a(olf_T);
    }

    public <T> void m33488a(olf<T> olf_T, T t) {
        bm.m6123a((Object) olf_T, (Object) "key");
        bm.m6123a((Object) t, (Object) "value");
        m33486a(olf_T.a, new olg(olf_T, t));
    }

    public <T> Iterable<T> m33492c(olf<T> olf_T) {
        Iterable iterable = (List) this.f28748d.remove(olf_T.a);
        if (iterable == null) {
            return null;
        }
        this.f28749e -= iterable.size();
        return gwb.m1624a(iterable, new ola(this, olf_T));
    }

    public byte[][] m33490a() {
        byte[][] bArr = new byte[(this.f28749e << 1)][];
        int i = 0;
        for (Entry entry : this.f28748d.entrySet()) {
            List list = (List) entry.getValue();
            int i2 = i;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int i4 = i2 + 1;
                bArr[i2] = ((olg) list.get(i3)).b != null ? ((olg) list.get(i3)).b.a() : ((String) entry.getKey()).getBytes(mes.f27586a);
                i2 = i4 + 1;
                bArr[i4] = ((olg) list.get(i3)).a();
            }
            i = i2;
        }
        return bArr;
    }

    public void m33487a(okw okw) {
        bm.m6123a((Object) okw, (Object) "other");
        for (Entry entry : okw.f28748d.entrySet()) {
            for (int i = 0; i < ((List) entry.getValue()).size(); i++) {
                m33486a((String) entry.getKey(), new olg((olg) ((List) entry.getValue()).get(i)));
            }
        }
    }

    public String toString() {
        String valueOf = String.valueOf(this.f28748d.toString());
        return new StringBuilder(String.valueOf(valueOf).length() + 10).append("Metadata(").append(valueOf).append(")").toString();
    }
}
