package com.grcy.solid.isp.fix;

import java.util.Collection;

public interface ReadableLogger extends Logger {

    Collection<String> getMessages();
}
