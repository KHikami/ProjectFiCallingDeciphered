package defpackage;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class hze extends gve implements hxw {
    private final int c;

    public hze(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.c = i2;
    }

    private String a(boolean z) {
        byte[] b = b();
        Map c = c();
        StringBuilder stringBuilder = new StringBuilder("DataItemInternal{ ");
        String valueOf = String.valueOf(a());
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 4).append("uri=").append(valueOf).toString());
        String valueOf2 = String.valueOf(b == null ? "null" : Integer.valueOf(b.length));
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf2).length() + 9).append(", dataSz=").append(valueOf2).toString());
        stringBuilder.append(", numAssets=" + c.size());
        if (z && !c.isEmpty()) {
            stringBuilder.append(", assets=[");
            valueOf = "";
            for (Entry entry : c.entrySet()) {
                String str = (String) entry.getKey();
                valueOf2 = String.valueOf(((hxx) entry.getValue()).a());
                stringBuilder.append(new StringBuilder(((String.valueOf(valueOf).length() + 2) + String.valueOf(str).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(str).append(": ").append(valueOf2).toString());
                valueOf = ", ";
            }
            stringBuilder.append("]");
        }
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    private hxw d() {
        return new hzc(this);
    }

    public Uri a() {
        return Uri.parse(b("path"));
    }

    public byte[] b() {
        return c("data");
    }

    public Map<String, hxx> c() {
        Map<String, hxx> hashMap = new HashMap(this.c);
        for (int i = 0; i < this.c; i++) {
            hzb hzb = new hzb(this.a, this.b + i);
            if (hzb.b() != null) {
                hashMap.put(hzb.b(), hzb);
            }
        }
        return hashMap;
    }

    public /* synthetic */ Object f() {
        return d();
    }

    public String toString() {
        return a(Log.isLoggable("DataItem", 3));
    }
}
