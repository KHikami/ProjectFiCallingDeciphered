package defpackage;

import android.text.TextUtils;
import com.google.android.gms.analytics.internal.Command;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: bos */
public final class bos {
    final Map a;
    final List b;
    final long c;
    final long d;
    final int e;
    final boolean f;
    private final String g;

    public bos(bno bno, Map map, long j, boolean z) {
        this(bno, map, j, z, 0, 0, null);
    }

    public bos(bno bno, Map map, long j, boolean z, long j2, int i) {
        this(bno, map, j, z, j2, i, null);
    }

    public bos(bno bno, Map map, long j, boolean z, long j2, int i, List list) {
        buf.A((Object) bno);
        buf.A((Object) map);
        this.d = j;
        this.f = z;
        this.c = j2;
        this.e = i;
        this.b = list != null ? list : Collections.EMPTY_LIST;
        this.g = bos.a(list);
        Map hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            String a;
            if (bos.a(entry.getKey())) {
                a = bos.a(bno, entry.getKey());
                if (a != null) {
                    hashMap.put(a, bos.b(bno, entry.getValue()));
                }
            }
        }
        for (Entry entry2 : map.entrySet()) {
            if (!bos.a(entry2.getKey())) {
                a = bos.a(bno, entry2.getKey());
                if (a != null) {
                    hashMap.put(a, bos.b(bno, entry2.getValue()));
                }
            }
        }
        if (!TextUtils.isEmpty(this.g)) {
            bpq.a(hashMap, "_v", this.g);
            if (this.g.equals("ma4.0.0") || this.g.equals("ma4.0.1")) {
                hashMap.remove("adid");
            }
        }
        this.a = Collections.unmodifiableMap(hashMap);
    }

    private static String a(bno bno, Object obj) {
        if (obj == null) {
            return null;
        }
        Object obj2 = obj.toString();
        if (obj2.startsWith("&")) {
            obj2 = obj2.substring(1);
        }
        int length = obj2.length();
        if (length > 256) {
            obj2 = obj2.substring(0, 256);
            bno.c("Hit param name is too long and will be trimmed", Integer.valueOf(length), obj2);
        }
        return TextUtils.isEmpty(obj2) ? null : obj2;
    }

    private static String a(List list) {
        CharSequence charSequence;
        if (list != null) {
            for (Command command : list) {
                if ("appendVersion".equals(command.a)) {
                    charSequence = command.b;
                    break;
                }
            }
        }
        charSequence = null;
        return TextUtils.isEmpty(charSequence) ? null : charSequence;
    }

    private static boolean a(Object obj) {
        return obj == null ? false : obj.toString().startsWith("&");
    }

    private static String b(bno bno, Object obj) {
        String obj2 = obj == null ? "" : obj.toString();
        int length = obj2.length();
        if (length <= 8192) {
            return obj2;
        }
        obj2 = obj2.substring(0, 8192);
        bno.c("Hit param value is too long and will be trimmed", Integer.valueOf(length), obj2);
        return obj2;
    }

    final String a(String str, String str2) {
        buf.n(str);
        buf.b(!str.startsWith("&"), (Object) "Short param name required");
        String str3 = (String) this.a.get(str);
        return str3 != null ? str3 : str2;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ht=").append(this.d);
        if (this.c != 0) {
            stringBuffer.append(", dbId=").append(this.c);
        }
        if (((long) this.e) != 0) {
            stringBuffer.append(", appUID=").append(this.e);
        }
        List<String> arrayList = new ArrayList(this.a.keySet());
        Collections.sort(arrayList);
        for (String str : arrayList) {
            stringBuffer.append(", ");
            stringBuffer.append(str);
            stringBuffer.append("=");
            stringBuffer.append((String) this.a.get(str));
        }
        return stringBuffer.toString();
    }
}
