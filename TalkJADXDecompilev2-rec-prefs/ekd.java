package p000;

import android.content.Context;
import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.CronetEngine;

public final class ekd implements epf {
    private onc<joh> f11680A = oiv.a(new jnw(this.f11703a));
    private onc<jna> f11681B = oiv.a(jnx.f20561a);
    private onc<jmg> f11682C = oiv.a(jnt.f20556a);
    private onc<jno> f11683D = oiv.a(new jnu(this.f11703a));
    private onc<jcd[]> f11684E = oiv.a(new jns(this.f11680A));
    private onc<jmz> f11685F = oiv.a(jny.f20563a);
    private onc<lkg> f11686G = new lkh(this.f11728z, oiy.a);
    private onc<lke> f11687H = oiv.a(new lkf(oiy.a));
    private onc<lih> f11688I = oiv.a(new lii(oiy.a));
    private onc<dti> f11689J = oiv.a(new dtj(this.f11703a));
    private onc<eod> f11690K = oiv.a(new eoh(this.f11703a, this.f11689J));
    private onc<lhi> f11691L = new eol(this.f11690K);
    private onc<idv> f11692M;
    private onc<lhi> f11693N;
    private onc<ScheduledExecutorService> f11694O;
    private onc<Set<Boolean>> f11695P;
    private onc<lio> f11696Q;
    private onc<lhi> f11697R;
    private onc<Set<lhi>> f11698S;
    private onc<lhd> f11699T;
    private onc<lgj> f11700U;
    private onc<Set<Annotation>> f11701V;
    private onc<Map<String, onc<Set<Annotation>>>> f11702W;
    onc<Context> f11703a;
    onc<jmq> f11704b = oiv.a(new jnv(this.f11680A));
    onc<lfp> f11705c;
    onc<jcf> f11706d;
    onc<ero> f11707e;
    private onc<Set<jsf>> f11708f = oiy.a(1, 0).a(foo.f13585a).a();
    private onc<jsd> f11709g = new fon(this.f11703a);
    private onc<Set<jsd>> f11710h = oiy.a(1, 0).a(this.f11709g).a();
    private onc<CronetEngine> f11711i = new jsc(this.f11703a, this.f11708f, this.f11710h);
    private onc<CronetEngine> f11712j = oiv.a(new jsg(this.f11711i, oiy.a));
    private onc<mtl> f11713k = oiv.a(lgd.f24942a);
    private onc<mtl> f11714l = this.f11713k;
    private onc<ExecutorService> f11715m = this.f11714l;
    private onc<ExecutorService> f11716n = this.f11714l;
    private onc<lgy> f11717o = oiv.a(new lhb(this.f11716n));
    private onc f11718p = oiv.a(jhw.f20119a);
    private onc<jhx> f11719q = oiv.a(this.f11718p);
    private onc<mtm> f11720r = oiv.a(lgf.f24945a);
    private onc<mtm> f11721s = oiv.a(new lge(this.f11720r));
    private onc<mtm> f11722t = oiv.a(this.f11721s);
    private onc<Executor> f11723u = this.f11722t;
    private onc<ljs> f11724v = new ljc(ljd.f25079a);
    private onc<Set<ljs>> f11725w = oiy.a(1, 0).a(this.f11724v).a();
    private onc f11726x = oiv.a(new ljx(this.f11717o, this.f11719q, this.f11723u, this.f11725w));
    private onc f11727y = this.f11726x;
    private onc<ljp> f11728z = ojb.a(new ljr(this.f11727y, oiy.a));

    public /* synthetic */ Object mo1894a(lhs lhs) {
        return m14061b(lhs);
    }

    ekd(ekg ekg) {
        this.f11703a = new lhv(ekg.f11747a);
        this.f11692M = new iex(ekg.f11748b);
        this.f11693N = new lim(this.f11703a, ihj.INSTANCE, this.f11692M);
        this.f11694O = oiv.a(lis.INSTANCE);
        this.f11695P = oiy.a(1, 0).a(lin.INSTANCE).a();
        this.f11696Q = oiv.a(new lit(this.f11694O, this.f11695P));
        this.f11697R = new lir(this.f11696Q);
        this.f11698S = oiy.a(4, 0).a(this.f11691L).a(lik.INSTANCE).a(this.f11693N).a(this.f11697R).a();
        this.f11699T = oiv.a(new lhf(oiy.a));
        this.f11700U = oiv.a(new lgk(this.f11703a));
        this.f11701V = oiv.a(gbc.INSTANCE);
        this.f11702W = oiw.a(2).a("com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsActivityPeer", this.f11701V).a("map-initializer", lfq.INSTANCE).a();
        this.f11705c = oiv.a(new lfr(this.f11702W));
        this.f11706d = oiv.a(new lfe(this.f11703a));
        this.f11707e = new erk(ekg.f11749c, this.f11703a);
    }

    public CronetEngine mo1895a() {
        return (CronetEngine) this.f11712j.mo1297a();
    }

    public ExecutorService mo1896b() {
        return (ExecutorService) this.f11715m.mo1297a();
    }

    public ljp mo1897c() {
        return (ljp) this.f11728z.mo1297a();
    }

    public joh mo1898d() {
        return (joh) this.f11680A.mo1297a();
    }

    public jmq mo1899e() {
        return (jmq) this.f11704b.mo1297a();
    }

    public jna mo1900f() {
        return (jna) this.f11681B.mo1297a();
    }

    public jmg mo1901g() {
        return (jmg) this.f11682C.mo1297a();
    }

    public jno mo1902h() {
        return (jno) this.f11683D.mo1297a();
    }

    public jcd[] mo1903i() {
        return (jcd[]) this.f11684E.mo1297a();
    }

    public jmz mo1904j() {
        return (jmz) this.f11685F.mo1297a();
    }

    public ljp mo1905k() {
        return (ljp) this.f11728z.mo1297a();
    }

    public lke mo1906l() {
        return (lke) this.f11687H.mo1297a();
    }

    public lih mo1907m() {
        return (lih) this.f11688I.mo1297a();
    }

    public Set<lhi> mo1908n() {
        return (Set) this.f11698S.mo1297a();
    }

    public lhd mo1909o() {
        return (lhd) this.f11699T.mo1297a();
    }

    public lgj mo1910p() {
        return (lgj) this.f11700U.mo1297a();
    }

    private gbe m14061b(lhs lhs) {
        return new eke(this, lhs);
    }
}
