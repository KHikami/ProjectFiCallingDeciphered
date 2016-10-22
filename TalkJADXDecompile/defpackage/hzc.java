package defpackage;

import android.net.Uri;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: hzc */
public final class hzc implements hxw {
    private Uri a;
    private byte[] b;
    private Map<String, hxx> c;

    public hzc(hxw hxw) {
        this.a = hxw.a();
        this.b = hxw.b();
        Map hashMap = new HashMap();
        for (Entry entry : hxw.c().entrySet()) {
            if (entry.getKey() != null) {
                hashMap.put((String) entry.getKey(), (hxx) ((hxx) entry.getValue()).f());
            }
        }
        this.c = Collections.unmodifiableMap(hashMap);
    }

    private String a(boolean z) {
        StringBuilder stringBuilder = new StringBuilder("DataItemEntity{ ");
        String valueOf = String.valueOf(this.a);
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 4).append("uri=").append(valueOf).toString());
        valueOf = String.valueOf(this.b == null ? "null" : Integer.valueOf(this.b.length));
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 9).append(", dataSz=").append(valueOf).toString());
        stringBuilder.append(", numAssets=" + this.c.size());
        if (z && !this.c.isEmpty()) {
            stringBuilder.append(", assets=[");
            String str = "";
            for (Entry entry : this.c.entrySet()) {
                String str2 = (String) entry.getKey();
                valueOf = String.valueOf(((hxx) entry.getValue()).a());
                stringBuilder.append(new StringBuilder(((String.valueOf(str).length() + 2) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()).append(str).append(str2).append(": ").append(valueOf).toString());
                str = ", ";
            }
            stringBuilder.append("]");
        }
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    private hxw d() {
        return this;
    }

    public Uri a() {
        return this.a;
    }

    public byte[] b() {
        return this.b;
    }

    public Map<String, hxx> c() {
        return this.c;
    }

    public boolean e() {
        return true;
    }

    public /* synthetic */ Object f() {
        return d();
    }

    public String toString() {
        return a(Log.isLoggable("DataItem", 3));
    }
}
