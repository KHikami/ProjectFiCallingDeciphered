package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;

/* renamed from: hti */
public final class hti extends AnimatorListenerAdapter {
    final /* synthetic */ SelectedAccountNavigationView a;

    public hti(SelectedAccountNavigationView selectedAccountNavigationView) {
        this.a = selectedAccountNavigationView;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.d.B.setVisibility(8);
        this.a.d.y.setVisibility(8);
        if (this.a.d.C != null) {
            this.a.d.C.setVisibility(8);
        }
        SelectedAccountNavigationView selectedAccountNavigationView = this.a;
        if (selectedAccountNavigationView.l != null) {
            selectedAccountNavigationView.b = selectedAccountNavigationView.l;
            selectedAccountNavigationView.l = null;
        }
        if (!(selectedAccountNavigationView.m == null && selectedAccountNavigationView.n == null)) {
            selectedAccountNavigationView.a.clear();
            if (selectedAccountNavigationView.m != null) {
                selectedAccountNavigationView.a.add(selectedAccountNavigationView.m);
            }
            if (selectedAccountNavigationView.n != null) {
                selectedAccountNavigationView.a.add(selectedAccountNavigationView.n);
            }
            selectedAccountNavigationView.m = null;
            selectedAccountNavigationView.n = null;
        }
        this.a.b();
        this.a.k = null;
    }
}
