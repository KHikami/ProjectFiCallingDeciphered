package defpackage;

import android.content.Context;
import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.CronetEngine;

public final class ekd implements epf {
    private onc<joh> A = oiv.a(new jnw(this.a));
    private onc<jna> B = oiv.a(jnx.a);
    private onc<jmg> C = oiv.a(jnt.a);
    private onc<jno> D = oiv.a(new jnu(this.a));
    private onc<jcd[]> E = oiv.a(new jns(this.A));
    private onc<jmz> F = oiv.a(jny.a);
    private onc<lkg> G = new lkh(this.z, oiy.a);
    private onc<lke> H = oiv.a(new lkf(oiy.a));
    private onc<lih> I = oiv.a(new lii(oiy.a));
    private onc<dti> J = oiv.a(new dtj(this.a));
    private onc<eod> K = oiv.a(new eoh(this.a, this.J));
    private onc<lhi> L = new eol(this.K);
    private onc<idv> M;
    private onc<lhi> N;
    private onc<ScheduledExecutorService> O;
    private onc<Set<Boolean>> P;
    private onc<lio> Q;
    private onc<lhi> R;
    private onc<Set<lhi>> S;
    private onc<lhd> T;
    private onc<lgj> U;
    private onc<Set<Annotation>> V;
    private onc<Map<String, onc<Set<Annotation>>>> W;
    onc<Context> a;
    onc<jmq> b = oiv.a(new jnv(this.A));
    onc<lfp> c;
    onc<jcf> d;
    onc<ero> e;
    private onc<Set<jsf>> f = oiy.a(1, 0).a(foo.a).a();
    private onc<jsd> g = new fon(this.a);
    private onc<Set<jsd>> h = oiy.a(1, 0).a(this.g).a();
    private onc<CronetEngine> i = new jsc(this.a, this.f, this.h);
    private onc<CronetEngine> j = oiv.a(new jsg(this.i, oiy.a));
    private onc<mtl> k = oiv.a(lgd.a);
    private onc<mtl> l = this.k;
    private onc<ExecutorService> m = this.l;
    private onc<ExecutorService> n = this.l;
    private onc<lgy> o = oiv.a(new lhb(this.n));
    private onc p = oiv.a(jhw.a);
    private onc<jhx> q = oiv.a(this.p);
    private onc<mtm> r = oiv.a(lgf.a);
    private onc<mtm> s = oiv.a(new lge(this.r));
    private onc<mtm> t = oiv.a(this.s);
    private onc<Executor> u = this.t;
    private onc<ljs> v = new ljc(ljd.a);
    private onc<Set<ljs>> w = oiy.a(1, 0).a(this.v).a();
    private onc x = oiv.a(new ljx(this.o, this.q, this.u, this.w));
    private onc y = this.x;
    private onc<ljp> z = ojb.a(new ljr(this.y, oiy.a));

    public /* synthetic */ Object a(lhs lhs) {
        return b(lhs);
    }

    ekd(ekg ekg) {
        this.a = new lhv(ekg.a);
        this.M = new iex(ekg.b);
        this.N = new lim(this.a, ihj.INSTANCE, this.M);
        this.O = oiv.a(lis.INSTANCE);
        this.P = oiy.a(1, 0).a(lin.INSTANCE).a();
        this.Q = oiv.a(new lit(this.O, this.P));
        this.R = new lir(this.Q);
        this.S = oiy.a(4, 0).a(this.L).a(lik.INSTANCE).a(this.N).a(this.R).a();
        this.T = oiv.a(new lhf(oiy.a));
        this.U = oiv.a(new lgk(this.a));
        this.V = oiv.a(gbc.INSTANCE);
        this.W = oiw.a(2).a("com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsActivityPeer", this.V).a("map-initializer", lfq.INSTANCE).a();
        this.c = oiv.a(new lfr(this.W));
        this.d = oiv.a(new lfe(this.a));
        this.e = new erk(ekg.c, this.a);
    }

    public CronetEngine a() {
        return (CronetEngine) this.j.a();
    }

    public ExecutorService b() {
        return (ExecutorService) this.m.a();
    }

    public ljp c() {
        return (ljp) this.z.a();
    }

    public joh d() {
        return (joh) this.A.a();
    }

    public jmq e() {
        return (jmq) this.b.a();
    }

    public jna f() {
        return (jna) this.B.a();
    }

    public jmg g() {
        return (jmg) this.C.a();
    }

    public jno h() {
        return (jno) this.D.a();
    }

    public jcd[] i() {
        return (jcd[]) this.E.a();
    }

    public jmz j() {
        return (jmz) this.F.a();
    }

    public ljp k() {
        return (ljp) this.z.a();
    }

    public lke l() {
        return (lke) this.H.a();
    }

    public lih m() {
        return (lih) this.I.a();
    }

    public Set<lhi> n() {
        return (Set) this.S.a();
    }

    public lhd o() {
        return (lhd) this.T.a();
    }

    public lgj p() {
        return (lgj) this.U.a();
    }

    private gbe b(lhs lhs) {
        return new eke(this, lhs);
    }
}
