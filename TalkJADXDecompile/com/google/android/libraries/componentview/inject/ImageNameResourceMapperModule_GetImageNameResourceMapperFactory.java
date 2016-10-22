package com.google.android.libraries.componentview.inject;

import bn;
import com.google.android.libraries.componentview.services.application.DefaultImageNameResourceMapper;
import com.google.android.libraries.componentview.services.application.ImageNameResourceMapper;
import onc;

public final class ImageNameResourceMapperModule_GetImageNameResourceMapperFactory implements onc {
    private final onc<DefaultImageNameResourceMapper> a;

    public /* synthetic */ Object a() {
        return b();
    }

    private ImageNameResourceMapper b() {
        return (ImageNameResourceMapper) bn.a((DefaultImageNameResourceMapper) this.a.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
