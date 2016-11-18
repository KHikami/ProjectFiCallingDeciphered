package p000;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class hze extends gve implements hxw {
    private final int f17490c;

    public hze(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f17490c = i2;
    }

    private String m21343a(boolean z) {
        byte[] b = mo1292b();
        Map c = mo1293c();
        StringBuilder stringBuilder = new StringBuilder("DataItemInternal{ ");
        String valueOf = String.valueOf(mo1291a());
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 4).append("uri=").append(valueOf).toString());
        String valueOf2 = String.valueOf(b == null ? "null" : Integer.valueOf(b.length));
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf2).length() + 9).append(", dataSz=").append(valueOf2).toString());
        stringBuilder.append(", numAssets=" + c.size());
        if (z && !c.isEmpty()) {
            stringBuilder.append(", assets=[");
            valueOf = "";
            for (Entry entry : c.entrySet()) {
                String str = (String) entry.getKey();
                valueOf2 = String.valueOf(((hxx) entry.getValue()).mo1289a());
                stringBuilder.append(new StringBuilder(((String.valueOf(valueOf).length() + 2) + String.valueOf(str).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(str).append(": ").append(valueOf2).toString());
                valueOf = ", ";
            }
            stringBuilder.append("]");
        }
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    private hxw m21344d() {
        return new hzc(this);
    }

    public Uri mo1291a() {
        return Uri.parse(m18666b("path"));
    }

    public byte[] mo1292b() {
        return m18667c("data");
    }

    public Map<String, hxx> mo1293c() {
        Map<String, hxx> hashMap = new HashMap(this.f17490c);
        for (int i = 0; i < this.f17490c; i++) {
            hzb hzb = new hzb(this.a, this.b + i);
            if (hzb.mo1290b() != null) {
                hashMap.put(hzb.mo1290b(), hzb);
            }
        }
        return hashMap;
    }

    public /* synthetic */ Object mo1288f() {
        return m21344d();
    }

    public String toString() {
        return m21343a(Log.isLoggable("DataItem", 3));
    }
}
