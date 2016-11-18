package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.widget.Toast;
import com.google.android.apps.hangouts.customtabs.impl.CustomTabsShareBroadcastReceiver;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

final class cph implements cpd {
    private static final String f8771b;
    Intent f8772a;
    private final biw f8773c;
    private final cpl f8774d;
    private final cpg f8775e;
    private final cpf f8776f;
    private final bbm f8777g;
    private final Bitmap f8778h;
    private final Uri f8779i;

    static {
        String valueOf = String.valueOf(UUID.randomUUID());
        f8771b = new StringBuilder(String.valueOf(valueOf).length() + 9).append("https://").append(valueOf).append("/").toString();
    }

    cph(Context context) {
        this(context, new cpl(context));
    }

    private cph(Context context, cpl cpl) {
        this.f8773c = (biw) jyn.m25426a(context, biw.class);
        this.f8775e = (cpg) jyn.m25433b(context, cpg.class);
        this.f8776f = (cpf) jyn.m25433b(context, cpf.class);
        this.f8774d = cpl;
        this.f8777g = (bbm) jyn.m25426a(context, bbm.class);
        this.f8778h = BitmapFactory.decodeResource(context.getResources(), gwb.nB);
        this.f8772a = new Intent("android.intent.action.VIEW", Uri.parse(f8771b));
        String str = "android-app://";
        String valueOf = String.valueOf(context.getPackageName());
        this.f8779i = Uri.parse(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public void mo1372a(SpannableStringBuilder spannableStringBuilder) {
        int i = 0;
        if (m10626d()) {
            URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
            int length = uRLSpanArr.length;
            while (i < length) {
                URLSpan uRLSpan = uRLSpanArr[i];
                String url = uRLSpan.getURL();
                if (url.startsWith("http") || url.startsWith("https")) {
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new cpo(this, url), spanStart, spanEnd, 33);
                }
                i++;
            }
        }
    }

    private boolean m10624a(Context context, Uri uri) {
        if (m10626d() && m10625c()) {
            Object obj;
            PackageManager packageManager = context.getPackageManager();
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(this.f8772a, 65536);
            List arrayList = new ArrayList(queryIntentActivities.size());
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
            for (ResolveInfo resolveInfo2 : packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 65536)) {
                if (!arrayList.contains(resolveInfo2.activityInfo.packageName)) {
                    obj = 1;
                    break;
                }
            }
            obj = null;
            if (obj == null && this.f8775e != null && this.f8775e.m10623a() != null && this.f8774d.m10646d()) {
                return true;
            }
        }
        return false;
    }

    private boolean m10625c() {
        return this.f8776f != null && this.f8776f.mo1376a();
    }

    private boolean m10626d() {
        return this.f8773c.mo564a("babel_cct_integration_enabled", true);
    }

    void m10628a(Context context, String str) {
        Bundle bundle;
        Intent intent;
        Uri normalizeScheme = Uri.parse(str).normalizeScheme();
        ((iih) jyn.m25426a(context, iih.class)).mo1979a(((jca) jyn.m25426a(context, jca.class)).mo2317a()).mo1693b().mo1714c(3415);
        if (m10624a(context, normalizeScheme)) {
            glk.m17970a("Babel_CustomTabs", "Used custom", new Object[0]);
            aeo aeo = new aeo(this.f8774d.m10643a());
            int c = ia.m10680c(context, ba.jo);
            tz b = aeo.m837a(true).m834a(c).m836a(this.f8778h, context.getResources().getString(gwb.nF), PendingIntent.getBroadcast(context, 0, new Intent(context, CustomTabsShareBroadcastReceiver.class), 0), false).m835a(context, gwb.nz, gwb.ny).m839b(context, gwb.ny, gwb.nA).m840b();
            Intent intent2 = b.k;
            intent2.setPackage(this.f8775e.m10623a());
            intent2.setData(normalizeScheme);
            Bundle bundle2 = b.l;
            Object e = this.f8774d.m10647e();
            if (!TextUtils.isEmpty(e)) {
                if (!e.equals(this.f8777g.mo443c(((jca) jyn.m25426a(context, jca.class)).mo2317a()))) {
                    Toast.makeText(context, context.getResources().getString(gwb.nC, new Object[]{e}), 1).show();
                }
            }
            bundle = bundle2;
            intent = intent2;
        } else {
            glk.m17970a("Babel_CustomTabs", "Used default", new Object[0]);
            intent = new Intent("android.intent.action.VIEW", normalizeScheme);
            bundle = null;
        }
        if (VERSION.SDK_INT >= 17) {
            intent.putExtra("android.intent.extra.REFERRER", this.f8779i);
        }
        context.startActivity(intent, bundle);
    }

    public void mo1371a() {
        if (m10626d()) {
            this.f8774d.m10644b();
        }
    }

    public boolean mo1373b() {
        return m10626d() && this.f8774d.m10646d();
    }
}
