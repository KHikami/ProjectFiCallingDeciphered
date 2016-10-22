package com.google.api.client.http;

import bc;
import gwb;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map.Entry;
import kfm;
import kfu;
import kgr;

public class UrlEncodedContent extends AbstractHttpContent {
    private Object data;

    public UrlEncodedContent(Object obj) {
        super(UrlEncodedParser.MEDIA_TYPE);
        setData(obj);
    }

    public void writeTo(OutputStream outputStream) {
        Writer bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, getCharset()));
        boolean z = true;
        for (Entry entry : kfm.b(this.data).entrySet()) {
            boolean z2;
            Object value = entry.getValue();
            if (value != null) {
                String a = kgr.a.a((String) entry.getKey());
                Class cls = value.getClass();
                if ((value instanceof Iterable) || cls.isArray()) {
                    z2 = z;
                    for (Object appendParam : gwb.M(value)) {
                        z2 = appendParam(z2, bufferedWriter, a, appendParam);
                    }
                    z = z2;
                } else {
                    z2 = appendParam(z, bufferedWriter, a, value);
                }
            } else {
                z2 = z;
            }
            z = z2;
        }
        bufferedWriter.flush();
    }

    public UrlEncodedContent setMediaType(HttpMediaType httpMediaType) {
        super.setMediaType(httpMediaType);
        return this;
    }

    public final Object getData() {
        return this.data;
    }

    public UrlEncodedContent setData(Object obj) {
        this.data = bc.a(obj);
        return this;
    }

    public static UrlEncodedContent getContent(HttpRequest httpRequest) {
        HttpContent content = httpRequest.getContent();
        if (content != null) {
            return (UrlEncodedContent) content;
        }
        UrlEncodedContent urlEncodedContent = new UrlEncodedContent(new HashMap());
        httpRequest.setContent(urlEncodedContent);
        return urlEncodedContent;
    }

    private static boolean appendParam(boolean z, Writer writer, String str, Object obj) {
        if (!(obj == null || kfm.a(obj))) {
            String b;
            if (z) {
                z = false;
            } else {
                writer.write("&");
            }
            writer.write(str);
            if (obj instanceof Enum) {
                b = kfu.a((Enum) obj).b();
            } else {
                b = obj.toString();
            }
            b = kgr.a.a(b);
            if (b.length() != 0) {
                writer.write("=");
                writer.write(b);
            }
        }
        return z;
    }
}
