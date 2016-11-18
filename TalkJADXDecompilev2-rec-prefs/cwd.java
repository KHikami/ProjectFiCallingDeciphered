package p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.elane.SelfMenuViewController;

public final class cwd implements OnClickListener {
    final /* synthetic */ SelfMenuViewController f9226a;

    public cwd(SelfMenuViewController selfMenuViewController) {
        this.f9226a = selfMenuViewController;
    }

    public void onClick(View view) {
        SelfMenuViewController selfMenuViewController = this.f9226a;
        glk.m17979c("Babel_explane", "Exiting the call because the hangup button was pressed.", new Object[0]);
        selfMenuViewController.f6180a.m10974f().mo3213a(11004);
        gwb.m2251i(this.f9226a.getContext(), 1227);
    }
}
