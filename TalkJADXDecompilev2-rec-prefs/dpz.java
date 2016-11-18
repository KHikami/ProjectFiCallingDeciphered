package p000;

import com.google.api.client.http.HttpStatusCodes;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.client.HttpResponseException;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.util.EntityUtils;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequest.Callback;
import org.chromium.net.UrlRequestException;
import org.chromium.net.UrlResponseInfo;

final class dpz extends Callback {
    private final mtt<byte[]> f10320a;
    private final ByteBuffer f10321b = ByteBuffer.allocateDirect(32768);
    private final ByteArrayOutputStream f10322c = new ByteArrayOutputStream();

    dpz(mtt<byte[]> mtt_byteA) {
        this.f10320a = mtt_byteA;
    }

    public void m12473a(UrlRequest urlRequest, String str) {
        urlRequest.b();
    }

    public final void m12474a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        urlRequest.a(this.f10321b);
    }

    public void m12475a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        byteBuffer.flip();
        this.f10322c.write(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.limit());
        byteBuffer.clear();
        urlRequest.a(byteBuffer);
    }

    public void m12477b(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        dpz.m12472b(urlResponseInfo);
        if (urlResponseInfo.b() != HttpStatusCodes.STATUS_CODE_OK) {
            m12471a(urlResponseInfo, null);
        } else {
            this.f10320a.mo3943b(this.f10322c.toByteArray());
        }
    }

    public void m12476a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, UrlRequestException urlRequestException) {
        dpz.m12472b(urlResponseInfo);
        m12471a(urlResponseInfo, urlRequestException);
    }

    private void m12471a(UrlResponseInfo urlResponseInfo, UrlRequestException urlRequestException) {
        if (urlResponseInfo == null) {
            glk.m17982e("Babel_CronetHttpSender", "Http error. No response received", new Object[0]);
        } else {
            String str;
            Map e = urlResponseInfo.e();
            long j = -1;
            List list = (List) e.get("Content-Length");
            if (!(list == null || list.isEmpty())) {
                j = Long.parseLong((String) list.get(0));
            }
            list = (List) e.get("Content-Type");
            if (list == null || list.isEmpty()) {
                str = null;
            } else {
                str = (String) list.get(0);
            }
            HttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(new ByteArrayInputStream(this.f10322c.toByteArray()));
            basicHttpEntity.setContentLength(j);
            basicHttpEntity.setContentType(str);
            String str2;
            String str3;
            try {
                str2 = "Babel_CronetHttpSender";
                str3 = "Http error response ";
                str = String.valueOf(EntityUtils.toString(basicHttpEntity));
                glk.m17982e(str2, str.length() != 0 ? str3.concat(str) : new String(str3), new Object[0]);
            } catch (Throwable e2) {
                Throwable th = e2;
                str2 = "Babel_CronetHttpSender";
                str3 = "Http error but unable to parse the response body. Response Bytes: ";
                str = String.valueOf(glk.m17974b(Arrays.toString(this.f10322c.toByteArray())));
                glk.m17980d(str2, str.length() != 0 ? str3.concat(str) : new String(str3), th);
            }
        }
        Throwable e22 = urlRequestException == null ? urlResponseInfo != null ? new HttpResponseException(urlResponseInfo.b(), urlResponseInfo.c()) : new HttpResponseException(0, "") : urlRequestException;
        this.f10320a.mo3941a(e22);
    }

    private static void m12472b(UrlResponseInfo urlResponseInfo) {
        if (urlResponseInfo != null && glk.m17973a("Babel_CronetHttpSender", 3)) {
            glk.m17970a("Babel_CronetHttpSender", String.format("Response headers for [%s]: %s", new Object[]{urlResponseInfo.a(), urlResponseInfo.e()}), new Object[0]);
        }
    }
}
