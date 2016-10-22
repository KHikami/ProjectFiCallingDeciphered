package com.google.android.libraries.componentview.inject.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface ExecutorType {

    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface BACKGROUND {
    }

    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface SCHEDULED {
    }

    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface UI {
    }
}
