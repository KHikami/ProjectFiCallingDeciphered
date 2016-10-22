package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Collection;

/* renamed from: bqf */
public final class bqf implements bpt, kcd, kcg, kcn, kcq, kcr {
    final dr a;
    final Context b;
    final int c;
    final jyn d;
    final bck e;
    final bxt f;
    jca g;
    bjg h;
    final bpq i;
    final bpz j;
    private boolean k;
    private jgg l;
    private boy m;
    private boolean n;
    private String o;
    private String p;
    private int q;
    private final bpw r;
    private final bpy s;
    private bpx t;
    private final bpr u;
    private final jgf v;

    public bqf(Context context, kbu kbu, int i, dr drVar, bck bck, bxt bxt) {
        this.t = new bqg(this);
        this.u = new bqh(this);
        this.j = new bqi(this);
        this.v = new bqj(this);
        bm.a((Object) bck, (Object) "Can't create ConversationCreator with null participants model.");
        String valueOf = String.valueOf(bxt);
        glk.a("Babel_ConvCreator", new StringBuilder(String.valueOf(valueOf).length() + 53).append("Conversation creator created with conversation type: ").append(valueOf).toString(), new Object[0]);
        this.a = drVar;
        Context jyr = new jyr(context);
        this.b = jyr;
        this.c = i;
        this.e = bck;
        this.f = bxt;
        this.d = jyr.getBinder();
        this.d.a(bpx.class, this.t);
        this.d.a(bpr.class, this.u);
        this.d.a(bpz.class, this.j);
        this.l = (jgg) this.d.a(jgg.class);
        this.l.a(this.v);
        this.g = (jca) this.d.a(jca.class);
        kbu.a((kcq) this);
        this.r = ((bpv) this.d.a(bpv.class)).a(this.b, kbu, i);
        this.i = ((bpv) this.d.a(bpv.class)).a(this.b, kbu, i, drVar.getFragmentManager());
        this.s = ((bpv) this.d.a(bpv.class)).a(this.b, kbu, drVar.getFragmentManager());
    }

    public void a(Bundle bundle) {
        if (bundle != null) {
            glk.a("Babel_ConvCreator", "Conversation creator restored from saved state", new Object[0]);
            if (bundle.getBoolean("creation_completed")) {
                glk.a("Babel_ConvCreator", "Not restoring instance state since the last creation was completed.", new Object[0]);
                return;
            }
            this.h = (bjg) bundle.getSerializable("current_contact");
            this.m = (boy) bundle.getSerializable("lookup_mode");
            this.n = bundle.getBoolean("force_group_conversation");
            this.p = bundle.getString("invite_token_url");
            this.q = bundle.getInt("impression_id");
        }
    }

