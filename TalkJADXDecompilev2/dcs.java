package defpackage;

import android.widget.Toast;
import com.google.android.apps.hangouts.fragments.HiddenContactsFragment;

public final class dcs implements gia<dcx> {
    final /* synthetic */ HiddenContactsFragment a;

    public dcs(HiddenContactsFragment hiddenContactsFragment) {
        this.a = hiddenContactsFragment;
    }

    public /* synthetic */ void a(ayo ayo, Exception exception) {
        b((dcx) ayo);
    }

    private void a(dcx dcx) {
        this.a.c.remove(dcx.a.c);
        this.a.b.notifyDataSetChanged();
        this.a.a(this.a.getView());
    }

    private void b(dcx dcx) {
        String str = dcx.a.c;
        if (((String) this.a.c.get(str)) != null) {
            int i;
            this.a.c.remove(str);
            this.a.b.notifyDataSetChanged();
            if (czj.i()) {
                i = bc.jK;
            } else {
                i = bc.jL;
            }
            Toast.makeText(this.a.context, this.a.context.getString(i, new Object[]{r0}), 0).show();
        }
    }
}
