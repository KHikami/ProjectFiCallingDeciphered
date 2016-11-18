package p000;

import android.app.Activity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Set;

public final class bpj implements kbj, kcq {
    final /* synthetic */ bph f4158a;
    private final Activity f4159b;
    private final int f4160c;
    private final String f4161d;

    public bpj(bph bph, Activity activity, int i, String str) {
        this.f4158a = bph;
        this.f4159b = activity;
        this.f4160c = i;
        this.f4161d = str;
    }

    public void mo641a() {
        if (this.f4159b.isFinishing()) {
            Set set = (Set) this.f4158a.f4156a.get(Integer.valueOf(this.f4160c));
            if (set != null && set.contains(this.f4161d)) {
                RealTimeChatService.m9019a(fde.m15018e(this.f4160c), this.f4161d, -1);
                set.remove(this.f4161d);
            }
        }
    }
}