    public String a() {
        String valueOf = String.valueOf(getClass().getName());
        return new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.c).toString();
    }

    public void b(Bundle bundle) {
        glk.a("Babel_ConvCreator", "Saving state of conversation creator", new Object[0]);
        bundle.putSerializable("current_contact", this.h);
        bundle.putBoolean("creation_completed", this.k);
        bundle.putSerializable("lookup_mode", this.m);
        bundle.putBoolean("force_group_conversation", this.n);
        bundle.putString("invite_token_url", this.o);
        bundle.putString("invite_token_url", this.p);
        bundle.putInt("impression_id", this.q);
    }

    public void o_() {
        this.l.b(this.v);
    }

    public void a(bjg bjg) {
        bm.b(!this.k, (Object) "Should not add new contact after conversation has been created.");
        if (this.h != null) {
            String valueOf = String.valueOf(bjg);
            glk.a("Babel_ConvCreator", new StringBuilder(String.valueOf(valueOf).length() + 65).append("addContact for ").append(valueOf).append(" skipped because previous addition hasn't finished").toString(), new Object[0]);
            ((bpu) this.d.a(bpu.class)).a(bjg, false, 0);
            return;
        }
        valueOf = "Babel_ConvCreator";
        String str = "addContact called with ";
        String valueOf2 = String.valueOf(bjg.toString());
        glk.a(valueOf, valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str), new Object[0]);
        this.h = bjg;
        this.r.a(bjg, this.f);
    }

    public void b(bjg bjg) {
        bm.b(!this.k, (Object) "Should not remove contact after conversation has been created.");
        if (this.h != null) {
            String valueOf = String.valueOf(bjg);
            glk.a("Babel_ConvCreator", new StringBuilder(String.valueOf(valueOf).length() + 68).append("removeContact for ").append(valueOf).append(" skipped because previous addition hasn't finished").toString(), new Object[0]);
            return;
        }
        valueOf = "Babel_ConvCreator";
        String str = "removeContact called with ";
        String valueOf2 = String.valueOf(bjg.toString());
        glk.a(valueOf, valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str), new Object[0]);
        this.e.a(this.b, bjg);
    }

    public void a(boy boy, boolean z, String str, String str2, int i) {
        boolean z2;
        bm.b(!this.k, (Object) "Can't create conversation more than once.");
        if (this.h == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        bm.b(z2, (Object) "Contact adding should be finished before creating conversation");
        glk.a("Babel_ConvCreator", "create called without known conversationId", new Object[0]);
        this.m = boy;
        this.n = z;
        this.o = str;
        this.p = null;
        this.q = i;
        fzw fzw = (fzw) this.d.a(fzw.class);
        Collection d = this.e.d();
        if (this.f == bxt.SMS_MESSAGE && glq.c(this.b) && fzw.j().equals("auto") && fzw.d() && d.size() == 1) {
            gwb.a(new bqk(this, d));
        } else {
            this.s.a(this.f, d);
        }
    }

    public void a(String str, int i) {
        boolean z;
        bm.a(!TextUtils.isEmpty(str), (Object) "Create called with empty conversation ID");
        if (this.k) {
            z = false;
        } else {
            z = true;
        }
        bm.b(z, (Object) "Can't create conversation more than once");
        if (this.h == null) {
            z = true;
        } else {
            z = false;
        }
        bm.b(z, (Object) "Contact adding should be finished before creating conversation");
        String str2 = "Babel_ConvCreator";
        String str3 = "create called with existing conversationId ";
        String valueOf = String.valueOf(glk.b(str));
        glk.a(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
        ((iih) this.d.a(iih.class)).a(this.g.a()).b().c(i);
        ((bpu) this.d.a(bpu.class)).a(str);
        a(true);
    }

    void a(boolean z, int i) {
        bjg bjg = this.h;
        this.h = null;
        ((bpu) this.d.a(bpu.class)).a(bjg, z, i);
    }

    void a(int i) {
        boolean z = true;
        fbx fbx = (fbx) jyn.a(this.b, fbx.class);
        int a = this.g.a();
        if (this.f == bxt.AUDIO_CALL) {
            boolean z2;
            for (bcn b : this.e.d()) {
                if (!TextUtils.isEmpty(b.b().d)) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            if (z2) {
                if (fbx.b(this.b) && !((fzw) this.d.a(fzw.class)).a(a)) {
                    iil.a("Audio calling to multiple phone numbers is not supported", this.e.e() == 1);
                    glk.a("Babel_ConvCreator", "Making outbound audio call", new Object[0]);
                    bko e = fde.e(this.g.a());
                    bcn bcn = (bcn) this.e.d().get(0);
                    gwb.a(this.a.getActivity(), new fdv(2, bcn.b().d, null, 0, bcn.d(), bcn.g(), null, 120), e.g(), e.a());
                } else if (glq.a(this.b)) {
                    String str = "Audio calling to multiple phone numbers is not supported";
                    if (this.e.e() != 1) {
                        z = false;
                    }
                    iil.a(str, z);
                    this.b.startActivity(gwb.g(this.b, ((bcn) this.e.d().get(0)).b().d));
                } else {
                    bgs bgs = (bgs) jyn.b(this.b, bgs.class);
                    if (bgs != null) {
                        this.b.startActivity(bgs.a(this.b));
                    }
                }
                ((bpu) this.d.a(bpu.class)).a(null);
                return;
            }
        }
        glk.a("Babel_ConvCreator", "Conversation creation background task started", new Object[0]);
        if (this.f == bxt.SMS_MESSAGE && this.e.e() > 1 && i == 2) {
            ((iih) this.d.a(iih.class)).a(a).b().c(2711);
        }
        bpv bpv = (bpv) this.d.a(bpv.class);
        String valueOf = String.valueOf("conversation_creation");
        this.l.b(bpv.a(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.c).toString(), a, this.e.a(), this.m, this.f, i, this.o, this.n, this.p, this.q));
    }

    void a(boolean z) {
        this.k = z;
        if (z) {
            this.l.b(this.v);
        }
    }
}
