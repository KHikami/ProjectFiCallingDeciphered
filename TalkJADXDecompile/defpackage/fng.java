package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/* renamed from: fng */
final class fng {
    private final Map<String, mvy> a;

    fng(gmp gmp, String str) {
        this.a = new TreeMap();
        a("client_type", "ANDROID");
        a("resource", str);
        mvy mvy = new mvy();
        mvy.c = gmp.d();
        this.a.put("app_version", mvy);
        a("app_major_version", gmp.c());
        String str2 = "PRODUCTION";
        if (gmp.a()) {
            str2 = "DEVELOPER";
        } else if (gmp.b()) {
            str2 = "DOGFOOD";
        }
        a("app_build_type", str2);
        a("device_hardware", Build.HARDWARE);
        a("device_os_version", Build.FINGERPRINT);
        a("com.google.chat.MESSAGING", true);
    }

    fng a(int i) {
        mvy mvy = new mvy();
        mvy.b = i;
        this.a.put("hw/screen/size_dps", mvy);
        return this;
    }

    fng a(int i, fvv fvv) {
        if (fvv.a(i)) {
            a("availability_sharing", true);
        }
        return this;
    }

    fng a(dgg dgg) {
        if (dgg.c()) {
            a("com.google.hangout.RING", true);
            a("com.google.hangout.VOICEONLY", true);
        }
        return this;
    }

    fng a(Context context, int i) {
        a("com.google.hangout.PSTN_RING", fnk.a(context, fde.e(i)));
        return this;
    }

    private void a(String str, boolean z) {
        mvy mvy = new mvy();
        mvy.d = z;
        this.a.put(str, mvy);
    }

    private void a(String str, String str2) {
        mvy mvy = new mvy();
        mvy.e = str2;
        this.a.put(str, mvy);
    }

    mvn[] a() {
        List arrayList = new ArrayList();
        for (Entry entry : this.a.entrySet()) {
            mvn mvn = new mvn();
            mvn.a = (String) entry.getKey();
            mvn.b = (mvy) entry.getValue();
            arrayList.add(mvn);
        }
        return (mvn[]) arrayList.toArray(new mvn[arrayList.size()]);
    }
}
