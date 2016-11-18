package p000;

import android.widget.Toast;
import com.google.android.apps.hangouts.fragments.BlockedContactsFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class gni {
    public final /* synthetic */ BlockedContactsFragment f15706a;

    public void m18162a(gnh gnh) {
        this.f15706a.mo495a();
        String b = gnh.m18161b();
        if (b == null) {
            Toast.makeText(this.f15706a.context, bc.jF, 0).show();
            return;
        }
        edo a = gnh.m18156a();
        bko k = fde.m15031k();
        if (!((fzw) this.f15706a.binder.m25443a(fzw.class)).mo2146a(this.f15706a.f6235a.m5638g()) || k == null) {
            bko bko = this.f15706a.f6235a;
        }
        fme a2 = ((fmf) this.f15706a.binder.m25443a(fmf.class)).mo2035a();
        this.f15706a.f6239e.put(Integer.valueOf(a2.m15674a()), new cyy(a, b));
        RealTimeChatService.m9047a(a2, this.f15706a.f6238d.mo2317a(), a.f11244a, a.f11245b, b, false, false);
        this.f15706a.f6236b.notifyDataSetChanged();
    }

    public gni(BlockedContactsFragment blockedContactsFragment) {
        this.f15706a = blockedContactsFragment;
    }
}
