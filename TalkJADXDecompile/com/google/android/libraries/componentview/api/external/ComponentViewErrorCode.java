package com.google.android.libraries.componentview.api.external;

public interface ComponentViewErrorCode {

    public enum Error {
        NETWORK_ERROR(1),
        EMPTY_RESOURCE(2),
        COMPONENT_INFLATION_FAILURE(3),
        INVALID_CHILD(4),
        EMPTY_GRAFT(5),
        INVALID_INTENT(6),
        INVALID_URI(7),
        INVALID_APP_URI(8),
        VISIBILITY_LOGGING_ERROR(9),
        IMAGE_LOADING_ERROR(10),
        REDIRECT_FETCH_FAILURE(11),
        CONFLICT_ATTRIBUTE_SETTING(12),
        NULL_CONTENT(13),
        NULL_VIEW(14),
        MISSING_ACTIVITY(15),
        IMAGE_FETCH_ERROR(16),
        IMAGE_MALFORMED_URL(17),
        ILLEGAL_UNEXPECTED_OR_OTHERWISE_SUSPICIOUS_CORNER_ROUNDING_INVOCATION_CIRCUMSTANCES(18),
        ON_DRAW_EXCEPTION(19),
        ON_MEASURE_EXCEPTION(20),
        ON_LAYOUT_EXCEPTION(21);
        
        private final int v;

        private Error(int i) {
            this.v = i;
        }
    }
}
