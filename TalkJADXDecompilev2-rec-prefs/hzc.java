package p000;

import android.net.Uri;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class hzc implements hxw {
    private Uri f17487a;
    private byte[] f17488b;
    private Map<String, hxx> f17489c;

    public hzc(hxw hxw) {
        this.f17487a = hxw.mo1291a();
        this.f17488b = hxw.mo1292b();
        Map hashMap = new HashMap();
        for (Entry entry : hxw.mo1293c().entrySet()) {
            if (entry.getKey() != null) {
                hashMap.put((String) entry.getKey(), (hxx) ((hxx) entry.getValue()).mo1288f());
            }
        }
        this.f17489c = Collections.unmodifiableMap(hashMap);
    }

    private String m21336a(boolean z) {
        StringBuilder stringBuilder = new StringBuilder("DataItemEntity{ ");
        String valueOf = String.valueOf(this.f17487a);
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 4).append("uri=").append(valueOf).toString());
        valueOf = String.valueOf(this.f17488b == null ? "null" : Integer.valueOf(this.f17488b.length));
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 9).append(", dataSz=").append(valueOf).toString());
        stringBuilder.append(", numAssets=" + this.f17489c.size());
        if (z && !this.f17489c.isEmpty()) {
            stringBuilder.append(", assets=[");
            String str = "";
            for (Entry entry : this.f17489c.entrySet()) {
                String str2 = (String) entry.getKey();
                valueOf = String.valueOf(((hxx) entry.getValue()).mo1289a());
                stringBuilder.append(new StringBuilder(((String.valueOf(str).length() + 2) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()).append(str).append(str2).append(": ").append(valueOf).toString());
                str = ", ";
            }
            stringBuilder.append("]");
        }
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    private hxw m21337d() {
        return this;
    }

    public Uri mo1291a() {
        return this.f17487a;
    }

    public byte[] mo1292b() {
        return this.f17488b;
    }

    public Map<String, hxx> mo1293c() {
        return this.f17489c;
    }

    public boolean mo1287e() {
        return true;
    }

    public /* synthetic */ Object mo1288f() {
        return m21337d();
    }

    public String toString() {
        return m21336a(Log.isLoggable("DataItem", 3));
    }
}
