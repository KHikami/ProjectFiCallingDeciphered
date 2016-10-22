package defpackage;

import android.widget.Toast;
import com.google.android.apps.hangouts.fragments.BlockedContactsFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

/* renamed from: gni */
public class gni {
    public final /* synthetic */ BlockedContactsFragment a;

    public void a(gnh gnh) {
        this.a.a();
        String b = gnh.b();
        if (b == null) {
            Toast.makeText(this.a.context, bc.jF, 0).show();
            return;
        }
        edo a = gnh.a();
        bko k = fde.k();
        if (!((fzw) this.a.binder.a(fzw.class)).a(this.a.a.g()) || k == null) {
            bko bko = this.a.a;
        }
        fme a2 = ((fmf) this.a.binder.a(fmf.class)).a();
        this.a.e.put(Integer.valueOf(a2.a()), new cyy(a, b));
        RealTimeChatService.a(a2, this.a.d.a(), a.a, a.b, b, false, false);
        this.a.b.notifyDataSetChanged();
    }

    public gni(BlockedContactsFragment blockedContactsFragment) {
        this.a = blockedContactsFragment;
    }
}
