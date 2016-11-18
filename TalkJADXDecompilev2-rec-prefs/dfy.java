package p000;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

final class dfy implements OnClickListener {
    final /* synthetic */ View f9639a;
    final /* synthetic */ dfw f9640b;

    dfy(dfw dfw, View view) {
        this.f9640b = dfw;
        this.f9639a = view;
    }

    public void onClick(View view) {
        this.f9639a.setVisibility(8);
        dfw dfw = this.f9640b;
        dfw.f9632c.mo1979a(dfw.f9630a).mo1693b().mo1714c(2866);
        gwb.m2263j(this.f9640b.f9631b, this.f9640b.f9630a);
        this.f9640b.m11628b();
        Toast.makeText(this.f9640b.f9631b, gwb.pX, 0).show();
    }
}
