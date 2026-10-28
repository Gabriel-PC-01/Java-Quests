package com.clovis.customer;

public enum CustomerType {

    FREE {
        @Override
        public double defaultWeight() {
            return 25;
        }
    },
    STANDARD {
        @Override
        public double defaultWeight() {
            return 50;
        }
    },
    VIP {
        @Override
        public double defaultWeight() {
            return 75;
        }
    },
    PRIME {
        @Override
        public double defaultWeight() {
            return 100;
        }
    };

    public abstract double defaultWeight();

}
