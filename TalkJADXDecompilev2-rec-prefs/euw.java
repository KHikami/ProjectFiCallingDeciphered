package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

public class euw extends euo {
    private static final long serialVersionUID = 3;
    public final boolean f12319c;
    public final boolean f12320d;
    public final boolean f12321k;
    public final byte[] f12322l;
    public final long f12323m;
    public final String f12324n;
    public final int f12325o;
    public final long f12326p;
    public final fpl f12327q;
    public String f12328r;
    public final eup f12329s;

    public euw(String str, boolean z, boolean z2, boolean z3, byte[] bArr, long j, String str2, long j2, fpl fpl) {
        int a;
        super(str);
        this.f12319c = z;
        this.f12320d = z2;
        this.f12321k = z3;
        this.f12322l = bArr;
        this.f12323m = j;
        this.f12324n = str2;
        if (giw.m17760e(gwb.m1400H())) {
            a = gwb.m1492a(gwb.m1400H(), "babel_smaxevperconv_watch", 20);
        } else {
            a = gwb.m1492a(gwb.m1400H(), "babel_smaxevperconv", 20);
        }
        this.f12325o = a;
        this.f12327q = fpl;
        this.f12329s = null;
        this.f12326p = j2;
        this.f12328r = null;
    }

    public euw(eup eup) {
        super(null);
        this.f12329s = eup;
        this.f12319c = true;
        this.f12320d = true;
        this.f12321k = false;
        this.f12325o = 1;
        this.f12322l = null;
        this.f12323m = 0;
        this.f12324n = null;
        this.f12327q = null;
        this.f12328r = null;
        this.f12326p = 0;
    }

    public euw(eup eup, String str) {
        this(eup);
        this.f12328r = str;
    }

    public nzf mo1944a(String str, int i, int i2) {
        if (glk.m17973a("BabelClient", 3)) {
            String str2 = this.e;
            boolean z = this.f12319c;
            boolean z2 = this.f12320d;
            String valueOf = String.valueOf(Arrays.toString(this.f12322l));
            long j = this.f12323m;
            glk.m17976b("BabelClient", new StringBuilder((String.valueOf(str2).length() + 213) + String.valueOf(valueOf).length()).append("GetConversationRequest build protobuf:  conversationId=").append(str2).append(" includeConversationMetadata=").append(z).append(" includeEvents=").append(z2).append(" continuationToken=").append(valueOf).append(" continuationEventTimestamp=").append(j).append(" maxEventsPerConversation=").append(this.f12325o).toString(), new Object[0]);
        }
        nzf lrb = new lrb();
        if (this.e != null) {
            lrb.f26192a = new low();
            lrb.f26192a.f25946a = euk.m14555a(this.e);
        } else if (this.f12329s != null) {
            low low = new low();
            low.f25947b = new lsh[this.f12329s.f12308f.size()];
            int i3 = 0;
            for (edk a : this.f12329s.f12308f) {
                int i4 = i3 + 1;
                low.f25947b[i3] = gwb.m1714a(gwb.m1400H(), a, this.f12329s.f12306d);
                i3 = i4;
            }
            low.f25948c = Integer.valueOf(this.f12329s.f12305c);
            lrb.f26192a = low;
        } else {
            throw new IllegalStateException("must specify either conversationId or participantsQuery");
        }
        lrb.f26193b = Boolean.valueOf(this.f12319c);
        lrb.f26194c = Boolean.valueOf(this.f12320d);
        if (this.f12321k) {
            lrb.f26198g = Integer.valueOf(1);
        }
        lrb.requestHeader = euk.m14556a(str, i, i2, this.i);
        if (!(this.f12322l == null && this.f12323m == 0)) {
            lqk lqk = new lqk();
            if (this.f12322l != null) {
                lqk.f26141b = Arrays.copyOf(this.f12322l, this.f12322l.length);
            }
            if (this.f12323m != 0) {
                lqk.f26140a = Long.valueOf(this.f12323m);
            }
            lrb.f26195d = lqk;
        }
        lrb.f26197f = Integer.valueOf(this.f12325o);
        return lrb;
    }

    public String mo1947g() {
        return "conversations/getconversation";
    }

    public void mo1945a(Context context, bko bko, fdo fdo) {
        super.mo1945a(context, bko, fdo);
        if (this.f12324n != null) {
            fjj.m15425c(bko.m5638g()).m15435d(this.f12324n);
        }
        if (this.f12329s != null && this.f12328r == null) {
            Collection hashSet = new HashSet();
            hashSet.add(this.f12329s);
            fde.m15019e(bko).m15079a(hashSet, -1);
        }
        if (this.f12328r != null) {
            RealTimeChatService.m9107e(bko, this.f12328r);
        }
        if (fdo.m15084c() == 111 && this.e != null) {
            RealTimeChatService.m9125n(bko, this.e);
        }
    }

    public boolean mo1015a(ead ead) {
        iil.m21869a(getClass(), ead.getClass());
        euw euw = (euw) ead;
        return TextUtils.equals(this.e, euw.e) && this.f12319c == euw.f12319c && this.f12320d == euw.f12320d && this.f12323m == euw.f12323m && this.f12329s == null && euw.f12329s == null && TextUtils.equals(this.f12324n, euw.f12324n) && this.f12327q == null && euw.f12327q == null;
    }

    public int mo1957i() {
        return 4;
    }

    public boolean mo1008a(Context context, eaf eaf, fdo fdo) {
        boolean z;
        if (this.f12329s != null) {
            z = true;
        } else {
            z = false;
        }
        if (z || !super.mo1008a(context, eaf, fdo)) {
            return false;
        }
        return true;
    }

    public long mo1017b() {
        Object obj;
        if (this.f12319c && this.f12320d && this.f12329s == null) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            return super.mo1017b();
        }
        return TimeUnit.SECONDS.toMillis(60);
    }
}
