package p000;

import android.widget.Toast;
import com.google.android.apps.hangouts.fragments.HiddenContactsFragment;

public final class dct implements gia<dcw> {
    final /* synthetic */ HiddenContactsFragment f9520a;

    public dct(HiddenContactsFragment hiddenContactsFragment) {
        this.f9520a = hiddenContactsFragment;
    }

    public /* bridge */ /* synthetic */ void mo774a(ayo ayo) {
        m11455a();
    }

    public /* synthetic */ void mo775a(ayo ayo, Exception exception) {
        m11456b();
    }

    private void m11455a() {
        this.f9520a.m8515a(this.f9520a.getView());
    }

    private void m11456b() {
        int i;
        if (czj.m11296i()) {
            i = bc.jl;
        } else {
            i = bc.jm;
        }
        Toast.makeText(this.f9520a.context, i, 0).show();
        this.f9520a.m8515a(this.f9520a.getView());
    }
}
