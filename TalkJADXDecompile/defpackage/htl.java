package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;

/* renamed from: htl */
public final class htl extends AnimatorListenerAdapter {
    final /* synthetic */ SelectedAccountNavigationView a;

    public htl(SelectedAccountNavigationView selectedAccountNavigationView) {
        this.a = selectedAccountNavigationView;
    }

    public void onAnimationEnd(Animator animator) {
        SelectedAccountNavigationView selectedAccountNavigationView = this.a;
        if (selectedAccountNavigationView.c != null) {
            selectedAccountNavigationView.c.a(selectedAccountNavigationView.b);
        }
        selectedAccountNavigationView = this.a;
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
