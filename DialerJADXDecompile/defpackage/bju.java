package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: bju */
public class bju implements bei {
    static final String a;
    static final bjf b;
    Context c;
    String d;
    bjr e;
    ExecutorService f;
    Handler g;
    private ExecutorService h;

    static {
        a = bju.class.getSimpleName();
        b = new bjf();
    }

    public bju(Context context) {
        this.e = new bjr();
        this.h = Executors.newFixedThreadPool(2);
        this.f = Executors.newFixedThreadPool(2);
        this.g = new bjv(this, Looper.getMainLooper());
        this.c = context;
        this.d = ((TelephonyManager) this.c.getSystemService("phone")).getSimCountryIso().toUpperCase(Locale.getDefault());
    }

    static String a(String str) {
        if (str.length() <= 4 || !"http:".equals(str.substring(0, 5))) {
            return str;
        }
        String str2 = "https";
        String valueOf = String.valueOf(str.substring(4));
        return valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
    }

    public final void a(String str, bek bek, bej bej, boolean z) {
        try {
            this.h.execute(new bjx(this, str, bek, bej, z));
        } catch (Exception e) {
            bdf.a(a, "Error performing reverse lookup.", e);
        }
    }

    static Account[] a(Context context) {
        return AccountManager.get(context).getAccountsByType("com.google");
    }
}
