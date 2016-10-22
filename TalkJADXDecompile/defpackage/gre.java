package defpackage;

import com.google.android.apps.hangouts.views.VoiceRatesAndBalanceView;
import java.util.Locale;

/* renamed from: gre */
public final class gre extends fip {
    final /* synthetic */ VoiceRatesAndBalanceView a;

    public gre(VoiceRatesAndBalanceView voiceRatesAndBalanceView) {
        this.a = voiceRatesAndBalanceView;
    }

    public void a(int i, bko bko, fiu fiu) {
        synchronized (this.a.e) {
            evz c = fiu.c();
            if (this.a.f != null && i == gwb.a((Integer) this.a.f.first)) {
                String str = (String) this.a.f.second;
                if (c instanceof exc) {
                    Locale locale;
                    int color;
                    CharSequence charSequence;
                    exc exc = (exc) c;
                    VoiceRatesAndBalanceView voiceRatesAndBalanceView = this.a;
                    boolean l = exc.l();
                    String k = exc.k();
                    String a = gls.a.a(str);
                    if (a == null) {
                        locale = Locale.getDefault();
                    } else {
                        locale = new Locale(Locale.getDefault().getLanguage(), a);
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    Object string = voiceRatesAndBalanceView.getResources().getString(bc.bi, new Object[]{locale.getDisplayCountry()});
                    voiceRatesAndBalanceView.b.setText(string);
                    stringBuilder.append(string);
                    if (l) {
                        color = voiceRatesAndBalanceView.getResources().getColor(gwb.dJ);
                        k = voiceRatesAndBalanceView.getResources().getString(bc.bj);
                        charSequence = k;
                    } else {
                        color = voiceRatesAndBalanceView.getResources().getColor(gwb.dI);
                        charSequence = voiceRatesAndBalanceView.getResources().getString(bc.bo, new Object[]{k});
                        k = voiceRatesAndBalanceView.getResources().getString(bc.bp, new Object[]{k});
                    }
                    voiceRatesAndBalanceView.c.setTextColor(color);
                    voiceRatesAndBalanceView.c.setText(charSequence);
                    stringBuilder.append(k);
                    if (voiceRatesAndBalanceView.a(bko, stringBuilder)) {
                        voiceRatesAndBalanceView.a.setContentDescription(voiceRatesAndBalanceView.getResources().getString(bc.dS, new Object[]{stringBuilder.toString()}));
                    } else {
                        voiceRatesAndBalanceView.a.setContentDescription(stringBuilder.toString());
                    }
                    voiceRatesAndBalanceView.setVisibility(0);
                }
                this.a.a();
            } else if (i == this.a.g) {
                this.a.a(bko, null);
                this.a.b();
                this.a.d = false;
            }
        }
    }

    public void a(int i, bko bko, fok fok, fdo fdo) {
        synchronized (this.a.e) {
            if (this.a.f != null && i == gwb.a((Integer) this.a.f.first)) {
                this.a.a();
            } else if (i == this.a.g) {
                this.a.b();
            }
            gwb.a("Voice request failed", fdo);
        }
    }
}
