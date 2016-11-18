package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;

final class cnu extends fjy<cnv> {
    private final cnv f5722c;

    public cnu(cnv cnv) {
        super(cnv);
        this.f5722c = cnv;
    }

    protected euj mo1013a(Context context, int i, int i2) {
        return new eti(context, i, (fgm) this.a);
    }

    public void mo1014a(Context context, int i, fdo fdo) {
        bko e = fde.m15018e(i);
        RealTimeChatService.m9022a(e, this.f5722c.s_().m8181d(), this.f5722c.s_().m8180c(), fdo != null ? fdo.m15084c() : 0);
        ((ect) jyn.m25426a(context, ect.class)).mo1838d(e.m5638g(), true);
        if (!(fdo == null || fdo.m15084c() == 0)) {
            gwb.m1823a(e, 1523);
            ba.m4548a(e.m5638g(), glj.m17963b(), 5, ba.m4618c().m12786a(fdo.m15084c()).m12794b(this.f5722c.s_().m8180c()).m12789a(this.f5722c.s_().m8181d()));
        }
        if (fdo.m15084c() != 121) {
            coy.m10594a(context);
        }
    }

    public String K_() {
        return "photo_queue";
    }

    public long mo1017b() {
        return Long.MAX_VALUE;
    }

    public boolean mo1018c() {
        return true;
    }

    public boolean mo1019d() {
        return true;
    }

    public boolean mo1016a(String str) {
        return str.startsWith(this.f5722c.s_().m8180c());
    }

    public boolean mo1015a(ead ead) {
        return false;
    }

    public void mo1007a(Context context, eaf eaf) {
        super.mo1007a(context, eaf);
        String valueOf = String.valueOf(this.f5722c.m8025d());
        new StringBuilder(String.valueOf(valueOf).length() + 53).append("retrying get photo id ").append(valueOf).append(" with retry attempt ").append(eaf.m13270d());
        fgn fgn = (fgn) ((eti) this.b).mo1043d();
        biw biw = (biw) jyn.m25426a(context, biw.class);
        blo blo = new blo(context, eaf.m13268b());
        if (blo.m6090n(this.f5722c.s_().m8181d(), this.f5722c.s_().m8180c()) == fwx.PENDING_DELETE) {
            blo.m5936a("conversation_id=? AND message_id=?", new String[]{this.f5722c.s_().m8181d(), this.f5722c.s_().m8180c()});
        } else if (((long) eaf.m13270d()) > biw.mo561a("babel_poll_video_max_retries", 6)) {
            throw new fdo(109, "uploaded video not ready after max retries " + eaf.m13270d());
        } else if (fgn == null || !fgn.m15254k()) {
            throw new fdo(140, biw.mo561a("babel_poll_video_min_backoff_millis", 30000), "uploaded video not ready for share yet");
        } else {
            int b = eaf.m13268b();
            fde.m15019e(fde.m15018e(b)).m15078a(this.f5722c.s_(), this.f5722c.L_());
            ba.m4548a(b, glj.m17963b(), 10, ba.m4618c().m12786a(555).m12794b(this.f5722c.s_().m8180c()).m12789a(this.f5722c.s_().m8181d()));
            glk.m17979c("Babel_ConvService", "Video is ready for share", new Object[0]);
        }
    }

    public boolean mo1008a(Context context, eaf eaf, fdo fdo) {
        if (fdo.m15084c() == 140) {
            return true;
        }
        return super.mo1008a(context, eaf, fdo);
    }

    public List<bhc> mo1010e() {
        List<bhc> arrayList = new ArrayList();
        arrayList.add(new bhc(this.f5722c.s_().m8180c()));
        return arrayList;
    }
}
