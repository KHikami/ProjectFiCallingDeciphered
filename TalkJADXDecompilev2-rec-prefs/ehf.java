package p000;

import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;

final class ehf implements OnClickListener {
    final /* synthetic */ egv f11495a;

    ehf(egv egv) {
        this.f11495a = egv;
    }

    public void onClick(View view) {
        this.f11495a.au.mo1670a("click_contact_list");
        gov gov = (gov) this.f11495a.getBinder().m25454b(gov.class);
        gon gon = (gon) view;
        bjg a = gon.m18227a();
        bji q = a.mo583q();
        if (q != bji.NONE) {
            int i = 2572;
            if (q == bji.EMAIL) {
                i = 2571;
            } else if (q == bji.PHONE) {
                i = 2570;
            }
            gwb.m1823a(this.f11495a.f11475i, i);
        }
        if (gov != null) {
            gov.mo1867a(gon);
            return;
        }
        boolean hideSoftInputFromWindow;
        InputMethodManager inputMethodManager = (InputMethodManager) this.f11495a.getContext().getSystemService("input_method");
        if (inputMethodManager.isActive()) {
            hideSoftInputFromWindow = inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0, new ehg(this, new Handler(), a));
        } else {
            hideSoftInputFromWindow = false;
        }
        if (!hideSoftInputFromWindow) {
            this.f11495a.m13896a(a, 2768);
        }
    }
}
