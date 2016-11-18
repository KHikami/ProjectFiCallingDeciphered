package p000;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Collection;

public final class bqf implements bpt, kcd, kcg, kcn, kcq, kcr {
    final dr f4213a;
    final Context f4214b;
    final int f4215c;
    final jyn f4216d;
    final bck f4217e;
    final bxt f4218f;
    jca f4219g;
    bjg f4220h;
    final bpq f4221i;
    final bpz f4222j = new bqi(this);
    private boolean f4223k;
    private jgg f4224l;
    private boy f4225m;
    private boolean f4226n;
    private String f4227o;
    private String f4228p;
    private int f4229q;
    private final bpw f4230r;
    private final bpy f4231s;
    private bpx f4232t = new bqg(this);
    private final bpr f4233u = new bqh(this);
    private final jgf f4234v = new bqj(this);

    public bqf(Context context, kbu kbu, int i, dr drVar, bck bck, bxt bxt) {
        bm.m6123a((Object) bck, (Object) "Can't create ConversationCreator with null participants model.");
        String valueOf = String.valueOf(bxt);
        glk.m17970a("Babel_ConvCreator", new StringBuilder(String.valueOf(valueOf).length() + 53).append("Conversation creator created with conversation type: ").append(valueOf).toString(), new Object[0]);
        this.f4213a = drVar;
        Context jyr = new jyr(context);
        this.f4214b = jyr;
        this.f4215c = i;
        this.f4217e = bck;
        this.f4218f = bxt;
        this.f4216d = jyr.getBinder();
        this.f4216d.m25444a(bpx.class, this.f4232t);
        this.f4216d.m25444a(bpr.class, this.f4233u);
        this.f4216d.m25444a(bpz.class, this.f4222j);
        this.f4224l = (jgg) this.f4216d.m25443a(jgg.class);
        this.f4224l.m24129a(this.f4234v);
        this.f4219g = (jca) this.f4216d.m25443a(jca.class);
        kbu.m25514a((kcq) this);
        this.f4230r = ((bpv) this.f4216d.m25443a(bpv.class)).mo665a(this.f4214b, kbu, i);
        this.f4221i = ((bpv) this.f4216d.m25443a(bpv.class)).mo663a(this.f4214b, kbu, i, drVar.getFragmentManager());
        this.f4231s = ((bpv) this.f4216d.m25443a(bpv.class)).mo666a(this.f4214b, kbu, drVar.getFragmentManager());
    }

    public void mo643a(Bundle bundle) {
        if (bundle != null) {
            glk.m17970a("Babel_ConvCreator", "Conversation creator restored from saved state", new Object[0]);
            if (bundle.getBoolean("creation_completed")) {
                glk.m17970a("Babel_ConvCreator", "Not restoring instance state since the last creation was completed.", new Object[0]);
                return;
            }
            this.f4220h = (bjg) bundle.getSerializable("current_contact");
            this.f4225m = (boy) bundle.getSerializable("lookup_mode");
            this.f4226n = bundle.getBoolean("force_group_conversation");
            this.f4228p = bundle.getString("invite_token_url");
            this.f4229q = bundle.getInt("impression_id");
        }
    }

