package p000;

import com.google.android.apps.hangouts.fragments.HiddenContactsFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class gpb {
    public final /* synthetic */ HiddenContactsFragment f15851a;

    public void m18257a(gpa gpa) {
        String b = gpa.m18256b();
        String str = gpa.m18251a().f11244a;
        if (!this.f15851a.f6266c.containsKey(str)) {
            this.f15851a.mo495a();
            fme a = ((fmf) this.f15851a.binder.m25443a(fmf.class)).mo2035a();
            this.f15851a.f6266c.put(str, b);
            RealTimeChatService.m9093c(a, this.f15851a.f6264a.mo2317a(), str);
            ((iih) this.f15851a.binder.m25443a(iih.class)).mo1979a(this.f15851a.f6264a.mo2317a()).mo1693b().mo1714c(3314);
        }
        this.f15851a.f6265b.notifyDataSetChanged();
    }

    public gpb(HiddenContactsFragment hiddenContactsFragment) {
        this.f15851a = hiddenContactsFragment;
    }
}
