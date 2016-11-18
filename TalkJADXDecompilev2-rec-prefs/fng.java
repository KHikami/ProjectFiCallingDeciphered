package p000;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

final class fng {
    private final Map<String, mvy> f13495a = new TreeMap();

    fng(gmp gmp, String str) {
        m15698a("client_type", "ANDROID");
        m15698a("resource", str);
        mvy mvy = new mvy();
        mvy.f28531c = gmp.mo2301d();
        this.f13495a.put("app_version", mvy);
        m15698a("app_major_version", gmp.mo2300c());
        String str2 = "PRODUCTION";
        if (gmp.mo2298a()) {
            str2 = "DEVELOPER";
        } else if (gmp.mo2299b()) {
            str2 = "DOGFOOD";
        }
        m15698a("app_build_type", str2);
        m15698a("device_hardware", Build.HARDWARE);
        m15698a("device_os_version", Build.FINGERPRINT);
        m15699a("com.google.chat.MESSAGING", true);
    }

    fng m15700a(int i) {
        mvy mvy = new mvy();
        mvy.f28530b = i;
        this.f13495a.put("hw/screen/size_dps", mvy);
        return this;
    }

    fng m15701a(int i, fvv fvv) {
        if (fvv.m16337a(i)) {
            m15699a("availability_sharing", true);
        }
        return this;
    }

    fng m15703a(dgg dgg) {
        if (dgg.m11710c()) {
            m15699a("com.google.hangout.RING", true);
            m15699a("com.google.hangout.VOICEONLY", true);
        }
        return this;
    }

    fng m15702a(Context context, int i) {
        m15699a("com.google.hangout.PSTN_RING", fnk.m15716a(context, fde.m15018e(i)));
        return this;
    }

    private void m15699a(String str, boolean z) {
        mvy mvy = new mvy();
        mvy.f28532d = z;
        this.f13495a.put(str, mvy);
    }

    private void m15698a(String str, String str2) {
        mvy mvy = new mvy();
        mvy.f28533e = str2;
        this.f13495a.put(str, mvy);
    }

    mvn[] m15704a() {
        List arrayList = new ArrayList();
        for (Entry entry : this.f13495a.entrySet()) {
            mvn mvn = new mvn();
            mvn.f28499a = (String) entry.getKey();
            mvn.f28500b = (mvy) entry.getValue();
            arrayList.add(mvn);
        }
        return (mvn[]) arrayList.toArray(new mvn[arrayList.size()]);
    }
}
