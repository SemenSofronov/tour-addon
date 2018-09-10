package com.haulmont.addon.tour.web.gui.components.events.step_events;

import com.haulmont.addon.tour.web.gui.components.Step;

/**
 * Event class that contains information about completion.
 */
public class CompleteEvent extends StepEvent {

    public CompleteEvent(Step source) {
        super(source);
    }
}