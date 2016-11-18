package p000;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.googlehelp.GoogleHelp;

public final class gzv {
    public final Activity f16458a;
    final gui f16459b;

    public gzv(Activity activity) {
        this(activity, new guj(activity).m18639a(han.f16472c).m18645b());
    }

    private gzv(Activity activity, gui gui) {
        this.f16458a = activity;
        this.f16459b = gui;
    }

    private int m19056a() {
        return gtt.m18579a(this.f16458a);
    }

    private void m19057b(Intent intent) {
        han.m19105a(this.f16459b, new har(this, intent));
    }

    public void m19058a(int i, Intent intent) {
        Intent data = new Intent("android.intent.action.VIEW").setData(((GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP")).m9756b());
        if (i != 7) {
            if ((this.f16458a.getPackageManager().queryIntentActivities(data, 0).size() > 0 ? 1 : 0) != 0) {
                this.f16458a.startActivity(data);
                return;
            }
        }
        gtt.m18591b(i, this.f16458a, 0);
    }

    public void m19059a(Intent intent) {
        if (intent.getAction().equals("com.google.android.gms.googlehelp.HELP") && intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            int a = m19056a();
            if (a == 0) {
                m19057b(intent);
                return;
            } else {
                m19058a(a, intent);
                return;
            }
        }
        throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
    }
}
