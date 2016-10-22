package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;

/* renamed from: hto */
public final class hto implements OnClickListener {
    final /* synthetic */ SelectedAccountNavigationView a;

    public hto(SelectedAccountNavigationView selectedAccountNavigationView) {
        this.a = selectedAccountNavigationView;
    }

    public void onClick(View view) {
        this.a.c();
    }
}
