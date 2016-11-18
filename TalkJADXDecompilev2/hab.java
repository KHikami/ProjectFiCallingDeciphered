package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;

final class hab extends had {
    final /* synthetic */ Intent a;
    final /* synthetic */ Bitmap b;
    final /* synthetic */ Activity c;
    final /* synthetic */ haa d;

    hab(haa haa, gui gui, Intent intent, Bitmap bitmap, Activity activity) {
        this.d = haa;
        this.a = intent;
        this.b = bitmap;
        this.c = activity;
        super(gui, (byte) 0);
    }

    protected void a(hag hag) {
        try {
            hag.a((GoogleHelp) this.a.getParcelableExtra("EXTRA_GOOGLE_HELP"), this.b, new hac(this));
        } catch (Throwable e) {
            Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e);
            d(haa.a);
        }
    }
}
