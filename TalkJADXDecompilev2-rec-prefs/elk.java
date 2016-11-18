package p000;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.media.AudioManager;
import android.widget.ArrayAdapter;

public final class elk {
    final Context f11810a;
    bko f11811b = fde.m15018e(this.f11812c);
    int f11812c;
    eon f11813d;
    ed f11814e;

    public elk(Context context) {
        this.f11810a = context;
        this.f11812c = ((jca) jyn.m25426a(context, jca.class)).mo2317a();
    }

    public elk m14102a(eon eon) {
        this.f11813d = eon;
        return this;
    }

    public elk m14101a(ed edVar) {
        this.f11814e = edVar;
        return this;
    }

    public AlertDialog m14100a() {
        bm.m6122a(this.f11814e);
        bm.m6122a(this.f11813d);
        bm.m6122a(this.f11811b);
        Builder builder = new Builder(this.f11810a);
        SharedPreferences sharedPreferences = this.f11810a.getSharedPreferences("rpc", 0);
        Object arrayAdapter = new ArrayAdapter(this.f11810a, 17367043);
        try {
            PackageInfo packageInfo = this.f11810a.getPackageManager().getPackageInfo(this.f11810a.getPackageName(), 0);
            String str = "Version ";
            String valueOf = String.valueOf(packageInfo.versionName);
            if (valueOf.length() != 0) {
                valueOf = str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
            arrayAdapter.add(new ell(this, valueOf, packageInfo));
        } catch (Throwable e) {
            glk.m17980d("Babel", "Failed to get package info", e);
        }
        arrayAdapter.add(new ely(this, "Debug Activity"));
        arrayAdapter.add(new emz(this, sharedPreferences));
        arrayAdapter.add(new emo(this, sharedPreferences));
        arrayAdapter.add(new emt(this, sharedPreferences));
        arrayAdapter.add(new emf(this, "Debug Bitmaps Activity"));
        arrayAdapter.add(new emg(this, "Debug OzGetMergedPerson Activity"));
        arrayAdapter.add(new emh(this, "Request Warm Sync"));
        arrayAdapter.add(new emi(this, "Tickle GCM"));
        arrayAdapter.add(new emk(this, "Rewind 10 days"));
        arrayAdapter.add(new emm(this, "Refresh from contacts"));
        arrayAdapter.add(new emn(this, "Dump Database"));
        arrayAdapter.add(new elm(this, "Clear impressions throttles"));
        AudioManager audioManager = (AudioManager) this.f11810a.getSystemService("audio");
        if (audioManager.isMicrophoneMute()) {
            arrayAdapter.add(new eln(this, "Turn hardware mic on", audioManager));
        } else {
            arrayAdapter.add(new elo(this, "Turn hardware mic off", audioManager));
        }
        arrayAdapter.add(new elp(this, "Re-run RegisterAccountOperation"));
        arrayAdapter.add(new elq(this, "Run DB Cleaner"));
        if (this.f11811b.m5644m()) {
            arrayAdapter.add(new els(this, "Re-import SMS"));
            arrayAdapter.add(new elt(this, "Sync SMS"));
            arrayAdapter.add(new elu(this, "Load SMS/MMS from dump file"));
            arrayAdapter.add(new elv(this, "Email SMS/MMS dump file"));
            arrayAdapter.add(new elw(this, "Load test APN OTA"));
        }
        arrayAdapter.add(new elz(this, "Activate all Butter Bars"));
        long a = gwb.m1519a(this.f11810a, "babel_rtcs_watchdog_warning", 0);
        long a2 = gwb.m1519a(this.f11810a, "babel_rtcs_watchdog_error", 0);
        arrayAdapter.add(new ema(this, "Test RTCS watchdog (warning " + a + ")", a));
        arrayAdapter.add(new emb(this, "Test RTCS watchdog (error " + a2 + ")", a2));
        arrayAdapter.add(new emc(this, "Crash!"));
        arrayAdapter.add(new emd(this, "Simulate Hangouts upgrade"));
        for (emw a3 : jyn.m25438c(this.f11810a, emw.class)) {
            arrayAdapter.add(a3.mo2039a(this.f11810a));
        }
        builder.setAdapter(arrayAdapter, new eme(this, arrayAdapter));
        return builder.create();
    }
}
