package defpackage;

import android.text.TextUtils;
import com.google.android.apps.hangouts.hangout.DebugOverlayTextView;

/* renamed from: dhb */
public final class dhb extends itg {
    final /* synthetic */ DebugOverlayTextView a;

    public dhb(DebugOverlayTextView debugOverlayTextView) {
        this.a = debugOverlayTextView;
        super('\u0000');
    }

    public void a(itl itl) {
        this.a.b = itl;
    }

    public void d(itl itl) {
        if (itl.equals(this.a.b)) {
            this.a.b = itl;
        }
    }

    public void c(itl itl) {
        this.a.f.delete(itl.o());
    }

    public void a(lkq lkq) {
        if (glk.a("Babel_Hangout_overlay")) {
            lkt lkt;
            if (lkq.d == null || lkq.d.length == 0) {
                lkt = null;
            } else {
                lkt = lkq.d[lkq.d.length - 1];
            }
            if (lkt != null) {
                DebugOverlayTextView debugOverlayTextView;
                StringBuilder stringBuilder;
                CharSequence charSequence;
                DebugOverlayTextView debugOverlayTextView2 = this.a;
                if (gwb.a(lkt.k) == 2) {
                    debugOverlayTextView2.d = lkt;
                }
                debugOverlayTextView2 = this.a;
                if (gwb.a(lkt.k) == 0 && gwb.a(lkt.a) == 2) {
                    debugOverlayTextView2.e = lkt;
                }
                debugOverlayTextView2 = this.a;
                if (gwb.a(lkt.k) == 1 && gwb.a(lkt.a) == 2) {
                    debugOverlayTextView2.f.put(gwb.a(lkt.l), lkt);
                }
                if (glk.a("Babel_Hangout_overlay", 2)) {
                    debugOverlayTextView = this.a;
                    debugOverlayTextView.a.setLength(0);
                    String str;
                    if (debugOverlayTextView.c == null) {
                        str = "Call not set";
                    } else {
                        if (debugOverlayTextView.b == null) {
                            debugOverlayTextView.a.append("Focus is null, waiting...\n");
                        } else {
                            stringBuilder = debugOverlayTextView.a;
                            String str2 = "Focus is video %s/audio %s\n";
                            Object[] objArr = new Object[2];
                            objArr[0] = debugOverlayTextView.b.e() ? "muted" : "on";
                            objArr[1] = debugOverlayTextView.b.d() ? "muted" : "on";
                            stringBuilder.append(String.format(str2, objArr));
                        }
                        debugOverlayTextView.a.append(debugOverlayTextView.c.o().e() == 2 ? "P2P " : "Cloud ");
                        if (debugOverlayTextView.d != null) {
                            debugOverlayTextView.a.append(String.format("\nBW: asbw (%d), arbw (%d), txbr (%d), rtxbr (%d)", new Object[]{debugOverlayTextView.d.A, debugOverlayTextView.d.B, debugOverlayTextView.d.C, debugOverlayTextView.d.D}));
                        }
                        if (debugOverlayTextView.e != null) {
                            debugOverlayTextView.a.append(String.format("\nLocal (%s): \n%dx%d %dfps IN / %dfps OUT", new Object[]{debugOverlayTextView.e.G, debugOverlayTextView.e.P, debugOverlayTextView.e.Q, debugOverlayTextView.e.q, debugOverlayTextView.e.r}));
                        }
                        for (itl o : debugOverlayTextView.c.s().values()) {
                            if (((lkt) debugOverlayTextView.f.get(o.o())) != null) {
                                debugOverlayTextView.a.append("\n");
                                debugOverlayTextView.a.append(String.format("Remote: %s\n%dx%d %dfps IN / %dfps OUT", new Object[]{o.b(), r1.P, r1.Q, r1.r, r1.s}));
                                debugOverlayTextView.a.append(String.format(" | Renderer: %.2f IN / %.2f OUT", new Object[]{r1.t, r1.v}));
                            }
                        }
                        if (TextUtils.isEmpty(debugOverlayTextView.a)) {
                            str = "Getting debug stats ...";
                        } else {
                            debugOverlayTextView.a.toString();
                        }
                    }
                }
                this.a.setVisibility(0);
                debugOverlayTextView = this.a;
                DebugOverlayTextView debugOverlayTextView3 = this.a;
                debugOverlayTextView3.a.setLength(0);
                if (debugOverlayTextView3.c == null) {
                    charSequence = "Call not set";
                } else {
                    if (debugOverlayTextView3.b == null) {
                        debugOverlayTextView3.a.append("Focus is null, waiting...\n");
                    } else {
                        stringBuilder = debugOverlayTextView3.a;
                        String str3 = "Focus is video %s/audio %s\n";
                        Object[] objArr2 = new Object[2];
                        objArr2[0] = debugOverlayTextView3.b.e() ? "muted" : "on";
                        objArr2[1] = debugOverlayTextView3.b.d() ? "muted" : "on";
                        stringBuilder.append(String.format(str3, objArr2));
                    }
                    debugOverlayTextView3.a.append(debugOverlayTextView3.c.o().e() == 2 ? "P2P " : "Cloud ");
                    if (debugOverlayTextView3.d != null) {
                        debugOverlayTextView3.a.append(String.format("\nBW: asbw (%d), arbw (%d), txbr (%d), rtxbr (%d)", new Object[]{debugOverlayTextView3.d.A, debugOverlayTextView3.d.B, debugOverlayTextView3.d.C, debugOverlayTextView3.d.D}));
                    }
                    if (debugOverlayTextView3.e != null) {
                        debugOverlayTextView3.a.append(String.format("\nLocal (%s): \n%dx%d %dfps IN / %dfps OUT", new Object[]{debugOverlayTextView3.e.G, debugOverlayTextView3.e.P, debugOverlayTextView3.e.Q, debugOverlayTextView3.e.q, debugOverlayTextView3.e.r}));
                    }
                    for (itl o2 : debugOverlayTextView3.c.s().values()) {
                        if (((lkt) debugOverlayTextView3.f.get(o2.o())) != null) {
                            debugOverlayTextView3.a.append("\n");
                            debugOverlayTextView3.a.append(String.format("Remote: %s\n%dx%d %dfps IN / %dfps OUT", new Object[]{o2.b(), r1.P, r1.Q, r1.r, r1.s}));
                            debugOverlayTextView3.a.append(String.format(" | Renderer: %.2f IN / %.2f OUT", new Object[]{r1.t, r1.v}));
                        }
                    }
                    if (TextUtils.isEmpty(debugOverlayTextView3.a)) {
                        charSequence = "Getting debug stats ...";
                    } else {
                        charSequence = debugOverlayTextView3.a.toString();
                    }
                }
                debugOverlayTextView.setText(charSequence);
                return;
            }
            return;
        }
        this.a.setText(null);
        this.a.setVisibility(8);
    }
}
