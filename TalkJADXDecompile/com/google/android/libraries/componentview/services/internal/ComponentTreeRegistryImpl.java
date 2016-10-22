package com.google.android.libraries.componentview.services.internal;

import com.google.android.libraries.componentview.core.ComponentInterface;
import java.util.HashMap;

public class ComponentTreeRegistryImpl implements ComponentFinder, ComponentTreeRegistry {
    private final HashMap<ComponentInterface, ComponentTreeNode> a;

    class ComponentTreeNode {
    }

    public ComponentTreeRegistryImpl() {
        this.a = new HashMap();
    }
}
