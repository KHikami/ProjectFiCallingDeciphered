package defpackage;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import java.util.Map;
import org.chromium.net.CronetEngine;

public final class jvq extends jvk {
    private final juh b;

    public jvq(Context context, String str, String str2, juh juh) {
        super(context, str, str2);
        this.b = juh;
    }

    public Map<String, String> a(String str) {
        Map<String, String> a = super.a(str);
        String str2 = "X-Container-Url";
        juh juh = this.b;
        if (juh.e() != null) {
            juh = juh.e();
        }
        String d = juh.d() != null ? juh.d() : "0";
        String b = juh.b();
        String a2 = juh.a();
        String c = juh.c();
        d = String.valueOf(Uri.encode(d));
        Builder buildUpon = Uri.parse(new StringBuilder(String.valueOf(d).length() + 35).append("http://").append(d).append(".apps.googleusercontent.com/").toString()).buildUpon();
        if (b != null) {
            buildUpon.appendQueryParameter("client_id", b);
        }
        if (a2 != null) {
            buildUpon.appendQueryParameter("api_key", a2);
        }
        if (c != null) {
            buildUpon.appendQueryParameter("pkg", c);
        }
        a.put(str2, buildUpon.build().toString());
        return a;
    }

    protected String a(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(new CronetEngine.Builder(context).a());
        stringBuilder.append("; G+ SDK/");
        stringBuilder.append(this.b.f() == null ? "1.0.0" : this.b.f());
        stringBuilder.append(';');
        return stringBuilder.toString();
    }
}
