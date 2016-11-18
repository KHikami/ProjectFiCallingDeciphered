package p000;

import com.google.android.apps.hangouts.views.VoiceRatesAndBalanceView;
import java.util.Locale;

public final class gre extends fip {
    final /* synthetic */ VoiceRatesAndBalanceView f15952a;

    public gre(VoiceRatesAndBalanceView voiceRatesAndBalanceView) {
        this.f15952a = voiceRatesAndBalanceView;
    }

    public void mo610a(int i, bko bko, fiu fiu) {
        synchronized (this.f15952a.f7200e) {
            evz c = fiu.m15392c();
            if (this.f15952a.f7201f != null && i == gwb.m1507a((Integer) this.f15952a.f7201f.first)) {
                String str = (String) this.f15952a.f7201f.second;
                if (c instanceof exc) {
                    Locale locale;
                    int color;
                    CharSequence charSequence;
                    exc exc = (exc) c;
                    VoiceRatesAndBalanceView voiceRatesAndBalanceView = this.f15952a;
                    boolean l = exc.m14738l();
                    String k = exc.m14737k();
                    String a = gls.f15608a.m18046a(str);
                    if (a == null) {
                        locale = Locale.getDefault();
                    } else {
                        locale = new Locale(Locale.getDefault().getLanguage(), a);
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    Object string = voiceRatesAndBalanceView.getResources().getString(bc.bi, new Object[]{locale.getDisplayCountry()});
                    voiceRatesAndBalanceView.f7197b.setText(string);
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
                    voiceRatesAndBalanceView.f7198c.setTextColor(color);
                    voiceRatesAndBalanceView.f7198c.setText(charSequence);
                    stringBuilder.append(k);
                    if (voiceRatesAndBalanceView.m9623a(bko, stringBuilder)) {
                        voiceRatesAndBalanceView.f7196a.setContentDescription(voiceRatesAndBalanceView.getResources().getString(bc.dS, new Object[]{stringBuilder.toString()}));
                    } else {
                        voiceRatesAndBalanceView.f7196a.setContentDescription(stringBuilder.toString());
                    }
                    voiceRatesAndBalanceView.setVisibility(0);
                }
                this.f15952a.m9621a();
            } else if (i == this.f15952a.f7202g) {
                this.f15952a.m9623a(bko, null);
                this.f15952a.m9624b();
                this.f15952a.f7199d = false;
            }
        }
    }

    public void mo640a(int i, bko bko, fok fok, fdo fdo) {
        synchronized (this.f15952a.f7200e) {
            if (this.f15952a.f7201f != null && i == gwb.m1507a((Integer) this.f15952a.f7201f.first)) {
                this.f15952a.m9621a();
            } else if (i == this.f15952a.f7202g) {
                this.f15952a.m9624b();
            }
            gwb.m1872a("Voice request failed", fdo);
        }
    }
}
