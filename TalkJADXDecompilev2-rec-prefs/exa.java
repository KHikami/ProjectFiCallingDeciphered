package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

public final class exa extends evz {
    private static final long serialVersionUID = 1;
    private String f12425g = null;
    private String f12426h = null;
    private long f12427i = (glj.m17956a() + TimeUnit.MINUTES.toMillis(10));

    public exa(kni kni) {
        super(kni, kni.apiHeader);
        nlr[] nlrArr = kni.f22422a.b;
        if (nlrArr != null && nlrArr.length > 0) {
            nlr nlr = nlrArr[0];
            if (nlr != null && gwb.m1507a(nlr.d.a) == 3) {
                njz njz = nlr.b;
                if (njz != null && njz.a != null) {
                    this.f12426h = njz.a;
                    neh neh = nlr.d.d;
                    if (gwb.m1507a(neh.a) == 3) {
                        nei nei = neh.c;
                        if (nei != null) {
                            nej[] nejArr = nei.b;
                            if (nejArr != null && nejArr.length > 0) {
                                int length = nejArr.length;
                                int i = 0;
                                while (i < length) {
                                    nej nej = nejArr[i];
                                    if (nej == null || nej.b == null) {
                                        i++;
                                    } else {
                                        this.f12425g = nej.b;
                                        String queryParameter;
                                        try {
                                            queryParameter = Uri.parse(this.f12425g).getQueryParameter("expire");
                                            if (queryParameter != null) {
                                                this.f12427i = Long.parseLong(queryParameter) * 1000;
                                                return;
                                            }
                                            return;
                                        } catch (Exception e) {
                                            queryParameter = String.valueOf(e.getClass().getCanonicalName());
                                            String str = this.f12425g;
                                            glk.m17981d("Babel", new StringBuilder((String.valueOf(queryParameter).length() + 42) + String.valueOf(str).length()).append(queryParameter).append(" exception while parsing audio url. url = ").append(str).toString(), new Object[0]);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void mo1047a(blo blo, fhc fhc) {
        super.mo1047a(blo, fhc);
        if (evz.f5798a) {
            String str = this.f12426h;
            String str2 = this.f12425g;
            new StringBuilder((String.valueOf(str).length() + 121) + String.valueOf(str2).length()).append("GetAudioDataResponse.processResponse: retrieved audio with id ").append(str).append(" with stream url of ").append(str2).append(" and expiration of ").append(this.f12427i);
        }
        if (!TextUtils.isEmpty(this.f12426h) && !TextUtils.isEmpty(this.f12425g)) {
            blo.m5990a(this.f12426h, this.f12425g, this.f12427i);
            blf.m5821d(blo, blo.m5933Y(this.f12426h));
        }
    }
}
