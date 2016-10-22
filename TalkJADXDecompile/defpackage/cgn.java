package defpackage;

import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cgn */
final class cgn extends fip {
    final /* synthetic */ cdr a;

    cgn(cdr cdr) {
        this.a = cdr;
    }

    public void a() {
        this.a.v();
    }

    public void b() {
        this.a.v();
    }

    public void a(int i, bko bko, fek fek, fiu fiu) {
        if (i == this.a.e) {
            a(fek);
        }
    }

    public void a(int i, bko bko, fek fek, fiu fiu, String str) {
        if (glk.a("Babel_Conv", 3)) {
            String valueOf = String.valueOf(fek.a);
            String valueOf2 = String.valueOf(bko);
            glk.a("Babel_Conv", new StringBuilder(((String.valueOf(valueOf).length() + 70) + String.valueOf(str).length()) + String.valueOf(valueOf2).length()).append("Forked a new conversation ").append(valueOf).append(" from an existing conversation ").append(str).append(" for account ").append(valueOf2).toString(), new Object[0]);
        }
        if (bko.equals(this.a.av)) {
            a(fek);
        }
    }

    private void a(fek fek) {
        if (fek == null) {
            String valueOf = String.valueOf(this.a.i.a().h);
            glk.e("Babel_Conv", new StringBuilder(String.valueOf(valueOf).length() + 64).append("creating conversation with ").append(valueOf).append(" resulting in null ConversationResult").toString(), new Object[0]);
            return;
        }
        int i;
        int i2;
        valueOf = "Babel_Conv";
        String str = "Switching conversation; clearing text. New id:";
        String valueOf2 = String.valueOf(fek.a);
        glk.c(valueOf, valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str), new Object[0]);
        bcc b = this.a.i.b();
        String str2 = fek.a;
        if (b != null) {
            i = b.b;
        } else {
            i = 0;
        }
        if (b != null) {
            i2 = b.c;
        } else {
            i2 = 0;
        }
        bcc bcc = new bcc(str2, i, i2);
        bcc.d = true;
        bcc.e = true;
        bcc.f = this.a.ab();
        this.a.X();
        cdr cdr = this.a;
        bcc.k = cdr.i.b().k;
        RealTimeChatService.b(cdr.aB);
        if (cdr.bs != null) {
            cdr.bs.a(bcc);
            cdr.bs = null;
        }
    }

    public void a(bko bko, String str) {
        b(bko, str, null);
    }

    public void a(bko bko, String str, Runnable runnable) {
        b(bko, str, runnable);
    }

    private void b(bko bko, String str, Runnable runnable) {
        String str2 = "closeConversation for conversation id = ";
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            valueOf = new String(str2);
        }
        if (!bko.equals(this.a.av) || !this.a.aP.containsKey(str)) {
            return;
        }
        if (this.a.aP.size() > 1) {
            for (String str22 : this.a.aP.keySet()) {
                if (!TextUtils.equals(str22, str)) {
                    bcc bcc = new bcc(str22, 1);
                    String str3 = "closeConversation: scheduleFragmentRestart ";
                    str22 = String.valueOf(str22);
                    if (str22.length() != 0) {
                        str3.concat(str22);
                    } else {
                        str22 = new String(str3);
                    }
                    cdr cdr = this.a;
                    bcc.k = cdr.i.b().k;
                    RealTimeChatService.b(cdr.aB);
                    if (cdr.bs != null) {
                        cdr.bs.a(bcc);
                        cdr.bs = null;
                        return;
                    }
                    return;
                }
            }
            iil.a("should never get here");
            return;
        }
        str22 = "closeConversation: closing conversation ";
        valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str22.concat(valueOf);
        } else {
            valueOf = new String(str22);
        }
        if (this.a.bs != null) {
            this.a.bs.a(str, runnable);
        }
    }

    public void a(String str, edo edo, boolean z) {
        bpd a = this.a.i.a();
        if (a != null && TextUtils.equals(a.a, str) && !this.a.av.b().a(edo) && !this.a.af() && this.a.T()) {
            if (this.a.i.k().a(edo)) {
                edk a2 = this.a.a(edo);
                if (a2 == null) {
                    return;
                }
                if (z) {
                    this.a.aY.a(a2, 2, true);
                    return;
                } else {
                    this.a.aY.b(a2, 2, true);
                    return;
                }
            }
            this.a.bo.add(new cgm(str, edo, z));
        }
    }

    public void a(int i, bko bko, fiu fiu) {
        evz c = fiu.c();
        if (c instanceof exh) {
            euw euw = (euw) c.c();
            if (euw.d && !euw.c) {
                cgc cgc = (cgc) this.a.aP.get(euw.e);
                if (cgc != null) {
                    cgc.e = -1;
                }
            }
        }
    }

    public void a(int i, bko bko, fok fok, fdo fdo) {
        if (fok instanceof euw) {
            euw euw = (euw) fok;
            if (euw.d && !euw.c) {
                cgc cgc = (cgc) this.a.aP.get(euw.e);
                if (cgc != null) {
                    this.a.Y();
                    cgc.e = -1;
                    glk.c("Babel_Conv", "message load timeout", new Object[0]);
                }
            }
        } else if ((fok instanceof eup) && ((eup) fok).k.equals(this.a.ae())) {
            this.a.P();
            this.a.getActivity().F_();
        }
    }

    public void a(bko bko, String str, edo edo, String str2, long j, boolean z) {
        bpd a = this.a.i.a();
        if (a != null && TextUtils.equals(a.a, str) && !this.a.av.b().a(edo) && !this.a.af() && this.a.T() && this.a.i.k().a(edo)) {
            edk a2 = this.a.a(edo);
            if (a2 != null) {
                if (z) {
                    this.a.aZ.put(edo, new cgp(str2));
                    this.a.aY.a(a2, 4, true);
                } else {
                    this.a.aZ.remove(edo);
                    this.a.aY.b(a2, 4, true);
                }
                if (glk.a("Babel_Conv", 3)) {
                    String valueOf = String.valueOf(edo);
                    glk.b("Babel_Conv", new StringBuilder(String.valueOf(valueOf).length() + 35).append("Typing status for ").append(valueOf).append(" changed to ").append(z).toString(), new Object[0]);
                }
                this.a.ba.removeCallbacks(this.a.bu);
                this.a.ba.post(this.a.bu);
                this.a.ba.postDelayed(this.a.bu, 31000);
            }
        }
    }

    public void c() {
        if (!this.a.af() && this.a.T()) {
            this.a.ac();
            ((bns) this.a.bH).notifyDataSetChanged();
        }
    }

    public void a(String str, List<edo> list) {
        bpd a = this.a.i.a();
        if (a != null && TextUtils.equals(a.a, str) && this.a.T()) {
            String str2;
            List list2;
            String str3 = "Babel_Conv";
            String str4 = "onUserHangoutPresenceChanged: handling %s participants";
            Object[] objArr = new Object[1];
            if (list == null) {
                str2 = "null";
            } else {
                str2 = String.valueOf(list.size());
            }
            objArr[0] = str2;
            glk.a(str3, String.format(str4, objArr), new Object[0]);
            if (list == null || list.isEmpty()) {
                list2 = null;
            } else {
                List arrayList = new ArrayList(list.size());
                for (edo edo : list) {
                    edk a2 = this.a.a(edo);
                    if (!(a2 == null || this.a.av.b().a(edo))) {
                        arrayList.add(a2);
                        str2 = String.valueOf(edo);
                        glk.a("Babel_Conv", new StringBuilder(String.valueOf(str2).length() + 36).append("onUserHangoutPresenceChanged: added ").append(str2).toString(), new Object[0]);
                    }
                }
                list2 = arrayList;
            }
            if (list2 == null || list2.isEmpty()) {
                this.a.bv.a();
                this.a.bv.setVisibility(8);
                glk.a("Babel_Conv", "onUserHangoutPresenceChanged: display no participants", new Object[0]);
                return;
            }
            this.a.bv.a(this.a.av, list2);
            this.a.bv.setVisibility(0);
            glk.a("Babel_Conv", "onUserHangoutPresenceChanged: display " + list2.size() + " participants", new Object[0]);
        }
    }

    public void a(bko bko, String str, edo edo, String str2) {
        bpd a = this.a.i.a();
        if (this.a.av == bko && a != null && TextUtils.equals(a.a, str) && !this.a.av.b().a(edo) && !this.a.af() && this.a.T()) {
            if (glk.a("Babel_Conv", 3)) {
                String valueOf = String.valueOf(edo);
                glk.b("Babel_Conv", new StringBuilder(((String.valueOf(str).length() + 60) + String.valueOf(valueOf).length()) + String.valueOf(str2).length()).append("Received easter egg for conversation: ").append(str).append(" from: ").append(valueOf).append(" with message: ").append(str2).toString(), new Object[0]);
            }
            if (this.a.bb != null) {
                this.a.bb.a(bko, str2);
            }
        }
    }

    public void a(String str, String str2) {
        bpd a = this.a.i.a();
        if (a != null && a.a != null) {
            if ((TextUtils.equals(str2, this.a.aG) || this.a.aP.containsKey(str)) && this.a.e == -1) {
                bcc bcc = new bcc(a.a, 1);
                bcc.d = true;
                bcc.e = true;
                cdr cdr = this.a;
                bcc.k = cdr.i.b().k;
                RealTimeChatService.b(cdr.aB);
                if (cdr.bs != null) {
                    cdr.bs.a(bcc);
                    cdr.bs = null;
                }
            }
        }
    }
}
