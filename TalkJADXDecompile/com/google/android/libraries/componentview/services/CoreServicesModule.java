package com.google.android.libraries.componentview.services;

import android.content.Context;
import android.util.DisplayMetrics;
import com.google.android.libraries.componentview.services.internal.EventManager;
import com.google.android.libraries.componentview.services.internal.EventRegistry;
import com.google.android.libraries.componentview.services.internal.EventRegistryImpl;

public class CoreServicesModule {

    public class DisplayMetricsModule {
        public DisplayMetrics a(Context context) {
            return context.getResources().getDisplayMetrics();
        }
    }

    public class EventRegistryModule {
        public EventRegistry a(EventRegistryImpl eventRegistryImpl) {
            return eventRegistryImpl;
        }

        public EventManager b(EventRegistryImpl eventRegistryImpl) {
            return eventRegistryImpl;
        }
    }

    private CoreServicesModule() {
    }
}
