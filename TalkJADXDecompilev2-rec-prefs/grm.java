package p000;

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
    static final Uri f15968a = new Builder().scheme("wear").path("/hangouts/api_level/").build();
    private static final boolean f15969c = false;
    final gui f15970b;
    private final hxq f15971d = hyi.f17452a;
    private final hyb f15972e = hyi.f17454c;
    private final grp f15973f;
    private final bhl f15974g;
    private final guk f15975h = new grn(this);
    private final Context f15976i;
    private final SharedPreferences f15977j;

    static {
        kae kae = glk.f15575v;
    }

    grm(Context context) {
        this.f15976i = context;
        this.f15970b = new guj(context).m18639a(hyi.f17463l).m18641a(this.f15975h).m18645b();
        this.f15977j = context.getSharedPreferences("wearablePrefs", 0);
        this.f15974g = (bhl) jyn.m25426a(context, bhl.class);
        this.f15973f = new grp(context);
    }

    gui m18345a() {
        return this.f15970b;
    }

    hxq m18350b() {
        return this.f15971d;
    }

    hyb m18351c() {
        return this.f15972e;
    }

    public boolean m18352d() {
        return eao.m13368a(this.f15976i);
    }

    public void m18353e() {
        this.f15970b.mo2523d();
    }

    public void m18349a(String str) {
        if (f15969c) {
            String str2 = "WearableService.saveWearableInformation account: ";
            String valueOf = String.valueOf(glk.m17974b(str));
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        Editor edit = this.f15977j.edit();
        edit.putString("wearable-account-", str);
        edit.apply();
    }

    public String m18354f() {
        return this.f15977j.getString("wearable-account-", null);
    }

    public int m18344a(hxw hxw) {
        return hxw == null ? 0 : hya.m21242a(hxw).m21245b().m21231b("4", 0);
    }

    public void m18347a(int i) {
        Editor edit = this.f15977j.edit();
        edit.putInt("api_level", i);
        edit.apply();
        glk.m17970a("Babel_wear", "Wearable API level saved as " + i, new Object[0]);
    }

    static hxz m18340b(hxw hxw) {
        return hya.m21242a(hxw).m21245b();
    }

    static hyg m18341c(hxw hxw) {
        hya a = hya.m21242a(hxw);
        return new hyg(PutDataRequest.m10014a(a.m21244a()), a.m21245b());
    }

    void m18348a(bko bko, Map<String, String> map, Map<String, Uri> map2) {
        for (String str : map.keySet()) {
            String str2 = (String) map.get(str);
            int a = gwb.m1492a(this.f15976i, "babel_wear_app_profile_picture_request_stress_test_count", 1);
            for (int i = 0; i < a; i++) {
                this.f15973f.m18358a(bko, str, str2, new grr(this.f15976i, this.f15974g));
            }
            if (map2 != null) {
                map2.remove(str);
            }
        }
    }

    String m18346a(byte[] bArr) {
        return new String(Base64.encode(grm.m18343h().digest(bArr), 11), Charset.defaultCharset());
    }

    private static MessageDigest m18343h() {
        try {
            return MessageDigest.getInstance("SHA1");
        } catch (Throwable e) {
            throw new IllegalStateException("proper crypto support not installed", e);
        }
    }

    static int[] m18342g() {
        return fde.m15041s();
    }

    public static bko m18339b(String str) {
        return fde.m14994a(str);
    }

    public static bko m18338b(int i) {
        return fde.m15018e(i);
    }

    public static final boolean m18337a(Context context) {
        return gwb.m1906a(context, "babel_wear_app_use_bitmap_without_ref_count", false);
    }
}
