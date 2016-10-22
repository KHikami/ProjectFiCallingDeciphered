import android.content.Context;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class bqd extends jgc {
    final int a;
    private final int b;
    private final juh c;
    private final boy d;
    private final bxt g;
    private final int h;
    private final String i;
    private final boolean j;
    private final String k;

    public bqd(String str, int i, juh juh, boy boy, bxt bxt, int i2, String str2, boolean z, String str3, int i3) {
        super(str, (byte) 0);
        this.b = i;
        this.c = juh;
        this.d = boy;
        this.g = bxt;
        this.h = i2;
        this.i = str2;
        this.j = z;
        this.k = str3;
        this.a = i3;
    }

    protected jgz a(Context context) {
        boolean z;
        jgz jgz;
        dth a = ((dti) jyn.a(context, dti.class)).a(17);
        a.a("conversation_creation");
        ConditionVariable conditionVariable = new ConditionVariable();
        bqe bqe = new bqe(this, context, conditionVariable);
        int i = this.b;
        juh juh = this.c;
        boy boy = this.d;
        bxt bxt = this.g;
        int i2 = this.h;
        String str = this.i;
        boolean z2 = this.j;
        String str2 = this.k;
        if (bxt == bxt.VIDEO_CALL || bxt == bxt.AUDIO_CALL) {
            z = true;
        } else {
            z = false;
        }
        fme a2 = ((fmf) jyn.a(bqe.a, fmf.class)).a();
        bqe.c = a2.a();
        bqe.a(a2);
        RealTimeChatService.a(a2, new fei(bqe.a).a(i).a(juh).a(boy).c(bqe.e.a).a(z).b(z2).b(str2).a(str).b(i2).a());
        conditionVariable.block();
        if (bqe.b != null) {
            jgz = new jgz(0, bqe.b, "");
            glk.e("Babel_ConvCreator", "Exception returned by response to RTCS request to create a conversation", new Object[0]);
        } else if (TextUtils.isEmpty(bqe.d)) {
            jgz = new jgz(false);
            glk.e("Babel_ConvCreator", "No conversationId returned from RTCS request to create a conversation", new Object[0]);
        } else {
            jgz = new jgz(true);
            jgz.d().putSerializable("conversation_id", bqe.d);
        }
        a.a(this.b, "conversation_creation", 1014);
        return jgz;
    }

    public String b(Context context) {
        return context.getString(gwb.jA);
    }
}
