package com.google.android.libraries.componentview.services.internal.glide;

import amq;
import anq;
import anz;
import aoe;
import aof;
import atu;
import auh;
import aui;
import auj;
import aup;
import com.google.android.libraries.componentview.api.external.ComponentViewErrorCode.Error;
import com.google.android.libraries.componentview.internal.L;
import com.google.android.libraries.componentview.services.application.Fetcher;
import com.google.android.libraries.componentview.services.application.Fetcher.Response;
import com.google.android.libraries.componentview.services.application.Logger;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import msx;
import msy;

public class GlideUrlLoader implements auh<ImageUrl, InputStream> {

    public class Factory implements auj<ImageUrl, InputStream> {
        public auh<ImageUrl, InputStream> a(aup aup) {
            return new GlideUrlLoader();
        }
    }

    class ImageDataFetcher implements aoe<InputStream> {
        final /* synthetic */ GlideUrlLoader a;
        private final atu b;
        private final Fetcher c;
        private final ExecutorService d;
        private final Logger e;

        class ImageCallback implements msx<Response> {
            aof<? super InputStream> a;
            final /* synthetic */ ImageDataFetcher b;

            ImageCallback(ImageDataFetcher imageDataFetcher, aof<? super InputStream> aof__super_java_io_InputStream) {
                this.b = imageDataFetcher;
                this.a = aof__super_java_io_InputStream;
            }

            public void a(Response response) {
                if (response == null || !response.c) {
                    L.a("ImageDataFetcher", "Fetch failed with no response ", Error.IMAGE_LOADING_ERROR, null);
                    this.a.a(null);
                    return;
                }
                this.a.a(new ByteArrayInputStream(response.b));
            }

            public void a(Throwable th) {
                L.a("ImageDataFetcher", th, "Fetch failed ", Error.IMAGE_FETCH_ERROR, null);
                this.a.a(null);
            }
        }

        public ImageDataFetcher(GlideUrlLoader glideUrlLoader, ImageUrl imageUrl) {
            this.a = glideUrlLoader;
            this.b = imageUrl.a();
            this.c = imageUrl.b();
            this.d = imageUrl.c();
            this.e = imageUrl.d();
        }

        public void a(amq amq, aof<? super InputStream> aof__super_java_io_InputStream) {
            msx imageCallback = new ImageCallback(this, aof__super_java_io_InputStream);
            String str;
            String str2;
            String valueOf;
            try {
                str = "ImageDataFetcher";
                str2 = "Using componentview fetcher ";
                valueOf = String.valueOf(this.b.b());
                if (valueOf.length() != 0) {
                    valueOf = str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                L.a(3, str, null, valueOf, new Object[0]);
                msy.a(this.c.a(this.b.a().toURI(), null, null, true), imageCallback, this.d);
            } catch (Throwable e) {
                valueOf = "ImageDataFetcher";
                str2 = "Malformed URL ";
                str = String.valueOf(this.b.b());
                L.a(valueOf, e, str.length() != 0 ? str2.concat(str) : new String(str2), Error.IMAGE_MALFORMED_URL, this.e, null, new Object[0]);
                aof__super_java_io_InputStream.a(null);
            }
        }

        public Class<InputStream> d() {
            return InputStream.class;
        }

        public anq c() {
            return anq.REMOTE;
        }

        public void b() {
        }

        public void a() {
        }
    }

    public /* bridge */ /* synthetic */ aui a(Object obj, int i, int i2, anz anz) {
        return a((ImageUrl) obj);
    }

    public aui a(ImageUrl imageUrl) {
        return new aui(imageUrl.a(), new ImageDataFetcher(this, imageUrl));
    }
}
