import android.content.Context;
import android.telecom.DisconnectCause;
import android.telecom.RemoteConnection;
import android.text.TextUtils;

final class gfm extends itg {
    final /* synthetic */ gfj a;

    gfm(gfj gfj) {
        this.a = gfj;
        super('\u0000');
    }

    public void j() {
        String valueOf = String.valueOf(this.a.c);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 40).append("TeleWifiCall.onOutgoingRingtoneStarted, ").append(valueOf).toString(), new Object[0]);
        if (this.a.c != null) {
            this.a.c.setRingbackRequested(true);
            this.a.c.y();
        }
    }

    public void c() {
        String valueOf = String.valueOf(this.a.c);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 40).append("TeleWifiCall.onOutgoingRingtoneStopped, ").append(valueOf).toString(), new Object[0]);
        if (this.a.c != null) {
            this.a.c.setRingbackRequested(false);
            this.a.c.y();
        }
    }

    public void a(iqo iqo) {
        String valueOf = String.valueOf(this.a.c);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 53).append("TeleWifiCall.onFirstEndpointWithEarlyMediaConnected, ").append(valueOf).toString(), new Object[0]);
        if (this.a.c != null) {
            this.a.c.setRingbackRequested(false);
            this.a.c.y();
        }
    }

    public void b(boolean z) {
        String valueOf = String.valueOf(this.a.c);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 58).append("TeleWifiCall.onOutgoingInviteEnded, terminateCall: ").append(z).append(", ").append(valueOf).toString(), new Object[0]);
        if (!z && this.a.c != null && this.a.c.getState() == 3) {
            this.a.c.setActive();
            this.a.c.y();
        }
    }

    public boolean c(int i) {
        String valueOf = String.valueOf(this.a.c);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 68).append("TeleWifiCall.maybeDisplayPstnEndpointExitError, error: ").append(i).append(", ").append(valueOf).toString(), new Object[0]);
        this.a.e = i;
        return true;
    }

    public void a(did did) {
        int O;
        int i;
        if (did != null) {
            O = did.O();
        } else {
            O = 10001;
        }
        String valueOf = String.valueOf(gwb.p(O));
        String valueOf2 = String.valueOf(this.a.c);
        glk.c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 41) + String.valueOf(valueOf2).length()).append("TeleWifiCall.onHangoutEnded, endCause: ").append(valueOf).append(", ").append(valueOf2).toString(), new Object[0]);
        gfj gfj = this.a;
        String valueOf3;
        if (!gwb.a(gfj.a, "babel_wifi_call_fallback_to_cellular_allowed", true)) {
            valueOf3 = String.valueOf(gfj.c);
            glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf3).length() + 73).append("TeleWifiCall.shouldFallbackToCellular, fallback to cellular not allowed, ").append(valueOf3).toString(), new Object[0]);
            i = 0;
        } else if (!gwb.a(gfj.a, "babel_remote_connection_allowed", true)) {
            valueOf3 = String.valueOf(gfj.c);
            glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf3).length() + 70).append("TeleWifiCall.shouldFallbackToCellular, remote connection not allowed, ").append(valueOf3).toString(), new Object[0]);
            i = 0;
        } else if (gfj.c == null) {
            glk.c("Babel_telephony", "TeleWifiCall.shouldFallbackToCellular, connection is null", new Object[0]);
            i = 0;
        } else if (gfj.c.getState() != 3) {
            r4 = gfj.c.getState();
            valueOf3 = String.valueOf(gfj.c);
            glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf3).length() + 62).append("TeleWifiCall.shouldFallbackToCellular, state is: ").append(r4).append(", ").append(valueOf3).toString(), new Object[0]);
            i = 0;
        } else if (gfj.c.q() != null) {
            valueOf3 = String.valueOf(gfj.c);
            glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf3).length() + 67).append("TeleWifiCall.shouldFallbackToCellular, already has a hangout room, ").append(valueOf3).toString(), new Object[0]);
            i = 0;
        } else if (gfj.d == null) {
            valueOf3 = String.valueOf(gfj.c);
            glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf3).length() + 62).append("TeleWifiCall.shouldFallbackToCellular, hangout state is null, ").append(valueOf3).toString(), new Object[0]);
            i = 0;
        } else if (O == 11004) {
            valueOf3 = String.valueOf(gfj.c);
            glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf3).length() + 57).append("TeleWifiCall.shouldFallbackToCellular, local user ended, ").append(valueOf3).toString(), new Object[0]);
            i = 0;
        } else if (gfj.e != 0) {
            r4 = gfj.e;
            valueOf3 = String.valueOf(gfj.c);
            glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf3).length() + 69).append("TeleWifiCall.shouldFallbackToCellular, PSTN error code: ").append(r4).append(", ").append(valueOf3).toString(), new Object[0]);
            i = 0;
        } else if (gfj.d.C()) {
            valueOf3 = String.valueOf(gfj.c);
            glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf3).length() + 55).append("TeleWifiCall.shouldFallbackToCellular, returning true, ").append(valueOf3).toString(), new Object[0]);
            boolean z = true;
        } else {
            valueOf3 = String.valueOf(gfj.c);
            glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf3).length() + 69).append("TeleWifiCall.shouldFallbackToCellular, not waiting for remote party, ").append(valueOf3).toString(), new Object[0]);
            i = 0;
        }
        if (i != 0) {
            gfj gfj2 = this.a;
            valueOf = String.valueOf(gfj2.c);
            glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 40).append("TeleWifiCall.attemptFallbackToCellular, ").append(valueOf).toString(), new Object[0]);
            gcq gcq = gfj2.c;
            Context d = gcq.d();
            gcq.f().a(1);
            RemoteConnection createRemoteOutgoingConnection = d.createRemoteOutgoingConnection(gwb.J(d), gcq.e());
            if (createRemoteOutgoingConnection == null) {
                valueOf = String.valueOf(gfj2.c);
                glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 76).append("TeleWifiCall.attemptFallbackToCellular, unable to create remote connection, ").append(valueOf).toString(), new Object[0]);
                gcq.f().a(2);
                i = 0;
            } else {
                gcq.b(new gel(gfj2.a, createRemoteOutgoingConnection, null, null, gfj2.c.i(), gcq.g()));
                gcq.y();
                z = true;
            }
            if (i != 0) {
                this.a.a(null);
                return;
            }
        }
        if (this.a.e == 8 || (O == 11011 && this.a.e != 0)) {
            DisconnectCause disconnectCause;
            gfj gfj3 = this.a;
            gfj = this.a;
            int i2 = this.a.e;
            valueOf = String.valueOf(gwb.p(O));
            valueOf2 = String.valueOf(gwb.t(i2));
            valueOf2 = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append(" ").append(valueOf2).toString();
            CharSequence o = gwb.o(gfj.a, i2);
            if (i2 == 8) {
                disconnectCause = new DisconnectCause(7, o, null, valueOf2, 17);
            } else {
                disconnectCause = new DisconnectCause(1, o, null, valueOf2, 21);
            }
            gfj3.a(disconnectCause);
            return;
        }
        this.a.a(this.a.d(O));
    }

    public void a(iqs iqs) {
        if (this.a.c != null) {
            String a = iqs.a();
            String valueOf = String.valueOf(gwb.G(null));
            String valueOf2 = String.valueOf(this.a.c);
            glk.c("Babel_telephony", new StringBuilder(((String.valueOf(valueOf).length() + 63) + String.valueOf(a).length()) + String.valueOf(valueOf2).length()).append("TeleWifiCall.onMucConnected, handoffNumber: ").append(valueOf).append(", participantId: ").append(a).append(", ").append(valueOf2).toString(), new Object[0]);
            this.a.c.a(null);
            this.a.c.e(a);
            this.a.c.c(this.a.d.e().g());
            this.a.c.d(this.a.d.p().e());
            if (this.a.c != null && TextUtils.isEmpty(this.a.c.n())) {
                gfj gfj = this.a;
                glk.c("Babel_telephony", "TeleWifiCall.requestOutOfBandHandoffNumber", new Object[0]);
                Object a2 = gwb.a(gfj.c);
                if (!TextUtils.isEmpty(a2)) {
                    fit fit = (fit) jyn.a(gfj.a, fit.class);
                    if (gfj.i == null) {
                        gfj.i = new gfl(gfj);
                        fit.a(gfj.i);
                    }
                    bko e = fde.e(gfj.c.p());
                    gfj.j = ((fmf) jyn.a(gfj.a, fmf.class)).a().a();
                    bhm gcb = new gcb(e, gfj.c.q(), gfj.c.s(), a2);
                    gcb.b(gfj.j);
                    ((bhl) jyn.a(gfj.a, bhl.class)).a(gcb);
                }
            }
        }
    }

    public void a(itk itk) {
        if (!(this.a.g != null || this.a.d == null || this.a.d.p() == null)) {
            this.a.g = this.a.d.p().f();
            this.a.d.p().i().a(this.a.c.h().c());
            if (this.a.b != null) {
                this.a.d.p().i().a(2, this.a.b);
            }
        }
        String valueOf = String.valueOf(this.a.c);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 25).append("TeleWifiCall.onCallJoin, ").append(valueOf).toString(), new Object[0]);
        if (!this.a.f && this.a.c != null && this.a.c.getState() == 3) {
            this.a.c.setActive();
        }
    }

    public void b(itl itl) {
        glk.c("Babel_telephony", "TeleWifiCall.onParticipantAdded, isLocalUser: " + itl.f(), new Object[0]);
        if (!itl.f() && this.a.c != null) {
            this.a.c.y();
        }
    }

    public void a(mav mav) {
        if (this.a.h != null) {
            mav.n = new String[]{this.a.h.a()};
        }
    }

    public void a(lkq lkq) {
        if (lkq.d.length != 0) {
            String valueOf;
            String valueOf2;
            String valueOf3;
            String valueOf4;
            String valueOf5;
            String valueOf6;
            lkt lkt = lkq.d[0];
            int a = gwb.a(lkt.a);
            int a2 = gwb.a(lkt.k);
            if (a2 == 1 && a == 1) {
                valueOf = String.valueOf(lkt.i);
                valueOf2 = String.valueOf(lkt.j);
                valueOf3 = String.valueOf(lkt.b);
                valueOf4 = String.valueOf(lkt.e);
                valueOf5 = String.valueOf(lkt.x);
                valueOf6 = String.valueOf(lkt.z);
                String valueOf7 = String.valueOf(lkt.n);
                String valueOf8 = String.valueOf(lkt.aa);
                String valueOf9 = String.valueOf(lkt.ab);
                glk.c("Babel_telephony", new StringBuilder(((((((((String.valueOf(valueOf).length() + 286) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()) + String.valueOf(valueOf7).length()) + String.valueOf(valueOf8).length()) + String.valueOf(valueOf9).length()).append("TeleWifiCall.onMediaStats, Voice receiver stats\nmediaStats bytes_rcvd: ").append(valueOf).append("\nmediaStats packets_rcvd:").append(valueOf2).append("\nmediaStats fraction_lost:").append(valueOf3).append("\nmediaStats jitter_ms:").append(valueOf4).append("\nmediaStats jitter_buffer_ms:").append(valueOf5).append("\nmediaStats delay_estimate_ms: ").append(valueOf6).append("\nmediaStats audio_level:").append(valueOf7).append("\nmediaStats expand_rate: ").append(valueOf8).append("\nmediaStats speech_expand_rate: ").append(valueOf9).append("\n").toString(), new Object[0]);
            }
            if (a2 == 0 && a == 1) {
                valueOf = String.valueOf(lkt.g);
                valueOf2 = String.valueOf(lkt.h);
                valueOf3 = String.valueOf(lkt.b);
                valueOf4 = String.valueOf(lkt.f);
                valueOf5 = String.valueOf(lkt.e);
                valueOf6 = String.valueOf(lkt.n);
                glk.c("Babel_telephony", new StringBuilder((((((String.valueOf(valueOf).length() + 191) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()).append("TeleWifiCall.onMediaStats, Voice sender stats\nmediaStats bytes_sent: ").append(valueOf).append("\nmediaStats packets_sent: ").append(valueOf2).append("\nmediaStats fraction_lost: ").append(valueOf3).append("\nmediaStats rtt_ms: ").append(valueOf4).append("\nmediaStats jitter_ms: ").append(valueOf5).append("\nmediaStats audio_level: ").append(valueOf6).append("\n").toString(), new Object[0]);
            }
            if (a2 == 2 && a == 2) {
                String valueOf10 = String.valueOf(lkt.B);
                String valueOf11 = String.valueOf(lkt.A);
                glk.c("Babel_telephony", new StringBuilder((String.valueOf(valueOf10).length() + 125) + String.valueOf(valueOf11).length()).append("TeleWifiCall.onMediaStats, Voice connection stats\nmediaStats available_receive_bitrate: ").append(valueOf10).append("\nmediaStats available_send_bitrate: ").append(valueOf11).append("\n").toString(), new Object[0]);
            }
        }
    }

    public void a(itm itm) {
        int i = 5;
        if (this.a.d != null && this.a.c != null) {
            lkl b = itm.b();
            if (b != null && b.b != null && b.a.equals(Integer.valueOf(0))) {
                gfj gfj = this.a;
                if (b.b.equals(Integer.valueOf(1))) {
                    i = 6;
                    gwb.f(2872);
                } else if (b.b.equals(Integer.valueOf(0))) {
                    gwb.f(2870);
                } else if (b.b.equals(Integer.valueOf(2))) {
                    i = 7;
                    gwb.f(2874);
                } else if (b.b.equals(Integer.valueOf(5))) {
                    i = 9;
                    gwb.f(2868);
                } else if (b.b.equals(Integer.valueOf(4))) {
                    i = 8;
                } else {
                    i = 8;
                }
                gfj.c(i);
                gdc.a(this.a.a, this.a.c, i);
            }
        }
    }
}
