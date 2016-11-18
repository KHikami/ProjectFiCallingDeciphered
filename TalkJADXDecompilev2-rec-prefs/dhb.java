package p000;

import android.text.TextUtils;
import com.google.android.apps.hangouts.hangout.DebugOverlayTextView;

public final class dhb extends itg {
    final /* synthetic */ DebugOverlayTextView f9746a;

    public dhb(DebugOverlayTextView debugOverlayTextView) {
        this.f9746a = debugOverlayTextView;
        super('\u0000');
    }

    public void mo1427a(itl itl) {
        this.f9746a.f6308b = itl;
    }

    public void mo1549d(itl itl) {
        if (itl.equals(this.f9746a.f6308b)) {
            this.f9746a.f6308b = itl;
        }
    }

    public void mo1547c(itl itl) {
        this.f9746a.f6312f.delete(itl.m23254o());
    }

    public void mo1542a(lkq lkq) {
        if (glk.m17972a("Babel_Hangout_overlay")) {
            lkt lkt;
            if (lkq.f25183d == null || lkq.f25183d.length == 0) {
                lkt = null;
            } else {
                lkt = lkq.f25183d[lkq.f25183d.length - 1];
            }
            if (lkt != null) {
                DebugOverlayTextView debugOverlayTextView;
                StringBuilder stringBuilder;
                CharSequence charSequence;
                DebugOverlayTextView debugOverlayTextView2 = this.f9746a;
                if (gwb.m1507a(lkt.f25252k) == 2) {
                    debugOverlayTextView2.f6310d = lkt;
                }
                debugOverlayTextView2 = this.f9746a;
                if (gwb.m1507a(lkt.f25252k) == 0 && gwb.m1507a(lkt.f25242a) == 2) {
                    debugOverlayTextView2.f6311e = lkt;
                }
                debugOverlayTextView2 = this.f9746a;
                if (gwb.m1507a(lkt.f25252k) == 1 && gwb.m1507a(lkt.f25242a) == 2) {
                    debugOverlayTextView2.f6312f.put(gwb.m1507a(lkt.f25253l), lkt);
                }
                if (glk.m17973a("Babel_Hangout_overlay", 2)) {
                    debugOverlayTextView = this.f9746a;
                    debugOverlayTextView.f6307a.setLength(0);
                    String str;
                    if (debugOverlayTextView.f6309c == null) {
                        str = "Call not set";
                    } else {
                        if (debugOverlayTextView.f6308b == null) {
                            debugOverlayTextView.f6307a.append("Focus is null, waiting...\n");
                        } else {
                            stringBuilder = debugOverlayTextView.f6307a;
                            String str2 = "Focus is video %s/audio %s\n";
                            Object[] objArr = new Object[2];
                            objArr[0] = debugOverlayTextView.f6308b.m23240e() ? "muted" : "on";
                            objArr[1] = debugOverlayTextView.f6308b.m23238d() ? "muted" : "on";
                            stringBuilder.append(String.format(str2, objArr));
                        }
                        debugOverlayTextView.f6307a.append(debugOverlayTextView.f6309c.mo3224o().m23213e() == 2 ? "P2P " : "Cloud ");
                        if (debugOverlayTextView.f6310d != null) {
                            debugOverlayTextView.f6307a.append(String.format("\nBW: asbw (%d), arbw (%d), txbr (%d), rtxbr (%d)", new Object[]{debugOverlayTextView.f6310d.f25216A, debugOverlayTextView.f6310d.f25217B, debugOverlayTextView.f6310d.f25218C, debugOverlayTextView.f6310d.f25219D}));
                        }
                        if (debugOverlayTextView.f6311e != null) {
                            debugOverlayTextView.f6307a.append(String.format("\nLocal (%s): \n%dx%d %dfps IN / %dfps OUT", new Object[]{debugOverlayTextView.f6311e.f25222G, debugOverlayTextView.f6311e.f25231P, debugOverlayTextView.f6311e.f25232Q, debugOverlayTextView.f6311e.f25258q, debugOverlayTextView.f6311e.f25259r}));
                        }
                        for (itl o : debugOverlayTextView.f6309c.mo3228s().values()) {
                            if (((lkt) debugOverlayTextView.f6312f.get(o.m23254o())) != null) {
                                debugOverlayTextView.f6307a.append("\n");
                                debugOverlayTextView.f6307a.append(String.format("Remote: %s\n%dx%d %dfps IN / %dfps OUT", new Object[]{o.m23232b(), r1.f25231P, r1.f25232Q, r1.f25259r, r1.f25260s}));
                                debugOverlayTextView.f6307a.append(String.format(" | Renderer: %.2f IN / %.2f OUT", new Object[]{r1.f25261t, r1.f25263v}));
                            }
                        }
                        if (TextUtils.isEmpty(debugOverlayTextView.f6307a)) {
                            str = "Getting debug stats ...";
                        } else {
                            debugOverlayTextView.f6307a.toString();
                        }
                    }
                }
                this.f9746a.setVisibility(0);
                debugOverlayTextView = this.f9746a;
                DebugOverlayTextView debugOverlayTextView3 = this.f9746a;
                debugOverlayTextView3.f6307a.setLength(0);
                if (debugOverlayTextView3.f6309c == null) {
                    charSequence = "Call not set";
                } else {
                    if (debugOverlayTextView3.f6308b == null) {
                        debugOverlayTextView3.f6307a.append("Focus is null, waiting...\n");
                    } else {
                        stringBuilder = debugOverlayTextView3.f6307a;
                        String str3 = "Focus is video %s/audio %s\n";
                        Object[] objArr2 = new Object[2];
                        objArr2[0] = debugOverlayTextView3.f6308b.m23240e() ? "muted" : "on";
                        objArr2[1] = debugOverlayTextView3.f6308b.m23238d() ? "muted" : "on";
                        stringBuilder.append(String.format(str3, objArr2));
                    }
                    debugOverlayTextView3.f6307a.append(debugOverlayTextView3.f6309c.mo3224o().m23213e() == 2 ? "P2P " : "Cloud ");
                    if (debugOverlayTextView3.f6310d != null) {
                        debugOverlayTextView3.f6307a.append(String.format("\nBW: asbw (%d), arbw (%d), txbr (%d), rtxbr (%d)", new Object[]{debugOverlayTextView3.f6310d.f25216A, debugOverlayTextView3.f6310d.f25217B, debugOverlayTextView3.f6310d.f25218C, debugOverlayTextView3.f6310d.f25219D}));
                    }
                    if (debugOverlayTextView3.f6311e != null) {
                        debugOverlayTextView3.f6307a.append(String.format("\nLocal (%s): \n%dx%d %dfps IN / %dfps OUT", new Object[]{debugOverlayTextView3.f6311e.f25222G, debugOverlayTextView3.f6311e.f25231P, debugOverlayTextView3.f6311e.f25232Q, debugOverlayTextView3.f6311e.f25258q, debugOverlayTextView3.f6311e.f25259r}));
                    }
                    for (itl o2 : debugOverlayTextView3.f6309c.mo3228s().values()) {
                        if (((lkt) debugOverlayTextView3.f6312f.get(o2.m23254o())) != null) {
                            debugOverlayTextView3.f6307a.append("\n");
                            debugOverlayTextView3.f6307a.append(String.format("Remote: %s\n%dx%d %dfps IN / %dfps OUT", new Object[]{o2.m23232b(), r1.f25231P, r1.f25232Q, r1.f25259r, r1.f25260s}));
                            debugOverlayTextView3.f6307a.append(String.format(" | Renderer: %.2f IN / %.2f OUT", new Object[]{r1.f25261t, r1.f25263v}));
                        }
                    }
                    if (TextUtils.isEmpty(debugOverlayTextView3.f6307a)) {
                        charSequence = "Getting debug stats ...";
                    } else {
                        charSequence = debugOverlayTextView3.f6307a.toString();
                    }
                }
                debugOverlayTextView.setText(charSequence);
                return;
            }
            return;
        }
        this.f9746a.setText(null);
        this.f9746a.setVisibility(8);
    }
}
