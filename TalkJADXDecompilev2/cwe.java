package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.elane.SelfMenuViewController;

public final class cwe implements OnClickListener {
    final /* synthetic */ SelfMenuViewController a;

    public cwe(SelfMenuViewController selfMenuViewController) {
        this.a = selfMenuViewController;
    }

    public void onClick(View view) {
        this.a.a.g().j();
        gwb.i(this.a.getContext(), 275);
    }
}
