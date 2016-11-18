package p000;

import android.content.Context;
import com.google.api.client.http.HttpMethods;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import org.chromium.net.CronetEngine.Builder;

public class jvk implements juy {
    static final kad f21132a = new kad("debug.allowBackendOverride");
    private static String f21133g;
    private final Context f21134b;
    private final String f21135c;
    private final String f21136d;
    private final String f21137e;
    private final String f21138f;

    public jvk(Context context, String str, String str2) {
        this(context, str, null, str2);
    }

    private jvk(Context context, String str, String str2, String str3) {
        this(context, str, null, str3, null);
    }

    public jvk(Context context, String str, String str2, String str3, String str4) {
        this.f21134b = context;
        this.f21135c = str;
        this.f21136d = str3;
        this.f21138f = str2;
        this.f21137e = str4;
    }

    public Map<String, String> mo3615a(String str) {
        Map<String, String> kyVar = new ky();
        kyVar.put("Accept-Language", Locale.getDefault().toString());
        kyVar.put("User-Agent", mo3619a(this.f21134b));
        if (this.f21135c != null) {
            try {
                jvi a = ((jvg) jyn.m25426a(this.f21134b, jvg.class)).mo3614a(this.f21136d).m25310a(this.f21134b, this.f21135c);
                String a2 = a.mo3617a();
                long b = a.mo3618b();
                String str2 = "Authorization";
                String str3 = "Bearer ";
                String valueOf = String.valueOf(a2);
                kyVar.put(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                kyVar.put("X-Auth-Time", Long.toString(b));
                if (this.f21138f != null) {
                    kyVar.put("X-Goog-PageId", this.f21138f);
                }
            } catch (Throwable e) {
                throw new IOException("Cannot obtain authentication token", e);
            }
        }
        if (HttpMethods.PUT.equals(this.f21137e)) {
            kyVar.put("X-HTTP-Method-Override", HttpMethods.PUT);
        }
        return kyVar;
    }

    public void mo3616a() {
        if (this.f21135c != null) {
            try {
                ((jvg) jyn.m25426a(this.f21134b, jvg.class)).mo3614a(this.f21136d).m25312b(this.f21134b, this.f21135c);
            } catch (Throwable e) {
                throw new IOException("Cannot invalidate authentication token", e);
            }
        }
    }

    protected String mo3619a(Context context) {
        if (f21133g == null) {
            f21133g = String.valueOf(new Builder(context).m33539a()).concat(" (gzip)");
        }
        return f21133g;
    }
}
