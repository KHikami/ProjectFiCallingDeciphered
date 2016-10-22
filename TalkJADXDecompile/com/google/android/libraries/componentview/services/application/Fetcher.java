package com.google.android.libraries.componentview.services.application;

import java.net.URI;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import mti;

public interface Fetcher {

    public class Response {
        public Charset a;
        public byte[] b;
        public boolean c;
        public int d;
        public Map<String, List<String>> e;
        public String f;
    }

    mti<Response> a(URI uri, byte[] bArr, Map<String, String> map, boolean z);
}
