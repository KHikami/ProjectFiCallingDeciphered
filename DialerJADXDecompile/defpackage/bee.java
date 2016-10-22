package defpackage;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

/* compiled from: PG */
/* renamed from: bee */
public class bee {
    public boolean a;

    public void a(Fragment fragment, boolean z) {
        if (this.a != z) {
            this.a = z;
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            if (childFragmentManager != null) {
                Fragment findFragmentByTag = childFragmentManager.findFragmentByTag("tag_emergency_location_fragment");
                if (!z && findFragmentByTag == null) {
                    return;
                }
                if (!z || findFragmentByTag == null || !findFragmentByTag.isVisible()) {
                    FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
                    if (!z) {
                        beginTransaction.hide(findFragmentByTag);
                    } else if (findFragmentByTag == null) {
                        beginTransaction.add(buf.lh, new bir(), "tag_emergency_location_fragment");
                    } else {
                        beginTransaction.show(findFragmentByTag);
                    }
                    beginTransaction.commitAllowingStateLoss();
                }
            }
        }
    }

    public bee() {
        this.a = false;
    }
}
