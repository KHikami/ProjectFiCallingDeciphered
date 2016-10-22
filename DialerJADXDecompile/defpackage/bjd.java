package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: bjd */
public final class bjd {
    public static crm A;
    public static crm B;
    public static crm C;
    public static crm D;
    public static crm E;
    public static crm F;
    public static crm G;
    private static final String[] H;
    private static final crr I;
    private static final crr J;
    private static crm K;
    public static crm a;
    public static crm b;
    public static crm c;
    public static crm d;
    public static crm e;
    public static crm f;
    public static crm g;
    public static crm h;
    public static crm i;
    public static crm j;
    public static crm k;
    public static crm l;
    public static crm m;
    public static crm n;
    public static crm o;
    public static crm p;
    public static crm q;
    public static crm r;
    public static crm s;
    public static crm t;
    public static crm u;
    public static crm v;
    public static crm w;
    public static crm x;
    public static crm y;
    public static crm z;

    static {
        H = new String[]{"ANDROID_DIALER"};
        crr crr = new crr("com.google.android.dialer", "dialer_phenotype_flags");
        crr.a = "G__";
        I = crr;
        crr = new crr("com.google.android.dialer", "dialer_phenotype_flags");
        crr.a = "Scooby__";
        J = crr;
        a = I.a("enable_hangouts_integration", false);
        b = I.a("enable_voicemail_archive", false);
        c = I.a("enable_voicemail_share", false);
        d = I.a("spam_report_checked_by_default", true);
        e = I.a("enable_spam_auto_reject", false);
        f = I.a("enable_after_call_notification", true);
        g = I.a("percentage_of_spam_notifications_to_show", 100);
        h = I.a("percentage_of_non_spam_notifications_to_show", 10);
        i = I.a("enable_dialogs_for_after_call_notification", false);
        j = I.a("hangouts_package_name", "com.google.android.talk");
        k = I.a("enable_silent_crash_reporting", true);
        l = I.a("enable_primes", false);
        m = I.a("enable_primes_memory_metric", false);
        n = I.a("enable_primes_timer_metric", false);
        o = I.a("enable_primes_crash_metric", false);
        p = I.a("enable_primes_network_metric", false);
        q = I.a("reverse_lookup_min_version_enabled", 1);
        r = I.a("reverse_lookup_discovery_protected_photo_url", "https://plus.google.com/_/focus/photos/private");
        s = I.a("reverse_lookup_additional_query_params", "includePeople=1&includeGal=1");
        t = I.a("enable_nearby_places_directory", true);
        u = I.a("nearby_places_directory_radius_meters", 1000);
        v = I.a("nearby_places_min_query_len", 2);
        w = I.a("nearby_places_max_query_len", 50);
        x = I.a("nearby_places_api_scope", "oauth2: https://www.googleapis.com/auth/android_nearbyplaces");
        y = I.a("nearby_places_enable_personalization", true);
        z = I.a("debug_display_nearby_place_distance", false);
        A = I.a("enable_nearby_places_export", true);
        K = J.a("spam_server_host", "telephonyspamprotect-pa.googleapis.com");
        B = J.a("spam_server_port", 443);
        C = J.a("spam_interval_for_wifi_job_milliseconds", TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS));
        D = J.a("spam_interval_for_any_network_job_milliseconds", TimeUnit.MILLISECONDS.convert(2, TimeUnit.DAYS));
        E = J.a("are_spam_jobs_enabled", true);
        F = J.a("enable_droidguard_to_fetch_spam_list", false);
        G = J.a("scooby_experiment_id", 0);
    }

    public static void b(Context context) {
        brc b = new brd(context).a(cre.b).b();
        b.b();
        cre.c.a(b, "com.google.android.dialer", bjd.d(context), H, null).a(new bje(b));
    }

    private static int d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Throwable e) {
            Log.e("GoogleDialerFlags", "Could not find own package", e);
            return -1;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c(android.content.Context r8) {
        /*
        r1 = r8.getContentResolver();
        r2 = K;
        r3 = 0;
        r0 = defpackage.crm.b;
        if (r0 != 0) goto L_0x0013;
    L_0x000b:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must call PhenotypeFlag.init() first";
        r0.<init>(r1);
        throw r0;
    L_0x0013:
        r0 = defpackage.crm.d;
        r0 = r0.b();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x0061;
    L_0x0021:
        r0 = r2.i;
        if (r0 == 0) goto L_0x0049;
    L_0x0025:
        r0 = defpackage.crm.b;
        r3 = r2.i;
        r4 = 0;
        r0 = r0.getSharedPreferences(r3, r4);
        r3 = r2.g;
        r3 = r0.contains(r3);
        if (r3 == 0) goto L_0x0061;
    L_0x0036:
        r0 = r2.a(r0);
    L_0x003a:
        r0 = (java.lang.String) r0;
        r1 = defpackage.blt.a(r1);
        r1 = r1.a(r0);
        r0 = r1.a(r0);
        return r0;
    L_0x0049:
        if (r3 != 0) goto L_0x0078;
    L_0x004b:
        r0 = r2.j;
        r3 = defpackage.crm.b;
        r4 = r2.f;
        r5 = r2.g;
        r6 = r2.h;
        r0 = r0.a(r3, r4, r5, r6);
    L_0x0059:
        if (r0 == 0) goto L_0x0061;
    L_0x005b:
        r0 = r2.a(r0);
        if (r0 != 0) goto L_0x003a;
    L_0x0061:
        r0 = defpackage.crm.b;
        r0 = r0.getContentResolver();
        r3 = r2.e;
        r0 = defpackage.ckq.a(r0, r3);
        if (r0 == 0) goto L_0x0075;
    L_0x006f:
        r0 = r2.a(r0);
        if (r0 != 0) goto L_0x003a;
    L_0x0075:
        r0 = r2.k;
        goto L_0x003a;
    L_0x0078:
        r0 = r2.j;
        r4 = r2.f;
        r5 = r2.g;
        r6 = r2.h;
        r7 = new crk;
        r7.<init>(r4, r5, r6);
        r4 = r0.a(r7);
        if (r4 == 0) goto L_0x0090;
    L_0x008b:
        r0 = r4.a;
        r0 = (com.google.android.gms.phenotype.Flag) r0;
        goto L_0x0059;
    L_0x0090:
        r0 = r0.a(r3, r7);
        goto L_0x0059;
        */
        throw new UnsupportedOperationException("Method not decompiled: bjd.c(android.content.Context):java.lang.String");
    }

    public static void a(Context context) {
        synchronized (crm.a) {
            if (crm.b == null) {
                crm.b = context.getApplicationContext();
                if (crm.b == null) {
                    crm.b = context;
                }
            }
        }
        cme.a(context);
        crm.c = false;
    }
}
