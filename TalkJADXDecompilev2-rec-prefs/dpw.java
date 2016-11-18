package p000;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import java.util.Locale;

final class dpw implements dpp {
    private static final Uri f10313a = Uri.parse("https://support.google.com/hangouts/topic/6049282");

    dpw() {
    }

    static void m12463a(Activity activity) {
        Object obj;
        String str = "hangouts";
        Uri uri = f10313a;
        gwb.aJ();
        int a = ((jca) jyn.m25426a((Context) activity, jca.class)).mo2317a();
        for (dpn a2 : jyn.m25438c(activity, dpn.class)) {
            if (a2.mo1597a(activity, a)) {
                obj = 1;
                break;
            }
        }
        obj = null;
        if (obj != null) {
            ((jgg) jyn.m25426a((Context) activity, jgg.class)).m24134a(new dpx(activity, dpp.class.getName(), activity, a, str, uri));
            return;
        }
        dpw.m12464a(activity, str, uri, null);
    }

    static void m12464a(Activity activity, String str, Uri uri, dpm[] dpmArr) {
        igw a = ((igx) jyn.m25426a((Context) activity, igx.class)).mo3199a(str).m21771a(uri).m21769a(activity);
        biw g = gwb.m2214g((Context) activity);
        a.m21767a(0, activity.getString(gwb.qu), gwb.m2397z(g.mo562a("babel_privacy_policy_url", "https://www.google.com/policies/privacy/")));
        a.m21767a(0, activity.getString(gwb.qr), new Intent(activity.getApplicationContext(), LicenseMenuActivity.class));
        if ("KR".equals(gwb.m1460W(activity.getApplicationContext()))) {
            a.m21767a(0, activity.getString(gwb.qs), gwb.m2397z(g.mo562a("babel_location_tos_url", "https://www.google.co.kr/intl/ko/policies/terms/location")));
        }
        String a2 = g.mo562a("babel_maps_tos_url", "https://www.google.com/intl/en/help/terms_maps.html");
        if (!TextUtils.isEmpty(Locale.getDefault().getLanguage())) {
            String valueOf = String.valueOf(Locale.getDefault().getLanguage());
            a2 = a2.replace("/en/", new StringBuilder(String.valueOf(valueOf).length() + 2).append("/").append(valueOf).append("/").toString());
        }
        a.m21767a(0, activity.getString(gwb.qt), gwb.m2397z(a2));
        a.m21767a(0, activity.getString(gwb.qv), gwb.m2397z(g.mo562a("babel_tos_url", "https://www.google.com/accounts/tos")));
        Bundle bundle = new Bundle();
        for (dpo a3 : jyn.m25438c(activity, dpo.class)) {
            a3.mo1455a(activity, bundle);
        }
        a.m21772a(bundle);
        iid a4 = ((iih) jyn.m25426a((Context) activity, iih.class)).mo1979a(((jca) jyn.m25426a((Context) activity, jca.class)).mo2317a());
        if (dpmArr != null) {
            for (dpm dpm : dpmArr) {
                a.m21774a(dpm.f10298a, dpm.f10299b, dpm.f10300c);
                a4.mo1693b().mo1714c(2838);
            }
        }
        a.m21773a(new iha().m21781b(1).m21779a(activity.getResources().getColor(bc.uH)));
        jca jca = (jca) jyn.m25433b((Context) activity, jca.class);
        if (jca != null && jca.mo2319b()) {
            a2 = jca.mo2320c().mo3440b("account_name");
            if (a2.contains("@")) {
                a.m21768a(new Account(a2, "com.google"));
            }
        }
        ((igz) jyn.m25426a((Context) activity, igz.class)).mo3200a(activity).m21776a(a.m21765a((Context) activity));
        a4.mo1693b().mo1714c(1082);
    }
}
