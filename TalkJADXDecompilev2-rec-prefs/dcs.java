package p000;

import android.widget.Toast;
import com.google.android.apps.hangouts.fragments.HiddenContactsFragment;

public final class dcs implements gia<dcx> {
    final /* synthetic */ HiddenContactsFragment f9519a;

    public dcs(HiddenContactsFragment hiddenContactsFragment) {
        this.f9519a = hiddenContactsFragment;
    }

    public /* synthetic */ void mo775a(ayo ayo, Exception exception) {
        m11452b((dcx) ayo);
    }

    private void m11451a(dcx dcx) {
        this.f9519a.f6266c.remove(dcx.f9525a.f12392c);
        this.f9519a.f6265b.notifyDataSetChanged();
        this.f9519a.m8515a(this.f9519a.getView());
    }

    private void m11452b(dcx dcx) {
        String str = dcx.f9525a.f12392c;
        if (((String) this.f9519a.f6266c.get(str)) != null) {
            int i;
            this.f9519a.f6266c.remove(str);
            this.f9519a.f6265b.notifyDataSetChanged();
            if (czj.m11296i()) {
                i = bc.jK;
            } else {
                i = bc.jL;
            }
            Toast.makeText(this.f9519a.context, this.f9519a.context.getString(i, new Object[]{r0}), 0).show();
        }
    }
}
