package defpackage;

import android.widget.Toast;
import com.google.android.apps.hangouts.fragments.BlockedContactsFragment;

/* renamed from: cyv */
public final class cyv extends fip {
    final /* synthetic */ BlockedContactsFragment a;

    public cyv(BlockedContactsFragment blockedContactsFragment) {
        this.a = blockedContactsFragment;
    }

    public void a(int i, bko bko, fiu fiu) {
        evz c = fiu.c();
        BlockedContactsFragment blockedContactsFragment;
        if (this.a.c == i && eyr.class.isInstance(c)) {
            blockedContactsFragment = this.a;
            blockedContactsFragment.c = -1;
            blockedContactsFragment.b();
        } else if (eyp.class.isInstance(c)) {
            blockedContactsFragment = this.a;
            blockedContactsFragment.e.remove(Integer.valueOf(i));
            if (blockedContactsFragment.e.size() == 0) {
                blockedContactsFragment.b();
            }
            this.a.b.notifyDataSetChanged();
            this.a.a(this.a.getView());
        }
    }

    public void a(int i, bko bko, fok fok, fdo fdo) {
        if (this.a.c == i && etq.class.isInstance(fok)) {
            int i2;
            BlockedContactsFragment blockedContactsFragment = this.a;
            blockedContactsFragment.c = -1;
            blockedContactsFragment.b();
            if (czj.i()) {
                i2 = bc.jj;
            } else {
                i2 = bc.jk;
            }
            Toast.makeText(this.a.context, i2, 0).show();
            this.a.a(this.a.getView());
        }
        if (((cyy) this.a.e.get(Integer.valueOf(i))) != null && etp.class.isInstance(fok)) {
            int i3;
            BlockedContactsFragment blockedContactsFragment2 = this.a;
            blockedContactsFragment2.e.remove(Integer.valueOf(i));
            if (blockedContactsFragment2.e.size() == 0) {
                blockedContactsFragment2.b();
            }
            this.a.b.notifyDataSetChanged();
            if (czj.i()) {
                i3 = bc.jH;
            } else {
                i3 = bc.jI;
            }
            Toast.makeText(this.a.context, this.a.context.getString(i3, new Object[]{r0.b}), 0).show();
        }
    }
}
