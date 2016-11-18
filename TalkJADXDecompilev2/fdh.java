package defpackage;

import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class fdh {
    public int a = 100;
    private final bko b;
    private final fdn c;
    @Deprecated
    private boolean d = false;
    @Deprecated
    private boolean e = false;
    @Deprecated
    private boolean f = false;
    private boolean g = false;

    public fdh(bko bko) {
        this.b = bko;
        this.c = new fdn(this.b);
    }

    public String a() {
        int g = this.b.g();
        String valueOf = String.valueOf(glk.b(this.b.a()));
        return new StringBuilder(String.valueOf(valueOf).length() + 12).append(g).append("-").append(valueOf).toString();
    }

    public fdn b() {
        fdn fdn;
        synchronized (this) {
            fdn = this.c;
        }
        return fdn;
    }

    public String c() {
        return f().H();
    }

    public String d() {
        return this.b.a();
    }

    public int e() {
        return this.b.g();
    }

    public bko f() {
        bko bko;
        synchronized (this) {
            bko = this.b;
        }
        return bko;
    }

    public int g() {
        if (((fzw) jyn.a(gwb.H(), fzw.class)).a(e())) {
            return 102;
        }
        int i;
        synchronized (this) {
            if (this.a == 100 || this.a == 101) {
                if (this.b.f()) {
                    this.a = 108;
                } else if (i() && this.b.d()) {
                    this.a = 102;
                } else if (this.d || this.e) {
                    this.a = 101;
                }
            }
            if (fde.a) {
                String valueOf = String.valueOf(a());
                String valueOf2 = String.valueOf(Integer.toString(this.a));
                new StringBuilder((String.valueOf(valueOf).length() + 19) + String.valueOf(valueOf2).length()).append("Account ").append(valueOf).append(" in state: ").append(valueOf2);
            }
            i = this.a;
        }
        return i;
    }

    @Deprecated
    public boolean i() {
        return m() != null;
    }

    public boolean j() {
        return g() == 102;
    }

    public boolean k() {
        return this.b.k();
    }

    private void a(String str) {
        synchronized (this) {
            String str2 = "Babel";
            String str3 = "Account registration complete:";
            String valueOf = String.valueOf(a());
            glk.c(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
            if (!TextUtils.isEmpty(null)) {
                bkq.a(gwb.H(), this.b, glj.a());
            }
            this.e = false;
            this.f = false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @java.lang.Deprecated
    void a(boolean r5) {
        /*
        r4 = this;
        r0 = r4.e();
        r1 = defpackage.fdq.I;
        r0 = r1.b(r0);
        if (r0 == 0) goto L_0x0020;
    L_0x000c:
        r0 = defpackage.gwb.H();
        r1 = defpackage.fnc.class;
        r0 = defpackage.jyn.a(r0, r1);
        r0 = (defpackage.fnc) r0;
        r1 = r4.e();
        r0.a(r1);
    L_0x001f:
        return;
    L_0x0020:
        monitor-enter(r4);
        r0 = "Babel";
        r1 = 3;
        r0 = defpackage.glk.a(r0, r1);	 Catch:{ all -> 0x006a }
        if (r0 == 0) goto L_0x0046;
    L_0x002a:
        r1 = "Babel";
        r2 = "register:";
        r0 = r4.a();	 Catch:{ all -> 0x006a }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x006a }
        r3 = r0.length();	 Catch:{ all -> 0x006a }
        if (r3 == 0) goto L_0x006d;
    L_0x003c:
        r0 = r2.concat(r0);	 Catch:{ all -> 0x006a }
    L_0x0040:
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x006a }
        defpackage.glk.a(r1, r0, r2);	 Catch:{ all -> 0x006a }
    L_0x0046:
        r0 = defpackage.gwb.H();	 Catch:{ all -> 0x006a }
        r1 = defpackage.fzw.class;
        r0 = defpackage.jyn.a(r0, r1);	 Catch:{ all -> 0x006a }
        r0 = (defpackage.fzw) r0;	 Catch:{ all -> 0x006a }
        r1 = r4.b;	 Catch:{ all -> 0x006a }
        r1 = r1.g();	 Catch:{ all -> 0x006a }
        r0 = r0.a(r1);	 Catch:{ all -> 0x006a }
        if (r0 == 0) goto L_0x0073;
    L_0x005e:
        r0 = "Babel";
        r1 = "Skipping registration for SMS only account";
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x006a }
        defpackage.glk.c(r0, r1, r2);	 Catch:{ all -> 0x006a }
        monitor-exit(r4);	 Catch:{ all -> 0x006a }
        goto L_0x001f;
    L_0x006a:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x006a }
        throw r0;
    L_0x006d:
        r0 = new java.lang.String;	 Catch:{ all -> 0x006a }
        r0.<init>(r2);	 Catch:{ all -> 0x006a }
        goto L_0x0040;
    L_0x0073:
        r0 = r4.b;	 Catch:{ all -> 0x006a }
        r0 = r0.d();	 Catch:{ all -> 0x006a }
        if (r0 != 0) goto L_0x009f;
    L_0x007b:
        r1 = "Babel";
        r2 = "Account not valid for babel. Skip device registration: ";
        r0 = r4.a();	 Catch:{ all -> 0x006a }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x006a }
        r3 = r0.length();	 Catch:{ all -> 0x006a }
        if (r3 == 0) goto L_0x0099;
    L_0x008d:
        r0 = r2.concat(r0);	 Catch:{ all -> 0x006a }
    L_0x0091:
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x006a }
        defpackage.glk.c(r1, r0, r2);	 Catch:{ all -> 0x006a }
        monitor-exit(r4);	 Catch:{ all -> 0x006a }
        goto L_0x001f;
    L_0x0099:
        r0 = new java.lang.String;	 Catch:{ all -> 0x006a }
        r0.<init>(r2);	 Catch:{ all -> 0x006a }
        goto L_0x0091;
    L_0x009f:
        r0 = r4.i();	 Catch:{ all -> 0x006a }
        if (r0 == 0) goto L_0x00cc;
    L_0x00a5:
        if (r5 != 0) goto L_0x00cc;
    L_0x00a7:
        r1 = "Babel";
        r2 = "Account already registered. Skip device registration: ";
        r0 = r4.a();	 Catch:{ all -> 0x006a }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x006a }
        r3 = r0.length();	 Catch:{ all -> 0x006a }
        if (r3 == 0) goto L_0x00c6;
    L_0x00b9:
        r0 = r2.concat(r0);	 Catch:{ all -> 0x006a }
    L_0x00bd:
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x006a }
        defpackage.glk.c(r1, r0, r2);	 Catch:{ all -> 0x006a }
        monitor-exit(r4);	 Catch:{ all -> 0x006a }
        goto L_0x001f;
    L_0x00c6:
        r0 = new java.lang.String;	 Catch:{ all -> 0x006a }
        r0.<init>(r2);	 Catch:{ all -> 0x006a }
        goto L_0x00bd;
    L_0x00cc:
        r0 = defpackage.fde.e;	 Catch:{ all -> 0x006a }
        r0 = defpackage.ffh.a();	 Catch:{ all -> 0x006a }
        r0 = r0.d();	 Catch:{ all -> 0x006a }
        if (r0 == 0) goto L_0x0109;
    L_0x00d8:
        r1 = "Babel";
        r2 = "register - retrying gcm registration:";
        r0 = r4.a();	 Catch:{ all -> 0x006a }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x006a }
        r3 = r0.length();	 Catch:{ all -> 0x006a }
        if (r3 == 0) goto L_0x0103;
    L_0x00ea:
        r0 = r2.concat(r0);	 Catch:{ all -> 0x006a }
    L_0x00ee:
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x006a }
        defpackage.glk.c(r1, r0, r2);	 Catch:{ all -> 0x006a }
        r0 = 1;
        r4.d = r0;	 Catch:{ all -> 0x006a }
        r0 = defpackage.fde.e;	 Catch:{ all -> 0x006a }
        r0 = defpackage.ffh.a();	 Catch:{ all -> 0x006a }
        r0.g();	 Catch:{ all -> 0x006a }
        monitor-exit(r4);	 Catch:{ all -> 0x006a }
        goto L_0x001f;
    L_0x0103:
        r0 = new java.lang.String;	 Catch:{ all -> 0x006a }
        r0.<init>(r2);	 Catch:{ all -> 0x006a }
        goto L_0x00ee;
    L_0x0109:
        r0 = defpackage.fde.e;	 Catch:{ all -> 0x006a }
        r0 = defpackage.ffh.a();	 Catch:{ all -> 0x006a }
        r0 = r0.c();	 Catch:{ all -> 0x006a }
        if (r0 != 0) goto L_0x013d;
    L_0x0115:
        r0 = 1;
        r4.d = r0;	 Catch:{ all -> 0x006a }
        r1 = "Babel";
        r2 = "Account registration pending Gcm:";
        r0 = r4.a();	 Catch:{ all -> 0x006a }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x006a }
        r3 = r0.length();	 Catch:{ all -> 0x006a }
        if (r3 == 0) goto L_0x0137;
    L_0x012a:
        r0 = r2.concat(r0);	 Catch:{ all -> 0x006a }
    L_0x012e:
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x006a }
        defpackage.glk.c(r1, r0, r2);	 Catch:{ all -> 0x006a }
    L_0x0134:
        monitor-exit(r4);	 Catch:{ all -> 0x006a }
        goto L_0x001f;
    L_0x0137:
        r0 = new java.lang.String;	 Catch:{ all -> 0x006a }
        r0.<init>(r2);	 Catch:{ all -> 0x006a }
        goto L_0x012e;
    L_0x013d:
        r1 = "Babel";
        r2 = "Starting account registration:";
        r0 = r4.a();	 Catch:{ all -> 0x006a }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x006a }
        r3 = r0.length();	 Catch:{ all -> 0x006a }
        if (r3 == 0) goto L_0x0167;
    L_0x014f:
        r0 = r2.concat(r0);	 Catch:{ all -> 0x006a }
    L_0x0153:
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x006a }
        defpackage.glk.c(r1, r0, r2);	 Catch:{ all -> 0x006a }
        r0 = r4.b;	 Catch:{ all -> 0x006a }
        r1 = r4.g;	 Catch:{ all -> 0x006a }
        com.google.android.apps.hangouts.realtimechat.RealTimeChatService.a(r0, r1);	 Catch:{ all -> 0x006a }
        r0 = 1;
        r4.e = r0;	 Catch:{ all -> 0x006a }
        r0 = 0;
        r4.d = r0;	 Catch:{ all -> 0x006a }
        goto L_0x0134;
    L_0x0167:
        r0 = new java.lang.String;	 Catch:{ all -> 0x006a }
        r0.<init>(r2);	 Catch:{ all -> 0x006a }
        goto L_0x0153;
        */
        throw new UnsupportedOperationException("Method not decompiled: fdh.a(boolean):void");
    }

    public String l() {
        if (fdq.I.b(e())) {
            fnd a = ((fnc) jyn.a(gwb.H(), fnc.class)).a(e());
            return a != null ? a.c : null;
        } else {
            String m = m();
            if (!TextUtils.isEmpty(m)) {
                int indexOf = m.indexOf(47);
                if (indexOf >= 0) {
                    return m.substring(indexOf + 1);
                }
            }
            return null;
        }
    }

    public String m() {
        if (fdq.I.b(e())) {
            fnd a = ((fnc) jyn.a(gwb.H(), fnc.class)).a(e());
            if (a != null) {
                return a.b;
            }
            return null;
        }
        jch a2 = ((jcf) jyn.a(gwb.H(), jcf.class)).a(e());
        return a2 == null ? null : a2.a("full_jid", null);
    }

    @Deprecated
    public void n() {
        if (fdq.I.b(e())) {
            ((fnc) jyn.a(gwb.H(), fnc.class)).b(e());
            return;
        }
        synchronized (this) {
            if (ffh.a().c()) {
                RealTimeChatService.a(this.b);
            }
            a(null);
            h();
        }
    }

    @Deprecated
    public void o() {
        bkq.a(gwb.H(), this.b, -1);
    }

    public void p() {
        bkq.b(gwb.H(), this.b, -1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @java.lang.Deprecated
    void q() {
        /*
        r8 = this;
        r0 = r8.e();
        r1 = defpackage.fdq.I;
        r0 = r1.b(r0);
        if (r0 == 0) goto L_0x0020;
    L_0x000c:
        r0 = defpackage.gwb.H();
        r1 = defpackage.fnc.class;
        r0 = defpackage.jyn.a(r0, r1);
        r0 = (defpackage.fnc) r0;
        r1 = r8.e();
        r0.a(r1);
    L_0x001f:
        return;
    L_0x0020:
        monitor-enter(r8);
        r0 = r8.b;	 Catch:{ all -> 0x005e }
        r0 = r0.d();	 Catch:{ all -> 0x005e }
        if (r0 != 0) goto L_0x0061;
    L_0x0029:
        r0 = "Babel";
        r1 = r8.a();	 Catch:{ all -> 0x005e }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x005e }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x005e }
        r3 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x005e }
        r3 = r3.length();	 Catch:{ all -> 0x005e }
        r3 = r3 + 61;
        r2.<init>(r3);	 Catch:{ all -> 0x005e }
        r3 = "Account ";
        r2 = r2.append(r3);	 Catch:{ all -> 0x005e }
        r1 = r2.append(r1);	 Catch:{ all -> 0x005e }
        r2 = " not valid for babel. Skip device registration renew.";
        r1 = r1.append(r2);	 Catch:{ all -> 0x005e }
        r1 = r1.toString();	 Catch:{ all -> 0x005e }
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x005e }
        defpackage.glk.a(r0, r1, r2);	 Catch:{ all -> 0x005e }
        monitor-exit(r8);	 Catch:{ all -> 0x005e }
        goto L_0x001f;
    L_0x005e:
        r0 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x005e }
        throw r0;
    L_0x0061:
        r0 = r8.i();	 Catch:{ all -> 0x005e }
        if (r0 == 0) goto L_0x006b;
    L_0x0067:
        r0 = r8.f;	 Catch:{ all -> 0x005e }
        if (r0 == 0) goto L_0x006d;
    L_0x006b:
        monitor-exit(r8);	 Catch:{ all -> 0x005e }
        goto L_0x001f;
    L_0x006d:
        r0 = defpackage.gwb.H();	 Catch:{ all -> 0x005e }
        r1 = r8.b;	 Catch:{ all -> 0x005e }
        r0 = defpackage.bkq.c(r0, r1);	 Catch:{ all -> 0x005e }
        r2 = defpackage.glj.a();	 Catch:{ all -> 0x005e }
        r4 = r0 - r2;
        r6 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r4 > 0) goto L_0x008e;
    L_0x0084:
        r0 = r2 - r0;
        r2 = defpackage.fde.b();	 Catch:{ all -> 0x005e }
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x00c4;
    L_0x008e:
        r0 = defpackage.ffh.a();	 Catch:{ all -> 0x005e }
        r0 = r0.c();	 Catch:{ all -> 0x005e }
        if (r0 == 0) goto L_0x00c4;
    L_0x0098:
        r0 = "Babel";
        r1 = 3;
        r0 = defpackage.glk.a(r0, r1);	 Catch:{ all -> 0x005e }
        if (r0 == 0) goto L_0x00bd;
    L_0x00a1:
        r1 = "Babel";
        r2 = "Renewing account registration:";
        r0 = r8.a();	 Catch:{ all -> 0x005e }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x005e }
        r3 = r0.length();	 Catch:{ all -> 0x005e }
        if (r3 == 0) goto L_0x00c7;
    L_0x00b3:
        r0 = r2.concat(r0);	 Catch:{ all -> 0x005e }
    L_0x00b7:
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x005e }
        defpackage.glk.a(r1, r0, r2);	 Catch:{ all -> 0x005e }
    L_0x00bd:
        r0 = 1;
        r8.f = r0;	 Catch:{ all -> 0x005e }
        r0 = 1;
        r8.a(r0);	 Catch:{ all -> 0x005e }
    L_0x00c4:
        monitor-exit(r8);	 Catch:{ all -> 0x005e }
        goto L_0x001f;
    L_0x00c7:
        r0 = new java.lang.String;	 Catch:{ all -> 0x005e }
        r0.<init>(r2);	 Catch:{ all -> 0x005e }
        goto L_0x00b7;
        */
        throw new UnsupportedOperationException("Method not decompiled: fdh.q():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void r() {
        /*
        r8 = this;
        monitor-enter(r8);
        r0 = r8.b;	 Catch:{ all -> 0x0025 }
        r0 = r0.d();	 Catch:{ all -> 0x0025 }
        if (r0 != 0) goto L_0x000b;
    L_0x0009:
        monitor-exit(r8);	 Catch:{ all -> 0x0025 }
    L_0x000a:
        return;
    L_0x000b:
        r0 = defpackage.gwb.H();	 Catch:{ all -> 0x0025 }
        r1 = defpackage.fzw.class;
        r0 = defpackage.jyn.a(r0, r1);	 Catch:{ all -> 0x0025 }
        r0 = (defpackage.fzw) r0;	 Catch:{ all -> 0x0025 }
        r1 = r8.b;	 Catch:{ all -> 0x0025 }
        r1 = r1.g();	 Catch:{ all -> 0x0025 }
        r0 = r0.a(r1);	 Catch:{ all -> 0x0025 }
        if (r0 == 0) goto L_0x0028;
    L_0x0023:
        monitor-exit(r8);	 Catch:{ all -> 0x0025 }
        goto L_0x000a;
    L_0x0025:
        r0 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x0025 }
        throw r0;
    L_0x0028:
        r0 = defpackage.gwb.H();	 Catch:{ all -> 0x0025 }
        r1 = r8.b;	 Catch:{ all -> 0x0025 }
        r0 = defpackage.bkq.d(r0, r1);	 Catch:{ all -> 0x0025 }
        r2 = defpackage.glj.a();	 Catch:{ all -> 0x0025 }
        r4 = r0 - r2;
        r6 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r4 > 0) goto L_0x0049;
    L_0x003f:
        r0 = r2 - r0;
        r2 = defpackage.fde.c();	 Catch:{ all -> 0x0025 }
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x0074;
    L_0x0049:
        r0 = "Babel";
        r1 = 3;
        r0 = defpackage.glk.a(r0, r1);	 Catch:{ all -> 0x0025 }
        if (r0 == 0) goto L_0x006e;
    L_0x0052:
        r1 = "Babel";
        r2 = "Renewing account setting:";
        r0 = r8.a();	 Catch:{ all -> 0x0025 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x0025 }
        r3 = r0.length();	 Catch:{ all -> 0x0025 }
        if (r3 == 0) goto L_0x0076;
    L_0x0064:
        r0 = r2.concat(r0);	 Catch:{ all -> 0x0025 }
    L_0x0068:
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x0025 }
        defpackage.glk.a(r1, r0, r2);	 Catch:{ all -> 0x0025 }
    L_0x006e:
        r0 = r8.b;	 Catch:{ all -> 0x0025 }
        r1 = 1;
        com.google.android.apps.hangouts.realtimechat.RealTimeChatService.b(r0, r1);	 Catch:{ all -> 0x0025 }
    L_0x0074:
        monitor-exit(r8);	 Catch:{ all -> 0x0025 }
        goto L_0x000a;
    L_0x0076:
        r0 = new java.lang.String;	 Catch:{ all -> 0x0025 }
        r0.<init>(r2);	 Catch:{ all -> 0x0025 }
        goto L_0x0068;
        */
        throw new UnsupportedOperationException("Method not decompiled: fdh.r():void");
    }

    public boolean s() {
        boolean d;
        synchronized (this) {
            d = bkq.d(gwb.H(), this.b.g());
        }
        return d;
    }

    public boolean t() {
        boolean e;
        synchronized (this) {
            e = bkq.e(gwb.H(), this.b.g());
        }
        return e;
    }

    public void h() {
        if (fde.a) {
            String str = "Clearing account state for";
            String valueOf = String.valueOf(a());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        synchronized (this) {
            this.a = 100;
            this.d = false;
            this.e = false;
            this.f = false;
            this.g = false;
        }
    }
}
