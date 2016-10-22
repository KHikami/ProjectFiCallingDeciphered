package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import java.util.Locale;

/* renamed from: dpw */
final class dpw implements dpp {
    private static final Uri a;

    dpw() {
    }

    static {
        a = Uri.parse("https://support.google.com/hangouts/topic/6049282");
    }

    static void a(Activity activity) {
        Object obj;
        String str = "hangouts";
        Uri uri = a;
        gwb.aJ();
        int a = ((jca) jyn.a((Context) activity, jca.class)).a();
        for (dpn a2 : jyn.c(activity, dpn.class)) {
            if (a2.a(activity, a)) {
                obj = 1;
                break;
            }
        }
        obj = null;
        if (obj != null) {
            ((jgg) jyn.a((Context) activity, jgg.class)).a(new dpx(activity, dpp.class.getName(), activity, a, str, uri));
            return;
        }
        dpw.a(activity, str, uri, null);
    }

    static void a(Activity activity, String str, Uri uri, dpm[] dpmArr) {
        igw a = ((igx) jyn.a((Context) activity, igx.class)).a(str).a(uri).a(activity);
        biw g = gwb.g((Context) activity);
        a.a(0, activity.getString(gwb.qu), gwb.z(g.a("babel_privacy_policy_url", "https://www.google.com/policies/privacy/")));
        a.a(0, activity.getString(gwb.qr), new Intent(activity.getApplicationContext(), LicenseMenuActivity.class));
        if ("KR".equals(gwb.W(activity.getApplicationContext()))) {
            a.a(0, activity.getString(gwb.qs), gwb.z(g.a("babel_location_tos_url", "https://www.google.co.kr/intl/ko/policies/terms/location")));
        }
        String a2 = g.a("babel_maps_tos_url", "https://www.google.com/intl/en/help/terms_maps.html");
        if (!TextUtils.isEmpty(Locale.getDefault().getLanguage())) {
            String valueOf = String.valueOf(Locale.getDefault().getLanguage());
            a2 = a2.replace("/en/", new StringBuilder(String.valueOf(valueOf).length() + 2).append("/").append(valueOf).append("/").toString());
        }
        a.a(0, activity.getString(gwb.qt), gwb.z(a2));
        a.a(0, activity.getString(gwb.qv), gwb.z(g.a("babel_tos_url", "https://www.google.com/accounts/tos")));
        Bundle bundle = new Bundle();
        for (dpo a3 : jyn.c(activity, dpo.class)) {
            a3.a(activity, bundle);
        }
        a.a(bundle);
        iid a4 = ((iih) jyn.a((Context) activity, iih.class)).a(((jca) jyn.a((Context) activity, jca.class)).a());
        if (dpmArr != null) {
            for (dpm dpm : dpmArr) {
                a.a(dpm.a, dpm.b, dpm.c);
                a4.b().c(2838);
            }
        }
        a.a(new iha().b(1).a(activity.getResources().getColor(bc.uH)));
        jca jca = (jca) jyn.b((Context) activity, jca.class);
        if (jca != null && jca.b()) {
            a2 = jca.c().b("account_name");
            if (a2.contains("@")) {
                a.a(new Account(a2, "com.google"));
            }
        }
        ((igz) jyn.a((Context) activity, igz.class)).a(activity).a(a.a((Context) activity));
        a4.b().c(1082);
    }
}
