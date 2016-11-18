package p000;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;

final class hab extends had {
    final /* synthetic */ Intent f16463a;
    final /* synthetic */ Bitmap f16464b;
    final /* synthetic */ Activity f16465c;
    final /* synthetic */ haa f16466d;

    hab(haa haa, gui gui, Intent intent, Bitmap bitmap, Activity activity) {
        this.f16466d = haa;
        this.f16463a = intent;
        this.f16464b = bitmap;
        this.f16465c = activity;
        super(gui, (byte) 0);
    }

    protected void mo2437a(hag hag) {
        try {
            hag.mo2439a((GoogleHelp) this.f16463a.getParcelableExtra("EXTRA_GOOGLE_HELP"), this.f16464b, new hac(this));
        } catch (Throwable e) {
            Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e);
            m18980d(haa.f16462a);
        }
    }
}
