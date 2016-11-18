package p000;

import android.os.SystemClock;
import com.google.api.client.http.HttpStatusCodes;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.cookie.DateUtils;

public final class amb implements all {
    public static final boolean f1271a = aly.f1262b;
    private static int f1272d = 3000;
    private static int f1273e = 4096;
    public final amg f1274b;
    public final amc f1275c;

    public amb(amg amg) {
        this(amg, new amc(f1273e));
    }

    private amb(amg amg, amc amc) {
        this.f1274b = amg;
        this.f1275c = amc;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aln mo258a(alo<?> alo_) {
        HttpResponse a;
        StatusLine statusLine;
        int statusCode;
        byte[] a2;
        String str;
        Object[] objArr;
        Throwable e;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            HttpResponse httpResponse = null;
            Map emptyMap = Collections.emptyMap();
            try {
                Map hashMap = new HashMap();
                alg e2 = alo_.m2849e();
                if (e2 != null) {
                    if (e2.f1183b != null) {
                        hashMap.put("If-None-Match", e2.f1183b);
                    }
                    if (e2.f1185d > 0) {
                        hashMap.put("If-Modified-Since", DateUtils.formatDate(new Date(e2.f1185d)));
                    }
                }
                a = this.f1274b.mo259a(alo_, hashMap);
                statusLine = a.getStatusLine();
                statusCode = statusLine.getStatusCode();
                emptyMap = amb.m2888a(a.getAllHeaders());
                if (statusCode != HttpStatusCodes.STATUS_CODE_NOT_MODIFIED) {
                    if (a.getEntity() != null) {
                        a2 = m2890a(a.getEntity());
                    } else {
                        a2 = new byte[0];
                    }
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (!f1271a && elapsedRealtime2 <= ((long) f1272d)) {
                        break;
                    }
                    str = "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]";
                    objArr = new Object[5];
                    objArr[0] = alo_;
                    objArr[1] = Long.valueOf(elapsedRealtime2);
                    if (a2 == null) {
                        break;
                    }
                    break;
                    objArr[2] = r2;
                    objArr[3] = Integer.valueOf(statusLine.getStatusCode());
                    objArr[4] = Integer.valueOf(alo_.m2861q().m2880b());
                    aly.m2883b(str, objArr);
                } else {
                    break;
                }
            } catch (SocketTimeoutException e3) {
                amb.m2889a("socket", alo_, new alx(0.0f));
            } catch (ConnectTimeoutException e4) {
                amb.m2889a("connection", alo_, new alx(0.0f));
            } catch (Throwable e5) {
                throw new RuntimeException("Bad URL " + alo_.m2847c(), e5);
            } catch (IOException e6) {
                e5 = e6;
                a2 = null;
                httpResponse = a;
                if (httpResponse != null) {
                    statusCode = httpResponse.getStatusLine().getStatusCode();
                    aly.m2884c("Unexpected response code %d for %s", Integer.valueOf(statusCode), alo_.m2847c());
                    if (a2 != null) {
                        aln aln = new aln(statusCode, a2, emptyMap, false, SystemClock.elapsedRealtime() - elapsedRealtime);
                        if (statusCode != HttpStatusCodes.STATUS_CODE_UNAUTHORIZED) {
                        }
                        amb.m2889a("auth", alo_, new ale(aln));
                    } else {
                        amb.m2889a("network", alo_, new alx((byte) 0));
                    }
                } else {
                    throw new alx(e5, '\u0000');
                }
            }
        }
        String str2 = "null";
        objArr[2] = str2;
        objArr[3] = Integer.valueOf(statusLine.getStatusCode());
        objArr[4] = Integer.valueOf(alo_.m2861q().m2880b());
        aly.m2883b(str, objArr);
        if (statusCode >= HttpStatusCodes.STATUS_CODE_OK && statusCode <= 299) {
            return new aln(statusCode, a2, emptyMap, false, SystemClock.elapsedRealtime() - elapsedRealtime);
        }
        throw new IOException();
    }

    private static void m2889a(String str, alo<?> alo_, alx alx) {
        alw q = alo_.m2861q();
        int p = alo_.m2860p();
        try {
            q.m2879a(alx);
            alo_.m2843a(String.format("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(p)}));
        } catch (alx e) {
            alo_.m2843a(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(p)}));
            throw e;
        }
    }

    private byte[] m2890a(HttpEntity httpEntity) {
        amh amh = new amh(this.f1275c, (int) httpEntity.getContentLength());
        byte[] bArr = null;
        try {
            InputStream content = httpEntity.getContent();
            if (content == null) {
                throw new alx(0);
            }
            bArr = this.f1275c.m2894a(1024);
            while (true) {
                int read = content.read(bArr);
                if (read == -1) {
                    break;
                }
                amh.write(bArr, 0, read);
            }
            byte[] toByteArray = amh.toByteArray();
            return toByteArray;
        } finally {
            try {
                httpEntity.consumeContent();
            } catch (IOException e) {
                aly.m2882a("Error occured when calling consumingContent", new Object[0]);
            }
            this.f1275c.m2893a(bArr);
            amh.close();
        }
    }

    private static Map<String, String> m2888a(Header[] headerArr) {
        Map<String, String> treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < headerArr.length; i++) {
            treeMap.put(headerArr[i].getName(), headerArr[i].getValue());
        }
        return treeMap;
    }
}
