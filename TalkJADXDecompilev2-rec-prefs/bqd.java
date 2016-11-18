package p000;

import android.content.Context;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class bqd extends jgc {
    final int f4196a;
    private final int f4197b;
    private final juh f4198c;
    private final boy f4199d;
    private final bxt f4200g;
    private final int f4201h;
    private final String f4202i;
    private final boolean f4203j;
    private final String f4204k;

    public bqd(String str, int i, juh juh, boy boy, bxt bxt, int i2, String str2, boolean z, String str3, int i3) {
        super(str, (byte) 0);
        this.f4197b = i;
        this.f4198c = juh;
        this.f4199d = boy;
        this.f4200g = bxt;
        this.f4201h = i2;
        this.f4202i = str2;
        this.f4203j = z;
        this.f4204k = str3;
        this.f4196a = i3;
    }

    protected jgz mo648a(Context context) {
        boolean z;
        jgz jgz;
        dth a = ((dti) jyn.m25426a(context, dti.class)).mo1673a(17);
        a.mo1670a("conversation_creation");
        ConditionVariable conditionVariable = new ConditionVariable();
        bqe bqe = new bqe(this, context, conditionVariable);
        int i = this.f4197b;
        juh juh = this.f4198c;
        boy boy = this.f4199d;
        bxt bxt = this.f4200g;
        int i2 = this.f4201h;
        String str = this.f4202i;
        boolean z2 = this.f4203j;
        String str2 = this.f4204k;
        if (bxt == bxt.VIDEO_CALL || bxt == bxt.AUDIO_CALL) {
            z = true;
        } else {
            z = false;
        }
        fme a2 = ((fmf) jyn.m25426a(bqe.f4207a, fmf.class)).mo2035a();
        bqe.f4209c = a2.m15674a();
        bqe.m6418a(a2);
        RealTimeChatService.m9048a(a2, new fei(bqe.f4207a).m15158a(i).m15161a(juh).m15159a(boy).m15166c(bqe.f4211e.f4196a).m15162a(z).m15165b(z2).m15164b(str2).m15160a(str).m15163b(i2).m15157a());
        conditionVariable.block();
        if (bqe.f4208b != null) {
            jgz = new jgz(0, bqe.f4208b, "");
            glk.m17982e("Babel_ConvCreator", "Exception returned by response to RTCS request to create a conversation", new Object[0]);
        } else if (TextUtils.isEmpty(bqe.f4210d)) {
            jgz = new jgz(false);
            glk.m17982e("Babel_ConvCreator", "No conversationId returned from RTCS request to create a conversation", new Object[0]);
        } else {
            jgz = new jgz(true);
            jgz.m24192d().putSerializable("conversation_id", bqe.f4210d);
        }
        a.mo1668a(this.f4197b, "conversation_creation", 1014);
        return jgz;
    }

    public String mo649b(Context context) {
        return context.getString(gwb.jA);
    }
}
