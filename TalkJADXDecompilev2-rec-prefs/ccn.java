package p000;

import android.content.Intent;
import com.google.android.apps.hangouts.phone.DebugActivity;

final class ccn implements Runnable {
    final /* synthetic */ ccm f5012a;

    ccn(ccm ccm) {
        this.f5012a = ccm;
    }

    public void run() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setType("text/plain");
        intent.setClassName("com.google.android.gm", "com.google.android.gm.ComposeActivityGmail");
        String str = "android.intent.extra.SUBJECT";
        String str2 = "conversation ";
        String valueOf = String.valueOf(this.f5012a.f5011a.f5001c.f4146a);
        intent.putExtra(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        intent.putExtra("android.intent.extra.TEXT", DebugActivity.m8911a(this.f5012a.f5011a.f5000b, this.f5012a.f5011a.f5001c.f4146a));
        this.f5012a.f5011a.f4999a.startActivity(intent);
    }
}
