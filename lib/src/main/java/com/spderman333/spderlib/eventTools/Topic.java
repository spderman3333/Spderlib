package com.spderman333.spderlib.eventTools;

public class Topic<T extends Event> {
    String name;
    T publishedEvent;

    public Topic(String name) {

    }
}
