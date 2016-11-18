package p000;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

final class cpt implements OnClickListener {
    final /* synthetic */ String f8803a;
    final /* synthetic */ cpw f8804b;

    cpt(String str, cpw cpw) {
        this.f8803a = str;
        this.f8804b = cpw;
    }

    public void onClick(View view) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", "Debug details");
        intent.putExtra("android.intent.extra.TEXT", this.f8803a);
        this.f8804b.mo721a().startActivity(intent);
    }
}
