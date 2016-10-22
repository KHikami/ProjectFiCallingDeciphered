package com.google.android.libraries.componentview.inject;

import com.google.android.libraries.componentview.services.internal.ComponentInflator;
import com.google.android.libraries.componentview.services.internal.SimpleComponentInflator;

public class ComponentInflatorModule {
    public ComponentInflator a(SimpleComponentInflator simpleComponentInflator) {
        return simpleComponentInflator;
    }
}
