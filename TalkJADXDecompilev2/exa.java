package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

public final class exa extends evz {
    private static final long serialVersionUID = 1;
    private String g = null;
    private String h = null;
    private long i = (glj.a() + TimeUnit.MINUTES.toMillis(10));

    public exa(kni kni) {
        super(kni, kni.apiHeader);
        nlr[] nlrArr = kni.a.b;
        if (nlrArr != null && nlrArr.length > 0) {
            nlr nlr = nlrArr[0];
            if (nlr != null && gwb.a(nlr.d.a) == 3) {
                njz njz = nlr.b;
                if (njz != null && njz.a != null) {
                    this.h = njz.a;
                    neh neh = nlr.d.d;
                    if (gwb.a(neh.a) == 3) {
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
                                        this.g = nej.b;
                                        String queryParameter;
                                        try {
                                            queryParameter = Uri.parse(this.g).getQueryParameter("expire");
                                            if (queryParameter != null) {
                                                this.i = Long.parseLong(queryParameter) * 1000;
                                                return;
                                            }
                                            return;
                                        } catch (Exception e) {
                                            queryParameter = String.valueOf(e.getClass().getCanonicalName());
                                            String str = this.g;
                                            glk.d("Babel", new StringBuilder((String.valueOf(queryParameter).length() + 42) + String.valueOf(str).length()).append(queryParameter).append(" exception while parsing audio url. url = ").append(str).toString(), new Object[0]);
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

    public void a(blo blo, fhc fhc) {
        super.a(blo, fhc);
        if (evz.a) {
            String str = this.h;
            String str2 = this.g;
            new StringBuilder((String.valueOf(str).length() + 121) + String.valueOf(str2).length()).append("GetAudioDataResponse.processResponse: retrieved audio with id ").append(str).append(" with stream url of ").append(str2).append(" and expiration of ").append(this.i);
        }
        if (!TextUtils.isEmpty(this.h) && !TextUtils.isEmpty(this.g)) {
            blo.a(this.h, this.g, this.i);
            blf.d(blo, blo.Y(this.h));
        }
    }
}
