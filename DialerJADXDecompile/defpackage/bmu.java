package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: bmu */
public class bmu {
    private Map a;
    private Map b;
    private List c;
    private List d;

    protected bmu() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    public final bmu a(String str, String str2) {
        this.a.put(str, str2);
        return this;
    }

    public Map a() {
        Map hashMap = new HashMap(this.a);
        int i = 1;
        for (bng a : this.c) {
            hashMap.putAll(a.a(buf.t(i)));
            i++;
        }
        i = 1;
        for (bne a2 : this.d) {
            hashMap.putAll(a2.a(buf.r(i)));
            i++;
        }
        int i2 = 1;
        for (Entry entry : this.b.entrySet()) {
            List<bne> list = (List) entry.getValue();
            String w = buf.w(i2);
            int i3 = 1;
            for (bne a3 : list) {
                hashMap.putAll(a3.a(w + buf.v(i3)));
                i3++;
            }
            if (!TextUtils.isEmpty((CharSequence) entry.getKey())) {
                hashMap.put(w + "nm", entry.getKey());
            }
            i2++;
        }
        return hashMap;
    }
}
