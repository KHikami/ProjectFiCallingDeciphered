package defpackage;

import android.content.Intent;
import com.google.android.apps.hangouts.phone.DebugActivity;

/* renamed from: ccn */
final class ccn implements Runnable {
    final /* synthetic */ ccm a;

    ccn(ccm ccm) {
        this.a = ccm;
    }

    public void run() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setType("text/plain");
        intent.setClassName("com.google.android.gm", "com.google.android.gm.ComposeActivityGmail");
        String str = "android.intent.extra.SUBJECT";
        String str2 = "conversation ";
        String valueOf = String.valueOf(this.a.a.c.a);
        intent.putExtra(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        intent.putExtra("android.intent.extra.TEXT", DebugActivity.a(this.a.a.b, this.a.a.c.a));
        this.a.a.a.startActivity(intent);
    }
}
