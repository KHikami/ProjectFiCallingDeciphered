package p000;

import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;

final class cgn extends fip {
    final /* synthetic */ cdr f5258a;

    cgn(cdr cdr) {
        this.f5258a = cdr;
    }

    public void mo920a() {
        this.f5258a.m7423v();
    }

    public void mo929b() {
        this.f5258a.m7423v();
    }

    public void mo650a(int i, bko bko, fek fek, fiu fiu) {
        if (i == this.f5258a.f5102e) {
            m7528a(fek);
        }
    }

    public void mo921a(int i, bko bko, fek fek, fiu fiu, String str) {
        if (glk.m17973a("Babel_Conv", 3)) {
            String valueOf = String.valueOf(fek.f12913a);
            String valueOf2 = String.valueOf(bko);
            glk.m17970a("Babel_Conv", new StringBuilder(((String.valueOf(valueOf).length() + 70) + String.valueOf(str).length()) + String.valueOf(valueOf2).length()).append("Forked a new conversation ").append(valueOf).append(" from an existing conversation ").append(str).append(" for account ").append(valueOf2).toString(), new Object[0]);
        }
        if (bko.equals(this.f5258a.av)) {
            m7528a(fek);
        }
    }

    private void m7528a(fek fek) {
        if (fek == null) {
            String valueOf = String.valueOf(this.f5258a.f5106i.mo931a().f4153h);
            glk.m17982e("Babel_Conv", new StringBuilder(String.valueOf(valueOf).length() + 64).append("creating conversation with ").append(valueOf).append(" resulting in null ConversationResult").toString(), new Object[0]);
            return;
        }
        int i;
        int i2;
        valueOf = "Babel_Conv";
        String str = "Switching conversation; clearing text. New id:";
        String valueOf2 = String.valueOf(fek.f12913a);
        glk.m17979c(valueOf, valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str), new Object[0]);
        bcc b = this.f5258a.f5106i.mo940b();
        String str2 = fek.f12913a;
        if (b != null) {
            i = b.f2976b;
        } else {
            i = 0;
        }
        if (b != null) {
            i2 = b.f2977c;
        } else {
            i2 = 0;
        }
        bcc bcc = new bcc(str2, i, i2);
        bcc.f2978d = true;
        bcc.f2979e = true;
        bcc.f2980f = this.f5258a.ab();
        this.f5258a.m7369X();
        cdr cdr = this.f5258a;
        bcc.f2985k = cdr.f5106i.mo940b().f2985k;
        RealTimeChatService.m9077b(cdr.aB);
        if (cdr.bs != null) {
            cdr.bs.mo1164a(bcc);
            cdr.bs = null;
        }
    }

    public void mo922a(bko bko, String str) {
        m7529b(bko, str, null);
    }

    public void mo925a(bko bko, String str, Runnable runnable) {
        m7529b(bko, str, runnable);
    }

    private void m7529b(bko bko, String str, Runnable runnable) {
        String str2 = "closeConversation for conversation id = ";
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            valueOf = new String(str2);
        }
        if (!bko.equals(this.f5258a.av) || !this.f5258a.aP.containsKey(str)) {
            return;
        }
        if (this.f5258a.aP.size() > 1) {
            for (String str22 : this.f5258a.aP.keySet()) {
                if (!TextUtils.equals(str22, str)) {
                    bcc bcc = new bcc(str22, 1);
                    String str3 = "closeConversation: scheduleFragmentRestart ";
                    str22 = String.valueOf(str22);
                    if (str22.length() != 0) {
                        str3.concat(str22);
                    } else {
                        str22 = new String(str3);
                    }
                    cdr cdr = this.f5258a;
                    bcc.f2985k = cdr.f5106i.mo940b().f2985k;
                    RealTimeChatService.m9077b(cdr.aB);
                    if (cdr.bs != null) {
                        cdr.bs.mo1164a(bcc);
                        cdr.bs = null;
                        return;
                    }
                    return;
                }
            }
            iil.m21870a("should never get here");
            return;
        }
        str22 = "closeConversation: closing conversation ";
        valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str22.concat(valueOf);
        } else {
            valueOf = new String(str22);
        }
        if (this.f5258a.bs != null) {
            this.f5258a.bs.mo1167a(str, runnable);
        }
    }

    public void mo926a(String str, edo edo, boolean z) {
        bpd a = this.f5258a.f5106i.mo931a();
        if (a != null && TextUtils.equals(a.f4146a, str) && !this.f5258a.av.m5632b().m13608a(edo) && !this.f5258a.af() && this.f5258a.m7366T()) {
            if (this.f5258a.f5106i.mo954k().m5588a(edo)) {
                edk a2 = this.f5258a.mo833a(edo);
                if (a2 == null) {
                    return;
                }
                if (z) {
                    this.f5258a.aY.m9574a(a2, 2, true);
                    return;
                } else {
                    this.f5258a.aY.m9587b(a2, 2, true);
                    return;
                }
            }
            this.f5258a.bo.add(new cgm(str, edo, z));
        }
    }

    public void mo610a(int i, bko bko, fiu fiu) {
        evz c = fiu.m15392c();
        if (c instanceof exh) {
            euw euw = (euw) c.m8129c();
            if (euw.f12320d && !euw.f12319c) {
                cgc cgc = (cgc) this.f5258a.aP.get(euw.e);
                if (cgc != null) {
                    cgc.f5235e = -1;
                }
            }
        }
    }

    public void mo640a(int i, bko bko, fok fok, fdo fdo) {
        if (fok instanceof euw) {
            euw euw = (euw) fok;
            if (euw.f12320d && !euw.f12319c) {
                cgc cgc = (cgc) this.f5258a.aP.get(euw.e);
                if (cgc != null) {
                    this.f5258a.m7370Y();
                    cgc.f5235e = -1;
                    glk.m17979c("Babel_Conv", "message load timeout", new Object[0]);
                }
            }
        } else if ((fok instanceof eup) && ((eup) fok).f12309k.equals(this.f5258a.ae())) {
            this.f5258a.mo830P();
            this.f5258a.getActivity().F_();
        }
    }

    public void mo924a(bko bko, String str, edo edo, String str2, long j, boolean z) {
        bpd a = this.f5258a.f5106i.mo931a();
        if (a != null && TextUtils.equals(a.f4146a, str) && !this.f5258a.av.m5632b().m13608a(edo) && !this.f5258a.af() && this.f5258a.m7366T() && this.f5258a.f5106i.mo954k().m5588a(edo)) {
            edk a2 = this.f5258a.mo833a(edo);
            if (a2 != null) {
                if (z) {
                    this.f5258a.aZ.put(edo, new cgp(str2));
                    this.f5258a.aY.m9574a(a2, 4, true);
                } else {
                    this.f5258a.aZ.remove(edo);
                    this.f5258a.aY.m9587b(a2, 4, true);
                }
                if (glk.m17973a("Babel_Conv", 3)) {
                    String valueOf = String.valueOf(edo);
                    glk.m17976b("Babel_Conv", new StringBuilder(String.valueOf(valueOf).length() + 35).append("Typing status for ").append(valueOf).append(" changed to ").append(z).toString(), new Object[0]);
                }
                this.f5258a.ba.removeCallbacks(this.f5258a.bu);
                this.f5258a.ba.post(this.f5258a.bu);
                this.f5258a.ba.postDelayed(this.f5258a.bu, 31000);
            }
        }
    }

    public void mo930c() {
        if (!this.f5258a.af() && this.f5258a.m7366T()) {
            this.f5258a.ac();
            ((bns) this.f5258a.bH).notifyDataSetChanged();
        }
    }

    public void mo928a(String str, List<edo> list) {
        bpd a = this.f5258a.f5106i.mo931a();
        if (a != null && TextUtils.equals(a.f4146a, str) && this.f5258a.m7366T()) {
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
            glk.m17970a(str3, String.format(str4, objArr), new Object[0]);
            if (list == null || list.isEmpty()) {
                list2 = null;
            } else {
                List arrayList = new ArrayList(list.size());
                for (edo edo : list) {
                    edk a2 = this.f5258a.mo833a(edo);
                    if (!(a2 == null || this.f5258a.av.m5632b().m13608a(edo))) {
                        arrayList.add(a2);
                        str2 = String.valueOf(edo);
                        glk.m17970a("Babel_Conv", new StringBuilder(String.valueOf(str2).length() + 36).append("onUserHangoutPresenceChanged: added ").append(str2).toString(), new Object[0]);
                    }
                }
                list2 = arrayList;
            }
            if (list2 == null || list2.isEmpty()) {
                this.f5258a.bv.m9397a();
                this.f5258a.bv.setVisibility(8);
                glk.m17970a("Babel_Conv", "onUserHangoutPresenceChanged: display no participants", new Object[0]);
                return;
            }
            this.f5258a.bv.m9398a(this.f5258a.av, list2);
            this.f5258a.bv.setVisibility(0);
            glk.m17970a("Babel_Conv", "onUserHangoutPresenceChanged: display " + list2.size() + " participants", new Object[0]);
        }
    }

    public void mo923a(bko bko, String str, edo edo, String str2) {
        bpd a = this.f5258a.f5106i.mo931a();
        if (this.f5258a.av == bko && a != null && TextUtils.equals(a.f4146a, str) && !this.f5258a.av.m5632b().m13608a(edo) && !this.f5258a.af() && this.f5258a.m7366T()) {
            if (glk.m17973a("Babel_Conv", 3)) {
                String valueOf = String.valueOf(edo);
                glk.m17976b("Babel_Conv", new StringBuilder(((String.valueOf(str).length() + 60) + String.valueOf(valueOf).length()) + String.valueOf(str2).length()).append("Received easter egg for conversation: ").append(str).append(" from: ").append(valueOf).append(" with message: ").append(str2).toString(), new Object[0]);
            }
            if (this.f5258a.bb != null) {
                this.f5258a.bb.m9388a(bko, str2);
            }
        }
    }

    public void mo927a(String str, String str2) {
        bpd a = this.f5258a.f5106i.mo931a();
        if (a != null && a.f4146a != null) {
            if ((TextUtils.equals(str2, this.f5258a.aG) || this.f5258a.aP.containsKey(str)) && this.f5258a.f5102e == -1) {
                bcc bcc = new bcc(a.f4146a, 1);
                bcc.f2978d = true;
                bcc.f2979e = true;
                cdr cdr = this.f5258a;
                bcc.f2985k = cdr.f5106i.mo940b().f2985k;
                RealTimeChatService.m9077b(cdr.aB);
                if (cdr.bs != null) {
                    cdr.bs.mo1164a(bcc);
                    cdr.bs = null;
                }
            }
        }
    }
}
