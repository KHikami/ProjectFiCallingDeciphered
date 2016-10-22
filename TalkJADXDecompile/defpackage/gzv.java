package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: gzv */
public final class gzv {
    public final Activity a;
    final gui b;

    public gzv(Activity activity) {
        this(activity, new guj(activity).a(han.c).b());
    }

    private gzv(Activity activity, gui gui) {
        this.a = activity;
        this.b = gui;
    }

    private int a() {
        return gtt.a(this.a);
    }

    private void b(Intent intent) {
        han.a(this.b, new har(this, intent));
    }

    public void a(int i, Intent intent) {
        Intent data = new Intent("android.intent.action.VIEW").setData(((GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP")).b());
        if (i != 7) {
            if ((this.a.getPackageManager().queryIntentActivities(data, 0).size() > 0 ? 1 : 0) != 0) {
                this.a.startActivity(data);
                return;
            }
        }
        gtt.b(i, this.a, 0);
    }

    public void a(Intent intent) {
        if (intent.getAction().equals("com.google.android.gms.googlehelp.HELP") && intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            int a = a();
            if (a == 0) {
                b(intent);
                return;
            } else {
                a(a, intent);
                return;
            }
        }
        throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
    }
}
