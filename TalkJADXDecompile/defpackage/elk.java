package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.media.AudioManager;
import android.widget.ArrayAdapter;

/* renamed from: elk */
public final class elk {
    final Context a;
    bko b;
    int c;
    eon d;
    ed e;

    public elk(Context context) {
        this.a = context;
        this.c = ((jca) jyn.a(context, jca.class)).a();
        this.b = fde.e(this.c);
    }

    public elk a(eon eon) {
        this.d = eon;
        return this;
    }

    public elk a(ed edVar) {
        this.e = edVar;
        return this;
    }

    public AlertDialog a() {
        bm.a(this.e);
        bm.a(this.d);
        bm.a(this.b);
        Builder builder = new Builder(this.a);
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("rpc", 0);
        Object arrayAdapter = new ArrayAdapter(this.a, 17367043);
        try {
            PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0);
            String str = "Version ";
            String valueOf = String.valueOf(packageInfo.versionName);
            if (valueOf.length() != 0) {
                valueOf = str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
            arrayAdapter.add(new ell(this, valueOf, packageInfo));
        } catch (Throwable e) {
            glk.d("Babel", "Failed to get package info", e);
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
        AudioManager audioManager = (AudioManager) this.a.getSystemService("audio");
        if (audioManager.isMicrophoneMute()) {
            arrayAdapter.add(new eln(this, "Turn hardware mic on", audioManager));
        } else {
            arrayAdapter.add(new elo(this, "Turn hardware mic off", audioManager));
        }
        arrayAdapter.add(new elp(this, "Re-run RegisterAccountOperation"));
        arrayAdapter.add(new elq(this, "Run DB Cleaner"));
        if (this.b.m()) {
            arrayAdapter.add(new els(this, "Re-import SMS"));
            arrayAdapter.add(new elt(this, "Sync SMS"));
            arrayAdapter.add(new elu(this, "Load SMS/MMS from dump file"));
            arrayAdapter.add(new elv(this, "Email SMS/MMS dump file"));
            arrayAdapter.add(new elw(this, "Load test APN OTA"));
        }
        arrayAdapter.add(new elz(this, "Activate all Butter Bars"));
        long a = gwb.a(this.a, "babel_rtcs_watchdog_warning", 0);
        long a2 = gwb.a(this.a, "babel_rtcs_watchdog_error", 0);
        arrayAdapter.add(new ema(this, "Test RTCS watchdog (warning " + a + ")", a));
        arrayAdapter.add(new emb(this, "Test RTCS watchdog (error " + a2 + ")", a2));
        arrayAdapter.add(new emc(this, "Crash!"));
        arrayAdapter.add(new emd(this, "Simulate Hangouts upgrade"));
        for (emw a3 : jyn.c(this.a, emw.class)) {
            arrayAdapter.add(a3.a(this.a));
        }
        builder.setAdapter(arrayAdapter, new eme(this, arrayAdapter));
        return builder.create();
    }
}
