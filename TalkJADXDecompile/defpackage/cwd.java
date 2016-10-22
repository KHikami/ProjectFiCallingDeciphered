package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.elane.SelfMenuViewController;

/* renamed from: cwd */
public final class cwd implements OnClickListener {
    final /* synthetic */ SelfMenuViewController a;

    public cwd(SelfMenuViewController selfMenuViewController) {
        this.a = selfMenuViewController;
    }

    public void onClick(View view) {
        SelfMenuViewController selfMenuViewController = this.a;
        glk.c("Babel_explane", "Exiting the call because the hangup button was pressed.", new Object[0]);
        selfMenuViewController.a.f().a(11004);
        gwb.i(this.a.getContext(), 1227);
    }
}
