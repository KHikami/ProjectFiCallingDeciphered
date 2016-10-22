package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;

/* renamed from: ehf */
final class ehf implements OnClickListener {
    final /* synthetic */ egv a;

    ehf(egv egv) {
        this.a = egv;
    }

    public void onClick(View view) {
        this.a.au.a("click_contact_list");
        gov gov = (gov) this.a.getBinder().b(gov.class);
        gon gon = (gon) view;
        bjg a = gon.a();
        bji q = a.q();
        if (q != bji.NONE) {
            int i = 2572;
            if (q == bji.EMAIL) {
                i = 2571;
            } else if (q == bji.PHONE) {
                i = 2570;
            }
            gwb.a(this.a.i, i);
        }
        if (gov != null) {
            gov.a(gon);
            return;
        }
        boolean hideSoftInputFromWindow;
        InputMethodManager inputMethodManager = (InputMethodManager) this.a.getContext().getSystemService("input_method");
        if (inputMethodManager.isActive()) {
            hideSoftInputFromWindow = inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0, new ehg(this, new Handler(), a));
        } else {
            hideSoftInputFromWindow = false;
        }
        if (!hideSoftInputFromWindow) {
            this.a.a(a, 2768);
        }
    }
}
