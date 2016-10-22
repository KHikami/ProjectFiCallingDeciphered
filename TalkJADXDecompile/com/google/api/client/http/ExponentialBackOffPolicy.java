package com.google.api.client.http;

import kfs;
import kft;
import kge;

@Deprecated
public class ExponentialBackOffPolicy implements BackOffPolicy {
    public static final int DEFAULT_INITIAL_INTERVAL_MILLIS = 500;
    public static final int DEFAULT_MAX_ELAPSED_TIME_MILLIS = 900000;
    public static final int DEFAULT_MAX_INTERVAL_MILLIS = 60000;
    public static final double DEFAULT_MULTIPLIER = 1.5d;
    public static final double DEFAULT_RANDOMIZATION_FACTOR = 0.5d;
    private final kfs exponentialBackOff;

    @Deprecated
    public class Builder {
        final kft exponentialBackOffBuilder;

        protected Builder() {
            this.exponentialBackOffBuilder = new kft();
        }

        public ExponentialBackOffPolicy build() {
            return new ExponentialBackOffPolicy(this);
        }

        public final int getInitialIntervalMillis() {
            return this.exponentialBackOffBuilder.a;
        }

        public Builder setInitialIntervalMillis(int i) {
            this.exponentialBackOffBuilder.a(i);
            return this;
        }

        public final double getRandomizationFactor() {
            return this.exponentialBackOffBuilder.b;
        }

        public Builder setRandomizationFactor(double d) {
            this.exponentialBackOffBuilder.a(d);
            return this;
        }

        public final double getMultiplier() {
            return this.exponentialBackOffBuilder.c;
        }

        public Builder setMultiplier(double d) {
            this.exponentialBackOffBuilder.b(d);
            return this;
        }

        public final int getMaxIntervalMillis() {
            return this.exponentialBackOffBuilder.d;
        }

        public Builder setMaxIntervalMillis(int i) {
            this.exponentialBackOffBuilder.b(i);
            return this;
        }

        public final int getMaxElapsedTimeMillis() {
            return this.exponentialBackOffBuilder.e;
        }

        public Builder setMaxElapsedTimeMillis(int i) {
            this.exponentialBackOffBuilder.c(i);
            return this;
        }

        public final kge getNanoClock() {
            return this.exponentialBackOffBuilder.f;
        }

        public Builder setNanoClock(kge kge) {
            this.exponentialBackOffBuilder.a(kge);
            return this;
        }
    }

    public ExponentialBackOffPolicy() {
        this(new Builder());
    }

    protected ExponentialBackOffPolicy(Builder builder) {
        this.exponentialBackOff = builder.exponentialBackOffBuilder.a();
    }

    public boolean isBackOffRequired(int i) {
        switch (i) {
            case DEFAULT_INITIAL_INTERVAL_MILLIS /*500*/:
            case HttpStatusCodes.STATUS_CODE_SERVICE_UNAVAILABLE /*503*/:
                return true;
            default:
                return false;
        }
    }

    public final void reset() {
        this.exponentialBackOff.b();
    }

    public long getNextBackOffMillis() {
        return this.exponentialBackOff.a();
    }

    public final int getInitialIntervalMillis() {
        return this.exponentialBackOff.d;
    }

    public final double getRandomizationFactor() {
        return this.exponentialBackOff.e;
    }

    public final int getCurrentIntervalMillis() {
        return this.exponentialBackOff.c;
    }

    public final double getMultiplier() {
        return this.exponentialBackOff.f;
    }

    public final int getMaxIntervalMillis() {
        return this.exponentialBackOff.g;
    }

    public final int getMaxElapsedTimeMillis() {
        return this.exponentialBackOff.i;
    }

    public final long getElapsedTimeMillis() {
        return this.exponentialBackOff.c();
    }

    public static Builder builder() {
        return new Builder();
    }
}