    public String mo642a() {
        String valueOf = String.valueOf(getClass().getName());
        return new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.f4215c).toString();
    }

    public void mo645b(Bundle bundle) {
        glk.m17970a("Babel_ConvCreator", "Saving state of conversation creator", new Object[0]);
        bundle.putSerializable("current_contact", this.f4220h);
        bundle.putBoolean("creation_completed", this.f4223k);
        bundle.putSerializable("lookup_mode", this.f4225m);
        bundle.putBoolean("force_group_conversation", this.f4226n);
        bundle.putString("invite_token_url", this.f4227o);
        bundle.putString("invite_token_url", this.f4228p);
        bundle.putInt("impression_id", this.f4229q);
    }

    public void o_() {
        this.f4224l.m24136b(this.f4234v);
    }

    public void mo653a(bjg bjg) {
        bm.m6151b(!this.f4223k, (Object) "Should not add new contact after conversation has been created.");
        if (this.f4220h != null) {
            String valueOf = String.valueOf(bjg);
            glk.m17970a("Babel_ConvCreator", new StringBuilder(String.valueOf(valueOf).length() + 65).append("addContact for ").append(valueOf).append(" skipped because previous addition hasn't finished").toString(), new Object[0]);
            ((bpu) this.f4216d.m25443a(bpu.class)).mo903a(bjg, false, 0);
            return;
        }
        valueOf = "Babel_ConvCreator";
        String str = "addContact called with ";
        String valueOf2 = String.valueOf(bjg.toString());
        glk.m17970a(valueOf, valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str), new Object[0]);
        this.f4220h = bjg;
        this.f4230r.mo668a(bjg, this.f4218f);
    }

    public void mo656b(bjg bjg) {
        bm.m6151b(!this.f4223k, (Object) "Should not remove contact after conversation has been created.");
        if (this.f4220h != null) {
            String valueOf = String.valueOf(bjg);
            glk.m17970a("Babel_ConvCreator", new StringBuilder(String.valueOf(valueOf).length() + 68).append("removeContact for ").append(valueOf).append(" skipped because previous addition hasn't finished").toString(), new Object[0]);
            return;
        }
        valueOf = "Babel_ConvCreator";
        String str = "removeContact called with ";
        String valueOf2 = String.valueOf(bjg.toString());
        glk.m17970a(valueOf, valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str), new Object[0]);
        this.f4217e.m4862a(this.f4214b, bjg);
    }

    public void mo654a(boy boy, boolean z, String str, String str2, int i) {
        boolean z2;
        bm.m6151b(!this.f4223k, (Object) "Can't create conversation more than once.");
        if (this.f4220h == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        bm.m6151b(z2, (Object) "Contact adding should be finished before creating conversation");
        glk.m17970a("Babel_ConvCreator", "create called without known conversationId", new Object[0]);
        this.f4225m = boy;
        this.f4226n = z;
        this.f4227o = str;
        this.f4228p = null;
        this.f4229q = i;
        fzw fzw = (fzw) this.f4216d.m25443a(fzw.class);
        Collection d = this.f4217e.m4874d();
        if (this.f4218f == bxt.SMS_MESSAGE && glq.m18015c(this.f4214b) && fzw.mo2162j().equals("auto") && fzw.mo2155d() && d.size() == 1) {
            gwb.m1863a(new bqk(this, d));
        } else {
            this.f4231s.mo669a(this.f4218f, d);
        }
    }

    public void mo655a(String str, int i) {
        boolean z;
        bm.m6138a(!TextUtils.isEmpty(str), (Object) "Create called with empty conversation ID");
        if (this.f4223k) {
            z = false;
        } else {
            z = true;
        }
        bm.m6151b(z, (Object) "Can't create conversation more than once");
        if (this.f4220h == null) {
            z = true;
        } else {
            z = false;
        }
        bm.m6151b(z, (Object) "Contact adding should be finished before creating conversation");
        String str2 = "Babel_ConvCreator";
        String str3 = "create called with existing conversationId ";
        String valueOf = String.valueOf(glk.m17974b(str));
        glk.m17970a(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
        ((iih) this.f4216d.m25443a(iih.class)).mo1979a(this.f4219g.mo2317a()).mo1693b().mo1714c(i);
        ((bpu) this.f4216d.m25443a(bpu.class)).mo904a(str);
        m6430a(true);
    }

    void m6431a(boolean z, int i) {
        bjg bjg = this.f4220h;
        this.f4220h = null;
        ((bpu) this.f4216d.m25443a(bpu.class)).mo903a(bjg, z, i);
    }

    void m6425a(int i) {
        boolean z = true;
        fbx fbx = (fbx) jyn.m25426a(this.f4214b, fbx.class);
        int a = this.f4219g.mo2317a();
        if (this.f4218f == bxt.AUDIO_CALL) {
            boolean z2;
            for (bcn b : this.f4217e.m4874d()) {
                if (!TextUtils.isEmpty(b.m4893b().f12669d)) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            if (z2) {
                if (fbx.mo1971b(this.f4214b) && !((fzw) this.f4216d.m25443a(fzw.class)).mo2146a(a)) {
                    iil.m21874a("Audio calling to multiple phone numbers is not supported", this.f4217e.m4876e() == 1);
                    glk.m17970a("Babel_ConvCreator", "Making outbound audio call", new Object[0]);
                    bko e = fde.m15018e(this.f4219g.mo2317a());
                    bcn bcn = (bcn) this.f4217e.m4874d().get(0);
                    gwb.m1833a(this.f4213a.getActivity(), new fdv(2, bcn.m4893b().f12669d, null, 0, bcn.m4895d(), bcn.m4898g(), null, 120), e.m5638g(), e.m5629a());
                } else if (glq.m18006a(this.f4214b)) {
                    String str = "Audio calling to multiple phone numbers is not supported";
                    if (this.f4217e.m4876e() != 1) {
                        z = false;
                    }
                    iil.m21874a(str, z);
                    this.f4214b.startActivity(gwb.m2211g(this.f4214b, ((bcn) this.f4217e.m4874d().get(0)).m4893b().f12669d));
                } else {
                    bgs bgs = (bgs) jyn.m25433b(this.f4214b, bgs.class);
                    if (bgs != null) {
                        this.f4214b.startActivity(bgs.mo549a(this.f4214b));
                    }
                }
                ((bpu) this.f4216d.m25443a(bpu.class)).mo904a(null);
                return;
            }
        }
        glk.m17970a("Babel_ConvCreator", "Conversation creation background task started", new Object[0]);
        if (this.f4218f == bxt.SMS_MESSAGE && this.f4217e.m4876e() > 1 && i == 2) {
            ((iih) this.f4216d.m25443a(iih.class)).mo1979a(a).mo1693b().mo1714c(2711);
        }
        bpv bpv = (bpv) this.f4216d.m25443a(bpv.class);
        String valueOf = String.valueOf("conversation_creation");
        this.f4224l.m24139b(bpv.mo667a(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.f4215c).toString(), a, this.f4217e.m4861a(), this.f4225m, this.f4218f, i, this.f4227o, this.f4226n, this.f4228p, this.f4229q));
    }

    void m6430a(boolean z) {
        this.f4223k = z;
        if (z) {
            this.f4224l.m24136b(this.f4234v);
        }
    }
}
