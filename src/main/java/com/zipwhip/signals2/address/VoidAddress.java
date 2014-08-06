package com.zipwhip.signals2.address;

/**
 * @author Michael
 * @date 7/29/2014
 */
public class VoidAddress extends AddressBase {

    private static final long serialVersionUID = 2713878108203598196L;

    private static final VoidAddress instance = new VoidAddress();

    private VoidAddress() {

    }

    @Override
    public int compareTo(Address o) {
        if (o instanceof VoidAddress) {
            return 1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "void";
    }

    public static VoidAddress getInstance() {
        return instance;
    }
}
