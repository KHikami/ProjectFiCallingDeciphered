package p000;

import android.widget.Toast;
import com.google.android.apps.hangouts.fragments.BlockedContactsFragment;

public final class cyv extends fip {
    final /* synthetic */ BlockedContactsFragment f9360a;

    public cyv(BlockedContactsFragment blockedContactsFragment) {
        this.f9360a = blockedContactsFragment;
    }

    public void mo610a(int i, bko bko, fiu fiu) {
        evz c = fiu.m15392c();
        BlockedContactsFragment blockedContactsFragment;
        if (this.f9360a.f6237c == i && eyr.class.isInstance(c)) {
            blockedContactsFragment = this.f9360a;
            blockedContactsFragment.f6237c = -1;
            blockedContactsFragment.m8452b();
        } else if (eyp.class.isInstance(c)) {
            blockedContactsFragment = this.f9360a;
            blockedContactsFragment.f6239e.remove(Integer.valueOf(i));
            if (blockedContactsFragment.f6239e.size() == 0) {
                blockedContactsFragment.m8452b();
            }
            this.f9360a.f6236b.notifyDataSetChanged();
            this.f9360a.m8450a(this.f9360a.getView());
        }
    }

    public void mo640a(int i, bko bko, fok fok, fdo fdo) {
        if (this.f9360a.f6237c == i && etq.class.isInstance(fok)) {
            int i2;
            BlockedContactsFragment blockedContactsFragment = this.f9360a;
            blockedContactsFragment.f6237c = -1;
            blockedContactsFragment.m8452b();
            if (czj.m11296i()) {
                i2 = bc.jj;
            } else {
                i2 = bc.jk;
            }
            Toast.makeText(this.f9360a.context, i2, 0).show();
            this.f9360a.m8450a(this.f9360a.getView());
        }
        if (((cyy) this.f9360a.f6239e.get(Integer.valueOf(i))) != null && etp.class.isInstance(fok)) {
            int i3;
            BlockedContactsFragment blockedContactsFragment2 = this.f9360a;
            blockedContactsFragment2.f6239e.remove(Integer.valueOf(i));
            if (blockedContactsFragment2.f6239e.size() == 0) {
                blockedContactsFragment2.m8452b();
            }
            this.f9360a.f6236b.notifyDataSetChanged();
            if (czj.m11296i()) {
                i3 = bc.jH;
            } else {
                i3 = bc.jI;
            }
            Toast.makeText(this.f9360a.context, this.f9360a.context.getString(i3, new Object[]{r0.f9364b}), 0).show();
        }
    }
}
