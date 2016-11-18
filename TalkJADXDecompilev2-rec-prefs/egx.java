package p000;

import android.view.View;
import android.view.View.OnClickListener;

final class egx implements OnClickListener {
    final /* synthetic */ View f11477a;
    final /* synthetic */ egv f11478b;

    egx(egv egv, View view) {
        this.f11478b = egv;
        this.f11477a = view;
    }

    public void onClick(View view) {
        glk.m17979c("Babel", "contact permission banner declined", new Object[0]);
        gwb.m1823a(this.f11478b.f11475i, 2672);
        this.f11477a.setVisibility(8);
        bkq.m5665a(this.f11478b.context, this.f11478b.f11475i.m5638g(), true);
    }
}
