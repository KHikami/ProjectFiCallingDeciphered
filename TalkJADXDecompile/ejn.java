import android.content.Intent;
import com.google.android.apps.hangouts.phone.BabelHomeActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class ejn extends fip {
    final /* synthetic */ fme a;
    final /* synthetic */ String b;
    final /* synthetic */ bkm c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ BabelHomeActivity f;

    public ejn(BabelHomeActivity babelHomeActivity, fme fme, String str, bkm bkm, int i, int i2) {
        this.f = babelHomeActivity;
        this.a = fme;
        this.b = str;
        this.c = bkm;
        this.d = i;
        this.e = i2;
    }

    public void a(int i, bko bko, fek fek, fiu fiu) {
        if (i == this.a.a()) {
            RealTimeChatService.b((fip) this);
            if (fek == null) {
                String str = this.b;
                glk.e("Babel_HomeActivity", new StringBuilder(String.valueOf(str).length() + 64).append("creating conversation with ").append(str).append(" resulting in null ConversationResult").toString(), new Object[0]);
                return;
            }
            bcc bcc = new bcc(fek.a, 0);
            bcc.d = true;
            bcc.f = this.c;
            bcc.k = this.d;
            Intent intent = new Intent();
            intent.putExtra("conversation_id", bcc.a);
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", this.c.a);
            this.f.a(bcc, intent, this.e);
        }
    }
}
