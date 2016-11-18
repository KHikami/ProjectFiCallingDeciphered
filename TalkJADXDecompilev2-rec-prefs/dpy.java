package p000;

import android.content.Context;
import com.google.api.client.http.HttpMethods;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.client.HttpResponseException;
import org.chromium.net.CronetEngine;
import org.chromium.net.UploadDataProviders.ByteBufferUploadProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequest.Builder;

public final class dpy implements iik {
    private final ExecutorService f10319a = Executors.newFixedThreadPool(2, new mtu().m32893a("HttpRequestSender-%d").m32892a());

    public byte[] mo1650a(Context context, String str, Map<String, String> map, byte[] bArr, int i) {
        return mo1651a(context, str, map, bArr, i, 3);
    }

    public byte[] mo1651a(Context context, String str, Map<String, String> map, byte[] bArr, int i, int i2) {
        Throwable httpResponseException;
        if (glk.m17973a("Babel_CronetHttpSender", 3)) {
            glk.m17970a("Babel_CronetHttpSender", String.format("Request headers for [%s]: %s", new Object[]{str, map}), new Object[0]);
        }
        mtt mtt = new mtt();
        Builder a = new Builder(str, new dpz(mtt), this.f10319a, (CronetEngine) jyn.m25426a(context, CronetEngine.class)).a(i2);
        for (Entry entry : map.entrySet()) {
            a.a((String) entry.getKey(), (String) entry.getValue());
        }
        if (bArr != null) {
            a.a("Content-Type", "application/x-protobuf");
            a.a(HttpMethods.POST);
            a.a(new ByteBufferUploadProvider(ByteBuffer.wrap(bArr, 0, bArr.length).slice()), this.f10319a);
        } else {
            a.a(HttpMethods.GET);
        }
        UrlRequest a2 = a.a();
        a2.a();
        try {
            return (byte[]) mtt.get((long) i, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            httpResponseException = new HttpResponseException(0, "cronet http timeout");
            glk.m17978c("Babel_CronetHttpSender", "Cronet HTTP request timeout", httpResponseException);
            throw httpResponseException;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            a2.e();
            httpResponseException = new HttpResponseException(0, "cronet http interrupted");
            glk.m17978c("Babel_CronetHttpSender", "Cronet HTTP request interrupted", httpResponseException);
            throw httpResponseException;
        } catch (Throwable httpResponseException2) {
            glk.m17978c("Babel_CronetHttpSender", "Cronet HTTP request failed", httpResponseException2);
            throw ((IOException) httpResponseException2.getCause());
        }
    }
}
