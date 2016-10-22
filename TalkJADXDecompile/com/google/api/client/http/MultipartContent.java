package com.google.api.client.http;

import bc;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import kgm;

public class MultipartContent extends AbstractHttpContent {
    static final String NEWLINE = "\r\n";
    private static final String TWO_DASHES = "--";
    private ArrayList<Part> parts;

    public final class Part {
        HttpContent content;
        HttpEncoding encoding;
        HttpHeaders headers;

        public Part() {
            this(null);
        }

        public Part(HttpContent httpContent) {
            this(null, httpContent);
        }

        public Part(HttpHeaders httpHeaders, HttpContent httpContent) {
            setHeaders(httpHeaders);
            setContent(httpContent);
        }

        public Part setContent(HttpContent httpContent) {
            this.content = httpContent;
            return this;
        }

        public HttpContent getContent() {
            return this.content;
        }

        public Part setHeaders(HttpHeaders httpHeaders) {
            this.headers = httpHeaders;
            return this;
        }

        public HttpHeaders getHeaders() {
            return this.headers;
        }

        public Part setEncoding(HttpEncoding httpEncoding) {
            this.encoding = httpEncoding;
            return this;
        }

        public HttpEncoding getEncoding() {
            return this.encoding;
        }
    }

    public MultipartContent() {
        super(new HttpMediaType("multipart/related").setParameter("boundary", "__END_OF_PART__"));
        this.parts = new ArrayList();
    }

    public void writeTo(OutputStream outputStream) {
        Writer outputStreamWriter = new OutputStreamWriter(outputStream, getCharset());
        String boundary = getBoundary();
        ArrayList arrayList = this.parts;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            kgm kgm;
            int i2 = i + 1;
            Part part = (Part) arrayList.get(i);
            HttpHeaders acceptEncoding = new HttpHeaders().setAcceptEncoding(null);
            if (part.headers != null) {
                acceptEncoding.fromHttpHeaders(part.headers);
            }
            acceptEncoding.setContentEncoding(null).setUserAgent(null).setContentType(null).setContentLength(null).set("Content-Transfer-Encoding", null);
            kgm kgm2 = part.content;
            if (kgm2 != null) {
                long length;
                acceptEncoding.set("Content-Transfer-Encoding", Arrays.asList(new String[]{"binary"}));
                acceptEncoding.setContentType(kgm2.getType());
                HttpEncoding httpEncoding = part.encoding;
                if (httpEncoding == null) {
                    length = kgm2.getLength();
                    kgm = kgm2;
                } else {
                    acceptEncoding.setContentEncoding(httpEncoding.getName());
                    kgm = new HttpEncodingStreamingContent(kgm2, httpEncoding);
                    length = AbstractHttpContent.computeLength(kgm2);
                }
                if (length != -1) {
                    acceptEncoding.setContentLength(Long.valueOf(length));
                }
            } else {
                kgm = null;
            }
            outputStreamWriter.write(TWO_DASHES);
            outputStreamWriter.write(boundary);
            outputStreamWriter.write(NEWLINE);
            HttpHeaders.serializeHeadersForMultipartRequests(acceptEncoding, null, null, outputStreamWriter);
            if (kgm != null) {
                outputStreamWriter.write(NEWLINE);
                outputStreamWriter.flush();
                kgm.writeTo(outputStream);
            }
            outputStreamWriter.write(NEWLINE);
            i = i2;
        }
        outputStreamWriter.write(TWO_DASHES);
        outputStreamWriter.write(boundary);
        outputStreamWriter.write(TWO_DASHES);
        outputStreamWriter.write(NEWLINE);
        outputStreamWriter.flush();
    }

    public boolean retrySupported() {
        ArrayList arrayList = this.parts;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (!((Part) obj).content.retrySupported()) {
                return false;
            }
        }
        return true;
    }

    public MultipartContent setMediaType(HttpMediaType httpMediaType) {
        super.setMediaType(httpMediaType);
        return this;
    }

    public final Collection<Part> getParts() {
        return Collections.unmodifiableCollection(this.parts);
    }

    public MultipartContent addPart(Part part) {
        this.parts.add((Part) bc.a((Object) part));
        return this;
    }

    public MultipartContent setParts(Collection<Part> collection) {
        this.parts = new ArrayList(collection);
        return this;
    }

    public MultipartContent setContentParts(Collection<? extends HttpContent> collection) {
        this.parts = new ArrayList(collection.size());
        for (HttpContent part : collection) {
            addPart(new Part(part));
        }
        return this;
    }

    public final String getBoundary() {
        return getMediaType().getParameter("boundary");
    }

    public MultipartContent setBoundary(String str) {
        getMediaType().setParameter("boundary", (String) bc.a((Object) str));
        return this;
    }
}
