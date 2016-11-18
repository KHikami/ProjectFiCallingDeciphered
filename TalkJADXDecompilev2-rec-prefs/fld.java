package p000;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fld extends flb {
    public final String f13358a;
    public final String f13359b;
    public final int f13360c;
    public final int f13361d;
    public final long f13362e;
    public final String f13363f;
    public final edo f13364g;
    public final long f13365h;
    public long f13366i;
    public final lwk[] f13367j;
    public fwx f13368k;

    public fld(String str, edo edo, long j, long j2, String str2, String str3, int i, int i2, long j3, fwx fwx, byte[] bArr) {
        lwk[] lwkArr;
        this.f13363f = str;
        this.f13364g = edo;
        this.f13365h = j;
        this.f13366i = j2;
        this.f13358a = str2;
        this.f13359b = str3;
        this.f13360c = i;
        this.f13361d = i2;
        this.f13362e = j3;
        this.f13368k = fwx;
        lwk[] lwkArr2 = null;
        if (bArr != null) {
            try {
                lwkArr = ((lwm) nzf.m1027a(new lwm(), bArr)).f26693a;
            } catch (nzd e) {
                glk.m17982e("Babel", "Invalid protobuf set in Event and failed to process in EventProcessor.", new Object[0]);
            }
        } else {
            lwkArr = null;
        }
        lwkArr2 = lwkArr;
        this.f13367j = lwkArr2;
    }

    protected final void m15599a(blo blo) {
        fld.m15598a(this.f13367j, this.f13363f, this.f13358a, this.f13365h, blo);
        if (this.f13364g != null) {
            String str = this.f13364g.f11244a;
            if (!TextUtils.isEmpty(str)) {
                bko g = blo.m6056g();
                if (!str.equals(g.m5632b().f11244a)) {
                    ((ero) jyn.m25426a(gwb.m1400H(), ero.class)).m14332a(g.m5638g(), str, etx.LAST_SEEN, Long.valueOf(TimeUnit.MICROSECONDS.toMillis(this.f13365h)));
                }
            }
        }
    }

    public static void m15598a(lwk[] lwkArr, String str, String str2, long j, blo blo) {
        if (lwkArr != null) {
            List c = jyn.m25438c(gwb.m1400H(), fkp.class);
            for (lwk lwk : lwkArr) {
                Iterator it = c.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                int i;
                switch (gwb.m1507a(lwk.f26687c)) {
                    case 3:
                    case wi.dL /*19*/:
                        Integer valueOf = Integer.valueOf(3);
                        Integer valueOf2 = Integer.valueOf(19);
                        iil.m21874a("Requires location sharing suggestion. WHERE_AM_I or WHERE_YOU_AT.", mks.m32257a(2, valueOf, valueOf2).contains(Integer.valueOf(gwb.m1507a(lwk.f26687c))));
                        boolean equals = lwk.f26687c.equals(Integer.valueOf(19));
                        if (gwb.m1906a(gwb.m1400H(), "babel_location_request_suggestions_enabled", true)) {
                            if (!gwb.m1923a(blo.m6056g(), bnc.LOCATION_SHARING)) {
                                glk.m17979c("Babel", "Location sharing disallowed. Ignoring location request suggestion", new Object[0]);
                                break;
                            }
                            bko g = blo.m6056g();
                            if (equals) {
                                i = 2518;
                            } else {
                                i = 1939;
                            }
                            gwb.m1826a(g, i, lwk.f26690f);
                            blo.m5935a(str, fwy.LOCATION_REQUEST_RECEIVER);
                            blo.m5935a(str, fwy.LOCATION_REQUEST_SENDER);
                            long toMicros = j + TimeUnit.DAYS.toMicros(1);
                            long toMicros2 = j + TimeUnit.SECONDS.toMicros((long) gwb.m1492a(gwb.m1400H(), "babel_location_request_suggestion_duration", 45));
                            glk.m17970a("Babel", "Adding location request system message with timestamp " + j + " expiration timestamp " + toMicros + " deleteAfterRead timestamp " + toMicros2, new Object[0]);
                            blo.m5943a(str, blo.m5900i(), fwx.LOCAL_SYSTEM_MESSAGE, blo.m6056g().m5632b(), equals ? fwy.LOCATION_REQUEST_SENDER : fwy.LOCATION_REQUEST_RECEIVER, j + gwb.m1519a(gwb.m1400H(), "babel_location_request_suggestion_timestamp_offset", 1), toMicros, toMicros2, 10, null, null, 0, lwk.f26690f);
                            break;
                        }
                        break;
                    case wi.dK /*17*/:
                        blw blw = new blw();
                        blw.f3781a = str;
                        blw.f3782b = str2;
                        blw.f3783c = lwk.f26685a;
                        blw.f3784d = j;
                        blw.f3785e = gwb.m1523a(lwk.f26686b);
                        blw.f3786f = gwb.m1507a(lwk.f26687c);
                        blw.f3789i = lwk.f26690f;
                        iil.m21869a(Integer.valueOf(blw.f3786f), Integer.valueOf(17));
                        if (!gwb.m1906a(gwb.m1400H(), "babel_disable_nlp_stickers", false)) {
                            if (!gwb.m1456U() && !gwb.m1458V()) {
                                glk.m17979c("Babel", "Skipping NLP sticker suggestion due to incompatible device.", new Object[0]);
                                break;
                            }
                            gwb.m1826a(blo.m6056g(), 2018, lwk.f26690f);
                            if (lwk.f26689e != null) {
                                if (lwk.f26689e.f26059d != null) {
                                    i = gwb.m1507a(lwk.f26689e.f26059d);
                                } else {
                                    i = 1;
                                }
                                blw.f3788h = i;
                                if (lwk.f26689e.f26058c != null && lwk.f26689e.f26058c.length > 0) {
                                    String str3;
                                    Object obj;
                                    String str4 = lwk.f26689e.f26058c[0];
                                    String[] split = TextUtils.split(str4, "\\.");
                                    if (split.length == 0) {
                                        str3 = "Babel";
                                        String str5 = "Malformed unsuffixed URL has been passed as a GEM suggestion asset. unsuffixedUrl: ";
                                        str4 = String.valueOf(str4);
                                        glk.m17981d(str3, str4.length() != 0 ? str5.concat(str4) : new String(str5), new Object[0]);
                                    }
                                    i = gwb.m1400H().getResources().getDisplayMetrics().densityDpi;
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
                                    blw.f3787g = str4;
                                }
                            }
                            blo.m5939a(blw);
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
