import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Arrays;

public class evh extends euo {
    private static final long serialVersionUID = 1;
    public final edo c;
    public final int d;
    public final int[] k;

    public evh(String str, int i) {
        super(str);
        this.d = 1;
        this.c = null;
        this.k = new int[0];
    }

    public evh(String str, int i, int[] iArr) {
        super(str);
        this.d = i;
        this.c = null;
        this.k = iArr;
    }

    public nzf a(String str, int i, int i2) {
        if (glk.a("BabelClient", 3)) {
            glk.b("BabelClient", "replyToInviteRequest build protobuf", new Object[0]);
        }
        nzf lun = new lun();
        lun.requestHeader = euk.a(str, i, i2, this.i);
        lun.c = Integer.valueOf(this.d);
        lun.a = euk.a(this.e);
        lun.d = Arrays.copyOf(this.k, this.k.length);
        return lun;
    }

    public String g() {
        return "conversations/replytoinvite";
    }

    public String K_() {
        return "event_queue";
    }

    public void a(Context context, bko bko, fdo fdo) {
        super.a(context, bko, fdo);
        if (!this.f) {
            RealTimeChatService.b(bko.g(), this.e);
        }
    }

    public int i() {
        return 4;
    }
}
