package com.google.android.libraries.componentview.inject;

import bn;
import com.google.android.libraries.componentview.services.internal.ImageLoader;
import com.google.android.libraries.componentview.services.internal.glide.GlideImageLoaderImpl;
import onc;

public final class ImageLoaderModule_GetImageLoaderFactory implements onc {
    private final onc<GlideImageLoaderImpl> a;

    public /* synthetic */ Object a() {
        return b();
    }

    private ImageLoader b() {
        return (ImageLoader) bn.a((GlideImageLoaderImpl) this.a.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
