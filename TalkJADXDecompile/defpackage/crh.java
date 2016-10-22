package defpackage;

import com.google.android.apps.hangouts.elane.CallActivity;

/* renamed from: crh */
public final class crh implements cuj {
    final /* synthetic */ CallActivity a;

    public crh(CallActivity callActivity) {
        this.a = callActivity;
    }

    public ctn a() {
        return (ctn) ba.a(this.a.n, (Object) "HangoutCallProvider.get called before hangoutCall was initialized");
    }
}
