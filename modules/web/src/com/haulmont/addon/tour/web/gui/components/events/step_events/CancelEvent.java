package com.haulmont.addon.tour.web.gui.components.events.step_events;

import com.haulmont.addon.tour.web.gui.components.Step;

/**
 * Event class that contains information about cancellation.
 */
public class CancelEvent extends StepEvent {

    public CancelEvent(Step source) {
        super(source);
    }
}
