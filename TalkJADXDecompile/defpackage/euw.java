package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: euw */
public class euw extends euo {
    private static final long serialVersionUID = 3;
    public final boolean c;
    public final boolean d;
    public final boolean k;
    public final byte[] l;
    public final long m;
    public final String n;
    public final int o;
    public final long p;
    public final fpl q;
    public String r;
    public final eup s;

    public euw(String str, boolean z, boolean z2, boolean z3, byte[] bArr, long j, String str2, long j2, fpl fpl) {
        int a;
        super(str);
        this.c = z;
        this.d = z2;
        this.k = z3;
        this.l = bArr;
        this.m = j;
        this.n = str2;
        if (giw.e(gwb.H())) {
            a = gwb.a(gwb.H(), "babel_smaxevperconv_watch", 20);
        } else {
            a = gwb.a(gwb.H(), "babel_smaxevperconv", 20);
        }
        this.o = a;
        this.q = fpl;
        this.s = null;
        this.p = j2;
        this.r = null;
    }

    public euw(eup eup) {
        super(null);
        this.s = eup;
        this.c = true;
        this.d = true;
        this.k = false;
        this.o = 1;
        this.l = null;
        this.m = 0;
        this.n = null;
        this.q = null;
        this.r = null;
        this.p = 0;
    }

    public euw(eup eup, String str) {
        this(eup);
        this.r = str;
    }

    public nzf a(String str, int i, int i2) {
        if (glk.a("BabelClient", 3)) {
            String str2 = this.e;
            boolean z = this.c;
            boolean z2 = this.d;
            String valueOf = String.valueOf(Arrays.toString(this.l));
            long j = this.m;
            glk.b("BabelClient", new StringBuilder((String.valueOf(str2).length() + 213) + String.valueOf(valueOf).length()).append("GetConversationRequest build protobuf:  conversationId=").append(str2).append(" includeConversationMetadata=").append(z).append(" includeEvents=").append(z2).append(" continuationToken=").append(valueOf).append(" continuationEventTimestamp=").append(j).append(" maxEventsPerConversation=").append(this.o).toString(), new Object[0]);
        }
        nzf lrb = new lrb();
        if (this.e != null) {
            lrb.a = new low();
            lrb.a.a = euk.a(this.e);
        } else if (this.s != null) {
            low low = new low();
            low.b = new lsh[this.s.f.size()];
            int i3 = 0;
            for (edk a : this.s.f) {
                int i4 = i3 + 1;
                low.b[i3] = gwb.a(gwb.H(), a, this.s.d);
                i3 = i4;
            }
            low.c = Integer.valueOf(this.s.c);
            lrb.a = low;
        } else {
            throw new IllegalStateException("must specify either conversationId or participantsQuery");
        }
        lrb.b = Boolean.valueOf(this.c);
        lrb.c = Boolean.valueOf(this.d);
        if (this.k) {
            lrb.g = Integer.valueOf(1);
        }
        lrb.requestHeader = euk.a(str, i, i2, this.i);
        if (!(this.l == null && this.m == 0)) {
            lqk lqk = new lqk();
            if (this.l != null) {
                lqk.b = Arrays.copyOf(this.l, this.l.length);
            }
            if (this.m != 0) {
                lqk.a = Long.valueOf(this.m);
            }
            lrb.d = lqk;
        }
        lrb.f = Integer.valueOf(this.o);
        return lrb;
    }

    public String g() {
        return "conversations/getconversation";
    }

    public void a(Context context, bko bko, fdo fdo) {
        super.a(context, bko, fdo);
        if (this.n != null) {
            fjj.c(bko.g()).d(this.n);
        }
        if (this.s != null && this.r == null) {
            Collection hashSet = new HashSet();
            hashSet.add(this.s);
            fde.e(bko).a(hashSet, -1);
        }
        if (this.r != null) {
            RealTimeChatService.e(bko, this.r);
        }
        if (fdo.c() == 111 && this.e != null) {
            RealTimeChatService.n(bko, this.e);
        }
    }

    public boolean a(ead ead) {
        iil.a(getClass(), ead.getClass());
        euw euw = (euw) ead;
        return TextUtils.equals(this.e, euw.e) && this.c == euw.c && this.d == euw.d && this.m == euw.m && this.s == null && euw.s == null && TextUtils.equals(this.n, euw.n) && this.q == null && euw.q == null;
    }

    public int i() {
        return 4;
    }

    public boolean a(Context context, eaf eaf, fdo fdo) {
        boolean z;
        if (this.s != null) {
            z = true;
        } else {
            z = false;
        }
        if (z || !super.a(context, eaf, fdo)) {
            return false;
        }
        return true;
    }

    public long b() {
        Object obj;
        if (this.c && this.d && this.s == null) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            return super.b();
        }
        return TimeUnit.SECONDS.toMillis(60);
    }
}
