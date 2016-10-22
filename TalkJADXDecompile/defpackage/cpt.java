package defpackage;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: cpt */
final class cpt implements OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ cpw b;

    cpt(String str, cpw cpw) {
        this.a = str;
        this.b = cpw;
    }

    public void onClick(View view) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", "Debug details");
        intent.putExtra("android.intent.extra.TEXT", this.a);
        this.b.a().startActivity(intent);
    }
}
