package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: fld */
public class fld extends flb {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final String f;
    public final edo g;
    public final long h;
    public long i;
    public final lwk[] j;
    public fwx k;

    public fld(String str, edo edo, long j, long j2, String str2, String str3, int i, int i2, long j3, fwx fwx, byte[] bArr) {
        lwk[] lwkArr;
        this.f = str;
        this.g = edo;
        this.h = j;
        this.i = j2;
        this.a = str2;
        this.b = str3;
        this.c = i;
        this.d = i2;
        this.e = j3;
        this.k = fwx;
        lwk[] lwkArr2 = null;
        if (bArr != null) {
            try {
                lwkArr = ((lwm) nzf.a(new lwm(), bArr)).a;
            } catch (nzd e) {
                glk.e("Babel", "Invalid protobuf set in Event and failed to process in EventProcessor.", new Object[0]);
            }
        } else {
            lwkArr = null;
        }
        lwkArr2 = lwkArr;
        this.j = lwkArr2;
    }

    protected final void a(blo blo) {
        fld.a(this.j, this.f, this.a, this.h, blo);
        if (this.g != null) {
            String str = this.g.a;
            if (!TextUtils.isEmpty(str)) {
                bko g = blo.g();
                if (!str.equals(g.b().a)) {
                    ((ero) jyn.a(gwb.H(), ero.class)).a(g.g(), str, etx.LAST_SEEN, Long.valueOf(TimeUnit.MICROSECONDS.toMillis(this.h)));
                }
            }
        }
    }

    public static void a(lwk[] lwkArr, String str, String str2, long j, blo blo) {
        if (lwkArr != null) {
            List c = jyn.c(gwb.H(), fkp.class);
            for (lwk lwk : lwkArr) {
                Iterator it = c.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                int i;
                switch (gwb.a(lwk.c)) {
                    case wi.z /*3*/:
                    case wi.dL /*19*/:
                        Integer valueOf = Integer.valueOf(3);
                        Integer valueOf2 = Integer.valueOf(19);
                        iil.a("Requires location sharing suggestion. WHERE_AM_I or WHERE_YOU_AT.", mks.a(2, valueOf, valueOf2).contains(Integer.valueOf(gwb.a(lwk.c))));
                        boolean equals = lwk.c.equals(Integer.valueOf(19));
                        if (gwb.a(gwb.H(), "babel_location_request_suggestions_enabled", true)) {
                            if (!gwb.a(blo.g(), bnc.LOCATION_SHARING)) {
                                glk.c("Babel", "Location sharing disallowed. Ignoring location request suggestion", new Object[0]);
                                break;
                            }
                            bko g = blo.g();
                            if (equals) {
                                i = 2518;
                            } else {
                                i = 1939;
                            }
                            gwb.a(g, i, lwk.f);
                            blo.a(str, fwy.LOCATION_REQUEST_RECEIVER);
                            blo.a(str, fwy.LOCATION_REQUEST_SENDER);
                            long toMicros = j + TimeUnit.DAYS.toMicros(1);
                            long toMicros2 = j + TimeUnit.SECONDS.toMicros((long) gwb.a(gwb.H(), "babel_location_request_suggestion_duration", 45));
                            glk.a("Babel", "Adding location request system message with timestamp " + j + " expiration timestamp " + toMicros + " deleteAfterRead timestamp " + toMicros2, new Object[0]);
                            blo.a(str, blo.i(), fwx.LOCAL_SYSTEM_MESSAGE, blo.g().b(), equals ? fwy.LOCATION_REQUEST_SENDER : fwy.LOCATION_REQUEST_RECEIVER, j + gwb.a(gwb.H(), "babel_location_request_suggestion_timestamp_offset", 1), toMicros, toMicros2, 10, null, null, 0, lwk.f);
                            break;
                        }
                        break;
                    case wi.dK /*17*/:
                        blw blw = new blw();
                        blw.a = str;
                        blw.b = str2;
                        blw.c = lwk.a;
                        blw.d = j;
                        blw.e = gwb.a(lwk.b);
                        blw.f = gwb.a(lwk.c);
                        blw.i = lwk.f;
                        iil.a(Integer.valueOf(blw.f), Integer.valueOf(17));
                        if (!gwb.a(gwb.H(), "babel_disable_nlp_stickers", false)) {
                            if (!gwb.U() && !gwb.V()) {
                                glk.c("Babel", "Skipping NLP sticker suggestion due to incompatible device.", new Object[0]);
                                break;
                            }
                            gwb.a(blo.g(), 2018, lwk.f);
                            if (lwk.e != null) {
                                if (lwk.e.d != null) {
                                    i = gwb.a(lwk.e.d);
                                } else {
                                    i = 1;
                                }
                                blw.h = i;
                                if (lwk.e.c != null && lwk.e.c.length > 0) {
                                    String str3;
                                    Object obj;
                                    String str4 = lwk.e.c[0];
                                    String[] split = TextUtils.split(str4, "\\.");
                                    if (split.length == 0) {
                                        str3 = "Babel";
                                        String str5 = "Malformed unsuffixed URL has been passed as a GEM suggestion asset. unsuffixedUrl: ";
                                        str4 = String.valueOf(str4);
                                        glk.d(str3, str4.length() != 0 ? str5.concat(str4) : new String(str5), new Object[0]);
                                    }
                                    i = gwb.H().getResources().getDisplayMetrics().densityDpi;
                                    if (i <= 160) {
                                        obj = "_mdpi";
                                    } else if (i <= 240) {
                                        obj = "_hdpi";
                                    } else if (i <= 320) {
                                        obj = "_xhdpi";
                                    } else {
                                        obj = "_xxhdpi";
                                    }
                                    str3 = String.valueOf(split[split.length - 2]);
                                    str4 = String.valueOf(obj);
                                    split[split.length - 2] = str4.length() != 0 ? str3.concat(str4) : new String(str3);
                                    str3 = "https:";
                                    str4 = String.valueOf(TextUtils.join(".", split));
                                    if (str4.length() != 0) {
                                        str4 = str3.concat(str4);
                                    } else {
                                        str4 = new String(str3);
                                    }
                                    blw.g = str4;
                                }
                            }
                            blo.a(blw);
                            break;
                        }
                        break;
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
