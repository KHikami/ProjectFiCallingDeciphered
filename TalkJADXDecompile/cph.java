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
    private static final String b;
    Intent a;
    private final biw c;
    private final cpl d;
    private final cpg e;
    private final cpf f;
    private final bbm g;
    private final Bitmap h;
    private final Uri i;

    static {
        String valueOf = String.valueOf(UUID.randomUUID());
        b = new StringBuilder(String.valueOf(valueOf).length() + 9).append("https://").append(valueOf).append("/").toString();
    }

    cph(Context context) {
        this(context, new cpl(context));
    }

    private cph(Context context, cpl cpl) {
        this.c = (biw) jyn.a(context, biw.class);
        this.e = (cpg) jyn.b(context, cpg.class);
        this.f = (cpf) jyn.b(context, cpf.class);
        this.d = cpl;
        this.g = (bbm) jyn.a(context, bbm.class);
        this.h = BitmapFactory.decodeResource(context.getResources(), gwb.nB);
        this.a = new Intent("android.intent.action.VIEW", Uri.parse(b));
        String str = "android-app://";
        String valueOf = String.valueOf(context.getPackageName());
        this.i = Uri.parse(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public void a(SpannableStringBuilder spannableStringBuilder) {
        int i = 0;
        if (d()) {
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

    private boolean a(Context context, Uri uri) {
        if (d() && c()) {
            Object obj;
            PackageManager packageManager = context.getPackageManager();
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(this.a, 65536);
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
            if (obj == null && this.e != null && this.e.a() != null && this.d.d()) {
                return true;
            }
        }
        return false;
    }

    private boolean c() {
        return this.f != null && this.f.a();
    }

    private boolean d() {
        return this.c.a("babel_cct_integration_enabled", true);
    }

    void a(Context context, String str) {
        Bundle bundle;
        Intent intent;
        Uri normalizeScheme = Uri.parse(str).normalizeScheme();
        ((iih) jyn.a(context, iih.class)).a(((jca) jyn.a(context, jca.class)).a()).b().c(3415);
        if (a(context, normalizeScheme)) {
            glk.a("Babel_CustomTabs", "Used custom", new Object[0]);
            aeo aeo = new aeo(this.d.a());
            int c = ia.c(context, ba.jo);
            tz b = aeo.a(true).a(c).a(this.h, context.getResources().getString(gwb.nF), PendingIntent.getBroadcast(context, 0, new Intent(context, CustomTabsShareBroadcastReceiver.class), 0), false).a(context, gwb.nz, gwb.ny).b(context, gwb.ny, gwb.nA).b();
            Intent intent2 = b.k;
            intent2.setPackage(this.e.a());
            intent2.setData(normalizeScheme);
            Bundle bundle2 = b.l;
            Object e = this.d.e();
            if (!TextUtils.isEmpty(e)) {
                if (!e.equals(this.g.c(((jca) jyn.a(context, jca.class)).a()))) {
                    Toast.makeText(context, context.getResources().getString(gwb.nC, new Object[]{e}), 1).show();
                }
            }
            bundle = bundle2;
            intent = intent2;
        } else {
            glk.a("Babel_CustomTabs", "Used default", new Object[0]);
            intent = new Intent("android.intent.action.VIEW", normalizeScheme);
            bundle = null;
        }
        if (VERSION.SDK_INT >= 17) {
            intent.putExtra("android.intent.extra.REFERRER", this.i);
        }
        context.startActivity(intent, bundle);
    }

    public void a() {
        if (d()) {
            this.d.b();
        }
    }

    public boolean b() {
        return d() && this.d.d();
    }
}
