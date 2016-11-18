package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.util.Base64;
import com.google.android.gms.wearable.PutDataRequest;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Map;

public final class grm {
    static final Uri a = new Builder().scheme("wear").path("/hangouts/api_level/").build();
    private static final boolean c = false;
    final gui b;
    private final hxq d = hyi.a;
    private final hyb e = hyi.c;
    private final grp f;
    private final bhl g;
    private final guk h = new grn(this);
    private final Context i;
    private final SharedPreferences j;

    static {
        kae kae = glk.v;
    }

    grm(Context context) {
        this.i = context;
        this.b = new guj(context).a(hyi.l).a(this.h).b();
        this.j = context.getSharedPreferences("wearablePrefs", 0);
        this.g = (bhl) jyn.a(context, bhl.class);
        this.f = new grp(context);
    }

    gui a() {
        return this.b;
    }

    hxq b() {
        return this.d;
    }

    hyb c() {
        return this.e;
    }

    public boolean d() {
        return eao.a(this.i);
    }

    public void e() {
        this.b.d();
    }

    public void a(String str) {
        if (c) {
            String str2 = "WearableService.saveWearableInformation account: ";
            String valueOf = String.valueOf(glk.b(str));
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        Editor edit = this.j.edit();
        edit.putString("wearable-account-", str);
        edit.apply();
    }

    public String f() {
        return this.j.getString("wearable-account-", null);
    }

    public int a(hxw hxw) {
        return hxw == null ? 0 : hya.a(hxw).b().b("4", 0);
    }

    public void a(int i) {
        Editor edit = this.j.edit();
        edit.putInt("api_level", i);
        edit.apply();
        glk.a("Babel_wear", "Wearable API level saved as " + i, new Object[0]);
    }

    static hxz b(hxw hxw) {
        return hya.a(hxw).b();
    }

    static hyg c(hxw hxw) {
        hya a = hya.a(hxw);
        return new hyg(PutDataRequest.a(a.a()), a.b());
    }

    void a(bko bko, Map<String, String> map, Map<String, Uri> map2) {
        for (String str : map.keySet()) {
            String str2 = (String) map.get(str);
            int a = gwb.a(this.i, "babel_wear_app_profile_picture_request_stress_test_count", 1);
            for (int i = 0; i < a; i++) {
                this.f.a(bko, str, str2, new grr(this.i, this.g));
            }
            if (map2 != null) {
                map2.remove(str);
            }
        }
    }

    String a(byte[] bArr) {
        return new String(Base64.encode(grm.h().digest(bArr), 11), Charset.defaultCharset());
    }

    private static MessageDigest h() {
        try {
            return MessageDigest.getInstance("SHA1");
        } catch (Throwable e) {
            throw new IllegalStateException("proper crypto support not installed", e);
        }
    }

    static int[] g() {
        return fde.s();
    }

    public static bko b(String str) {
        return fde.a(str);
    }

    public static bko b(int i) {
        return fde.e(i);
    }

    public static final boolean a(Context context) {
        return gwb.a(context, "babel_wear_app_use_bitmap_without_ref_count", false);
    }
}
