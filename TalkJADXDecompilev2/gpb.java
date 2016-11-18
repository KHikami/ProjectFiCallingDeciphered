package defpackage;

import com.google.android.apps.hangouts.fragments.HiddenContactsFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class gpb {
    public final /* synthetic */ HiddenContactsFragment a;

    public void a(gpa gpa) {
        String b = gpa.b();
        String str = gpa.a().a;
        if (!this.a.c.containsKey(str)) {
            this.a.a();
            fme a = ((fmf) this.a.binder.a(fmf.class)).a();
            this.a.c.put(str, b);
            RealTimeChatService.c(a, this.a.a.a(), str);
            ((iih) this.a.binder.a(iih.class)).a(this.a.a.a()).b().c(3314);
        }
        this.a.b.notifyDataSetChanged();
    }

    public gpb(HiddenContactsFragment hiddenContactsFragment) {
        this.a = hiddenContactsFragment;
    }
}
