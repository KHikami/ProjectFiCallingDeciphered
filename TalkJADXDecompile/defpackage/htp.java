package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;

/* renamed from: htp */
public final class htp implements OnClickListener {
    final /* synthetic */ SelectedAccountNavigationView a;

    public htp(SelectedAccountNavigationView selectedAccountNavigationView) {
        this.a = selectedAccountNavigationView;
    }

    public void onClick(View view) {
        this.a.c();
    }
}
