package com.haulmont.addon.tour.web.gui.components.events.tour_events;

import com.haulmont.addon.tour.web.gui.components.Tour;

/**
 * Event class that contains information about completion.
 */
public class CompleteEvent extends TourEvent {

    public CompleteEvent(Tour source) {
        super(source);
    }
}
