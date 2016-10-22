package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

/* compiled from: PG */
/* renamed from: ayn */
public abstract class ayn extends Fragment {
    public bdj e;

    public abstract bdq g();

    public abstract bdj h();

    public ayn() {
        this.e = h();
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.e.b(g());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.e.b(bundle);
            if (bundle.getBoolean("key_fragment_hidden")) {
                getFragmentManager().beginTransaction().hide(this).commit();
            }
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        bdj bdj = this.e;
        bdj.a(g());
        bdj.i = null;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.e.a_(bundle);
        bundle.putBoolean("key_fragment_hidden", isHidden());
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((bbw) activity).a(this);
    }
}
