package defpackage;

import android.widget.Toast;
import com.google.android.apps.hangouts.fragments.HiddenContactsFragment;

/* renamed from: dct */
public final class dct implements gia<dcw> {
    final /* synthetic */ HiddenContactsFragment a;

    public dct(HiddenContactsFragment hiddenContactsFragment) {
        this.a = hiddenContactsFragment;
    }

    public /* bridge */ /* synthetic */ void a(ayo ayo) {
        a();
    }

    public /* synthetic */ void a(ayo ayo, Exception exception) {
        b();
    }

    private void a() {
        this.a.a(this.a.getView());
    }

    private void b() {
        int i;
        if (czj.i()) {
            i = bc.jl;
        } else {
            i = bc.jm;
        }
        Toast.makeText(this.a.context, i, 0).show();
        this.a.a(this.a.getView());
    }
}
