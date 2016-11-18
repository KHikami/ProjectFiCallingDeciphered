package defpackage;

import android.app.Activity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Set;

public final class bpj implements kbj, kcq {
    final /* synthetic */ bph a;
    private final Activity b;
    private final int c;
    private final String d;

    public bpj(bph bph, Activity activity, int i, String str) {
        this.a = bph;
        this.b = activity;
        this.c = i;
        this.d = str;
    }

    public void a() {
        if (this.b.isFinishing()) {
            Set set = (Set) this.a.a.get(Integer.valueOf(this.c));
            if (set != null && set.contains(this.d)) {
                RealTimeChatService.a(fde.e(this.c), this.d, -1);
                set.remove(this.d);
            }
        }
    }
}
