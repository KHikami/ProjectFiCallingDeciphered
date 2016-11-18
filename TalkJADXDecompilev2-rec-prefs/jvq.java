package p000;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import java.util.Map;
import org.chromium.net.CronetEngine;

public final class jvq extends jvk {
    private final juh f21143b;

    public jvq(Context context, String str, String str2, juh juh) {
        super(context, str, str2);
        this.f21143b = juh;
    }

    public Map<String, String> mo3615a(String str) {
        Map<String, String> a = super.mo3615a(str);
        String str2 = "X-Container-Url";
        juh juh = this.f21143b;
        if (juh.m25220e() != null) {
            juh = juh.m25220e();
        }
        String d = juh.m25219d() != null ? juh.m25219d() : "0";
        String b = juh.m25217b();
        String a2 = juh.m25215a();
        String c = juh.m25218c();
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

    protected String mo3619a(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(new CronetEngine.Builder(context).m33539a());
        stringBuilder.append("; G+ SDK/");
        stringBuilder.append(this.f21143b.m25221f() == null ? "1.0.0" : this.f21143b.m25221f());
        stringBuilder.append(';');
        return stringBuilder.toString();
    }
}
