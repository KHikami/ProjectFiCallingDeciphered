package p000;

final class bqh implements bpr {
    final /* synthetic */ bqf f4236a;

    bqh(bqf bqf) {
        this.f4236a = bqf;
    }

    public void mo659a(bjd bjd, int i) {
        boolean z = false;
        String str = "Babel_ConvCreator";
        String str2 = "Selected ";
        String valueOf = String.valueOf(bjd.toString());
        if (valueOf.length() != 0) {
            valueOf = str2.concat(valueOf);
        } else {
            valueOf = new String(str2);
        }
        glk.m17970a(str, valueOf, new Object[0]);
        if (gwb.m1922a(this.f4236a.f4220h, this.f4236a.f4218f)) {
            glk.m17970a("Babel_ConvCreator", "Contact not added; invite needed", new Object[0]);
            bqf bqf;
            Object c;
            String str3;
            if (bjd instanceof bjo) {
                bjo bjo = (bjo) bjd;
                fcm a = ((fcn) this.f4236a.f4216d.m25443a(fcn.class)).mo1977a(bjo.m5473c());
                if (a.m14964a()) {
                    bqf = this.f4236a;
                    c = bjo.m5473c();
                    bm.m6123a(c, (Object) "Shouldn't attempt to send invite with null invite string");
                    str3 = "Babel_ConvCreator";
                    str = "Invite dialog shown or invite sent to ";
                    valueOf = String.valueOf(glk.m17974b(c));
                    if (valueOf.length() != 0) {
                        valueOf = str.concat(valueOf);
                    } else {
                        valueOf = new String(str);
                    }
                    glk.m17970a(str3, valueOf, new Object[0]);
                    ((dsi) bqf.f4216d.m25443a(dsi.class)).mo1660a(bqf.f4214b, bqf.f4213a.getFragmentManager(), bqf.f4220h.mo571e(), c, null, gwb.m1594a(bqf.f4218f));
                } else {
                    glk.m17970a("Babel_ConvCreator", "Invite not sent because contact is unreachable", new Object[0]);
                    a.m14963a(this.f4236a.f4214b, null, true);
                }
            } else {
                bqf = this.f4236a;
                c = ((bje) bjd).m5365c();
                bm.m6123a(c, (Object) "Shouldn't attempt to send invite with null invite string");
                str3 = "Babel_ConvCreator";
                str = "Invite dialog shown or invite sent to ";
                valueOf = String.valueOf(glk.m17974b(c));
                if (valueOf.length() != 0) {
                    valueOf = str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
                glk.m17970a(str3, valueOf, new Object[0]);
                ((dsi) bqf.f4216d.m25443a(dsi.class)).mo1660a(bqf.f4214b, bqf.f4213a.getFragmentManager(), bqf.f4220h.mo571e(), c, null, gwb.m1594a(bqf.f4218f));
            }
        } else {
            if (this.f4236a.f4218f == bxt.SMS_MESSAGE) {
                iil.m21874a("Can't add contact for SMS conversation without phone number", bjd instanceof bjo);
            } else if (this.f4236a.f4218f == bxt.AUDIO_CALL) {
                str = "Can't add contact for audio call without Gaia or phone number";
                boolean z2 = (bjd instanceof bjf) || (bjd instanceof bjo);
                iil.m21874a(str, z2);
            } else {
                iil.m21874a("Can't add contact for video call/Hangouts conversation without Gaia", bjd instanceof bjf);
            }
            glk.m17970a("Babel_ConvCreator", "Contact added successfully", new Object[0]);
            if (!gwb.m1923a(fde.m15018e(this.f4236a.f4219g.mo2317a()), bnc.GROUP_CONVERSATIONS)) {
                this.f4236a.f4217e.m4878g();
            }
            this.f4236a.f4217e.m4865a(bcn.m4887a(this.f4236a.f4220h, bjd.mo565a(this.f4236a.f4214b, this.f4236a.f4220h.mo571e())));
            z = true;
        }
        this.f4236a.m6431a(z, i);
    }

    public void mo658a() {
        glk.m17970a("Babel_ConvCreator", "Contact detail selection cancelled", new Object[0]);
        this.f4236a.m6431a(false, 0);
    }
}
