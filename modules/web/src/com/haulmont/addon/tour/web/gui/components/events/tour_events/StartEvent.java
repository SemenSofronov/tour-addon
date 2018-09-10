package com.haulmont.addon.tour.web.gui.components.events.tour_events;

import com.haulmont.addon.tour.web.gui.components.Tour;

/**
 * Event class that contains information about starting.
 */
public class StartEvent extends TourEvent {

    public StartEvent(Tour source) {
        super(source);
    }
}
