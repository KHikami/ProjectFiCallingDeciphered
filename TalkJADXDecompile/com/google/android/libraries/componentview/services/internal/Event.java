package com.google.android.libraries.componentview.services.internal;

public interface Event {

    public interface EventData {
    }

    public final class EventPropagation {
        public static final int a;
        public static final int b;
        private static final /* synthetic */ int[] c;

        static {
            a = 1;
            b = 2;
            c = new int[]{a, b};
        }
    }

    public enum EventType {
        EXPANSION_BUTTON_CLICKED(EventPropagation.a),
        EXPAND_CHILDREN(EventPropagation.b),
        IMAGE_VIEWER_ITEM_CLICKED(EventPropagation.a);
        
        private final int d;

        private EventType(Integer num) {
            this.d = num;
        }
    }
}
