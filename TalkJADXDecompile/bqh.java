final class bqh implements bpr {
    final /* synthetic */ bqf a;

    bqh(bqf bqf) {
        this.a = bqf;
    }

    public void a(bjd bjd, int i) {
        boolean z = false;
        String str = "Babel_ConvCreator";
        String str2 = "Selected ";
        String valueOf = String.valueOf(bjd.toString());
        if (valueOf.length() != 0) {
            valueOf = str2.concat(valueOf);
        } else {
            valueOf = new String(str2);
        }
        glk.a(str, valueOf, new Object[0]);
        if (gwb.a(this.a.h, this.a.f)) {
            glk.a("Babel_ConvCreator", "Contact not added; invite needed", new Object[0]);
            bqf bqf;
            Object c;
            String str3;
            if (bjd instanceof bjo) {
                bjo bjo = (bjo) bjd;
                fcm a = ((fcn) this.a.d.a(fcn.class)).a(bjo.c());
                if (a.a()) {
                    bqf = this.a;
                    c = bjo.c();
                    bm.a(c, (Object) "Shouldn't attempt to send invite with null invite string");
                    str3 = "Babel_ConvCreator";
                    str = "Invite dialog shown or invite sent to ";
                    valueOf = String.valueOf(glk.b(c));
                    if (valueOf.length() != 0) {
                        valueOf = str.concat(valueOf);
                    } else {
                        valueOf = new String(str);
                    }
                    glk.a(str3, valueOf, new Object[0]);
                    ((dsi) bqf.d.a(dsi.class)).a(bqf.b, bqf.a.getFragmentManager(), bqf.h.e(), c, null, gwb.a(bqf.f));
                } else {
                    glk.a("Babel_ConvCreator", "Invite not sent because contact is unreachable", new Object[0]);
                    a.a(this.a.b, null, true);
                }
            } else {
                bqf = this.a;
                c = ((bje) bjd).c();
                bm.a(c, (Object) "Shouldn't attempt to send invite with null invite string");
                str3 = "Babel_ConvCreator";
                str = "Invite dialog shown or invite sent to ";
                valueOf = String.valueOf(glk.b(c));
                if (valueOf.length() != 0) {
                    valueOf = str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
                glk.a(str3, valueOf, new Object[0]);
                ((dsi) bqf.d.a(dsi.class)).a(bqf.b, bqf.a.getFragmentManager(), bqf.h.e(), c, null, gwb.a(bqf.f));
            }
        } else {
            if (this.a.f == bxt.SMS_MESSAGE) {
                iil.a("Can't add contact for SMS conversation without phone number", bjd instanceof bjo);
            } else if (this.a.f == bxt.AUDIO_CALL) {
                str = "Can't add contact for audio call without Gaia or phone number";
                boolean z2 = (bjd instanceof bjf) || (bjd instanceof bjo);
                iil.a(str, z2);
            } else {
                iil.a("Can't add contact for video call/Hangouts conversation without Gaia", bjd instanceof bjf);
            }
            glk.a("Babel_ConvCreator", "Contact added successfully", new Object[0]);
            if (!gwb.a(fde.e(this.a.g.a()), bnc.GROUP_CONVERSATIONS)) {
                this.a.e.g();
            }
            this.a.e.a(bcn.a(this.a.h, bjd.a(this.a.b, this.a.h.e())));
            z = true;
        }
        this.a.a(z, i);
    }

    public void a() {
        glk.a("Babel_ConvCreator", "Contact detail selection cancelled", new Object[0]);
        this.a.a(false, 0);
    }
}
