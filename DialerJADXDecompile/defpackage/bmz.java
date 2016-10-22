package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bmz */
final class bmz extends bpb implements bmp {
    boolean a;
    long b;
    private int c;
    private boolean d;
    private long e;
    private /* synthetic */ bmx g;

    protected bmz(bmx bmx, bnp bnp) {
        this.g = bmx;
        super(bnp);
        this.b = -1;
    }

    protected final void a() {
    }

    public final void a(Activity activity) {
        if (this.c == 0) {
            if (this.f.c.b() >= this.e + Math.max(1000, this.b)) {
                this.d = true;
            }
        }
        this.c++;
        if (this.a) {
            String queryParameter;
            Intent intent = activity.getIntent();
            if (intent != null) {
                bmx bmx = this.g;
                Uri data = intent.getData();
                if (!(data == null || data.isOpaque())) {
                    Object queryParameter2 = data.getQueryParameter("referrer");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        data = Uri.parse("http://hostname/?" + queryParameter2);
                        String queryParameter3 = data.getQueryParameter("utm_id");
                        if (queryParameter3 != null) {
                            bmx.b.put("&ci", queryParameter3);
                        }
                        queryParameter3 = data.getQueryParameter("anid");
                        if (queryParameter3 != null) {
                            bmx.b.put("&anid", queryParameter3);
                        }
                        queryParameter3 = data.getQueryParameter("utm_campaign");
                        if (queryParameter3 != null) {
                            bmx.b.put("&cn", queryParameter3);
                        }
                        queryParameter3 = data.getQueryParameter("utm_content");
                        if (queryParameter3 != null) {
                            bmx.b.put("&cc", queryParameter3);
                        }
                        queryParameter3 = data.getQueryParameter("utm_medium");
                        if (queryParameter3 != null) {
                            bmx.b.put("&cm", queryParameter3);
                        }
                        queryParameter3 = data.getQueryParameter("utm_source");
                        if (queryParameter3 != null) {
                            bmx.b.put("&cs", queryParameter3);
                        }
                        queryParameter3 = data.getQueryParameter("utm_term");
                        if (queryParameter3 != null) {
                            bmx.b.put("&ck", queryParameter3);
                        }
                        queryParameter3 = data.getQueryParameter("dclid");
                        if (queryParameter3 != null) {
                            bmx.b.put("&dclid", queryParameter3);
                        }
                        queryParameter3 = data.getQueryParameter("gclid");
                        if (queryParameter3 != null) {
                            bmx.b.put("&gclid", queryParameter3);
                        }
                        queryParameter = data.getQueryParameter("aclid");
                        if (queryParameter != null) {
                            bmx.b.put("&aclid", queryParameter);
                        }
                    }
                }
            }
            Map hashMap = new HashMap();
            hashMap.put("&t", "screenview");
            bmx bmx2 = this.g;
            String str = "&cd";
            if (this.g.e != null) {
                bpp bpp = this.g.e;
                String canonicalName = activity.getClass().getCanonicalName();
                queryParameter = (String) bpp.g.get(canonicalName);
                if (queryParameter == null) {
                    queryParameter = canonicalName;
                }
            } else {
                queryParameter = activity.getClass().getCanonicalName();
            }
            bmx2.a(str, queryParameter);
            if (TextUtils.isEmpty((CharSequence) hashMap.get("&dr"))) {
                CharSequence charSequence;
                buf.A((Object) activity);
                intent = activity.getIntent();
                if (intent == null) {
                    charSequence = null;
                } else {
                    charSequence = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                    if (TextUtils.isEmpty(charSequence)) {
                        charSequence = null;
                    }
                }
                if (!TextUtils.isEmpty(charSequence)) {
                    hashMap.put("&dr", charSequence);
                }
            }
            this.g.a(hashMap);
        }
    }

    public final synchronized boolean b() {
        boolean z;
        z = this.d;
        this.d = false;
        return z;
    }

    final void c() {
        if (this.b >= 0 || this.a) {
            bmb d = this.f.d();
            d.d.add(this.g.d);
            Context context = d.a.a;
            if (context instanceof Application) {
                Application application = (Application) context;
                if (VERSION.SDK_INT >= 14 && !d.e) {
                    application.registerActivityLifecycleCallbacks(new bmq(d));
                    d.e = true;
                    return;
                }
                return;
            }
            return;
        }
        bmo d2 = this.f.d();
        d2.d.remove(this.g.d);
    }

    public final void h_() {
        this.c--;
        this.c = Math.max(0, this.c);
        if (this.c == 0) {
            this.e = this.f.c.b();
        }
    }
}
