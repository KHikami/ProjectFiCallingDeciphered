package p000;

import android.content.Context;
import android.telecom.DisconnectCause;
import android.telecom.RemoteConnection;
import android.text.TextUtils;

final class gfm extends itg {
    final /* synthetic */ gfj f15166a;

    gfm(gfj gfj) {
        this.f15166a = gfj;
        super('\u0000');
    }

    public void mo2259j() {
        String valueOf = String.valueOf(this.f15166a.f15143c);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 40).append("TeleWifiCall.onOutgoingRingtoneStarted, ").append(valueOf).toString(), new Object[0]);
        if (this.f15166a.f15143c != null) {
            this.f15166a.f15143c.setRingbackRequested(true);
            this.f15166a.f15143c.m16978y();
        }
    }

    public void mo1558c() {
        String valueOf = String.valueOf(this.f15166a.f15143c);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 40).append("TeleWifiCall.onOutgoingRingtoneStopped, ").append(valueOf).toString(), new Object[0]);
        if (this.f15166a.f15143c != null) {
            this.f15166a.f15143c.setRingbackRequested(false);
            this.f15166a.f15143c.m16978y();
        }
    }

    public void mo1571a(iqo iqo) {
        String valueOf = String.valueOf(this.f15166a.f15143c);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 53).append("TeleWifiCall.onFirstEndpointWithEarlyMediaConnected, ").append(valueOf).toString(), new Object[0]);
        if (this.f15166a.f15143c != null) {
            this.f15166a.f15143c.setRingbackRequested(false);
            this.f15166a.f15143c.m16978y();
        }
    }

    public void mo2258b(boolean z) {
        String valueOf = String.valueOf(this.f15166a.f15143c);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 58).append("TeleWifiCall.onOutgoingInviteEnded, terminateCall: ").append(z).append(", ").append(valueOf).toString(), new Object[0]);
        if (!z && this.f15166a.f15143c != null && this.f15166a.f15143c.getState() == 3) {
            this.f15166a.f15143c.setActive();
            this.f15166a.f15143c.m16978y();
        }
    }

    public boolean mo1569c(int i) {
        String valueOf = String.valueOf(this.f15166a.f15143c);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 68).append("TeleWifiCall.maybeDisplayPstnEndpointExitError, error: ").append(i).append(", ").append(valueOf).toString(), new Object[0]);
        this.f15166a.f15145e = i;
        return true;
    }

    public void mo1567a(did did) {
        int O;
        int i;
        if (did != null) {
            O = did.m11949O();
        } else {
            O = 10001;
        }
        String valueOf = String.valueOf(gwb.m2324p(O));
        String valueOf2 = String.valueOf(this.f15166a.f15143c);
        glk.m17979c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 41) + String.valueOf(valueOf2).length()).append("TeleWifiCall.onHangoutEnded, endCause: ").append(valueOf).append(", ").append(valueOf2).toString(), new Object[0]);
        gfj gfj = this.f15166a;
        String valueOf3;
        if (!gwb.m1906a(gfj.f15141a, "babel_wifi_call_fallback_to_cellular_allowed", true)) {
            valueOf3 = String.valueOf(gfj.f15143c);
            glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf3).length() + 73).append("TeleWifiCall.shouldFallbackToCellular, fallback to cellular not allowed, ").append(valueOf3).toString(), new Object[0]);
            i = 0;
        } else if (!gwb.m1906a(gfj.f15141a, "babel_remote_connection_allowed", true)) {
            valueOf3 = String.valueOf(gfj.f15143c);
            glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf3).length() + 70).append("TeleWifiCall.shouldFallbackToCellular, remote connection not allowed, ").append(valueOf3).toString(), new Object[0]);
            i = 0;
        } else if (gfj.f15143c == null) {
            glk.m17979c("Babel_telephony", "TeleWifiCall.shouldFallbackToCellular, connection is null", new Object[0]);
            i = 0;
        } else if (gfj.f15143c.getState() != 3) {
            r4 = gfj.f15143c.getState();
            valueOf3 = String.valueOf(gfj.f15143c);
            glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf3).length() + 62).append("TeleWifiCall.shouldFallbackToCellular, state is: ").append(r4).append(", ").append(valueOf3).toString(), new Object[0]);
            i = 0;
        } else if (gfj.f15143c.m16970q() != null) {
            valueOf3 = String.valueOf(gfj.f15143c);
            glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf3).length() + 67).append("TeleWifiCall.shouldFallbackToCellular, already has a hangout room, ").append(valueOf3).toString(), new Object[0]);
            i = 0;
        } else if (gfj.f15144d == null) {
            valueOf3 = String.valueOf(gfj.f15143c);
            glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf3).length() + 62).append("TeleWifiCall.shouldFallbackToCellular, hangout state is null, ").append(valueOf3).toString(), new Object[0]);
            i = 0;
        } else if (O == 11004) {
            valueOf3 = String.valueOf(gfj.f15143c);
            glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf3).length() + 57).append("TeleWifiCall.shouldFallbackToCellular, local user ended, ").append(valueOf3).toString(), new Object[0]);
            i = 0;
        } else if (gfj.f15145e != 0) {
            r4 = gfj.f15145e;
            valueOf3 = String.valueOf(gfj.f15143c);
            glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf3).length() + 69).append("TeleWifiCall.shouldFallbackToCellular, PSTN error code: ").append(r4).append(", ").append(valueOf3).toString(), new Object[0]);
            i = 0;
        } else if (gfj.f15144d.m11940C()) {
            valueOf3 = String.valueOf(gfj.f15143c);
            glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf3).length() + 55).append("TeleWifiCall.shouldFallbackToCellular, returning true, ").append(valueOf3).toString(), new Object[0]);
            boolean z = true;
        } else {
            valueOf3 = String.valueOf(gfj.f15143c);
            glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf3).length() + 69).append("TeleWifiCall.shouldFallbackToCellular, not waiting for remote party, ").append(valueOf3).toString(), new Object[0]);
            i = 0;
        }
        if (i != 0) {
            gfj gfj2 = this.f15166a;
            valueOf = String.valueOf(gfj2.f15143c);
            glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 40).append("TeleWifiCall.attemptFallbackToCellular, ").append(valueOf).toString(), new Object[0]);
            gcq gcq = gfj2.f15143c;
            Context d = gcq.m16955d();
            gcq.m16959f().m17136a(1);
            RemoteConnection createRemoteOutgoingConnection = d.createRemoteOutgoingConnection(gwb.m1409J(d), gcq.m16957e());
            if (createRemoteOutgoingConnection == null) {
                valueOf = String.valueOf(gfj2.f15143c);
                glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 76).append("TeleWifiCall.attemptFallbackToCellular, unable to create remote connection, ").append(valueOf).toString(), new Object[0]);
                gcq.m16959f().m17136a(2);
                i = 0;
            } else {
                gcq.m16948b(new gel(gfj2.f15141a, createRemoteOutgoingConnection, null, null, gfj2.f15143c.m16962i(), gcq.m16960g()));
                gcq.m16978y();
                z = true;
            }
            if (i != 0) {
                this.f15166a.m17521a(null);
                return;
            }
        }
        if (this.f15166a.f15145e == 8 || (O == 11011 && this.f15166a.f15145e != 0)) {
            DisconnectCause disconnectCause;
            gfj gfj3 = this.f15166a;
            gfj = this.f15166a;
            int i2 = this.f15166a.f15145e;
            valueOf = String.valueOf(gwb.m2324p(O));
            valueOf2 = String.valueOf(gwb.m2355t(i2));
            valueOf2 = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append(" ").append(valueOf2).toString();
            CharSequence o = gwb.m2315o(gfj.f15141a, i2);
            if (i2 == 8) {
                disconnectCause = new DisconnectCause(7, o, null, valueOf2, 17);
            } else {
                disconnectCause = new DisconnectCause(1, o, null, valueOf2, 21);
            }
            gfj3.m17521a(disconnectCause);
            return;
        }
        this.f15166a.m17521a(this.f15166a.m17539d(O));
    }

    public void mo2257a(iqs iqs) {
        if (this.f15166a.f15143c != null) {
            String a = iqs.m22949a();
            String valueOf = String.valueOf(gwb.m1397G(null));
            String valueOf2 = String.valueOf(this.f15166a.f15143c);
            glk.m17979c("Babel_telephony", new StringBuilder(((String.valueOf(valueOf).length() + 63) + String.valueOf(a).length()) + String.valueOf(valueOf2).length()).append("TeleWifiCall.onMucConnected, handoffNumber: ").append(valueOf).append(", participantId: ").append(a).append(", ").append(valueOf2).toString(), new Object[0]);
            this.f15166a.f15143c.m16945a(null);
            this.f15166a.f15143c.m16958e(a);
            this.f15166a.f15143c.m16953c(this.f15166a.f15144d.m11981e().m11897g());
            this.f15166a.f15143c.m16956d(this.f15166a.f15144d.m11994p().m22132e());
            if (this.f15166a.f15143c != null && TextUtils.isEmpty(this.f15166a.f15143c.m16967n())) {
                gfj gfj = this.f15166a;
                glk.m17979c("Babel_telephony", "TeleWifiCall.requestOutOfBandHandoffNumber", new Object[0]);
                Object a2 = gwb.m1662a(gfj.f15143c);
                if (!TextUtils.isEmpty(a2)) {
                    fit fit = (fit) jyn.m25426a(gfj.f15141a, fit.class);
                    if (gfj.f15149i == null) {
                        gfj.f15149i = new gfl(gfj);
                        fit.mo2007a(gfj.f15149i);
                    }
                    bko e = fde.m15018e(gfj.f15143c.m16969p());
                    gfj.f15150j = ((fmf) jyn.m25426a(gfj.f15141a, fmf.class)).mo2035a().m15674a();
                    bhm gcb = new gcb(e, gfj.f15143c.m16970q(), gfj.f15143c.m16972s(), a2);
                    gcb.m8042b(gfj.f15150j);
                    ((bhl) jyn.m25426a(gfj.f15141a, bhl.class)).mo550a(gcb);
                }
            }
        }
    }

    public void mo1386a(itk itk) {
        if (!(this.f15166a.f15147g != null || this.f15166a.f15144d == null || this.f15166a.f15144d.m11994p() == null)) {
            this.f15166a.f15147g = this.f15166a.f15144d.m11994p().m22134f();
            this.f15166a.f15144d.m11994p().m22137i().m22157a(this.f15166a.f15143c.m16961h().m17121c());
            if (this.f15166a.f15142b != null) {
                this.f15166a.f15144d.m11994p().m22137i().m22158a(2, this.f15166a.f15142b);
            }
        }
        String valueOf = String.valueOf(this.f15166a.f15143c);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 25).append("TeleWifiCall.onCallJoin, ").append(valueOf).toString(), new Object[0]);
        if (!this.f15166a.f15146f && this.f15166a.f15143c != null && this.f15166a.f15143c.getState() == 3) {
            this.f15166a.f15143c.setActive();
        }
    }

    public void mo1546b(itl itl) {
        glk.m17979c("Babel_telephony", "TeleWifiCall.onParticipantAdded, isLocalUser: " + itl.m23242f(), new Object[0]);
        if (!itl.m23242f() && this.f15166a.f15143c != null) {
            this.f15166a.f15143c.m16978y();
        }
    }

    public void mo1543a(mav mav) {
        if (this.f15166a.f15148h != null) {
            mav.f27171n = new String[]{this.f15166a.f15148h.m16992a()};
        }
    }

    public void mo1542a(lkq lkq) {
        if (lkq.f25183d.length != 0) {
            String valueOf;
            String valueOf2;
            String valueOf3;
            String valueOf4;
            String valueOf5;
            String valueOf6;
            lkt lkt = lkq.f25183d[0];
            int a = gwb.m1507a(lkt.f25242a);
            int a2 = gwb.m1507a(lkt.f25252k);
            if (a2 == 1 && a == 1) {
                valueOf = String.valueOf(lkt.f25250i);
                valueOf2 = String.valueOf(lkt.f25251j);
                valueOf3 = String.valueOf(lkt.f25243b);
                valueOf4 = String.valueOf(lkt.f25246e);
                valueOf5 = String.valueOf(lkt.f25265x);
                valueOf6 = String.valueOf(lkt.f25267z);
                String valueOf7 = String.valueOf(lkt.f25255n);
                String valueOf8 = String.valueOf(lkt.aa);
                String valueOf9 = String.valueOf(lkt.ab);
                glk.m17979c("Babel_telephony", new StringBuilder(((((((((String.valueOf(valueOf).length() + 286) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()) + String.valueOf(valueOf7).length()) + String.valueOf(valueOf8).length()) + String.valueOf(valueOf9).length()).append("TeleWifiCall.onMediaStats, Voice receiver stats\nmediaStats bytes_rcvd: ").append(valueOf).append("\nmediaStats packets_rcvd:").append(valueOf2).append("\nmediaStats fraction_lost:").append(valueOf3).append("\nmediaStats jitter_ms:").append(valueOf4).append("\nmediaStats jitter_buffer_ms:").append(valueOf5).append("\nmediaStats delay_estimate_ms: ").append(valueOf6).append("\nmediaStats audio_level:").append(valueOf7).append("\nmediaStats expand_rate: ").append(valueOf8).append("\nmediaStats speech_expand_rate: ").append(valueOf9).append("\n").toString(), new Object[0]);
            }
            if (a2 == 0 && a == 1) {
                valueOf = String.valueOf(lkt.f25248g);
                valueOf2 = String.valueOf(lkt.f25249h);
                valueOf3 = String.valueOf(lkt.f25243b);
                valueOf4 = String.valueOf(lkt.f25247f);
                valueOf5 = String.valueOf(lkt.f25246e);
                valueOf6 = String.valueOf(lkt.f25255n);
                glk.m17979c("Babel_telephony", new StringBuilder((((((String.valueOf(valueOf).length() + 191) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()).append("TeleWifiCall.onMediaStats, Voice sender stats\nmediaStats bytes_sent: ").append(valueOf).append("\nmediaStats packets_sent: ").append(valueOf2).append("\nmediaStats fraction_lost: ").append(valueOf3).append("\nmediaStats rtt_ms: ").append(valueOf4).append("\nmediaStats jitter_ms: ").append(valueOf5).append("\nmediaStats audio_level: ").append(valueOf6).append("\n").toString(), new Object[0]);
            }
            if (a2 == 2 && a == 2) {
                String valueOf10 = String.valueOf(lkt.f25217B);
                String valueOf11 = String.valueOf(lkt.f25216A);
                glk.m17979c("Babel_telephony", new StringBuilder((String.valueOf(valueOf10).length() + 125) + String.valueOf(valueOf11).length()).append("TeleWifiCall.onMediaStats, Voice connection stats\nmediaStats available_receive_bitrate: ").append(valueOf10).append("\nmediaStats available_send_bitrate: ").append(valueOf11).append("\n").toString(), new Object[0]);
            }
        }
    }

    public void mo1540a(itm itm) {
        int i = 5;
        if (this.f15166a.f15144d != null && this.f15166a.f15143c != null) {
            lkl b = itm.m23256b();
            if (b != null && b.f25153b != null && b.f25152a.equals(Integer.valueOf(0))) {
                gfj gfj = this.f15166a;
                if (b.f25153b.equals(Integer.valueOf(1))) {
                    i = 6;
                    gwb.m2198f(2872);
                } else if (b.f25153b.equals(Integer.valueOf(0))) {
                    gwb.m2198f(2870);
                } else if (b.f25153b.equals(Integer.valueOf(2))) {
                    i = 7;
                    gwb.m2198f(2874);
                } else if (b.f25153b.equals(Integer.valueOf(5))) {
                    i = 9;
                    gwb.m2198f(2868);
                } else if (b.f25153b.equals(Integer.valueOf(4))) {
                    i = 8;
                } else {
                    i = 8;
                }
                gfj.m17536c(i);
                gdc.m17020a(this.f15166a.f15141a, this.f15166a.f15143c, i);
            }
        }
    }
}
