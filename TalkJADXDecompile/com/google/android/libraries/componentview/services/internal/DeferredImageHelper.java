package com.google.android.libraries.componentview.services.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeferredImageHelper {
    private final ImageLoader a;
    private final Map<String, MapEntry> b;

    class ImageLoadContext {
    }

    class MapEntry {
        boolean a;
        byte[] b;
        List<ImageLoadContext> c;

        private MapEntry() {
            this.a = false;
            this.b = null;
            this.c = new ArrayList();
        }
    }

    public DeferredImageHelper(ImageLoader imageLoader) {
        this.a = imageLoader;
        this.b = new HashMap();
    }
}
