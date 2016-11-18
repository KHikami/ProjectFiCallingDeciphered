package p000;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;

final class btx implements OnClickListener {
    final /* synthetic */ Activity f4457a;
    final /* synthetic */ bko f4458b;
    final /* synthetic */ String f4459c;
    final /* synthetic */ btw f4460d;

    btx(btw btw, Activity activity, bko bko, String str) {
        this.f4460d = btw;
        this.f4457a = activity;
        this.f4458b = bko;
        this.f4459c = str;
    }

    public void onClick(View view) {
        gwb.m1739a(this.f4457a, this.f4458b, view, this.f4460d.f4456a, this.f4459c);
    }
}
