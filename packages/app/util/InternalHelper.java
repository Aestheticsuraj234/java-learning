package packages.app.util;

// No "public" on the class — package-private: only visible inside packages.app.util
class InternalHelper {
    static String tag(String label) {
        return "[" + label + "]";
    }
}
