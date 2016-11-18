package p000;

import android.content.Intent;
import com.google.android.apps.hangouts.phone.BabelHomeActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class ejn extends fip {
    final /* synthetic */ fme f11648a;
    final /* synthetic */ String f11649b;
    final /* synthetic */ bkm f11650c;
    final /* synthetic */ int f11651d;
    final /* synthetic */ int f11652e;
    final /* synthetic */ BabelHomeActivity f11653f;

    public ejn(BabelHomeActivity babelHomeActivity, fme fme, String str, bkm bkm, int i, int i2) {
        this.f11653f = babelHomeActivity;
        this.f11648a = fme;
        this.f11649b = str;
        this.f11650c = bkm;
        this.f11651d = i;
        this.f11652e = i2;
    }

    public void mo650a(int i, bko bko, fek fek, fiu fiu) {
        if (i == this.f11648a.m15674a()) {
            RealTimeChatService.m9077b((fip) this);
            if (fek == null) {
                String str = this.f11649b;
                glk.m17982e("Babel_HomeActivity", new StringBuilder(String.valueOf(str).length() + 64).append("creating conversation with ").append(str).append(" resulting in null ConversationResult").toString(), new Object[0]);
                return;
            }
            bcc bcc = new bcc(fek.f12913a, 0);
            bcc.f2978d = true;
            bcc.f2980f = this.f11650c;
            bcc.f2985k = this.f11651d;
            Intent intent = new Intent();
            intent.putExtra("conversation_id", bcc.f2975a);
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", this.f11650c.f3628a);
            this.f11653f.m8843a(bcc, intent, this.f11652e);
        }
    }
}
