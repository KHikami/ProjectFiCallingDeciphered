package defpackage;

import android.content.Context;
import com.google.api.client.http.HttpMethods;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import org.chromium.net.CronetEngine.Builder;

public class jvk implements juy {
    static final kad a = new kad("debug.allowBackendOverride");
    private static String g;
    private final Context b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;

    public jvk(Context context, String str, String str2) {
        this(context, str, null, str2);
    }

    private jvk(Context context, String str, String str2, String str3) {
        this(context, str, null, str3, null);
    }

    public jvk(Context context, String str, String str2, String str3, String str4) {
        this.b = context;
        this.c = str;
        this.d = str3;
        this.f = str2;
        this.e = str4;
    }

    public Map<String, String> a(String str) {
        Map<String, String> kyVar = new ky();
        kyVar.put("Accept-Language", Locale.getDefault().toString());
        kyVar.put("User-Agent", a(this.b));
        if (this.c != null) {
            try {
                jvi a = ((jvg) jyn.a(this.b, jvg.class)).a(this.d).a(this.b, this.c);
                String a2 = a.a();
                long b = a.b();
                String str2 = "Authorization";
                String str3 = "Bearer ";
                String valueOf = String.valueOf(a2);
                kyVar.put(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                kyVar.put("X-Auth-Time", Long.toString(b));
                if (this.f != null) {
                    kyVar.put("X-Goog-PageId", this.f);
                }
            } catch (Throwable e) {
                throw new IOException("Cannot obtain authentication token", e);
            }
        }
        if (HttpMethods.PUT.equals(this.e)) {
            kyVar.put("X-HTTP-Method-Override", HttpMethods.PUT);
        }
        return kyVar;
    }

    public void a() {
        if (this.c != null) {
            try {
                ((jvg) jyn.a(this.b, jvg.class)).a(this.d).b(this.b, this.c);
            } catch (Throwable e) {
                throw new IOException("Cannot invalidate authentication token", e);
            }
        }
    }

    protected String a(Context context) {
        if (g == null) {
            g = String.valueOf(new Builder(context).a()).concat(" (gzip)");
        }
        return g;
    }
}
