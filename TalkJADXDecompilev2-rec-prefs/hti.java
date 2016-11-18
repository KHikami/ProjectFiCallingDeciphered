package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;

public final class hti extends AnimatorListenerAdapter {
    final /* synthetic */ SelectedAccountNavigationView f17253a;

    public hti(SelectedAccountNavigationView selectedAccountNavigationView) {
        this.f17253a = selectedAccountNavigationView;
    }

    public void onAnimationEnd(Animator animator) {
        this.f17253a.f7775d.f10847B.setVisibility(8);
        this.f17253a.f7775d.f10869y.setVisibility(8);
        if (this.f17253a.f7775d.f10848C != null) {
            this.f17253a.f7775d.f10848C.setVisibility(8);
        }
        SelectedAccountNavigationView selectedAccountNavigationView = this.f17253a;
        if (selectedAccountNavigationView.f7783l != null) {
            selectedAccountNavigationView.f7773b = selectedAccountNavigationView.f7783l;
            selectedAccountNavigationView.f7783l = null;
        }
        if (!(selectedAccountNavigationView.f7784m == null && selectedAccountNavigationView.f7785n == null)) {
            selectedAccountNavigationView.f7772a.clear();
            if (selectedAccountNavigationView.f7784m != null) {
                selectedAccountNavigationView.f7772a.add(selectedAccountNavigationView.f7784m);
            }
            if (selectedAccountNavigationView.f7785n != null) {
                selectedAccountNavigationView.f7772a.add(selectedAccountNavigationView.f7785n);
            }
            selectedAccountNavigationView.f7784m = null;
            selectedAccountNavigationView.f7785n = null;
        }
        this.f17253a.m9972b();
        this.f17253a.f7782k = null;
    }
}
