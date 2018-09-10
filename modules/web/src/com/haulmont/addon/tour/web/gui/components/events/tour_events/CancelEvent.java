package com.haulmont.addon.tour.web.gui.components.events.tour_events;

import com.haulmont.addon.tour.web.gui.components.Tour;

/**
 * Event class that contains information about cancellation.
 */
public class CancelEvent extends TourEvent {

    public CancelEvent(Tour source) {
        super(source);
    }
}
