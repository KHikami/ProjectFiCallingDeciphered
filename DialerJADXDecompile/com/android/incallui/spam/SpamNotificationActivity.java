package com.android.incallui.spam;

import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import aui;
import auo;
import aup;
import bfa;
import bfb;
import bfc;
import bfe;
import bfi;
import buf;
import da;
import de;
import rl;
import rq;

/* compiled from: PG */
public class SpamNotificationActivity extends de {
    public final OnDismissListener g;
    private aup h;

    public SpamNotificationActivity() {
        this.g = new bfa(this);
    }

    public static Intent a(String str) {
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        intent.setType("vnd.android.cursor.dir/raw_contact");
        intent.putExtra("phone", str);
        return intent;
    }

    public static String b(String str) {
        return buf.a((CharSequence) str).toString();
    }

    public static void a(Context context, Bundle bundle, int i) {
        buf.H(context).a(i, bundle.getString("call_id"), bundle.getLong("call_start_time_millis", 0));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setFinishOnTouchOutside(true);
        this.h = new aup(this);
        int intExtra = getIntent().getIntExtra("notification_id", 1);
        ((NotificationManager) getSystemService("notification")).cancel(f().getString("phone_number"), intExtra);
    }

    protected void onResume() {
        super.onResume();
        Intent intent = getIntent();
        String string = f().getString("phone_number");
        boolean z = f().getBoolean("is_spam");
        String action = intent.getAction();
        Object obj = -1;
        switch (action.hashCode()) {
            case -1292075633:
                if (action.equals("com.android.incallui.spam.ACTION_MARK_NUMBER_AS_NOT_SPAM")) {
                    obj = 2;
                    break;
                }
                break;
            case -585181605:
                if (action.equals("com.android.incallui.spam.ACTION_SHOW_DIALOG")) {
                    obj = 3;
                    break;
                }
                break;
            case -474617725:
                if (action.equals("com.android.incallui.spam.ACTION_MARK_NUMBER_AS_SPAM")) {
                    obj = 1;
                    break;
                }
                break;
            case 1419322346:
                if (action.equals("com.android.incallui.spam.ACTION_ADD_TO_CONTACTS")) {
                    obj = null;
                    break;
                }
                break;
        }
        switch (obj) {
            case rl.c /*0*/:
                c(1019);
                startActivity(a(string));
                finish();
            case rq.b /*1*/:
                e();
                d(string);
            case rq.c /*2*/:
                e();
                c(string);
            case rl.e /*3*/:
                Bundle f;
                da bfi;
                if (z) {
                    c(1015);
                    f = f();
                    bfi = new bfi();
                    bfi.f(f);
                    bfi.a(d(), "FirstTimeSpamDialog");
                    return;
                }
                c(1016);
                f = f();
                bfi = new bfe();
                bfi.f(f);
                bfi.a(d(), "FirstTimeNonSpamDialog");
            default:
        }
    }

    protected void onPause() {
        this.h = null;
        if (!isFinishing()) {
            finish();
        }
        super.onPause();
    }

    public final void c(String str) {
        if (buf.J(this).c()) {
            aui.a(b(str), new bfb(this, str), this.g).show(getFragmentManager(), "NotSpamDialog");
        } else {
            e(str);
        }
    }

    public final void d(String str) {
        if (buf.J(this).c()) {
            auo bfc = new bfc(this, str);
            if (!buf.a((Context) this, getFragmentManager(), bfc)) {
                bfc.a();
                return;
            }
            return;
        }
        a(str, true);
    }

    public final void a(String str, boolean z) {
        if (z) {
            c(1020);
            buf.J(this).a(str, buf.g((Context) this), 1, 2);
        }
        c(1014);
        this.h.a(null, str, buf.g((Context) this));
        finish();
    }

    public final void e(String str) {
        c(1022);
        buf.J(this).b(str, buf.g((Context) this), 1, 2);
        finish();
    }

    private final void e() {
        if (!buf.J(this).c()) {
            throw new IllegalStateException("Cannot start this activity with given action because dialogs are not enabled.");
        }
    }

    private final Bundle f() {
        return getIntent().getBundleExtra("call_info");
    }

    private final void c(int i) {
        a(this, f(), i);
    }
}
