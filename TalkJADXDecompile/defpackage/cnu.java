package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cnu */
final class cnu extends fjy<cnv> {
    private final cnv c;

    public cnu(cnv cnv) {
        super(cnv);
        this.c = cnv;
    }

    protected euj a(Context context, int i, int i2) {
        return new eti(context, i, (fgm) this.a);
    }

    public void a(Context context, int i, fdo fdo) {
        bko e = fde.e(i);
        RealTimeChatService.a(e, this.c.s_().d(), this.c.s_().c(), fdo != null ? fdo.c() : 0);
        ((ect) jyn.a(context, ect.class)).d(e.g(), true);
        if (!(fdo == null || fdo.c() == 0)) {
            gwb.a(e, 1523);
            ba.a(e.g(), glj.b(), 5, ba.c().a(fdo.c()).b(this.c.s_().c()).a(this.c.s_().d()));
        }
        if (fdo.c() != 121) {
            coy.a(context);
        }
    }

    public String K_() {
        return "photo_queue";
    }

    public long b() {
        return Long.MAX_VALUE;
    }

    public boolean c() {
        return true;
    }

    public boolean d() {
        return true;
    }

    public boolean a(String str) {
        return str.startsWith(this.c.s_().c());
    }

    public boolean a(ead ead) {
        return false;
    }

    public void a(Context context, eaf eaf) {
        super.a(context, eaf);
        String valueOf = String.valueOf(this.c.d());
        new StringBuilder(String.valueOf(valueOf).length() + 53).append("retrying get photo id ").append(valueOf).append(" with retry attempt ").append(eaf.d());
        fgn fgn = (fgn) ((eti) this.b).d();
        biw biw = (biw) jyn.a(context, biw.class);
        blo blo = new blo(context, eaf.b());
        if (blo.n(this.c.s_().d(), this.c.s_().c()) == fwx.PENDING_DELETE) {
            blo.a("conversation_id=? AND message_id=?", new String[]{this.c.s_().d(), this.c.s_().c()});
        } else if (((long) eaf.d()) > biw.a("babel_poll_video_max_retries", 6)) {
            throw new fdo(109, "uploaded video not ready after max retries " + eaf.d());
        } else if (fgn == null || !fgn.k()) {
            throw new fdo(140, biw.a("babel_poll_video_min_backoff_millis", 30000), "uploaded video not ready for share yet");
        } else {
            int b = eaf.b();
            fde.e(fde.e(b)).a(this.c.s_(), this.c.L_());
            ba.a(b, glj.b(), 10, ba.c().a(555).b(this.c.s_().c()).a(this.c.s_().d()));
            glk.c("Babel_ConvService", "Video is ready for share", new Object[0]);
        }
    }

    public boolean a(Context context, eaf eaf, fdo fdo) {
        if (fdo.c() == 140) {
            return true;
        }
        return super.a(context, eaf, fdo);
    }

    public List<bhc> e() {
        List<bhc> arrayList = new ArrayList();
        arrayList.add(new bhc(this.c.s_().c()));
        return arrayList;
    }
}
